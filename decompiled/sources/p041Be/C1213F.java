package p041Be;

import kotlin.jvm.internal.AbstractC16526C;
import ml.C17284b;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p1126yd.C21406A0;
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
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Be.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1213F extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f3193Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f3194Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21406A0 f3195o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213F(C21406A0 c21406a0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3195o0 = c21406a0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1213F c1213f = new C1213F(this.f3195o0, interfaceC18770c);
        c1213f.f3194Z = obj;
        return c1213f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1213F) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f3193Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f3194Z;
            C13693c c13693c = new C13693c();
            c13693c.f43200f.m20652f(AbstractC6241o.f20320b, C17296C.f55119a);
            AbstractC13695e.m15173c(c13693c, "conversation", C1237i.f3257p0, 7);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C21406A0 c21406a0 = this.f3195o0;
            if (c21406a0 == null) {
                c13693c.f43198d = C17284b.f55106a;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21406A0.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C21406A0.class);
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            } else {
                c13693c.f43198d = c21406a0;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C21406A0.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C21406A0.class);
                } catch (Throwable unused2) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
            }
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f3193Y = 1;
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
