package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C0937I1;

/* JADX INFO: renamed from: of.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18162Z {

    /* JADX INFO: renamed from: a */
    public final String f57926a;

    /* JADX INFO: renamed from: b */
    public final C0937I1 f57927b;

    /* JADX INFO: renamed from: c */
    public final boolean f57928c;

    public C18162Z(String messageId, C0937I1 c0937i1, boolean z6) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f57926a = messageId;
        this.f57927b = c0937i1;
        this.f57928c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18162Z)) {
            return false;
        }
        C18162Z c18162z = (C18162Z) obj;
        return AbstractC16544l.m18089b(this.f57926a, c18162z.f57926a) && AbstractC16544l.m18089b(this.f57927b, c18162z.f57927b) && this.f57928c == c18162z.f57928c;
    }

    public final int hashCode() {
        return ((this.f57927b.hashCode() + (this.f57926a.hashCode() * 31)) * 31) + (this.f57928c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
