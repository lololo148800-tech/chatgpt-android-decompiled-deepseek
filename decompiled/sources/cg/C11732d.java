package cg;

import kotlin.jvm.internal.AbstractC16526C;
import ml.C17284b;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p707dg.C13107c;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11732d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35577Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35578Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11745q f35579o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13107c f35580p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11732d(C11745q c11745q, C13107c c13107c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35579o0 = c11745q;
        this.f35580p0 = c13107c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11732d c11732d = new C11732d(this.f35579o0, this.f35580p0, interfaceC18770c);
        c11732d.f35578Z = obj;
        return c11732d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11732d) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35577Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f35578Z;
            C13693c c13693c = new C13693c();
            C6226E c6226e = this.f35579o0.f35623b;
            AbstractC13695e.m15172b(c13693c, "https://api.openai.com");
            InterfaceC3777y interfaceC3777yM18075c = null;
            AbstractC13695e.m15173c(c13693c, "dashboard/onboarding/create_account", null, 23);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            C13107c c13107c = this.f35580p0;
            if (c13107c == null) {
                c13693c.f43198d = C17284b.f55106a;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13107c.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C13107c.class);
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            } else {
                c13693c.f43198d = c13107c;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C13107c.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C13107c.class);
                } catch (Throwable unused2) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
            }
            c13693c.f43200f.m20652f(AbstractC6241o.f20322d, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f35577Y = 1;
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
