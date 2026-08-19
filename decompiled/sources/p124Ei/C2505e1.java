package p124Ei;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6501u;
import p387Pl.EnumC6462I;
import p387Pl.EnumC6464K;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2505e1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f7798Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2505e1 c2505e1 = new C2505e1(2, interfaceC18770c);
        c2505e1.f7798Y = obj;
        return c2505e1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2505e1) create((Collection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        Collection collection = (Collection) this.f7798Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            AbstractC6470Q abstractC6470Q = (AbstractC6470Q) obj2;
            if (abstractC6470Q.f20993d == EnumC6462I.VIDEO && abstractC6470Q.f20996g == EnumC6464K.f20969Y && abstractC6470Q.mo7035b()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6468O abstractC6468OM7055c = ((AbstractC6470Q) it.next()).m7055c();
            if (abstractC6468OM7055c != null) {
                arrayList2.add(abstractC6468OM7055c);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof C6501u) {
                arrayList3.add(obj3);
            }
        }
        return AbstractC17680n.m19343S(arrayList3);
    }
}
