import java.util.Scanner;

public class Stack16Main {
    public Stack16Main(){

    }
    static Scanner sc16 = new Scanner(System.in);
        void inputData(Stack16 s){
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
        }while(pilih=='y'); 
    }
    public static void main(String[] args) {
        Stack16 stk = new Stack16(5);
        Stack16Main sm = new Stack16Main();
        boolean IsTrue = true;
        while(true){
            System.out.println("================================================");
            System.out.println("Pilih Menu Stack");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.println("================================================");
            int pilihan = sc16.nextInt();
            sc16.nextLine();
            switch(pilihan){
                case 1:
                    System.out.println("----------------------------");
                    System.out.println("Masukan Data");
                    sm.inputData(stk);
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("Anda ingin mengambil "+ "data berapa kali?");
                    System.out.print("Masukan Jawaban: ");
                    int ambil = sc16.nextInt();
                    if (ambil <= stk.data.length){
                        for(int i=0; i< ambil; i++){
                           stk.pop(); 
                        }
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------");
                    stk.peek();
                    System.out.println("----------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------");
                    stk.print();
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.print("Apakah ingin mengulang? ");
                    char keputusan = sc16.next().charAt(0);
                    if(keputusan == 'n'){
                        IsTrue = false;
                        break;
                    }




            }
        }
    }
  
}
