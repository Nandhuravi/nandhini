import java.util.Scanner;
public class pos1{

    public static void main(String[] args) {
        
        int k = 0;
        int e = 0;
        System.out.println("Enter the String:");
        Scanner s = new Scanner(System.in);
        String q = new String();
        q = s.nextLine();
        char[] a = new char[100];
        int n = q.length();
        for (int i = 0; i < n; i++) {
            a[i] = q.charAt(i);

        }
        for (int i = 0; i < n; i++) {
            if (a[i] == '(') {
                k++;
            } else if (a[i] == ')') {

                e++;

            }


        }
        if (k > e) {
            System.out.println("number of pairs formed is  " + e);
        } else {
            System.out.println("number of pairs formed is  " + k);
        }
        System.out.println("UNPAIRED IS:  " + (k - e));



    }
}
