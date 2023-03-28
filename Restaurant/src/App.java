public class App {
    public static void main(String[] args) {

        Dish piattoUno = new Dish("Tortellini", 11.50, new String[] {"Mortadella", "Prosciutto cotto", "Pasta all'uovo"} );
        Dish piattoDue = new Dish("Lasagne", 16.50, new String[] {"Ragù", "Pasta verde", "Besciamella"} );


        Drink drinkUno = new Drink("Ripasso", 29.5);
        Drink drinkDue = new Drink("Valpolicella", 19.50);

        //! passiamo ai due array i valori per poterli richiamare nell'istanza di Restaurant
        Dish[] allDish = new Dish[] {piattoUno, piattoDue};
        Drink[] allDrink = new Drink[] {drinkUno, drinkDue};

        Restaurant r = new Restaurant("Cucina della nonna", allDish, allDrink);

        r.stampamenu();

}
}
