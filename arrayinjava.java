public class arrayinjava {
    public static void main(String[] args) {
        int num[] = {1,2,23,65,8};
        System.out.println(num[0]);

        int num1[] = new int[5];
        num1[0]=2;
        num1[1]=22;
        num1[2]=25;
        num1[3]=12;
        num1[4]=211;

        for(int i =1;i<4;i++)
        {
            System.out.println(num1[i]);
        }
    int array[][] = new int[5][5];
     for(int i = 0; i<4;i++)
     {
        for(int j=0;j<4;j++)
        {
            System.out.print(array[i][j] +" ");
         }
         System.out.println();
        
     }
     

    
    
    }
    
}
