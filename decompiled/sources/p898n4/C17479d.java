package p898n4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import p001A.C0013G0;
import p1053v3.C20421b;

/* JADX INFO: renamed from: n4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17479d {

    /* JADX INFO: renamed from: c */
    public static final C0013G0 f55888c = new C0013G0(17);

    /* JADX INFO: renamed from: a */
    public final C20421b f55889a;

    /* JADX INFO: renamed from: b */
    public final int f55890b;

    public C17479d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z6, int i12, int i13) {
        boolean z10;
        int i14;
        if (z6) {
            i14 = i12;
            z10 = true;
        } else {
            z10 = false;
            i14 = -16777216;
        }
        this.f55889a = new C20421b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i14, Integer.MIN_VALUE, 0.0f);
        this.f55890b = i13;
    }
}
