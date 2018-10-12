/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author edmae
 */

public class Logs {

    private static Bdd mBdd;
    private static Calendar mCalendar = new GregorianCalendar();
    
    public Logs(){
        mBdd = new Bdd();
    }
    
    public static void setLogMessage(String module, String msg){
        String date = mCalendar.get(Calendar.DAY_OF_MONTH)+"/"+mCalendar.get(Calendar.MONTH)+"/"+mCalendar.get(Calendar.YEAR);
        String heure = mCalendar.get(Calendar.HOUR)+":"+mCalendar.get(Calendar.MINUTE);
        String[] columns = {"DATE", "HOUR", "INFORMATION"};
        String[] values = {date, heure, module + ": " + msg};
        mBdd.queryInsert("logs", columns, values);
    }
}
