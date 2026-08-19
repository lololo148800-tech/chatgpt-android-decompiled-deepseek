package p622Ze;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ze.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C10295m implements InterfaceC10297o {

    /* JADX INFO: renamed from: a */
    public final String f30578a;

    public C10295m(String url) {
        AbstractC16544l.m18094g(url, "url");
        this.f30578a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10295m) && AbstractC16544l.m18089b(this.f30578a, ((C10295m) obj).f30578a);
    }

    public final int hashCode() {
        return this.f30578a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
