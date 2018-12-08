package spartacode.com.broadcastrecieverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Executed CustomBroadcast Receiver.", Toast.LENGTH_SHORT).show();
    }
}
