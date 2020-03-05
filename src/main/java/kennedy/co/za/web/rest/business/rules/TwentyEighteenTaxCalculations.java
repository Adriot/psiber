package kennedy.co.za.web.rest.business.rules;

import kennedy.co.za.service.dto.TaxInformationDTO;

public class TwentyEighteenTaxCalculations extends TaxCalculations {
    public TwentyEighteenTaxCalculations(TaxInformationDTO taxInformationDTO) {
        super(taxInformationDTO);
    }

    @Override
    public void calculateTaxableIncome() {

    }

    @Override
    public void calculateTaxRate() {

    }

    @Override
    public void calculateTaxMedicalAidCost() {

    }
}
