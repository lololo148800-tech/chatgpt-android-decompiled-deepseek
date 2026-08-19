package p097Dh;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p123Eh.C2439c;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2050c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6269Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6270Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2439c f6271o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2050c(C2439c c2439c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6271o0 = c2439c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2050c c2050c = new C2050c(this.f6271o0, interfaceC18770c);
        c2050c.f6270Z = obj;
        return c2050c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2050c) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6269Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f6270Z;
            C13693c c13693c = new C13693c();
            InterfaceC3777y interfaceC3777yM18075c = null;
            AbstractC13695e.m15173c(c13693c, "preauth_playintegrity", null, 23);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            c13693c.f43198d = this.f6271o0;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C2439c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C2439c.class);
            } catch (Throwable unused) {
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            C19666a c19666a = AbstractC6241o.f20319a;
            C17296C c17296c = C17296C.f55119a;
            C19675j c19675j = c13693c.f43200f;
            c19675j.m20652f(c19666a, c17296c);
            c19675j.m20652f(AbstractC6241o.f20322d, c17296c);
            c19675j.m20652f(AbstractC6241o.f20321c, c17296c);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f6269Y = 1;
            obj = c14535jM21254y.m16038c(this);
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
