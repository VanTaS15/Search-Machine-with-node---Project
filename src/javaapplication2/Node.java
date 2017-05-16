package javaapplication2;

public class Node {

    Node left;

    Node right;

    int value;
    String svalue;

    public Node(int value,String svalue) {
      this.value = value;
      this.svalue=svalue;
    }

  public void insert(Node node, int value, String svalue) {
    if (value <= node.value) {
      if (node.left != null) {
        insert(node.left, value,svalue);
      } else {
        System.out.println("  Inserted " + svalue + " to left of "
            + node.svalue);
        node.left = new Node(value,svalue);
      }
    } else if (value > node.value) {
      if (node.right != null) {
        insert(node.right, value,svalue);
      } else {
        System.out.println("  Inserted " + svalue + " to right of "
            + node.svalue);
        node.right = new Node(value,svalue);
      }
    }
  }

  public void serchInOrder(Node node,String z2,String z) {
      
    if (node != null) {
         
      serchInOrder(node.left,z2,z);
      if(node.svalue.equals(z2)){
          
          BinaryTree.value=node.value;
          BinaryTree.z=z;
          BinaryTree.z2=z2;
          
      }
        serchInOrder(node.right,z2,z);
        
      }
          
      //System.out.println("  Traversed " + node.value+" Svalue: "+node.svalue+"z2: "+z2);
 
      
    }
   
  }
  
  

 


