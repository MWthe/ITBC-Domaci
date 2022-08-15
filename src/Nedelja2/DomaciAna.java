package Nedelja2;

import java.util.Scanner;

public class DomaciAna {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                System.out.println("No");
                break;
            } else {
                System.out.println("Yes");
                break;
            }
        }
    }
}

