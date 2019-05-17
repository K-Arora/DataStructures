package InhertianceOutput;

public class PredictOutput {

  GFG obj = new GeeksforGeeks();
//    obj.getValue();
// because
}

class GFG
{
  protected void getData()
  {
    System.out.println("Inside GFG");
  }
}

class GeeksforGeeks extends GFG
{
  protected void getData()
  {
    System.out.println("Inside GeeksforGeeks");
  }

  protected void getValue()
  {
    System.out.println("GeeksforGeeks");
  }
}
