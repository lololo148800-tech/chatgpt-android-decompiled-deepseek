package p948pi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pi.e */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18422e extends AbstractC18425h {
    public static final C18421d Companion = new C18421d();

    /* JADX INFO: renamed from: a */
    public final String f58782a;

    /* JADX INFO: renamed from: b */
    public final boolean f58783b;

    /* JADX INFO: renamed from: c */
    public final C5551u f58784c;

    /* JADX INFO: renamed from: d */
    public final boolean f58785d;

    public C18422e(String id2, boolean z6, C5551u c5551u, int i10) {
        z6 = (i10 & 2) != 0 ? false : z6;
        c5551u = (i10 & 4) != 0 ? null : c5551u;
        boolean z10 = (i10 & 8) != 0;
        AbstractC16544l.m18094g(id2, "id");
        this.f58782a = id2;
        this.f58783b = z6;
        this.f58784c = c5551u;
        this.f58785d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18422e)) {
            return false;
        }
        C18422e c18422e = (C18422e) obj;
        return AbstractC16544l.m18089b(this.f58782a, c18422e.f58782a) && this.f58783b == c18422e.f58783b && AbstractC16544l.m18089b(this.f58784c, c18422e.f58784c) && this.f58785d == c18422e.f58785d;
    }

    public final int hashCode() {
        int iHashCode = ((this.f58782a.hashCode() * 31) + (this.f58783b ? 1231 : 1237)) * 31;
        C5551u c5551u = this.f58784c;
        return ((iHashCode + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31) + (this.f58785d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C18422e(int i10, String str, boolean z6, C5551u c5551u) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C18420c.f58781a.getDescriptor());
            throw null;
        }
        this.f58782a = str;
        if ((i10 & 2) == 0) {
            this.f58783b = false;
        } else {
            this.f58783b = z6;
        }
        if ((i10 & 4) == 0) {
            this.f58784c = null;
        } else {
            this.f58784c = c5551u;
        }
        this.f58785d = true;
    }
}
