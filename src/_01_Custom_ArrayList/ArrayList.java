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
		int temp = array.length;
		T[] array2 = (T[])new Object[temp+1];
		array = array2;
		array[temp] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		int temp = array.length;
		T[] array2 = (T[])new Object[temp+1];
		if(loc == 0) {
			array2[0] = val;
			for (int i = 1; i < array2.length; i++) {
				array2[i] = array[i-1];
			}
			array = array2;
		}else if(loc != 0 && loc != array.length-1) {
			
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}