package p758g0;

import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;

/* JADX INFO: renamed from: g0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C13733I implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Y */
    public Number f43304Y;

    /* JADX INFO: renamed from: Z */
    public Number f43305Z;

    /* JADX INFO: renamed from: o0 */
    public final C13783q0 f43306o0;

    /* JADX INFO: renamed from: p0 */
    public final C6002f0 f43307p0;

    /* JADX INFO: renamed from: q0 */
    public C13757d0 f43308q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f43309r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f43310s0;

    /* JADX INFO: renamed from: t0 */
    public long f43311t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C13736L f43312u0;

    public C13733I(C13736L c13736l, Number number, Number number2, C13783q0 c13783q0, C13732H c13732h) {
        this.f43312u0 = c13736l;
        this.f43304Y = number;
        this.f43305Z = number2;
        this.f43306o0 = c13783q0;
        this.f43307p0 = C5997d.m6430Q(number, C5975S.f19448r0);
        this.f43308q0 = new C13757d0(c13732h, c13783q0, this.f43304Y, this.f43305Z, null);
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return this.f43307p0.getValue();
    }
}
