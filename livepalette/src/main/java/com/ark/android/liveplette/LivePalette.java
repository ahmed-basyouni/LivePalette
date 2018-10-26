package com.ark.android.liveplette;

import android.arch.lifecycle.LiveData;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.graphics.Palette;

import java.util.List;

/**
 * Created by ark on 23/10/2018.
 *
 */

public class LivePalette {

    @NonNull
    public static LiveData<List<Palette.Swatch>> analyze(@NonNull Bitmap bitmap){
        return new BitmapAnalyzer(bitmap);
    }
}
