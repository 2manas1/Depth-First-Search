/*

DFS->
example tree->

         10
      20     12
   15    13
   
   we have the above tree->
   
   1)pre-order-> +->L->R
   10->20->15->13->12
   
   2)in-order-> L->+->R
   15->20->13->10->12
   
   3)post-order-> L->R->+
   15->20->13->12->10
   
   +-> node
   L->left tree
   R-> right tree
   
   */



//in-order
if (root == null) {
  return null;
}

TreeNode left = invertTree(root.left);
TreeNode right = invertTree(root.right);

// Traverse the left subtree
if (left != null) {
  invertTree(left);
}

// Visit the root
System.out.println("Inorder: " + root.val);

// Traverse the right subtree
if (right != null) {
  invertTree(right);
}

root.left = right;
root.right = left;

return root;



//pre order

if (root == null) {
  return null;
}

// Visit the root
System.out.println("Preorder: " + root.val);

TreeNode left = invertTree(root.left);
TreeNode right = invertTree(root.right);

// Traverse the left subtree
if (left != null) {
  invertTree(left);
}

// Traverse the right subtree
if (right != null) {
  invertTree(right);
}

root.left = right;
root.right = left;

return root;

   //PostOrder
   public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.left = right;
    root.right = left;

    return root;
  }
