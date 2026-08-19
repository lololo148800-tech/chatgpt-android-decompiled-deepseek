package p449S9;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p232J3.C4206F;
import p499U9.C7591u;

/* JADX INFO: renamed from: S9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7066e0 extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final int f22540Y;

    /* JADX INFO: renamed from: Z */
    public final C7091r f22541Z;

    public C7066e0(C7091r c7091r) throws C4206F {
        c7091r.getClass();
        this.f22541Z = c7091r;
        AbstractC7036E abstractC7036EMo7428m = c7091r.entrySet().mo7428m();
        int i10 = 0;
        while (abstractC7036EMo7428m.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC7036EMo7428m.next();
            int iMo7455b = ((AbstractC7072h0) entry.getKey()).mo7455b();
            i10 = i10 < iMo7455b ? iMo7455b : i10;
            int iMo7455b2 = ((AbstractC7072h0) entry.getValue()).mo7455b();
            if (i10 < iMo7455b2) {
                i10 = iMo7455b2;
            }
        }
        int i11 = i10 + 1;
        this.f22540Y = i11;
        if (i11 > 8) {
            throw new C4206F("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d((byte) -96);
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: b */
    public final int mo7455b() {
        return this.f22540Y;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        int iMo7454a = abstractC7072h0.mo7454a();
        int iM7475d = AbstractC7072h0.m7475d((byte) -96);
        if (iM7475d != iMo7454a) {
            return iM7475d - abstractC7072h0.mo7454a();
        }
        C7091r c7091r = this.f22541Z;
        int size = c7091r.f22576p0.size();
        C7091r c7091r2 = ((C7066e0) abstractC7072h0).f22541Z;
        if (size != c7091r2.f22576p0.size()) {
            return c7091r.f22576p0.size() - c7091r2.f22576p0.size();
        }
        AbstractC7036E abstractC7036EMo7428m = c7091r.entrySet().mo7428m();
        AbstractC7036E abstractC7036EMo7428m2 = c7091r2.entrySet().mo7428m();
        do {
            if (!abstractC7036EMo7428m.hasNext() && !abstractC7036EMo7428m2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) abstractC7036EMo7428m.next();
            Map.Entry entry2 = (Map.Entry) abstractC7036EMo7428m2.next();
            int iCompareTo2 = ((AbstractC7072h0) entry.getKey()).compareTo((AbstractC7072h0) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((AbstractC7072h0) entry.getValue()).compareTo((AbstractC7072h0) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7066e0.class == obj.getClass()) {
            return this.f22541Z.equals(((C7066e0) obj).f22541Z);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC7072h0.m7475d((byte) -96)), this.f22541Z});
    }

    public final String toString() {
        C7091r c7091r = this.f22541Z;
        if (c7091r.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC7036E abstractC7036EMo7428m = c7091r.entrySet().mo7428m();
        while (abstractC7036EMo7428m.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC7036EMo7428m.next();
            linkedHashMap.put(((AbstractC7072h0) entry.getKey()).toString().replace(Separators.RETURN, "\n  "), ((AbstractC7072h0) entry.getValue()).toString().replace(Separators.RETURN, "\n  "));
        }
        C7591u c7591u = new C7591u(16);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            AbstractC7057a.m7462g(sb2, linkedHashMap.entrySet().iterator(), c7591u);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
