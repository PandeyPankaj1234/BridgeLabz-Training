package multi_threading;

class Chef extends Thread{
    String dish;
    int totalTime;
    Chef(String name,String dish,int totalTime){
        super(name);
        this.dish=dish;
        this.totalTime=totalTime;
    }
    public void run(){
        System.out.println(getName()+" started preparing "+dish);
        int stepTime=totalTime/4;
        int progress=25;
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(stepTime);
            }catch(Exception e){}
            System.out.println(getName()+" preparing "+dish+": "+progress+"% complete");
            progress+=25;
        }
        System.out.println(getName()+" completed "+dish);
    }
}

public class RestaurantSystem{
    public static void main(String[] args) throws Exception{
        Chef c1=new Chef("Chef-1","Pizza",3000);
        Chef c2=new Chef("Chef-2","Pasta",2000);
        Chef c3=new Chef("Chef-3","Salad",1000);
        Chef c4=new Chef("Chef-4","Burger",2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
