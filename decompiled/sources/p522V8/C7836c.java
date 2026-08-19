package p522V8;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: V8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7836c {

    /* JADX INFO: renamed from: a */
    public final String f24730a;

    public C7836c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f24730a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7836c)) {
            return false;
        }
        return this.f24730a.equals(((C7836c) obj).f24730a);
    }

    public final int hashCode() {
        return this.f24730a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f24730a, "\"}", new StringBuilder("Encoding{name=\""));
    }
}
