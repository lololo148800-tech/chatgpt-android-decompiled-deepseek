package p812ii;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: ii.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C15016p.class)
public final class C15012l {
    public static final C15007g Companion = new C15007g();

    /* JADX INFO: renamed from: a */
    public final Object f46706a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public C15012l(String string) {
        AbstractC16544l.m18094g(string, "string");
        Companion.getClass();
        int length = string.length();
        Object arrayList = C17689w.f56480Y;
        if (length != 0) {
            if (AbstractC21329w.m21734u(string, Separators.SLASH, false)) {
                string = string.substring(1);
                AbstractC16544l.m18093f(string, "substring(...)");
            }
            if (string.length() != 0) {
                List listM21696d0 = AbstractC21322p.m21696d0(string, new char[]{'/'}, 6);
                arrayList = new ArrayList(AbstractC17682p.m19389r(listM21696d0, 10));
                Iterator it = listM21696d0.iterator();
                while (it.hasNext()) {
                    String strM21731r = AbstractC21329w.m21731r(AbstractC21329w.m21731r((String) it.next(), "~1", Separators.SLASH), "~0", "~");
                    Integer numM21736w = AbstractC21329w.m21736w(strM21731r);
                    arrayList.add(numM21736w != null ? new C15008h(numM21736w.intValue()) : new C15009i(strM21731r));
                }
            }
        }
        this.f46706a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m16136a() {
        return AbstractC9306j0.m9889h(Separators.SLASH, AbstractC17680n.m19349Y((Iterable) this.f46706a, Separators.SLASH, null, null, 0, null, C15011k.f46703Z, 30));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15012l) && AbstractC16544l.m18089b(this.f46706a, ((C15012l) obj).f46706a);
    }

    public final int hashCode() {
        return this.f46706a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
