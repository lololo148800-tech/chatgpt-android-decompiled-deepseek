package p327N0;

import java.util.List;
import java.util.Set;
import p544W9.AbstractC8537P3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: N0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5571a implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final Set f18067Z;

    /* JADX INFO: renamed from: o0 */
    public static final List f18068o0;

    /* JADX INFO: renamed from: Y */
    public final int f18069Y;

    static {
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        f18067Z = AbstractC17678l.m19293P(new C5571a[]{new C5571a(i12), new C5571a(i11), new C5571a(i10)});
        List listM19382k = AbstractC17681o.m19382k(new C5571a(i10), new C5571a(i11), new C5571a(i12));
        f18068o0 = listM19382k;
        AbstractC17680n.m19328G0(listM19382k);
    }

    public /* synthetic */ C5571a(int i10) {
        this.f18069Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5978a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m5979b(int i10) {
        String str;
        if (m5978a(i10, 0)) {
            str = "Compact";
        } else if (m5978a(i10, 1)) {
            str = "Medium";
        } else {
            str = m5978a(i10, 2) ? "Expanded" : "";
        }
        return "WindowHeightSizeClass.".concat(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(AbstractC8537P3.m9200a(this.f18069Y), AbstractC8537P3.m9200a(((C5571a) obj).f18069Y));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5571a) {
            return this.f18069Y == ((C5571a) obj).f18069Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18069Y;
    }

    public final String toString() {
        return m5979b(this.f18069Y);
    }
}
