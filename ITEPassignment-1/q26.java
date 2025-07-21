 class q26 {
    public static void main(String arg[]){
        int len=120;
        float  bre=2.4f;
        float a=len*bre;
        System.out.println("the area of path="+a);
        float a_squre=a*10000;
        System.out.println("convert area of the path="+a_squre);

        int brick_len=24;
        int brick_bre=15;
        int area_brick=brick_len*brick_bre;
        System.out.println("area of one brick="+area_brick);
        double noOfBrick=a_squre/area_brick;
        System.out.println("the number of bricks="+noOfBrick);


    }
    
}
