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

public class PublicPlacesDetailsActivity extends AppCompatActivity {
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
                    0, getIntent().getByteArrayExtra("byteArray").length);

            restuarantName.setText(name);
            switch (position) {
                case 0:
                    Description.setText(getString(R.string.Gadaffi_Mosque_Old_Kampala));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 1:
                    Description.setText(getString(R.string.Kabakas_Palace_and_Idi_Amins_Torture_Chambers));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 2:
                    Description.setText(getString(R.string.Ba_hai_Temple));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 3:
                    Description.setText(getString(R.string.Namirembe_Catherdral));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 4:
                    Description.setText(getString(R.string.Owino_Market));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 5:
                    Description.setText(getString(R.string.Lake_Victoria));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 6:
                    Description.setText(getString(R.string.Craft_Markets));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 7:
                    Description.setText(getString(R.string.Entebbe_Botanical_Gardens));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 8:
                    Description.setText(getString(R.string.The_Uganda_National_Museum));
                    restImage.setImageBitmap(bitmap);
                    break;
                case 9:
                    Description.setText(getString(R.string.Rubaga_Cathdral));
                    restImage.setImageBitmap(bitmap);
                    break;
            }


        }
    }
}
