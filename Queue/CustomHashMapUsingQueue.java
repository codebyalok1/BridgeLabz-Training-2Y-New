package queue;
import java.util.*;
public class CustomHashMapUsingQueue {
    static class Pair{int k,v;Pair(int k,int v){this.k=k;this.v=v;}}
    Queue<Pair> q=new LinkedList<>();
    void put(int k,int v){
        for(Pair p:q) if(p.k==k){p.v=v;return;}
        q.offer(new Pair(k,v));
    }
    int get(int k){
        for(Pair p:q) if(p.k==k) return p.v;
        return -1;
    }
}