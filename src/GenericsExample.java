import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {
        Container<Double> c = new Container();
        c.value = 9.5;
        c.show();
        c.demo(new ArrayList<>());

        c.demo1(new ArrayList<Number>());
    }
}

class Container<T extends  Number>{ // only work with numbers eg: 1,2,3 -> Integer; 1.2,1.3,4.5 -> Double Data Type Class
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> obj){
        System.out.println(obj);
    }
    public void demo1(ArrayList<? super T> obj){
        System.out.println(obj);
    }
}