package p1071w0;

import p002A0.C0120T;
import p080D0.InterfaceC1818n;

/* JADX INFO: renamed from: w0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C20759l implements InterfaceC1818n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65893Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f65894Z;

    public /* synthetic */ C20759l(C0120T c0120t, int i10) {
        this.f65893Y = i10;
        this.f65894Z = c0120t;
    }

    @Override // p080D0.InterfaceC1818n
    /* JADX INFO: renamed from: a */
    public final long mo2571a() {
        switch (this.f65893Y) {
            case 0:
                return this.f65894Z.m406k(true).f537b;
            case 1:
                return this.f65894Z.m411p(true, true).f537b;
            default:
                return this.f65894Z.m411p(false, true).f537b;
        }
    }
}
