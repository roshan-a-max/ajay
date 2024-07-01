public class methods {
    public static void main(String[] args) {
        A obj = new A();
        obj.musicplay();
        String res = obj.getmeapen(11);
        System.out.println(res);

    }
}

class A {
    public void musicplay() {
        System.out.println("music playing broo");
    }

    public String getmeapen(int cost) {
        if (cost < 10)
            {
                System.out.println("fuck you");
                return "yes";
            }
        else
            {
                System.out.println();
                return "no";
            }

    }
}