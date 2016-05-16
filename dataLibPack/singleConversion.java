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
public class singleConversion implements Serializable, myConstants{
    public int noOfInputTokens;
    public Vector<MyToken> inputTokens;

    public int noOfOutputTokens;
    public Vector<MyToken> outputTokens;

    public String inputString;
    public String outputString;

    public singleConversion(){
        noOfInputTokens = 0;
        noOfOutputTokens = 0;
        inputTokens = new Vector<MyToken>();
        outputTokens = new Vector<MyToken>();
        inputString = "";
        outputString = "";
    }
}