package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: of.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18181r implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57993a;

    /* JADX INFO: renamed from: b */
    public final String f57994b;

    /* JADX INFO: renamed from: c */
    public final boolean f57995c;

    public C18181r(String messageId, String url, boolean z6) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(url, "url");
        this.f57993a = messageId;
        this.f57994b = url;
        this.f57995c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18181r)) {
            return false;
        }
        C18181r c18181r = (C18181r) obj;
        return AbstractC16544l.m18089b(this.f57993a, c18181r.f57993a) && AbstractC16544l.m18089b(this.f57994b, c18181r.f57994b) && this.f57995c == c18181r.f57995c;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(this.f57993a.hashCode() * 31, 31, this.f57994b) + (this.f57995c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
