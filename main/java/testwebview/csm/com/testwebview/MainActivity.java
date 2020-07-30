package testwebview.csm.com.testwebview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv;
        wv = (WebView) findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true); ///------- 设置javascript 可用
        wv.addJavascriptInterface( new JSInterface(), "AndriodJS");
        wv.loadUrl("file:///android_asset/index.html");
    }
    private final class JSInterface {
        @SuppressLint("JavascriptInterface")
        @JavascriptInterface
        public void android() {
            Log.d("cnm", "android");
        }

        @SuppressLint("JavascriptInterface")
        @JavascriptInterface
        public void android1() {
            Log.d("cnm", "android1");
        }
    }
}
