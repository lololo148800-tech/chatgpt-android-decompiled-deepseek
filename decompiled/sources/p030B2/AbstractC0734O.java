package p030B2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: B2.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734O {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m1567a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static void m1568b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
    }
}
