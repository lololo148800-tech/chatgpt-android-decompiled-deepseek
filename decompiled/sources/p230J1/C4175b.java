package p230J1;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import p003A1.AbstractC0305y0;
import p049Bm.InterfaceC1439n;
import p255K1.C4528b;
import p658b5.C11232c;

/* JADX INFO: renamed from: J1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4175b {

    /* JADX INFO: renamed from: a */
    public static final C4175b f13590a = new C4175b();

    /* JADX WARN: Type inference failed for: r0v2, types: [J1.a] */
    /* JADX INFO: renamed from: a */
    public final int[] m4793a(C4199z c4199z, RectF rectF, int i10, final InterfaceC1439n interfaceC1439n) {
        SegmentFinder segmentFinderM897p;
        if (i10 == 1) {
            segmentFinderM897p = C4528b.f14805a.m5268a(new C11232c(c4199z.f13640f.getText(), c4199z.m4903j()));
        } else {
            AbstractC0305y0.m881D();
            segmentFinderM897p = AbstractC0305y0.m897p(AbstractC0305y0.m896o(c4199z.f13640f.getText(), c4199z.f13635a));
        }
        return c4199z.f13640f.getRangeForRect(rectF, segmentFinderM897p, new Layout.TextInclusionStrategy() { // from class: J1.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) interfaceC1439n.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
