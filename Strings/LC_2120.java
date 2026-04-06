import java.util.Arrays;

class LC_2120 {
    public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[] ans = new int[s.length()];

        for(int i = 0; i < s.length(); i++){

            // start from fresh startPos for every index
            int row = startPos[1];
            int col = startPos[0];
            int count = 0;
            
            for(int j = i; j < s.length(); j++){

                if(s.charAt(j) == 'L'){
                    row--;
                } else if(s.charAt(j) == 'R'){
                    row++;
                } else if(s.charAt(j) == 'U'){
                    col--;
                } else if(s.charAt(j) == 'D'){
                    col++;
                }

                if((col >= n || col < 0) || (row >= n || row < 0)){
                    break;
                }

                count++;
            }
            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "RRDDLU";
        int[] startPos = {0, 1};
        int n = 3;

        System.out.println(Arrays.toString(executeInstructions(n, startPos, s)));
        
    }
}