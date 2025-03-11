package zaubererUndKrieger;

public abstract class GameFactory {
	
public static GameFactory getFactory(GameType type) {
		
		if(type == GameType.SciFi) {
			return new SciFiFactory();
		} else if(type == GameType.Fantasy){
			return new FantasyFactory();
		} else {
			return null;
		}
	}
	
	public abstract Magician createMagician();
	
	public abstract Warrior createWarrior();
	
	
}
