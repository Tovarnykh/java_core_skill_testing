package Polymorphism_exercieses;

import java.io.FileReader;
import java.io.IOException;

class FlowersLoader {
	private FlowersLoader() {
		
	}
	static void read() {
		
		try(FileReader reader = new FileReader("d:\\Flowers.txt")){
			int c;
			while((c=reader.read())!=-1){
                
                System.out.print((char)c);
            } 
		}catch(IOException ex){
            
           System.out.println(ex.getMessage());
       }   
	}
	
}
