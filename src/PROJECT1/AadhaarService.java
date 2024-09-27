package PROJECT1;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("429960010735",new Aadhaar("429960010735","Kalal sri datthu goud","ankilla","govardhan"));
        aadhaarMap.put("429960010737",new Aadhaar("429960010737","Kalal sri goud","mahabubnagar","gopi"));

    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
}
