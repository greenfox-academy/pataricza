package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  private List<Sharpie> sharpieSet;

  public SharpieSet () {
    sharpieSet = new ArrayList<>();
  }

  public void addSharpie (Sharpie sharpie) {
    sharpieSet.add(sharpie);
  }

  public List<Sharpie> getSharpieSet() {
    return sharpieSet;
  }

  public void countUsable () {
    int usableCounter = 0;
    for (int i = 0; i < getSharpieSet().size(); i++) {
      if (getSharpieSet().get(i).getInkAmount() != 0) {
        usableCounter++;
      }
    }
    System.out.println(usableCounter);
  }

  public void removeTrash () {
    for (int i = getSharpieSet().size(); i > 0 ; i--) {
      if (getSharpieSet().get(i-1).getInkAmount() == 0) {
        getSharpieSet().remove(i-1);
      }
    }
  }

}
