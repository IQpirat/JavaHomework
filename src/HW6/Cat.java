package HW6;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошкина еда");
    }

    @Override
    public String makeNoise() {
        return "Кошка издает звук";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Кіт " +
                "їсть:'" + getFood() + '\'' +
                ", Живе:'" + getLocation() + '\'' +
                ", вага = 4,5 кг" + ", Вік = 7 лет" + " , лапа = 3 см";
    }
}
