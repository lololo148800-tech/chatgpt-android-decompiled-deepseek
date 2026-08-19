package p266Kc;

import java.util.ArrayList;
import java.util.Set;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9218U2;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4635d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15087Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ boolean f15088Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4636e f15089o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4635d(C4636e c4636e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15089o0 = c4636e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4635d c4635d = new C4635d(this.f15089o0, interfaceC18770c);
        c4635d.f15088Z = ((Boolean) obj).booleanValue();
        return c4635d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C4635d) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15087Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!this.f15088Z) {
                return c17296c;
            }
            C4636e c4636e = this.f15089o0;
            Set<InterfaceC19018a> set = c4636e.f15091b;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
            for (InterfaceC19018a interfaceC19018a : set) {
                arrayList.add(AbstractC0575H.m1156D(c4636e.f15090a, interfaceC19018a.mo4159b(), null, new C4634c(interfaceC19018a, null), 2));
            }
            this.f15087Y = 1;
            if (AbstractC9218U2.m9787b(arrayList, this) == enumC19250a) {
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
