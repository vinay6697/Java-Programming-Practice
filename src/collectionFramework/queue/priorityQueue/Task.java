package collectionFramework.queue.priorityQueue;

public class Task {
	String name;
	int priority;
	
	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public int getPriority() {
		return priority;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return priority+" "+name;
	}
	
}
