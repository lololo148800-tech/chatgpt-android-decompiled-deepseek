package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.o0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21489o0 {
    public static final C21487n0 Companion = new C21487n0();

    /* JADX INFO: renamed from: a */
    public final String f68100a;

    public C21489o0(String messageId) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f68100a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21489o0) {
            return AbstractC16544l.m18089b(this.f68100a, ((C21489o0) obj).f68100a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68100a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C21489o0(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f68100a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21485m0.f68085a.getDescriptor());
            throw null;
        }
    }
}
