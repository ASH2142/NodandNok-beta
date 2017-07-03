package ru.hg.nodandnok;

/**
 * Created by vampi on 27.04.2017.
 */

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tab2nod extends Matem {
    Button button1;
    EditText num1, num2;
    TextView result;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2nod, container, false);

        button1 = (Button) rootView.findViewById(R.id.button2);
        num1 = (EditText) rootView.findViewById(R.id.num1);
        num2 = (EditText) rootView.findViewById(R.id.num2);
        result = (TextView) rootView.findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 0;
                int b = 0;
                int res = 0;

                // Проверяем поля на пустоту
                if (TextUtils.isEmpty(num1.getText().toString())
                        || TextUtils.isEmpty(num2.getText().toString())) {
                    return;
                }

                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());

                switch (v.getId()){
                    case R.id.button2:
                        res = gcd(a, b);
                        break;
                    default:
                        break;
                }
                result.setText("" + res);
            }
        });

        return rootView;
    }
}
