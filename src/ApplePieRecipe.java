package src;

public class ApplePieRecipe {
    // Declare ingredients for apple pie //
    Ingredients roomboter = new Ingredients(200, "gram", "ongezouten roomboter");
    Ingredients bastardSuiker = new Ingredients(200, "gram", "witte bastard suiker");
    Ingredients bakmeel = new Ingredients(400, "gram", "zelfrijzeld bakmeel");
    Ingredients ei = new Ingredients(1, "stuk(s)", "ei");
    Ingredients vanilleSuiker = new Ingredients(8, "gram", "vanillesuiker");
    Ingredients zout = new Ingredients(1, "snuf", "zout");
    Ingredients appels = new Ingredients(1.5, "kilo", "appels");
    Ingredients kristalSuiker = new Ingredients(75, "gram", "kristal suiker");
    Ingredients kaneel = new Ingredients(3, "theelepels", "kaneel");
    Ingredients paneermeel = new Ingredients(15, "gram", "paneermeel");

    public void printApplePieIngredients() {
        System.out.println("Ingredienten voor de appeltaart:");
        System.out.println("- " + roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
        System.out.println("- " + bastardSuiker.getAmount() + " " + bastardSuiker.getUnit() + " " + bastardSuiker.getName());
        System.out.println("- " + bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
        System.out.println("- " + ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println("- " + vanilleSuiker.getAmount() + " " + vanilleSuiker.getUnit() + " " + vanilleSuiker.getName());
        System.out.println("- " + zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println("- " + appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
        System.out.println("- " + kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
        System.out.println("- " + kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println("- " + paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    // methods for steps of making the apple pie //
    public void printApplePieInstructions() {
        System.out.println("Instucties voor de appeltaart:");
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }
}

