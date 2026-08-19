package p000;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p027Ap.C0693a;
import p049Bm.InterfaceC1426a;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8094g4;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public final class C18540q implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C18540q f59066b = new C18540q(0);

    /* JADX INFO: renamed from: c */
    public static final C18540q f59067c = new C18540q(1);

    /* JADX INFO: renamed from: d */
    public static final C18540q f59068d = new C18540q(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59069a;

    public /* synthetic */ C18540q(int i10) {
        this.f59069a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static Object m19907a(AbstractC8094g4 abstractC8094g4, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        if (abstractC8094g4.equals(C19710t.f62399b)) {
            return interfaceC1426a.invoke();
        }
        if (abstractC8094g4.equals(C19710t.f62400c)) {
            return interfaceC1426a2.invoke();
        }
        if (abstractC8094g4.equals(C19710t.f62401d)) {
            return null;
        }
        throw new C0644w();
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        C19710t c19710t;
        switch (this.f59069a) {
            case 0:
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
                Object objM19343S = AbstractC17680n.m19343S(c0693aM8396e);
                Object objM19344T = AbstractC17680n.m19344T(1, c0693aM8396e);
                Object objM19344T2 = AbstractC17680n.m19344T(2, c0693aM8396e);
                String str = objM19344T2 instanceof String ? (String) objM19344T2 : null;
                if (AbstractC16544l.m18089b(str, "first")) {
                    c19710t = C19710t.f62399b;
                } else {
                    c19710t = AbstractC16544l.m18089b(str, "last") ? C19710t.f62400c : C19710t.f62401d;
                }
                Integer num = objM19344T instanceof Integer ? (Integer) objM19344T : null;
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                if (objM19343S instanceof String) {
                    String str2 = (String) objM19343S;
                    return m19907a(c19710t, new C18798r(str2, iIntValue, 0), new C18798r(str2, iIntValue, 1));
                }
                if (!(objM19343S instanceof List)) {
                    return null;
                }
                List list = (List) objM19343S;
                return m19907a(c19710t, new C19281s(list, iIntValue, 0), new C19281s(list, iIntValue, 1));
            default:
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    AbstractC16544l.m18094g(str3, "<this>");
                    return new StringBuilder((CharSequence) str3).reverse().toString();
                }
                if (obj instanceof List) {
                    return AbstractC17680n.m19363m0((Iterable) obj);
                }
                return null;
        }
    }
}
