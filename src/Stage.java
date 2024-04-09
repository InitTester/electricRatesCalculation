import java.util.Scanner;

public class Stage {
  private int quantity;
  Calculation cal = Calculation.getInstance();

  public void start() {

    Scanner sc = new Scanner(System.in);
    System.out.println("사용량을 입력하세요.");
    try {
      quantity = sc.nextInt();

      if (quantity <= 0) {
        System.out.println("== 사용량이 0또는 0보다 작습니다. 다시 입력해주세요. ==");
        start();
      }

      // code here
      cal.set사용량(quantity);
      System.out.println(cal.toString());

    }catch (Exception e){
      System.out.println("== 입력 값을 확인해주세요. ==");
      start();
    }
  }
}
