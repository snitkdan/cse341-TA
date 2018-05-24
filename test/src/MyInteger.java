public class MyInteger {

  public int n;

  public MyInteger(int n) {
    this.n = n;
  }

  public PosRational asPosRational() {
    return new PosRational(this.n);
  }

  public Object add(Object o) {
    try {
      return new MyInteger(((MyInteger) o).n + this.n);
    } catch(Exception e) {
      PosRational[] coerced = ((PosRational) o).coerce(this);
      return coerced[0].add(coerced[1]);
    }
  }

  public String toString() {
    return "" + n;
  }
}
