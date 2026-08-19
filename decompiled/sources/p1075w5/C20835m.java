package p1075w5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import p1071w0.AbstractC20734X;
import p1098x5.C21129h;
import p1098x5.EnumC21128g;

/* JADX INFO: renamed from: w5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C20835m {

    /* JADX INFO: renamed from: a */
    public final Context f66238a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f66239b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f66240c;

    /* JADX INFO: renamed from: d */
    public final C21129h f66241d;

    /* JADX INFO: renamed from: e */
    public final EnumC21128g f66242e;

    /* JADX INFO: renamed from: f */
    public final boolean f66243f;

    /* JADX INFO: renamed from: g */
    public final boolean f66244g;

    /* JADX INFO: renamed from: h */
    public final boolean f66245h;

    /* JADX INFO: renamed from: i */
    public final String f66246i;

    /* JADX INFO: renamed from: j */
    public final C17348o f66247j;

    /* JADX INFO: renamed from: k */
    public final C20839q f66248k;

    /* JADX INFO: renamed from: l */
    public final C20836n f66249l;

    /* JADX INFO: renamed from: m */
    public final EnumC20824b f66250m;

    /* JADX INFO: renamed from: n */
    public final EnumC20824b f66251n;

    /* JADX INFO: renamed from: o */
    public final EnumC20824b f66252o;

    public C20835m(Context context, Bitmap.Config config, ColorSpace colorSpace, C21129h c21129h, EnumC21128g enumC21128g, boolean z6, boolean z10, boolean z11, String str, C17348o c17348o, C20839q c20839q, C20836n c20836n, EnumC20824b enumC20824b, EnumC20824b enumC20824b2, EnumC20824b enumC20824b3) {
        this.f66238a = context;
        this.f66239b = config;
        this.f66240c = colorSpace;
        this.f66241d = c21129h;
        this.f66242e = enumC21128g;
        this.f66243f = z6;
        this.f66244g = z10;
        this.f66245h = z11;
        this.f66246i = str;
        this.f66247j = c17348o;
        this.f66248k = c20839q;
        this.f66249l = c20836n;
        this.f66250m = enumC20824b;
        this.f66251n = enumC20824b2;
        this.f66252o = enumC20824b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20835m) {
            C20835m c20835m = (C20835m) obj;
            if (AbstractC16544l.m18089b(this.f66238a, c20835m.f66238a) && this.f66239b == c20835m.f66239b && ((Build.VERSION.SDK_INT < 26 || AbstractC16544l.m18089b(this.f66240c, c20835m.f66240c)) && AbstractC16544l.m18089b(this.f66241d, c20835m.f66241d) && this.f66242e == c20835m.f66242e && this.f66243f == c20835m.f66243f && this.f66244g == c20835m.f66244g && this.f66245h == c20835m.f66245h && AbstractC16544l.m18089b(this.f66246i, c20835m.f66246i) && AbstractC16544l.m18089b(this.f66247j, c20835m.f66247j) && AbstractC16544l.m18089b(this.f66248k, c20835m.f66248k) && AbstractC16544l.m18089b(this.f66249l, c20835m.f66249l) && this.f66250m == c20835m.f66250m && this.f66251n == c20835m.f66251n && this.f66252o == c20835m.f66252o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f66239b.hashCode() + (this.f66238a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f66240c;
        int iHashCode2 = (((((((this.f66242e.hashCode() + ((this.f66241d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f66243f ? 1231 : 1237)) * 31) + (this.f66244g ? 1231 : 1237)) * 31) + (this.f66245h ? 1231 : 1237)) * 31;
        String str = this.f66246i;
        return this.f66252o.hashCode() + ((this.f66251n.hashCode() + ((this.f66250m.hashCode() + AbstractC20734X.m21250u(AbstractC20734X.m21250u((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f66247j.f55284Y)) * 31, 31, this.f66248k.f66263a), 31, this.f66249l.f66254Y)) * 31)) * 31);
    }
}
