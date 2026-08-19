package mh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mh.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C17275w implements InterfaceC17277y {

    /* JADX INFO: renamed from: a */
    public final String f55083a;

    public C17275w(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f55083a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17275w) && AbstractC16544l.m18089b(this.f55083a, ((C17275w) obj).f55083a);
    }

    public final int hashCode() {
        return this.f55083a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
