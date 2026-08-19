package p544W9;

import android.view.inputmethod.ExtractedText;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21073a0;
import p1113xn.AbstractC21322p;
import p204I1.C3581L;
import p350O1.C6045C;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;
import p759g1.C13803e;

/* JADX INFO: renamed from: W9.z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8753z4 {
    /* JADX INFO: renamed from: a */
    public static final long m9513a(long j10, long j11) {
        return AbstractC8088f6.m8536b(C13800b.m15306g(j10) / AbstractC21073a0.m21556b(j11), C13800b.m15307h(j10) / AbstractC21073a0.m21557c(j11));
    }

    /* JADX INFO: renamed from: b */
    public static final float m9514b(long j10) {
        return Math.max(AbstractC21073a0.m21556b(j10), AbstractC21073a0.m21557c(j10));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9515c(long j10) {
        return (j10 == 9205357640488583168L || C13803e.m15334f(j10)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static final long m9516d(long j10) {
        return AbstractC9113C4.m9643a(AbstractC2119a.m3195i(C13803e.m15333e(j10)), AbstractC2119a.m3195i(C13803e.m15331c(j10)));
    }

    /* JADX INFO: renamed from: e */
    public static final long m9517e(long j10, long j11) {
        return AbstractC8088f6.m8536b(AbstractC21073a0.m21556b(j11) * C13800b.m15306g(j10), AbstractC21073a0.m21557c(j11) * C13800b.m15307h(j10));
    }

    /* JADX INFO: renamed from: f */
    public static final ExtractedText m9518f(C6045C c6045c) {
        ExtractedText extractedText = new ExtractedText();
        String str = c6045c.f19682a.f10934Y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = c6045c.f19683b;
        extractedText.selectionStart = C3581L.m4270f(j10);
        extractedText.selectionEnd = C3581L.m4269e(j10);
        extractedText.flags = !AbstractC21322p.m21668B(c6045c.f19682a.f10934Y, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: g */
    public static final long m9519g(long j10, long j11, long j12, InterfaceC1436k interfaceC1436k) {
        return m9513a(C13800b.m15310k(((C13800b) interfaceC1436k.invoke(new C13800b(C13800b.m15311l(m9517e(j10, j11), j12)))).f43584a, j12), j11);
    }
}
