package Dzsem1.Dzsem2;
/*
Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 */

public class Program {
    public static void main(String[] args) {
        Market market = new Market("Evgese", " Order ");
        market.joinToQueue();
        market.setName("Stepan");
        market.joinToQueue();
        market.setName("Leon");
        market.joinToQueue();
        market.setName("Stone");
        market.joinToQueue();
        System.out.println("В очереди стоит " + market.size() + " человек");
        System.out.println();

         market.setName("Evgese");
         market.update();
         market.leaveQueue();
         System.out.println("В очереди стоит " + market.size() + " человек");
    //     System.out.println();
    //     market.setName("Leon");
    //     market.update();
    //     market.leaveQueue();
    //     System.out.println("В очереди стоит " + market.size() + " человек");
    }
    
}
