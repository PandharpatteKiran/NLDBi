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
public class dataType implements Serializable{
    public Vector<String> dataDescription;
    public String datatype;
    public dataType(){
        dataDescription = new Vector<String>();
        datatype = "";
    }
}
