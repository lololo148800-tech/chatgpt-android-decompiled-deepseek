package p341Ni;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p148Fi.C2842n0;
import p148Fi.C2854t0;
import p172Gi.C3071d;
import p172Gi.C3074g;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C5761S extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18756Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5784h0 f18757Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3071d f18758o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5761S(C5784h0 c5784h0, C3071d c3071d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18757Z = c5784h0;
        this.f18758o0 = c3071d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5761S(this.f18757Z, this.f18758o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5761S) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18756Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5784h0 c5784h0 = this.f18757Z;
            this.f18756Y = 1;
            C2854t0 c2854t0 = c5784h0.f18851c;
            c2854t0.getClass();
            InterfaceC3777y interfaceC3777yM18075c = null;
            C2842n0 c2842n0 = new C2842n0(c2854t0, this.f18758o0, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C3074g.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C3074g.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            C6889b c6889b = c2854t0.f8612a;
            c6889b.getClass();
            obj = AbstractC9144I.m9690b(c6889b, c21296a, c2842n0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
