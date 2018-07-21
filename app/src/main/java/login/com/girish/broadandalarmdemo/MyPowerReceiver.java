package login.com.girish.broadandalarmdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyPowerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String action = intent.getAction();
        
        if (action!=null){
            switch (action){
                case Intent.ACTION_POWER_CONNECTED:
                    //perform some logic
                    Toast.makeText(context, "POWER CONNECTED...", Toast.LENGTH_SHORT).show();
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    //perform some logic
                    Toast.makeText(context, "POWER DISCONNECTED...", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(context, "Default", Toast.LENGTH_SHORT).show();
                    break;
            }

        }else {
            Toast.makeText(context, "FROM CLOCK...", Toast.LENGTH_SHORT).show();
        }

    }
}
