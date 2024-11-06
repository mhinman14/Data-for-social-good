import java.util.Scanner;


// Manages data about different social media apps
public class UserStory {

  public String [] appName;  //1D array containing the app names
  public int [] numMinutes;  //1D array containing the number of minutes spent on each app
  public int [] numLikes;  //1D array containing the number of likes spent on each app
  public int [] numFollows;  //1D array containing the number of follows spent on each app

  
 public UserStory(String appNameFile, String numMinutesFile, String numLikesFile, String numFollowsFile) {
    appName = FileReader.toStringArray(appNameFile);
    numMinutes = FileReader.toIntArray(numMinutesFile);
    numLikes = FileReader.toIntArray(numLikesFile);
    numFollows = FileReader.toIntArray(numFollowsFile);
  }

public UserStory() {
  //initializes empty arrays
    this.appName = new String[0];
    this.numMinutes = new int[0];
    this.numLikes = new int[0];
    this.numFollows = new int[0];
}


  // finds the greatest number of minutes out of all of them
  public int findNumMinutes() {
    int max = 0;
    for (int minutes : numMinutes) {
      if (minutes > max) {
        max = minutes;
      }
    }
    return max;
  }

  // finds the greatest number of likes out of all of them
  public int findNumLikes() {
    int max = 0;
    for(int likes : numLikes) {
      if(likes > max) {
        max = likes;
      }
    }
    return max;
  }

// finds the greatest number of follows out of all of them
   public int findNumFollows() {
    int max = 0;
    for(int follows : numFollows) {
      if(follows > max) {
        max = follows;
      }
    }
    return max;
  }

// String method that returns the information from user story
  public String toString() {
    if (appName.length == 0) {
        return "No data available.";

    }
    return "App Name: " + appName[0] + "\n" +
           "Number of Minutes: " + findNumMinutes() + "\n" +
           "Number of Likes: " + findNumLikes() + "\n" +
           "Number of Follows: " + findNumFollows();
}

 
    






  
}