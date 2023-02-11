public class Orange extends Fruits {
    Vitamin vitamin;

    public Orange(String color, String taste, int gr, int price, Vitamin vitamin) {
        super(color, taste, gr, price);
        this.vitamin = vitamin;
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + getColor() +'\''+
                ",taste='" + getTaste() +'\''+
                " gr='" + getGr() +'\''+
                ",price='" + getPrice() +'\''+
                " vitamin='" + vitamin+
                '}';
    }
}
