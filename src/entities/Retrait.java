package entities;

import java.util.Date;

public class Retrait extends Operation {
    public Retrait()
    {

    }
    public Retrait(Integer numOperation, Date dateOperation, double montant) {
        super(numOperation, dateOperation, montant);
    }

    @Override
    public Integer getNumOperation() {
        return super.getNumOperation();
    }

    @Override
    public void setNumOperation(Integer numOperation) {
        super.setNumOperation(numOperation);
    }

    @Override
    public Date getDateOperation() {
        return super.getDateOperation();
    }

    @Override
    public void setDateOperation(Date dateOperation) {
        super.setDateOperation(dateOperation);
    }

    @Override
    public double getMontant() {
        return super.getMontant();
    }

    @Override
    public void setMontant(double montant) {
        super.setMontant(montant);
    }

    @Override
    public void effectuerOp(Compte compte) {
    }
}
