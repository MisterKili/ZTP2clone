public class Pair<T> {

    T a;
    T b;

    public Pair(T t1, T t2){
        a = t1;
        b = t2;
    }

    public void printPair(){
        System.out.println(a+" "+b);
    }

    public void clone(Pair<T> toClone){
        this.a = toClone.a;
        this.b = toClone.b;
    }
}
