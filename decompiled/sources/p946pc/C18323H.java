package p946pc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;

/* JADX INFO: renamed from: pc.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C18323H {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1439n f58491a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1441p f58492b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1439n f58493c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1441p f58494d;

    public C18323H(InterfaceC1439n textStyleProvider, InterfaceC1441p textStyleBackProvider, InterfaceC1439n contentColorProvider, InterfaceC1441p contentColorBackProvider) {
        AbstractC16544l.m18094g(textStyleProvider, "textStyleProvider");
        AbstractC16544l.m18094g(textStyleBackProvider, "textStyleBackProvider");
        AbstractC16544l.m18094g(contentColorProvider, "contentColorProvider");
        AbstractC16544l.m18094g(contentColorBackProvider, "contentColorBackProvider");
        this.f58491a = textStyleProvider;
        this.f58492b = textStyleBackProvider;
        this.f58493c = contentColorProvider;
        this.f58494d = contentColorBackProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18323H)) {
            return false;
        }
        C18323H c18323h = (C18323H) obj;
        return AbstractC16544l.m18089b(this.f58491a, c18323h.f58491a) && AbstractC16544l.m18089b(this.f58492b, c18323h.f58492b) && AbstractC16544l.m18089b(this.f58493c, c18323h.f58493c) && AbstractC16544l.m18089b(this.f58494d, c18323h.f58494d);
    }

    public final int hashCode() {
        return this.f58494d.hashCode() + ((this.f58493c.hashCode() + ((this.f58492b.hashCode() + (this.f58491a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.f58491a + ", textStyleBackProvider=" + this.f58492b + ", contentColorProvider=" + this.f58493c + ", contentColorBackProvider=" + this.f58494d + Separators.RPAREN;
    }
}
