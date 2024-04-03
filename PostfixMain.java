import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukan ekspresi matematika (infinix): ");
        Q = sc16.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();

        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Posftix: "+ P);
    }
}
