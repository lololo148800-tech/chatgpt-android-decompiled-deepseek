package p404Qe;

import kotlin.jvm.internal.AbstractC16544l;
import p1040ue.InterfaceC20204b;
import p1040ue.InterfaceC20205c;

/* JADX INFO: renamed from: Qe.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6683s implements InterfaceC20204b, InterfaceC20205c {

    /* JADX INFO: renamed from: a */
    public final String f21492a;

    /* JADX INFO: renamed from: b */
    public final String f21493b;

    public C6683s(String conversationId, String fileId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(fileId, "fileId");
        this.f21492a = conversationId;
        this.f21493b = fileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6683s)) {
            return false;
        }
        C6683s c6683s = (C6683s) obj;
        return AbstractC16544l.m18089b(this.f21492a, c6683s.f21492a) && AbstractC16544l.m18089b(this.f21493b, c6683s.f21493b);
    }

    public final int hashCode() {
        return this.f21493b.hashCode() + (this.f21492a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
