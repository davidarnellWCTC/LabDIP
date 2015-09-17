package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageTipCalculator implements TipCalculator {
    // These variables are removed since the bill can be more than 100
    // Leaving the max billable amount to this class makes fragile code
    private static final double MIN_BILL = 0.00;
//    private static final double MAX_BILL = 100.00;
//    private static final String BILL_ENTRY_ERR =
//            "Error: bill must be between " + MIN_BILL + " and "
//            + MAX_BILL;
    private double goodRate;
    private double fairRate;
    private double poorRate;

    private double baseTipPerBag;
    private int bagCount;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
    private ServiceQuality serviceQuality;

    public BaggageTipCalculator(ServiceQuality q, int bags) {
        //this.serviceQuality = q;
        this.setServiceQuality(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
        
        goodRate = 0.20; // set default value
        fairRate = 0.15;
        poorRate = 0.10;
    }

    // name changed to "getTip" to share method with FodServiceTipCalculator
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
    
        @Override
    public void setServiceQuality(ServiceQuality q) {
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    @Override
    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    @Override
    public double getGoodRate() {
        return goodRate;
    }

    @Override
    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    @Override
    public double getFairRate() {
        return fairRate;
    }

    @Override
    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

    @Override
    public double getPoorRate() {
        return poorRate;
    }
}
