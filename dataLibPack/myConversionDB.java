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
public class myConversionDB implements Serializable{
    public Vector<singleConversion> list;
    public myConversionDB(){
        list = new Vector<singleConversion>();
    }
}
