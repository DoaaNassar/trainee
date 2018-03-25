package duaa.traineeproject.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import static duaa.traineeproject.Constants.FONTS_APP;



public class FontTextViewRegular extends AppCompatTextView {
    public FontTextViewRegular(Context context) {
        super(context);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    public FontTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    public FontTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }
}
