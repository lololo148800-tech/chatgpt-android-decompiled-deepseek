package p098Di;

import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;

/* JADX INFO: renamed from: Di.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2054c implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final C3590f f6274a;

    /* JADX INFO: renamed from: b */
    public final String f6275b;

    public C2054c(C3590f c3590f, String str) {
        this.f6274a = c3590f;
        this.f6275b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2054c)) {
            return false;
        }
        C2054c c2054c = (C2054c) obj;
        return AbstractC16544l.m18089b(this.f6274a, c2054c.f6274a) && AbstractC16544l.m18089b(this.f6275b, c2054c.f6275b);
    }

    public final int hashCode() {
        int iHashCode = this.f6274a.hashCode() * 31;
        String str = this.f6275b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C2054c(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f6274a = new C3590f(6, text, null);
        this.f6275b = null;
    }
}
