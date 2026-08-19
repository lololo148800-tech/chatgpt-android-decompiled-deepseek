package p523V9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p349O0.C6021p;
import p676c7.C11688g;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import sl.InterfaceC19683r;

/* JADX INFO: renamed from: V9.m4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8142m4 {
    /* JADX INFO: renamed from: a */
    public static final void m8673a(InterfaceC19683r interfaceC19683r, InterfaceC19683r builder) {
        AbstractC16544l.m18094g(interfaceC19683r, "<this>");
        AbstractC16544l.m18094g(builder, "builder");
        for (Map.Entry entry : builder.mo4526a()) {
            interfaceC19683r.mo4533m((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m8674b(InterfaceC16476x interfaceC16476x) {
        AbstractC16544l.m18094g(interfaceC16476x, "<this>");
        Set<Map.Entry> setMo7977a = interfaceC16476x.mo7977a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setMo7977a) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C17309l(entry.getKey(), (String) it.next()));
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static C11688g m8675c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.f31999ID);
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("email");
            String strMo4384r3 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C11688g.f35451e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C11688g(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type UserInfo", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type UserInfo", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type UserInfo", e12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m8676d(int i10, C6021p c6021p) {
        return AbstractC8134l4.m8653c(c6021p).getString(i10);
    }

    /* JADX INFO: renamed from: e */
    public static final String m8677e(int i10, Object[] objArr, C6021p c6021p) {
        return AbstractC8134l4.m8653c(c6021p).getString(i10, Arrays.copyOf(objArr, objArr.length));
    }
}
