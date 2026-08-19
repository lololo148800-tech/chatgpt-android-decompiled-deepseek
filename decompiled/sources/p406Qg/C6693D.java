package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;
import p506Ug.C7671f;

/* JADX INFO: renamed from: Qg.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6693D implements InterfaceC6699J {

    /* JADX INFO: renamed from: a */
    public final C7671f f21522a;

    public C6693D(C7671f memory) {
        AbstractC16544l.m18094g(memory, "memory");
        this.f21522a = memory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6693D) && AbstractC16544l.m18089b(this.f21522a, ((C6693D) obj).f21522a);
    }

    public final int hashCode() {
        return this.f21522a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
