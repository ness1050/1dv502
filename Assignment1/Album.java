package 1DV502;


/**
 * Here is the class album.
 */
public class Album {
  /**
   * String name, artist and integer Year.
   */
  private String name;
  private String artist;
  private int year;

  /**
   * Constructor.
   *
   * @param name String name
   * @param artist String artist
   * @param year  integer year
   */
  public Album(String name, int year, String artist) {
    setName(name);
    setYear(year);
    setArtist(artist);
  }
    
  /**
   * Method to returns name.
   * Checks the length.
   */
  public String getName() {
    if (name == null || name.length() < 4) {
      this.name = "No name";
    }
    return name;
  }

  /**
   * returns Artist.
   * checks if artist is null or not.
   */
  public String getArtist() {
    if (artist == null) {
      this.artist = "No artist";
    }
    return artist;
  }

  /**
   * returns Year.
   * checks the conditions for given year.
   */
  public int getYear() {
    if (year < 1800 || year > 2030) {
      this.year = -1;
    }
    return year;
  }


  /**
   * Setter method for name.
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * setter method.
   */
  public void setArtist(String artist) {
    this.artist = artist;
  }

  /**
   * Year setter method.
   */
  public void setYear(int year) {
    this.year = year;
  }
}
