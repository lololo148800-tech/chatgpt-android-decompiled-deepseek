package p947pd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18363c {
    public static final C18362b Companion = new C18362b();

    /* JADX INFO: renamed from: a */
    public final String f58633a;

    /* JADX INFO: renamed from: b */
    public final C5551u f58634b;

    public /* synthetic */ C18363c(int i10, String str, C5551u c5551u) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18361a.f58632a.getDescriptor());
            throw null;
        }
        this.f58633a = str;
        this.f58634b = c5551u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18363c)) {
            return false;
        }
        C18363c c18363c = (C18363c) obj;
        return AbstractC16544l.m18089b(this.f58633a, c18363c.f58633a) && AbstractC16544l.m18089b(this.f58634b, c18363c.f58634b);
    }

    public final int hashCode() {
        String str = this.f58633a;
        return this.f58634b.f18004Y.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "█";
    }
}
