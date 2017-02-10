package github.com.crazyalarmclock.parabola;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }
    private int x;
    private int y;

    class DrawView extends View {
        Paint p;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
            protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80, 102, 204, 255);
            p.setColor(Color.BLACK);
            p.setStrokeWidth(5);
            x=2;
            y=1;
                for (int i=0; i<200; i++){
                  y=-(x*x);
                    canvas.drawPoint(500+x ,1500+y,p );
                    canvas.drawPoint(500-x ,1500+y,p );
                    x++;
            }

        }

    }
}