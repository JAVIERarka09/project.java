package Projek;

public class partTime extends Teacher  {
    int houseWork;
    public partTime(String n, int a, String s, int hw ) {
        super(n, a, s);
        houseWork = hw;
    } 

    public int getHouseWork() {
        return this.houseWork;
    }
    public void setHouseWork(int houseWork) {
        this.houseWork = houseWork;

    }

    public void print() {
        super.print();
        System.out.println("" + houseWork);
    }
}


