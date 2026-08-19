package p988rc;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p124Ei.C2550w0;

/* JADX INFO: renamed from: rc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18918f {

    /* JADX INFO: renamed from: j */
    public static final C18918f f60363j = new C18918f(false, 0, 0, 0, null, 511);

    /* JADX INFO: renamed from: a */
    public final boolean f60364a;

    /* JADX INFO: renamed from: b */
    public final int f60365b;

    /* JADX INFO: renamed from: c */
    public final int f60366c;

    /* JADX INFO: renamed from: d */
    public final int f60367d;

    /* JADX INFO: renamed from: e */
    public final double f60368e;

    /* JADX INFO: renamed from: f */
    public final int f60369f;

    /* JADX INFO: renamed from: g */
    public final List f60370g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1426a f60371h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1426a f60372i;

    public C18918f(boolean z6, int i10, int i11, int i12, C2550w0 c2550w0, int i13) {
        z6 = (i13 & 1) != 0 ? false : z6;
        i10 = (i13 & 2) != 0 ? 500 : i10;
        i11 = (i13 & 4) != 0 ? 100050 : i11;
        i12 = (i13 & 8) != 0 ? 70 : i12;
        C18917e c18917e = C18917e.f60359Z;
        InterfaceC1426a onPhraseAnimate = c2550w0;
        onPhraseAnimate = (i13 & 256) != 0 ? C18917e.f60360o0 : onPhraseAnimate;
        AbstractC16544l.m18094g(onPhraseAnimate, "onPhraseAnimate");
        this.f60364a = z6;
        this.f60365b = i10;
        this.f60366c = i11;
        this.f60367d = i12;
        this.f60368e = 0.7d;
        this.f60369f = 30;
        this.f60370g = null;
        this.f60371h = c18917e;
        this.f60372i = onPhraseAnimate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18918f)) {
            return false;
        }
        C18918f c18918f = (C18918f) obj;
        return this.f60364a == c18918f.f60364a && this.f60365b == c18918f.f60365b && this.f60366c == c18918f.f60366c && this.f60367d == c18918f.f60367d && Double.compare(this.f60368e, c18918f.f60368e) == 0 && this.f60369f == c18918f.f60369f && AbstractC16544l.m18089b(this.f60370g, c18918f.f60370g) && AbstractC16544l.m18089b(this.f60371h, c18918f.f60371h) && AbstractC16544l.m18089b(this.f60372i, c18918f.f60372i);
    }

    public final int hashCode() {
        int i10 = (((((((this.f60364a ? 1231 : 1237) * 31) + this.f60365b) * 31) + this.f60366c) * 31) + this.f60367d) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f60368e);
        int i11 = (((i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.f60369f) * 31;
        List list = this.f60370g;
        return this.f60372i.hashCode() + ((this.f60371h.hashCode() + ((i11 + (list == null ? 0 : list.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextRenderOptions(animate=" + this.f60364a + ", textFadeInMs=" + this.f60365b + ", debounceMs=" + this.f60366c + ", delayMs=" + this.f60367d + ", delayExponent=" + this.f60368e + ", maxPhraseLength=" + this.f60369f + ", phraseMarkersOverride=" + this.f60370g + ", onTextAnimate=" + this.f60371h + ", onPhraseAnimate=" + this.f60372i + Separators.RPAREN;
    }
}
