package Stone;

class Buildings {
    int floor;
    int twoRooms;
    int threeRooms;
    String type;
    District placement;


    Buildings(int f, int r2, int r3, String t) {

        floor = f;
        twoRooms = r2;
        threeRooms = r3;
        type = t;
        //placement = p;
    }
    class District {
        int gardenS;

        public int setGardenS(int gardenS) {
            this.gardenS = gardenS;
            return this.gardenS;
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Buildings first1 = new Buildings(5, 7, 10, "Monolith");
        Buildings second1 = new Buildings(6, 7, 5, "Panel");
        Buildings third1 = new Buildings(5, 4, 13, "Monolith");
        Buildings.District first = first1.new District();
        first.gardenS = 500;
        first1.placement = first;
        second1.placement = first;
        third1.placement = first;


        Buildings first2 = new Buildings(4, 0, 15, "Panel");
        Buildings second2 = new Buildings(4, 3, 15, "Panel");
        Buildings third2 = new Buildings(4, 3, 16, "Panel");
        Buildings.District second = first2.new District();
        second.gardenS = 700;
        first2.placement = second;
        second2.placement = second;
        third2.placement = second;

        Buildings[] allMybuildings = new Buildings[]{first1, second1, third1, first2, second2, third2};
        int allRoomForFDist = 0;
        int allRoomForSDist = 0;
        for (int i = 0; i < allMybuildings.length; i++) {
            if (allMybuildings[i].placement == first) {
                int allRoomOfOneF = allMybuildings[i].threeRooms + allMybuildings[i].twoRooms;
                allRoomForFDist += allRoomOfOneF;
            } else {
                int allRoomOfOneS = allMybuildings[i].threeRooms + allMybuildings[i].twoRooms;
                allRoomForSDist += allRoomOfOneS;
            }

        }
        double resultF = (double) first.gardenS / allRoomForFDist;
        double resultS = (double) second.gardenS / allRoomForSDist;

        System.out.println(allRoomForFDist);
        System.out.println(resultF);

        System.out.println(allRoomForSDist);
        System.out.println(resultS);



    }

}




