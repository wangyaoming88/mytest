import java.util.Scanner;

public class RemoveIdenticalCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        removeIdentical(str);
    }

    private static void removeIdentical(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            int j = i + 1;
            int length = 1;
            while (j < chars.length && chars[i] == chars[j]) {
                length++;
                j++;
            }
            if (length >= 3) {
                i += length;
            } else {
                result.append(chars[i]);
                i++;
            }
        }
        String resultStr = result.toString();
        if (!str.equals(resultStr)) {
            System.out.println(resultStr);
            removeIdentical(resultStr);
        }
    }
}
