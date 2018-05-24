public class Paper implements RPSObject {

  public String fight(RPSObject o) {
    return o.fightPaper(this);
  }

  public String fightRock(RPSObject o) {
    return "win";
  }

  public String fightPaper(RPSObject o) {
    return "tie";
  }

  public String fightScissors(RPSObject o) {
    return "lose";
  }

  public String toString() {
    return "Paper";
  }

}
