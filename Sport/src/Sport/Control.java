package Sport;

class Sportsman {

    double run;
    double swim;
    double jump;
    private double[] sportsmen;

    Sportsman(double r, double s, double j) {
        run = r;
        swim = s;
        jump = j;
    }
    Sportsman First = new Sportsman(23, 45, 56);
    Sportsman Second = new Sportsman(45, 21, 32);

    public double average(double run, double swim, double jump) {
        double average1 = (run + swim + jump) / 3;
        return average1;
    }
    public int theBiggestScore(){
      if ( average(First.run, First.swim, First.jump) > average(Second.run, Second.swim, Second.jump) ){
          return 1;
      } else if (average(First.run, First.swim, First.jump) < average(Second.run, Second.swim, Second.jump)) {
          return -1;
      }else {
          return 0;
      }
    }
}

public class Control {
    public static void main(String[] args) {
        Sportsman First = new Sportsman(23, 45, 56);
        Sportsman Second = new Sportsman(45, 21, 32);


        double f = First.average(First.run, First.swim, First.jump);
        double s = Second.average(Second.run, Second.swim, Second.jump);


        double[] Sportsmen = new double[2];
        Sportsmen[0] = f;
        Sportsmen[1] = s;


        for (int i = 0; i < Sportsmen.length; i++) {
            System.out.println(Sportsmen[i]);
        }
        int result =Sportsmen.theBiggestScore();
        System.out.println(result);


    }
}












