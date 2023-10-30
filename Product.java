package Dzsem1;

public class Product {

    public String name;
    public int volume;
    //public int temperature;

    public Product(String name, int volume){
        this.name = name;
       // this.temperature = temperature;
        this.volume = volume;
    }
    public String getName(){
        return name;
 
    }
    public void setName(String name){
        this.name = name;

    }
    public int getVolume(){
        return volume;

    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    
}
