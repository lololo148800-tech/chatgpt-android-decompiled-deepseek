package p925oe;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: oe.X */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18098X {
    public static final C18097W Companion = new C18097W();

    /* JADX INFO: renamed from: a */
    public final String f57738a;

    /* JADX INFO: renamed from: b */
    public final boolean f57739b;

    public C18098X(String conversationId, boolean z6) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f57738a = conversationId;
        this.f57739b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18098X)) {
            return false;
        }
        C18098X c18098x = (C18098X) obj;
        return AbstractC16544l.m18089b(this.f57738a, c18098x.f57738a) && this.f57739b == c18098x.f57739b;
    }

    public final int hashCode() {
        return (this.f57738a.hashCode() * 31) + (this.f57739b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C18098X(String str, int i10, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18096V.f57737a.getDescriptor());
            throw null;
        }
        this.f57738a = str;
        this.f57739b = z6;
    }
}
