class A {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(int a, int b, double c) {
        return a + b + c;
    }
}

public class method_overload {
    public static void main(String[] args) {
        A obj = new A();
        int res = obj.add(5, 10);
        System.out.println(res);

    }

}
