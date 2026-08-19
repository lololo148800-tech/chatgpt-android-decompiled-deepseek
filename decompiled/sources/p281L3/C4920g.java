package p281L3;

import bb.AbstractC11328u;
import p003A1.AbstractC0168G;
import p1016t3.C19788o;

/* JADX INFO: renamed from: L3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4920g implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final boolean f16035Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f16036Z;

    public C4920g(C19788o c19788o, int i10) {
        this.f16035Y = (c19788o.f62744e & 1) != 0;
        this.f16036Z = AbstractC0168G.m526o(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4920g c4920g = (C4920g) obj;
        return AbstractC11328u.f34256a.mo12757c(this.f16036Z, c4920g.f16036Z).mo12757c(this.f16035Y, c4920g.f16035Y).mo12759e();
    }
}
