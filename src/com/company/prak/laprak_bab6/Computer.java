package com.company.prak.laprak_bab6;

public class Computer {
    private String brand, model, serialNum, processor, gpu, category;
    private int price;
    private static final int MIN_PRICE1 = 20_000;
    private static final int MIN_PRICE2 = 10_000;
    private static final int MIN_PRICE3 = 5_000;

    @Override
    public String toString() {
        return String.format("""
                Brand = %s
                Model = %s
                Serial Number  = %s
                Processor = %s
                GPU = %s
                Category = %s
                Price = %s
                """,
                getBrand(),
                getModel(),
                getSerialNum(),
                getProcessor(),
                getGpu(),
                getCategory(),
                getPrice()
        );
    }
    public Computer(String brand, String model, String serialNum, String processor, String gpu, int price) {
        setBrand(brand);
        setModel(model);
        setSerialNum(serialNum);
        setProcessor(processor);
        setGpu(gpu);
        setCategory(price);
        setPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public void setCategory(int price) {
        if(price>=MIN_PRICE1){
            category = "Flagship Computer";
        }else if(MIN_PRICE1>price && price>=MIN_PRICE2){
            category = "Mid-High Range Computer";
        }else if(MIN_PRICE2>price && price>=MIN_PRICE3){
            category = "Low-Mid Range Computer";
        }else{
            category = "Low Range Computer";
        }
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getSerialNum() {
        return serialNum;
    }
    public String getProcessor() {
        return processor;
    }
    public String getGpu() {
        return gpu;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }
}
