package Assignment4;

import java.util.ArrayList;

/**
 * The class Member.
 */
public class Member {
  String name;
  String email;
  String userId;
  private ArrayList<Boat> boats = new ArrayList<>();
 

  public Member() {}

  /**
   * The constructor.
   *
   * @param name Name of member.
   * @param email Email of member.
   * @param userId Id of member.
   */
  public Member(String name, String email, String userId) {
    this.name = name;
    this.email = email;
    this.userId = userId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addBoat(Boat addBoat) {
    boats.add(addBoat);
  }

  /**
   * iterates through the content of arrayList and deletes boat.
   */
  public void deleteBoat(String boatName) {
    for (Boat boat : boats) {
      if (boat.getName().equals(boatName)) {
        boats.remove(boat);
        return;
      }
    }
  }

  /**
   * Copys the content of arrayList and returns it.
   *
   * @return Returns a string with boats.
   */
  public String getBoats() {
    if (boats.size() > 0) {
      String str = "";
      for (Boat boat : boats) {
        str += boat.detailedToString();
      }
      return str;
    } else {
      return "\"Member has no boats.\"";
    }
  }

  /**
  * Copys the content of arrayList and returns it.
  *
  * @return Returns a string with boats.
  */
  public String getBoatsToString() {
    String str = "";
    for (Boat boat : boats) {
      str += boat.fileToString();
    }
    return str;
  }

  /**
   * Getting a specific boat info.
   *
   * @param boatName The Boat name.
   * @return returns a string.
   */
  public String getSpecificBoatInfo(String boatName) {
    String str = "";
    for (Boat boat : boats) {
      if (boat.getName().equals(boatName)) {
        str = boat.fileToString();
      }
    }
    return str;
  }

  String listMemberToString() {
    return "\nMEMBER:" + name + ":" + email + ":" + userId;
  }

  String listMemberToConsole() {
    return "Name: " + name + ", Email: " + email + ", UserId: " + userId;
  }

}