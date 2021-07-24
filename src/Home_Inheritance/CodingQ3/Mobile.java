package Home_Inheritance.CodingQ3;

/*
 * TODO 1: Provide Mobile interface with following methods
 * 		unlock(): String
 * 		call(mobileNumber: String): String
 * 		openApp(appName: String): String
 */
public interface Mobile {
    default String unlock(){
        return null;
    }

    default String call(String s){
        return s;
    }
    default String openApp(String ss){
        return ss;
    }
}
