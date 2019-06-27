package patterns.mix.commandAndResponsibilityChain;

public class FileManager {
    public static String ls(String path) {
        return "file\nfile2\nfile3\nfile4";
    }

    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2009-08-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-08-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-08-20 10:23 file3\n";
        return str;
    }

    public static String ls_a(String path) {
        String str = ".\n..\nfile\nfile2\nfile3";
        return str;
    }
}
