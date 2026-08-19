package ng;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ng.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17616g implements InterfaceC17617h {

    /* JADX INFO: renamed from: a */
    public final String f56374a;

    public C17616g(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f56374a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17616g) && AbstractC16544l.m18089b(this.f56374a, ((C17616g) obj).f56374a);
    }

    public final int hashCode() {
        return this.f56374a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
