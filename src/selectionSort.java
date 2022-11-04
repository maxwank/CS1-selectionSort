public class selectionSort {
    public static void main(String[] args) {
        int[] elements = {1, 5, 3, 86, 256, 421, 9, 510, 51, 24, 60};
        clear();//clear
        System.out.println("Initial Placement");
        for (int i = 0; i <= 10; i++) {                      //print the array
            System.out.print(elements[i] + "|");
        }
        System.out.println();                                //move cursor to next line
        for (int bottom = 0; bottom <= 9; bottom ++) {
            int min = bottom;                                //assume first value is smallest
            for (int current = bottom + 1; current <= 10; current ++) {
                if (elements[current] < elements[min]) {       // check if the smallest value is greater than the current min
                    min = current;
                }
            }
            //swap function
            int temp = elements[min];
            elements[min] = elements[bottom];
            elements[bottom] = temp;
        }
        System.out.println("Final Placement");
        for (int i = 0; i <= 10; i++) {                      //print the array
            System.out.print(elements[i] + "|");
        }
    }

    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
}
