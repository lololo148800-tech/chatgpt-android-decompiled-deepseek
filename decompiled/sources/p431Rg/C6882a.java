package p431Rg;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p402Qc.C6593i;
import p409Qk.C6752c;
import p506Ug.C7671f;
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

/* JADX INFO: renamed from: Rg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6882a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f22069Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f22070Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f22071o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C7671f f22072p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6882a(String str, C7671f c7671f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22071o0 = str;
        this.f22072p0 = c7671f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6882a c6882a = new C6882a(this.f22071o0, this.f22072p0, interfaceC18770c);
        c6882a.f22070Z = obj;
        return c6882a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6882a) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22069Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f22070Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "memories", new C6593i(this.f22072p0, 5), 7);
            InterfaceC3777y interfaceC3777yM18075c = null;
            c13693c.f43198d = new C6887f(this.f22071o0);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C6887f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C6887f.class);
            } catch (Throwable unused) {
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50988f, c13693c, c6752c);
            this.f22069Y = 1;
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
