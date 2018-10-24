package android.cx.com.cxpdf;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.leahy.pdf.DocumentActivity;

import java.io.File;

/**
 * https://github.com/archko/Mupdf
 */

public class MainActivity extends AppCompatActivity {

    private String sample = "/storage/emulated/0/tencent/TIMfile_recv/sample.pdf";
    private String android = "/storage/emulated/0/tencent/TIMfile_recv/android.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sample(View view) {
        Intent intent = new Intent(this, DocumentActivity.class);

        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.fromFile(new File(sample)));
        startActivity(intent);

    }


    public void android(View view) {
        Intent intent = new Intent(this, DocumentActivity.class);

        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.fromFile(new File(android)));
        startActivity(intent);

    }


}
