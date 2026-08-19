package p1151ze;

import java.util.LinkedHashSet;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.C21984a1;
import p216Id.C3694b;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ze.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21877a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f69365Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21878b f69366Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21877a(C21878b c21878b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f69366Z = c21878b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21877a c21877a = new C21877a(this.f69366Z, interfaceC18770c);
        c21877a.f69365Y = obj;
        return c21877a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21877a c21877a = (C21877a) create((C3694b) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21877a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C7351f0 c7351f0M4408a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C3694b c3694b = (C3694b) this.f69365Y;
        C21878b c21878b = this.f69366Z;
        String str = c21878b.f69370d;
        if (str != null && (c7351f0M4408a = c3694b.m4408a(str)) != null) {
            if (!c7351f0M4408a.f23280P) {
                c7351f0M4408a = null;
            }
            if (c7351f0M4408a != null) {
                C21878b.m22318a(c21878b, c7351f0M4408a);
            }
        }
        C7351f0 c7351f0 = (C7351f0) c3694b.f11228m.getValue();
        C17296C c17296c = C17296C.f55119a;
        if (c7351f0 == null || !c7351f0.f23273I || c7351f0.f23268D.isEmpty()) {
            return c17296c;
        }
        LinkedHashSet linkedHashSet = c21878b.f69369c;
        String str2 = c7351f0.f23286a;
        if (linkedHashSet.contains(new C21984a1(str2))) {
            return c17296c;
        }
        boolean z6 = c7351f0.f23280P;
        if (z6) {
            C21878b.m22318a(c21878b, c7351f0);
        } else if (!z6) {
            c21878b.f69370d = str2;
        }
        return c17296c;
    }
}
