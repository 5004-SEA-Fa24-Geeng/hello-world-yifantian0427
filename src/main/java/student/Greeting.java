package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {

    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Constructs a new Greeting object with the specified properties.
     *
     * @param localityID       the unique identifier for the locality
     * @param localityName     the name of the locality
     * @param asciiGreeting    the greeting message in plain ASCII format
     * @param unicodeGreeting  the greeting message in Unicode format, allowing special characters
     * @param formatStr        the format string used to structure or display the greeting
     */

    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    public int getLocalityID() {
        return this.localityID;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    public String getFormatStr() {
        return this.localityName.equals("China") ?
                String.format("%%s, %s!", this.unicodeGreeting) : String.format(this.formatStr, this.unicodeGreeting, "%s");
    }

    public String getFormatStr(Boolean asciiOnly) {
        if (this.localityName.equals("China")){
            String greeting = asciiOnly ? this.unicodeGreeting : this.localityName;
            return String.format("%%s, %s!", greeting);
        } else {
            return String.format(this.formatStr, asciiOnly ? this.unicodeGreeting : this.localityName, "%s");
        }
    }

    public static void main(String[] args) {

    }
}
