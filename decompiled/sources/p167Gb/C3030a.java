package p167Gb;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Gb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3030a {

    /* JADX INFO: renamed from: a */
    public final String f9121a;

    /* JADX INFO: renamed from: b */
    public final String f9122b;

    public C3030a(String str, String str2) {
        this.f9121a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9122b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3030a)) {
            return false;
        }
        C3030a c3030a = (C3030a) obj;
        return this.f9121a.equals(c3030a.f9121a) && this.f9122b.equals(c3030a.f9122b);
    }

    public final int hashCode() {
        return ((this.f9121a.hashCode() ^ 1000003) * 1000003) ^ this.f9122b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f9121a);
        sb2.append(", version=");
        return AbstractC9306j0.m9891j(this.f9122b, "}", sb2);
    }
}
