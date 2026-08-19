package p002A0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p080D0.AbstractC1807h0;
import p1095x1.InterfaceC21098s;
import p1116y0.C21353b;
import p1139z0.C21574A0;
import p204I1.C3578I;
import p204I1.C3581L;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8096g6;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: A0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0112K extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f476Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f477Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0112K(C0120T c0120t, int i10) {
        super(0);
        this.f476Y = i10;
        this.f477Z = c0120t;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        float fM15307h;
        C13801c c13801c;
        switch (this.f476Y) {
            case 0:
                return this.f477Z.f499a.m21881c();
            case 1:
                C0120T c0120t = this.f477Z;
                boolean zM4267c = C3581L.m4267c(c0120t.f499a.m21881c().f67818Z);
                C13801c c13801c2 = C13801c.f43585e;
                if (((!zM4267c || c0120t.m413r() != EnumC0123W.f527Z) && (zM4267c || c0120t.m413r() != EnumC0123W.f528o0)) || c0120t.m408m() != null || !((Boolean) c0120t.f509k.getValue()).booleanValue()) {
                    return c13801c2;
                }
                InterfaceC21098s interfaceC21098sM412q = c0120t.m412q();
                C13801c c13801cM2611F = interfaceC21098sM412q != null ? AbstractC1807h0.m2611F(interfaceC21098sM412q) : null;
                if (c13801cM2611F == null) {
                    return c13801c2;
                }
                InterfaceC21098s interfaceC21098sM412q2 = c0120t.m412q();
                C13800b c13800b = interfaceC21098sM412q2 != null ? new C13800b(interfaceC21098sM412q2.mo21517D(c13801cM2611F.m15320g())) : null;
                AbstractC16544l.m18091d(c13800b);
                C13801c c13801cM8568b = AbstractC8096g6.m8568b(c13800b.f43584a, c13801cM2611F.m15319f());
                C21353b c21353bM21881c = c0120t.f499a.m21881c();
                if (C3581L.m4267c(c21353bM21881c.f67818Z)) {
                    C13801c c13801cM407l = c0120t.m407l();
                    InterfaceC21098s interfaceC21098sM412q3 = c0120t.m412q();
                    c13801c = AbstractC8096g6.m8568b(interfaceC21098sM412q3 != null ? interfaceC21098sM412q3.mo21517D(c13801cM407l.m15320g()) : 0L, c13801cM407l.m15319f());
                } else {
                    InterfaceC21098s interfaceC21098sM412q4 = c0120t.m412q();
                    long jMo21517D = interfaceC21098sM412q4 != null ? interfaceC21098sM412q4.mo21517D(c0120t.m410o(true)) : 0L;
                    InterfaceC21098s interfaceC21098sM412q5 = c0120t.m412q();
                    long jMo21517D2 = interfaceC21098sM412q5 != null ? interfaceC21098sM412q5.mo21517D(c0120t.m410o(false)) : 0L;
                    InterfaceC21098s interfaceC21098sM412q6 = c0120t.m412q();
                    C21574A0 c21574a0 = c0120t.f500b;
                    float fM15307h2 = 0.0f;
                    long j10 = c21353bM21881c.f67818Z;
                    if (interfaceC21098sM412q6 != null) {
                        C3578I c3578iM21849b = c21574a0.m21849b();
                        fM15307h = C13800b.m15307h(interfaceC21098sM412q6.mo21517D(AbstractC8088f6.m8536b(0.0f, c3578iM21849b != null ? c3578iM21849b.m4253c((int) (j10 >> 32)).f43587b : 0.0f)));
                    } else {
                        fM15307h = 0.0f;
                    }
                    InterfaceC21098s interfaceC21098sM412q7 = c0120t.m412q();
                    if (interfaceC21098sM412q7 != null) {
                        C3578I c3578iM21849b2 = c21574a0.m21849b();
                        fM15307h2 = C13800b.m15307h(interfaceC21098sM412q7.mo21517D(AbstractC8088f6.m8536b(0.0f, c3578iM21849b2 != null ? c3578iM21849b2.m4253c((int) (j10 & 4294967295L)).f43587b : 0.0f)));
                    }
                    c13801c = new C13801c(Math.min(C13800b.m15306g(jMo21517D), C13800b.m15306g(jMo21517D2)), Math.min(fM15307h, fM15307h2), Math.max(C13800b.m15306g(jMo21517D), C13800b.m15306g(jMo21517D2)), Math.max(C13800b.m15307h(jMo21517D), C13800b.m15307h(jMo21517D2)));
                }
                C13801c c13801c3 = c13801cM8568b.m15324k(c13801c) ? c13801c : null;
                return c13801c3 != null ? c13801c3.m15322i(c13801cM8568b) : c13801c2;
            case 2:
                this.f477Z.m402e();
                return C17296C.f55119a;
            case 3:
                return this.f477Z.m406k(false);
            case 4:
                return this.f477Z.m411p(false, false);
            default:
                return this.f477Z.m411p(true, false);
        }
    }
}
