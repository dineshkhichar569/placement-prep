class LC_415 {
    public static String addStrings(String num1, String num2) {
        char[] n1 = reverse(num1);
        char[] n2 = reverse(num2);

        int[] res = new int[n1.length + n2.length];

        int i = 0;
        int carry = 0;
        while (i < n1.length && i < n2.length) {
            int d1 = n1[i] - '0';
            int d2 = n2[i] - '0';

            int sum = d1 + d2 + carry;
            carry = sum / 10;
            res[i] = sum % 10;
            i++;
        }
        while (i < n1.length) {
            int d1 = n1[i] - '0';

            int sum = d1 + carry;
            carry = sum / 10;
            res[i] = sum % 10;
            i++;
        }
        while (i < n2.length) {
            int d2 = n2[i] - '0';

            int sum = d2 + carry;
            carry = sum / 10;
            res[i] = sum % 10;
            i++;
        }
        if(carry != 0){
            res[i] = carry;
        }

        int k = res.length - 1;
        String ans = "";
        while (k > 0 && res[k] == 0)
            k--;
        while (k >= 0) {
            ans += res[k];
            k--;
        }

        return ans;

    }

    private static char[] reverse(String num) {
        char[] arr = num.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        System.out.println(addStrings(num1, num2));
    }
}