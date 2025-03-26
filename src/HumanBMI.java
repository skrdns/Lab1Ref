class HumanBMI {
    private double weight;
    private double height;

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateIMT() {
        return weight / (height * height);
    }

    public IMTCategory determineCategory() {
        double imt = calculateIMT();
        if (imt < 18.5) return IMTCategory.DEFICIT;
        if (imt < 25) return IMTCategory.NORM;
        if (imt < 30) return IMTCategory.WARNING;
        return IMTCategory.FAT;
    }

    public String getIMTResult() {
        return switch (determineCategory()) {
            case DEFICIT -> "Deficit";
            case NORM -> "Norm";
            case WARNING -> "Warning!";
            case FAT -> "Fat";
        };
    }
}