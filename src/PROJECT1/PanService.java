package PROJECT1;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap=new HashMap<>();
    static {
        panMap.put("ABCD123",new Pan("429960010735","ABCD123","FD,DODGE,IB","SBI"));
        panMap.put("ABCD125",new Pan("429960010737","ABCD125","FD,DODGE","HDFC"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for(Pan pan: panMap.values()){
            if(pan.getAadhaarNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
