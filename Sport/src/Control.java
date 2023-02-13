public class Control {
    public static void main(String[] args) {
        Sportsman First = new Sportsman(23, 45, 56);
        Sportsman Second = new Sportsman(45, 21, 32);
        Sportsman Third = new Sportsman(54, 22, 34);
        double f = Sportsman.average(First.run, First.swim, First.jump);
        double s = Sportsman.average(Second.run, Second.swim, Second.jump);
        double th = Sportsman.average(Third.run, Third.swim, Third.jump);


        double[] sportsmen = new double[3];
        sportsmen[0] = f;
        sportsmen[1] = s;
        sportsmen[2] = th;

        for (int i = 0; i < sportsmen.length; i++) {
            System.out.println(sportsmen[i]);
        }
    }
}
