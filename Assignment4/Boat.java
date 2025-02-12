package Assignment4;

/**
 * Abstract Class Boat.
 */
public abstract class Boat {
  String name;
  String typeOfBoat;
  int length;

  public Boat() {}

  /**
   * The main methods.
   *
   * @param name  Name.
   * @param typeOfBoat The type of.
   * @param length Length.
   */
  public Boat(String name, String typeOfBoat, int length) {
    this.name = name;
    this.typeOfBoat = typeOfBoat;
    this.length = length;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTypeOfBoat() {
    return this.typeOfBoat;
  }

  public void setTypeOfBoat(String typeOfBoat) {
    this.typeOfBoat = typeOfBoat;
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  // For console view
  abstract String detailedToString();

  // For Registry-filen
  abstract String fileToString();
  
}