import java.util.Arrays;

class TwoDArray {
  public static void main(String[] args) {
    char[][] letterBlock = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}};

    int i = 0;
    while (i < letterBlock.length) {
      System.out.println(Arrays.toString(letterBlock[i]) + "\n");
      i++;
    }

    for (int a = 0; a < letterBlock.length; a++) {
      for (int b = 0; b < letterBlock[0].length; b++) {
        System.out.print("Accessed: " + letterBlock[a][b] + "\t");
      }
      System.out.println();
    }
  }
}