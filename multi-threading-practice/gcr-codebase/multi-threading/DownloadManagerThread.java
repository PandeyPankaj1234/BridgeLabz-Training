package multi_threading;

import java.util.*;

class FileDownloaderThread extends Thread{
    String fileName;
    FileDownloaderThread(String fileName){
        this.fileName=fileName;
    }
    public void run(){
        Random r=new Random();
        for(int i=0;i<=100;i+=25){
            try{
                Thread.sleep(500+r.nextInt(500));
            }catch(Exception e){}
            System.out.println("["+Thread.currentThread().getName()+"] Downloading "+fileName+": "+i+"%");
        }
    }
}

public class DownloadManagerThread{
    public static void main(String[] args) throws Exception{
        FileDownloaderThread t1=new FileDownloaderThread("Document.pdf");
        FileDownloaderThread t2=new FileDownloaderThread("Image.jpg");
        FileDownloaderThread t3=new FileDownloaderThread("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
