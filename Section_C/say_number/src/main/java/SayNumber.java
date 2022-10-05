import java.util.HashMap;
import java.util.Map;

public class SayNumber {

    Map<Integer, String> units = Map.of(0, "zero", 1, "one", 2, "two", 3, "three", 4,
            "four", 5, "five", 6, "six", 7, "seven", 8, "eight", 9, "nine");
    Map<Integer, String> tens = Map.of(
            10, "ten",
            11, "eleven",
            12, "twelve",
            13, "thirteen",
            14, "fourteen",
            15, "fifteen",
            16, "sixteen",
            17, "seventeen",
            18, "eighteen",
            19, "nineteen");
    Map<Integer, String> hundres = Map.of(
            20, "twenty",
            30, "thirty",
            40, "forty",
            50, "fifty",
            60, "sixty",
            70, "seventy",
            80, "eighty",
            90, "ninety"
    );
    Map<Integer, String> base = Map.of(3,"hundred",
            6,"thousand",
            9,"million",
            12,"billion",
            15,"trillion"
            );


    public String sayNumber(int num) {
        String stringNum = "";
        String num1 = Integer.toString(num);

        if(num == 0) {
            stringNum += units.get(num);
        }else if(num < 10){
            stringNum += units.get(num);

        }else if(num < 20){
            stringNum += tens.get(num);

        }else if(num < 100){
            int numb = Integer.parseInt(""+num1.charAt(1));
            stringNum += hundres.get(num-numb) + " "+units.get(numb);

        }else if(num < 1000){

            int numb = Integer.parseInt(""+num1.charAt(0));
            int numb_1 = Integer.parseInt(""+num1.charAt(1));
            int numb_2 = Integer.parseInt(""+num1.charAt(2));
            int numb_3 = numb_1*10+numb_2;

            stringNum += units.get(numb) +" "+ base.get(3);

            if (numb_3 == 0){

            }else
            if(numb_3 < 10 ){
                stringNum += " "+units.get(numb_3);

            }else if(numb_3 < 20) {
                stringNum += " "+tens.get(numb_3);

            }else if(numb_3 < 100){
                int numb_a = Integer.parseInt(""+Integer.toString(numb_3).charAt(1));
                stringNum += " "+hundres.get(numb_3-numb_a) + " "+units.get(numb_a);

            }

        }
        else if(num < 1000){

            int numb = Integer.parseInt(""+num1.charAt(0));
            int numb_1 = Integer.parseInt(""+num1.charAt(1));
            int numb_2 = Integer.parseInt(""+num1.charAt(2));
            int numb_3 = numb_1*10+numb_2;

            stringNum += units.get(numb) +" "+ base.get(3);

            if (numb_3 == 0){

            }else
            if(numb_3 < 10 ){
                stringNum += " "+units.get(numb_3);

            }else if(numb_3 < 20) {
                stringNum += " "+tens.get(numb_3);

            }else if(numb_3 < 100){
                int numb_a = Integer.parseInt(""+Integer.toString(numb_3).charAt(1));
                stringNum += " "+hundres.get(numb_3-numb_a) + " "+units.get(numb_a);

            }

        }
        return stringNum;
    }

    public static void main(String[] args) {

        SayNumber sn = new SayNumber();
        System.out.println(sn.sayNumber(900));
    }

}