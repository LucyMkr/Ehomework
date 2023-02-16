
class Sportsman {
    double run;
    double swim;
    double jump;

    Sportsman(int r, int s, int j) {
        run = r;
        swim = s;
        jump = j;
    }
        public double average() {
            double average = (run + swim + jump)/3;
            return average;
        }

    public int TheBiggestScore(double s1, double s2) {
        if (s1 > s2) {
            return 1;
        }else if(s1 < s2){
            return -1;
        }else{
            return 0;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Sportsman First = new Sportsman(75, 59, 78);
        Sportsman Second = new Sportsman(99, 57, 58);


        double f = First.average();
        double s = Second.average();


        double[] Sportsmen = new double[2];
        Sportsmen[0] = f;
        Sportsmen[1] = s;


        for (int i = 0; i < Sportsmen.length; i++) {
            System.out.println(Sportsmen[i]);
        }
        System.out.println(First.TheBiggestScore(f, s));
    }

}
