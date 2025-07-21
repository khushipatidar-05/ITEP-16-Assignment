public class q19 {
    public static void main(String[] args) {
        int cE = 7;
        int cL = 7;
        int cuboidW = 4;
        int cuboidH = 8;
int cuboidl;
        int cV = cE * cE * cE;
        int cuboidV = cuboidL * cuboidW * cuboidH;

        if (cV > cuboidV) {
            System.out.println("Cube has more volume.");
        } else if (cuboidV > cV) {
            System.out.println("Cuboid has more volume.");
        } else {
            System.out.println("Both have equal volume.");
        }
    }
}

