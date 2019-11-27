package com.raisac.tourguideapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestuarantDetailsActivity extends AppCompatActivity {
    @BindView(R.id.nameOfRestuarant)
    TextView restuarantName;
    @BindView(R.id.descriptionOfRestuarant)
    TextView Description;
    @BindView(R.id.imageOfRestuarant)
    ImageView restImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        Intent getDetails = getIntent();
        if (getDetails.hasExtra(getString(R.string.details_putintent)) || getDetails.hasExtra(getString(R.string.name_intent))) {
            String name = getDetails.getStringExtra(getString(R.string.name_intent));
            int position = getDetails.getIntExtra(getString(R.string.position_intent), 0);

            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra(getString(R.string.bitmap_intent)),
                    0, getIntent().getByteArrayExtra(getString(R.string.bitmap_intent)).length);

            restuarantName.setText(name);
            switch (position) {
                case 0:
                    Description.setText(getString(R.string.detail1));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 1:
                    Description.setText(getString(R.string.detail2));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 2:
                    Description.setText(getString(R.string.detail3));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 3:
                    Description.setText(getString(R.string.detail4));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 4:
                    Description.setText(getString(R.string.detail5));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 5:
                    Description.setText(getString(R.string.detail6));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 6:
                    Description.setText(getString(R.string.detail7));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 7:
                    Description.setText(getString(R.string.detail8));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 8:
                    Description.setText(getString(R.string.detail9));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 9:
                    Description.setText(getString(R.string.detail10));
                    restImage.setImageBitmap(bitmap);
                    break;
            }


        }
    }
}
