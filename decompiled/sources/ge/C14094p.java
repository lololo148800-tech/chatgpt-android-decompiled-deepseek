package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C14094p implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44331a;

    public C14094p(String str) {
        this.f44331a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14094p) {
            return AbstractC16544l.m18089b(this.f44331a, ((C14094p) obj).f44331a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44331a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
