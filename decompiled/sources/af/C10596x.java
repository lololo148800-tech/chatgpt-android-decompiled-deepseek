package af;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C10596x implements InterfaceC10597y {

    /* JADX INFO: renamed from: a */
    public final String f31447a;

    public C10596x(String note) {
        AbstractC16544l.m18094g(note, "note");
        this.f31447a = note;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10596x) && AbstractC16544l.m18089b(this.f31447a, ((C10596x) obj).f31447a);
    }

    public final int hashCode() {
        return this.f31447a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
