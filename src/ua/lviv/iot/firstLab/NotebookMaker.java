package ua.lviv.iot.firstLab;

public class NotebookMaker {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        Notebook notebook2 = new Notebook(2.6f, 8, "Apple",
                8, 1024, 15.4f, "MacOS");
        Notebook notebook3 = new Notebook(2.0f, 4, "Lenovo", 4);

        System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println(notebook3);

        Notebook.volumeOfHDD = 1000;

        System.out.println(Notebook.printStaticVolumeOfHDD());
        System.out.println(notebook1.printVolumeOfHDD());

        Notebook[] notebookArray = new Notebook[4];
        int notebookIndex = 0;
        while (notebookIndex < notebookArray.length) {
            notebookArray[notebookIndex] = new Notebook();
            notebookIndex++;
        }
        for (Notebook notebookArrayElement : notebookArray) {
            System.out.println(notebookArrayElement);
        }

    }
}
