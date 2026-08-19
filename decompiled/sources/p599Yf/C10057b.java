package p599Yf;

import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p482Tg.C7448e;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Yf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10057b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f29778Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f29779Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f29780o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f29781p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10057b(String str, Map map, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f29780o0 = str;
        this.f29781p0 = map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10057b c10057b = new C10057b(this.f29780o0, this.f29781p0, interfaceC18770c);
        c10057b.f29779Z = obj;
        return c10057b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10057b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f29778Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f29779Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "aip/p", new C7448e(this.f29780o0, this.f29781p0, c13693c, 8), 7);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f29778Y = 1;
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
