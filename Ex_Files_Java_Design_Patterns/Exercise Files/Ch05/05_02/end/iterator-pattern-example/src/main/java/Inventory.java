import java.util.Iterator;

public class Inventory implements Iterable {

  private Item[] items;

  public Inventory(Item... items) {
    this.items = items;
  }

  public Item[] getItems() {
    return items;
  }

  public Iterator iterator() {
    return null;
  }

}
