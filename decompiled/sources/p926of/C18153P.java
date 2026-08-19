package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.AbstractC6601G;
import p403Qd.C6638j;

/* JADX INFO: renamed from: of.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C18153P implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final AbstractC6601G f57904a;

    static {
        C6638j c6638j = AbstractC6601G.Companion;
    }

    public C18153P(AbstractC6601G abstractC6601G) {
        this.f57904a = abstractC6601G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18153P) && AbstractC16544l.m18089b(this.f57904a, ((C18153P) obj).f57904a);
    }

    public final int hashCode() {
        AbstractC6601G abstractC6601G = this.f57904a;
        if (abstractC6601G == null) {
            return 0;
        }
        return abstractC6601G.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
