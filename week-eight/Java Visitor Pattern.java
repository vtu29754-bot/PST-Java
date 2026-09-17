import java.util.ArrayList;

public class JavaVisitorPattern {
    enum Color { RED, GREEN }

    abstract static class Tree {
        private int value;
        private Color color;
        private int depth;

        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }

        public int getValue() { return value; }
        public Color getColor() { return color; }
        public int getDepth() { return depth; }

        public abstract void accept(TreeVis visitor);
    }

    static class TreeNode extends Tree {
        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitNode(this);
            for (Tree child : children) {
                child.accept(visitor);
            }
        }

        public void addChild(Tree child) {
            children.add(child);
        }
    }

    static class TreeLeaf extends Tree {
        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }

    abstract static class TreeVis {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);
    }

    static class SumInLeavesVisitor extends TreeVis {
        private int result = 0;

        public int getResult() { return result; }
        public void visitNode(TreeNode node) {}
        public void visitLeaf(TreeLeaf leaf) {
            result += leaf.getValue();
        }
    }

    static class ProductOfRedNodesVisitor extends TreeVis {
        private long result = 1;
        private final int M = 1000000007;

        public int getResult() { return (int) result; }

        public void visitNode(TreeNode node) {
            if (node.getColor() == Color.RED) {
                result = (result * node.getValue()) % M;
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getColor() == Color.RED) {
                result = (result * leaf.getValue()) % M;
            }
        }
    }

    static class FancyVisitor extends TreeVis {
        private int nonLeafEvenDepthSum = 0;
        private int greenLeavesSum = 0;

        public int getResult() {
            return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
        }

        public void visitNode(TreeNode node) {
            if (node.getDepth() % 2 == 0) {
                nonLeafEvenDepthSum += node.getValue();
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getColor() == Color.GREEN) {
                greenLeavesSum += leaf.getValue();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, Color.RED, 0);
        TreeNode n1 = new TreeNode(5, Color.GREEN, 1);
        TreeLeaf l1 = new TreeLeaf(10, Color.RED, 2);
        TreeLeaf l2 = new TreeLeaf(12, Color.GREEN, 2);

        root.addChild(n1);
        n1.addChild(l1);
        n1.addChild(l2);

        SumInLeavesVisitor v1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor v2 = new ProductOfRedNodesVisitor();
        FancyVisitor v3 = new FancyVisitor();

        root.accept(v1);
        root.accept(v2);
        root.accept(v3);

        System.out.println("SumInLeavesVisitor Result: " + v1.getResult());
        System.out.println("ProductOfRedNodesVisitor Result: " + v2.getResult());
        System.out.println("FancyVisitor Result: " + v3.getResult());
    }
}

/*
INPUT & OUTPUT:

SumInLeavesVisitor Result: 22
ProductOfRedNodesVisitor Result: 40
FancyVisitor Result: 8
*/
