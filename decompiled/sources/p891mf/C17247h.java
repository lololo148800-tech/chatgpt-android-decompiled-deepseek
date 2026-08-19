package p891mf;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: mf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17247h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final Map f55026a;

    /* JADX INFO: renamed from: b */
    public final Map f55027b;

    /* JADX INFO: renamed from: c */
    public final String f55028c;

    /* JADX INFO: renamed from: d */
    public final boolean f55029d;

    public C17247h(Map summaries, Map enableProgress, String jawboneMaskedTitle, boolean z6) {
        AbstractC16544l.m18094g(summaries, "summaries");
        AbstractC16544l.m18094g(enableProgress, "enableProgress");
        AbstractC16544l.m18094g(jawboneMaskedTitle, "jawboneMaskedTitle");
        this.f55026a = summaries;
        this.f55027b = enableProgress;
        this.f55028c = jawboneMaskedTitle;
        this.f55029d = z6;
    }

    /* JADX INFO: renamed from: e */
    public static C17247h m18969e(C17247h c17247h, Map summaries, Map enableProgress, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            summaries = c17247h.f55026a;
        }
        if ((i10 & 2) != 0) {
            enableProgress = c17247h.f55027b;
        }
        String jawboneMaskedTitle = c17247h.f55028c;
        if ((i10 & 8) != 0) {
            z6 = c17247h.f55029d;
        }
        c17247h.getClass();
        AbstractC16544l.m18094g(summaries, "summaries");
        AbstractC16544l.m18094g(enableProgress, "enableProgress");
        AbstractC16544l.m18094g(jawboneMaskedTitle, "jawboneMaskedTitle");
        return new C17247h(summaries, enableProgress, jawboneMaskedTitle, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17247h)) {
            return false;
        }
        C17247h c17247h = (C17247h) obj;
        return AbstractC16544l.m18089b(this.f55026a, c17247h.f55026a) && AbstractC16544l.m18089b(this.f55027b, c17247h.f55027b) && AbstractC16544l.m18089b(this.f55028c, c17247h.f55028c) && this.f55029d == c17247h.f55029d;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(AbstractC20734X.m21250u(this.f55026a.hashCode() * 31, 31, this.f55027b), 31, this.f55028c) + (this.f55029d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
