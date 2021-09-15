package Lab7.Bai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumber(firstNumber, secondNumber);

                theView.setCalcSotion(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You need to enter 2 Integer");
            }
        }
    }
}


