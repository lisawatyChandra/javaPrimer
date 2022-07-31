class LoopPractice {
  public static void main(String[] args) {
    char[][] charData = {{'a', 'b', 'c', 'd', 'e', 'f'}, {'g', 'h', 'i', 'j', 'k', 'l'}};

    for (char[] charRow : charData) {
      for (char c : charRow) {
        System.out.print(c + " ");
      }
      System.out.println();
    }

    String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

    int characterCount = 0;
    for (String[] words : wordData) {
      for (String word : words) {
        characterCount += 1;
      }
    }

    System.out.println(characterCount);

    int row = 0;
    int column = 0;
    while (row < wordData.length) {
      column = 0;
      while (column < wordData[0].length) {
        System.out.println(wordData[row][column] + ": [" + row + "]" + "[" + column + "]");
        column++;
      }
      row++;
    }
  }
}