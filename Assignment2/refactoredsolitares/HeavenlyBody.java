package Assignment2.refactoredsolitares;

/**
 * Abstract Class.
 */
public abstract class HeavenlyBody {
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

  /*
   * protected void checkAvgRadiusInKm(double avgRadiusInKm) throws Exception {
   * if(avgRadiusInKm < 0) {
   * throw new Exception("Invaild value of radius");
   * }
   * }
   */

  protected abstract void checkAvgRadiusInKm(int avgRadiusInKm) throws IllegalArgumentException;

  protected abstract void checkName(String name) throws IllegalArgumentException;

  @Override
  public String toString() {
    return ("Name: " + name + ", Average redius is " + avgRadiusInKm + "km");
  }

}
