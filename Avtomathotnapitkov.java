package Dzsem1;

public class Avtomathotnapitkov implements Vendingmachine {
    //private List<Hotdrink> hotdrinks = new ArrayList<>();
    @Override
    public void getProduct(){

        //как поисать получение продукта?
    }
    public Hotdrink getProduct(String name, int volume, int temperature){
        return new Hotdrink(name, volume, temperature);
    }
    
}
//private List<Hotdrink> hotdrinks = new ArrayList<>();

//     public Avtomathotnapitkov() {
//         // Инициализируйте список доступных горячих напитков
//         // Это можно сделать в конструкторе или добавив методы для добавления напитков
//         hotdrinks.add(new Hotdrink("Чай", 200, 80));
//         hotdrinks.add(new Hotdrink("Кофе", 120, 70));
//         hotdrinks.add(new Hotdrink("Какао", 200, 70));
//     }

//     @Override
//     public void getProduct() {
//         // Здесь можно реализовать логику выбора и выдачи продукта
//         // Например, вы можете использовать какой-то пользовательский ввод или другую логику для выбора продукта
//         // В данном случае, я просто выбираю первый доступный напиток из списка
//         if (!hotdrinks.isEmpty()) {
//             Hotdrink product = hotdrinks.get(0);
//             System.out.println("Получен продукт: " + product.getName());
//             hotdrinks.remove(0); // Удаляем выбранный продукт из списка
//         } else {
//             System.out.println("Нет доступных продуктов.");
//         }
//     }
// }