package p823j3;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.v */
/* JADX INFO: loaded from: classes.dex */
public final class C16100v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49868Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49869Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f49870o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16100v(C11617m c11617m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49870o0 = c11617m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16100v c16100v = new C16100v(this.f49870o0, interfaceC18770c);
        c16100v.f49869Z = obj;
        return c16100v;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16100v) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49868Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16095q c16095q = (C16095q) this.f49869Z;
            String str = this.f49870o0.f35166a;
            this.f49868Y = 1;
            C11617m c11617m = (C11617m) c16095q.f49858a.remove(str);
            if (c11617m != null) {
                c11617m.f35168c.mo2522l(null);
                c11617m.f35167b.set(false);
                c11617m.f35178m.mo1275e(null);
            }
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
