package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C19638p {

    /* JADX INFO: renamed from: a */
    public final String f62282a;

    /* JADX INFO: renamed from: b */
    public final String f62283b;

    public C19638p(String str, String str2) {
        this.f62282a = str;
        this.f62283b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19638p)) {
            return false;
        }
        C19638p c19638p = (C19638p) obj;
        return AbstractC16544l.m18089b(this.f62282a, c19638p.f62282a) && AbstractC16544l.m18089b(this.f62283b, c19638p.f62283b);
    }

    public final int hashCode() {
        return this.f62283b.hashCode() + (this.f62282a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
