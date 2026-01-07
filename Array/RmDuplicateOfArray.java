public class RmDuplicateOfArray {
    public static void main(String[] args) {

        int[] arr = {2, 34, 1, 2, 67, 34, 5};

        System.out.println("Unique elements:");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
			
        }
    }
}
