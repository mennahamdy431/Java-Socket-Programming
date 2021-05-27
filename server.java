
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
    public static void main(String[]args){
        try{
            ServerSocket server = new ServerSocket(6388);
            Socket client = server.accept();
            
            DataInputStream clientreader = new DataInputStream(client.getInputStream());
            DataOutputStream clientsender = new DataOutputStream(client.getOutputStream());
            
            int x[] = new int[10];
            for(int i=0; i<10 ; i++ ){
            x[i] = clientreader.read();
            System.out.println((i+1) + "'s number is:" + x[i]);
            
            
            }
            for(int i=0; i<10; i++){
                for(int j=i+1; j<10; j++){
                if(x[i]<x[j]){
                int swap = x[i];
                x[i]=x[j];
                x[j]=swap;
                }
              }
            }            
                for(int d=0; d<10; d++){
                clientsender.write(x[d]);                
                }
                    for(int i=0; i<10; i++){
                for(int j=i+1; j<10; j++){
                if(x[i]>x[j]){
                int swap = x[i];
                x[i]=x[j];
                x[j]=swap;
                }
              }
            }         
                for(int a=0; a<10; a++){
                clientsender.write(x[a]);                
                }
        
        
        }catch(Exception ex){
        
        
         System.out.println("there is a problem");
        
        }
    
    }
    
}
