import java.util.*;
public class JobSequencing {
 static class Job{int d,p;Job(int d,int p){this.d=d;this.p=p;}}
 public static void main(String[] args){
  Job[] j={new Job(2,100),new Job(1,19),new Job(2,27)};
  Arrays.sort(j,(a,b)->b.p-a.p);
  boolean[] slot=new boolean[3];
  int profit=0;
  for(Job x:j)
   for(int i=Math.min(2,x.d)-1;i>=0;i--)
    if(!slot[i]){ slot[i]=true; profit+=x.p; break; }
  System.out.println(profit);
 }
}