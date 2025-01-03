public class DeluxePizza extends pizza {
    public DeluxePizza(boolean veg){
        super(veg);
    }
    public void addExtraCheese(){
        this.price+= extraCheesesPrice;
    }

    @Override
    public void addExtraToppings() {
        this.price+= extraToppingPrice;
    }
}
