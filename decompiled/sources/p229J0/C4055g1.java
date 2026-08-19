package p229J0;

import fo.C13711h;
import p049Bm.InterfaceC1426a;
import p1001s1.InterfaceC19431a;
import p117Eb.C2392v;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9233X;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4055g1 implements InterfaceC19431a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12848Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3923H4 f12849Z;

    public /* synthetic */ C4055g1(InterfaceC3923H4 interfaceC3923H4, int i10) {
        this.f12848Y = i10;
        this.f12849Z = interfaceC3923H4;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final long mo4038K(int i10, long j10) {
        switch (this.f12848Y) {
            case 0:
                C2392v c2392v = (C2392v) this.f12849Z;
                if (!((Boolean) ((InterfaceC1426a) c2392v.f7439q0).invoke()).booleanValue() || C13800b.m15307h(j10) > 0.0f) {
                    return 0L;
                }
                C3935J4 c3935j4 = (C3935J4) c2392v.f7436Z;
                float fM6409g = c3935j4.f12117c.m6409g();
                c3935j4.m4636b(C13800b.m15307h(j10) + c3935j4.f12117c.m6409g());
                if (fM6409g == c3935j4.f12117c.m6409g()) {
                    return 0L;
                }
                return C13800b.m15301b(0.0f, 2, j10);
            default:
                return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        C4049f1 c4049f1;
        C4055g1 c4055g1;
        long j12;
        switch (this.f12848Y) {
            case 0:
                if (interfaceC18770c instanceof C4049f1) {
                    c4049f1 = (C4049f1) interfaceC18770c;
                    int i10 = c4049f1.f12777q0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c4049f1.f12777q0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c4049f1 = new C4049f1(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c4049f1 = new C4049f1(this, (AbstractC19687c) interfaceC18770c);
                }
                Object c7550o = c4049f1.f12775o0;
                Object obj = EnumC19250a.f61036Y;
                int i11 = c4049f1.f12777q0;
                if (i11 != 0) {
                    if (i11 == 1) {
                        j11 = c4049f1.f12774Z;
                        c4055g1 = c4049f1.f12773Y;
                        AbstractC9233X.m9807c(c7550o);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = c4049f1.f12774Z;
                        AbstractC9233X.m9807c(c7550o);
                    }
                    return new C7550o(C7550o.m7905f(j12, ((C7550o) c7550o).f23912a));
                }
                AbstractC9233X.m9807c(c7550o);
                c4049f1.f12773Y = this;
                c4049f1.f12774Z = j11;
                c4049f1.f12777q0 = 1;
                c7550o = new C7550o(0L);
                if (c7550o == obj) {
                    return obj;
                }
                c4055g1 = this;
                long j13 = ((C7550o) c7550o).f23912a;
                C3935J4 c3935j4 = (C3935J4) ((C2392v) c4055g1.f12849Z).f7436Z;
                float fM7903d = C7550o.m7903d(j11);
                C2392v c2392v = (C2392v) c4055g1.f12849Z;
                C13796x c13796x = (C13796x) c2392v.f7438p0;
                c4049f1.f12773Y = null;
                c4049f1.f12774Z = j13;
                c4049f1.f12777q0 = 2;
                c7550o = AbstractC3918H.m4625g(c3935j4, fM7903d, c13796x, (InterfaceC13772l) c2392v.f7437o0, c4049f1);
                if (c7550o == obj) {
                    return obj;
                }
                j12 = j13;
                return new C7550o(C7550o.m7905f(j12, ((C7550o) c7550o).f23912a));
            default:
                return new C7550o(0L);
        }
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        switch (this.f12848Y) {
            case 0:
                break;
        }
        return new C7550o(0L);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        switch (this.f12848Y) {
            case 0:
                C2392v c2392v = (C2392v) this.f12849Z;
                if (!((Boolean) ((InterfaceC1426a) c2392v.f7439q0).invoke()).booleanValue()) {
                    return 0L;
                }
                C3935J4 c3935j4 = (C3935J4) c2392v.f7436Z;
                c3935j4.f12116b.m6410h(C13800b.m15307h(j10) + c3935j4.f12116b.m6409g());
                if (C13800b.m15307h(j11) < 0.0f || C13800b.m15307h(j10) < 0.0f) {
                    float fM6409g = c3935j4.f12117c.m6409g();
                    c3935j4.m4636b(C13800b.m15307h(j10) + c3935j4.f12117c.m6409g());
                    return AbstractC8088f6.m8536b(0.0f, c3935j4.f12117c.m6409g() - fM6409g);
                }
                if (C13800b.m15307h(j10) == 0.0f && C13800b.m15307h(j11) > 0.0f) {
                    c3935j4.f12116b.m6410h(0.0f);
                }
                if (C13800b.m15307h(j11) <= 0.0f) {
                    return 0L;
                }
                float fM6409g2 = c3935j4.f12117c.m6409g();
                c3935j4.m4636b(C13800b.m15307h(j11) + c3935j4.f12117c.m6409g());
                return AbstractC8088f6.m8536b(0.0f, c3935j4.f12117c.m6409g() - fM6409g2);
            default:
                C13711h c13711h = (C13711h) this.f12849Z;
                if (((Boolean) ((InterfaceC1426a) c13711h.f43260o0).invoke()).booleanValue()) {
                    float fM15307h = C13800b.m15307h(j10);
                    C3935J4 c3935j5 = (C3935J4) c13711h.f43259Z;
                    if (fM15307h != 0.0f || C13800b.m15307h(j11) <= 0.0f) {
                        c3935j5.f12116b.m6410h(C13800b.m15307h(j10) + c3935j5.f12116b.m6409g());
                    } else {
                        c3935j5.f12116b.m6410h(0.0f);
                    }
                }
                return 0L;
        }
    }
}
