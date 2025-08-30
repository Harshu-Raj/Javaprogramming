public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void inorder(Node root){
        if(root==null){
//            System.out.print("-1 ");
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){


        if(root==null)return false;

        if(root.data==key){
            return true;
        }
        else if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }

//        return false;


    }
    public static Node insert(int val,Node root){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val>root.data){
            root.right=insert(val,root.right);
        }else{
                root.left=insert(val,root.left);
        }
        return root;

    }

    public static void main(String[] args) {
        int values[]={1,2,3,4,5,6,7,8,9,10};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(values[i],root);
        }
        inorder(root);
//        search(root,7);
        System.out.println(search(root,11));
    }
}
