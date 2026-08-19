package p351O2;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6104r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19849Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19850Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6084G f19851o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6104r(C6084G c6084g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19851o0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6104r c6104r = new C6104r(this.f19851o0, interfaceC18770c);
        c6104r.f19850Z = obj;
        return c6104r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6104r) create((AbstractC6101o) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM6655g;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19849Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC6101o abstractC6101o = (AbstractC6101o) this.f19850Z;
            boolean z6 = abstractC6101o instanceof C6099m;
            C6084G c6084g = this.f19851o0;
            if (z6) {
                C6099m c6099m = (C6099m) abstractC6101o;
                this.f19849Y = 1;
                AbstractC6085H abstractC6085H = (AbstractC6085H) c6084g.f19817g.getValue();
                if (abstractC6085H instanceof C6089c) {
                    objM6655g = c17296c;
                } else if (!(abstractC6085H instanceof C6096j)) {
                    if (AbstractC16544l.m18089b(abstractC6085H, C6086I.f19820a)) {
                        objM6655g = c6084g.m6655g(this);
                        if (objM6655g != enumC19250a) {
                        }
                    } else if (abstractC6085H instanceof C6095i) {
                        throw new IllegalStateException("Can't read in final state.");
                    }
                    objM6655g = c17296c;
                } else if (abstractC6085H != c6099m.f19842a || (objM6655g = c6084g.m6655g(this)) != enumC19250a) {
                    objM6655g = c17296c;
                }
                if (objM6655g == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC6101o instanceof C6100n) {
                this.f19849Y = 2;
                if (C6084G.m6649c(c6084g, (C6100n) abstractC6101o, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
