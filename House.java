import java.util.ArrayList;
public class House extends Building {

  private ArrayList < String > residents;
  private boolean hasDiningRoom;

  /**
   * Creates instance of House class
   * @param diningRoom
   * @param name
   * @param address
   * @param nFloors
   */
  public House(boolean diningRoom, String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    residents = new ArrayList < String > ();
    this.hasDiningRoom = diningRoom;

  }

  /**
   * Checks if the house has a dining room 
   * @return boolean
   */
  public boolean hasDiningRoom() {
    if (hasDiningRoom) {
      return true;
    } else
      return false;
  }

  /**
   * 
   * @return number of residents that live in the home
   */
  public int nResidents() {
    return residents.size();
  }

  /**
   * Adds a person to the list of residents for the house
   * @param name
   */
  public void moveIn(String name) {
    if (!residents.contains(name)) {
      residents.add(name);
      System.out.println(name + " is now a resident.");
    } else {
      System.out.println("Already a resident");
    }
  }

  /**
   * Removes a person from the list of resident 
   * @param name
   */
  public void moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(name);
      System.out.println(name + " has moved out.");
    } else {
      System.out.println("No such resident lives here");
    }
  }

  /**
   * Checks if a person lives in the house
   * @param person
   * @return boolean
   */
  public boolean isResident(String person) {
    if (residents.contains(person)) {
      return true;
    } else
      return false;

  }
  public static void main(String[] args) {
    House myHouse = new House(true, "Leah's house", "1234", 2);
    myHouse.moveIn("Leah");
    myHouse.moveIn("Mom");
    myHouse.moveIn("Leah");
    myHouse.moveOut("Leah");

  }

}