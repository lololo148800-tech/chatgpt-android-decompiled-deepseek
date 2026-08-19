package p523V9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1006s6.C19453c;
import p1006s6.InterfaceC19456f;
import p204I1.AbstractC3591g;
import p204I1.AbstractC3597m;
import p204I1.C3588d;
import p204I1.C3590f;
import p656b3.AbstractC11225d;
import p656b3.C11227f;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: V9.B0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7849B0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m8106a(C3590f c3590f) {
        int length = c3590f.f10934Y.length();
        List list = c3590f.f10937p0;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3588d c3588d = (C3588d) list.get(i10);
            if ((c3588d.f10930a instanceof AbstractC3597m) && AbstractC3591g.m4304c(0, length, c3588d.f10931b, c3588d.f10932c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final C11227f m8107b(AbstractC11225d... abstractC11225dArr) {
        ArrayList arrayList = new ArrayList(abstractC11225dArr.length);
        if (abstractC11225dArr.length <= 0) {
            C17309l[] c17309lArr = (C17309l[]) arrayList.toArray(new C17309l[0]);
            return new C11227f(AbstractC17659D.m19246h((C17309l[]) Arrays.copyOf(c17309lArr, c17309lArr.length)));
        }
        AbstractC11225d abstractC11225d = abstractC11225dArr[0];
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8108c(InterfaceC19456f interfaceC19456f, Object obj) {
        AbstractC16544l.m18094g(interfaceC19456f, "<this>");
        if (obj == null) {
            interfaceC19456f.mo20543I0();
            return;
        }
        if (obj instanceof Map) {
            interfaceC19456f.mo20554o();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                interfaceC19456f.mo20545M0(String.valueOf(key));
                m8108c(interfaceC19456f, value);
            }
            interfaceC19456f.mo20551j();
            return;
        }
        if (obj instanceof List) {
            interfaceC19456f.mo20556q();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                m8108c(interfaceC19456f, it.next());
            }
            interfaceC19456f.mo20555p();
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC19456f.mo20548X(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC19456f.mo20540C(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC19456f.mo20539B(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC19456f.mo20542F(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof C19453c) {
            interfaceC19456f.mo20557u0((C19453c) obj);
            return;
        }
        if (obj instanceof String) {
            interfaceC19456f.mo20544L((String) obj);
            return;
        }
        throw new IllegalStateException(("Cannot write " + obj + " of class '" + AbstractC16526C.f51263a.mo5693b(obj.getClass()) + "' to Json").toString());
    }
}
