package Array_Questions;

public class LC_1732 {
    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;
        for(int i = 0; i < gain.length; i++){
            altitude = altitude + gain[i];
            highest = Math.max(altitude, highest);
        }

        return highest;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println(largestAltitude(gain));
    }
}
