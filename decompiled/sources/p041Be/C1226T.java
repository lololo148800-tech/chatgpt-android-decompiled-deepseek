package p041Be;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Be.T */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1226T {
    public static final C1225S Companion = new C1225S();

    /* JADX INFO: renamed from: a */
    public final String f3233a;

    public C1226T(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f3233a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1226T) {
            return AbstractC16544l.m18089b(this.f3233a, ((C1226T) obj).f3233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3233a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C1226T(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f3233a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1224Q.f3232a.getDescriptor());
            throw null;
        }
    }
}
