package PBO.pertemuan_4.percobaan_1;

public class processor {
    private String merk;
    private double cache;

    processor() {

    }

    processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

    public void setMerk(String setMerk) {
        this.merk = setMerk;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double setCache) {
        this.cache = setCache;
    }

    public double getCache() {
        return cache;
    }

}
