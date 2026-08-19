package p787he;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C14457M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45492Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45493Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45494o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f45495p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14457M(C14459O c14459o, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45494o0 = c14459o;
        this.f45495p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14457M c14457m = new C14457M(this.f45494o0, this.f45495p0, interfaceC18770c);
        c14457m.f45493Z = obj;
        return c14457m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14457M) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45492Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f45493Z;
            C18077B c18077b = this.f45494o0.f45503b;
            String str = c6636i.f21380b;
            this.f45492Y = 1;
            obj = c18077b.m19704i(str, this.f45495p0, this);
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
