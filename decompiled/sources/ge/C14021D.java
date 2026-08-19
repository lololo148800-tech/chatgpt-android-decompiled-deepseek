package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C14021D implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44106a;

    public C14021D(String str) {
        this.f44106a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14021D) {
            return AbstractC16544l.m18089b(this.f44106a, ((C14021D) obj).f44106a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44106a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
