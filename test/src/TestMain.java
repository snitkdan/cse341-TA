public class TestMain {
  public static void main(String args[]) {
    RPSObject s = new Scissors();
    RPSObject r = new Rock();
    RPSObject p = new Paper();

    RPSObject[] combos = new RPSObject[]{s,r,p};
    for(RPSObject o : combos) {
      for(RPSObject o2 : combos) {
        System.out.println(o + " vs. " + o2 + ": " + o + " " +  o.fight(o2));
      }
    }

  }
}
