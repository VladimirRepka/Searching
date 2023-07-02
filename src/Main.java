public class Main {
    public static void main(String[] args) {
        String phoneNumber = "(234) 333-5551";
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

    }

    public static String parseAreaCode(String phoneNumber){
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(openParens + 1, closeParens);
        return areaCode;

    }

    public static String parseExchange(String phoneNumber){
        int spaceIdx = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        String exchamge = phoneNumber.substring(spaceIdx + 1, hyphenIdx);
        return exchamge;
    }

    public static String parseLineNumber(String phoneNumber){
        int hyphendIdx = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphendIdx + 1);
        return lineNumber;
    }

}