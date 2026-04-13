package Math_Questions;

public class LC_3894 {
    public static String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        if(timer == 30) return "Orange";
        if(timer > 30 && timer <= 90) return "Red";

        return "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(trafficSignal(60));
    }
}
