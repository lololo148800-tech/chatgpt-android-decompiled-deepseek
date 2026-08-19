package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C14050S implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44166a;

    public C14050S(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f44166a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14050S) && AbstractC16544l.m18089b(this.f44166a, ((C14050S) obj).f44166a);
    }

    public final int hashCode() {
        return this.f44166a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
