import java.util.Scanner;

public class Stack16Main {
    public static void main(String[] args) {
        Stack16 stk = new Stack16 (5);
        Scanner sc16 = new Scanner(System.in);
        char pilih;
        do {
        System.out.print("Jenis: ");
        String jenis = sc16.nextLine();
        System.out.print("Warna: ");
        String warna = sc16.nextLine();
        System.out.print("Merk: ");
        String merk = sc16.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc16.nextLine();
        System.out.print("harga: ");
        double harga = sc16.nextDouble();

        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)");
        pilih = sc16.next().charAt(0);
        sc16.nextLine();
        stk.push(p);
        }while(pilih== 'y'); 
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
  
}
