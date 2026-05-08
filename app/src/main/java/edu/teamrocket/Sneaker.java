public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.sale = 0;
        this.ask = 0;
        this.bid = 0;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public String toString() {
        return this.name + "\n\t\t" + this.style;
    }
}
