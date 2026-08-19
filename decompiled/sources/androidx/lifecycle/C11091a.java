package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11091a {

    /* JADX INFO: renamed from: a */
    public final HashMap f33459a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f33460b;

    public C11091a(HashMap map) {
        this.f33460b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC11103l enumC11103l = (EnumC11103l) entry.getValue();
            List arrayList = (List) this.f33459a.get(enumC11103l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f33459a.put(enumC11103l, arrayList);
            }
            arrayList.add((C11093b) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12150a(List list, InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l, InterfaceC11111t interfaceC11111t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C11093b c11093b = (C11093b) list.get(size);
                c11093b.getClass();
                try {
                    int i10 = c11093b.f33464a;
                    Method method = c11093b.f33465b;
                    if (i10 == 0) {
                        method.invoke(interfaceC11111t, null);
                    } else if (i10 == 1) {
                        method.invoke(interfaceC11111t, interfaceC11112u);
                    } else if (i10 == 2) {
                        method.invoke(interfaceC11111t, interfaceC11112u, enumC11103l);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
