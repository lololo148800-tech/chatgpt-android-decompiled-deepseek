package p1139z0;

import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import p003A1.C0275o0;
import p003A1.InterfaceC0161D1;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p080D0.AbstractC1807h0;
import p082D2.AbstractC1856c;
import p082D2.AbstractC1857d;
import p103Dn.InterfaceC2211v0;
import p1053v3.p1054lN.IGDwkYw;
import p1068vo.C20659i;
import p1071w0.AbstractC20734X;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1072w2.AbstractC20789a;
import p1094x0.AbstractC21046e;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1116y0.C21353b;
import p204I1.C3576G;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3599o;
import p350O1.C6045C;
import p350O1.C6064m;
import p350O1.C6065n;
import p350O1.C6066o;
import p350O1.C6067p;
import p523V9.AbstractC8088f6;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p759g1.C13801c;
import p820j0.C16031b;
import p870le.C16863U;
import p978r1.AbstractC18857c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: z0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21627m {

    /* JADX INFO: renamed from: a */
    public static final String[] f68518a = {IGDwkYw.IfjvtmQj, "image/*", "video/*"};

    /* JADX INFO: renamed from: a */
    public static final long m21953a(long j10, CharSequence charSequence) {
        int i10 = C3581L.f10907c;
        int iCharCount = (int) (j10 >> 32);
        int iCharCount2 = (int) (4294967295L & j10);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (m21973u(iCodePointBefore) && (m21972t(iCodePointAt) || m21971s(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (m21973u(iCodePointBefore));
            return AbstractC8676n.m9365b(iCharCount, iCharCount2);
        }
        if (!m21973u(iCodePointAt)) {
            return j10;
        }
        if (!m21972t(iCodePointBefore) && !m21971s(iCodePointBefore)) {
            return j10;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (m21973u(iCodePointAt));
        return AbstractC8676n.m9365b(iCharCount, iCharCount2);
    }

    /* JADX INFO: renamed from: b */
    public static final long m21954b(C3578I c3578i, long j10, long j11, InterfaceC21098s interfaceC21098s, InterfaceC0161D1 interfaceC0161D1) {
        if (c3578i == null || interfaceC21098s == null) {
            return C3581L.f10906b;
        }
        long jMo21516B = interfaceC21098s.mo21516B(j10);
        long jMo21516B2 = interfaceC21098s.mo21516B(j11);
        C3599o c3599o = c3578i.f10893b;
        int iM21967o = m21967o(c3599o, jMo21516B, interfaceC0161D1);
        int iM21967o2 = m21967o(c3599o, jMo21516B2, interfaceC0161D1);
        if (iM21967o != -1) {
            if (iM21967o2 != -1) {
                iM21967o = Math.min(iM21967o, iM21967o2);
            }
            iM21967o2 = iM21967o;
        } else if (iM21967o2 == -1) {
            return C3581L.f10906b;
        }
        float fM4310b = (c3599o.m4310b(iM21967o2) + c3599o.m4312d(iM21967o2)) / 2;
        return c3599o.m4314f(new C13801c(Math.min(C13800b.m15306g(jMo21516B), C13800b.m15306g(jMo21516B2)), fM4310b - 0.1f, Math.max(C13800b.m15306g(jMo21516B), C13800b.m15306g(jMo21516B2)), fM4310b + 0.1f), 0, C3576G.f10880a);
    }

    /* JADX INFO: renamed from: c */
    public static final long m21955c(C20750g0 c20750g0, C13801c c13801c, C13801c c13801c2, int i10) {
        long jM21969q = m21969q(c20750g0, c13801c, i10);
        if (C3581L.m4267c(jM21969q)) {
            return C3581L.f10906b;
        }
        long jM21969q2 = m21969q(c20750g0, c13801c2, i10);
        if (C3581L.m4267c(jM21969q2)) {
            return C3581L.f10906b;
        }
        int i11 = (int) (jM21969q >> 32);
        int i12 = (int) (jM21969q2 & 4294967295L);
        return AbstractC8676n.m9365b(Math.min(i11, i11), Math.max(i12, i12));
    }

    /* JADX INFO: renamed from: d */
    public static final long m21956d(C21574A0 c21574a0, C13801c c13801c, C13801c c13801c2, int i10) {
        long jM21970r = m21970r(c21574a0, c13801c, i10);
        if (C3581L.m4267c(jM21970r)) {
            return C3581L.f10906b;
        }
        long jM21970r2 = m21970r(c21574a0, c13801c2, i10);
        if (C3581L.m4267c(jM21970r2)) {
            return C3581L.f10906b;
        }
        int i11 = (int) (jM21970r >> 32);
        int i12 = (int) (jM21970r2 & 4294967295L);
        return AbstractC8676n.m9365b(Math.min(i11, i11), Math.max(i12, i12));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m21957e(C3578I c3578i, int i10) {
        int iM4257g = c3578i.m4257g(i10);
        if (i10 == c3578i.m4260j(iM4257g) || i10 == c3578i.m4256f(iM4257g, false)) {
            if (c3578i.m4261k(i10) == c3578i.m4251a(i10)) {
                return false;
            }
        } else if (c3578i.m4251a(i10) == c3578i.m4251a(i10 - 1)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m21958f(int i10, KeyEvent keyEvent) {
        return ((int) (AbstractC18857c.m20157d(keyEvent) >> 32)) == i10;
    }

    /* JADX INFO: renamed from: g */
    public static final long m21959g(int i10, CharSequence charSequence) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!m21972t(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i10 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i10);
            if (!m21972t(iCodePointAt)) {
                break;
            }
            i10 += Character.charCount(iCodePointAt);
        }
        return AbstractC8676n.m9365b(iCharCount, i10);
    }

    /* JADX INFO: renamed from: h */
    public static final ExtractedText m21960h(C6045C c6045c) {
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

    /* JADX INFO: renamed from: i */
    public static final long m21961i(PointF pointF) {
        return AbstractC8088f6.m8536b(pointF.x, pointF.y);
    }

    /* JADX INFO: renamed from: j */
    public static final long m21962j(long j10, C13801c c13801c) {
        float fM15306g = C13800b.m15306g(j10);
        float fM15306g2 = c13801c.f43586a;
        if (fM15306g >= fM15306g2) {
            float fM15306g3 = C13800b.m15306g(j10);
            fM15306g2 = c13801c.f43588c;
            if (fM15306g3 <= fM15306g2) {
                fM15306g2 = C13800b.m15306g(j10);
            }
        }
        float fM15307h = C13800b.m15307h(j10);
        float fM15307h2 = c13801c.f43587b;
        if (fM15307h >= fM15307h2) {
            float fM15307h3 = C13800b.m15307h(j10);
            fM15307h2 = c13801c.f43589d;
            if (fM15307h3 <= fM15307h2) {
                fM15307h2 = C13800b.m15307h(j10);
            }
        }
        return AbstractC8088f6.m8536b(fM15306g2, fM15307h2);
    }

    /* JADX INFO: renamed from: k */
    public static final void m21963k(C21577C c21577c, String str, int i10) {
        int i11 = c21577c.f68329f;
        if (i11 != -1) {
            c21577c.m21858f(i11, c21577c.f68330g, str);
        } else {
            c21577c.m21858f(c21577c.f68326c, c21577c.f68327d, str);
        }
        int i12 = c21577c.f68326c;
        int i13 = c21577c.f68327d;
        int i14 = i12 == i13 ? i13 : -1;
        int iM8921l = AbstractC8301I.m8921l(i10 > 0 ? (i14 + i10) - 1 : (i14 + i10) - str.length(), 0, c21577c.f68324a.length());
        c21577c.m21860h(iM8921l, iM8921l);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m21964l(C13801c c13801c, float f10, float f11) {
        return f10 <= c13801c.f43588c && c13801c.f43586a <= f10 && f11 <= c13801c.f43589d && c13801c.f43587b <= f11;
    }

    /* JADX INFO: renamed from: m */
    public static final float m21965m(long j10, C13801c c13801c) {
        if (AbstractC1807h0.m2631t(j10, c13801c)) {
            return 0.0f;
        }
        float fM15305f = C13800b.m15305f(C13800b.m15310k(c13801c.m15320g(), j10));
        if (fM15305f >= Float.MAX_VALUE) {
            fM15305f = Float.MAX_VALUE;
        }
        float f10 = c13801c.f43587b;
        float f11 = c13801c.f43588c;
        float fM15305f2 = C13800b.m15305f(C13800b.m15310k(AbstractC8088f6.m8536b(f11, f10), j10));
        if (fM15305f2 < fM15305f) {
            fM15305f = fM15305f2;
        }
        float f12 = c13801c.f43586a;
        float f13 = c13801c.f43589d;
        float fM15305f3 = C13800b.m15305f(C13800b.m15310k(AbstractC8088f6.m8536b(f12, f13), j10));
        if (fM15305f3 < fM15305f) {
            fM15305f = fM15305f3;
        }
        float fM15305f4 = C13800b.m15305f(C13800b.m15310k(AbstractC8088f6.m8536b(f11, f13), j10));
        return fM15305f4 < fM15305f ? fM15305f4 : fM15305f;
    }

    /* JADX INFO: renamed from: n */
    public static final long m21966n(C21574A0 c21574a0, long j10) {
        C13800b c13800b;
        InterfaceC21098s interfaceC21098sM21851d = c21574a0.m21851d();
        if (interfaceC21098sM21851d == null) {
            return j10;
        }
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) c21574a0.f68318f.getValue();
        if (interfaceC21098s != null) {
            c13800b = new C13800b((interfaceC21098sM21851d.mo21522h() && interfaceC21098s.mo21522h()) ? interfaceC21098sM21851d.mo21521e(interfaceC21098s, j10) : j10);
        } else {
            c13800b = null;
        }
        return c13800b != null ? c13800b.f43584a : j10;
    }

    /* JADX INFO: renamed from: o */
    public static final int m21967o(C3599o c3599o, long j10, InterfaceC0161D1 interfaceC0161D1) {
        float fMo504g = interfaceC0161D1 != null ? interfaceC0161D1.mo504g() : 0.0f;
        int iM4311c = c3599o.m4311c(C13800b.m15307h(j10));
        if (C13800b.m15307h(j10) < c3599o.m4312d(iM4311c) - fMo504g || C13800b.m15307h(j10) > c3599o.m4310b(iM4311c) + fMo504g || C13800b.m15306g(j10) < (-fMo504g) || C13800b.m15306g(j10) > c3599o.f10961d + fMo504g) {
            return -1;
        }
        return iM4311c;
    }

    /* JADX INFO: renamed from: p */
    public static final int m21968p(C3599o c3599o, long j10, InterfaceC21098s interfaceC21098s, InterfaceC0161D1 interfaceC0161D1) {
        long jMo21516B;
        int iM21967o;
        if (interfaceC21098s == null || (iM21967o = m21967o(c3599o, (jMo21516B = interfaceC21098s.mo21516B(j10)), interfaceC0161D1)) == -1) {
            return -1;
        }
        return c3599o.m4313e(C13800b.m15301b((c3599o.m4310b(iM21967o) + c3599o.m4312d(iM21967o)) / 2.0f, 1, jMo21516B));
    }

    /* JADX INFO: renamed from: q */
    public static final long m21969q(C20750g0 c20750g0, C13801c c13801c, int i10) {
        C20710G0 c20710g0M21294d = c20750g0.m21294d();
        C3599o c3599o = c20710g0M21294d != null ? c20710g0M21294d.f65650a.f10893b : null;
        InterfaceC21098s interfaceC21098sM21293c = c20750g0.m21293c();
        return (c3599o == null || interfaceC21098sM21293c == null) ? C3581L.f10906b : c3599o.m4314f(c13801c.m15326m(interfaceC21098sM21293c.mo21516B(0L)), i10, C3576G.f10881b);
    }

    /* JADX INFO: renamed from: r */
    public static final long m21970r(C21574A0 c21574a0, C13801c c13801c, int i10) {
        C3578I c3578iM21849b = c21574a0.m21849b();
        C3599o c3599o = c3578iM21849b != null ? c3578iM21849b.f10893b : null;
        InterfaceC21098s interfaceC21098sM21851d = c21574a0.m21851d();
        return (c3599o == null || interfaceC21098sM21851d == null) ? C3581L.f10906b : c3599o.m4314f(c13801c.m15326m(interfaceC21098sM21851d.mo21516B(0L)), i10, C3576G.f10881b);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m21971s(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m21972t(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m21973u(int i10) {
        int type;
        return (!m21972t(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: v */
    public static final void m21974v(C0275o0 c0275o0, C21582E0 c21582e0, C21574A0 c21574a0, C6065n c6065n, C16031b c16031b, C16863U c16863u, InterfaceC2211v0 interfaceC2211v0, InterfaceC0161D1 interfaceC0161D1, AbstractC19687c abstractC19687c) {
        C21613f c21613f;
        C20659i c21641t;
        if (abstractC19687c instanceof C21613f) {
            c21613f = (C21613f) abstractC19687c;
            int i10 = c21613f.f68472Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21613f.f68472Z = i10 - Integer.MIN_VALUE;
            } else {
                c21613f = new C21613f(abstractC19687c);
            }
        } else {
            c21613f = new C21613f(abstractC19687c);
        }
        C21613f c21613f2 = c21613f;
        Object obj = c21613f2.f68471Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21613f2.f68472Z;
        if (i11 != 0) {
            if (i11 == 1) {
                throw AbstractC20734X.m21252w(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        View view = c0275o0.f999Y;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            c21641t = new C21643u(view);
        } else {
            c21641t = i12 >= 24 ? new C21641t(view) : new C20659i(view);
        }
        C20659i c20659i = c21641t;
        c21613f2.f68472Z = 1;
        m21975w(c0275o0, c21582e0, c21574a0, c6065n, c16031b, c16863u, c20659i, interfaceC2211v0, interfaceC0161D1, c21613f2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: w */
    public static final void m21975w(C0275o0 c0275o0, C21582E0 c21582e0, C21574A0 c21574a0, C6065n c6065n, C16031b c16031b, C16863U c16863u, C20659i c20659i, InterfaceC2211v0 interfaceC2211v0, InterfaceC0161D1 interfaceC0161D1, AbstractC19687c abstractC19687c) {
        C21615g c21615g;
        if (abstractC19687c instanceof C21615g) {
            c21615g = (C21615g) abstractC19687c;
            int i10 = c21615g.f68476Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21615g.f68476Z = i10 - Integer.MIN_VALUE;
            } else {
                c21615g = new C21615g(abstractC19687c);
            }
        } else {
            c21615g = new C21615g(abstractC19687c);
        }
        Object obj = c21615g.f68475Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21615g.f68476Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C21625l c21625l = new C21625l(interfaceC2211v0, c21582e0, c21574a0, c20659i, c0275o0, c6065n, c16031b, c16863u, interfaceC0161D1, null);
            c21615g.f68476Z = 1;
            if (AbstractC0575H.m1183l(c21625l, c21615g) == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: x */
    public static final void m21976x(CharSequence charSequence, char[] cArr, int i10, int i11, int i12) {
        if (charSequence instanceof C21353b) {
            m21976x(((C21353b) charSequence).f67817Y, cArr, i10, i11, i12);
            return;
        }
        while (i11 < i12) {
            cArr[i10] = charSequence.charAt(i11);
            i11++;
            i10++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m21977y(EditorInfo editorInfo, CharSequence charSequence, long j10, C6065n c6065n, String[] strArr) {
        int i10;
        int i11;
        int i12 = c6065n.f19760e;
        boolean zM6639a = C6064m.m6639a(i12, 1);
        boolean z6 = c6065n.f19756a;
        if (zM6639a) {
            i10 = z6 ? 6 : 0;
        } else if (C6064m.m6639a(i12, 0)) {
            i10 = 1;
        } else if (C6064m.m6639a(i12, 2)) {
            i10 = 2;
        } else if (C6064m.m6639a(i12, 6)) {
            i10 = 5;
        } else if (C6064m.m6639a(i12, 5)) {
            i10 = 7;
        } else if (C6064m.m6639a(i12, 3)) {
            i10 = 3;
        } else if (C6064m.m6639a(i12, 4)) {
            i10 = 4;
        } else {
            if (!C6064m.m6639a(i12, 7)) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        if (Build.VERSION.SDK_INT >= 24) {
            C21592O.f68385a.m21937a(editorInfo, c6065n.f19761f);
        }
        int i13 = c6065n.f19759d;
        if (C6067p.m6643a(i13, 1)) {
            i11 = 1;
        } else if (C6067p.m6643a(i13, 2)) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (C6067p.m6643a(i13, 3)) {
            i11 = 2;
        } else if (C6067p.m6643a(i13, 4)) {
            i11 = 3;
        } else if (C6067p.m6643a(i13, 5)) {
            i11 = 17;
        } else if (C6067p.m6643a(i13, 6)) {
            i11 = 33;
        } else if (C6067p.m6643a(i13, 7)) {
            i11 = 129;
        } else if (C6067p.m6643a(i13, 8)) {
            i11 = 18;
        } else {
            if (!C6067p.m6643a(i13, 9)) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z6 && (i11 & 1) == 1) {
            editorInfo.inputType = i11 | 131072;
            if (C6064m.m6639a(c6065n.f19760e, 1)) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i14 = c6065n.f19757b;
            if (C6066o.m6641a(i14, 1)) {
                editorInfo.inputType |= 4096;
            } else if (C6066o.m6641a(i14, 2)) {
                editorInfo.inputType |= 8192;
            } else if (C6066o.m6641a(i14, 3)) {
                editorInfo.inputType |= 16384;
            }
            if (c6065n.f19758c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i15 = C3581L.f10907c;
        editorInfo.initialSelStart = (int) (j10 >> 32);
        editorInfo.initialSelEnd = (int) (j10 & 4294967295L);
        AbstractC1857d.m2739c(editorInfo, charSequence);
        if (strArr != null) {
            AbstractC1857d.m2738b(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC21046e.f66933a || C6067p.m6643a(i13, 7) || C6067p.m6643a(i13, 8)) {
            if (AbstractC20789a.m21307a()) {
                AbstractC1856c.m2736a(editorInfo, false);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            return;
        }
        if (AbstractC20789a.m21307a()) {
            AbstractC1856c.m2736a(editorInfo, true);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        C21579D.f68333a.m21863a(editorInfo);
    }

    /* JADX INFO: renamed from: z */
    public static final long m21978z(long j10, long j11) {
        int iM4268d;
        int iM4270f = C3581L.m4270f(j10);
        int iM4269e = C3581L.m4269e(j10);
        if (C3581L.m4270f(j11) >= C3581L.m4269e(j10) || C3581L.m4270f(j10) >= C3581L.m4269e(j11)) {
            if (iM4269e > C3581L.m4270f(j11)) {
                iM4270f -= C3581L.m4268d(j11);
                iM4268d = C3581L.m4268d(j11);
                iM4269e -= iM4268d;
            }
        } else if (C3581L.m4265a(j11, j10)) {
            iM4270f = C3581L.m4270f(j11);
            iM4269e = iM4270f;
        } else {
            if (C3581L.m4265a(j10, j11)) {
                iM4268d = C3581L.m4268d(j11);
            } else {
                int iM4270f2 = C3581L.m4270f(j11);
                if (iM4270f >= C3581L.m4269e(j11) || iM4270f2 > iM4270f) {
                    iM4269e = C3581L.m4270f(j11);
                } else {
                    iM4270f = C3581L.m4270f(j11);
                    iM4268d = C3581L.m4268d(j11);
                }
            }
            iM4269e -= iM4268d;
        }
        return AbstractC8676n.m9365b(iM4270f, iM4269e);
    }
}
