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
import p707dg.C13113i;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C11738j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35597Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35598Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11745q f35599o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13113i f35600p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11738j(C11745q c11745q, C13113i c13113i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35599o0 = c11745q;
        this.f35600p0 = c13113i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11738j c11738j = new C11738j(this.f35599o0, this.f35600p0, interfaceC18770c);
        c11738j.f35598Z = obj;
        return c11738j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11738j) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35597Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f35598Z;
            C13693c c13693c = new C13693c();
            C6226E c6226e = this.f35599o0.f35623b;
            AbstractC13695e.m15172b(c13693c, "https://api.openai.com");
            InterfaceC3777y interfaceC3777yM18075c = null;
            AbstractC13695e.m15173c(c13693c, "dashboard/onboarding/phone/verify", null, 23);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            C13113i c13113i = this.f35600p0;
            if (c13113i == null) {
                c13693c.f43198d = C17284b.f55106a;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13113i.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C13113i.class);
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            } else {
                c13693c.f43198d = c13113i;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C13113i.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C13113i.class);
                } catch (Throwable unused2) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
            }
            c13693c.f43200f.m20652f(AbstractC6241o.f20322d, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f35597Y = 1;
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
