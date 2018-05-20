package withjava;

public class PI {
    public static double main(String[] args) {
        double fourthOfPi = 1;
        int sign = 0;                       /*0 entspricht negativem Vorzeichen, 1 positivem.*/
        for(double i = 3; fourthOfPi*4 > 2.141; i+=2){
            if(sign%2 == 0)
                fourthOfPi = fourthOfPi - (1/i);
            else
                fourthOfPi = fourthOfPi + (1/i);
            sign++;
            System.out.println(fourthOfPi * 4);
        }
      return fourthOfPi*4;
    }
}
