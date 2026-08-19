package p148Fi;

import kotlin.jvm.internal.AbstractC16526C;
import ml.C17284b;
import mm.C17296C;
import p003A1.C0227a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p1071w0.AbstractC20734X;
import p172Gi.C3071d;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p317Mg.C5350a;
import p409Qk.C6752c;
import p528Vg.C8285d;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p857kl.C16447N;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fi.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2842n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8585Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8586Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2854t0 f8587o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3071d f8588p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2842n0(C2854t0 c2854t0, C3071d c3071d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8587o0 = c2854t0;
        this.f8588p0 = c3071d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2842n0 c2842n0 = new C2842n0(this.f8587o0, this.f8588p0, interfaceC18770c);
        c2842n0.f8586Z = obj;
        return c2842n0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2842n0) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C6752c c6752c;
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3777y interfaceC3777yM18075c2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8585Y;
        C2854t0 c2854t0 = this.f8587o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c6752c = (C6752c) this.f8586Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        c6752c = (C6752c) this.f8586Z;
        C5350a c5350a = c2854t0.f8613b;
        this.f8586Z = c6752c;
        this.f8585Y = 1;
        obj = AbstractC2124C.m3221t(c5350a.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C8285d c8285d = (C8285d) obj;
        C13693c c13693c = new C13693c();
        if (AbstractC2840m0.f8584a[c8285d.f25823a.ordinal()] == 1) {
            C0227a c0227a = new C0227a(c2854t0, 7);
            C16447N c16447n = c13693c.f43195a;
            c0227a.invoke(c16447n, c16447n);
        } else {
            if (c8285d.f25826d) {
                c13693c.f43197c.m4529e("magic-header-2023", "always");
            }
            AbstractC13695e.m15172b(c13693c, "/voice/get_token");
        }
        AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
        C3071d c3071d = this.f8588p0;
        if (c3071d == null) {
            c13693c.f43198d = C17284b.f55106a;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C3071d.class);
            try {
                interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C3071d.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c2 = null;
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c2, c13693c);
        } else {
            c13693c.f43198d = c3071d;
            InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C3071d.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C3071d.class);
            } catch (Throwable unused2) {
                interfaceC3777yM18075c = null;
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
        }
        C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
        this.f8586Z = null;
        this.f8585Y = 2;
        obj = c14535jM21254y.m16038c(this);
        return obj == enumC19250a ? enumC19250a : obj;
    }
}
