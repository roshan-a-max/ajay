public class multidimensionalarrayinjava {
    public static void main(String[] args) {
        int num[][]= new int [4][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                num[i][j] = (int)(Math.random() * 10);
            
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {

                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    
        for(int n [] : num)
        {
            for(int m : n)
            {
                System.out.println(m + " ");
            }
            System.out.print();
        }
    }
    
}
