public class App{
    public static void main (String[] args){
        first();
        System.out.println();
        second();
        System.out.println();
        third();
        
    }

    public static void first(){
        for (int i = 1; i<= 5; i++){
            for (int count = 0; count <= i-1; count++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void second()
    {
        for (int j = 1; j<=5; j++)
        {
            for (int k = 1; k <= 5-j; k ++) {
                System.out.print(".");
            }
            for (int l = 1; l <= j; l++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void third() {
        for (int j = 1; j<=5; j++)
        {
            for (int k = 1; k <= 5-j; k ++) {
                System.out.print(".");
            }
            System.out.print(j);

            for (int l = 2; l <= j; l++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
 }