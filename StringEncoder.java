public class StringEncoder {
    public static String encodeString(char[] arr, char[] alpha, int[] num) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                encodedString.append(arr[i - 1]).append(count);
                count = 1;
            }
        } 
        encodedString.append(arr[arr.length - 1]).append(count); 
        return encodedString.toString();
    }
    public static void main(String[] args) {
        char[] arr = new char[];
        char[] alpha = new char[];
        int[] num = new int[];
        String encodedString = encodeString(arr, alpha, num);
        System.out.println(encodedString);
    }
}
