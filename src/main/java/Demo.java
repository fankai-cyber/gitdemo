import java.util.Arrays;
import java.util.List;

public class Demo {
    public void test() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc");

        //对象实例语法	instanceRef::methodName
        list.forEach(new Demo()::print);
    }

    public void print(String content){
        System.out.println(content);
    }
}
