private static int countMatches(final String str, final char ch) {
    if (str == null || str.length() == 0) {
         return 0;
    }
    int count = 0;
    // We could also call str.toCharArray() for faster look ups but that
    // would generate more garbage.
    for (int i = 0; i < str.length(); i++) {
         if (ch == str.charAt(i)) {
              count++;
         }
    }
    return count;
}