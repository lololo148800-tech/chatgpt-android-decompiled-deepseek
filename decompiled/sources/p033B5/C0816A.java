package p033B5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: B5.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0816A {

    /* JADX INFO: renamed from: a */
    public final String f2276a;

    /* JADX INFO: renamed from: b */
    public final String f2277b;

    /* JADX INFO: renamed from: c */
    public final String f2278c;

    /* JADX INFO: renamed from: d */
    public final String f2279d;

    /* JADX INFO: renamed from: e */
    public final String f2280e;

    public C0816A(String str, String str2, String str3, String str4, String str5) {
        this.f2276a = str;
        this.f2277b = str2;
        this.f2278c = str3;
        this.f2279d = str4;
        this.f2280e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0816A) && AbstractC16544l.m18089b(((C0816A) obj).f2276a, this.f2276a);
    }

    public final int hashCode() {
        return this.f2276a.hashCode();
    }

    public final String toString() {
        return this.f2276a;
    }
}
