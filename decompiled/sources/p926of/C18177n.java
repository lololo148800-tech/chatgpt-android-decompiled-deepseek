package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p991rh.AbstractC19000i;

/* JADX INFO: renamed from: of.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18177n implements InterfaceC18179p {

    /* JADX INFO: renamed from: a */
    public final AbstractC19000i f57990a;

    static {
        int i10 = AbstractC19000i.f60578Y;
    }

    public C18177n(AbstractC19000i error) {
        AbstractC16544l.m18094g(error, "error");
        this.f57990a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18177n) && AbstractC16544l.m18089b(this.f57990a, ((C18177n) obj).f57990a);
    }

    public final int hashCode() {
        return this.f57990a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
