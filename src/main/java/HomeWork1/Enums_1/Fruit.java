package HomeWork1.Enums_1;

public enum Fruit {
    ORANGE("Апельсин", 3), APPLE("Яблоко", 3), BANANA("Банан", 2), CHERRY("Вишня", 1);

    private String russianTitle;
    private int weight;

    public String getRussianTitle() {
        return russianTitle;
    }

    public int getWeight() {
        return weight;
    }

    Fruit(String russianTitle, int weight) {
        this.russianTitle = russianTitle;
        this.weight = weight;
    }
}
