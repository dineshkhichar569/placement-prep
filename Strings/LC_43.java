class LC_43 {
    public static String multiply(String num1, String num2) {
        char[] n1 = reverse(num1);
        char[] n2 = reverse(num2);

        int[] res = new int[n1.length + n2.length];

        for(int i = 0; i < n1.length; i++){
            int carry = 0;
            int k = i;
            for(int j = 0; j < n2.length; j++){
                int d1 = n1[i] - '0';
                int d2 = n2[j] - '0';
                int sum = (d1 * d2) + carry + res[k];

                carry = sum / 10;
                res[k++] = sum % 10;
            }
            if(carry != 0){
                res[k] = carry;
            }
        }

        String ans = "";
        int i = res.length-1;
        while(i > 0 && res[i] == 0) i--;
        while(i >= 0){
            ans += res[i];
            i--;
        }

        return ans;

    }
    private static char[] reverse(String num){
        char[] ans = num.toCharArray();

        int i = 0;
        int j = ans.length-1;
        while(i <= j){
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
}