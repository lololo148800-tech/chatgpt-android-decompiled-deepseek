package gh;

import kotlin.jvm.internal.AbstractC16526C;
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

/* JADX INFO: renamed from: gh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14142j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44493Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44494Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f44495o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f44496p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14142j(String str, InterfaceC18770c interfaceC18770c, boolean z6) {
        super(2, interfaceC18770c);
        this.f44495o0 = str;
        this.f44496p0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14142j c14142j = new C14142j(this.f44495o0, interfaceC18770c, this.f44496p0);
        c14142j.f44494Z = obj;
        return c14142j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14142j) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44493Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f44494Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("settings/clear_account_user_memory");
            InterfaceC3777y interfaceC3777yM18075c = null;
            c13693cM21253x.f43198d = new C14138f(this.f44495o0, this.f44496p0);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C14138f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C14138f.class);
            } catch (Throwable unused) {
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693cM21253x);
            AbstractC8651i4.m9327e(c13693cM21253x, AbstractC16457e.f51060a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50988f, c13693cM21253x, c6752c);
            this.f44493Y = 1;
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
