package com.example.facultyofscience;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {
    Button events;
    Button news;
    Button gpa;
    Button facebook;
    Button adds;
    Button suggestions;



  /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        NotificationChannel channel = new NotificationChannel("NotificationChannel", "NotificationChannel", NotificationManager.IMPORTANCE_DEFAULT);
        NotificationManager manger = getSystemService(NotificationManager.class);
        manger.createNotificationChannel(channel);
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        events = findViewById(R.id.events);
        news = findViewById(R.id.news);
        gpa = findViewById(R.id.gpa);
        facebook = findViewById(R.id.facebook);
        adds = findViewById(R.id.adds);
        suggestions = findViewById(R.id.suggestions);

    }

    public void onClickEvents(View view)
    {
      Intent intent=new Intent(this,Service.class);
        startActivity(intent);
        /*public static void sendNotification(Context context, int channelId, String contentTitle, String contentText, PendingIntent pendingIntent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "NotificationChannel");
        builder.setContentTitle(contentTitle);
        builder.setContentText(contentText);
        builder.setSmallIcon(R.drawable.facultylogo);
        builder.setAutoCancel(true);
        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
        builder.setContentIntent(pendingIntent);
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
        managerCompat.notify(channelId, builder.build());
    */
    }

    public void onClickNews(View view)
    {
        Intent intent=new Intent(this, News.class);
        startActivity(intent);
    }

    public void onClickGpa(View view)
    {
       Intent intent=new Intent(this,GPA.class);
        startActivity(intent);
    }

    public void onClickFacebook(View view) {
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/672109416181270"));
            startActivity(intent);

        } catch( Exception e ){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/FacultyofScienceASU"));
            startActivity(intent);
        }
    }

    public void onClickAdds(View view)
    {
        Intent intent=new Intent(this,Adds.class);
        startActivity(intent);
    }

    public void onClickSuggestions(View view)
    {
        Intent intent = new Intent(this,Suggestions.class);
        startActivity(intent);
    }


}
