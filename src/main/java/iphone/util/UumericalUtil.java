package iphone.util;

/*
 *
 */
public class UumericalUtil {
    public static void main(String[] args){
        String testString="data:image/png;base64,123";
        String teststringhead=TruncateHeadString(testString,22);
        String teststringtail=TruncateTailString(testString,4);
        System.out.println("从头部删除3个字符为："+teststringhead);
        System.out.println("从尾部删除3个字符为："+teststringtail);
    }

    //从头开始删除字符的方法
    public static String TruncateHeadString(String origin, int count) {
        if (origin == null || origin.length() < count) {
            return null;
        }
        char[] arr = origin.toCharArray();
        char[] ret = new char[arr.length - count];
        for (int i = 0; i < ret.length; i ++) {
            ret[i] = arr[i + count];
        }

        return String.copyValueOf(ret);
    }
    //从尾部开始删除字符的方法
    public static String TruncateTailString(String origin, int count) {
        if (origin == null || origin.length() < count) {
            return null;
        }
        char[] arr = origin.toCharArray();
        char[] ret = new char[arr.length - count+1];
        for (int i = 0; i < ret.length; i ++) {
            ret[i] = arr[i];
        }

        return String.copyValueOf(ret);
    }
}