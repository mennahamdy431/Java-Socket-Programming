package client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.Arrays;



public class client {
    public static void main (String[]args){
        try{
        InetAddress ip = InetAddress.getLocalHost();
        Socket server = new Socket(ip,6388);
        
            DataInputStream serverreader = new DataInputStream(server.getInputStream());
            DataOutputStream serversender = new DataOutputStream(server.getOutputStream());
            
            Scanner reader = new Scanner(System.in);
            
            int x;
            
             for(int i=0; i<10 ; i++ ){
             
             System.out.println((i+1) + "'s number is: ");
             x = reader.nextInt();
             serversender.write(x);
             
             }
                         
             int d[] = new int[10];
             
             for(int i=0; i<10 ; i++ ){
             d[i]= serverreader.read();
            
             
             }
             System.out.println("The array in the descending order"+ Arrays.toString(d)); 
       
        int a[] = new int[10];
             
             for(int i=0; i<10 ; i++ ){
             a[i]= serverreader.read();
            
             
             }
             System.out.println("The array in the ascending order"+ Arrays.toString(a)); 
        
        }catch(Exception ex){
        
        
        
        System.out.println("there is a problem");
        
        
        
        
        }
               
    
    
    
    }
    
}
