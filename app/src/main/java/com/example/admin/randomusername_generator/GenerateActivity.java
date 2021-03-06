package com.example.admin.randomusername_generator;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateActivity extends AppCompatActivity {

    public int number;
    private boolean shake;
    // The following are used for the shake detection
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
        generateName(null);

        final MainActivity main = new MainActivity();
        Switch mySwitch = (Switch) findViewById(R.id.switch2);
        Bundle bundle = getIntent().getExtras();
        boolean shakeable = bundle.getBoolean("shake");
        shake = shakeable;

        mySwitch.setChecked(shake);

        if (mySwitch != null) {
            mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        shake = true;
                    }else if(!isChecked){
                        shake = false;
                    }
                }
            });
        }


        // ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {
                if (shake) {
                    generateName(null);
                }
            }
        });

    }

    private void count(){
        //Counting up!
        TextView myTextView = (TextView)findViewById(R.id.generate_count);
        CharSequence sNumber = myTextView.getText();
        int num = (Integer.valueOf((String) sNumber));
        ++num;
        String sNum = String.valueOf(num);
        CharSequence cNum = sNum;
        myTextView.setText(cNum);
        number = num;
    }

    public void generateName(View v){
            List<String> firstWord = generateFirstWordList();
            List<String> secondWord = generateSecondWordList();
            List<String> thirdWord = generateThirdWordList();
            Random randomGenerator = new Random();
            int index1 = randomGenerator.nextInt(firstWord.size());
            String first = firstWord.get(index1);
            int index2 = randomGenerator.nextInt(secondWord.size());
            String second = secondWord.get(index2);
            int index3 = randomGenerator.nextInt(thirdWord.size());
            String third = thirdWord.get(index3);
            String finalWord = first + second + third;
            CharSequence word = finalWord;
            TextView tv = (TextView) findViewById(R.id.textViewName);
            tv.setText(word);

            count();
    }

    private List generateFirstWordList(){
        List<String> firstWord = new ArrayList<String>();
        firstWord.add("The");
        firstWord.add("Mr.");
        firstWord.add("Mrs.");
        firstWord.add("Dr.");
        firstWord.add("");
        firstWord.add("");
        firstWord.add("");
        return firstWord;
    }
    private List generateSecondWordList(){
        List<String> secondWord = new ArrayList<String>();

        secondWord.add("");
        secondWord.add("");
        secondWord.add("");
        secondWord.add("Cool");
        secondWord.add("Crazy");
        secondWord.add("Fancy");
        secondWord.add("Anxious");
        secondWord.add("Charming");
        secondWord.add("Stupid");
        secondWord.add("Happy");
        secondWord.add("Lucky");
        secondWord.add("Wise");
        secondWord.add("Soft");
        secondWord.add("Big");
        secondWord.add("Fast");
        secondWord.add("Loud");
        secondWord.add("Heavy");
        secondWord.add("Wet");
        secondWord.add("Rich");
        secondWord.add("Old");
        secondWord.add("Dead");
        secondWord.add("Young");
        secondWord.add("Ugly");
        secondWord.add("Shy");
        secondWord.add("Lone");
        secondWord.add("Danger");
        secondWord.add("Nasty");
        secondWord.add("Walking");
        secondWord.add("Little");
        secondWord.add("Incredible");
        secondWord.add("Sweaty");
        secondWord.add("Ripped");
        secondWord.add("Pumped");
        secondWord.add("Buffy");
        secondWord.add("Juiced");
        secondWord.add("Chiseled");
        secondWord.add("Hairy");
        secondWord.add("Slimy");
        secondWord.add("Furry");
        secondWord.add("Tiny");
        secondWord.add("Small");
        secondWord.add("Thick");
        secondWord.add("Slippery");
        secondWord.add("Flying");
        secondWord.add("Growing");
        secondWord.add("Shrinking");
        secondWord.add("Yellow");
        secondWord.add("Red");
        secondWord.add("Blue");
        secondWord.add("Evil");
        secondWord.add("Dark");
        secondWord.add("Clever");
        secondWord.add("Clownish");
        secondWord.add("Attractive");
        secondWord.add("Rebellious");
        secondWord.add("Swollen");
        secondWord.add("Abnormal");
        secondWord.add("Elite");
        secondWord.add("Fabulous");
        secondWord.add("Fanatical");
        secondWord.add("Fearless");
        secondWord.add("Hallowed");
        secondWord.add("Idiotic");
        secondWord.add("Huge");
        secondWord.add("Macabre");
        secondWord.add("Nippy");
        secondWord.add("Quirky");
        secondWord.add("Ritzy");
        secondWord.add("Shaggy");
        secondWord.add("Sexy");
        secondWord.add("Cocky");
        secondWord.add("Hot");
        secondWord.add("Bearded");
        secondWord.add("Naked");
        secondWord.add("Fluffy");
        secondWord.add("Shaky");
        secondWord.add("Sticky");
        secondWord.add("Slimy");
        secondWord.add("Violent");
        secondWord.add("Unholy");
        secondWord.add("Holy");
        secondWord.add("Twisted");

        return secondWord;
    }
    private List generateThirdWordList() {
        List<String> thirdWord = new ArrayList<String>();
        thirdWord.add("Fighter");
        thirdWord.add("Runner");
        thirdWord.add("Hustler");
        thirdWord.add("Believer");
        thirdWord.add("Sucker");
        thirdWord.add("Student");
        thirdWord.add("Teacher");
        thirdWord.add("Fish");
        thirdWord.add("Dick");
        thirdWord.add("Dude");
        thirdWord.add("Hunter");
        thirdWord.add("God");
        thirdWord.add("Dog");
        thirdWord.add("Yeezy");
        thirdWord.add("Brick");
        thirdWord.add("Ginger");
        thirdWord.add("Face");
        thirdWord.add("Fatty");
        thirdWord.add("Boy");
        thirdWord.add("Girl");
        thirdWord.add("Pirate");
        thirdWord.add("Batman");
        thirdWord.add("Grandpa");
        thirdWord.add("Snoopy");
        thirdWord.add("Whipper");
        thirdWord.add("Snapper");
        thirdWord.add("Fucker");
        thirdWord.add("Goblin");
        thirdWord.add("Milf");
        thirdWord.add("Cock");
        thirdWord.add("Pussy");
        thirdWord.add("Nipple");
        thirdWord.add("Jizz");
        thirdWord.add("Potato");
        thirdWord.add("Camel");
        thirdWord.add("Butt");
        thirdWord.add("Ass");
        thirdWord.add("Cookie");
        thirdWord.add("Wiener");
        thirdWord.add("Mother");

        return thirdWord;
    }
    @Override
    public void onResume() {
        super.onResume();
        // Add the following line to register the Session Manager Listener onResume
        mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        // Add the following line to unregister the Sensor Manager onPause
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }

}
