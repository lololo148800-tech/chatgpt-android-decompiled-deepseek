package p204I1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.RectF;
import android.text.Layout;
import com.google.protobuf.AbstractC12107L1;
import java.text.BreakIterator;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p117Eb.C2392v;
import p230J1.C4199z;
import p239Ja.C4312o;
import p467T1.EnumC7198h;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8640h;
import p544W9.AbstractC8676n;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14353i;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: I1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C3578I {

    /* JADX INFO: renamed from: a */
    public final C3577H f10892a;

    /* JADX INFO: renamed from: b */
    public final C3599o f10893b;

    /* JADX INFO: renamed from: c */
    public final long f10894c;

    /* JADX INFO: renamed from: d */
    public final float f10895d;

    /* JADX INFO: renamed from: e */
    public final float f10896e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f10897f;

    public C3578I(C3577H c3577h, C3599o c3599o, long j10) {
        this.f10892a = c3577h;
        this.f10893b = c3599o;
        this.f10894c = j10;
        ArrayList arrayList = c3599o.f10965h;
        float fM4897d = 0.0f;
        this.f10895d = arrayList.isEmpty() ? 0.0f : ((C3601q) arrayList.get(0)).f10968a.f10918d.m4897d(0);
        if (!arrayList.isEmpty()) {
            C3601q c3601q = (C3601q) AbstractC17680n.m19351a0(arrayList);
            C4199z c4199z = c3601q.f10968a.f10918d;
            fM4897d = c4199z.m4897d(c4199z.f13641g - 1) + c3601q.f10973f;
        }
        this.f10896e = fM4897d;
        this.f10897f = c3599o.f10964g;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC7198h m4251a(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4316j(i10);
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(i10 == length ? AbstractC17681o.m19381j(arrayList) : AbstractC8640h.m9304c(i10, arrayList));
        return c3601q.f10968a.f10918d.f13640f.isRtlCharAt(c3601q.m4319b(i10)) ? EnumC7198h.f22860Z : EnumC7198h.f22859Y;
    }

    /* JADX INFO: renamed from: b */
    public final C13801c m4252b(int i10) {
        float fM4902i;
        float fM4902i2;
        float fM4901h;
        float fM4901h2;
        C3599o c3599o = this.f10893b;
        c3599o.m4315i(i10);
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9304c(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int iM4319b = c3601q.m4319b(i10);
        CharSequence charSequence = c3585a.f10919e;
        if (iM4319b < 0 || iM4319b >= charSequence.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(iM4319b, "offset(", ") is out of bounds [0,");
            sbM11057o.append(charSequence.length());
            sbM11057o.append(')');
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        C4199z c4199z = c3585a.f10918d;
        Layout layout = c4199z.f13640f;
        int lineForOffset = layout.getLineForOffset(iM4319b);
        float fM4900g = c4199z.m4900g(lineForOffset);
        float fM4898e = c4199z.m4898e(lineForOffset);
        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM4319b);
        if (!z6 || zIsRtlCharAt) {
            if (z6 && zIsRtlCharAt) {
                fM4901h = c4199z.m4902i(iM4319b, false);
                fM4901h2 = c4199z.m4902i(iM4319b + 1, true);
            } else if (zIsRtlCharAt) {
                fM4901h = c4199z.m4901h(iM4319b, false);
                fM4901h2 = c4199z.m4901h(iM4319b + 1, true);
            } else {
                fM4902i = c4199z.m4902i(iM4319b, false);
                fM4902i2 = c4199z.m4902i(iM4319b + 1, true);
            }
            float f10 = fM4901h;
            fM4902i = fM4901h2;
            fM4902i2 = f10;
        } else {
            fM4902i = c4199z.m4901h(iM4319b, false);
            fM4902i2 = c4199z.m4901h(iM4319b + 1, true);
        }
        RectF rectF = new RectF(fM4902i, fM4900g, fM4902i2, fM4898e);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        long jM8536b = AbstractC8088f6.m8536b(0.0f, c3601q.f10973f);
        return new C13801c(C13800b.m15306g(jM8536b) + f11, C13800b.m15307h(jM8536b) + f12, C13800b.m15306g(jM8536b) + f13, C13800b.m15307h(jM8536b) + f14);
    }

    /* JADX INFO: renamed from: c */
    public final C13801c m4253c(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4316j(i10);
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(i10 == length ? AbstractC17681o.m19381j(arrayList) : AbstractC8640h.m9304c(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int iM4319b = c3601q.m4319b(i10);
        CharSequence charSequence = c3585a.f10919e;
        if (iM4319b < 0 || iM4319b > charSequence.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(iM4319b, "offset(", ") is out of bounds [0,");
            sbM11057o.append(charSequence.length());
            sbM11057o.append(']');
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        C4199z c4199z = c3585a.f10918d;
        float fM4901h = c4199z.m4901h(iM4319b, false);
        int lineForOffset = c4199z.f13640f.getLineForOffset(iM4319b);
        float fM4900g = c4199z.m4900g(lineForOffset);
        float fM4898e = c4199z.m4898e(lineForOffset);
        long jM8536b = AbstractC8088f6.m8536b(0.0f, c3601q.f10973f);
        return new C13801c(C13800b.m15306g(jM8536b) + fM4901h, C13800b.m15307h(jM8536b) + fM4900g, C13800b.m15306g(jM8536b) + fM4901h, C13800b.m15307h(jM8536b) + fM4898e);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4254d() {
        long j10 = this.f10894c;
        float f10 = (int) (j10 >> 32);
        C3599o c3599o = this.f10893b;
        return f10 < c3599o.f10961d || c3599o.f10960c || ((float) ((int) (j10 & 4294967295L))) < c3599o.f10962e;
    }

    /* JADX INFO: renamed from: e */
    public final float m4255e(int i10, boolean z6) {
        C3599o c3599o = this.f10893b;
        c3599o.m4316j(i10);
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(i10 == length ? AbstractC17681o.m19381j(arrayList) : AbstractC8640h.m9304c(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int iM4319b = c3601q.m4319b(i10);
        C4199z c4199z = c3585a.f10918d;
        return z6 ? c4199z.m4901h(iM4319b, false) : c4199z.m4902i(iM4319b, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3578I)) {
            return false;
        }
        C3578I c3578i = (C3578I) obj;
        return AbstractC16544l.m18089b(this.f10892a, c3578i.f10892a) && this.f10893b.equals(c3578i.f10893b) && C7545j.m7886a(this.f10894c, c3578i.f10894c) && this.f10895d == c3578i.f10895d && this.f10896e == c3578i.f10896e && AbstractC16544l.m18089b(this.f10897f, c3578i.f10897f);
    }

    /* JADX INFO: renamed from: f */
    public final int m4256f(int i10, boolean z6) {
        int iM4899f;
        C3599o c3599o = this.f10893b;
        c3599o.m4317k(i10);
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int i11 = i10 - c3601q.f10971d;
        C4199z c4199z = c3585a.f10918d;
        if (z6) {
            Layout layout = c4199z.f13640f;
            if (layout.getEllipsisStart(i11) == 0) {
                C2392v c2392vM4896c = c4199z.m4896c();
                Layout layout2 = (Layout) c2392vM4896c.f7436Z;
                iM4899f = c2392vM4896c.m3529A(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iM4899f = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iM4899f = c4199z.m4899f(i11);
        }
        return iM4899f + c3601q.f10969b;
    }

    /* JADX INFO: renamed from: g */
    public final int m4257g(int i10) {
        int iM9304c;
        C3599o c3599o = this.f10893b;
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        if (i10 >= length) {
            iM9304c = AbstractC17681o.m19381j(arrayList);
        } else {
            iM9304c = i10 < 0 ? 0 : AbstractC8640h.m9304c(i10, arrayList);
        }
        C3601q c3601q = (C3601q) arrayList.get(iM9304c);
        return c3601q.f10968a.f10918d.f13640f.getLineForOffset(c3601q.m4319b(i10)) + c3601q.f10971d;
    }

    /* JADX INFO: renamed from: h */
    public final float m4258h(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4317k(i10);
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int i11 = i10 - c3601q.f10971d;
        C4199z c4199z = c3585a.f10918d;
        return c4199z.f13640f.getLineLeft(i11) + (i11 == c4199z.f13641g + (-1) ? c4199z.f13644j : 0.0f);
    }

    public final int hashCode() {
        return this.f10897f.hashCode() + AbstractC12107L1.m13819j(this.f10896e, AbstractC12107L1.m13819j(this.f10895d, (C7545j.m7889d(this.f10894c) + ((this.f10893b.hashCode() + (this.f10892a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final float m4259i(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4317k(i10);
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int i11 = i10 - c3601q.f10971d;
        C4199z c4199z = c3585a.f10918d;
        return c4199z.f13640f.getLineRight(i11) + (i11 == c4199z.f13641g + (-1) ? c4199z.f13645k : 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final int m4260j(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4317k(i10);
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        return c3585a.f10918d.f13640f.getLineStart(i10 - c3601q.f10971d) + c3601q.f10969b;
    }

    /* JADX INFO: renamed from: k */
    public final EnumC7198h m4261k(int i10) {
        C3599o c3599o = this.f10893b;
        c3599o.m4316j(i10);
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(i10 == length ? AbstractC17681o.m19381j(arrayList) : AbstractC8640h.m9304c(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int iM4319b = c3601q.m4319b(i10);
        C4199z c4199z = c3585a.f10918d;
        return c4199z.f13640f.getParagraphDirection(c4199z.f13640f.getLineForOffset(iM4319b)) == 1 ? EnumC7198h.f22859Y : EnumC7198h.f22860Z;
    }

    /* JADX INFO: renamed from: l */
    public final C14353i m4262l(int i10, int i11) {
        C3599o c3599o = this.f10893b;
        C3590f c3590f = (C3590f) c3599o.f10958a.f7436Z;
        if (i10 < 0 || i10 > i11 || i11 > c3590f.f10934Y.length()) {
            StringBuilder sbM21e = AbstractC0010F.m21e("Start(", i10, ") or End(", i11, ") is out of range [0..");
            sbM21e.append(c3590f.f10934Y.length());
            sbM21e.append("), or start > end!");
            throw new IllegalArgumentException(sbM21e.toString().toString());
        }
        if (i10 == i11) {
            return AbstractC14334L.m15631i();
        }
        C14353i c14353iM15631i = AbstractC14334L.m15631i();
        AbstractC8640h.m9307f(c3599o.f10965h, AbstractC8676n.m9365b(i10, i11), new C3598n(c14353iM15631i, i10, i11, 0));
        return c14353iM15631i;
    }

    /* JADX INFO: renamed from: m */
    public final long m4263m(int i10) {
        int iPreceding;
        int iFollowing;
        int iFollowing2;
        C3599o c3599o = this.f10893b;
        c3599o.m4316j(i10);
        int length = ((C3590f) c3599o.f10958a.f7436Z).f10934Y.length();
        ArrayList arrayList = c3599o.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(i10 == length ? AbstractC17681o.m19381j(arrayList) : AbstractC8640h.m9304c(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        int iM4319b = c3601q.m4319b(i10);
        C4312o c4312oM4903j = c3585a.f10918d.m4903j();
        c4312oM4903j.m5090i(iM4319b);
        BreakIterator breakIterator = (BreakIterator) c4312oM4903j.f14019e;
        if (c4312oM4903j.m5104w(breakIterator.preceding(iM4319b))) {
            c4312oM4903j.m5090i(iM4319b);
            iPreceding = iM4319b;
            while (iPreceding != -1 && (!c4312oM4903j.m5104w(iPreceding) || c4312oM4903j.m5102u(iPreceding))) {
                c4312oM4903j.m5090i(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            c4312oM4903j.m5090i(iM4319b);
            if (c4312oM4903j.m5103v(iM4319b)) {
                iPreceding = (!breakIterator.isBoundary(iM4319b) || c4312oM4903j.m5101t(iM4319b)) ? breakIterator.preceding(iM4319b) : iM4319b;
            } else {
                iPreceding = c4312oM4903j.m5101t(iM4319b) ? breakIterator.preceding(iM4319b) : -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = iM4319b;
        }
        c4312oM4903j.m5090i(iM4319b);
        if (c4312oM4903j.m5102u(breakIterator.following(iM4319b))) {
            c4312oM4903j.m5090i(iM4319b);
            iFollowing = iM4319b;
            while (iFollowing != -1 && (c4312oM4903j.m5104w(iFollowing) || !c4312oM4903j.m5102u(iFollowing))) {
                c4312oM4903j.m5090i(iFollowing);
                iFollowing = breakIterator.following(iFollowing);
            }
        } else {
            c4312oM4903j.m5090i(iM4319b);
            if (c4312oM4903j.m5101t(iM4319b)) {
                iFollowing2 = (!breakIterator.isBoundary(iM4319b) || c4312oM4903j.m5103v(iM4319b)) ? breakIterator.following(iM4319b) : iM4319b;
            } else if (c4312oM4903j.m5103v(iM4319b)) {
                iFollowing2 = breakIterator.following(iM4319b);
            } else {
                iFollowing = -1;
            }
            iFollowing = iFollowing2;
        }
        if (iFollowing != -1) {
            iM4319b = iFollowing;
        }
        return c3601q.m4318a(AbstractC8676n.m9365b(iPreceding, iM4319b), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f10892a + ", multiParagraph=" + this.f10893b + ", size=" + ((Object) C7545j.m7890e(this.f10894c)) + ", firstBaseline=" + this.f10895d + ", lastBaseline=" + this.f10896e + ", placeholderRects=" + this.f10897f + ')';
    }
}
