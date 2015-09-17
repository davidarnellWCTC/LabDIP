package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodTipCalculator implements TipCalculator{
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double goodRate;
    private double fairRate;
    private double poorRate;

    private double bill;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
    private ServiceQuality serviceQuality;

    public FoodTipCalculator(ServiceQuality q, double billAmt) {
        //this.serviceQuality = q;
        this.setServiceQuality(q);
        this.setBill(billAmt);
        
        goodRate = 0.20; // set as default
        fairRate = 0.15;
        poorRate = 0.10;
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }
        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
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
