package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double i=0;
        if (power<0) {
            System.out.println("too much power");
        }
        while (i<=power){
            double  j=Math.pow(2,i);
            i++;
            System.out.println((int)j);
        }

    }
}
