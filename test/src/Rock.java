public class Rock implements RPSObject {

  public String fight(RPSObject o) {
    return o.fightRock(this);
  }

  public String fightRock(RPSObject o) {
    return "tie";
  }

  public String fightPaper(RPSObject o) {
    return "win";
  }

  public String fightScissors(RPSObject o) {
    return "lose";
  }

  public String toString() {
    return "Rock";
  }

}
