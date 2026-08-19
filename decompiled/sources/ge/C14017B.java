package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C14017B implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44100a;

    public C14017B(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f44100a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14017B) && AbstractC16544l.m18089b(this.f44100a, ((C14017B) obj).f44100a);
    }

    public final int hashCode() {
        return this.f44100a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
