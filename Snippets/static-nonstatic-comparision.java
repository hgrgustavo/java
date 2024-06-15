// Regular (non-static) method
public class Song {
  String title;
  // Defining constructor
  public Song(String t) {
    title = t;
  }
  public void play(){
    SoundPlayer player = new SoundPlayer();
    player.playSound(title);
  }
  
  // static method
  public static int min(int a, int b) {
    // returns the lesser of a and b
  }
  
  // Calling a non-static method with a reference variable
  Song t2 = new Song();
  t2.play();
  
  // Calling a static method
  Math.min(88, 86);
    
