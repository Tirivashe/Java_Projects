
    public class TaxPayer{
        private String SSN;
        private double grossIncome;
        private double taxOwed;


        public TaxPayer(String SSN, double grossIncome){
            this.SSN = SSN;
            this.grossIncome = grossIncome;
            System.out.println("SSN: " + getSSN());
            System.out.printf("Income: $" + "%.2f",getGrossIncome() );
            if(getGrossIncome() < 30000){
                taxOwed = 0.15 * getGrossIncome();
            }
            else{
                taxOwed = 0.28 * getGrossIncome();
            }
        }


        public String getSSN() {
            return SSN;
        }


        public void setSSN(String sSN) {
            SSN = sSN;
        }


        public double getGrossIncome() {
            return grossIncome;
        }


        public void setGrossIncome(double grossIncome) {
            this.grossIncome = grossIncome;
        }


        public double getTaxOwed() {
            return taxOwed;
        }


        public void setTaxOwed(double taxOwed) {
            this.taxOwed = taxOwed;
        }

        public void print(){
            System.out.printf("\nTax owed: $" + "%.2f",getTaxOwed());
        }
    }

