package p812ii;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ii.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15009i extends AbstractC15010j {

    /* JADX INFO: renamed from: a */
    public final String f46702a;

    public C15009i(String str) {
        this.f46702a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15009i) && AbstractC16544l.m18089b(this.f46702a, ((C15009i) obj).f46702a);
    }

    public final int hashCode() {
        return this.f46702a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
