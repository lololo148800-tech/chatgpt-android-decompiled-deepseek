package p875ll;

import android.gov.nist.core.Separators;
import cn.UfGr.EhBykzn;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import nl.C17651e;
import p050Bn.C1450d;
import p857kl.C16473u;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: ll.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17064b extends AbstractC17066d {

    /* JADX INFO: renamed from: b */
    public final Object f54538b;

    /* JADX INFO: renamed from: c */
    public final EnumC17063a f54539c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p875ll.AbstractC17066d
    /* JADX INFO: renamed from: a */
    public final String mo18887a() {
        EnumC17063a encoding = this.f54539c;
        AbstractC16544l.m18094g(encoding, "encoding");
        ?? r6 = this.f54538b;
        boolean zIsEmpty = r6.isEmpty();
        String str = this.f54541a;
        return zIsEmpty ? str : AbstractC17680n.m19349Y((Iterable) r6, ", ", str.concat(Separators.f31991SP), null, 0, null, new C1450d(this, 7, encoding), 28);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17064b)) {
            return false;
        }
        C17064b c17064b = (C17064b) obj;
        return c17064b.f54541a.equalsIgnoreCase(this.f54541a) && AbstractC16544l.m18089b(c17064b.f54538b, this.f54538b);
    }

    public final int hashCode() {
        String lowerCase = this.f54541a.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        return AbstractC17678l.m19291N(new Object[]{lowerCase, this.f54538b}).hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17064b(String str, List list, EnumC17063a encoding) {
        super(str);
        AbstractC16544l.m18094g(encoding, "encoding");
        this.f54538b = list;
        this.f54539c = encoding;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC17067e.f54544c.m21664d(((C16473u) it.next()).f51112a)) {
                throw new C17651e(EhBykzn.rRhupnoiwUofc);
            }
        }
    }
}
