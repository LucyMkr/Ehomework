class Sportsman {

    double run;
    double swim;
    double jump;

    Sportsman(double r, double s, double j) {
        run = r;
        swim = s;
        jump = j;
    }


    public static double average(double run, double swim, double jump) {
        double average1 = (run + swim + jump) / 3;
        return average1;
    }
}

