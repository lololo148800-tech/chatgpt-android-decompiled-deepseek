package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Hf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3358e implements InterfaceC3364g {

    /* JADX INFO: renamed from: a */
    public final String f10253a;

    /* JADX INFO: renamed from: b */
    public final String f10254b;

    public C3358e(String id2, String name) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        this.f10253a = id2;
        this.f10254b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3358e)) {
            return false;
        }
        C3358e c3358e = (C3358e) obj;
        return AbstractC16544l.m18089b(this.f10253a, c3358e.f10253a) && AbstractC16544l.m18089b(this.f10254b, c3358e.f10254b);
    }

    public final int hashCode() {
        return this.f10254b.hashCode() + (this.f10253a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
