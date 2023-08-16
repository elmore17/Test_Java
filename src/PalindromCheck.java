public class PalindromCheck {
    public static void main(String[] args){
        String string = "fffttrrrttfff";
        if (isPalindrome(string)) {
            System.out.println(string + " - это палиндром.");
        } else {
            System.out.println(string + " - это не палиндром.");
        }
    }

    private static boolean isPalindrome(String string) {
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
