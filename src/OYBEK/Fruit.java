package OYBEK;

public class Fruit {

   private String name;
   private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public int getYear() {
        return price;
    }

    public void setYear(int price) {
        this.price = price;
    }



    public Fruit(String name, int price){

        this.name=name;
        this.price=price;
    }
    public void show(){
        System.out.println(name);
        System.out.println(price);


    }
}
