package p033B5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: B5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0817a implements InterfaceC0829m {

    /* JADX INFO: renamed from: a */
    public final Bitmap f2281a;

    /* JADX INFO: renamed from: b */
    public final boolean f2282b;

    public C0817a(Bitmap bitmap, boolean z6) {
        this.f2281a = bitmap;
        this.f2282b = z6;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: b */
    public final long mo1876b() {
        int i10;
        int allocationByteCount;
        Bitmap bitmap = this.f2281a;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            allocationByteCount = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i10 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i10 = 2;
            } else {
                i10 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            allocationByteCount = i10 * height;
        }
        return allocationByteCount;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: c */
    public final boolean mo1877c() {
        return this.f2282b;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: d */
    public final void mo1878d(Canvas canvas) {
        canvas.drawBitmap(this.f2281a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0817a)) {
            return false;
        }
        C0817a c0817a = (C0817a) obj;
        return AbstractC16544l.m18089b(this.f2281a, c0817a.f2281a) && this.f2282b == c0817a.f2282b;
    }

    @Override // p033B5.InterfaceC0829m
    public final int getHeight() {
        return this.f2281a.getHeight();
    }

    @Override // p033B5.InterfaceC0829m
    public final int getWidth() {
        return this.f2281a.getWidth();
    }

    public final int hashCode() {
        return (this.f2281a.hashCode() * 31) + (this.f2282b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapImage(bitmap=");
        sb2.append(this.f2281a);
        sb2.append(", shareable=");
        return AbstractC3794B0.m4499x(sb2, this.f2282b, ')');
    }
}
