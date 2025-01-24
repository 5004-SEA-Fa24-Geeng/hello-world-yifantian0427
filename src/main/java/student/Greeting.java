package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {

    /**
     * The unique identifier for the locality.
     */
    private int localityID;

    /**
     * The name of the locality.
     */
    private String localityName;

    /**
     * The greeting message in plain ASCII format.
     */
    private String asciiGreeting;

    /**
     * The greeting message in Unicode format, allowing special characters.
     */
    private String unicodeGreeting;

    /**
     * The format string used to structure or display the greeting.
     */
    private String formatStr;

    /**
     * Constructs a new Greeting object with the specified locality ID and name.
     * The ASCII greeting defaults to "Hello".
     *
     * @param localityID   the unique identifier for the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Constructs a new Greeting object with the specified locality ID, name,
     * and greeting. Both ASCII and Unicode greetings default to the given greeting.
     *
     * @param localityID   the unique identifier for the locality
     * @param localityName the name of the locality
     * @param greeting     the greeting message (used for both ASCII and Unicode)
     */
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

    /**
     * Gets the unique identifier for the locality.
     *
     * @return the locality ID
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Gets the name of the locality.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Gets the ASCII greeting message.
     *
     * @return the ASCII greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Gets the Unicode greeting message.
     *
     * @return the Unicode greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the formatted greeting string based on the locality.
     * Special formatting is applied for "China".
     *
     * @return the formatted greeting string
     */
    public String getFormatStr() {
        return this.localityName.equals("China") ?
                String.format("%%s, %s!", this.unicodeGreeting) : String.format(this.formatStr, this.unicodeGreeting, "%s");
    }

    /**
     * Gets the formatted greeting string based on whether ASCII-only is required.
     * Special formatting is applied for "China".
     *
     * @param asciiOnly true if only ASCII greeting is needed; false for Unicode
     * @return the formatted greeting string
     */
    public String getFormatStr(Boolean asciiOnly) {
        if (this.localityName.equals("China")){
            String greeting = asciiOnly ? this.asciiGreeting : this.unicodeGreeting;
            return String.format("%%s, %s!", greeting);
        } else {
            return String.format(this.formatStr, asciiOnly ? this.asciiGreeting : this.unicodeGreeting, "%s");
        }
    }

    /**
     * Returns a string representation of the Greeting object.
     *
     * @return a string in the format:
     *         {localityID:int, localityName:"String", asciiGreeting:"String", unicodeGreeting:"String"}
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}", this.localityID, this.localityName, this.asciiGreeting, this.unicodeGreeting);
    }

/**
 * A main method for testing the Greeting class.
 * Demonstrates the creation and usage of Greeting objects.
 *
 * @param args command-line arguments (not used)
 */
    public static void main(String[] args) {

    }
}
