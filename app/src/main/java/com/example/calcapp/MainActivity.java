package com.example.calcapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // Declare views
    private Button btnSettings, btnClear, btnDivide, btnMultiply, btnDelete, btnAdd, btnClearHistory;
    private Button btnMC, btnMR, btnMplus, btnMminus;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnSin, btnCos, btnTan, btnSqrt, btnLn, btnLog, btnPower, btnFactorial;
    private Button btnPi, btnRad, btnExp, btnKasr, btnIntegral, btnDeterminant, btnYaxlitlash;
    private Button btnSkalyarKopaytma, btnDot, btnEquals, btnQavs1, btnQavs2, btnKvadrat, btnKub, btnFoiz;
    private EditText etInput;
    private TextView tvResult;
    private GridLayout gridLayout;
    private RecyclerView rvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Your XML layout

        // Initialize views
        btnSettings = findViewById(R.id.btn_settings);
        btnClear = findViewById(R.id.btn_clear);
        btnDivide = findViewById(R.id.btn_divide);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDelete = findViewById(R.id.btn_delete);
        btnAdd = findViewById(R.id.btn_add);
        etInput = findViewById(R.id.et_input);
        tvResult = findViewById(R.id.tv_result);
        gridLayout = findViewById(R.id.gridLayout);

        // Memory Buttons
        btnMC = findViewById(R.id.btn_mc);
        btnMR = findViewById(R.id.btn_mr);
        btnMplus = findViewById(R.id.btn_mplus);
        btnMminus = findViewById(R.id.btn_mminus);

        // Number and Operator Buttons
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnSqrt = findViewById(R.id.btn_sqrt);
        btnLn = findViewById(R.id.btn_ln);
        btnLog = findViewById(R.id.btn_log);
        btnPower = findViewById(R.id.btn_power);
        btnFactorial = findViewById(R.id.btn_factorial);
        btnPi = findViewById(R.id.btn_pi);
        btnRad = findViewById(R.id.btn_Rad);
        btnExp = findViewById(R.id.btn_exp);
        btnKasr = findViewById(R.id.btn_kasr);
        btnIntegral = findViewById(R.id.btn_integral);
        btnDeterminant = findViewById(R.id.btn_determenant);
        btnYaxlitlash = findViewById(R.id.btn_yaxlitlash);
        btnSkalyarKopaytma = findViewById(R.id.btn_skalyar_kopaytma);
        btnDot = findViewById(R.id.btn_dot);
        btnEquals = findViewById(R.id.btn_equals);
        btnQavs1 = findViewById(R.id.btn_qavs1);
        btnQavs2 = findViewById(R.id.btn_qavs2);
        btnKvadrat = findViewById(R.id.btn_kvadrat);
        btnKub = findViewById(R.id.btn_kub);
        btnFoiz = findViewById(R.id.btn_foiz);

        // Set listeners for buttons
        btnSettings.setOnClickListener(v -> openSettings());
        btnClear.setOnClickListener(v -> clearInput());
        btnDivide.setOnClickListener(v -> appendToInput("/"));
        btnMultiply.setOnClickListener(v -> appendToInput("X"));
        btnDelete.setOnClickListener(v -> deleteLastCharacter());
        btnAdd.setOnClickListener(v -> appendToInput("+"));
        btnEquals.setOnClickListener(v -> calculateResult());

        // Other buttons can be handled similarly
        // For example, btn1, btn2, btn3, etc.
    }

    // Example method for handling operations like add or divide
    private void appendToInput(String value) {
        String currentInput = etInput.getText().toString();
        etInput.setText(currentInput + value);
    }

    private void deleteLastCharacter() {
        String currentInput = etInput.getText().toString();
        if (currentInput.length() > 0) {
            etInput.setText(currentInput.substring(0, currentInput.length() - 1));
        }
    }

    private void clearInput() {
        etInput.setText("");
    }

    private void calculateResult() {
        // Here, you can parse the expression from etInput, calculate and set the result to tvResult
        // Example:
        String input = etInput.getText().toString();
        double result = evaluateExpression(input); // Define your method for evaluation
        tvResult.setText(String.valueOf(result));
    }

    private double evaluateExpression(String expression) {
        // Simple logic or use libraries to evaluate the expression
        return 0.0;  // Placeholder result
    }

    private void openSettings() {
        // Open settings activity or display settings
    }
}
