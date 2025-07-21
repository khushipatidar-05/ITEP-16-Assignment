class q24 {
    public static void main(String[] args) {
        double wallL = 20;
        double wallH = 2;
        double wallTn = 0.75;
        double brickL = 0.25;
        double brickW = 0.10;
        double brickH = 0.075;
        double wallVolume = wallL * wallH * wallTn;
        double brickVolume = brickL * brickW * brickH;
        double numberOfBricks = Math.ceil(wallVolume / brickVolume);
        double costPerThousand = 900;
        double totalCost = (numberOfBricks / 1000) * costPerThousand;
        System.out.println("Number of bricks: " + (int)numberOfBricks);
        System.out.println("Total cost: $" + totalCost);
    }
}
