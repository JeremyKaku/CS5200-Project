package game.model;

public class CharacterAttributeId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int attributeId;
	private int characterId;

	public CharacterAttributeId() {
	}

	public CharacterAttributeId(int attributeId, int characterId) {
		this.attributeId = attributeId;
		this.characterId = characterId;
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public int getCharacterId() {
		return this.characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CharacterAttributeId))
			return false;
		CharacterAttributeId castOther = (CharacterAttributeId) other;

		return (this.getAttributeId() == castOther.getAttributeId())
				&& (this.getCharacterId() == castOther.getCharacterId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAttributeId();
		result = 37 * result + this.getCharacterId();
		return result;
	}

}
