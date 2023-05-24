package src;

public class StrawberryPie {
    Ingredients strawberry = new Ingredients(250, "gram", "aardbeien");
    Ingredients butter = new Ingredients(125, "gram", "boter");
    Ingredients sugar = new Ingredients(100, "gram", "suiker");

    public void printIngredientsStrawberryPie() {
        System.out.println("De ingredienten voor de aarbeien taart zijn:");
        System.out.println(strawberry.getAmount() + ", " + strawberry.getUnit() + ", " + strawberry.getName());
        System.out.println(butter.getAmount() + ", " + butter.getUnit() + ", " + butter.getName());
        System.out.println(sugar.getAmount() + ", " + sugar.getUnit() + ", " + sugar.getName());
    }
}


