/*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      SpriteSessionRemote
 */

package cst8218.guze0002.game;
import cst8218.guze0002.entity.Sprite;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author tgk
 */
@Remote
public interface SpriteSessionRemote {
    	List<Sprite> getSpriteList() throws RemoteException;
	void newSprite(MouseEvent e) throws RemoteException;
	int getHeight() throws RemoteException;
	int getWidth() throws RemoteException;
}
