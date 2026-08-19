package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.R4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0993R4 {
    public static final C0988Q4 Companion = new C0988Q4();

    /* JADX INFO: renamed from: a */
    public final String f2778a;

    public /* synthetic */ C0993R4(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f2778a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C0982P4.f2768a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0993R4) && AbstractC16544l.m18089b(this.f2778a, ((C0993R4) obj).f2778a);
    }

    public final int hashCode() {
        return this.f2778a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
