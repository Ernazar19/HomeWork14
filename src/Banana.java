public class Banana extends  Fruits{
    Vitamin vitamin;
    public Banana(String color, String taste, int gr, int price,Vitamin vitamin) {
        super(color, taste, gr, price);
        this.vitamin=vitamin;
    }

    @Override
    public String toString() {
        return "Banana {"+
                "color='" + getColor() +'\''+
                ",taste='" + getTaste() +'\''+
                " gr='" + getGr() +'\''+
                ",price='" + getPrice() +'\''+
                " vitamin='" + vitamin+
                '}';
    }
}
