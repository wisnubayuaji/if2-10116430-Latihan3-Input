import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
}
