package p172Gi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3077j {
    public static final C3076i Companion = new C3076i();

    /* JADX INFO: renamed from: a */
    public final String f9278a;

    /* JADX INFO: renamed from: b */
    public final String f9279b;

    /* JADX INFO: renamed from: c */
    public final String f9280c;

    /* JADX INFO: renamed from: d */
    public final String f9281d;

    public C3077j(int i10, String str, String str2, String str3, String str4) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C3075h.f9277a.getDescriptor());
            throw null;
        }
        this.f9278a = str;
        this.f9279b = str2;
        this.f9280c = str3;
        if ((i10 & 8) == 0) {
            this.f9281d = null;
        } else {
            this.f9281d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3077j)) {
            return false;
        }
        C3077j c3077j = (C3077j) obj;
        return AbstractC16544l.m18089b(this.f9278a, c3077j.f9278a) && AbstractC16544l.m18089b(this.f9279b, c3077j.f9279b) && AbstractC16544l.m18089b(this.f9280c, c3077j.f9280c) && AbstractC16544l.m18089b(this.f9281d, c3077j.f9281d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f9278a.hashCode() * 31, 31, this.f9279b), 31, this.f9280c);
        String str = this.f9281d;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
