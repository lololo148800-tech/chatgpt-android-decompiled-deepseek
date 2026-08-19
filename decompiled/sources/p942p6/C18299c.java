package p942p6;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: p6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18299c {

    /* JADX INFO: renamed from: a */
    public final String f58411a;

    /* JADX INFO: renamed from: b */
    public final String f58412b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18299c)) {
            return false;
        }
        C18299c c18299c = (C18299c) obj;
        return AbstractC16544l.m18089b(this.f58411a, c18299c.f58411a) && AbstractC16544l.m18089b(this.f58412b, c18299c.f58412b);
    }

    public final int hashCode() {
        return this.f58412b.hashCode() + (this.f58411a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpHeader(name=");
        sb2.append(this.f58411a);
        sb2.append(", value=");
        return AbstractC9306j0.m9892k(sb2, this.f58412b, ')');
    }

    public C18299c(String name, String str) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(str, TfazcFv.rKYInPLTgtDr);
        this.f58411a = name;
        this.f58412b = str;
    }
}
