package p517V2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p468T2.C7218j;

/* JADX INFO: renamed from: V2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7748i implements TransformationMethod {

    /* JADX INFO: renamed from: Y */
    public final TransformationMethod f24425Y;

    public C7748i(TransformationMethod transformationMethod) {
        this.f24425Y = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f24425Y;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C7218j.m7609a().m7611b() != 1) {
            return charSequence;
        }
        C7218j c7218jM7609a = C7218j.m7609a();
        c7218jM7609a.getClass();
        return c7218jM7609a.m7614f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f24425Y;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i10, rect);
        }
    }
}
