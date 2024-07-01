/**
 * methodssss
 *  
 */
public class InnerA {

    public static void main(String[] args) {
        A obj = new A();
        String res = obj.Add("hi", "ajju");
        System.out.println(res);
        
    }
}

class A{
    public String Add(String a , String b){
        String r = a+b;
        return r;
        
    }
}