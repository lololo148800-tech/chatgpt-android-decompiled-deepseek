package p017Af;

import java.util.List;
import mm.C17296C;
import p002A0.C0148y;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16750j0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Af.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C0460G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f1488Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f1489Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f1490o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f1491p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0460G(InterfaceC1436k interfaceC1436k, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1490o0 = interfaceC1436k;
        this.f1491p0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0460G c0460g = new C0460G(this.f1490o0, this.f1491p0, interfaceC18770c);
        c0460g.f1489Z = obj;
        return c0460g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0460G) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f1488Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f1489Z;
            InterfaceC1436k interfaceC1436k = this.f1490o0;
            C0459F c0459f = new C0459F(0, interfaceC1436k);
            C0148y c0148y = new C0148y(c19723a, this.f1491p0, interfaceC1436k, 3);
            this.f1488Y = 1;
            if (AbstractC16750j0.m18525i(c19723a, c0459f, c0148y, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
