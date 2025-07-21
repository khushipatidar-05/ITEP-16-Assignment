 class q11 {
    public static void main(String[] args) {
        double ratioBase = 8;
        double ratioHeight = 5;
        double area = 320;

        double k = Math.sqrt((2 * area) / (ratioBase * ratioHeight));
        double base = ratioBase * k;
        double height = ratioHeight * k;

        System.out.println("Base: " + base + " meters");
        System.out.println("Height: " + height + " meters");
    }
}
