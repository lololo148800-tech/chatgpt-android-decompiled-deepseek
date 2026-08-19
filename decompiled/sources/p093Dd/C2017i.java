package p093Dd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Dd.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2017i {
    public static final C2016h Companion = new C2016h();

    /* JADX INFO: renamed from: a */
    public final String f6180a;

    /* JADX INFO: renamed from: b */
    public final String f6181b;

    /* JADX INFO: renamed from: c */
    public final boolean f6182c;

    public /* synthetic */ C2017i(int i10, String str, String str2, boolean z6) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C2015g.f6179a.getDescriptor());
            throw null;
        }
        this.f6180a = str;
        this.f6181b = str2;
        this.f6182c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2017i)) {
            return false;
        }
        C2017i c2017i = (C2017i) obj;
        return AbstractC16544l.m18089b(this.f6180a, c2017i.f6180a) && AbstractC16544l.m18089b(this.f6181b, c2017i.f6181b) && this.f6182c == c2017i.f6182c;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(this.f6180a.hashCode() * 31, 31, this.f6181b) + (this.f6182c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C2017i(String shareId, String shareUrl, boolean z6) {
        AbstractC16544l.m18094g(shareId, "shareId");
        AbstractC16544l.m18094g(shareUrl, "shareUrl");
        this.f6180a = shareId;
        this.f6181b = shareUrl;
        this.f6182c = z6;
    }
}
