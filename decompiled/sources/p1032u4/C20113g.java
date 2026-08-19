package p1032u4;

import android.text.Layout;
import p1053v3.C20420a;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: u4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20113g {

    /* JADX INFO: renamed from: c */
    public CharSequence f63725c;

    /* JADX INFO: renamed from: a */
    public long f63723a = 0;

    /* JADX INFO: renamed from: b */
    public long f63724b = 0;

    /* JADX INFO: renamed from: d */
    public int f63726d = 2;

    /* JADX INFO: renamed from: e */
    public float f63727e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f63728f = 1;

    /* JADX INFO: renamed from: g */
    public int f63729g = 0;

    /* JADX INFO: renamed from: h */
    public float f63730h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f63731i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f63732j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f63733k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX INFO: renamed from: a */
    public final C20420a m20950a() {
        Layout.Alignment alignment;
        float f10 = this.f63730h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f63726d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f63731i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f63726d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        C20420a c20420a = new C20420a();
        int i13 = this.f63726d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            AbstractC20734X.m21224A(i13, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c20420a.f64543c = alignment;
        float f12 = this.f63727e;
        int i14 = this.f63728f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        c20420a.f64545e = f11;
        c20420a.f64546f = i14;
        c20420a.f64547g = this.f63729g;
        c20420a.f64548h = f10;
        c20420a.f64549i = i11;
        float f13 = this.f63732j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 == 1) {
            f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        c20420a.f64552l = Math.min(f13, f10);
        c20420a.f64556p = this.f63733k;
        CharSequence charSequence = this.f63725c;
        if (charSequence != null) {
            c20420a.f64541a = charSequence;
        }
        return c20420a;
    }
}
