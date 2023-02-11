public class Fruits {
    private String color;
    private String taste;
    private int gr;
    private int price;

    public Fruits(String color, String taste, int gr, int price) {
        this.color = color;
        this.taste = taste;
        this.gr = gr;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getGr() {
        return gr;
    }

    public void setGr(int gr) {
        this.gr = gr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruits {" +
                "color='" + color +'\''+
                ",taste='" + taste +'\''+
                ",gr='" + gr +'\''+
                "price='" + price+
                '}' ;
    }
}

