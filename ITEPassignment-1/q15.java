 class q15{
    public static void main(String[] args) {
        double sL = 22.0;
        double sBCm = 15.0;
        double sB = sBCm / 100.0;
        double shellyArea = sL * sB;

        double rS = 21.0;
        double rachelArea = rS * rS;

        if (shellyArea > rachelArea) {
            System.out.printf("Shelly's garden is bigger by %.2f square meters.%n", shellyArea - rachelArea);
        } else if (rachelArea > shellyArea) {
            System.out.printf("Rachel's garden is bigger by %.2f square meters.%n", rachelArea - shellyArea);
        } else {
            System.out.println("Both gardens are of the same area.");
        }
    }
}
