package p672c3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p417R2.C6790b;
import p417R2.C6795g;
import p571X9.AbstractC9233X;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C11582O extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35026Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Set f35027Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11582O(Set set, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35027Z = set;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11582O c11582o = new C11582O(this.f35027Z, interfaceC18770c);
        c11582o.f35026Y = obj;
        return c11582o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11582O) create((C6790b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6790b c6790b = (C6790b) this.f35026Y;
        C6795g key = C11584Q.f35034g;
        c6790b.getClass();
        AbstractC16544l.m18094g(key, "key");
        Map map = c6790b.f21795a;
        Set set = (Set) map.get(key);
        if (set == null) {
            return c6790b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (!this.f35027Z.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return c6790b;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        C6790b c6790b2 = new C6790b(AbstractC17659D.m19256r(mapUnmodifiableMap), false);
        C6795g key2 = C11584Q.f35034g;
        Set setM19264d = AbstractC17665J.m19264d(set, arrayList);
        AbstractC16544l.m18094g(key2, "key");
        c6790b2.m7234b(key2, setM19264d);
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Map map2 = c6790b2.f21795a;
            if (!zHasNext) {
                Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(map2);
                AbstractC16544l.m18093f(mapUnmodifiableMap2, "unmodifiableMap(preferencesMap)");
                return new C6790b(AbstractC17659D.m19256r(mapUnmodifiableMap2), true);
            }
            String str = (String) it.next();
            C11584Q.f35031d.getClass();
            String name = "provider:" + str;
            AbstractC16544l.m18094g(name, "name");
            C6795g c6795g = new C6795g(name);
            c6790b2.m7233a();
            map2.remove(c6795g);
        }
    }
}
