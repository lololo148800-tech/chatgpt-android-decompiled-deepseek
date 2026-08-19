package ke;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1155zi.C21936L0;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p403Qd.AbstractC6659u;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ke.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16377e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50861Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16377e c16377e = new C16377e(2, interfaceC18770c);
        c16377e.f50861Y = obj;
        return c16377e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16377e) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C3694b c3694b = (C3694b) this.f50861Y;
        ArrayList arrayListM4405e = AbstractC3693a.m4405e(c3694b.f11224i);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4405e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = ((AbstractC6659u) it.next()).m7172d().f23272H;
            C21936L0 c21936l0 = str != null ? new C21936L0(str) : null;
            if (c21936l0 != null) {
                arrayList.add(c21936l0);
            }
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        String str2 = c3694b.f11225j;
        return new C17309l(AbstractC17680n.m19339O(AbstractC17665J.m19267g(setM19328G0, str2 != null ? new C21936L0(str2) : null)), str2 != null ? new C21936L0(str2) : null);
    }
}
