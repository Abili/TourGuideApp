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

public class AttractionsDetailsActivity extends AppCompatActivity {
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

        /*
        recieve intents from the prvious activity
         */
        Intent getDetails = getIntent();

        /*
        first check if the intent has the specific intent intended ti tbe recieved
         */
        if (getDetails.hasExtra(getString(R.string.details_putintent)) ||
                getDetails.hasExtra(getString(R.string.name_intent))) {
            /*
            if the intent is available then save then to specicif data types depending on the
            intent being recieved eithe string , integer or bitmap which s what iam recieving for this case
             */
            String name = getDetails.getStringExtra(getString(R.string.name_intent));
            int position = getDetails.getIntExtra(getString(R.string.position_intent), 0);

            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra(getString(R.string.bitmap_intent)),
                    0, getIntent().getByteArrayExtra(getString(R.string.bitmap_intent)).length);

            /*
            set the recieved name intent to the restuarant name textview
             */
            restuarantName.setText(name);

            /*
            using the switch for each position of an item on the list recieved from the previous activity
            set the corresponding Description from thee strings.xml, and a correcponding image
             */
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
