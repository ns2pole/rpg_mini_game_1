public class Chair extends MyObject {
    public static int num = 0;
    // Constructor
    public Chair() {
        num++;
    }

    public void showDetail() {
        System.out.println("This is a chair.");
    }

}
