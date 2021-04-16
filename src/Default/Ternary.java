package Default;

@FunctionalInterface
public interface Ternary<X,Y,Z,R>{
    R apply(X x,Y y, Z z);
}