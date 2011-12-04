//---------------------------------------------------------
// $Id$ 
// 
// (c) 2011 Cellent Finance Solutions AG 
//          Calwer Strasse 33 
//          70173 Stuttgart 
//          www.cellent-fs.de 
//--------------------------------------------------------- 
package org.remast.swing;

import javax.swing.ImageIcon;

import org.jdesktop.swingx.JXTextField;
import org.jdesktop.swingx.prompt.BuddyButton;
import org.jdesktop.swingx.prompt.BuddySupport;

/**
 * @author Jan
 *
 */
public class JSearchField extends JXTextField {
	
	public JSearchField() {
		setPrompt("Search");
		setBorder(null);

		BuddyButton b = new BuddyButton();
		b.setIcon(new ImageIcon(getClass().getResource("/icons/Start-Menu-Search-icon.png")));
		BuddySupport.addGap(5, BuddySupport.Position.LEFT, this);
		BuddySupport.addLeft(b, this);
		BuddySupport.addGap(5, BuddySupport.Position.LEFT, this);
	}

}
