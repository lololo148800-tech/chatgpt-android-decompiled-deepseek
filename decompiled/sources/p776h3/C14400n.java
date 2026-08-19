package p776h3;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p672c3.C11627r;

/* JADX INFO: renamed from: h3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C14400n implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final C14399m f45142a;

    /* JADX INFO: renamed from: b */
    public final C14399m f45143b;

    /* JADX INFO: renamed from: c */
    public final C14399m f45144c;

    /* JADX INFO: renamed from: d */
    public final C14399m f45145d;

    /* JADX INFO: renamed from: e */
    public final C14399m f45146e;

    /* JADX INFO: renamed from: f */
    public final C14399m f45147f;

    public C14400n(C14399m c14399m, C14399m c14399m2, C14399m c14399m3, C14399m c14399m4, C14399m c14399m5, C14399m c14399m6) {
        this.f45142a = c14399m;
        this.f45143b = c14399m2;
        this.f45144c = c14399m3;
        this.f45145d = c14399m4;
        this.f45146e = c14399m5;
        this.f45147f = c14399m6;
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: a */
    public final boolean mo10951a(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10497n mo10952b(InterfaceC10497n interfaceC10497n) {
        return AbstractC9306j0.m9883b(this, interfaceC10497n);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: c */
    public final boolean mo10953c() {
        C11627r.f35235p0.invoke(this);
        return Boolean.TRUE.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14400n)) {
            return false;
        }
        C14400n c14400n = (C14400n) obj;
        return AbstractC16544l.m18089b(this.f45142a, c14400n.f45142a) && AbstractC16544l.m18089b(this.f45143b, c14400n.f45143b) && AbstractC16544l.m18089b(this.f45144c, c14400n.f45144c) && AbstractC16544l.m18089b(this.f45145d, c14400n.f45145d) && AbstractC16544l.m18089b(this.f45146e, c14400n.f45146e) && AbstractC16544l.m18089b(this.f45147f, c14400n.f45147f);
    }

    public final int hashCode() {
        return this.f45147f.hashCode() + ((this.f45146e.hashCode() + ((this.f45145d.hashCode() + ((this.f45144c.hashCode() + ((this.f45143b.hashCode() + (this.f45142a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: j */
    public final Object mo10954j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f45142a + ", start=" + this.f45143b + ", top=" + this.f45144c + ", right=" + this.f45145d + ", end=" + this.f45146e + ", bottom=" + this.f45147f + ')';
    }

    public /* synthetic */ C14400n(C14399m c14399m, C14399m c14399m2, C14399m c14399m3, C14399m c14399m4) {
        this(new C14399m(3, 0.0f), c14399m, c14399m2, new C14399m(3, 0.0f), c14399m3, c14399m4);
    }
}
