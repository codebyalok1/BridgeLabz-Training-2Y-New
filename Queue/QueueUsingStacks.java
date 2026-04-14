package queue;
import java.util.*;
public class QueueUsingStacks {
    static class Q{
        Deque<Integer> in=new ArrayDeque<>();
        Deque<Integer> out=new ArrayDeque<>();
        void enq(int x){in.push(x);}
        int deq(){
            if(out.isEmpty()) while(!in.isEmpty()) out.push(in.pop());
            return out.pop();
        }
    }
}