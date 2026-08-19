package p751ff;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ff.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13634e implements InterfaceC13636g {

    /* JADX INFO: renamed from: a */
    public final String f43078a;

    public C13634e(String instructions) {
        AbstractC16544l.m18094g(instructions, "instructions");
        this.f43078a = instructions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13634e) && AbstractC16544l.m18089b(this.f43078a, ((C13634e) obj).f43078a);
    }

    public final int hashCode() {
        return this.f43078a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
