public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] array, int number){
		int index = -1;
		int occurances = 0;
		for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                index = i;
				i = array.length;
            }
        }
        return index;
    }

	public static String findLast(String[] array, String string){
		int index=-1;
		int occurances = 0;
        for ( int i = array.length- 1; i>= 0; i--){
            if (array[i].equals(string)){
                return i;
            }
        }
        return -1;
    }

	public static char findSecond(char[] array, char character){
		int index = -1;
		int counter = 0;
		for (int i = 0; i < array.length; i++) 
			if (array[i] == character){
				counter++;
				if (counter == 2) {
					index = i;
				}
			}
			if (counter == 1) {
				index = -1;
			}
		
			return index;
		}
	}

