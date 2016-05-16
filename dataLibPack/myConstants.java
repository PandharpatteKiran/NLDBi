package dataLibPack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public interface myConstants {
    final int DataType_UNIVERSAL = 0;
    final int DataType_INT = 1;
    final int DataType_FLOAT = 2;
    final int DataType_DOUBLE = 3;
    final int DataType_CHAR = 4;
    final int DataType_STRING = 5;

    final int TokenTypes_COMMAND = 0;
    final int TokenTypes_VARIABLE = 1;
    final int TokenTypes_DIRECT_REPLACEMENT = 2;
    final int TokenTypes_LITERAL = 3;
    final int TokenTypes_FORMAT_SPECIFIER = 4;


    final String[] DT_NAMES = {"UNIVERSAL","INT","FLOAT","DOUBLE","CHAR","STRING"};
    final String[] TT_NAMES = {"COMMAND","VARIABLE","DIRECT_REPLACEMENT","LITERAL","FORMAT_SPECIFIER"};
    
}
