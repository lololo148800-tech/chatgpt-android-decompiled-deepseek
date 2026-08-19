package p204I1;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9160K3;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: I1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C3577H {

    /* JADX INFO: renamed from: a */
    public final C3590f f10882a;

    /* JADX INFO: renamed from: b */
    public final C3582M f10883b;

    /* JADX INFO: renamed from: c */
    public final List f10884c;

    /* JADX INFO: renamed from: d */
    public final int f10885d;

    /* JADX INFO: renamed from: e */
    public final boolean f10886e;

    /* JADX INFO: renamed from: f */
    public final int f10887f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7537b f10888g;

    /* JADX INFO: renamed from: h */
    public final EnumC7546k f10889h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5598n f10890i;

    /* JADX INFO: renamed from: j */
    public final long f10891j;

    public C3577H(C3590f c3590f, C3582M c3582m, List list, int i10, boolean z6, int i11, InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k, InterfaceC5598n interfaceC5598n, long j10) {
        this.f10882a = c3590f;
        this.f10883b = c3582m;
        this.f10884c = list;
        this.f10885d = i10;
        this.f10886e = z6;
        this.f10887f = i11;
        this.f10888g = interfaceC7537b;
        this.f10889h = enumC7546k;
        this.f10890i = interfaceC5598n;
        this.f10891j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3577H)) {
            return false;
        }
        C3577H c3577h = (C3577H) obj;
        return AbstractC16544l.m18089b(this.f10882a, c3577h.f10882a) && AbstractC16544l.m18089b(this.f10883b, c3577h.f10883b) && AbstractC16544l.m18089b(this.f10884c, c3577h.f10884c) && this.f10885d == c3577h.f10885d && this.f10886e == c3577h.f10886e && AbstractC9160K3.m9708a(this.f10887f, c3577h.f10887f) && AbstractC16544l.m18089b(this.f10888g, c3577h.f10888g) && this.f10889h == c3577h.f10889h && AbstractC16544l.m18089b(this.f10890i, c3577h.f10890i) && C7536a.m7848c(this.f10891j, c3577h.f10891j);
    }

    public final int hashCode() {
        int iHashCode = (this.f10890i.hashCode() + ((this.f10889h.hashCode() + ((this.f10888g.hashCode() + ((((((AbstractC14376f.m15858x(this.f10884c, (this.f10883b.hashCode() + (this.f10882a.hashCode() * 31)) * 31, 31) + this.f10885d) * 31) + (this.f10886e ? 1231 : 1237)) * 31) + this.f10887f) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f10891j;
        return ((int) ((j10 >>> 32) ^ j10)) + iHashCode;
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f10882a) + ", style=" + this.f10883b + ", placeholders=" + this.f10884c + ", maxLines=" + this.f10885d + ", softWrap=" + this.f10886e + ", overflow=" + ((Object) AbstractC9160K3.m9709b(this.f10887f)) + ", density=" + this.f10888g + ", layoutDirection=" + this.f10889h + ", fontFamilyResolver=" + this.f10890i + ", constraints=" + ((Object) C7536a.m7858m(this.f10891j)) + ')';
    }
}
