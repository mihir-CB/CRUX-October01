package Lec34;

import java.util.ArrayList;

public class minHeap<T extends Comparable<T>>{
	ArrayList<T> al;
	
	minHeap(){
		al=new ArrayList<>();
	}
	
	public int size() {
		return al.size();
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void display() {
		System.out.println(al);
	}
	
	public void add(T ele) {
		al.add(ele);
		upHeapify(al.size()-1);
	}

	private void upHeapify(int ci) {
		int pi = (ci-1)/2;
//		if(ci!=0 && al.get(pi)>al.get(ci)) {
		if(ci!=0 && al.get(pi).compareTo(al.get(ci))>0) {
			swap(pi,ci);
			upHeapify(pi);
		}
	}

	private void swap(int pi, int ci) {
		T temp = al.get(pi);
		al.set(pi, al.get(ci));
		al.set(ci, temp);
		
	}
	public T remove() {
		T ele = al.get(0);
		swap(0,al.size()-1);
		al.remove(al.size()-1);
		downHeapify(0);
		return ele;
	}

	private void downHeapify(int pi) {
		int li = 2*pi+1;
		int ri = 2*pi+2;
		
		int mini = pi;
		
//		if(li<al.size() && al.get(li)<al.get(mini)) {
		if(li<al.size() && al.get(mini).compareTo(al.get(li))>0) {
			mini=li;
		}
//		if(ri<al.size() && al.get(ri)<al.get(mini)) {
		if(ri<al.size() && al.get(mini).compareTo(al.get(ri))>0) {
			mini=ri;
		}
		
		if(mini!=pi) {
			swap(pi,mini);
			downHeapify(mini);
		}
	}
}
