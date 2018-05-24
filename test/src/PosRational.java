import java.util.*;

public class PosRational implements Comparable<PosRational>, Iterable<Integer>{

  private int num, den;

  public PosRational(int num) {
    this(num, 1);
  }

  protected int num() {
    return this.num;
  }

  protected int den() {
    return this.den;
  }

  public PosRational(int num, int den) {
    if(num < 0 || den <= 0) {
      throw new IllegalArgumentException("PosRational received an inappropriate argument");
    }
    this.num = num;
    this.den = den;
    reduce();
  }

  public PosRational add(MyInteger i) {
    return this.add(i.asPosRational());
  }

  public PosRational[] coerce(MyInteger n) {
    return new PosRational[] {n.asPosRational(), this};
  }

  private void reduce() {
    int d = gcd(this.num, this.den);
    this.num = this.num / d;
    this.den = this.den / d;
  }

  private int gcd(int x, int y) {
    if(x == y) {
      return x;
    } else if(x < y) {
      return gcd(x, y - x);
    } else {
      return gcd(y, x);
    }
  }

  public PosRational add(PosRational other) {
    int a = other.num();
    int b = other.den();
    int c = this.num;
    int d = this.den;
    this.num = (a * d) + (b * c);
    this.den = b * d;
    reduce();
    return this;
  }

  public String toString() {
    return String.format("%d / %d", this.num, this.den);
  }

  @Override
  public int compareTo(PosRational other) {
    int this_newnum = this.num * other.den();
    int other_newnum = other.num() * this.den;
    return this_newnum - other_newnum;
  }

  public Iterator<Integer> iterator() {
    ArrayList<Integer> it = new ArrayList<>();
    it.add(this.num);
    it.add(this.den);
    return it.iterator();
  }

}