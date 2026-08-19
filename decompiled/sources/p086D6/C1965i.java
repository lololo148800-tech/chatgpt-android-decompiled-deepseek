package p086D6;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p060C6.AbstractC1604a;
import p060C6.C1606c;
import p571X9.AbstractC9233X;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1965i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f5815Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f5816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16558z f5817o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1965i(boolean z6, C16558z c16558z, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5816Z = z6;
        this.f5817o0 = c16558z;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1965i c1965i = new C1965i(this.f5816Z, this.f5817o0, interfaceC18770c);
        c1965i.f5815Y = obj;
        return c1965i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws C1963g {
        C1965i c1965i = (C1965i) create((C17853f) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c1965i.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws C1963g {
        AbstractC1604a abstractC1604a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17853f c17853f = (C17853f) this.f5815Y;
        if (this.f5816Z && (abstractC1604a = c17853f.f56935e) != null) {
            AbstractC16544l.m18091d(abstractC1604a);
            int i10 = AbstractC1973q.f5838a;
            if (abstractC1604a instanceof C1606c) {
                throw C1963g.f5809Y;
            }
        }
        this.f5817o0.f51287Y = 0;
        return C17296C.f55119a;
    }
}
