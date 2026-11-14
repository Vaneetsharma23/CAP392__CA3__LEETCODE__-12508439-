class Solution {
    public boolean isPalindrome(String s) {

      String str = s.toLowerCase();
      String clean = "";

     for (int i = 0; i < str.length(); i++) {
       char ch = str.charAt(i);

  if (Character.isLetterOrDigit(ch)) {
    clean = clean + ch;
            }
        }

  int left = 0;
  int right = clean.length() - 1;

 while (left < right) {

     if (clean.charAt(left) != clean.charAt(right)) {
     return false;
  }
     left++;
    right--;
        }

   return true;
    }    

}
