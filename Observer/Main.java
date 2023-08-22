public class Main{
    public static void main(String[] args) {
       Inventory invent = new Inventory();

       Viewer viewer1 = new Viewer("Bob");
       Viewer viewer2 = new Viewer("Steve");
       Viewer viewer3 = new Viewer("Michael");

       invent.addObserver(viewer1);
       invent.addObserver(viewer2);
       invent.addObserver(viewer3);

       //invent.addedItem("Pizza");

       invent.removeObserver(viewer2);

       invent.removedItem("Mango");
    }
}