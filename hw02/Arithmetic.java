//Tashi Eng
//2/2/15
//CSE2
//To compute the cost of the items purchased at Walmart

    public class Arithmetic {
        public static void main(String[] args) {
            int nSocks=3, //There were 3 pairs of socks purchased
            nGlasses=6, //There were 6 of glasses purchased
            nEnvelopes=1; //There was one evelope purchased
            double sockCost$=2.58, //Declares the cost of each pair of socks as $2.58
            glassCost$=2.29, //Declares the cost of each glass as $2.29
            envelopeCost$=3.25, //Declares the cost of each envelope as $3.25
            taxPercent=.06, //Declares the tax percent as .06
            totalSockCost$, //total cost of socks
            totalGlassCost$, //total cost of glasses
            totalEnvelopeCost$, //total cost of envelopes
            totalCostBeforeTax$, //total cost of the sale excluding sales tax
            totalSalesTax$, //total tax from the sale
            totalCostAfterTax$, //total cost of the sale including sales tax
            sockTax$, //Sales tax from socks
            glassTax$, //Sales tax from glasses
            envelopeTax$; //Sales tax from envelope
            
            sockTax$ = (nSocks*sockCost$*taxPercent); //calculates sales tax from socks
            glassTax$ = (nGlasses*glassCost$*taxPercent); //calculates sales tax from glasses
            envelopeTax$ = (nEnvelopes*envelopeCost$*taxPercent); //calculates sales tax from envelopes
            totalSockCost$ = (nSocks*sockCost$ + nSocks*sockCost$*taxPercent); //calculates total sock cost
            totalGlassCost$ = (nGlasses*glassCost$ + nGlasses*glassCost$*taxPercent); //calculates total glass cost
            totalEnvelopeCost$ = (nEnvelopes*envelopeCost$ + nEnvelopes*envelopeCost$*taxPercent); //calculates total envelope cost
            totalCostBeforeTax$ = (((double)nSocks*sockCost$) + ((double)nGlasses*glassCost$) + ((double)nEnvelopes*envelopeCost$)); //calculates total sales cost excluding sales tax
            totalSalesTax$ = (nSocks*sockCost$*taxPercent + nGlasses*glassCost$*taxPercent + nEnvelopes*envelopeCost$*taxPercent); //calculates total sales tax from the sale
            totalCostAfterTax$ = (totalCostBeforeTax$ + totalSalesTax$); //Calculates total cost including sales tax
            
            totalSockCost$ *=100; //rounds total sock cost to two decimal places
            totalSockCost$ = (int)totalSockCost$;
            totalSockCost$ /=100;
            
            totalGlassCost$ *=100; //rounds total glass cost to two decimal places
            totalGlassCost$ = (int)totalGlassCost$;
            totalGlassCost$ /=100;
            
            totalEnvelopeCost$ *=100; //rounds total envelope cost to two decimal places
            totalEnvelopeCost$ = (int)totalEnvelopeCost$;
            totalEnvelopeCost$ /=100;
            
            sockTax$ *=100; //rounds sock tax to two decimal places
            sockTax$ = (int)sockTax$;
            sockTax$ /=100;
            
            glassTax$ *=100; //rounds glass tax to two decimal places
            glassTax$ = (int)glassTax$;
            glassTax$ /=100;
            
            envelopeTax$ *=100; //rounds envelope tax to two decimal places
            envelopeTax$ = (int)envelopeTax$;
            envelopeTax$ /=100;
            
            totalSalesTax$ *=100; //rounds total sales tax to two decimal places
            totalSalesTax$ = (int)totalSalesTax$;
            totalSalesTax$ /=100;
            
            totalCostBeforeTax$ *=100; //rounds the total cost before tax to two decimal places
            totalCostBeforeTax$ = (int)totalCostBeforeTax$;
            totalCostBeforeTax$ /=100;
            
            totalCostAfterTax$ *=100; //rounds the total cost before tax to two decimal places
            totalCostAfterTax$ = (int)totalCostAfterTax$;
            totalCostAfterTax$ /=100;
            
            System.out.println("The total cost of socks was $"+totalSockCost$); //prints the total cost of socks
            System.out.println("The total cost of glasses was $"+totalGlassCost$); //prints the total cost of glasses
            System.out.println("The total cost of the envelope was $"+totalEnvelopeCost$); //prints the total cost of the envelope
            System.out.println("The sales tax from the socks was $"+sockTax$); // prints the total sales tax from socks
            System.out.println("The sales tax from the glasses was $"+glassTax$); //prints the total sales tax from glasses
            System.out.println("The sales tax from the envelope was $"+envelopeTax$); //prints the total sales tax from the envelope
            System.out.println("The total cost of purchases before sales tax was $"+totalCostBeforeTax$); //prints the total cost of purchases before sales tax
            System.out.println("The total cost of purchases including sales tax was $"+totalCostAfterTax$); //prints the total cost of purchases after sales tax
            
            
            
            
        }
    }