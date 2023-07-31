
package javaapplication10;


public class Item {
    
   private int location;
   private String description;
   
   public Item(int location, String description){
       this.location=location;
       this.description=description;
   }
   
   
   
   public void setLocation(int location){
    this.location=location;
   }
   public int getLocation(){
       return location;
   }
   
   
   
   public void setDescription(int location){
    this.location=location;
   }
   public String getDescription(){
       return description;
   }
   
}
