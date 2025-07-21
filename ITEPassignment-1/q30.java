 class q30 {
    public static void main (String arg[]){
        int badroom_len=200;
        int badroom_wid=400;
        int badroom_area;
        badroom_area=badroom_len*badroom_wid;
        System.out.println("area of the bedroom floor ="+badroom_area);
        int tile_len=5;
        // len = length , wid = width;
        int tile_wid=8;
        int tile_area=tile_len*tile_wid;
        System.out.println("area of one tile ="+tile_area);
        double noOfTiles=badroom_area/tile_area;
        System.out.println("number of tiles ="+noOfTiles);


    }
    
}
