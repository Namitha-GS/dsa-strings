 int longestCommonSubstr(String s1, String s2, int m, int n){
       int[][] dp = new int[m+1][n+1];
       int result = 0;
       
       for(int i=0; i<m+1; i++){
           for(int j=0; j<n+1; j++){
               if(i==0 || j==0){
                   dp[i][j] = 0;
               }
               else if(s1.charAt(i-1) == s2.charAt(j-1)){
                   dp[i][j] = dp[i-1][j-1] + 1;
                   if(dp[i][j] > result){
                       result = dp[i][j];
                   }
               }
               else{
                   dp[i][j] = 0;
               }
           }
       }
       return result;
    }
