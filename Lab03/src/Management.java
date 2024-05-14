import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    private ArrayList<CD> list ;
    private int numberOfCd;

    public Management() {}
    public Management(ArrayList<CD> list, int numberOfCd) {
        this.list = list;
        this.numberOfCd = numberOfCd;
    }
    public void addCD() {
        Scanner sc = new Scanner(System.in);
        numberOfCd = sc.nextInt();
        for (int i = 0; i < numberOfCd; i++) {
            CD cd = new CD();
            cd.setCD();
            list.add(cd);
        }


    }
}
