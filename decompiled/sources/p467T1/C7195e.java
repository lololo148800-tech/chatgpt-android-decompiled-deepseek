package p467T1;

import p571X9.AbstractC9130F3;
import p571X9.AbstractC9136G3;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: T1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7195e {

    /* JADX INFO: renamed from: b */
    public static final int f22851b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f22852a;

    public final boolean equals(Object obj) {
        if (obj instanceof C7195e) {
            return this.f22852a == ((C7195e) obj).f22852a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22852a;
    }

    public final String toString() {
        return m7594a(this.f22852a);
    }

    /* JADX INFO: renamed from: a */
    public static String m7594a(int i10) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & 255;
        String str3 = "Invalid";
        if (AbstractC9130F3.m9669a(i11, 1)) {
            str = "Strategy.Simple";
        } else if (AbstractC9130F3.m9669a(i11, 2)) {
            str = "Strategy.HighQuality";
        } else if (AbstractC9130F3.m9669a(i11, 3)) {
            str = bQBnquXS.oBDUyhffhnQe;
        } else {
            str = AbstractC9130F3.m9669a(i11, 0) ? "Strategy.Unspecified" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i12 = (i10 >> 8) & 255;
        if (AbstractC9136G3.m9677c(i12, 1)) {
            str2 = "Strictness.None";
        } else if (AbstractC9136G3.m9677c(i12, 2)) {
            str2 = "Strictness.Loose";
        } else if (AbstractC9136G3.m9677c(i12, 3)) {
            str2 = "Strictness.Normal";
        } else if (AbstractC9136G3.m9677c(i12, 4)) {
            str2 = "Strictness.Strict";
        } else {
            str2 = AbstractC9136G3.m9677c(i12, 0) ? "Strictness.Unspecified" : "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i13 = (i10 >> 16) & 255;
        if (i13 == 1) {
            str3 = "WordBreak.None";
        } else if (i13 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }
}
