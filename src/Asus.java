public class Asus extends Laptop {
    private String model;
    private int price;
    private boolean fingerprint;

    public Asus(String model, int price, boolean fingerprint) {
        this.model = model;
        this.price = price;
        this.fingerprint = fingerprint;
    }

    @Override
    public void toPrint() {
        System.out.println("Model:" + model +
                "\nPrice:" + price +
                "\nTouchScreen:" + fingerprint);
    }
}

