package p437Rn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10808o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import mm.C17309l;
import p1113xn.AbstractC21329w;
import p404Qe.C6665a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Rn.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C6966x implements InterfaceC6958p {

    /* JADX INFO: renamed from: a */
    public final C10808o f22273a;

    /* JADX INFO: renamed from: b */
    public final String f22274b;

    /* JADX INFO: renamed from: c */
    public final C6965w f22275c;

    public C6966x(Collection collection, C10808o c10808o, String whatThisExpects) {
        AbstractC16544l.m18094g(whatThisExpects, "whatThisExpects");
        this.f22273a = c10808o;
        this.f22274b = whatThisExpects;
        this.f22275c = new C6965w();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.f22274b).toString());
            }
            C6965w c6965w = this.f22275c;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                List list = c6965w.f22271a;
                int iM19378g = AbstractC17681o.m19378g(list, 0, list.size(), new C6665a(String.valueOf(cCharAt), 3));
                List list2 = c6965w.f22271a;
                if (iM19378g < 0) {
                    C6965w c6965w2 = new C6965w();
                    list2.add((-iM19378g) - 1, new C17309l(String.valueOf(cCharAt), c6965w2));
                    c6965w = c6965w2;
                } else {
                    c6965w = (C6965w) ((C17309l) list2.get(iM19378g)).f55137Z;
                }
            }
            if (c6965w.f22272b) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("The string '", str, "' was passed several times").toString());
            }
            c6965w.f22272b = true;
        }
        m7332b(this.f22275c);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7332b(C6965w c6965w) {
        Iterator it = c6965w.f22271a.iterator();
        while (it.hasNext()) {
            m7332b((C6965w) ((C17309l) it.next()).f55137Z);
        }
        ArrayList arrayList = new ArrayList();
        List<C17309l> list = c6965w.f22271a;
        for (C17309l c17309l : list) {
            String str = (String) c17309l.f55136Y;
            C6965w c6965w2 = (C6965w) c17309l.f55137Z;
            if (!c6965w2.f22272b) {
                List list2 = c6965w2.f22271a;
                if (list2.size() == 1) {
                    C17309l c17309l2 = (C17309l) AbstractC17680n.m19365o0(list2);
                    String str2 = (String) c17309l2.f55136Y;
                    arrayList.add(new C17309l(AbstractC10763a.m11052j(str, str2), (C6965w) c17309l2.f55137Z));
                }
            }
            arrayList.add(new C17309l(str, c6965w2));
        }
        list.clear();
        list.addAll(AbstractC17680n.m19370t0(arrayList, new C6955m(1)));
    }

    @Override // p437Rn.InterfaceC6958p
    /* JADX INFO: renamed from: a */
    public final Object mo7330a(InterfaceC6945c interfaceC6945c, String input, int i10) {
        String prefix;
        C6965w c6965w;
        int i11;
        AbstractC16544l.m18094g(input, "input");
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = i10;
        C6965w c6965w2 = this.f22275c;
        Integer numValueOf = null;
        loop0: while (c16558z.f51287Y <= input.length()) {
            if (c6965w2.f22272b) {
                numValueOf = Integer.valueOf(c16558z.f51287Y);
            }
            Iterator it = c6965w2.f22271a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                C17309l c17309l = (C17309l) it.next();
                prefix = (String) c17309l.f55136Y;
                c6965w = (C6965w) c17309l.f55137Z;
                i11 = c16558z.f51287Y;
                AbstractC16544l.m18094g(prefix, "prefix");
            } while (!AbstractC21329w.m21733t(i11, input, prefix, false));
            c16558z.f51287Y = prefix.length() + c16558z.f51287Y;
            c6965w2 = c6965w;
        }
        if (numValueOf == null) {
            return new C6952j(i10, new C6950h(this, input, i10, c16558z, 1));
        }
        String string = input.subSequence(i10, numValueOf.intValue()).toString();
        C10808o c10808o = this.f22273a;
        Object objMo7094d = c10808o.mo7094d(interfaceC6945c, string);
        return objMo7094d == null ? numValueOf : new C6952j(i10, new C6959q(objMo7094d, string, c10808o, 0));
    }
}
