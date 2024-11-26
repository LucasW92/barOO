public class Bill {

    char gender;
    int beer, barbecue, softDrink;

    public double cover(double totalBillValue) {
        if (totalBillValue > 30) {
            return 0.00;
        } else {
            return 4.00;
        }
    }

    public double feeding(int beer, int barbecue, int softDrink) {
        return (this.beer * 5.00 + this.barbecue * 7.00 + this.softDrink * 3.00);
    }

    public double ticket(char gender) {
        if (this.gender == 'F') {
            return 8.00;
        } else {
            return 10.00;
        }
    }

    public double total(double cover, double feeding, double ticket) {
        return cover + feeding + ticket;
    }

}
