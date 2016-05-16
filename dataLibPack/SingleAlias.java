/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataLibPack;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author 
 */
public class SingleAlias implements Serializable{
    public String actualName;
    public Vector<String> alias;
    public SingleAlias(){
        actualName = "";
        alias = new Vector<String>();
    }
}
