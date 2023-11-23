package game.model;

public class CharacterEquipped implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private CharacterEquippedId id;
	private GameCharacter gameCharacter;
	private Gear gear;
	private GearSlot gearSlot;

	public CharacterEquipped() {
	}

	public CharacterEquipped(CharacterEquippedId id, GameCharacter gameCharacter, Gear gear, GearSlot gearSlot) {
		this.id = id;
		this.gameCharacter = gameCharacter;
		this.gear = gear;
		this.gearSlot = gearSlot;
	}

	public CharacterEquippedId getId() {
		return this.id;
	}

	public void setId(CharacterEquippedId id) {
		this.id = id;
	}

	public GameCharacter getGameCharacter() {
		return this.gameCharacter;
	}

	public void setGameCharacter(GameCharacter gameCharacter) {
		this.gameCharacter = gameCharacter;
	}

	public Gear getGear() {
		return this.gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}

	public GearSlot getGearSlot() {
		return this.gearSlot;
	}

	public void setGearSlot(GearSlot gearSlot) {
		this.gearSlot = gearSlot;
	}

}
