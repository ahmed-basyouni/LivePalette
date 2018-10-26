package com.ark.android.liveplette;

import android.arch.lifecycle.LiveData;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.graphics.Palette;
import android.util.Log;

import java.util.List;

/**
 * Created by ark on 23/10/2018.
 *
 */

public class BitmapAnalyzer extends LiveData<List<Palette.Swatch>> {

    private static final String TAG = LivePalette.class.getSimpleName();

    private Bitmap bitmap;
    private List<Palette.Swatch> swatches;

    BitmapAnalyzer(@NonNull Bitmap bitmap) {
        this.bitmap = bitmap;
    }


    @Override
    protected void onActive() {
        super.onActive();
        if (swatches == null || swatches.isEmpty()) {
            startBitmapAnalysis();
        } else {
            setValue(swatches);
        }
    }

    /**
     * pass bitmap to {@link Palette} to start the analyzing processes
     */
    private void startBitmapAnalysis() {
        if (bitmap != null) {
            Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                @Override
                public void onGenerated(@Nullable Palette palette) {
                    if (palette != null) {
                        swatches = palette.getSwatches();
                        if (!swatches.isEmpty()) {
                            setValue(swatches);
                        }
                    }
                }
            });
        } else {
            setValue(null);
            Log.w(TAG, "Bitmap is null");
        }
    }

    /**
     * Bitmap is heavy resource so release it when the observers count is zero
     */
    @Override
    protected void onInactive() {
        super.onInactive();
        if (!hasObservers()) {
            bitmap = null;
        }
    }
}
