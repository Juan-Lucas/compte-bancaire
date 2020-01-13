package entities;

import java.util.Date;

public abstract class Operation {
    private Integer numOperation;
    private Date dateOperation;
    private  double montant;

    public Operation()
    {

    }
    public Operation(Integer numOperation, Date dateOperation, double montant) {
        this.numOperation = numOperation;
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public Integer getNumOperation() {
        return numOperation;
    }

    public void setNumOperation(Integer numOperation) {
        this.numOperation = numOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public abstract void effectuerOp(Compte compte);
}
