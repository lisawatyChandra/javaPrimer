class While {
  public static void main(String[] args) {
    int outerCounter = 0;
    int innerCounter = 0;

    while (outerCounter < 5) {
      System.out.println(outerCounter);
      outerCounter++;
      innerCounter = 0;
      while (innerCounter < 7) {
        System.out.println("\t" + innerCounter);
        innerCounter++;
      }
    }

    int i = 0;
    int[] innerArray = {1, 2, 3, 4, 5};

    while (i < 7) {
      System.out.println();

      for (int number : innerArray) {
        System.out.print(number * i + " ");
      }

      i++;
    }
  }
}