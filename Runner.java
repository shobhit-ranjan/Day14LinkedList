//import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		linklist list = new linklist();
		list.insert(56);
		list.insert(30);
		list.insert(70) ;
		list.insertAtStart(21);

		list.insertAt(2, 32);

		list.deleteAt(4);
		list.show();

	}

}
