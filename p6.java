public class p6{
    public static void main(String[]args){
//-----( Display 1 to 10 )-----
        for(int i=1 ; i<11 ; i++){
            System.out.print(i + " ");
        }
        System.out.println( " ");
//-----( Revers )-----
        for(int i=10 ; i>0 ; i--){
            System.out.print( i + " ");
        }
        System.out.println( " ");
//-----( Sum )-----
    int sum = 0;
    for(int i=1 ; i<11 ; i++){
            sum+=i;
        }
        System.out.println("Sum: " + sum);
    }
}
