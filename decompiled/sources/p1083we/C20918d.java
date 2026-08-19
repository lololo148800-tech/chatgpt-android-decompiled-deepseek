package p1083we;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import ve.C20584h;

/* JADX INFO: renamed from: we.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20918d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66675Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66676Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20584h f66677o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20918d(C20584h c20584h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66677o0 = c20584h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20918d c20918d = new C20918d(this.f66677o0, interfaceC18770c);
        c20918d.f66676Z = obj;
        return c20918d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20918d) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66675Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f66676Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("user_system_messages");
            AbstractC8651i4.m9327e(c13693cM21253x, AbstractC16457e.f51060a);
            C20914E.Companion.getClass();
            C20584h customizations = this.f66677o0;
            AbstractC16544l.m18094g(customizations, "customizations");
            String str = customizations.f65316b;
            if (str == null) {
                str = "";
            }
            String str2 = customizations.f65317c;
            C20914E c20914e = new C20914E(str, str2 != null ? str2 : "", customizations.f65318d);
            InterfaceC3777y interfaceC3777yM18075c = null;
            c13693cM21253x.f43198d = c20914e;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C20914E.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C20914E.class);
            } catch (Throwable unused) {
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693cM21253x);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50985c, c13693cM21253x, c6752c);
            this.f66675Y = 1;
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
