package p900n6;

import java.util.AbstractList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import om.C18235b;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p086D6.C1967k;
import p086D6.InterfaceC1957a;
import p103Dn.C2206t;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p826j6.C16137F;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p917o6.C17851d;
import p917o6.C17852e;
import p917o6.InterfaceC17835C;
import p942p6.EnumC18300d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: n6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17505b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f55987Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17507d f55988Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17852e f55989o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1758z f55990p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17505b(C17507d c17507d, C17852e c17852e, InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55988Z = c17507d;
        this.f55989o0 = c17852e;
        this.f55990p0 = interfaceC1758z;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17505b(this.f55988Z, this.f55989o0, this.f55990p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17505b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f55987Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17507d c17507d = this.f55988Z;
            c17507d.getClass();
            C17851d c17851dM19597a = this.f55989o0.m19597a();
            C17510g c17510g = c17507d.f55995Y;
            c17510g.getClass();
            InterfaceC17835C executionContext = AbstractC17792x.m19520c(c17510g, c17507d.f55999q0).mo4139b(c17507d.f56001s0).mo4139b(c17851dM19597a.f56913c);
            AbstractC16544l.m18094g(executionContext, "executionContext");
            c17851dM19597a.f56913c = executionContext;
            EnumC18300d enumC18300d = c17851dM19597a.f56914d;
            if (enumC18300d == null) {
                enumC18300d = null;
            }
            c17851dM19597a.f56914d = enumC18300d;
            Boolean bool = c17851dM19597a.f56917g;
            if (bool == null) {
                bool = null;
            }
            c17851dM19597a.f56917g = bool;
            Boolean bool2 = c17851dM19597a.f56918h;
            if (bool2 == null) {
                bool2 = null;
            }
            c17851dM19597a.f56918h = bool2;
            Boolean bool3 = c17851dM19597a.f56916f;
            if (bool3 == null) {
                bool3 = c17507d.f56002t0;
            }
            c17851dM19597a.f56916f = bool3;
            C18235b c18235bM9972b = AbstractC9393x3.m9972b();
            boolean zM18089b = AbstractC16544l.m18089b(null, Boolean.TRUE);
            Collection collection = C17689w.f56480Y;
            if (!zM18089b) {
                c18235bM9972b.addAll(collection);
            }
            AbstractList abstractList = c17851dM19597a.f56915e;
            if (abstractList != null) {
                collection = abstractList;
            }
            c18235bM9972b.addAll(collection);
            c17851dM19597a.f56915e = AbstractC9393x3.m9971a(c18235bM9972b);
            Boolean bool4 = c17851dM19597a.f56919i;
            if (bool4 == null) {
                bool4 = null;
            }
            c17851dM19597a.f56919i = bool4;
            Boolean bool5 = c17851dM19597a.f56920j;
            c17851dM19597a.f56920j = bool5 != null ? bool5 : null;
            C17852e c17852eM19596a = c17851dM19597a.m19596a();
            C18235b c18235bM9972b2 = AbstractC9393x3.m9972b();
            c18235bM9972b2.addAll(c17507d.f55998p0);
            c18235bM9972b2.add(new C1967k());
            c18235bM9972b2.add(c17507d.f56003u0);
            C18235b interceptors = AbstractC9393x3.m9971a(c18235bM9972b2);
            AbstractC16544l.m18094g(interceptors, "interceptors");
            if (interceptors.mo7371f() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            InterfaceC2184i interfaceC2184iMo3140a = ((InterfaceC1957a) interceptors.get(0)).mo3140a(c17852eM19596a, new C16137F(interceptors, 1, 1));
            C2206t c2206t = new C2206t(this.f55990p0, 2);
            this.f55987Y = 1;
            if (interfaceC2184iMo3140a.mo3141d(c2206t, this) == enumC19250a) {
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
