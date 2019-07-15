package net.arsenaltech.challengealc1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AboutALCActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView;
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setTitle(getString(R.string.about));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = (WebView)findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient()
        {

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler
                    handler, SslError error)
            {
                handler.proceed();
            }
        });




        webView.loadUrl("https://andela.com/alc/");
    }








    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }


}
