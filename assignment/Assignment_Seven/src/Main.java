import java.io.FileWriter;   
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;  

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      List<String> list=new ArrayList<String>();    
      list.add("Mango");  
      list.add("Apple");  
      list.add("Banana");  
      list.add("Grapes");
      for(String fruit:list)  
      {
    	  myWriter.write(fruit);
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}