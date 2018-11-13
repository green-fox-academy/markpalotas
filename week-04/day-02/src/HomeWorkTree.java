public class HomeWorkTree {
    String type;
    String leafColor;
    int age;
    String sex;

    public HomeWorkTree() {
        this("unknownm", "unknown", 0, "unknown");
    }

    public HomeWorkTree(String type, String leafColor, int age, String sex) {
        this.type = type;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        HomeWorkTree tree0 = new HomeWorkTree();
        HomeWorkTree tree1 = new HomeWorkTree("birch", "yellow", 10, "female");
        HomeWorkTree tree2 = new HomeWorkTree("maple", "blue", 33, "male");
        HomeWorkTree tree3 = new HomeWorkTree("acacia", "green", 3, "female");
        HomeWorkTree tree4 = new HomeWorkTree("banyan", "grey", 54, "female");
        HomeWorkTree tree5 = new HomeWorkTree("baobab", "green", 123, "male");

        tree0.type = "redwood";
        tree0.age = 435;
        tree0.leafColor = "green";
        tree0.sex = "female";
    }
}
