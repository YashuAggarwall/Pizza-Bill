//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Pizzamania");
        System.out.println("Which pizza:(1.Veg Pizza  2.Non-Veg Pizza  3.Delux-Veg" +
                "Pizza  4.Delux-NonVeg Pizza   )");
        Scanner sc=new Scanner(System.in);
        int ch= sc.nextInt();
        switch (ch){

            case 1:
                pizza vegpizza= new pizza(true);
                vegpizza.addExtraToppings();
                vegpizza.addExtraCheese();
                vegpizza.takeAway();
                vegpizza.getBill();
                break;
            case 2:
                pizza nonvegpizza= new pizza(false);
                nonvegpizza.addExtraToppings();
                nonvegpizza.addExtraCheese();
                nonvegpizza.takeAway();
                nonvegpizza.getBill();
                break;
            case 3:
                DeluxePizza veg= new DeluxePizza(true);
                veg.basePizzaPrice=550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;

            case 4:
                DeluxePizza nonveg= new DeluxePizza(false);
                nonveg.basePizzaPrice=650;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;
        }

    }
}