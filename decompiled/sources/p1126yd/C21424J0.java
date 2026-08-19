package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.J0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21424J0 extends AbstractC21504w {
    public static final C21422I0 Companion = new C21422I0();

    /* JADX INFO: renamed from: a */
    public final String f67995a;

    /* JADX INFO: renamed from: b */
    public final String f67996b;

    /* JADX INFO: renamed from: c */
    public final String f67997c;

    public C21424J0(int i10, String str, String str2, String str3) {
        if (6 != (i10 & 6)) {
            AbstractC11153a0.m12389l(i10, 6, C21420H0.f67991a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f67995a = "message";
        } else {
            this.f67995a = str;
        }
        this.f67996b = str2;
        this.f67997c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21424J0)) {
            return false;
        }
        C21424J0 c21424j0 = (C21424J0) obj;
        return AbstractC16544l.m18089b(this.f67995a, c21424j0.f67995a) && AbstractC16544l.m18089b(this.f67996b, c21424j0.f67996b) && AbstractC16544l.m18089b(this.f67997c, c21424j0.f67997c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f67995a.hashCode() * 31, 31, this.f67996b);
        String str = this.f67997c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
