package p672c3;

import androidx.glance.appwidget.protobuf.AbstractC11057s;
import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p717e3.C13271d;
import p717e3.C13272e;
import p717e3.C13273f;
import p717e3.C13274g;
import p717e3.C13276i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11604f0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35101Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11606g0 f35102Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11604f0(C11606g0 c11606g0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35102Z = c11606g0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11604f0 c11604f0 = new C11604f0(this.f35102Z, interfaceC18770c);
        c11604f0.f35101Y = obj;
        return c11604f0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11604f0) create((C13272e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C13272e c13272e = (C13272e) this.f35101Y;
        AbstractC11057s abstractC11057s = (AbstractC11057s) c13272e.mo12101d(5);
        if (!abstractC11057s.f33341Y.equals(c13272e)) {
            abstractC11057s.m12094c();
            AbstractC11057s.m12091d(abstractC11057s.f33342Z, c13272e);
        }
        C13271d c13271d = (C13271d) abstractC11057s;
        int iM14878r = ((C13272e) c13271d.f33342Z).m14878r();
        c13271d.m12094c();
        C13272e.m14874o((C13272e) c13271d.f33342Z, iM14878r);
        c13271d.m12094c();
        C13272e.m14873n((C13272e) c13271d.f33342Z);
        C11606g0 c11606g0 = this.f35102Z;
        for (Map.Entry entry : c11606g0.f35106b.entrySet()) {
            C13276i c13276i = (C13276i) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (c11606g0.f35109e.contains(new Integer(iIntValue))) {
                C13273f c13273fM14881q = C13274g.m14881q();
                c13273fM14881q.m12094c();
                C13274g.m14879m((C13274g) c13273fM14881q.f33342Z, c13276i);
                c13273fM14881q.m12094c();
                C13274g.m14880n((C13274g) c13273fM14881q.f33342Z, iIntValue);
                c13271d.m12094c();
                C13272e.m14872m((C13272e) c13271d.f33342Z, (C13274g) c13273fM14881q.m12092a());
            }
        }
        return c13271d.m12092a();
    }
}
