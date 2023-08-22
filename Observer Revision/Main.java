public class Main {
    public static void main(String[] args) {
        Viewer viewer1 = new Viewer("Linc");
        Viewer viewer2 = new Viewer("Codes");
        Viewer viewer3 = new Viewer("Naruto");
        Viewer viewer4 = new Viewer("Eren");
        Viewer viewer5 = new Viewer("Sasike");

        Weather weather = new Weather();
        weather.addObserver(viewer1);
        weather.addObserver(viewer2);
        weather.addObserver(viewer3);
        weather.addObserver(viewer4);
        weather.addObserver(viewer5);

        weather.notifyObservers();

        weather.removeObserver(viewer1);
        weather.removeObserver(viewer4);
        System.out.println();
        weather.notifyObservers();
    }
}
