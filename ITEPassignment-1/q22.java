 class q22 {
    public static void main(String[] args) {
        double lCm = 50;
        double wCm = 30;
        double dM = 2;

        double lM = lCm / 100.0;
        double wM = wCm / 100.0;

        double volumeCubicMeters = lM * wM * dM;

        System.out.println("Capacity of the pond: " + volumeCubicMeters + " cubic meters");
    }
}

