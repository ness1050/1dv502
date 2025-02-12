package Assignment4;

/**
 * The class Canoe.
 * Extends the boat.
 */
public class Canoe extends Boat {

  public Canoe() {}

  /**
   * The main methods.
   *
   * @param name - Name.
   * @param typeOfBoat - Type of.
   * @param length - Length of.
   */
  public Canoe(String name, String typeOfBoat, int length) {
    super(name, typeOfBoat, length);
  }

  @Override
  String detailedToString() {
    return "\nCanoe: " + name + ", length: " + length + " meter";
  }

  @Override
  String fileToString() {
    return "\nBOAT:" + name + ":canoe:" + length;
  }
  
}