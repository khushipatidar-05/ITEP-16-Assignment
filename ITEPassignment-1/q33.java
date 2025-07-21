 class q33 {
    public static void main(String arg[]){
    int lenth=30;
    int width=20;
    int At=lenth*width;
    System.out.println("the area of garden ="+At);
    int Path_width=4;
    int Path_lenght=3;
    int pathway1_Lenght=Path_width*width;
    System.out.println("area of path way along length ="+pathway1_Lenght);
       int pathway2_Width= Path_lenght*length;
    System.out.println("area of path way along width ="+pathway2_Width);
    int overlap=Path_width*Path_lenght;

       int Tp=pathway1_Lenght+pathway2_Width-overlap;
    System.out.println("total pathway ="+Tp);

    int totalUsableArea=At-Tp;
    System.out.println("usable area ="+totalUsableArea);
    }
    
}
