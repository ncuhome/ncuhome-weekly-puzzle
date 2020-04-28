package com.sww;


import java.util.HashMap;
import java.util.Map;

/**
 * @author sww
 */
public class WeekFive {

    public static void main(String[] args) {
        int [][] array1 = {
            {1,1,1,1,0}
            ,{1,1,0,1,0}
            ,{1,1,0,0,0}
            ,{1,1,0,0,0}
            ,{0,0,0,0,0}
        };
        int [][] array2 = {
                {1,1,0,0,0}
                ,{1,1,0,0,0}
                ,{0,0,1,0,0}
                ,{0,0,0,1,1}
        };

        System.out.println(new Union().result(array1));
        System.out.println(new Union().result(array2));
    }




}

class PointNodeFactory {
    private Map<String, PointNode> nodes;

    public PointNodeFactory() {
        this.nodes = new HashMap<>(16);
    }

    public PointNode getPointNode(int x, int y) {
        String key = x + "," + y;
        if (nodes.containsKey(key)) {
            return nodes.get(key);
        } else {
            PointNode pointNode = new PointNode(x, y);
            nodes.put(key, pointNode);
            return pointNode;
        }
    }


    class PointNode {

        private int x;
        private int y;
        private PointNode previousNode;

        private int size;

        public PointNode(int x, int y) {
            this.x = x;
            this.y = y;
            this.size = 1;
            this.previousNode = this;
        }

        public boolean inArea(int xLength, int yLength, PointNode pointNode) {
            return x < xLength && y < yLength;
        }

        public PointNode getPreviousNode() {
            return this.previousNode;
        }

        public void setPreviousNode(PointNode previousNode) {
            this.previousNode = previousNode;
        }

        public int getSize() {
            return this.size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "PointNode{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}


class Union {
    private int count;

    public void union(PointNodeFactory.PointNode node1, PointNodeFactory.PointNode node2) {
        PointNodeFactory.PointNode node1Root = find(node1);
        PointNodeFactory.PointNode node2Root = find(node2);
        if (node1Root == node2Root) {
            return;
        } else {
            if (node1Root.getSize() < node2Root.getSize()) {
                node1Root.setPreviousNode(node2Root);
                node2Root.setSize(node2Root.getSize() + node1Root.getSize());
            } else {
                node2Root.setPreviousNode(node1Root);
                node1Root.setSize(node1Root.getSize() + node2Root.getSize());
            }
            count--;
        }
    }

    int result(int[][] array) {
        if (array == null) {
            return 0;
        }
        int yLength = array.length;
        int xLength = array[0].length;
        count = xLength * yLength;
        PointNodeFactory pointNodeFactory = new PointNodeFactory();
        int[][] forwards = {{1, 0}, {0, 1}};

        for (int row = 0; row < yLength; row++) {
            for (int column = 0; column < xLength; column++) {
                if (array[row][column] == 0) {
                    count--;
                } else {
                    for (int[] forward : forwards) {
                        PointNodeFactory.PointNode node2 = pointNodeFactory.getPointNode(column + forward[0], row + forward[1]);
                        if (node2.inArea(xLength, yLength, node2) && array[row + forward[1]][column + forward[0]] == 1) {
                            union(pointNodeFactory.getPointNode(column, row), node2);
                        }
                    }
                }
            }
        }
        return count;
    }

    public PointNodeFactory.PointNode find(PointNodeFactory.PointNode lastNode) {
        PointNodeFactory.PointNode rootNode = lastNode;
        while (rootNode.getPreviousNode() != rootNode) {
            rootNode = rootNode.getPreviousNode();
        }
        return rootNode.getPreviousNode();
    }

}
