package p467T1;

import mm.C17321x;
import p049Bm.InterfaceC1426a;
import p228J.AbstractC3794B0;
import p774h1.AbstractC14360p;
import p774h1.C14365u;

/* JADX INFO: renamed from: T1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7193c implements InterfaceC7204n {

    /* JADX INFO: renamed from: a */
    public final long f22849a;

    public C7193c(long j10) {
        this.f22849a = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: a */
    public final float mo7587a() {
        return C14365u.m15776d(this.f22849a);
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: b */
    public final long mo7588b() {
        return this.f22849a;
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7204n mo7589c(InterfaceC1426a interfaceC1426a) {
        return !equals(C7202l.f22868a) ? this : (InterfaceC7204n) interfaceC1426a.invoke();
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC7204n mo7590d(InterfaceC7204n interfaceC7204n) {
        return AbstractC3794B0.m4484i(this, interfaceC7204n);
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: e */
    public final AbstractC14360p mo7591e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7193c) && C14365u.m15775c(this.f22849a, ((C7193c) obj).f22849a);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f22849a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C14365u.m15781i(this.f22849a)) + ')';
    }
}
