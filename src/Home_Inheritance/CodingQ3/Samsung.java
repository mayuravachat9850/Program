package Home_Inheritance.CodingQ3;

/*
 * TODO 2: Implement Mobile interface and provide implementation to the Mobile
 * interface methods such that they return the following output. (without double quotes).
 * 		unlock(): String => "Samsung: Unlocked"
 * 		call(mobileNumber: String): String => "Samsung: calling <mobileNumber>"
 * 		openApp(appName: String): String => "Samsung: opening <appName>"
 *
 * 		For example:
 * 		Samsung: Unlocked
 * 		Samsung: calling 1234567890
 * 		Samsung: opening Gallery
 */
public class Samsung implements Mobile{

    @Override
    public String unlock() {
        return "Samsung: Unlocked";
    }
    @Override
    public String call(String s) {
        return "Samsung: calling "+s;
    }

    @Override
    public String openApp(String ss) {
        return "Samsung: opening "+ss;
    }
}
