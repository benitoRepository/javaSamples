import javax.swing.JFrame;
//Just a starting point I like to use. Its tradition to add
//JSwing components to the Event Queue.
//let 'main' do all the heavy lifting, while Event Queue manages
//the UI and events for the frame.
//In my opinion its probably better to gather all the parts you need
//for your UI and add them to a frame in main so that you have
//references.

public class blankFrame extends JFrame implements Runnable{

	public static final int basicSq = 400;

	public blankFrame(){
		super();
		setSize(basicSq, basicSq);
	}

	public blankFrame(String n){
		super(n);
		setSize(basicSq, basicSq);
	}

	public blankFrame(int w, int h){
		super();
		setSize(w, h);
	}

	public blankFrame(String n, int w, int h){
		super(n);
		setSize(w, h);
	}

	public blankFrame(int sq){
		super();
		setSize(sq, sq);
	}

	public blankFrame(String n, int sq){
		super(n);
		setSize(sq, sq);
	}

	public void run(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
