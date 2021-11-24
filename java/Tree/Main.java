import java.util.*;

/*________________Tree Node construction_______________*/
class Tree{

    int data;
    Tree left;
    Tree right;
   public Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
/*_____________________Tree Utill____________________________ */
class BinaryTree{
    public static Tree takeInput(){
        Scanner scanner = new Scanner(System.in);
        Queue<Tree> queue = new LinkedList<Tree>();
        int data = scanner.nextInt();
        if(data == -1) return null;
        Tree root = new Tree(data);
        queue.add(root);
        while(!queue.isEmpty()){
            Tree current = queue.poll();
            int left =scanner.nextInt();
            if(left != -1){
                Tree leftChild = new Tree(left);
                current.left = leftChild;
                queue.add(leftChild);

            }
            int right =scanner.nextInt();
            if(right != -1){
                Tree rightChild = new Tree(right);
                current.right = rightChild;
                queue.add(rightChild);

            }
        }
        scanner.close();
        return root;
    }
    public static void Print(Tree root){
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(root);
        while(!queue.isEmpty()){
            Tree current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        Tree root = BinaryTree.takeInput();
        BinaryTree.Print(root);
    }
}
