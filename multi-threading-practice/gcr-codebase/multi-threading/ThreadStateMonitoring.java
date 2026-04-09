package multi_threading;

import java.util.*;

class TaskRunner implements Runnable{
    public void run(){
        try{
            Thread.sleep(2000); // TIMED_WAITING
            for(int i=0;i<1000000;i++); // RUNNABLE (computation)
        }catch(Exception e){
            System.out.println("Exception in "+Thread.currentThread().getName());
        }
    }
}

class StateMonitor implements Runnable{
    Thread[] tasks;
    Map<String,Set<Thread.State>> stateMap=new HashMap<>();

    StateMonitor(Thread[] tasks){
        this.tasks=tasks;
        for(Thread t:tasks){
            stateMap.put(t.getName(),new HashSet<>());
        }
    }

    public void run(){
        boolean allTerminated=false;
        while(!allTerminated){
            allTerminated=true;
            for(Thread t:tasks){
                Thread.State state=t.getState();
                stateMap.get(t.getName()).add(state);
                System.out.println("[Monitor] "+t.getName()+" is in "+state+" state at "+new Date());
                if(state!=Thread.State.TERMINATED){
                    allTerminated=false;
                }
            }
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
        System.out.println("\nSummary:");
        for(String name:stateMap.keySet()){
            System.out.println(name+" went through "+stateMap.get(name).size()+" states");
        }
    }
}

public class ThreadStateMonitoring{
    public static void main(String[] args){
        TaskRunner task=new TaskRunner();

        Thread t1=new Thread(task,"Task-1");
        Thread t2=new Thread(task,"Task-2");

        Thread[] tasks={t1,t2};

        Thread monitor=new Thread(new StateMonitor(tasks),"Monitor");

        monitor.start();

        t1.start();
        t2.start();
    }
}
