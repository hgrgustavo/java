class TraditionalSwitch {
  public static void main(String[] args) {
    int priorityLevel;
    int eventCode = 6010;
    
    // Traditional switch that supplies a value associated with a case
    switch(eventCode) {
      case 1000:    // Case stacking
      case 1205:
      case 8900:
        priorityLevel = 1;
        break;
      case 2000:
      case 6010:
      case 9128:
        priorityLevel = 2;
        break;
      case 1002:
      case 7023:
      case 9300:
        priorityLevel = 3;
        break;
      default:    // Normal priority
        priorityLevel = 0;
    }
    System.out.print("Priority level for event code " + eventCode + " is " + priorityLevel);
  }
}
    // Switch with case list
    switch(eventCode) {
      case 1000, 1205, 8900:
        priorityLevel = 1;
        break;
      case 2000, 6010, 9128:
        priorityLevel = 2;
        break;
      case 1002, 7023, 9300:
        priorityLevel = 3;
        break;
      default:    // Normal priority === return " ";
        priorityLevel = 0;
    }
    
    int x = switch(y) { // ...
    
    // Converting previous switch statement to switch EXPRESSION
    public static void main(String[] args) {
      int priorityLevel = switch(eventCode) {
        case 1000, 1205, 8900:
          yield 1;
        case 2000, 6010, 9128:
          yield 2;
        case 1002, 7023, 9300:
          yield 3;
        default:  // Normal priority
          yield 0;
      }
      System.out.print("Priority level for event code" + eventCode + " is " + priorityLevel);
    }
  }
      

