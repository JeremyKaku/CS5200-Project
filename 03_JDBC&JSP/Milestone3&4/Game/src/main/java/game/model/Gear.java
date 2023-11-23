package game.model;

import java.util.HashSet;
import java.util.Set;

public class Gear extends Item implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int itemId;
	private GearSlot gearSlot;
	private Item item;
	private int itemLevel;
	private int requiredLevel;
	private int defenseRating;
	private int magicDefenseRating;
	private Set<?> gearBonuses = new HashSet<Object>(0);
	private Set<?> characterEquippeds = new HashSet<Object>(0);
	private Set<?> jobs = new HashSet<Object>(0);
	private CustomizedGear customizedGear;

	public Gear() {
	}

	public Gear(GearSlot gearSlot, Item item, int itemLevel, int requiredLevel, int defenseRating,
			int magicDefenseRating) {
		this.gearSlot = gearSlot;
		this.item = item;
		this.itemLevel = itemLevel;
		this.requiredLevel = requiredLevel;
		this.defenseRating = defenseRating;
		this.magicDefenseRating = magicDefenseRating;
	}

	public Gear(GearSlot gearSlot, Item item, int itemLevel, int requiredLevel, int defenseRating,
			int magicDefenseRating, Set<?> gearBonuses, Set<?> characterEquippeds, Set<?> jobs,
			CustomizedGear customizedGear) {
		this.gearSlot = gearSlot;
		this.item = item;
		this.itemLevel = itemLevel;
		this.requiredLevel = requiredLevel;
		this.defenseRating = defenseRating;
		this.magicDefenseRating = magicDefenseRating;
		this.gearBonuses = gearBonuses;
		this.characterEquippeds = characterEquippeds;
		this.jobs = jobs;
		this.customizedGear = customizedGear;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public GearSlot getGearSlot() {
		return this.gearSlot;
	}

	public void setGearSlot(GearSlot gearSlot) {
		this.gearSlot = gearSlot;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getItemLevel() {
		return this.itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public int getRequiredLevel() {
		return this.requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public int getDefenseRating() {
		return this.defenseRating;
	}

	public void setDefenseRating(int defenseRating) {
		this.defenseRating = defenseRating;
	}

	public int getMagicDefenseRating() {
		return this.magicDefenseRating;
	}

	public void setMagicDefenseRating(int magicDefenseRating) {
		this.magicDefenseRating = magicDefenseRating;
	}

	public Set<?> getGearBonuses() {
		return this.gearBonuses;
	}

	public void setGearBonuses(Set<?> gearBonuses) {
		this.gearBonuses = gearBonuses;
	}

	public Set<?> getCharacterEquippeds() {
		return this.characterEquippeds;
	}

	public void setCharacterEquippeds(Set<?> characterEquippeds) {
		this.characterEquippeds = characterEquippeds;
	}

	public Set<?> getJobs() {
		return this.jobs;
	}

	public void setJobs(Set<?> jobs) {
		this.jobs = jobs;
	}

	public CustomizedGear getCustomizedGear() {
		return this.customizedGear;
	}

	public void setCustomizedGear(CustomizedGear customizedGear) {
		this.customizedGear = customizedGear;
	}

}
