import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        double feeding = bill.feeding(bill.beer, bill.barbecue, bill.softDrink);
        double ticket = bill.ticket(bill.gender);
        double cover = bill.cover(feeding);

        System.out.println("\nRELATÓRIO: ");
        System.out.printf("\nConsumo = R$ %.2f", feeding);
        if (cover == 0) {
            System.out.print("\nIsento de Couvert");
        } else {
            System.out.printf("\nCouvert = R$ %.2f", cover);
        }
        System.out.printf("\nIngresso = R$ %.2f", ticket);
        System.out.printf("\n\nValor a pagar = R$ %.2f", bill.total(cover, feeding, ticket));

        sc.close();






    }
}