public class p8{
    public static void main(String[]args){
//-----( 1 to 10 )----
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while( i < 11);
        System.out.println(" ");
//-----( 10 to 1 )----
        i = 10;
        do{
            System.out.print( i + " ");
            i--;
        }while ( i> 0) ;
//----( sum )----
        i = 1;
        int sum = 0;
        do{
            sum+=i;
            i++;
        }while (i<11);
        System.out.println("Sum:" + sum);
    }
}
