package p374P5;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0593T;
import p026Ao.AbstractC0682p;
import p026Ao.C0691y;
import p033B5.C0828l;
import p049Bm.InterfaceC1436k;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6580i;
import p496U5.C7567i;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: P5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6352e {

    /* JADX INFO: renamed from: o */
    public static final C6352e f20637o;

    /* JADX INFO: renamed from: a */
    public final AbstractC0682p f20638a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18776i f20639b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18776i f20640c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18776i f20641d;

    /* JADX INFO: renamed from: e */
    public final EnumC6349b f20642e;

    /* JADX INFO: renamed from: f */
    public final EnumC6349b f20643f;

    /* JADX INFO: renamed from: g */
    public final EnumC6349b f20644g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1436k f20645h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1436k f20646i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1436k f20647j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6580i f20648k;

    /* JADX INFO: renamed from: l */
    public final EnumC6578g f20649l;

    /* JADX INFO: renamed from: m */
    public final EnumC6575d f20650m;

    /* JADX INFO: renamed from: n */
    public final C0828l f20651n;

    static {
        C0691y c0691y = AbstractC0682p.f1991a;
        C18777j c18777j = C18777j.f59682Y;
        C3516e c3516e = AbstractC0593T.f1824a;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        EnumC6349b enumC6349b = EnumC6349b.f20614o0;
        C7567i c7567i = C7567i.f23970Y;
        f20637o = new C6352e(c0691y, c18777j, executorC3515d, executorC3515d, enumC6349b, enumC6349b, enumC6349b, c7567i, c7567i, c7567i, InterfaceC6580i.f21267f0, EnumC6578g.f21262Z, EnumC6575d.f21258Y, C0828l.f2308b);
    }

    public C6352e(AbstractC0682p abstractC0682p, InterfaceC18776i interfaceC18776i, InterfaceC18776i interfaceC18776i2, InterfaceC18776i interfaceC18776i3, EnumC6349b enumC6349b, EnumC6349b enumC6349b2, EnumC6349b enumC6349b3, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC6580i interfaceC6580i, EnumC6578g enumC6578g, EnumC6575d enumC6575d, C0828l c0828l) {
        this.f20638a = abstractC0682p;
        this.f20639b = interfaceC18776i;
        this.f20640c = interfaceC18776i2;
        this.f20641d = interfaceC18776i3;
        this.f20642e = enumC6349b;
        this.f20643f = enumC6349b2;
        this.f20644g = enumC6349b3;
        this.f20645h = interfaceC1436k;
        this.f20646i = interfaceC1436k2;
        this.f20647j = interfaceC1436k3;
        this.f20648k = interfaceC6580i;
        this.f20649l = enumC6578g;
        this.f20650m = enumC6575d;
        this.f20651n = c0828l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6352e)) {
            return false;
        }
        C6352e c6352e = (C6352e) obj;
        return AbstractC16544l.m18089b(this.f20638a, c6352e.f20638a) && AbstractC16544l.m18089b(this.f20639b, c6352e.f20639b) && AbstractC16544l.m18089b(this.f20640c, c6352e.f20640c) && AbstractC16544l.m18089b(this.f20641d, c6352e.f20641d) && this.f20642e == c6352e.f20642e && this.f20643f == c6352e.f20643f && this.f20644g == c6352e.f20644g && AbstractC16544l.m18089b(this.f20645h, c6352e.f20645h) && AbstractC16544l.m18089b(this.f20646i, c6352e.f20646i) && AbstractC16544l.m18089b(this.f20647j, c6352e.f20647j) && AbstractC16544l.m18089b(this.f20648k, c6352e.f20648k) && this.f20649l == c6352e.f20649l && this.f20650m == c6352e.f20650m && AbstractC16544l.m18089b(this.f20651n, c6352e.f20651n);
    }

    public final int hashCode() {
        return this.f20651n.f2309a.hashCode() + ((this.f20650m.hashCode() + ((this.f20649l.hashCode() + ((this.f20648k.hashCode() + ((this.f20647j.hashCode() + ((this.f20646i.hashCode() + ((this.f20645h.hashCode() + ((this.f20644g.hashCode() + ((this.f20643f.hashCode() + ((this.f20642e.hashCode() + ((this.f20641d.hashCode() + ((this.f20640c.hashCode() + ((this.f20639b.hashCode() + (this.f20638a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f20638a + ", interceptorCoroutineContext=" + this.f20639b + ", fetcherCoroutineContext=" + this.f20640c + ", decoderCoroutineContext=" + this.f20641d + ", memoryCachePolicy=" + this.f20642e + ", diskCachePolicy=" + this.f20643f + ", networkCachePolicy=" + this.f20644g + ", placeholderFactory=" + this.f20645h + ", errorFactory=" + this.f20646i + ", fallbackFactory=" + this.f20647j + ", sizeResolver=" + this.f20648k + ", scale=" + this.f20649l + ", precision=" + this.f20650m + ", extras=" + this.f20651n + ')';
    }
}
