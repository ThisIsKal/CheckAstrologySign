package checkastrologysign;
import javax.swing.JOptionPane;
/**
 *
 * @author DISD3/ST10152178
 */
public class CheckAstrologySign {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String bmonth = JOptionPane.showInputDialog("Enter your birth month: ");
        //User enters the month they were born in
        
        int date = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your day of birth: "));
        //User enters the day they were born within that month
        
        /*
            Lines 28 - 164 are a Switch statement loop for each month, with nested IF and ELSE statements inside each case
            for dates for each month. Any date entered that is either less than 1 or greater than the maximum days for that 
            particular month will return with the message "Invalid".
        */
        String sign = "";
        
        switch (bmonth)
        {
            case "January":                
                if (date >= 1 && date <= 30)
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("January".equals(bmonth)) 
                {
                    if (date < 20)
                    sign = "Capricorn"; 
                else
                    sign = "Aquarius";
                }
                break;
                
            case "February":                
                if (date >= 1 && date <= 29) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("February".equals(bmonth)) 
                {
                    if (date < 19)
                    sign = "Aquarius"; 
                else
                    sign = "Pisces";
                }
                break;
                
            case "March":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("March".equals(bmonth)) 
                {
                    if (date < 21)
                    sign = "Pisces"; 
                else
                    sign = "Aries";
                }
                break;
                
            case "April":                
                if (date >= 1 && date <= 30) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("April".equals(bmonth)) 
                {
                    if (date < 20)
                    sign = "Aries"; 
                else
                    sign = "Taurus";
                }
                break;
                
            case "May":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("May".equals(bmonth)) 
                {
                    if (date < 20)
                    sign = "Taurus"; 
                else
                    sign = "Gemini";
                }
                break;
                
            case "June":                
                if (date >= 1 && date <= 30) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("June".equals(bmonth)) 
                {
                    if (date < 22)
                    sign = "Gemini"; 
                else
                    sign = "Cancer";
                }
                break;
                
            case "July":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("July".equals(bmonth)) 
                {
                    if (date < 23)
                    sign = "Cancer"; 
                else
                    sign = "Leo";
                }
                break;
                
            case "August":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("August".equals(bmonth)) 
                {
                    if (date < 22)
                    sign = "Leo"; 
                else
                    sign = "Virgo";
                }
                break;
                
            case "September":                
                if (date >= 1 && date <= 30) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("September".equals(bmonth)) 
                {
                    if (date < 23)
                    sign = "Virgo"; 
                else
                    sign = "Libra";
                }
                break;
                
            case "October":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("October".equals(bmonth)) 
                {
                    if (date < 22)
                    sign = "Libra"; 
                else
                    sign = "Scorpio";
                }
                break;
                
            case "November":               
                if (date >= 1 && date <= 30) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("November".equals(bmonth)) 
                {
                    if (date < 22)
                    sign = "Scorpio"; 
                else
                    sign = "Sagittarius";
                }
                break;
                
            case "December":                
                if (date >= 1 && date <= 31) 
                {
                    JOptionPane.showMessageDialog(null,"Valid date entered");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid date entered");
                }
                if ("December".equals(bmonth)) 
                {
                    if (date < 22)
                    sign = "Sagittarius"; 
                else
                    sign = "Capricorn";
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Invalid month");
        }
        
    JOptionPane.showMessageDialog(null,"The astrological sign for " + date + " " + bmonth + " is " + sign );
    }
}
        
        
   