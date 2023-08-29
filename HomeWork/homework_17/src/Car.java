package src;

public class Car {
   private String brand;
   private String color;
   private String licensePlate;
   private MyDate registrationDate;
   private Engine engine;
   private boolean inDrive=false;

   public Car (String brand, String color, String licensePlate, MyDate registrationDate,Engine engine){
      this.brand=brand;
      this.color=color;
      this.licensePlate=licensePlate;
      this.registrationDate=registrationDate;
      this.engine=engine;
   }
   public String toString (){
      return brand+" Clr: "+color+". #"+licensePlate+" ("+registrationDate.toString()+") "+engine.toString()+" Car is driving: "+ inDrive;
   }
   public void isInDrive(){
      if (inDrive){
         System.out.println("The car "+ toString()+" is already drive");
         return;
      }
      engine.getStart();
      inDrive=true;
      System.out.println("Car is "+toString()+" driving");
   }
   public void notInDrive(){
      if (!inDrive){
         System.out.println("The car "+ toString()+" is already stopped.");
         return;
      }
      engine.getStop();
      inDrive=false;
      System.out.println("Car is "+toString()+" stopped");
   }
}
