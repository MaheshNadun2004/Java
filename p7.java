public class p7{
    public static void main(String[]args){
//-----( 1 to 10 )-----
        int i = 1 ;
        while( i<11 ){
            System.out.print(i + " ");
            i++;
        }
        System.out.println( " ");
//-----( 10 to 1 )-----\
        i = 10;
        while( i > 0 ){
            System.out.print(i + " ");
            i--;
        }
        System.out.println(" ");
//----( sum )-----
        i = 10;
        int sum = 0;
        while( i > 0 ){
            sum+=i;
            i--;
        }
        System.out.println("Sum: " + sum);
    }
}
