package com.example.reallyannoyingapp.navigation_bar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.reallyannoyingapp.R;


public class contactUs extends Fragment {
ImageButton call, gmail, twitter, github, youtube;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_contact_us, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();
    }

    private void init() {
        call = getView().findViewById(R.id.phone_logo);
        gmail = getView().findViewById(R.id.gmail_logo);
        twitter = getView().findViewById(R.id.twitter_logo);
        github = getView().findViewById(R.id.github_logo);
        youtube = getView().findViewById(R.id.youtube_logo);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textMessage = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:0500000000"));
                textMessage.putExtra("sms_body", "כאן תיהיה הודעה כלשהיא כמובן להשתמש בשדות ולא כמו שעשיתי פה ");
                try {
                    startActivity(textMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "generalkenobi@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "נושא");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "מלל מובנה כלשהוא שנרצה לתת למשתמש כברירת מחדל ");
                try {
                    startActivity(emailIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/github"));
                startActivity(browserIntent);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/baruchll"));
                startActivity(browserIntent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstleyVEVO"));
                try {
                    startActivity(youtube);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }


}


