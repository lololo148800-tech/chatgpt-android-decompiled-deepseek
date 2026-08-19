package sg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: sg.C */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19539C {
    public static final C19538B Companion = new C19538B();

    /* JADX INFO: renamed from: a */
    public final String f62068a;

    /* JADX INFO: renamed from: b */
    public final String f62069b;

    public /* synthetic */ C19539C(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C19537A.f62067a.getDescriptor());
            throw null;
        }
        this.f62068a = str;
        this.f62069b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19539C)) {
            return false;
        }
        C19539C c19539c = (C19539C) obj;
        return AbstractC16544l.m18089b(this.f62068a, c19539c.f62068a) && AbstractC16544l.m18089b(this.f62069b, c19539c.f62069b);
    }

    public final int hashCode() {
        int iHashCode = this.f62068a.hashCode() * 31;
        String str = this.f62069b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C19539C(String id2, String str) {
        AbstractC16544l.m18094g(id2, "id");
        this.f62068a = id2;
        this.f62069b = str;
    }
}
