package p1075w5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0563B;
import p1098x5.EnumC21125d;
import p1144z5.InterfaceC21801e;

/* JADX INFO: renamed from: w5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20825c {

    /* JADX INFO: renamed from: a */
    public final AbstractC0563B f66161a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0563B f66162b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0563B f66163c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0563B f66164d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC21801e f66165e;

    /* JADX INFO: renamed from: f */
    public final EnumC21125d f66166f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f66167g;

    /* JADX INFO: renamed from: h */
    public final boolean f66168h;

    /* JADX INFO: renamed from: i */
    public final boolean f66169i;

    /* JADX INFO: renamed from: j */
    public final Drawable f66170j;

    /* JADX INFO: renamed from: k */
    public final Drawable f66171k;

    /* JADX INFO: renamed from: l */
    public final Drawable f66172l;

    /* JADX INFO: renamed from: m */
    public final EnumC20824b f66173m;

    /* JADX INFO: renamed from: n */
    public final EnumC20824b f66174n;

    /* JADX INFO: renamed from: o */
    public final EnumC20824b f66175o;

    public C20825c(AbstractC0563B abstractC0563B, AbstractC0563B abstractC0563B2, AbstractC0563B abstractC0563B3, AbstractC0563B abstractC0563B4, InterfaceC21801e interfaceC21801e, EnumC21125d enumC21125d, Bitmap.Config config, boolean z6, boolean z10, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC20824b enumC20824b, EnumC20824b enumC20824b2, EnumC20824b enumC20824b3) {
        this.f66161a = abstractC0563B;
        this.f66162b = abstractC0563B2;
        this.f66163c = abstractC0563B3;
        this.f66164d = abstractC0563B4;
        this.f66165e = interfaceC21801e;
        this.f66166f = enumC21125d;
        this.f66167g = config;
        this.f66168h = z6;
        this.f66169i = z10;
        this.f66170j = drawable;
        this.f66171k = drawable2;
        this.f66172l = drawable3;
        this.f66173m = enumC20824b;
        this.f66174n = enumC20824b2;
        this.f66175o = enumC20824b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20825c) {
            C20825c c20825c = (C20825c) obj;
            if (AbstractC16544l.m18089b(this.f66161a, c20825c.f66161a) && AbstractC16544l.m18089b(this.f66162b, c20825c.f66162b) && AbstractC16544l.m18089b(this.f66163c, c20825c.f66163c) && AbstractC16544l.m18089b(this.f66164d, c20825c.f66164d) && AbstractC16544l.m18089b(this.f66165e, c20825c.f66165e) && this.f66166f == c20825c.f66166f && this.f66167g == c20825c.f66167g && this.f66168h == c20825c.f66168h && this.f66169i == c20825c.f66169i && AbstractC16544l.m18089b(this.f66170j, c20825c.f66170j) && AbstractC16544l.m18089b(this.f66171k, c20825c.f66171k) && AbstractC16544l.m18089b(this.f66172l, c20825c.f66172l) && this.f66173m == c20825c.f66173m && this.f66174n == c20825c.f66174n && this.f66175o == c20825c.f66175o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f66167g.hashCode() + ((this.f66166f.hashCode() + ((this.f66165e.hashCode() + ((this.f66164d.hashCode() + ((this.f66163c.hashCode() + ((this.f66162b.hashCode() + (this.f66161a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f66168h ? 1231 : 1237)) * 31) + (this.f66169i ? 1231 : 1237)) * 31;
        Drawable drawable = this.f66170j;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f66171k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f66172l;
        return this.f66175o.hashCode() + ((this.f66174n.hashCode() + ((this.f66173m.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
