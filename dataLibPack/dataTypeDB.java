package dataLibPack;


import java.io.Serializable;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class dataTypeDB implements Serializable{
    public Vector<dataType> list;
    public dataTypeDB(){
        list = new Vector<dataType>();
    }
}
