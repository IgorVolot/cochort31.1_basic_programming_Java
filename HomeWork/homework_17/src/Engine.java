package src;

public class Engine {
   private int power;
   private String type;
   private boolean isRunning=false;

   public Engine (int power, String type){
       this.power=power;
       this.type=type;
   }
   public String toString(){
       return "Engine: "+type+". "+power+" HP."+"The engine is running: "+isRunning;
   }
   public void getStart(){
       return;
   }
   public void setStart(){
       if (!isRunning){
           isRunning=true;
           System.out.println("Engine is running");
       }
   }
   public void getStop(){
       return;
   }
   public void setStop(){
       if (isRunning){
           isRunning=false;
           System.out.println("Engine is stopped");
       }
   }
}
