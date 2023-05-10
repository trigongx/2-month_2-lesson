public class Hp extends Laptop {
    private String model;
    private int price;
    private boolean touchScreen;

    @Override
    public void toPrint() {
        System.out.println("Model:" + model +
                    "\nPrice:" + price +
                    "\nTouchScreen:" + touchScreen);
    }

    public Hp(String model, int price, boolean touchScreen) {
        this.model = model;
        this.price = price;
        this.touchScreen = touchScreen;
    }
}
