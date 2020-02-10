package ua.lviv.iot.firstLab;

public class Notebook {

    private float processorSpeed;
    private int volumeOfRAM;
    private String nameOfManufacturer;
    private int numberOfProcessorCores;
    private int volumeOfSSD;
    public static int volumeOfHDD;
    protected float screenSizeInInches;
    protected String operatingSystem;

    public float getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(float processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getVolumeOfRAM() {
        return volumeOfRAM;
    }

    public void setVolumeOfRAM(int volumeOfRAM) {
        this.volumeOfRAM = volumeOfRAM;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public int getNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    public void setNumberOfProcessorCores(int numberOfProcessorCores) {
        this.numberOfProcessorCores = numberOfProcessorCores;
    }

    public int getVolumeOfSSD() {
        return volumeOfSSD;
    }

    public void setVolumeOfSSD(int volumeOfSSD) {
        this.volumeOfSSD = volumeOfSSD;
    }

    public static int getVolumeOfHDD() {
        return volumeOfHDD;
    }

    public static void setVolumeOfHDD(int volumeOfHDD) {
        Notebook.volumeOfHDD = volumeOfHDD;
    }

    public float getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(float screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Notebook(float processorSpeed, int volumeOfRAM, String nameOfManufacturer, int numberOfProcessorCores,
                    int volumeOfSSD, float screenSizeInInches, String operatingSystem) {
        this.processorSpeed = processorSpeed;
        this.volumeOfRAM = volumeOfRAM;
        this.nameOfManufacturer = nameOfManufacturer;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.volumeOfSSD = volumeOfSSD;
        this.screenSizeInInches = screenSizeInInches;
        this.operatingSystem = operatingSystem;
    }

    public Notebook(float processorSpeed, int volumeOfRAM, String nameOfManufacturer, int numberOfProcessorCores) {
        this(processorSpeed, volumeOfRAM, nameOfManufacturer, numberOfProcessorCores,
                0, 0.0f, null);
    }

    public Notebook() {
        this(0.0f, 0, null, 0,
                0, 0.0f, null);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "processorSpeed=" + processorSpeed +
                ", volumeOfRAM=" + volumeOfRAM +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", numberOfProcessorCores=" + numberOfProcessorCores +
                ", volumeOfSSD=" + volumeOfSSD +
                ", screenSizeInInches=" + screenSizeInInches +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public static String printStaticVolumeOfHDD() {
        return "Static volume of HDD - " + volumeOfHDD;
    }

    public String printVolumeOfHDD() {
        return "Non static volume of HDD - " + volumeOfHDD;
    }

    public void resetValues(String operatingSystem, float screenSizeInInches, String nameOfManufacturer,
                            int numberOfProcessorCores, float processorSpeed, int volumeOfRAM, int volumeOfSSD) {
        this.operatingSystem = operatingSystem;
        this.screenSizeInInches = screenSizeInInches;
        this.nameOfManufacturer = nameOfManufacturer;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.processorSpeed = processorSpeed;
        this.volumeOfRAM = volumeOfRAM;
        this.volumeOfSSD = volumeOfSSD;
    }

}