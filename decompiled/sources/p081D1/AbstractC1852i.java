package p081D1;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: renamed from: D1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1852i {
    /* JADX INFO: renamed from: a */
    public static Bundle m2706a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    /* JADX INFO: renamed from: b */
    public static void m2707b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m2708c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static void m2709d(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    /* JADX INFO: renamed from: e */
    public static void m2710e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m2711f(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
        viewStructure.setTextStyle(f10, i10, i11, i12);
    }
}
