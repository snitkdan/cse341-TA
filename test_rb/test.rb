class RPSObject
end

class Rock < RPSObject

  def fight other
    other.fightRock
  end

  def fightRock
    "tie"
  end

  def fightPaper
    "win"
  end

  def fightScissors
    "lose"
  end

  def to_s
    "Rock"
  end

end

class Paper < RPSObject

  def fight other
    other.fightPaper
  end

  def fightRock
    "lose"
  end

  def fightPaper
    "tie"
  end

  def fightScissors
    "win"
  end

  def to_s
    "Paper"
  end
  
end

class Scissors < RPSObject
 def fight other
    other.fightScissors
  end

  def fightRock
    "win"
  end

  def fightPaper
    "lose"
  end

  def fightScissors
    "tie"
  end

  def to_s
    "Scissors"
  end
end

a = [Rock.new, Paper.new, Scissors.new]
a.combination(2).to_a.each { |a,b| puts (a.fight b) }
