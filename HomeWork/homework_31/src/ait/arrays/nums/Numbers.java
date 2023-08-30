package ait.arrays.nums;

public class Numbers implements Comparable<Numbers> {
    int num;

    public Numbers(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Integers{" +
                "num=" + num +
                '}';
    }

    @Override
    public int compareTo(Numbers o) {
        int result = num % o.num;
        return result ==0 ? result: num - o.num;
    }
}
