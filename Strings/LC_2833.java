class LC_2833 {
    public static int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'L') l++;
            if(ch == 'R') r++;
        }

        String replace;

        if(l > r){
            replace = "L";
        } else {
            replace = "R";
        }

        moves = moves.replaceAll("_", replace);
        
        int count = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'L'){
                count++;
            } else {
                count--;
            }
        }

        return count < 0 ? -count : count;
    }

    public static void main(String[] args) {
        String moves = "L_RL__R";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
}