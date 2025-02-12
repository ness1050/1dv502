package Assignment2.solarsysten;

/**
 * Abstract Class.
 */
public abstract class HeavenlyBody implements Comparable<HeavenlyBody> {

  private String name;
  private int avgRadiusInKm;

  protected HeavenlyBody(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    checkName(name);
    this.name = name;
  }

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  private void setAvgRadiusInKm(int avgRadiusInKm) {
    checkAvgRadiusInKm(avgRadiusInKm);
    this.avgRadiusInKm = avgRadiusInKm;
  }

  protected abstract void checkAvgRadiusInKm(int avgRadiusInKm) throws IllegalArgumentException;

  protected abstract void checkName(String name) throws IllegalArgumentException;

  @Override
  public String toString() {
    return ("Name" + name + ", Average radius is " + avgRadiusInKm + "Km");
  }

  @Override
  public int compareTo(HeavenlyBody heavenlyBody) {
    if (avgRadiusInKm < heavenlyBody.avgRadiusInKm) {
      return -1;
    } else if (avgRadiusInKm > heavenlyBody.avgRadiusInKm) {
      return 1;
    } else {
      return 0;
    }
  }
}
