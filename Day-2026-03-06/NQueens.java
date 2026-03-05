public class NQueens {
 static boolean isSafe(int[][] b,int r,int c){
  for(int i=0;i<c;i++) if(b[r][i]==1) return false;
  for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(b[i][j]==1) return false;
  for(int i=r,j=c;i<b.length&&j>=0;i++,j--) if(b[i][j]==1) return false;
  return true;
 }
 static boolean solve(int[][] b,int c){
  if(c>=b.length) return true;
  for(int i=0;i<b.length;i++){
   if(isSafe(b,i,c)){
    b[i][c]=1;
    if(solve(b,c+1)) return true;
    b[i][c]=0;
   }
  }
  return false;
 }
 public static void main(String[] args){
  int n=4;
  int[][] b=new int[n][n];
  solve(b,0);
  System.out.println(b[1][3]);
 }
}