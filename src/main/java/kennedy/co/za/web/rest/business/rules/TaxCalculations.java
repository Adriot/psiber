package kennedy.co.za.web.rest.business.rules;

import kennedy.co.za.service.dto.TaxInformationDTO;

public abstract class TaxCalculations {
    private TaxInformationDTO taxInformationDTO;
    private Long taxableIncome;
    private Long taxRate;
    private Long medicalAidCost;
    private Long annualTax;
    private Long monthlyTax;

    public TaxCalculations(TaxInformationDTO taxInformationDTO) {
        this.taxInformationDTO = taxInformationDTO;
    }

    public Long getAnnualTax() {
        return annualTax;
    }

    public Long getMonthlyTax() {
        return monthlyTax;
    }

    public abstract void calculateTaxableIncome();
    public abstract void calculateTaxRate();
    public abstract void calculateTaxMedicalAidCost();

    public Long calculateAnnualTax() {
        annualTax = taxRate - medicalAidCost;
        return annualTax;
    }

    public Long calculateMonthlyTax() {
        if (annualTax == null) {
            calculateAnnualTax();
        }
        monthlyTax = annualTax / 12;
        return monthlyTax;
    }
}
