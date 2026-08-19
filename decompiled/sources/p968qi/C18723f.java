package p968qi;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: qi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18723f extends AbstractC18724g {

    /* JADX INFO: renamed from: a */
    public final String f59565a;

    public C18723f(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f59565a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18723f) && AbstractC16544l.m18089b(this.f59565a, ((C18723f) obj).f59565a);
    }

    public final int hashCode() {
        return this.f59565a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
