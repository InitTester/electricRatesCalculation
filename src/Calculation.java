import java.text.DecimalFormat;

public class Calculation {

  // code here
    public void userPrice(int usekWh){

        // 기본요금
        System.out.printf("기본요금 : %,d원 \n",기본요금(usekWh));

        // 전력량 요금
        System.out.printf("전력량요금 : %,d원 \n",(int)전력량요금(usekWh));

        // 기후환경 요금
        System.out.printf("기후환경요금 : %,d원 \n",(int)기후환경요금(usekWh));

        // 전기요금계
        System.out.printf("전기요금계 : %,d원 \n",(int)전기요금계(usekWh));

        // 부가가치세
        System.out.printf("부가가치세 : %,d원 \n",(int) Math.round(부가가치세(usekWh)),2);

        // 전력 기반기금
        System.out.printf("전력기반기금 : %,d원 \n",(int)전력기반기금(usekWh));

        // 청구금액
        System.out.printf("청구금액 : %,d원 \n",(int)청구금액(usekWh));
    }

    static int 기본요금(int usekWh){

        int 기본요금 = 0;

        if(usekWh <=200) {기본요금 = 910;}
        else if(201<= usekWh && usekWh <= 400 ) { 기본요금=1600;}
        else if(usekWh > 400) { 기본요금 = 7300;}

        return 기본요금;
    }

    static double 전력량요금(int usekWh){

        double 전력량요금 = 0;

        if(0 <= usekWh-200){
            전력량요금 += 200 * 120;
        }
        if(0 <= usekWh-400){
            전력량요금 += 200 * 214.6;
        }
        if (0 < usekWh-400){
            전력량요금 += (usekWh-400) * 307.3;
        }
        return 전력량요금;
    }

    static double 기후환경요금(int usekWh){
        return usekWh * 9;
    }

    static double 전기요금계(int usekWh){
       return (int)(기본요금(usekWh) + 전력량요금(usekWh) +  기후환경요금(usekWh));
    }

    static double 부가가치세 (int usekWh){
        return 전기요금계(usekWh) * 0.1;
    }

    static double 전력기반기금 (int usekWh){
        return (int)(전기요금계(usekWh)*0.037/10) * 10;
    }

    static double 청구금액(int usekWh){
        return (int)(전기요금계(usekWh) + 부가가치세(usekWh) + 전력기반기금(usekWh))/10 * 10;
    }

}
