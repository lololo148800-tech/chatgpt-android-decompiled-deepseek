package p925oe;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: oe.d0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18108d0 {
    public static final C18106c0 Companion = new C18106c0();

    /* JADX INFO: renamed from: a */
    public final String f57761a;

    /* JADX INFO: renamed from: b */
    public final boolean f57762b;

    public C18108d0(String conversationId, boolean z6) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f57761a = conversationId;
        this.f57762b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18108d0)) {
            return false;
        }
        C18108d0 c18108d0 = (C18108d0) obj;
        return AbstractC16544l.m18089b(this.f57761a, c18108d0.f57761a) && this.f57762b == c18108d0.f57762b;
    }

    public final int hashCode() {
        return (this.f57761a.hashCode() * 31) + (this.f57762b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C18108d0(String str, int i10, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C18104b0.f57751a.getDescriptor());
            throw null;
        }
        this.f57761a = str;
        if ((i10 & 2) == 0) {
            this.f57762b = false;
        } else {
            this.f57762b = z6;
        }
    }
}
