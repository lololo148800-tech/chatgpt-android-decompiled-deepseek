package af;

import bf.C11363S;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10547C implements InterfaceC10551G {

    /* JADX INFO: renamed from: a */
    public final C11363S f31311a;

    public C10547C(C11363S category) {
        AbstractC16544l.m18094g(category, "category");
        this.f31311a = category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10547C) && AbstractC16544l.m18089b(this.f31311a, ((C10547C) obj).f31311a);
    }

    public final int hashCode() {
        return this.f31311a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
