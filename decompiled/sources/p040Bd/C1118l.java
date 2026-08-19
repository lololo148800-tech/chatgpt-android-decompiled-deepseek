package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1118l implements InterfaceC1136o {
    public static final C1112k Companion = new C1112k();

    /* JADX INFO: renamed from: a */
    public final String f3031a;

    /* JADX INFO: renamed from: b */
    public final String f3032b;

    public /* synthetic */ C1118l(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1105j.f3007a.getDescriptor());
            throw null;
        }
        this.f3031a = str;
        this.f3032b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118l)) {
            return false;
        }
        C1118l c1118l = (C1118l) obj;
        return AbstractC16544l.m18089b(this.f3031a, c1118l.f3031a) && AbstractC16544l.m18089b(this.f3032b, c1118l.f3032b);
    }

    public final int hashCode() {
        return this.f3032b.hashCode() + (this.f3031a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
