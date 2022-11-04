public class selectionSort {
    public static void main(String[] args){
        int[] elements = {1, 5, 3, 86, 256, 421, 9, 510, 51, 24, 60};
        clear();//clear
        System.out.println("Entered Values");
        for (int i = 0; i <= 10; i ++){                      //print the array
            System.out.print(elements[i]+"|");
        }
        System.out.println();                                //move cursor to next line
        for (int bottom = 0; bottom <= 9; bottom ++){
            int min= bottom;                                //assume first value is smallest
            for (int current=bottom + 1; bottom <=10; bottom ++){
                if (elements[current]<elements[min]){       // check if the smallest value is greater than the current min
                    min=current;
                }
            }
        }
    }

    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
}
