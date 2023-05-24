package src;

public class Main {

    public static void main(String[] args) {

        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        StrawberryPie strawberryPie = new StrawberryPie();

        applePieRecipe.printApplePieIngredients();
        applePieRecipe.printApplePieInstructions();

        strawberryPie.printIngredientsStrawberryPie();
    }
}

