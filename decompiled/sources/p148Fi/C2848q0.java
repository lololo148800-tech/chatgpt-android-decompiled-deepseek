package p148Fi;

import kotlin.jvm.internal.AbstractC16526C;
import ml.C17284b;
import mm.C17296C;
import p003A1.C0254h0;
import p044Bh.C1302o;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p556Wk.AbstractC8910Y;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fi.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2848q0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8600Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8601Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f8602o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1302o f8603p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848q0(String str, C1302o c1302o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8602o0 = str;
        this.f8603p0 = c1302o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2848q0 c2848q0 = new C2848q0(this.f8602o0, this.f8603p0, interfaceC18770c);
        c2848q0.f8601Z = obj;
        return c2848q0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2848q0) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8600Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f8601Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "conversation/voice", C2846p0.f8596Z, 7);
            AbstractC13695e.m15171a(c13693c, new C0254h0(this.f8603p0, 17));
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            InterfaceC3777y interfaceC3777yM18075c = null;
            String str = this.f8602o0;
            if (str == null) {
                c13693c.f43198d = C17284b.f55106a;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(String.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(String.class);
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            } else {
                c13693c.f43198d = str;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(String.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(String.class);
                } catch (Throwable unused2) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
            }
            AbstractC8910Y.m9565b(c13693c, C2846p0.f8597o0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            this.f8600Y = 1;
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
