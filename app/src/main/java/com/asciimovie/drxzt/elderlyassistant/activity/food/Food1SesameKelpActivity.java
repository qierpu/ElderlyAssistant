package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.asciimovie.drxzt.elderlyassistant.R;

public class Food1SesameKelpActivity extends AppCompatActivity implements View.OnClickListener{

    private View view_star;
    private ImageView ivStar;
    private int choose=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food1_sesame_kelp);
        view_star=findViewById(R.id.view_star);
        ivStar=findViewById(R.id.iv_star);
        view_star.setOnClickListener(this);
        ivStar.setSelected(false);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                Intent intent1 = new Intent(Food1SesameKelpActivity.this,FoodActivity.class);
                startActivity(intent1);
                break;
            case R.id.view_star: {
                if (choose == 0) {
                    ivStar.setSelected(true);
                    choose = 1;
                } else {
                    ivStar.setSelected(false);
                    choose = 0;
                }
                break;
            }
        }
    }

}
