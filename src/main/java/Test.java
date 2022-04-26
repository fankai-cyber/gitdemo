import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<Integer, String> sites = new HashMap<>();

        // 往 HashMap 添加一些元素
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        System.out.println("sites HashMap: " + sites);


        // HashMap 不存在该key
        String weibo = sites.putIfAbsent(4, "Weibo");
        System.out.println(weibo);
        System.out.println("change1");
        // HashMap 中存在 Key
        String wiki = sites.putIfAbsent(2, "Wiki");
        System.out.println(wiki);
        System.out.println("Updated Languages: " + sites);
    }
}