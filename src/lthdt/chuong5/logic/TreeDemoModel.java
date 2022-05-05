/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author HOAI NGUYEN
 */
public class TreeDemoModel implements TreeModel{
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //Khoi tao cay
        rootNode = buldTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buldTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        //Xay dung cac nut con cho nut goc
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        //Dua vao nt root
        root.add(car);
        root.add(motor);
        
        //Xay dung cac nut con cho car
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
        car.add(honda);
        car.add(mazda);
        car.add(toyota);
        
        //Xay dung cac nut con cho motor
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("Suzuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        motor.add(suzuki);
        motor.add(yamaha);
       
        //Tra ve nut goc cho cay
        return  root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    
    
    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return  tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return  tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return  tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
           return  tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
