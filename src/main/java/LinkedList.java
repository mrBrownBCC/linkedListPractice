public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null; //initializes the first node to be null
    }

    public void traverse() {
        traverse(head); //calls the traverse helper function
    }

    //PART ONE
    private void traverse(Node node) {
        //if the current node is null, return

        //otherwise, print the node's number + " -> "

        //then, make the recursive call to print the next node
    }

    //PART ONE
    public boolean containsElement(int value) {
        return containsElement(head, value); //calls recursive helper function
    }

    private boolean containsElement(Node node, int value) {
        //if the current node is null, return false

        //if the current node contains the value, return true

        //otherwise, make a recursive call

        return false;
    }

    public void insertAtHead(int value) {
        //create new node
        //make its next reference point to the old head
        //make the new node the new head
    }

    public void insertAtTail(int value) {
        head = insertAtTail(head, value); //use recursive helper
    }

    private Node insertAtTail(Node node, int value) {
        //if the node is null, we are at the tail, so return a newly created node

        //otherwise, make a recursive call to insert at the next node
        
        //NOTE! At each step along the way, we are setting Node.next to the recursive call. 
        return node;
    }

    //METHODS FOR PART TWO!!!
    public void deleteElement(int value) {
        head = deleteElement(head, value); //calls recursive helper function to delete
    }

    private Node deleteElement(Node node, int value) {
        //if the current node is null, return null (base case)

        //if the current node contains the value, return the next node (removing the current one)

        //otherwise, recursively delete from the next node
        //NOTE! At each step along the way, we are setting Node.next to the recursive call. 

        return node;
    }

    public int length() {
        return length(head); //calls recursive helper function to calculate length
    }

    private int length(Node node) {
        //if the current node is null, return 0 (base case)

        //otherwise, return 1 + recursive call to calculate the length of the rest of the list

        return 0;
    }
}