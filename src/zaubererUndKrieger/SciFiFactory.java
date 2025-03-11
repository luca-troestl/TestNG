package zaubererUndKrieger;

public class SciFiFactory extends GameFactory{

	@Override
	public Magician createMagician() {
		return new SciFiMagician();
	}

	@Override
	public Warrior createWarrior() {
		return new SciFiWarrior();
	}

}
