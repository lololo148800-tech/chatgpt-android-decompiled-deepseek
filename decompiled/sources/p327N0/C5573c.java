package p327N0;

import java.util.List;
import java.util.Set;
import p1053v3.p1054lN.IGDwkYw;
import p544W9.AbstractC8543Q3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: N0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5573c implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final Set f18072Z;

    /* JADX INFO: renamed from: o0 */
    public static final List f18073o0;

    /* JADX INFO: renamed from: Y */
    public final int f18074Y;

    static {
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        f18072Z = AbstractC17678l.m19293P(new C5573c[]{new C5573c(i12), new C5573c(i11), new C5573c(i10)});
        List listM19382k = AbstractC17681o.m19382k(new C5573c(i10), new C5573c(i11), new C5573c(i12));
        f18073o0 = listM19382k;
        AbstractC17680n.m19328G0(listM19382k);
    }

    public /* synthetic */ C5573c(int i10) {
        this.f18074Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5980a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m5981b(int i10) {
        String str;
        if (m5980a(i10, 0)) {
            str = IGDwkYw.pxS;
        } else if (m5980a(i10, 1)) {
            str = "Medium";
        } else {
            str = m5980a(i10, 2) ? "Expanded" : "";
        }
        return "WindowWidthSizeClass.".concat(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(AbstractC8543Q3.m9204b(this.f18074Y), AbstractC8543Q3.m9204b(((C5573c) obj).f18074Y));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5573c) {
            return this.f18074Y == ((C5573c) obj).f18074Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18074Y;
    }

    public final String toString() {
        return m5981b(this.f18074Y);
    }
}
