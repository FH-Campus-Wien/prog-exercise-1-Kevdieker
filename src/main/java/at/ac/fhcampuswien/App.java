package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.print(
                "         __"               + System.lineSeparator() +
                " _(\\    |@@|"             + System.lineSeparator() +
                "(__/\\__ \\--/ __"         + System.lineSeparator() +
                "   \\___|----|  |   __"    + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/"  + System.lineSeparator() +
                "      _)(  )(_"            + System.lineSeparator() +
                "     `---''---`"           +System.lineSeparator());
    }

    //todo Task 3
    public void sumOfLiterals(){

        int a = 'Z', b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f, f = 5.5f;
        double  g=8.88e1, h = 99.9;

        int sum = a+b+(int)c+(int)d+(int)e+(int)f+(int)g+(int)h;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int x=0,y=0;

      // It's the onlyScanner u will ever need xD
        Scanner onlyScanner = new Scanner(System.in);
        x = onlyScanner.nextInt();

        onlyScanner = new Scanner(System.in);
        y = onlyScanner.nextInt();

        int sum = x+y;

        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){

        int x=0,y=0;
        System.out.println("Before Swap:");
        System.out.print("x: ");

        Scanner onlyScanner = new Scanner(System.in);
        x = onlyScanner.nextInt();

        System.out.print("y: ");
        onlyScanner = new Scanner(System.in);
        y = onlyScanner.nextInt();

        System.out.println("After Swap:");

        /* *******************************
         *
         *  x = b, y = c
         *  x = x + y = b+c
         *  y = x - y = (b+c)-c = b
         *  x = x - y = (b+c)-b = c
         *
        **********************************/
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.print("x: "+x+System.lineSeparator());
        System.out.println("y: "+y);


    }

    //todo Task 6
    public void compareTwoNumbers(){

        int x=0,n1=0,n2=0;

        System.out.print("n1: ");
        Scanner onlyScanner = new Scanner(System.in);
        n1 = onlyScanner.nextInt();

        System.out.print("n2: ");
        onlyScanner = new Scanner(System.in);
        n2 = onlyScanner.nextInt();

      if (n1>n2){
          System.out.println("n1 > n2");
      }
      if (n2>n1){
            System.out.println("n2 > n1");
      }
      if (n1==n2){
            System.out.println("n1 == n2");
    }
}

    //todo Task 7
    public void ratingSalesPerson(){

        int rev=0;

        System.out.print("Enter annual Revenue: ");
        Scanner onlyScanner = new Scanner(System.in);
        rev = onlyScanner.nextInt();

        if(rev < 0 || rev >= 100000){
            System.out.println("Invalid Revenue");
        }
        if( 0 <= rev && rev < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if( 20000 <= rev && rev < 50000){
            System.out.println("Average Sales Revenue");
        }
        if( 50000 <= rev && rev < 80000){
            System.out.println("Good Sales Revenue");
        }
        if( 80000 <= rev && rev < 10000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

        int x=0;

        System.out.print("Enter CommissionClass: ");
        Scanner onlyScanner = new Scanner(System.in);
        x = onlyScanner.nextInt();

        switch (x){
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
        }

    }

    //todo Task 9
    public void leapyear() {

        int x = 0;

        System.out.print("Year: ");
        Scanner onlyScanner = new Scanner(System.in);
        x = onlyScanner.nextInt();

        if (x % 4 == 0 && x % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");

        }
    }

    //todo Task 10
    public void transposedNumbers(){
        int x=0,a=0,b=0,c=0;

        System.out.print("Number: ");
        Scanner onlyScanner = new Scanner(System.in);
        x = onlyScanner.nextInt();

        /* *************************************************
         *
         *  a = xyz mod(10) = z                  ;gets ones
         *  b = xyz/10 mod(10) = xy mod(10) = y  ;gets tens
         *  c = xyz/100 = x                      ;gets hundreds
         *
         *
         **************************************************/

        a = x % 10;
        b = x/10%10;
        c = x/100;

        System.out.println(a*100+b*10+c);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}