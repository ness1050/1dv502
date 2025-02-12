
/**
 * Time Class.
 */
public class Time {
  
  /**
   * Turns hours to seconds, minutes to second.
   * returns total.
   */
  public int toSeconds(int hours, int minutes, int seconds) {
    return (hours * 3600 + minutes * 60 + seconds);
  }
}
