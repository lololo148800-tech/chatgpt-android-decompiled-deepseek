package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.x0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21507x0 extends AbstractC21504w {
    public static final C21505w0 Companion = new C21505w0();

    /* JADX INFO: renamed from: a */
    public final String f68125a;

    /* JADX INFO: renamed from: b */
    public final String f68126b;

    /* JADX INFO: renamed from: c */
    public final String f68127c;

    public C21507x0(int i10, String str, String str2, String str3) {
        if (6 != (i10 & 6)) {
            AbstractC11153a0.m12389l(i10, 6, C21503v0.f68123a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f68125a = "gizmo";
        } else {
            this.f68125a = str;
        }
        this.f68126b = str2;
        this.f68127c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21507x0)) {
            return false;
        }
        C21507x0 c21507x0 = (C21507x0) obj;
        return AbstractC16544l.m18089b(this.f68125a, c21507x0.f68125a) && AbstractC16544l.m18089b(this.f68126b, c21507x0.f68126b) && AbstractC16544l.m18089b(this.f68127c, c21507x0.f68127c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f68125a.hashCode() * 31, 31, this.f68126b);
        String str = this.f68127c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
