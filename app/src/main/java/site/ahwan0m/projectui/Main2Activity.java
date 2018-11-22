package site.ahwan0m.projectui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView webku;
    WebSettings setku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webku = (WebView)findViewById(R.id.web1);
        setku = webku.getSettings();
        webku.setWebViewClient(new WebViewClient());
        webku.loadUrl("https://www.ahwan0m.site");
    }
}
