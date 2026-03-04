public class Car implements Engine , Media , Brake {

  @Override
  public void play() {
    System.out.println("Play The Media");
  }

  @Override
  public void pause() {
    System.out.println("Pause The Media");
  }

  @Override
  public void start() {
    System.out.println("Start The Engine");
  }

  @Override
  public void stop() {
    System.out.println("Stop The Engine");
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerate The Car");
  }

  @Override
  public void brake() {
    System.out.println("Apply The Brakes ");
  }



  
  
}
