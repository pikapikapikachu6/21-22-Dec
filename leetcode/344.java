class Solution {
  public void reverseString(char[] s) {
      int len = s.length;
      for (int i = 0; i < len / 2; i ++) {
          char current = s[i];
          s[i] = s[len - 1 - i];
          s[len - 1 - i] = current;
      }
  }
}