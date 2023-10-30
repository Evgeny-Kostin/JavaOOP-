package Dzsem1;

public class Hotdrink extends Product{
    private int temperature;
    public Hotdrink(String name, int volume, int temperature){
        super(name, volume);
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    public void  setTemperature(int temperature){
        this.temperature = temperature;
    }
    
    
}
