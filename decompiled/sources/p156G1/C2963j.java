package p156G1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p003A1.AbstractC0240d0;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: G1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2963j implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final LinkedHashMap f8880Y = new LinkedHashMap();

    /* JADX INFO: renamed from: Z */
    public boolean f8881Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f8882o0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2963j)) {
            return false;
        }
        C2963j c2963j = (C2963j) obj;
        return AbstractC16544l.m18089b(this.f8880Y, c2963j.f8880Y) && this.f8881Z == c2963j.f8881Z && this.f8882o0 == c2963j.f8882o0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3785f(C2974u c2974u) {
        return this.f8880Y.containsKey(c2974u);
    }

    public final int hashCode() {
        return (((this.f8880Y.hashCode() * 31) + (this.f8881Z ? 1231 : 1237)) * 31) + (this.f8882o0 ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8880Y.entrySet().iterator();
    }

    /* JADX INFO: renamed from: j */
    public final Object m3786j(C2974u c2974u) {
        Object obj = this.f8880Y.get(c2974u);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + c2974u + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: m */
    public final void m3787m(C2974u c2974u, Object obj) {
        boolean z6 = obj instanceof C2954a;
        LinkedHashMap linkedHashMap = this.f8880Y;
        if (!z6 || !linkedHashMap.containsKey(c2974u)) {
            linkedHashMap.put(c2974u, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(c2974u);
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C2954a c2954a = (C2954a) obj2;
        C2954a c2954a2 = (C2954a) obj;
        String str = c2954a2.f8837a;
        if (str == null) {
            str = c2954a.f8837a;
        }
        InterfaceC17302e interfaceC17302e = c2954a2.f8838b;
        if (interfaceC17302e == null) {
            interfaceC17302e = c2954a.f8838b;
        }
        linkedHashMap.put(c2974u, new C2954a(str, interfaceC17302e));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f8881Z) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f8882o0) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f8880Y.entrySet()) {
            C2974u c2974u = (C2974u) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(c2974u.f8943a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return AbstractC0240d0.m806q(this) + "{ " + ((Object) sb2) + " }";
    }
}
