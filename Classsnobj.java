/**
 * classsnobj
 */
  class Calci {
    public int addd(int n1 , int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
public  class Classsnobj {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
         Calci obj=new Calci();
         
        int res = obj.addd(num1,num2);
        System.out.println(res);
    }
}