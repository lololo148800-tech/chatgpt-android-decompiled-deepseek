package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.L3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0957L3 implements InterfaceC1028X3 {
    public static final C0951K3 Companion = new C0951K3();

    /* JADX INFO: renamed from: a */
    public final String f2718a;

    /* JADX INFO: renamed from: b */
    public final String f2719b;

    public /* synthetic */ C0957L3(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C0945J3.f2709a.getDescriptor());
            throw null;
        }
        this.f2718a = str;
        if ((i10 & 2) == 0) {
            this.f2719b = "audio_transcription";
        } else {
            this.f2719b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0957L3)) {
            return false;
        }
        C0957L3 c0957l3 = (C0957L3) obj;
        return AbstractC16544l.m18089b(this.f2718a, c0957l3.f2718a) && AbstractC16544l.m18089b(this.f2719b, c0957l3.f2719b);
    }

    public final int hashCode() {
        return this.f2719b.hashCode() + (this.f2718a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
