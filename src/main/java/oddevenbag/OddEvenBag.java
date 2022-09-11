package oddevenbag;
import java.util.*;
public class OddEvenBag {

    private ArrayList<Integer> oddEvenBag;

    public OddEvenBag (int[] seedArray) {
        this.oddEvenBag = new ArrayList<>();
        for(int i = 0; i < seedArray.length; i++) {
            this.oddEvenBag.add(seedArray[i]);
        }
    }
    public OddEvenBag () {
        oddEvenBag = new ArrayList<>();
    }

    public void add(int num) {
        this.oddEvenBag.add(num);
    }

    public void remove(int num) {
        this.oddEvenBag.remove(num);
    }

    public void increment() {
        for(int i = 0; i < this.oddEvenBag.size(); i++) {
            this.oddEvenBag.set(i, this.oddEvenBag.get(i) + 1);
        }
    }

    public void decrement() {
        for(int i = 0; i < this.oddEvenBag.size(); i++) {
            this.oddEvenBag.set(i, this.oddEvenBag.get(i) - 1);
        }
    }

    public boolean contains(int num) {
        return this.oddEvenBag.contains(num);
    }

    public int getCount(int num) {
        int count = 0;
        for(int i: this.oddEvenBag) {
            if(i == num) {
                count++;
            }
        }
        return count;
    }

    public int getEven() {
        int count = 0;
        for(int i: this.oddEvenBag) {
            if(i%2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getSize() {
        return this.oddEvenBag.size();
    }

    @Override
    public boolean equals(Object o) {

        if(o.getClass().equals(getClass())) {
            OddEvenBag oof = (OddEvenBag) o;
            if((this.getEven() == oof.getEven()) && (this.oddEvenBag.size() == oof.getSize())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.getEven();
    }

    public long sum() {
        long sum = 0;
        for(int i: this.oddEvenBag) {
            sum+= i;
        }
        return sum;
    }



}
