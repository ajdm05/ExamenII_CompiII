package CodeGenerator;

import java.util.Hashtable;

/**
 * Created by josse on 3/22/2017.
 */
public  class LabelGenerator {

    static LabelGenerator instance ;

    static{
        instance = new LabelGenerator();
    }

    public static  LabelGenerator getInstance()
    {
        return  instance;
    }

    private LabelGenerator()
    {

    }

    Hashtable<String,Integer> labelCount = new Hashtable<String, Integer>();



    public String generateLabel(String labelName)
    {
        if(!labelCount.containsKey(labelName))
             labelCount.put(labelName,0);
        int count=labelCount.get(labelName) +1;
        String label = labelName+count;
        labelCount.put(labelName,count);
        return label;
    }




}
