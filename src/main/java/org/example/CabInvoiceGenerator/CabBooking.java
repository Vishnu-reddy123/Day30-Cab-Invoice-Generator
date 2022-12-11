package org.example.CabInvoiceGenerator;

public class CabBooking {
    public double calculateRideFare(double distance, double time) {
        IInvoice iInvoice = InvoiceFactory.getInvoiceInstance();
        return iInvoice.calculateFare(distance, time);
    }
}
