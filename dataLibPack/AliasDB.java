/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataLibPack;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Parth Bhatt
 */
public class AliasDB implements Serializable{
    public Vector<SingleAlias> list;
    public AliasDB(){
        list = new Vector<SingleAlias>();
    }
}
