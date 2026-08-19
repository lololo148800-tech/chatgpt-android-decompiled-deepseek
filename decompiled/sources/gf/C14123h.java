package gf;

import bf.InterfaceC11374b0;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14123h implements InterfaceC14124i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11374b0 f44458a;

    public C14123h(InterfaceC11374b0 snorlax) {
        AbstractC16544l.m18094g(snorlax, "snorlax");
        this.f44458a = snorlax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14123h) && AbstractC16544l.m18089b(this.f44458a, ((C14123h) obj).f44458a);
    }

    public final int hashCode() {
        return this.f44458a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
