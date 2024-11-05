import java.util.Hashtable;
public class Library extends Building {

  private Hashtable < String, Boolean > collection;
  /**
   * Creates instance of Library class
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
    collection = new Hashtable < String, Boolean > ();
  }

  /**
 * Adds a book to the Library
 * @param title
 */
  public void addTitle(String title) {
    if (!collection.containsKey(title)) {
      collection.put(title, true);
      System.out.println(title + " has been added.");
    } else
      System.out.println(title + " is already in collection");
  }

  /**
   * Removes a book from the Library
   * @param title
   * @return String stating if the book was removed or not 
   */
  public String removeTitle(String title) {
    if (collection.containsKey(title)) {
      collection.remove(title);
      return title + " has been removed.";
    } else
      return title + " is not found in collection";

  }

  /**
   * Checks out book from library database
   * @param title
   */
  public void checkOut(String title) {
    if (collection.containsKey(title) && collection.get(title)) {
      collection.replace(title, false);
      System.out.println(title + " successfully checked out.");
    } else
      System.out.println(title + " has already been check out.");
  }

  /**
   *  Returns book back into database 
   * @param title
   */
  public void returnBook(String title) {
    if (collection.containsKey(title) && collection.containsValue(false)) {
      collection.replace(title, true);
      System.out.println(title + " successfully returned.");
    } else
      System.out.println(title + " has already been returned.");

  }

  /**
   * Checks if a book is in the Library
   * @param title
   * @return boolean 
   */
  public boolean containsTitle(String title) {
    if (collection.containsKey(title)) {
      return true;
    } else
      return false;
  }

  /**
   * Checks if book is availble to check out 
   * @param title
   * @return boolean
   */
  public boolean isAvailable(String title) {
    if (collection.containsValue(true)) {
      return true;
    } else
      return false;
  }

  /**
   * Prints out each book and if it is checked out or not 
   */
  public void printCollection() {
    for (String key: collection.keySet()) {
      System.out.println(key + " : " + collection.get(key));
    }
  }

  public static void main(String[] args) {
    Library neilson = new Library("Neilson", "1234", 5);
    neilson.addTitle("test");
    neilson.addTitle("testOne");
    neilson.addTitle("testTwo");
    neilson.checkOut("test");
    neilson.checkOut("test");
    neilson.printCollection();

  }

}