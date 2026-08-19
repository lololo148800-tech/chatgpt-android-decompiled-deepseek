package p449S9;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p232J3.C4206F;
import p499U9.C7591u;

/* JADX INFO: renamed from: S9.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C7056Z extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final C7098x f22529Y;

    /* JADX INFO: renamed from: Z */
    public final int f22530Z;

    public C7056Z(C7098x c7098x) throws C4206F {
        c7098x.getClass();
        this.f22529Y = c7098x;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            C7098x c7098x2 = this.f22529Y;
            if (i10 >= c7098x2.size()) {
                break;
            }
            int iMo7455b = ((AbstractC7072h0) c7098x2.get(i10)).mo7455b();
            if (i11 < iMo7455b) {
                i11 = iMo7455b;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f22530Z = i12;
        if (i12 > 8) {
            throw new C4206F("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d((byte) -128);
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: b */
    public final int mo7455b() {
        return this.f22530Z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        int iMo7454a = abstractC7072h0.mo7454a();
        int iM7475d = AbstractC7072h0.m7475d((byte) -128);
        if (iM7475d != iMo7454a) {
            return iM7475d - abstractC7072h0.mo7454a();
        }
        C7098x c7098x = this.f22529Y;
        int size = c7098x.size();
        C7098x c7098x2 = ((C7056Z) abstractC7072h0).f22529Y;
        if (size != c7098x2.size()) {
            return c7098x.size() - c7098x2.size();
        }
        for (int i10 = 0; i10 < c7098x.size(); i10++) {
            int iCompareTo = ((AbstractC7072h0) c7098x.get(i10)).compareTo((AbstractC7072h0) c7098x2.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7056Z.class == obj.getClass()) {
            return this.f22529Y.equals(((C7056Z) obj).f22529Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC7072h0.m7475d((byte) -128)), this.f22529Y});
    }

    public final String toString() {
        C7098x c7098x = this.f22529Y;
        if (c7098x.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c7098x.f22587p0; i10++) {
            arrayList.add(((AbstractC7072h0) c7098x.get(i10)).toString().replace(Separators.RETURN, "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(C7591u.m7939N(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(C7591u.m7939N(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
