public class TestMain {
  public static void main(String args[]) {

    /* Rock Paper Scissors */
    RPSObject s = new Scissors();
    RPSObject r = new Rock();
    RPSObject p = new Paper();

    RPSObject[] combos = new RPSObject[]{s,r,p};
    for(RPSObject o : combos) {
      for(RPSObject o2 : combos) {
        System.out.println(o + " vs. " + o2 + ": " + o + " " +  o.fight(o2));
      }
    }

    /* PosRational */
    MyInteger i1 = new MyInteger(1);
    PosRational p1 = new PosRational(1,2);
    System.out.println(i1.add(p1));
    System.out.println(p1.add(i1));
  }
}
