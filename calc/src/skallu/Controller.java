/**
 *
 * @author: Skallu
 *
 */

package skallu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    // important flags
    private boolean isAddition;
    private boolean isSubtraction;
    private boolean isMultiplication;
    private boolean isDivision;
    private boolean isPowN;
    private boolean isRootN;
    private boolean isEnd;

    // important variables
    private double value1;
    private double value2;

    // label
    @FXML
    private Label label;

    // functional buttons
    @FXML
    private Button ac;
    public void acOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == ac) {
            label.setText("0");

            isAddition = false;
            isSubtraction = false;
            isMultiplication = false;
            isDivision = false;
            isPowN = false;
            isRootN = false;
            isEnd = false;
        }
    }

    // calculation buttons
    @FXML
    private Button divide;
    public void division(ActionEvent actionEvent) {
        if (actionEvent.getSource() == divide) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isDivision = true;
        }
    }

    @FXML
    private Button multiply;
    public void multiplication(ActionEvent actionEvent) {
        if (actionEvent.getSource() == multiply) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isMultiplication = true;
        }
    }

    @FXML
    private Button subtract;
    public void subtraction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == subtract) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isSubtraction = true;
        }
    }

    @FXML
    private Button add;
    public void addition(ActionEvent actionEvent) {
        if (actionEvent.getSource() == add) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isAddition = true;
        }
    }

    @FXML
    private Button powN;
    public void powNOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == powN) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isPowN = true;
        }
    }

    @FXML
    private Button rootN;
    public void rootNOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == rootN) {
            value1 = Double.parseDouble(label.getText());
            label.setText("");

            isRootN = true;
        }
    }

    @FXML
    private Button equals;
    public void result(ActionEvent actionEvent) {
        if (actionEvent.getSource() == equals) {

            if (isAddition == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(value1 + value2));
                    isAddition = false;
                } else
                    label.setText("err");

            } else if (isSubtraction == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(value1 - value2));
                    isSubtraction = false;
                } else
                    label.setText("err");

            } else if (isMultiplication == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(value1 * value2));
                    isMultiplication = false;
                } else
                    label.setText("err");

            } else if (isDivision == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(value1 / value2));
                    isDivision = false;
                } else
                    label.setText("err");

            } else if (isPowN == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(Math.pow(value1, value2)));
                    isDivision = false;
                } else
                    label.setText("err");

            } else if (isRootN == true) {
                if (!label.getText().equals("")) {
                    value2 = Double.parseDouble(label.getText());
                    label.setText(Double.toString(Math.pow(value1, (1/value2))));
                    isRootN = false;
                } else
                    label.setText("err");

            }

            isEnd = true;
        }
    }

    // numeric buttons
    @FXML
    private Button zero;
    public void zeroOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == zero) {
            if (!label.getText().equals("0"))
                label.setText(label.getText() + "0");
        }
    }

    @FXML
    private Button coma;
    public void comaOnAction(ActionEvent actionEvent) {
        if(actionEvent.getSource() == coma) {
            if (!label.getText().contains(".")) {
                label.setText(label.getText() + ".");
            }
        }
    }

    @FXML
    private Button one;
    public void oneOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one) {
            if (label.getText().equals("0") || isEnd == true) {
                label.setText("1");
            } else
                label.setText(label.getText() + "1");
        }
        isEnd = false;
    }

    @FXML
    private Button two;
    public void twoOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == two) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("2");
            else
                label.setText(label.getText() + "2");
        }
        isEnd = false;
    }

    @FXML
    private Button three;
    public void threeoOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == three) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("3");
            else
                label.setText(label.getText() + "3");
        }
        isEnd = false;
    }

    @FXML
    private Button four;
    public void fourOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == four) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("4");
            else
                label.setText(label.getText() + "4");
        }
        isEnd = false;
    }

    @FXML
    private Button five;
    public void fiveOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == five) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("5");
            else
                label.setText(label.getText() + "5");
        }
        isEnd = false;
    }

    @FXML
    private Button six;
    public void sixOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == six) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("6");
            else
                label.setText(label.getText() + "6");
        }
        isEnd = false;
    }

    @FXML
    private Button seven;
    public void sevenOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == seven) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("7");
            else
                label.setText(label.getText() + "7");
        }
        isEnd = false;
    }

    @FXML
    private Button eight;
    public void eightOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == eight) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("8");
            else
                label.setText(label.getText() + "8");
        }
        isEnd = false;
    }

    @FXML
    private Button nine;
    public void nineOnAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == nine) {
            if (label.getText().equals("0") || isEnd == true)
                label.setText("9");
            else
                label.setText(label.getText() + "9");
        }
        isEnd = false;
    }

}
