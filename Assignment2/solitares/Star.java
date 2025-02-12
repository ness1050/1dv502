package Assignment2.solitares;

/**
 * Class Star.
 */
public class Star {

  private String name;
  private int avgRadiusInKm;

  /**
   * Constructor.
   *
   * @param name name.
   * @param avgRadiusInKm avgRadius.
   */
  public Star(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  public String getName() {
    return this.name;
  }

  private void setName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    this.name = name;
  }

  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Radius is not valid number");
    } else {
      this.avgRadiusInKm = avgRadiusInKm;
    }
  }

  @Override
  public String toString() {
    return ("Star: " + name + ", Average radius " + avgRadiusInKm + "Km");
  }

}
