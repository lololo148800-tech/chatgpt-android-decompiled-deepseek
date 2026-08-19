package p098Di;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Di.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2057f implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final String f6278a;

    /* JADX INFO: renamed from: b */
    public final boolean f6279b;

    public C2057f(String str) {
        this.f6278a = str;
        this.f6279b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2057f)) {
            return false;
        }
        C2057f c2057f = (C2057f) obj;
        return AbstractC16544l.m18089b(this.f6278a, c2057f.f6278a) && this.f6279b == c2057f.f6279b;
    }

    public final int hashCode() {
        return (this.f6278a.hashCode() * 31) + (this.f6279b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C2057f(String str, boolean z6) {
        this.f6278a = str;
        this.f6279b = z6;
    }
}
