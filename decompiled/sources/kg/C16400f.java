package kg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: kg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16400f implements InterfaceC16403i {

    /* JADX INFO: renamed from: a */
    public final String f50913a;

    public C16400f(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f50913a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16400f) && AbstractC16544l.m18089b(this.f50913a, ((C16400f) obj).f50913a);
    }

    public final int hashCode() {
        return this.f50913a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
