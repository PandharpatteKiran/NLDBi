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
public class MainDB implements Serializable{
    public dataTypeDB dtdb;
    public myConversionDB condb;
    public AliasDB aliasDb;
    public MainDB(){
        dtdb = new dataTypeDB();
        condb = new myConversionDB();
        aliasDb = new AliasDB();
    }

}
