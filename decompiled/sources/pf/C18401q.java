package pf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18401q extends AbstractC18404t {

    /* JADX INFO: renamed from: a */
    public final String f58699a;

    public C18401q(String str) {
        this.f58699a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18401q) && AbstractC16544l.m18089b(this.f58699a, ((C18401q) obj).f58699a);
    }

    public final int hashCode() {
        return this.f58699a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
