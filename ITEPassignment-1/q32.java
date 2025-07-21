 class q32 {
    public static void main(String arg[]){
        int side_length=150;
        int  area_garden=(side_length)*(side_length);
        System.out.println("area of the garden="+area_garden);
        int side_lenpol=25;
        int area_pool= (side_lenpol)*(side_lenpol);
        System.out.println("area of the garden="+area_pool);
        int area_notgarden=area_garden-area_pool;
        System.out.println("area of garden not occupid by the pool="+area_notgarden);


    }
    
}

