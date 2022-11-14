package application;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class queue {
	private Queue<pizza> orders;
	private ArrayList<pizza> processed;
	private ArrayList<pizza> cooked;
	public queue() {
		orders = new LinkedList<pizza>();
		processed = new ArrayList<pizza>();
		cooked = new ArrayList<pizza>();
	}
	public void add(pizza piz1) {
		orders.add(piz1);
	}
	public void processed() {
		processed.add(orders.poll());
	}
	public ArrayList<pizza> getOrders(){
		return processed;
	}
	public void cooked() {
		pizza piz1 = processed.get(0);
		processed.remove(piz1);
		cooked.add(piz1);
	}
	public String checkstatus(int id) {
		for(int i = 0; i < processed.size();i++) {
			if(processed.get(i).getID() == id) {
				return "cooking";
			}
		}
		for (int i = 0; i < cooked.size(); i++) {
			if(cooked.get(i).getID() == id) {
				return "pickup";
			}
		}
		return "processed";
	}
}
