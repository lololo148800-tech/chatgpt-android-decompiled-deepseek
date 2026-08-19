package p230J1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;
import p003A1.C0227a;
import p117Eb.C2392v;
import p131F1.C2633k;
import p200Hm.C3506e;
import p200Hm.C3508g;
import p255K1.InterfaceC4531e;

/* JADX INFO: renamed from: J1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4194u {

    /* JADX INFO: renamed from: a */
    public static final C4190q f13610a = new C4190q();

    /* JADX INFO: renamed from: a */
    public static final Rect m4889a(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        int i12 = i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i12 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i12 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i12, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i12, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC4189p.m4883a(textPaint2, charSequence, i12, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i12, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i12 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC4189p.m4883a(textPaint, charSequence, i12, i11, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i12, i11, rect3);
        }
        return rect3;
    }

    /* JADX INFO: renamed from: b */
    public static final float m4890b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    /* JADX INFO: renamed from: c */
    public static final int m4891c(Layout layout, int i10, boolean z6) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            return z6 ? lineForOffset - 1 : lineForOffset;
        }
        return z6 ? lineForOffset : lineForOffset + 1;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0268  */
    /* JADX INFO: renamed from: d */
    public static final int m4892d(C4199z c4199z, Layout layout, C2392v c2392v, int i10, RectF rectF, InterfaceC4531e interfaceC4531e, C0227a c0227a, boolean z6) {
        C4187n[] c4187nArr;
        int i11;
        int i12;
        C4187n[] c4187nArr2;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int iMo5274h;
        float fM4890b;
        int i16;
        int iMo5273f;
        Bidi bidiCreateLineBidi;
        int i17;
        boolean z11;
        float fM3621a;
        float fM3621a2;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i18 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i18];
        Layout layout2 = c4199z.f13640f;
        int lineStart2 = layout2.getLineStart(i10);
        int iM4899f = c4199z.m4899f(i10);
        if (i18 < (iM4899f - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C2633k c2633k = new C2633k(c4199z);
        boolean z12 = layout2.getParagraphDirection(i10) == 1;
        int i19 = 0;
        while (lineStart2 < iM4899f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (!z12 || zIsRtlCharAt) {
                i17 = iM4899f;
                if (z12 && zIsRtlCharAt) {
                    z11 = z12;
                    fM3621a2 = c2633k.m3621a(lineStart2, false, false, false);
                    fM3621a = c2633k.m3621a(lineStart2 + 1, true, true, false);
                } else {
                    z11 = z12;
                    if (zIsRtlCharAt) {
                        float fM3621a3 = c2633k.m3621a(lineStart2, false, false, true);
                        fM3621a = c2633k.m3621a(lineStart2 + 1, true, true, true);
                        fM3621a2 = fM3621a3;
                    } else {
                        fM3621a = c2633k.m3621a(lineStart2, false, false, false);
                        fM3621a2 = c2633k.m3621a(lineStart2 + 1, true, true, false);
                    }
                }
            } else {
                i17 = iM4899f;
                fM3621a = c2633k.m3621a(lineStart2, false, false, true);
                fM3621a2 = c2633k.m3621a(lineStart2 + 1, true, true, true);
                z11 = z12;
            }
            fArr[i19] = fM3621a;
            fArr[i19 + 1] = fM3621a2;
            i19 += 2;
            lineStart2++;
            z12 = z11;
            iM4899f = i17;
        }
        Layout layout3 = (Layout) c2392v.f7436Z;
        int lineStart3 = layout3.getLineStart(i10);
        int lineEnd2 = layout3.getLineEnd(i10);
        int iM3566x = c2392v.m3566x(lineStart3, false);
        int iM3567y = c2392v.m3567y(iM3566x);
        int i20 = lineStart3 - iM3567y;
        int i21 = lineEnd2 - iM3567y;
        Bidi bidiM3552i = c2392v.m3552i(iM3566x);
        if (bidiM3552i == null || (bidiCreateLineBidi = bidiM3552i.createLineBidi(i20, i21)) == null) {
            C4187n c4187n = new C4187n(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3));
            i11 = 0;
            c4187nArr = new C4187n[]{c4187n};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c4187nArr = new C4187n[runCount];
            int i22 = 0;
            while (i22 < runCount) {
                int i23 = runCount;
                c4187nArr[i22] = new C4187n(bidiCreateLineBidi.getRunStart(i22) + lineStart3, bidiCreateLineBidi.getRunLimit(i22) + lineStart3, bidiCreateLineBidi.getRunLevel(i22) % 2 == 1);
                i22++;
                runCount = i23;
            }
            i11 = 0;
        }
        C3506e c3508g = z6 ? new C3508g(i11, c4187nArr.length - 1, 1) : new C3506e(c4187nArr.length - 1, i11, -1);
        int i24 = c3508g.f10591Y;
        int i25 = c3508g.f10592Z;
        int i26 = c3508g.f10593o0;
        if ((i26 <= 0 || i24 > i25) && (i26 >= 0 || i25 > i24)) {
            return -1;
        }
        while (true) {
            C4187n c4187n2 = c4187nArr[i24];
            boolean z13 = c4187n2.f13602c;
            int iMo5271a = c4187n2.f13600a;
            int iMo5272d = c4187n2.f13601b;
            float f10 = z13 ? fArr[((iMo5272d - 1) - lineStart) * 2] : fArr[(iMo5271a - lineStart) * 2];
            float fM4890b2 = z13 ? m4890b(iMo5271a, lineStart, fArr) : m4890b(iMo5272d - 1, lineStart, fArr);
            boolean z14 = c4187n2.f13602c;
            if (z6) {
                float f11 = rectF.left;
                if (fM4890b2 >= f11) {
                    c4187nArr2 = c4187nArr;
                    float f12 = rectF.right;
                    if (f10 <= f12) {
                        if ((z14 || f11 > f10) && (!z14 || f12 < fM4890b2)) {
                            int i27 = iMo5271a;
                            i16 = iMo5272d;
                            while (true) {
                                i12 = i26;
                                if (i16 - i27 <= 1) {
                                    break;
                                }
                                int i28 = (i16 + i27) / 2;
                                float f13 = fArr[(i28 - lineStart) * 2];
                                if ((z14 || f13 <= rectF.left) && (!z14 || f13 >= rectF.right)) {
                                    i27 = i28;
                                } else {
                                    i16 = i28;
                                }
                                i26 = i12;
                            }
                            if (!z14) {
                                i16 = i27;
                            }
                        } else {
                            i12 = i26;
                            i16 = iMo5271a;
                        }
                        int iMo5274h2 = interfaceC4531e.mo5274h(i16);
                        if (iMo5274h2 != -1 && (iMo5273f = interfaceC4531e.mo5273f(iMo5274h2)) < iMo5272d) {
                            if (iMo5273f >= iMo5271a) {
                                iMo5271a = iMo5273f;
                            }
                            if (iMo5274h2 > iMo5272d) {
                                iMo5274h2 = iMo5272d;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo5274h3 = iMo5274h2;
                            while (true) {
                                rectF2.left = z14 ? fArr[((iMo5274h3 - 1) - lineStart) * 2] : fArr[(iMo5271a - lineStart) * 2];
                                rectF2.right = z14 ? m4890b(iMo5271a, lineStart, fArr) : m4890b(iMo5274h3 - 1, lineStart, fArr);
                                if (((Boolean) c0227a.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo5271a = interfaceC4531e.mo5271a(iMo5271a);
                                if (iMo5271a != -1 && iMo5271a < iMo5272d) {
                                    iMo5274h3 = interfaceC4531e.mo5274h(iMo5271a);
                                    if (iMo5274h3 > iMo5272d) {
                                        iMo5274h3 = iMo5272d;
                                    }
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        i12 = i26;
                    }
                } else {
                    i12 = i26;
                    c4187nArr2 = c4187nArr;
                }
                iMo5271a = -1;
                z10 = true;
            } else {
                i12 = i26;
                c4187nArr2 = c4187nArr;
                float f14 = rectF.left;
                if (fM4890b2 < f14) {
                    z10 = true;
                    i13 = -1;
                    break;
                }
                float f15 = rectF.right;
                if (f10 > f15) {
                    z10 = true;
                    i13 = -1;
                    break;
                }
                if ((z14 || f15 < fM4890b2) && (!z14 || f14 > f10)) {
                    int i29 = iMo5271a;
                    i14 = iMo5272d;
                    for (int i30 = 1; i14 - i29 > i30; i30 = 1) {
                        int i31 = (i14 + i29) / 2;
                        float f16 = fArr[(i31 - lineStart) * 2];
                        if ((z14 || f16 <= rectF.right) && (!z14 || f16 >= rectF.left)) {
                            i29 = i31;
                        } else {
                            i14 = i31;
                        }
                    }
                    if (!z14) {
                        i14 = i29;
                    }
                    i15 = 1;
                } else {
                    i15 = 1;
                    i14 = iMo5272d - 1;
                }
                int iMo5273f2 = interfaceC4531e.mo5273f(i14 + i15);
                if (iMo5273f2 != -1 && (iMo5274h = interfaceC4531e.mo5274h(iMo5273f2)) > iMo5271a) {
                    if (iMo5273f2 < iMo5271a) {
                        iMo5273f2 = iMo5271a;
                    }
                    if (iMo5274h <= iMo5272d) {
                        iMo5272d = iMo5274h;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int i32 = iMo5273f2;
                    while (true) {
                        rectF3.left = z14 ? fArr[((iMo5272d - 1) - lineStart) * 2] : fArr[(i32 - lineStart) * 2];
                        if (z14) {
                            fM4890b = m4890b(i32, lineStart, fArr);
                            z10 = true;
                        } else {
                            z10 = true;
                            fM4890b = m4890b(iMo5272d - 1, lineStart, fArr);
                        }
                        rectF3.right = fM4890b;
                        if (((Boolean) c0227a.invoke(rectF3, rectF)).booleanValue()) {
                            i13 = iMo5272d;
                            break;
                        }
                        iMo5272d = interfaceC4531e.mo5272d(iMo5272d);
                        if (iMo5272d != -1 && iMo5272d > iMo5271a) {
                            int iMo5273f3 = interfaceC4531e.mo5273f(iMo5272d);
                            if (iMo5273f3 < iMo5271a) {
                                iMo5273f3 = iMo5271a;
                            }
                            i32 = iMo5273f3;
                        }
                    }
                } else {
                    z10 = true;
                }
                i13 = -1;
                break;
                iMo5271a = i13;
            }
            if (iMo5271a >= 0) {
                return iMo5271a;
            }
            if (i24 == i25) {
                return -1;
            }
            i24 += i12;
            c4187nArr = c4187nArr2;
            i26 = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m4893e(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
