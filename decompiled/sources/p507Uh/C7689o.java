package p507Uh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p103Dn.C2153Q0;
import p349O0.InterfaceC5985X;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Uh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C7689o implements InterfaceC7683i {

    /* JADX INFO: renamed from: a */
    public final Map f24226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7691q f24227b;

    public C7689o(InterfaceC5985X interfaceC5985X, C7691q c7691q) {
        this.f24227b = c7691q;
        this.f24226a = (Map) interfaceC5985X.getValue();
    }

    @Override // p507Uh.InterfaceC7683i
    /* JADX INFO: renamed from: a */
    public final Map mo7972a() {
        return this.f24226a;
    }

    @Override // p507Uh.InterfaceC7683i
    /* JADX INFO: renamed from: b */
    public final void mo7973b(String permission) {
        C2153Q0 c2153q0;
        Object value;
        Map map;
        Integer num;
        AbstractC16544l.m18094g(permission, "permission");
        C7691q c7691q = this.f24227b;
        if (c7691q != null) {
            do {
                c2153q0 = c7691q.f24228a;
                value = c2153q0.getValue();
                map = (Map) value;
                num = (Integer) map.get(permission);
            } while (!c2153q0.m3250k(value, AbstractC17659D.m19249k(map, new C17309l(permission, Integer.valueOf((num != null ? num.intValue() : 0) + 1)))));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7974c(ArrayList arrayList) {
        C2153Q0 c2153q0;
        Object value;
        Map mapM19249k;
        C7691q c7691q = this.f24227b;
        if (c7691q != null) {
            do {
                c2153q0 = c7691q.f24228a;
                value = c2153q0.getValue();
                mapM19249k = (Map) value;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Integer num = (Integer) mapM19249k.get(str);
                    mapM19249k = AbstractC17659D.m19249k(mapM19249k, new C17309l(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1)));
                }
            } while (!c2153q0.m3250k(value, mapM19249k));
        }
    }
}
