package Chapter4_ValuesAndDataTypes;
// 2.1_JavaKeywordsDemo.java
// Understanding Java keywords (reserved words)

class JavaKeywordsDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA KEYWORDS DEMO ===");
        System.out.println("Keywords are reserved words with special meaning in Java\n");

        // Examples using keywords
        int number = 10; // 'int' is a keyword
        boolean flag = true; // 'boolean' is a keyword
        
        System.out.println("--- Common Keywords in Action ---");
        System.out.println("int number = " + number + "; // 'int' is a keyword");
        System.out.println("boolean flag = " + flag + "; // 'boolean' is a keyword");
        System.out.println();

        System.out.println("--- All Java Keywords ---");
        String[] keywords = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while"
        };
        
        int count = 0;
        for (String keyword : keywords) {
            System.out.print(keyword + "\t");
            count++;
            if (count % 6 == 0) System.out.println();
        }
        System.out.println("\nTotal keywords: " + keywords.length);
    }
}
