public class MethodTesting {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getArrayContents(scaleMutator.extraCredit(list)));
    }
    public static String getArrayContents(int[] array) {
        // Add a space when its needed only
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
