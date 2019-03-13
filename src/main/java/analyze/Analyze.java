package analyze;

/**
 * @author 214652773@qq.com
 * @user c
 * @create 2019/2/13 22:33
 */

public class Analyze {

    static {
        System.load("/home/c/IdeaProjects/practice/lib/libsound.so");
    }

    public static native void analyze(String path);

    public static native void init(String base);

}
