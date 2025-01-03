import java.util.*;
public class pizza {
    protected int price;
    private Boolean veg;
    protected int extraCheesesPrice=100;
    protected int extraToppingPrice=150;
    protected int backPackPrice=20;

    protected int basePizzaPrice;

    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToppingAdded= false;
    private boolean isOptedForTakeaway= false;

    Scanner in= new Scanner(System.in);

    public pizza(Boolean veg) {
        this.veg=veg;
        if (this.veg){
            this.price=300;
        }
        else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        System.out.println("Enter extra cheese(y/n)");
        char ch= in.next().charAt(0);
        switch (ch){
            case ('y'):
                isExtraCheeseAdded= true;
                this.price+= extraCheesesPrice;
                break;
            case ('n'):
                isExtraCheeseAdded=false;
                break;
        }
    }
    public void addExtraToppings(){
        System.out.println("Enter extra toppings(y/n)");
        char ch= in.next().charAt(0);
        switch (ch) {
            case ('y'):
                isExtraToppingAdded = true;
                this.price += extraToppingPrice;
                break;
            case ('n'):
                isExtraToppingAdded = false;
                break;
        }

    }
    public void takeAway(){
        System.out.println("Enter TakeAway(y/n)");
        char ch=Character.toLowerCase(in.next().charAt(0));
        switch (ch){
            case ('y'):
                isOptedForTakeaway=true;
                this.price+= backPackPrice;
                break;
            case ('n'):
                isOptedForTakeaway=false;
                break;
        }
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza:" +basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese:"+ extraCheesesPrice+ "\n";

        }
        if(isExtraToppingAdded){
            bill+="Extra Toppings:"+ extraToppingPrice+ "\n";

        }
        if(isOptedForTakeaway){
            bill+="Take Away:"+ backPackPrice+ "\n";

        }
        bill+= "\nTotal Amount:"+ this.price + "\n";
        System.out.println(bill);
        System.out.println("Thanks Visit Again");

    }
}
