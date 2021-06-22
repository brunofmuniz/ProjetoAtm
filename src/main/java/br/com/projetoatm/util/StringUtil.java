/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoatm.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Bruno Muniz
 */
public class StringUtil {
    public static String doubleToString(Double value){
        
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        otherSymbols.setDecimalSeparator('.'); 
        DecimalFormat df = new DecimalFormat("0.00",otherSymbols);
        return df.format(value).replace(".",",");
        
    }
}
