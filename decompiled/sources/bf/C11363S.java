package bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: bf.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C11363S {

    /* JADX INFO: renamed from: a */
    public final C11364T f34359a;

    /* JADX INFO: renamed from: b */
    public final List f34360b;

    /* JADX INFO: renamed from: c */
    public final Object f34361c;

    /* JADX INFO: renamed from: d */
    public final String f34362d;

    /* JADX INFO: renamed from: e */
    public final String f34363e;

    public C11363S(C11364T info, List list, Object obj) {
        AbstractC16544l.m18094g(info, "info");
        AbstractC16544l.m18094g(list, "list");
        this.f34359a = info;
        this.f34360b = list;
        this.f34361c = obj;
        String str = info.f34365b;
        this.f34362d = str == null ? "" : str;
        String str2 = info.f34366c;
        this.f34363e = str2 != null ? str2 : "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11363S)) {
            return false;
        }
        C11363S c11363s = (C11363S) obj;
        return AbstractC16544l.m18089b(this.f34359a, c11363s.f34359a) && AbstractC16544l.m18089b(this.f34360b, c11363s.f34360b) && AbstractC16544l.m18089b(this.f34361c, c11363s.f34361c);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f34360b, this.f34359a.hashCode() * 31, 31);
        Object obj = this.f34361c;
        return iM15858x + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C11363S(List list, Object obj, int i10) {
        this(new C11364T(null, null, null, false, false), (i10 & 2) != 0 ? C17689w.f56480Y : list, (i10 & 4) != 0 ? null : obj);
    }
}
