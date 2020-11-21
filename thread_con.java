import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.*;
public class thread_con {
    static int n;
    public void odd_numbers() throws IOException{
        synchronized (this){
        int i=1;
        while(i<=n){
            BufferedWriter writer = new BufferedWriter(new FileWriter("odd.txt", true));
            String temp = String.valueOf(i);
            writer.write(temp+" ");
            //writer.write("\n");
            writer.close();
            i=i+2;
            
        }
        notify();
    }
    
    }
    public void even_numbers() throws IOException{
        synchronized (this)
        {int i=0;
        while(i<=n){
            BufferedWriter writer = new BufferedWriter(new FileWriter("even.txt", true));
            String temp = String.valueOf(i);
            writer.write(temp+" ");
            writer.close();
            i=i+2;    
        }
        notify();}
    }
    public void prime_numbers() throws IOException{
        synchronized (this){
        int z = 0;
        while(z<=n){
        int i,m=0,flag=0;         
        m=z/2;      
        if(z==0||z==1){  
             
        }else{  
         for(i=2;i<=m;i++){      
          if(z%i==0){      
            
           flag=1;      
           break;      
          }      
         }      
         if(flag==0) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("prime.txt", true));
            String temp = String.valueOf(z);
            writer.write(temp);
            writer.close();
         }  
        }
        z++;        
        notify();
        }}
    }

    public static void main(String[] args)  {
        System.out.println("Enter the number range");
        Scanner get = new Scanner(System.in);
        n = get.nextInt();
        thread_con obj = new thread_con();
        Thread t1 = new Thread(new Runnable() { 
            public void run() 
            { 
                try {
                    obj.odd_numbers();
                  }
                  catch(IOException e) {
                    e.printStackTrace();
                  } 
            } 
        });
        Thread t2 = new Thread(new Runnable() { 
            public void run() 
            { 
                try {
                    obj.even_numbers();
                  }
                  catch(IOException e) {
                    e.printStackTrace();
                  } 
            } 
        });
        Thread t3 = new Thread(new Runnable() { 
            public void run() 
            { 
                try {
                    obj.prime_numbers();
                  }
                  catch(IOException e) {
                    e.printStackTrace();
                  } 
            } 
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
}
