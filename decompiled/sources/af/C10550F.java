package af;

import bf.C11363S;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C10550F implements InterfaceC10551G {

    /* JADX INFO: renamed from: a */
    public final C11363S f31315a;

    public C10550F(C11363S category) {
        AbstractC16544l.m18094g(category, "category");
        this.f31315a = category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10550F) && AbstractC16544l.m18089b(this.f31315a, ((C10550F) obj).f31315a);
    }

    public final int hashCode() {
        return this.f31315a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
