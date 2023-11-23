package game.model;

public class Inventory implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private InventoryId id;
	private GameCharacter gameCharacter;
	private Item item;
	private int quantity;

	public Inventory() {
	}

	public Inventory(InventoryId id, GameCharacter gameCharacter, Item item, int quantity) {
		this.id = id;
		this.gameCharacter = gameCharacter;
		this.item = item;
		this.quantity = quantity;
	}

	public InventoryId getId() {
		return this.id;
	}

	public void setId(InventoryId id) {
		this.id = id;
	}

	public GameCharacter getGameCharacter() {
		return this.gameCharacter;
	}

	public void setGameCharacter(GameCharacter gameCharacter) {
		this.gameCharacter = gameCharacter;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
