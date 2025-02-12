package Assignment2.refactoredsolitares;

/**
 * Subclass Star.
 */
public class Star extends HeavenlyBody {

  /**
   * Constructor.
   *
   * @param name name.
   * @param avgRadiusInKm avgradius.
   */
  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    checkAvgRadiusInKm(avgRadiusInKm);
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {

    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Invalid radius");
    }
  }

  @Override
  protected void checkName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name is cannot be empyt or null");
    }
  }

  @Override
  public String toString() {
    return (" Stars: " + getName() + ", Average radius is " + getAvgRadiusInKm() + "Km");
  }

}