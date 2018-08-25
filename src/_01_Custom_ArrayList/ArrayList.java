package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array = (T[])new Object[0];
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
	
		return array[loc];
	}
	
	public void add(T val) {
		//int temp = array.length;
		T[] array2 = (T[])new Object[array.length+1];
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		array = array2;
		array[array.length-1] = val;
		//System.out.println(array.length);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] array2 = (T[])new Object[array.length+1];
		for (int i = 0; i < loc; i++) {
			array2[i] = array[i];
		}
		array2[loc] = val;
		for (int i = loc+1; i < array2.length; i++) {
			array2[i] = array[i-1];
		}
		array = array2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] array2 = (T[])new Object[array.length-1];
		for (int i = 0; i < loc; i++) {
			array2[i] = array[i];
		}
		for (int i = loc+1; i < array.length; i++) {
			array2[i-1] = array[i];
		}
		array = array2;
	}
	
	public boolean contains(T val) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			} else { 
				count++;
			}
		}
		if(count == array.length) {
			return false;
		} else { 
			return true;
		}
	}
}