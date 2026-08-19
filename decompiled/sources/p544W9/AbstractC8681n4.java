package p544W9;

import android.gov.nist.core.Separators;
import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p273Kl.C4727J0;
import p344Nl.AbstractC5821C;
import p344Nl.C5842n;
import p387Pl.AbstractC6470Q;
import p387Pl.C6497q;
import p571X9.AbstractC9393x3;
import p857kl.AbstractC16449P;
import p857kl.AbstractC16455c;
import p857kl.C16445L;
import p857kl.C16447N;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: W9.n4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8681n4 {
    /* JADX INFO: renamed from: a */
    public static final void m9372a(C16447N c16447n, StringBuilder sb2) {
        List listM9974d;
        sb2.append(c16447n.m18023d().f51031a);
        String str = c16447n.m18023d().f51031a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = c16447n.f51018a;
                    sb2.append(":");
                    sb2.append(charSequence);
                    return;
                }
            } else if (str.equals("file")) {
                CharSequence charSequence2 = c16447n.f51018a;
                CharSequence charSequenceM9376e = m9376e(c16447n);
                sb2.append("://");
                sb2.append(charSequence2);
                if (!AbstractC21322p.m21698f0(charSequenceM9376e, '/')) {
                    sb2.append('/');
                }
                sb2.append(charSequenceM9376e);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = c16447n.f51022e;
            String str3 = c16447n.f51023f;
            if (str2 != null) {
                sb3.append(str2);
                if (str3 != null) {
                    sb3.append(':');
                    sb3.append(str3);
                }
                sb3.append(Separators.f31989AT);
            }
            CharSequence string = sb3.toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            CharSequence charSequence3 = c16447n.f51018a;
            sb2.append(":");
            sb2.append(string);
            sb2.append(charSequence3);
            return;
        }
        sb2.append("://");
        sb2.append(m9375d(c16447n));
        String encodedPath = m9376e(c16447n);
        C16445L encodedQueryParameters = c16447n.f51026i;
        boolean z6 = c16447n.f51019b;
        AbstractC16544l.m18094g(encodedPath, "encodedPath");
        AbstractC16544l.m18094g(encodedQueryParameters, "encodedQueryParameters");
        if (!AbstractC21322p.m21681O(encodedPath) && !AbstractC21329w.m21734u(encodedPath, Separators.SLASH, false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) encodedPath);
        if (!((Map) encodedQueryParameters.f11539Z).isEmpty() || z6) {
            sb2.append(Separators.QUESTION);
        }
        Set<Map.Entry> setMo4526a = encodedQueryParameters.mo4526a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setMo4526a) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listM9974d = AbstractC9393x3.m9974d(new C17309l(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C17309l(str4, (String) it.next()));
                }
                listM9974d = arrayList2;
            }
            AbstractC17686t.m19398v(listM9974d, arrayList);
        }
        AbstractC17680n.m19347W(arrayList, sb2, Separators.AND, (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : new C15058c(7));
        if (c16447n.f51024g.length() > 0) {
            sb2.append('#');
            sb2.append(c16447n.f51024g);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m9373b(C4727J0 c4727j0) {
        C5842n c5842n = c4727j0.f15400y;
        c5842n.getClass();
        List list = (List) c5842n.f19013t.m8945c(AbstractC5821C.f18993u[13]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((AbstractC6470Q) ((C17309l) obj).f55136Y).m7054a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((AbstractC6470Q) ((C17309l) it.next()).f55136Y);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C6497q) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: c */
    public static void m9374c(C16447N c16447n, String[] strArr) {
        ArrayList arrayListM19361k0;
        boolean z6 = false;
        AbstractC16544l.m18094g(c16447n, "<this>");
        List listM19291N = AbstractC17678l.m19291N(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM19291N.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(AbstractC21322p.m21696d0((String) it.next(), new char[]{'/'}, 6), arrayList);
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        for (String str : arrayList2) {
            Set set = AbstractC16455c.f51054a;
            AbstractC16544l.m18094g(str, "<this>");
            arrayList3.add(AbstractC16455c.m18033f(str, 2, true));
        }
        boolean z10 = c16447n.f51025h.size() > 1 && ((CharSequence) AbstractC17680n.m19351a0(c16447n.f51025h)).length() == 0 && !arrayList3.isEmpty();
        if (arrayList3.size() > 1 && ((CharSequence) AbstractC17680n.m19341Q(arrayList3)).length() == 0 && !c16447n.f51025h.isEmpty()) {
            z6 = true;
        }
        if (z10 && z6) {
            arrayListM19361k0 = AbstractC17680n.m19361k0(AbstractC17680n.m19336L(arrayList3, 1), AbstractC17680n.m19337M(1, c16447n.f51025h));
        } else if (z10) {
            arrayListM19361k0 = AbstractC17680n.m19361k0(arrayList3, AbstractC17680n.m19337M(1, c16447n.f51025h));
        } else {
            arrayListM19361k0 = z6 ? AbstractC17680n.m19361k0(AbstractC17680n.m19336L(arrayList3, 1), c16447n.f51025h) : AbstractC17680n.m19361k0(arrayList3, c16447n.f51025h);
        }
        c16447n.f51025h = arrayListM19361k0;
    }

    /* JADX INFO: renamed from: d */
    public static final String m9375d(C16447N c16447n) {
        AbstractC16544l.m18094g(c16447n, "<this>");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = c16447n.f51022e;
        String str2 = c16447n.f51023f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append(Separators.f31989AT);
        }
        String string = sb3.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        sb2.append(string);
        sb2.append(c16447n.f51018a);
        int i10 = c16447n.f51020c;
        if (i10 != 0 && i10 != c16447n.m18023d().f51032b) {
            sb2.append(":");
            sb2.append(String.valueOf(c16447n.f51020c));
        }
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: e */
    public static final String m9376e(C16447N c16447n) {
        AbstractC16544l.m18094g(c16447n, "<this>");
        List list = c16447n.f51025h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) AbstractC17680n.m19341Q(list)).length() == 0 ? Separators.SLASH : (String) AbstractC17680n.m19341Q(list);
        }
        return AbstractC17680n.m19349Y(list, Separators.SLASH, null, null, 0, null, null, 62);
    }

    /* JADX INFO: renamed from: f */
    public static final void m9377f(C16447N c16447n, String value) {
        List listM19323D0;
        AbstractC16544l.m18094g(c16447n, "<this>");
        AbstractC16544l.m18094g(value, "value");
        if (AbstractC21322p.m21681O(value)) {
            listM19323D0 = C17689w.f56480Y;
        } else {
            listM19323D0 = value.equals(Separators.SLASH) ? AbstractC16449P.f51028a : AbstractC17680n.m19323D0(AbstractC21322p.m21696d0(value, new char[]{'/'}, 6));
        }
        AbstractC16544l.m18094g(listM19323D0, "<set-?>");
        c16447n.f51025h = listM19323D0;
    }
}
