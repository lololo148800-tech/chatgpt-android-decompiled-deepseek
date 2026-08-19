package p364Oh;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p060C6.C1608e;
import p1113xn.AbstractC21329w;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9306j0;
import p917o6.C17872y;
import p917o6.InterfaceC17842J;

/* JADX INFO: renamed from: Oh.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6231e {

    /* JADX INFO: renamed from: a */
    public static final C3430e f20293a = AbstractC8168p6.m8749b("ApolloClientLogger", null);

    /* JADX INFO: renamed from: a */
    public static final void m6736a(AbstractC6249w abstractC6249w, InterfaceC17842J interfaceC17842J) {
        AbstractC16544l.m18094g(abstractC6249w, "<this>");
        boolean z6 = abstractC6249w instanceof C6251y;
        C3430e c3430e = f20293a;
        Throwable th2 = abstractC6249w.f20328a;
        if (z6) {
            if (th2 instanceof C1608e) {
                return;
            }
            AbstractC8160o6.m8731f(c3430e, AbstractC9306j0.m9889h("Apollo request failed for operation ", interfaceC17842J != null ? interfaceC17842J.name() : null), th2, null, 4);
        } else {
            if (abstractC6249w instanceof C6250x) {
                return;
            }
            if (abstractC6249w instanceof C6252z) {
                AbstractC8160o6.m8731f(c3430e, AbstractC9306j0.m9889h("Apollo serialization error for operation ", interfaceC17842J != null ? interfaceC17842J.name() : null), th2, null, 4);
            } else if (abstractC6249w instanceof C6222A) {
                AbstractC8160o6.m8727b(c3430e, "Apollo service error for operation " + (interfaceC17842J != null ? interfaceC17842J.name() : null), th2, 4);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C6222A m6737b(List list) {
        String string;
        Object next;
        LinkedHashMap linkedHashMap;
        Object obj;
        LinkedHashMap linkedHashMap2;
        Object obj2;
        String string2;
        Integer numM21736w;
        AbstractC16544l.m18094g(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            string = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LinkedHashMap linkedHashMap3 = ((C17872y) next).f56973e;
            if (linkedHashMap3 != null && linkedHashMap3.containsKey("status")) {
                break;
            }
        }
        C17872y c17872y = (C17872y) next;
        C6230d c6230d = new C6230d(list);
        int iIntValue = (c17872y == null || (linkedHashMap2 = c17872y.f56973e) == null || (obj2 = linkedHashMap2.get("status")) == null || (string2 = obj2.toString()) == null || (numM21736w = AbstractC21329w.m21736w(string2)) == null) ? 0 : numM21736w.intValue();
        if (c17872y != null && (linkedHashMap = c17872y.f56973e) != null && (obj = linkedHashMap.get("details")) != null) {
            string = obj.toString();
        }
        return new C6222A(c6230d, iIntValue, (String) null, string, 20);
    }
}
