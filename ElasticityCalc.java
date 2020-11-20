import java.util.Scanner;
public class ElasticityCalc
{
    public static double PEDemand(double initialP, double finalP, double initialQ, double finalQ){
        double deltaQ = (finalQ-initialQ)/initialQ;
        
        double deltaP = (finalP-initialP)/initialP;
        
        double answer = Math.abs(deltaQ/deltaP);
        
        return answer;
    }
    
    public static double PESupply(double initialP, double finalP, double initialQ, double finalQ){
        double deltaQ = (finalQ-initialQ)/initialQ;
      
        double deltaP = (finalP-initialP)/initialP;
        
        double answer = Math.abs(deltaQ/deltaP);
        
        return answer;
    }
  
    public static double CPEDemand(double initialP, double finalP, double initialQ, double finalQ){
        double deltaQ = (finalQ-initialQ)/initialQ;
        
        double deltaP = (finalP-initialP)/initialP;
        
        double answer = deltaQ/deltaP;
        
        return answer;
    }
    
    public static double IEDemand(double initialI, double finalI, double initialQ, double finalQ){
        double deltaQ = (finalQ-initialQ)/initialQ;
        
        double deltaI = (finalI-initialI)/initialI;
        
        double answer = deltaQ/deltaI;
        
        return answer;
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please choose which type of elasticity you'd like to calculate: ");
        System.out.println("1: Price elasticity of demand");
        System.out.println("2: Price elasticity of supply");
        System.out.println("3: Cross price elasticity of demand");
        System.out.println("4: Income elasticity of demand");
        
        int selection = in.nextInt();
        
        if(selection == 1){
            String elasticity = "";
            
            System.out.println("Please enter the initial price ");
            double initialP = in.nextDouble();
            System.out.println("Please enter the final price ");
            double finalP = in.nextDouble();
            System.out.println("Please enter the initial quantity demanded");
            double initialQ = in.nextDouble();
            System.out.println("Please enter the final quantity demanded");
            double finalQ = in.nextDouble();
            
            double answer = PEDemand(initialP, finalP, initialQ, finalQ);
            if(answer == 0){
                elasticity = "perfectly inelastic";
            }
            if(answer>0&&answer<1){
                elasticity = "inelastic";
            }
            if(answer == 1){
                elasticity = "unit elastic";
            }
            if(answer > 1){
                elasticity = "elastic";
            }
            
            System.out.println("Your price elasticity of demand is " + elasticity + " with a value of " + answer + "%.");
            
        }
        
        if(selection == 2){
            String elasticity = "";
            
            System.out.println("Please enter the initial price ");
            double initialP = in.nextDouble();
            System.out.println("Please enter the final price ");
            double finalP = in.nextDouble();
            System.out.println("Please enter the initial quantity supplied ");
            double initialQ = in.nextDouble();
            System.out.println("Please enter the final quantity supplied ");
            double finalQ = in.nextDouble();
            
            double answer = PESupply(initialP, finalP, initialQ, finalQ);
            if(answer == 0){
                elasticity = "perfectly inelastic";
            }
            if(answer>0&&answer<1){
                elasticity = "inelastic";
            }
            if(answer == 1){
                elasticity = "unit elastic";
            }
            if(answer > 1){
                elasticity = "elastic";
            }
            
            System.out.println("Your price elasticity of supply is " + elasticity + " with a value of " + answer + "%.");
            
        }
        
        if(selection == 3){
            String elasticity = "";
            
            System.out.println("Please enter the initial price of good A");
            double initialP = in.nextDouble();
            System.out.println("Please enter the final price of good A");
            double finalP = in.nextDouble();
            System.out.println("Please enter the initial quantity of good B ");
            double initialQ = in.nextDouble();
            System.out.println("Please enter the final quantity  of good B ");
            double finalQ = in.nextDouble();
            
            double answer = CPEDemand(initialP, finalP, initialQ, finalQ);
            if(answer == 0){
                elasticity = "unrelated";
            }
            if(answer>0&&answer<1){
                elasticity = "weak substitutes";
            }
            if(answer > 1){
                elasticity = "strong substitutes";
            }
            if(answer < 0 && answer > -1){
                elasticity = "weak complements";
            }
            if(answer < -1){
                elasticity = "strong complements";
            }
            
            System.out.println("Your cross-price elasticity of demand is " + answer + ". These goods are " + elasticity);
            
        }
        
        if(selection == 4){
            String elasticity = "";
            String goodType = "";
            
            System.out.println("Please enter the initial income ");
            double initialI = in.nextDouble();
            System.out.println("Please enter the final income ");
            double finalI = in.nextDouble();
            System.out.println("Please enter the initial quantity demanded ");
            double initialQ = in.nextDouble();
            System.out.println("Please enter the final quantity demanded ");
            double finalQ = in.nextDouble();
            
            double answer = IEDemand(initialI, finalI, initialQ, finalQ);
            if(answer > 1 ){
                elasticity = "income elastic";
                goodType = "normal good";
            }
            if(answer>0&&answer<1){
                elasticity = "income inelastic";
                goodType = "normal good";
            }
            if(answer < 1){
                goodType = "inferior good";
            }
            
            System.out.println("Your income elasticity of demand is " + elasticity + " with a value of " + answer + "%. This good is a " + goodType);
            
        }
    } 
}
