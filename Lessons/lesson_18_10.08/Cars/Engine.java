package HW_17_Cars;

public class Engine {
    private int power;
    private String type;
    private boolean isRunning=false;

    public Engine(int power, String type){
        this.power=power;
        this.type=type;
    }
    public String toString(){
        return "Engine: "+type+". Power: "+power+" HP."+ " is running: "+isRunning;
    }
    public void start(){
        if (!isRunning){
            isRunning=true;
            System.out.println("The engine is started");
        }
    }
    public void stop(){
        if(isRunning){
            isRunning=false;
            System.out.println("The engine is stopped");
        }
    }
}
