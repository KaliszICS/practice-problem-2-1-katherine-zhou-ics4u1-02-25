public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] array, int number){
		
		for (int i = 0; i<array.length; i++){
			if (array[i] == number){
				return i;
			}
		}
		return -1;
	}
	public static int findLast(String[] array, String string){
		int index =-1;
		for (int i =0; i < array.length; i++){
			if (array[i].equals(string)){
				index =i;
			}
		}
		return index;
	}
	public static int findSecond(char[] array, char character){
		int occurence =0;
		int index =-1;
		for (int i =0; i<array.length; i++){
			if (array[i]== character){
				index=i;
				occurence++;
				if (occurence ==2){
					return index;
				}
			}
		}
		return index;
	}
	}

