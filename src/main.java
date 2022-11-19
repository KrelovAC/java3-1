public class main {
    public static void main(String[] args) {
        BonusMilesServise servis = new BonusMilesServise();
        int price = 16_000;
        int miles = servis.calculate(price);
        System.out.println(miles);

    }
}
