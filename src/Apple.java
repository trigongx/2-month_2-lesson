public class Apple extends Laptop {
    private String model;
    private int price;
    private boolean faceID;

    public Apple(String model, int price, boolean faceID) {
        this.model = model;
        this.price = price;
        this.faceID = faceID;
    }

    @Override
    public void toPrint() {
        System.out.println("Model:" + model +
                "\nPrice:" + price +
                "\nTouchScreen:" + faceID);
    }
}
