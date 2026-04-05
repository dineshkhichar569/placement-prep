class LC_657 {
    public static boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                v++;
            } else if(ch == 'D') {
                v--;
            }

            if(ch == 'L'){
                h++;
            } else if(ch == 'R') {
                h--;
            }
        }

        return h == 0 && v == 0;
    }

    public static void main(String[] args) {
        String s = "UD";

        System.out.println(judgeCircle(s));
    }
}