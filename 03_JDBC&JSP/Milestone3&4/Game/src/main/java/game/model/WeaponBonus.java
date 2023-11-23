package game.model;

public class WeaponBonus implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private WeaponBonusId id;
	private Attribute attribute;
	private Weapon weapon;
	private int bonusValue;

	public WeaponBonus() {
	}

	public WeaponBonus(WeaponBonusId id, Attribute attribute, Weapon weapon, int bonusValue) {
		this.id = id;
		this.attribute = attribute;
		this.weapon = weapon;
		this.bonusValue = bonusValue;
	}

	public WeaponBonusId getId() {
		return this.id;
	}

	public void setId(WeaponBonusId id) {
		this.id = id;
	}

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getBonusValue() {
		return this.bonusValue;
	}

	public void setBonusValue(int bonusValue) {
		this.bonusValue = bonusValue;
	}

}
