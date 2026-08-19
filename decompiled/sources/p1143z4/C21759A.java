package p1143z4;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C21759A {

    /* JADX INFO: renamed from: a */
    public final boolean f69022a;

    /* JADX INFO: renamed from: b */
    public final boolean f69023b;

    /* JADX INFO: renamed from: c */
    public final int f69024c;

    /* JADX INFO: renamed from: d */
    public final boolean f69025d;

    /* JADX INFO: renamed from: e */
    public final boolean f69026e;

    /* JADX INFO: renamed from: f */
    public final int f69027f;

    /* JADX INFO: renamed from: g */
    public final int f69028g;

    public C21759A(boolean z6, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12) {
        this.f69022a = z6;
        this.f69023b = z10;
        this.f69024c = i10;
        this.f69025d = z11;
        this.f69026e = z12;
        this.f69027f = i11;
        this.f69028g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21759A)) {
            return false;
        }
        C21759A c21759a = (C21759A) obj;
        return this.f69022a == c21759a.f69022a && this.f69023b == c21759a.f69023b && this.f69024c == c21759a.f69024c && AbstractC16544l.m18089b(null, null) && this.f69025d == c21759a.f69025d && this.f69026e == c21759a.f69026e && this.f69027f == c21759a.f69027f && this.f69028g == c21759a.f69028g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f69022a ? 1 : 0) * 31) + (this.f69023b ? 1 : 0)) * 31) + this.f69024c) * 961) + (this.f69025d ? 1 : 0)) * 31) + (this.f69026e ? 1 : 0)) * 31) + this.f69027f) * 31) + this.f69028g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C21759A.class.getSimpleName());
        sb2.append(Separators.LPAREN);
        if (this.f69022a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f69023b) {
            sb2.append("restoreState ");
        }
        int i10 = this.f69028g;
        int i11 = this.f69027f;
        if (i11 != -1 || i10 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(Separators.RPAREN);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }
}
