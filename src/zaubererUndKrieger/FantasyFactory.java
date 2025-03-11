package zaubererUndKrieger;

public class FantasyFactory extends GameFactory{

	@Override
	public Magician createMagician() {
		return new FantasyMagician();
	}

	@Override
	public Warrior createWarrior() {
		return new FantasyWarrior();
	}

}
