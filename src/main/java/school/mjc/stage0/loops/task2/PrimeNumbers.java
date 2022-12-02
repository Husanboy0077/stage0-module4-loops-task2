package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

            for (int i = 2; i <= printToInclusive; i++)
            {
                boolean tub = true;
                for (int j = 2; j <= Math.sqrt(i); j++)
                {
                    if (i % j == 0)
                    {
                        tub = false;
                        break;
                    }
                }
                if (tub == true)
                    System.out.println(i);
            }
            return;
        }
        }


