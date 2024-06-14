import java.rmi.StubNotFoundException;
import java.util.*;

/*
// printing the Hollow Rectangle
public class p {
    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                if (i == 0 || j == 0 || i == 3 || j == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
*/

/* 
//Inverted and Rotated Half Pyramid
public class p{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 0; i<num; i++){
            for (int j = num-1; j > i; j--){
                System.out.print(" ");
            }

            for (int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/


/*
//Inverted Half Pyramid with Number Patterns
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--){
            for (int j = 1  ; j<= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
*/

/*
// Floyd's Trianlge

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        int num1 =1;
        for (int i = 1; i <=num ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println("");
        }
    }
    
}
*/



// 0-1 Trianlge

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        int value = 1;
        for(int i = 0; i < num; i++){
            for (int j = 0; j <=i; j++){
                System.out.print(value);
                value = 1-value;
            }

            if (i%2!=0) {
                value = 1;
            }
            else {
                value = 0;
            }
            System.out.println("");
        }
    }
    
}



/* 
//Butterfly Pattern

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for (int i= 1; i <= num; i++){
                        
            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }

            for( int k = 1; k <= 2 * (num - i); k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }

        for (int i = num; i >= 1; i--){
                        
            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }

            for( int k = 1; k <= 2 * (num - i); k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }

    }
    
}

*/