package task6;

import java.io.File;

public class Main {
    private static File directory=new File("/Users/admin/Desktop/zxc/io/src/main/java/task3");
    public static void main(String[] args) {
        File file = new File("/Users/admin/Desktop/zxc/io/src/main/java/task3/Writer.java");

        displayFiles();
    }






    /**
     * method displays a list of a directory's files and subdirectories
     */
    private static void displayFiles() {
        File[] content = directory.listFiles();
        System.out.println(directory.toPath().toString());
        assert content != null;
        int maxLength = 0;
        for (File f : content) {
            if (f.getName().length() > maxLength) {
                maxLength = f.getName().length();
            }
        }
        for (File f : content) {
            String name = appendSpacesToName(f.getName(), maxLength);
            if (f.isDirectory()) {
                System.out.println("   Directory " + name
                        + f.length() / 1024 + " Kb");
            } else {
                System.out.println("   File      " + name
                        + f.length() / 1024 + " Kb");
            }
        }
    }
    /**
     * method appends some spaces to the file names

     */
    private static String appendSpacesToName(String name, int maxLength) {
        StringBuilder sb = new StringBuilder(name);
        while (sb.length() <= maxLength + 1) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
