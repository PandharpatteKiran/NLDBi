/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataLibPack;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class MyVariable implements Serializable{
    public String variableName;
    public String formatSpecifier;
    public MyVariable(){
        variableName = "";
        formatSpecifier = "";
    }
}
