package queue;
public class CircularTour {
    static class Pump{int p,d;Pump(int p,int d){this.p=p;this.d=d;}}
    public static int find(Pump[] a){
        int s=0,b=0,d=0;
        for(int i=0;i<a.length;i++){
            b+=a[i].p-a[i].d;
            if(b<0){s=i+1;d+=b;b=0;}
        }
        return (b+d>=0)?s:-1;
    }
}