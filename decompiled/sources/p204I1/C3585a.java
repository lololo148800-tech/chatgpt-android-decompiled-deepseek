package p204I1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0227a;
import p025An.C0644w;
import p030B2.C0742X;
import p117Eb.C2385o;
import p117Eb.C2392v;
import p230J1.AbstractC4173A;
import p230J1.AbstractC4194u;
import p230J1.C4175b;
import p230J1.C4198y;
import p230J1.C4199z;
import p255K1.C4529c;
import p255K1.C4530d;
import p255K1.InterfaceC4531e;
import p279L1.C4902c;
import p279L1.C4908i;
import p393Q1.AbstractC6550b;
import p393Q1.C6549a;
import p393Q1.C6551c;
import p393Q1.C6553e;
import p441S1.C6986b;
import p467T1.C7194d;
import p467T1.C7199i;
import p467T1.C7200j;
import p467T1.EnumC7198h;
import p492U1.C7536a;
import p492U1.C7548m;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8658k;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9130F3;
import p571X9.AbstractC9136G3;
import p658b5.C11232c;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16040e;
import p909nm.C17689w;

/* JADX INFO: renamed from: I1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3585a {

    /* JADX INFO: renamed from: a */
    public final C6551c f10915a;

    /* JADX INFO: renamed from: b */
    public final int f10916b;

    /* JADX INFO: renamed from: c */
    public final long f10917c;

    /* JADX INFO: renamed from: d */
    public final C4199z f10918d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f10919e;

    /* JADX INFO: renamed from: f */
    public final Object f10920f;

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    public C3585a(C6551c c6551c, int i10, boolean z6, long j10) {
        CharSequence charSequence;
        int i11;
        int i12;
        C6986b[] c6986bArr;
        Object obj;
        C13801c c13801c;
        float fM4901h;
        float fM4897d;
        int iM5519b;
        float fM4900g;
        float fM5519b;
        float fM4897d2;
        Spannable spannableString;
        this.f10915a = c6551c;
        this.f10916b = i10;
        this.f10917c = j10;
        if (C7536a.m7855j(j10) != 0 || C7536a.m7856k(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        C3582M c3582m = c6551c.f21198Z;
        CharSequence charSequence2 = c6551c.f21204t0;
        if (z6 && !C7548m.m7893a(c3582m.f10910a.f10866h, AbstractC9119D4.m9650c(0)) && !C7548m.m7893a(c3582m.f10910a.f10866h, C7548m.f23909c)) {
            C3604t c3604t = c3582m.f10911b;
            if (!C7199i.m7596a(c3604t.f10978a, Integer.MIN_VALUE)) {
                int i13 = c3604t.f10978a;
                if (!C7199i.m7596a(i13, 5) && !C7199i.m7596a(i13, 4) && charSequence2.length() != 0) {
                    if (charSequence2 instanceof Spannable) {
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        spannableString = (Spannable) charSequence2;
                    } else {
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        spannableString = new SpannableString(charSequence2);
                    }
                    spannableString.setSpan(new C4902c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                    charSequence = spannableString;
                }
            }
        }
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        this.f10919e = charSequence;
        int i14 = c3582m.f10911b.f10978a;
        int i15 = C7199i.m7596a(i14, 1) ? 3 : C7199i.m7596a(i14, 2) ? 4 : C7199i.m7596a(i14, 3) ? 2 : (!C7199i.m7596a(i14, 5) && C7199i.m7596a(i14, 6)) ? 1 : 0;
        C3604t c3604t2 = c3582m.f10911b;
        boolean zM7596a = C7199i.m7596a(c3604t2.f10978a, 4);
        int i16 = C7194d.m7592a(c3604t2.f10985h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i17 = c3604t2.f10984g;
        int i18 = i17 & 255;
        if (AbstractC9130F3.m9669a(i18, 1)) {
            i11 = 0;
        } else if (AbstractC9130F3.m9669a(i18, 2)) {
            i11 = 1;
        } else if (AbstractC9130F3.m9669a(i18, 3)) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i19 = (i17 >> 8) & 255;
        if (AbstractC9136G3.m9677c(i19, 1)) {
            i12 = 0;
        } else if (AbstractC9136G3.m9677c(i19, 2)) {
            i12 = 1;
        } else if (AbstractC9136G3.m9677c(i19, 3)) {
            i12 = 2;
        } else if (AbstractC9136G3.m9677c(i19, 4)) {
            i12 = 3;
        } else {
            i12 = 0;
        }
        int i20 = (i17 >> 16) & 255;
        int i21 = (i20 != 1 && i20 == 2) ? 1 : 0;
        TextUtils.TruncateAt truncateAt = z6 ? TextUtils.TruncateAt.END : null;
        C4199z c4199zM4281a = m4281a(i15, zM7596a ? 1 : 0, truncateAt, i10, i16, i11, i12, i21);
        if (!z6 || c4199zM4281a.m4894a() <= C7536a.m7853h(j10) || i10 <= 1) {
            this.f10918d = c4199zM4281a;
        } else {
            int iM7853h = C7536a.m7853h(j10);
            int i22 = 0;
            while (true) {
                int i23 = c4199zM4281a.f13641g;
                if (i22 >= i23) {
                    i22 = i23;
                    break;
                } else if (c4199zM4281a.m4898e(i22) > iM7853h) {
                    break;
                } else {
                    i22++;
                }
            }
            if (i22 >= 0 && i22 != this.f10916b) {
                c4199zM4281a = m4281a(i15, zM7596a ? 1 : 0, truncateAt, i22 < 1 ? 1 : i22, i16, i11, i12, i21);
            }
            this.f10918d = c4199zM4281a;
        }
        C6551c c6551c2 = this.f10915a;
        C3573D c3573d = c3582m.f10910a;
        c6551c2.f21203s0.m7116c(c3573d.f10859a.mo7591e(), AbstractC8112i6.m8603a(m4284d(), m4282b()), c3573d.f10859a.mo7587a());
        C4199z c4199z = this.f10918d;
        if (c4199z.f13640f.getText() instanceof Spanned) {
            Layout layout = c4199z.f13640f;
            CharSequence text = layout.getText();
            AbstractC16544l.m18092e(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            if (spanned.nextSpanTransition(-1, spanned.length(), C6986b.class) != spanned.length()) {
                CharSequence text2 = layout.getText();
                AbstractC16544l.m18092e(text2, "null cannot be cast to non-null type android.text.Spanned");
                c6986bArr = (C6986b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C6986b.class);
            } else {
                c6986bArr = null;
            }
        } else {
            c6986bArr = null;
        }
        if (c6986bArr != null) {
            C0742X c0742xM18098k = AbstractC16544l.m18098k(c6986bArr);
            while (c0742xM18098k.hasNext()) {
                ((C6986b) c0742xM18098k.next()).f22335o0.setValue(new C13803e(AbstractC8112i6.m8603a(m4284d(), m4282b())));
            }
        }
        CharSequence charSequence3 = this.f10919e;
        if (charSequence3 instanceof Spanned) {
            Spanned spanned2 = (Spanned) charSequence3;
            Object[] spans = spanned2.getSpans(0, charSequence3.length(), C4908i.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj2 : spans) {
                C4908i c4908i = (C4908i) obj2;
                int spanStart = spanned2.getSpanStart(c4908i);
                int spanEnd = spanned2.getSpanEnd(c4908i);
                int lineForOffset = this.f10918d.f13640f.getLineForOffset(spanStart);
                boolean z10 = lineForOffset >= this.f10916b;
                boolean z11 = this.f10918d.f13640f.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f10918d.f13640f.getEllipsisStart(lineForOffset);
                boolean z12 = spanEnd > this.f10918d.m4899f(lineForOffset);
                if (z11 || z12 || z10) {
                    c13801c = null;
                } else {
                    int iOrdinal = (this.f10918d.f13640f.isRtlCharAt(spanStart) ? EnumC7198h.f22860Z : EnumC7198h.f22859Y).ordinal();
                    if (iOrdinal == 0) {
                        fM4901h = this.f10918d.m4901h(spanStart, false);
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        float fM4901h2 = this.f10918d.m4901h(spanStart, false);
                        if (!c4908i.f15990v0) {
                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                        }
                        fM4901h = fM4901h2 - c4908i.f15988t0;
                    }
                    if (!c4908i.f15990v0) {
                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                    }
                    float f10 = c4908i.f15988t0 + fM4901h;
                    C4199z c4199z2 = this.f10918d;
                    switch (c4908i.f15986r0) {
                        case 0:
                            fM4897d = c4199z2.m4897d(lineForOffset);
                            iM5519b = c4908i.m5519b();
                            fM4900g = fM4897d - iM5519b;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 1:
                            fM4900g = c4199z2.m4900g(lineForOffset);
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 2:
                            fM4897d = c4199z2.m4898e(lineForOffset);
                            iM5519b = c4908i.m5519b();
                            fM4900g = fM4897d - iM5519b;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 3:
                            fM4900g = ((c4199z2.m4898e(lineForOffset) + c4199z2.m4900g(lineForOffset)) - c4908i.m5519b()) / 2;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 4:
                            fM5519b = c4908i.m5518a().ascent;
                            fM4897d2 = c4199z2.m4897d(lineForOffset);
                            fM4900g = fM4897d2 + fM5519b;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 5:
                            fM4897d = c4199z2.m4897d(lineForOffset) + c4908i.m5518a().descent;
                            iM5519b = c4908i.m5519b();
                            fM4900g = fM4897d - iM5519b;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntM5518a = c4908i.m5518a();
                            fM5519b = ((fontMetricsIntM5518a.ascent + fontMetricsIntM5518a.descent) - c4908i.m5519b()) / 2;
                            fM4897d2 = c4199z2.m4897d(lineForOffset);
                            fM4900g = fM4897d2 + fM5519b;
                            c13801c = new C13801c(fM4901h, fM4900g, f10, c4908i.m5519b() + fM4900g);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(c13801c);
            }
            obj = arrayList;
        } else {
            obj = C17689w.f56480Y;
        }
        this.f10920f = obj;
    }

    /* JADX INFO: renamed from: a */
    public final C4199z m4281a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        C3607w c3607w;
        float fM4284d = m4284d();
        C6551c c6551c = this.f10915a;
        C6549a c6549a = AbstractC6550b.f21196a;
        C3609y c3609y = c6551c.f21198Z.f10912c;
        return new C4199z(this.f10919e, fM4284d, c6551c.f21203s0, i10, truncateAt, c6551c.f21208x0, (c3609y == null || (c3607w = c3609y.f10996b) == null) ? false : c3607w.f10993a, i12, i14, i15, i16, i13, i11, c6551c.f21205u0);
    }

    /* JADX INFO: renamed from: b */
    public final float m4282b() {
        return this.f10918d.m4894a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX INFO: renamed from: c */
    public final long m4283c(C13801c c13801c, int i10, C2385o c2385o) {
        InterfaceC4531e c4529c;
        int lineForVertical;
        int i11;
        int i12;
        char c9;
        int[] iArrM4793a;
        RectF rectFM15616E = AbstractC14334L.m15616E(c13801c);
        int i13 = (!AbstractC8658k.m9348b(i10, 0) && AbstractC8658k.m9348b(i10, 1)) ? 1 : 0;
        C0227a c0227a = new C0227a(c2385o, 10);
        int i14 = Build.VERSION.SDK_INT;
        C4199z c4199z = this.f10918d;
        if (i14 >= 34) {
            c4199z.getClass();
            iArrM4793a = C4175b.f13590a.m4793a(c4199z, rectFM15616E, i13, c0227a);
            c9 = 1;
        } else {
            C2392v c2392vM4896c = c4199z.m4896c();
            Layout layout = c4199z.f13640f;
            if (i13 == 1) {
                c4529c = new C11232c(layout.getText(), c4199z.m4903j());
            } else {
                CharSequence text = layout.getText();
                c4529c = i14 >= 29 ? new C4529c(text, c4199z.f13635a) : new C4530d(text);
            }
            InterfaceC4531e interfaceC4531e = c4529c;
            int lineForVertical2 = layout.getLineForVertical((int) rectFM15616E.top);
            if (rectFM15616E.top <= c4199z.m4898e(lineForVertical2) || (lineForVertical2 = lineForVertical2 + 1) < c4199z.f13641g) {
                int i15 = lineForVertical2;
                lineForVertical = layout.getLineForVertical((int) rectFM15616E.bottom);
                if (lineForVertical != 0 || rectFM15616E.bottom >= c4199z.m4900g(0)) {
                    int iM4892d = AbstractC4194u.m4892d(c4199z, layout, c2392vM4896c, i15, rectFM15616E, interfaceC4531e, c0227a, true);
                    while (true) {
                        i11 = i15;
                        if (iM4892d != -1 || i11 >= lineForVertical) {
                            break;
                        }
                        i15 = i11 + 1;
                        iM4892d = AbstractC4194u.m4892d(c4199z, layout, c2392vM4896c, i15, rectFM15616E, interfaceC4531e, c0227a, true);
                    }
                    if (iM4892d == -1) {
                        c9 = 1;
                        iArrM4793a = null;
                    } else {
                        int i16 = i11;
                        int i17 = iM4892d;
                        int iM4892d2 = AbstractC4194u.m4892d(c4199z, layout, c2392vM4896c, lineForVertical, rectFM15616E, interfaceC4531e, c0227a, false);
                        while (iM4892d2 == -1) {
                            int i18 = i16;
                            if (i18 >= i12) {
                                break;
                            }
                            i12 = lineForVertical;
                            int i19 = i12 - 1;
                            iM4892d2 = AbstractC4194u.m4892d(c4199z, layout, c2392vM4896c, i19, rectFM15616E, interfaceC4531e, c0227a, false);
                            i16 = i18;
                            i12 = i19;
                        }
                        if (iM4892d2 == -1) {
                            i12 = lineForVertical;
                            iArrM4793a = null;
                            c9 = 1;
                        } else {
                            i12 = lineForVertical;
                            c9 = 1;
                            iArrM4793a = new int[]{interfaceC4531e.mo5273f(i17 + 1), interfaceC4531e.mo5274h(iM4892d2 - 1)};
                        }
                    }
                } else {
                    c9 = 1;
                    iArrM4793a = null;
                }
            } else {
                c9 = 1;
                iArrM4793a = null;
            }
        }
        if (iArrM4793a == null) {
            i12 = lineForVertical;
            i12 = lineForVertical;
            return C3581L.f10906b;
        }
        i12 = lineForVertical;
        i12 = lineForVertical;
        return AbstractC8676n.m9365b(iArrM4793a[0], iArrM4793a[c9]);
    }

    /* JADX INFO: renamed from: d */
    public final float m4284d() {
        return C7536a.m7854i(this.f10917c);
    }

    /* JADX INFO: renamed from: e */
    public final void m4285e(InterfaceC14362r interfaceC14362r) {
        Canvas canvasM15725a = AbstractC14348d.m15725a(interfaceC14362r);
        C4199z c4199z = this.f10918d;
        if (c4199z.f13638d) {
            canvasM15725a.save();
            canvasM15725a.clipRect(0.0f, 0.0f, m4284d(), m4282b());
        }
        if (canvasM15725a.getClipBounds(c4199z.f13650p)) {
            int i10 = c4199z.f13642h;
            if (i10 != 0) {
                canvasM15725a.translate(0.0f, i10);
            }
            C4198y c4198y = AbstractC4173A.f13587a;
            c4198y.f13634a = canvasM15725a;
            c4199z.f13640f.draw(c4198y);
            if (i10 != 0) {
                canvasM15725a.translate(0.0f, (-1) * i10);
            }
        }
        if (c4199z.f13638d) {
            canvasM15725a.restore();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4286f(InterfaceC14362r interfaceC14362r, long j10, C14338P c14338p, C7200j c7200j, AbstractC16040e abstractC16040e, int i10) {
        C6551c c6551c = this.f10915a;
        C6553e c6553e = c6551c.f21203s0;
        int i11 = c6553e.f21214c;
        c6553e.m7117d(j10);
        c6553e.m7119f(c14338p);
        c6553e.m7120g(c7200j);
        c6553e.m7118e(abstractC16040e);
        c6553e.m7115b(i10);
        m4285e(interfaceC14362r);
        c6551c.f21203s0.m7115b(i11);
    }

    /* JADX INFO: renamed from: g */
    public final void m4287g(InterfaceC14362r interfaceC14362r, AbstractC14360p abstractC14360p, float f10, C14338P c14338p, C7200j c7200j, AbstractC16040e abstractC16040e, int i10) {
        C6553e c6553e = this.f10915a.f21203s0;
        int i11 = c6553e.f21214c;
        c6553e.m7116c(abstractC14360p, AbstractC8112i6.m8603a(m4284d(), m4282b()), f10);
        c6553e.m7119f(c14338p);
        c6553e.m7120g(c7200j);
        c6553e.m7118e(abstractC16040e);
        c6553e.m7115b(i10);
        m4285e(interfaceC14362r);
        c6553e.m7115b(i11);
    }
}
