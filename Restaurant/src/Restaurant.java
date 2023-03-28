public class Restaurant {
    
    // attributi
    private String name;
    private Dish[] dish;
    private Drink[] drink;
    
    // costruttore
    public Restaurant(String name, Dish[] dish, Drink[] drink) {
        this.name = name;
        this.dish = dish;
        this.drink = drink;
    }


    public void stampamenu(){
        System.out.println("Menù della cucina della nonna" );
        System.out.println("Piatti: ");

        for(Dish piatto : dish){
            System.out.println(piatto.getName()+ ": " + piatto.getPrice());
        }

        System.out.println("Drink: ");

        for(Drink bere : drink){
            System.out.println(bere.getName()+ ": " + bere.getPrice());
        }

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Dish[] getDish() {
        return dish;
    }


    public void setDish(Dish[] dish) {
        this.dish = dish;
    }


    public Drink[] getDrink() {
        return drink;
    }


    public void setDrink(Drink[] drink) {
        this.drink = drink;
    }
}
