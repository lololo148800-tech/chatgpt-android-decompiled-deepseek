package p571X9;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1045ul.C20387d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p364Oh.C6244r;
import p523V9.AbstractC8150n4;
import p544W9.AbstractC8693p4;
import p604Yk.C10077b;
import p857kl.AbstractC16442I;
import p857kl.AbstractC16467o;
import p857kl.AbstractC16469q;
import p857kl.C16452T;
import p857kl.C16464l;
import p857kl.EnumC16465m;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: X9.Z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9248Z2 {
    /* JADX INFO: renamed from: a */
    public static final C6244r m9821a(ArrayList arrayList) {
        String string;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16464l cookie = (C16464l) it.next();
            Set set = AbstractC16467o.f51084a;
            AbstractC16544l.m18094g(cookie, "cookie");
            String name = cookie.f51070a;
            AbstractC16544l.m18094g(name, "name");
            String value = cookie.f51071b;
            AbstractC16544l.m18094g(value, "value");
            EnumC16465m encoding = cookie.f51072c;
            AbstractC16544l.m18094g(encoding, "encoding");
            Map extensions = cookie.f51079j;
            AbstractC16544l.m18094g(extensions, "extensions");
            AbstractC16467o.m18039a(name);
            String str = name + '=' + AbstractC16467o.m18040b(value.toString(), encoding);
            Integer num = cookie.f51073d;
            String str2 = num != null ? "Max-Age=" + num : "";
            C20387d c20387d = cookie.f51074e;
            if (c20387d != null) {
                List list = AbstractC16469q.f51106a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c20387d.f64475p0.f64488Y.concat(", "));
                sb2.append(AbstractC21322p.m21686T(2, String.valueOf(c20387d.f64476q0)) + ' ');
                sb2.append(c20387d.f64478s0.f64484Y.concat(Separators.f31991SP));
                sb2.append(AbstractC21322p.m21686T(4, String.valueOf(c20387d.f64479t0)));
                sb2.append(Separators.f31991SP + AbstractC21322p.m21686T(2, String.valueOf(c20387d.f64474o0)) + ':' + AbstractC21322p.m21686T(2, String.valueOf(c20387d.f64473Z)) + ':' + AbstractC21322p.m21686T(2, String.valueOf(c20387d.f64472Y)) + ' ');
                sb2.append("GMT");
                string = sb2.toString();
                AbstractC16544l.m18093f(string, "toString(...)");
            } else {
                string = null;
            }
            String str3 = string != null ? "Expires=" + ((Object) string) : "";
            EnumC16465m enumC16465m = EnumC16465m.f51080Y;
            String str4 = cookie.f51075f;
            String str5 = str4 != null ? "Domain=" + AbstractC16467o.m18040b(str4.toString(), enumC16465m) : "";
            String str6 = cookie.f51076g;
            List listM19382k = AbstractC17681o.m19382k(str, str2, str3, str5, str6 != null ? "Path=" + AbstractC16467o.m18040b(str6.toString(), enumC16465m) : "", cookie.f51077h ? "Secure" : "", cookie.f51078i ? "HttpOnly" : "");
            ArrayList arrayList3 = new ArrayList(extensions.size());
            for (Map.Entry entry : extensions.entrySet()) {
                String str7 = (String) entry.getKey();
                AbstractC16467o.m18039a(str7);
                String str8 = (String) entry.getValue();
                if (str8 != null) {
                    str7 = str7 + '=' + AbstractC16467o.m18040b(str8.toString(), EnumC16465m.f51080Y);
                }
                arrayList3.add(str7);
            }
            ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(arrayList3, listM19382k);
            String strName = encoding.name();
            ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(arrayListM19361k0, strName == null ? "$x-enc" : "$x-enc=" + AbstractC16467o.m18040b(strName.toString(), EnumC16465m.f51080Y));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayListM19362l0) {
                if (((String) obj).length() > 0) {
                    arrayList4.add(obj);
                }
            }
            arrayList2.add(AbstractC17680n.m19349Y(arrayList4, "; ", null, null, 0, null, null, 62));
        }
        return new C6244r(arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m9822b(C6244r c6244r) {
        AbstractC16544l.m18094g(c6244r, "<this>");
        List list = c6244r.f20326a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC16467o.m18042d((String) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9823c(C16464l c16464l, C16452T requestUrl) {
        String strM21715w0;
        AbstractC16544l.m18094g(c16464l, "<this>");
        AbstractC16544l.m18094g(requestUrl, "requestUrl");
        String str = c16464l.f51075f;
        if (str == null || (strM21715w0 = AbstractC21322p.m21715w0(AbstractC8150n4.m8692e(str), '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value");
        }
        String strConcat = c16464l.f51076g;
        if (strConcat == null) {
            throw new IllegalStateException("Path field should have the default value");
        }
        if (!AbstractC21322p.m21671E(strConcat, '/')) {
            strConcat = strConcat.concat(Separators.SLASH);
        }
        String strM8692e = AbstractC8150n4.m8692e(requestUrl.f51035a);
        String strConcat2 = (String) requestUrl.f51044j.getValue();
        if (!AbstractC21322p.m21671E(strConcat2, '/')) {
            strConcat2 = strConcat2.concat(Separators.SLASH);
        }
        if (!strM8692e.equals(strM21715w0)) {
            C10077b c10077b = AbstractC16442I.f51015a;
            c10077b.getClass();
            if (((C21319m) c10077b.f29833Z).m21664d(strM8692e) || !AbstractC21329w.m21725l(strM8692e, Separators.DOT.concat(strM21715w0), false)) {
                return false;
            }
        }
        if (AbstractC16544l.m18089b(strConcat, Separators.SLASH) || AbstractC16544l.m18089b(strConcat2, strConcat) || AbstractC21329w.m21734u(strConcat2, strConcat, false)) {
            return !c16464l.f51077h || AbstractC8693p4.m9393e(requestUrl.f51043i);
        }
        return false;
    }
}
