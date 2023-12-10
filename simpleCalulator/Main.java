package simpleCalulator;

public class Main {
    public static void main(String[] args) {
        try {
            AppUi UiCal = new AppUi();
            UiCal.init();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
