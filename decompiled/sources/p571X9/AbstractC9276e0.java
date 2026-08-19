package p571X9;

import java.util.Iterator;
import mo.C17348o;
import no.AbstractC17708b;
import om.C18235b;
import p1113xn.AbstractC21322p;
import p389Pn.C6517b;
import p389Pn.C6519d;
import p389Pn.C6522g;
import p389Pn.C6524i;
import p389Pn.C6532q;
import p389Pn.C6536u;
import p389Pn.InterfaceC6527l;
import p389Pn.InterfaceC6530o;
import p523V9.AbstractC7965P4;

/* JADX INFO: renamed from: X9.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9276e0 {
    /* JADX INFO: renamed from: a */
    public static final void m9844a(C18235b c18235b, InterfaceC6527l interfaceC6527l) {
        if (interfaceC6527l instanceof C6519d) {
            c18235b.add(((C6519d) interfaceC6527l).f21128a);
            return;
        }
        if (interfaceC6527l instanceof C6522g) {
            Iterator it = ((C6522g) interfaceC6527l).f21133a.iterator();
            while (it.hasNext()) {
                m9844a(c18235b, (InterfaceC6530o) it.next());
            }
            return;
        }
        if (interfaceC6527l instanceof C6524i) {
            return;
        }
        if (interfaceC6527l instanceof C6536u) {
            m9844a(c18235b, ((C6536u) interfaceC6527l).f21153a);
            return;
        }
        if (!(interfaceC6527l instanceof C6517b)) {
            if (interfaceC6527l instanceof C6532q) {
                m9844a(c18235b, ((C6532q) interfaceC6527l).f21148b);
            }
        } else {
            C6517b c6517b = (C6517b) interfaceC6527l;
            m9844a(c18235b, c6517b.f21125a);
            Iterator it2 = c6517b.f21126b.iterator();
            while (it2.hasNext()) {
                m9844a(c18235b, (InterfaceC6527l) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9845b(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC17708b.m19418j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9846c(String str, String str2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC17708b.m19418j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                sb2.append(AbstractC17708b.m19426r(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static C17348o m9847d(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = AbstractC21322p.m21711s0(str).toString();
        }
        int iM8252c = AbstractC7965P4.m8252c(0, strArr2.length - 1, 2);
        if (iM8252c >= 0) {
            while (true) {
                String str2 = strArr2[i10];
                String str3 = strArr2[i10 + 1];
                m9845b(str2);
                m9846c(str3, str2);
                if (i10 == iM8252c) {
                    break;
                }
                i10 += 2;
            }
        }
        return new C17348o(strArr2);
    }
}
