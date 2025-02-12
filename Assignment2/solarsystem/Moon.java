package Assignment2.solarsysten;

/**
 * Child class Moon.
 */
public class Moon extends HeavenlyBody {

  private double avgOrbitRadiusInKm;

  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    setAvgOrbitRadiusInKm(avgOrbitRadiusInKm);

  }

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  private void setAvgOrbitRadiusInKm(double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("invlid orbit radisu");
    } else {
      this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    }
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Invalid radius value");
    }
  }

  @Override
  protected void checkName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
  }

  @Override
  public String toString() {
    return ("Moon: " + getName() + ", Average radius is " + getAvgRadiusInKm() + "km, average orbit radius "
        + getAvgOrbitRadiusInKm() + "Km");
  }
}
