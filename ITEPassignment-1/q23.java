 class q23 {
    public static void main(String[] args) {
        int boxSide = 3;
        int cartonL = 15;
        int cartonW = 9;
        int cartonH = 12;

        int boxesInLength = cartonL / boxSide;
        int boxesInWidth = cartonW/ boxSide;
        int boxesInHeight = cartonH / boxSide;

        int totalBoxes = boxesInLength * boxesInWidth * boxesInHeight;

        System.out.println("Total boxes that can fit: " + totalBoxes);
    }
}



