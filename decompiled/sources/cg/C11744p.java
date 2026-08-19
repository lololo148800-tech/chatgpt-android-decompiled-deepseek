package cg;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p707dg.C13122r;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cg.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C11744p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35618Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35619Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f35620o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f35621p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11744p(String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35620o0 = str;
        this.f35621p0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11744p c11744p = new C11744p(this.f35620o0, this.f35621p0, interfaceC18770c);
        c11744p.f35619Z = obj;
        return c11744p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11744p) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35618Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f35619Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("accounts/add_email/verify ");
            AbstractC8651i4.m9327e(c13693cM21253x, AbstractC16457e.f51060a);
            InterfaceC3777y interfaceC3777yM18075c = null;
            c13693cM21253x.f43198d = new C13122r(this.f35620o0, this.f35621p0);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13122r.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C13122r.class);
            } catch (Throwable unused) {
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693cM21253x);
            c13693cM21253x.f43200f.m20652f(AbstractC6241o.f20322d, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50985c, c13693cM21253x, c6752c);
            this.f35618Y = 1;
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
