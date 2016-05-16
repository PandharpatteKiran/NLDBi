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
public class MyToken implements Serializable{
    public String token;
    public int tokenType;
    public MyToken(){
        token = "";
        tokenType = -1;
    }
}
