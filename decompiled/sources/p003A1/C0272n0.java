package p003A1;

import mm.C17296C;
import p002A0.C0122V;
import p025An.C0624m;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p350O1.C6046D;
import p350O1.C6049G;
import p350O1.InterfaceC6074w;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0272n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f993Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f994Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0275o0 f995o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0272n0(C0275o0 c0275o0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f995o0 = c0275o0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0272n0 c0272n0 = new C0272n0(this.f995o0, interfaceC18770c);
        c0272n0.f994Z = obj;
        return c0272n0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C0272n0) create((C0229a1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f993Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0229a1 c0229a1 = (C0229a1) this.f994Z;
            this.f994Z = c0229a1;
            C0275o0 c0275o0 = this.f995o0;
            this.f993Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            C6046D c6046d = c0275o0.f1000Z;
            InterfaceC6074w interfaceC6074w = c6046d.f19685a;
            interfaceC6074w.mo6615b();
            c6046d.f19686b.set(new C6049G(c6046d, interfaceC6074w));
            c0624m.m1264u(new C0122V(c0229a1, 4, c0275o0));
            if (c0624m.m1261q() == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
