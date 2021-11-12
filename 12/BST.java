public class BST<E extends Comparable<E>>{
    
    //Treenode is a nested class inside BST
    private class TreeNode<E>{

        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        //constructor for treenode
        public TreeNode(E element){
            this.element = element;
        }
    }

    private TreeNode<E> root;
    private int size=0;

    //Return truee if the node is found
    public boolean search(E e){

        TreeNode<E> current = root;//current is a pojnter to traverse

        while(current !=null){
            if(e.compareTo(current.element)<0){
                current = current.left;
            }
            else if (e.compareTo(current.element)>0){
                current = current.right;
            }
            else{
                return true;
            }
        }

        return false;
    }

    //Insert element into BST. Return true if successfull
    public boolean insert(E element){
        //if BST is empty make it as root
        if (root==null){
            root = new TreeNode<>(element);
        }
        //
        else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while(current!=null){
                //Below is the same as search but we add a parent
                if(element.compareTo(current.element)<0){
                    parent = current;
                    current = current.left;
                }

                else if(element.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }

                else{   //duplicate not inserted
                    return false;
                }
            }

            //After we find a suitable parent with an empty left/right
            if(element.compareTo(parent.element)<0){
                parent.left = new TreeNode<>(element);
            }

            else{
                parent.right = new TreeNode<>(element);
            }
        }

        size++;
        return true;
    }

    /* Inorder traversal: kiri, root, kanan */
    /* This one just to make it easier to call */
    public void inorder(){
        inorder(root);
    }

    /* Traverse from a subtree */
    public void inorder(TreeNode<E> root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.element +" ");
        inorder(root.right);
    }

    /* Pre-order traversal: root,kiri,kanan */
    public void preorder(){
        preorder(root);
    }

    public void preorder(TreeNode<E> root){
        if (root==null){
            return;
        }
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    /* Post-order: kiri,kanan, root */
    public void postorder(){
        postorder(root);
    }

    public void postorder(TreeNode<E> root){
        if (root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }

    public int getSize(){
        return size;
    }

    public void clear(){
        root = null;
        size = 0;
    }
}
