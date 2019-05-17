package sudopl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
  int data;
  Node next;
}

public class ReverseLL {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(23);
    Map<Integer, Integer> map = new HashMap<>();
    map.put(12, 12);
  }

  boolean hasCycle(Node head) {

    List<Integer> list = new ArrayList<>();

    while (head != null) {

      if (!list.contains(head.data)) {
        list.add(head.data);
      } else {
        return true;
      }

      head = head.next;
    }
    return false;
  }

}
