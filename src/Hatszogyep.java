import java.util.Scanner;

public class Hatszogyep {

    public Hatszogyep() {
    }

    public void startHatszogyep() {
        double terulet = this.bekerDatas();
        nyomtat(terulet);
    }

    private void nyomtat(double terulet) {
        System.out.println(terulet);
    }

    private double bekerDatas() {
        String oldalStr = beker("Oldal hossza: ");

        double oldal = Double.parseDouble(oldalStr);
        double terulet = szamitHexagon(oldal);

        return terulet;
    }

    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }

    public double szamitHexagon(double oldal) {
        double terulet = (3 / 2) * Math.pow(oldal, 2) * Math.sqrt(3);
        return terulet;
    }
}
