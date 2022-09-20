/*import java.util.*;
public class Delimiters
{
    public ArrayList getDelimitersList()
    {
        ArrayList <String> delimiters= new ArrayList <String>(); 
        for(String x:tokens)
        {
            if(x.equals(openDel) || x.equals(closeDel))
                delimiters.add(x);
        }
        return delimiters;
    }
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int ctr0 = 0, ctrC = 0;
        for(String d: delimiters)
        {
            if(d.equals(openDel))
                ctrO++;
            if(d.equals(closeDel))
                ctrC++;
            if(ctrC>ctrO)
                return false;
        }
        return ctrO == ctrC;
    }
*/