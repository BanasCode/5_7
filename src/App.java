public class App {
    public static void main(String[] args) throws Exception {

        int tuition = 10000;
        int totalCost = 0;
        int tuition10years = 0;
        double tuitionRate = .05;
        int year1 = 0;
        int year2 = 0;
        int year3 = 0;
        int year4 = 0;

        for (int i = 1; i <= 14; i++) {
            tuition += tuition * tuitionRate;

            if (i == 11) 
				year1 = tuition; 
            if (i == 12) 
				year2 = tuition; 
            if (i == 13) 
				year3 = tuition; 
            if (i == 14) 
				year4 = tuition; 

			if (i == 10)
				tuition10years = tuition; 

            totalCost = year1 + year2 + year3 + year4;    
        }

        System.out.println("In 10 years tuition will cost: $" +tuition10years);
        System.out.println("After the 10th year, the total cost of 4 years worth of tuition will be: $" +totalCost);

    }
}
