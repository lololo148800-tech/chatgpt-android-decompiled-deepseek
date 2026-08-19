package kg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: kg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16401g implements InterfaceC16403i {

    /* JADX INFO: renamed from: a */
    public final String f50914a;

    public C16401g(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f50914a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16401g) && AbstractC16544l.m18089b(this.f50914a, ((C16401g) obj).f50914a);
    }

    public final int hashCode() {
        return this.f50914a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
