package p647ak;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p174Gk.uSfJ.HpucjswO;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ak.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10728s0 {

    /* JADX INFO: renamed from: a */
    public final String f31866a;

    /* JADX INFO: renamed from: b */
    public final String f31867b;

    /* JADX INFO: renamed from: c */
    public final String f31868c;

    /* JADX INFO: renamed from: d */
    public final String f31869d;

    /* JADX INFO: renamed from: e */
    public final String f31870e;

    /* JADX INFO: renamed from: f */
    public final String f31871f;

    /* JADX INFO: renamed from: g */
    public final String f31872g;

    /* JADX INFO: renamed from: h */
    public final String f31873h;

    /* JADX INFO: renamed from: i */
    public final String f31874i;

    /* JADX INFO: renamed from: j */
    public final String f31875j;

    /* JADX INFO: renamed from: k */
    public final String f31876k;

    /* JADX INFO: renamed from: l */
    public final String f31877l;

    /* JADX INFO: renamed from: m */
    public final String f31878m;

    /* JADX INFO: renamed from: n */
    public final String f31879n;

    /* JADX INFO: renamed from: o */
    public final String f31880o;

    /* JADX INFO: renamed from: p */
    public final String f31881p;

    /* JADX INFO: renamed from: q */
    public final String f31882q;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10728s0)) {
            return false;
        }
        C10728s0 c10728s0 = (C10728s0) obj;
        return AbstractC16544l.m18089b(this.f31866a, c10728s0.f31866a) && AbstractC16544l.m18089b(this.f31867b, c10728s0.f31867b) && AbstractC16544l.m18089b(this.f31868c, c10728s0.f31868c) && AbstractC16544l.m18089b(this.f31869d, c10728s0.f31869d) && AbstractC16544l.m18089b(this.f31870e, c10728s0.f31870e) && AbstractC16544l.m18089b(this.f31871f, c10728s0.f31871f) && AbstractC16544l.m18089b(this.f31872g, c10728s0.f31872g) && AbstractC16544l.m18089b(this.f31873h, c10728s0.f31873h) && AbstractC16544l.m18089b(this.f31874i, c10728s0.f31874i) && AbstractC16544l.m18089b(this.f31875j, c10728s0.f31875j) && AbstractC16544l.m18089b(this.f31876k, c10728s0.f31876k) && AbstractC16544l.m18089b(this.f31877l, c10728s0.f31877l) && AbstractC16544l.m18089b(this.f31878m, c10728s0.f31878m) && AbstractC16544l.m18089b(this.f31879n, c10728s0.f31879n) && AbstractC16544l.m18089b(this.f31880o, c10728s0.f31880o) && AbstractC16544l.m18089b(this.f31881p, c10728s0.f31881p) && AbstractC16544l.m18089b(this.f31882q, c10728s0.f31882q);
    }

    public final int hashCode() {
        return this.f31882q.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f31866a.hashCode() * 31, 31, this.f31867b), 31, this.f31868c), 31, this.f31869d), 31, this.f31870e), 31, this.f31871f), 31, this.f31872g), 31, this.f31873h), 31, this.f31874i), 31, this.f31875j), 31, this.f31876k), 31, this.f31877l), 31, this.f31878m), 31, this.f31879n), 31, this.f31880o), 31, this.f31881p);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Strings(title=");
        sb2.append(this.f31866a);
        sb2.append(", prompt=");
        sb2.append(this.f31867b);
        sb2.append(", disclosure=");
        sb2.append(this.f31868c);
        sb2.append(", startButton=");
        sb2.append(this.f31869d);
        sb2.append(", capturePageTitle=");
        sb2.append(this.f31870e);
        sb2.append(", selfieHintTakePhoto=");
        sb2.append(this.f31871f);
        sb2.append(", selfieHintCenterFace=");
        sb2.append(this.f31872g);
        sb2.append(", selfieHintFaceTooClose=");
        sb2.append(this.f31873h);
        sb2.append(", selfieHintFaceTooFar=");
        sb2.append(this.f31874i);
        sb2.append(", selfieHintMultipleFaces=");
        sb2.append(this.f31875j);
        sb2.append(", selfieHintFaceIncomplete=");
        sb2.append(this.f31876k);
        sb2.append(", selfieHintPoseNotCentered=");
        sb2.append(this.f31877l);
        sb2.append(", selfieHintLookLeft=");
        sb2.append(this.f31878m);
        sb2.append(", selfieHintLookRight=");
        sb2.append(this.f31879n);
        sb2.append(", selfieHintHoldStill=");
        sb2.append(this.f31880o);
        sb2.append(", processingTitle=");
        sb2.append(this.f31881p);
        sb2.append(", processingDescription=");
        return AbstractC9306j0.m9891j(this.f31882q, Separators.RPAREN, sb2);
    }

    public C10728s0(String title, String prompt, String disclosure, String startButton, String str, String str2, String selfieHintCenterFace, String str3, String selfieHintFaceTooFar, String selfieHintMultipleFaces, String selfieHintFaceIncomplete, String selfieHintPoseNotCentered, String selfieHintLookLeft, String selfieHintLookRight, String selfieHintHoldStill, String processingTitle, String processingDescription) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(prompt, "prompt");
        AbstractC16544l.m18094g(disclosure, "disclosure");
        AbstractC16544l.m18094g(startButton, "startButton");
        AbstractC16544l.m18094g(str2, HpucjswO.saUOlxn);
        AbstractC16544l.m18094g(selfieHintCenterFace, "selfieHintCenterFace");
        AbstractC16544l.m18094g(str3, zakks.KIYGgSSK);
        AbstractC16544l.m18094g(selfieHintFaceTooFar, "selfieHintFaceTooFar");
        AbstractC16544l.m18094g(selfieHintMultipleFaces, "selfieHintMultipleFaces");
        AbstractC16544l.m18094g(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
        AbstractC16544l.m18094g(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
        AbstractC16544l.m18094g(selfieHintLookLeft, "selfieHintLookLeft");
        AbstractC16544l.m18094g(selfieHintLookRight, "selfieHintLookRight");
        AbstractC16544l.m18094g(selfieHintHoldStill, "selfieHintHoldStill");
        AbstractC16544l.m18094g(processingTitle, "processingTitle");
        AbstractC16544l.m18094g(processingDescription, "processingDescription");
        this.f31866a = title;
        this.f31867b = prompt;
        this.f31868c = disclosure;
        this.f31869d = startButton;
        this.f31870e = str;
        this.f31871f = str2;
        this.f31872g = selfieHintCenterFace;
        this.f31873h = str3;
        this.f31874i = selfieHintFaceTooFar;
        this.f31875j = selfieHintMultipleFaces;
        this.f31876k = selfieHintFaceIncomplete;
        this.f31877l = selfieHintPoseNotCentered;
        this.f31878m = selfieHintLookLeft;
        this.f31879n = selfieHintLookRight;
        this.f31880o = selfieHintHoldStill;
        this.f31881p = processingTitle;
        this.f31882q = processingDescription;
    }
}
