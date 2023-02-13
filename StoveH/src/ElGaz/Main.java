package ElGaz;


public class Main {
    public static class Stove {
        private int elEyesAm;
        private int gazEyesAm;
        private boolean isTurnedEl = false;
        private boolean isTurnedG = false;
        private int powerEl = 100;
        private int powerGaz = 80;


        Stove() {


        }


        public void setElEyesAm(int elEyesAm, boolean isTurnedEl) {
            if (elEyesAm <= 3 && elEyesAm >= 1) {
                this.elEyesAm = elEyesAm;
            } else if (elEyesAm >= 3 && elEyesAm <= 1) {
                System.out.println("Enter valid amount 1 - 3");
                System.out.println("amount was equaled to 2");
                this.elEyesAm = 2;
            }
            System.out.println("The amount of electric eyes is " +  elEyesAm);
            this.isTurnedEl = isTurnedEl;
            if (this.isTurnedEl) {
                int allElPower = powerEl * this.elEyesAm;
                System.out.println("the energy of electric eyes is " + allElPower);

            }
        }


        public void setGazEyesAm(int gazEyesAm, boolean isTurnedG) {
            if (gazEyesAm <= 5 && gazEyesAm >= 3) {
                this.gazEyesAm = gazEyesAm;
                ;
            } else {
                System.out.println("Enter valid amount 3 - 5");
                System.out.println("amount was equaled to 4");
                this.gazEyesAm = 4;
            }
            System.out.println("The amount of gaz eyes is " +  gazEyesAm);
            this.isTurnedG = isTurnedG;
            if (this.isTurnedG) {
                int allGPower = powerGaz * this.gazEyesAm;
                System.out.println("the energy of gaz eyes is " + allGPower);
            }
        }
    }
}