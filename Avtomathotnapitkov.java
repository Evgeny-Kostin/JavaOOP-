package Dzsem1;

public class Avtomathotnapitkov implements Vendingmachine {
    @Override
    public void getProduct(){

        //как поисать получение продукта?
    }
    public Hotdrink getProduct(String name, int volume, int temperature){
        return new Hotdrink(name, volume, temperature);
    }
    
}
