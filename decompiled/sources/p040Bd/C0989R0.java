package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.R0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0989R0 {
    public static final C0984Q0 Companion = new C0984Q0();

    /* JADX INFO: renamed from: a */
    public final String f2771a;

    /* JADX INFO: renamed from: b */
    public final String f2772b;

    /* JADX INFO: renamed from: c */
    public final String f2773c;

    public /* synthetic */ C0989R0(int i10, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0978P0.f2758a.getDescriptor());
            throw null;
        }
        this.f2771a = str;
        this.f2772b = str2;
        this.f2773c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0989R0)) {
            return false;
        }
        C0989R0 c0989r0 = (C0989R0) obj;
        return AbstractC16544l.m18089b(this.f2771a, c0989r0.f2771a) && AbstractC16544l.m18089b(this.f2772b, c0989r0.f2772b) && AbstractC16544l.m18089b(this.f2773c, c0989r0.f2773c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f2771a.hashCode() * 31, 31, this.f2772b);
        String str = this.f2773c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
