package github.com.crazyalarmclock.recursia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import static android.R.attr.level;

/**
 * Created by chrx on 11.03.17.
 */


public class MyDraw extends View {

    Paint paint;
    int w, h;


    public MyDraw(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCicrles(canvas,w/2,h/2,100,5);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.w = w;
        this.h = h;

        super.onSizeChanged(w, h, oldw, oldh);
    }

    protected void drawCicrles(Canvas canvas, int x, int y, int r, int level) {
        canvas.drawCircle(x, y, r, paint);

        if (level > 0) {
            drawCicrles(canvas, x + r, y, r/2, level - 1);
            drawCicrles(canvas, x - r, y, r/2, level - 1);
            drawCicrles(canvas, x, y + r, r/2, level - 1);
            drawCicrles(canvas, x, y - r, r/2, level - 1);

        }
    }

    }

