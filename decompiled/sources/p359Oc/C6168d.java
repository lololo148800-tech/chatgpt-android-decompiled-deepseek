package p359Oc;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Oc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6168d {

    /* JADX INFO: renamed from: a */
    public final String f20078a;

    /* JADX INFO: renamed from: b */
    public final String f20079b;

    /* JADX INFO: renamed from: c */
    public final C6165a f20080c;

    /* JADX INFO: renamed from: d */
    public final String f20081d;

    /* JADX INFO: renamed from: e */
    public final C6166b f20082e;

    /* JADX INFO: renamed from: f */
    public final boolean f20083f;

    public C6168d(String messageMarkdown, String primaryCta, C6165a c6165a, String str, C6166b c6166b, boolean z6) {
        EnumC6167c enumC6167c = EnumC6167c.f20076Y;
        AbstractC16544l.m18094g(messageMarkdown, "messageMarkdown");
        AbstractC16544l.m18094g(primaryCta, "primaryCta");
        this.f20078a = messageMarkdown;
        this.f20079b = primaryCta;
        this.f20080c = c6165a;
        this.f20081d = str;
        this.f20082e = c6166b;
        this.f20083f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6168d)) {
            return false;
        }
        C6168d c6168d = (C6168d) obj;
        c6168d.getClass();
        EnumC6167c enumC6167c = EnumC6167c.f20076Y;
        return AbstractC16544l.m18089b(this.f20078a, c6168d.f20078a) && AbstractC16544l.m18089b(this.f20079b, c6168d.f20079b) && this.f20080c.equals(c6168d.f20080c) && AbstractC16544l.m18089b(this.f20081d, c6168d.f20081d) && AbstractC16544l.m18089b(this.f20082e, c6168d.f20082e) && this.f20083f == c6168d.f20083f;
    }

    public final int hashCode() {
        int iHashCode = (this.f20080c.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(EnumC6167c.f20076Y.hashCode() * 31, 31, this.f20078a), 31, this.f20079b)) * 31;
        String str = this.f20081d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C6166b c6166b = this.f20082e;
        return ((iHashCode2 + (c6166b != null ? c6166b.f20075a.hashCode() : 0)) * 31) + (this.f20083f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
