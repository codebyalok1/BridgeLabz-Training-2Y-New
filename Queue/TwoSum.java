package queue;
import java.util.*;
public class TwoSum {
    public static int[] solve(int[] a,int t){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            int idx=0;
            for(int x:q){
                if(x+a[i]==t) return new int[]{idx,i};
                idx++;
            }
            q.offer(a[i]);
        }
        return new int[]{-1,-1};
    }
}