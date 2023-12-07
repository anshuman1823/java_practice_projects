
class towerOfHanoi {
    public static void towerHanoi(int nDisks, String src, String helper, String dest){
        if(nDisks == 1){
            System.out.println("Move disk " + nDisks + " from " + src + " to " + dest );
            return;
        }
        towerHanoi(nDisks-1, src, dest, helper);
        System.out.println("Move disk " + nDisks + " from " + src + " to " + dest);
        towerHanoi(nDisks-1, helper, src, dest);
    }

    public static void main(String args[]){
        int n = 2;
        towerHanoi(n, "Source", "Helper", "Destination");
    }
}
