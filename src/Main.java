public class Main {
    public static void main(String[] args) {


        Laptop[] laptops = new Laptop[3];
        laptops[0] = createObject("3");
        laptops[1] = createObject("1");
        laptops[2] = createObject("2");

        for (int i = 0; i < laptops.length; i++) {
            laptops[i].toPrint();
        }
    }
    private static Laptop createObject(String className){
        Laptop obj = null;
        switch (className){
            case "1":
                obj = new Apple("M1",1000,true);
                break;
            case "2":
                obj = new Hp("15s-eq",700,false);
                break;
            case "3":
                obj = new Asus("TUF",800,true);
                break;
            default:
                System.out.println("Class don't found");
        }
        return obj;
    }
}
