
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        for (int i = 10; i < 21; i++) {
            int factorsCounter=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) factorsCounter++;
            }
            if (factorsCounter==2) {
                if (flag) System.out.print(i+" ");
                flag=!flag;
            }
        }
    }
}