class Tree {

    String type = "unknown";

    String getTreeString() {
        return "Tree";
    }
}

class GoodTree extends Tree {

    String type = "good";

    String getTreeString() {
        return "Good Tree";
    }
}

class FruitTree extends Tree {

    String type = "fruit";

    String getTreeString() {
        return "Fruit Tree";
    }
}

public class UpcastingExamples {
    public static void main(String[] args) {
        UpcastingExamples upcastingExamples = new UpcastingExamples();

        GoodTree goodTree = new GoodTree();
        FruitTree fruitTree = new FruitTree();

        //we upcast to parent type
        Tree genericTree = (Tree) goodTree;

        System.out.println("Tree type = " + genericTree.type);
        System.out.println("Tree type = " + goodTree.type);
        System.out.println("Tree type = " + ((Tree)goodTree).type);

        upcastingExamples.printTreeType((Tree)fruitTree);
    }

    public void printTreeType(Tree tree){
        System.out.println("Tree type = " + tree.getTreeString());
    }
}
