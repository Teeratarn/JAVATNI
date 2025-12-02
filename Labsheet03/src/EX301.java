import javax.swing.*;

public class EX301 {
    public static void main(String[] args) {
        double totalPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter total price:"));

        int coupon = JOptionPane.showConfirmDialog(null,
                "Do you have coupon?");
                /*"Coupon",
                    JOptionPane.YES_OPTION;*/ //ไว้สำหรับไม่ต้องการ cancle to dislod box

        if(coupon==JOptionPane.YES_OPTION){ //if(coupon==0)
            int discountCoupon = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%) on the coupon"));
            double discount = totalPrice * discountCoupon /100;
            double pay = totalPrice - discount;
            JOptionPane.showMessageDialog(null,
                    "You get discount" + discount + "Baht.\n"+
                            "Total price is" + totalPrice + "Baht");
        }else{
            if(totalPrice >=1500){
                double discount = totalPrice * 10/100;
                double pay = totalPrice - discount;
                JOptionPane.showMessageDialog(null,
                        "You get discount 10%("+ discount +")\n" +
                                "Total price is "+ totalPrice + "Baht");
            }else{
                JOptionPane.showMessageDialog(null,
                        "Total price is "+ totalPrice + "Baht");
            }
            JOptionPane.showMessageDialog(null,
                    "Total price is" + totalPrice + "Baht");
        }

    }
}
