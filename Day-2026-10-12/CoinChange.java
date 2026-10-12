public class CoinChange {
 public static void main(String[] args){
  int[] c={1,2,5};
  int sum=5;
  int[] dp=new int[sum+1];
  dp[0]=1;
  for(int x:c)
   for(int i=x;i<=sum;i++)
    dp[i]+=dp[i-x];
  System.out.println(dp[sum]);
 }
}