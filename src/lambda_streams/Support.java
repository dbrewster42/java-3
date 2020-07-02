// package lambda_streams;
interface A {
    void show();
}

public class Support implements A {
    public static void main(String[] args) {
        // Support obj = new A();
        A obj;
        obj = () -> (System.out.println("hello"));
        obj.show();

    }

    // @Override
    // public void show() {
    //     System.out.println("Hello");
    // }

}