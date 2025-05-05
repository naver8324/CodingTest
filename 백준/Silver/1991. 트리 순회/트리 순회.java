import java.util.*;
import java.io.*;

public class Main {
    static Map<Character, Node> tree = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            tree.put(root, new Node(left, right));
        }

        preorder('A');
        sb.append("\n");
        inorder('A');
        sb.append("\n");
        postorder('A');

        System.out.println(sb.toString());
    }

    static void preorder(char current) {
        if (current == '.') {
            return;
        }
        sb.append(current);
        preorder(tree.get(current).left);
        preorder(tree.get(current).right);
    }

    static void inorder(char current) {
        if (current == '.') {
            return;
        }
        inorder(tree.get(current).left);
        sb.append(current);
        inorder(tree.get(current).right);
    }

    static void postorder(char current) {
        if (current == '.') {
            return;
        }
        postorder(tree.get(current).left);
        postorder(tree.get(current).right);
        sb.append(current);
    }
}

class Node {
    char left;
    char right;

    Node(char left, char right) {
        this.left = left;
        this.right = right;
    }
}