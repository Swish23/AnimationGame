
import javax.swing.*;
import java.awt.Dimension;
public class SizedPanel extends JPanel {

	int preferredWidth=400;
	int preferredHeight=300;
	
	public  SizedPanel(int w, int h){
		preferredWidth=w;
		preferredHeight=h;
		}
	
	public SizedPanel() {};
	
	@Override public Dimension getPreferredSize() {
		return new Dimension(preferredWidth,preferredHeight);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowInFrame.show(new SizedPanel());
	}

}