import java.util.*;

public class StringToken{

    public static void main(String args[]) {
        System.out.print("Enter The Line Of Integer: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s);

        int num, sum = 0;
        System.out.println("Digits : ");
        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }

        System.out.println("\nSum: " + sum);
    }

}