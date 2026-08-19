package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1095x1.InterfaceC21098s;

/* JADX INFO: renamed from: of.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C18152O implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57900a;

    /* JADX INFO: renamed from: b */
    public final String f57901b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21098s f57902c;

    /* JADX INFO: renamed from: d */
    public final boolean f57903d;

    public C18152O(String messageId, String canmoreId, InterfaceC21098s interfaceC21098s, boolean z6) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(canmoreId, "canmoreId");
        this.f57900a = messageId;
        this.f57901b = canmoreId;
        this.f57902c = interfaceC21098s;
        this.f57903d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18152O)) {
            return false;
        }
        C18152O c18152o = (C18152O) obj;
        return AbstractC16544l.m18089b(this.f57900a, c18152o.f57900a) && AbstractC16544l.m18089b(this.f57901b, c18152o.f57901b) && AbstractC16544l.m18089b(this.f57902c, c18152o.f57902c) && this.f57903d == c18152o.f57903d;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57900a.hashCode() * 31, 31, this.f57901b);
        InterfaceC21098s interfaceC21098s = this.f57902c;
        return ((iM527p + (interfaceC21098s == null ? 0 : interfaceC21098s.hashCode())) * 31) + (this.f57903d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
