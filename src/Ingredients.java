package src;

public class Ingredients {
    // Variables for ingredients //
    private int amount;
    private String unit;
    private String name;

    // Constructors for ingredients //
    public Ingredients() {
    }

    public Ingredients(int amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    // Getters and Setters for ingredients //
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
