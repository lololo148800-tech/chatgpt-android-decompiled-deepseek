package p1139z0;

import android.gov.nist.core.Separators;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import mm.C17309l;
import p003A1.InterfaceC0161D1;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p1113xn.C21319m;
import p1116y0.C21358g;
import p1116y0.C21359h;
import p1128yg.AbstractC21537a;
import p131F1.C2629g;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p296Lk.C5111h;
import p350O1.C6043A;
import p350O1.C6052a;
import p350O1.C6058g;
import p350O1.InterfaceC6060i;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8658k;
import p544W9.AbstractC8676n;
import p774h1.AbstractC14334L;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: z0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C21583F {

    /* JADX INFO: renamed from: a */
    public static final C21583F f68341a = new C21583F();

    /* JADX INFO: renamed from: A */
    private final void m21886A(C21582E0 c21582e0, DeleteRangeGesture deleteRangeGesture, C21574A0 c21574a0) {
        m21894c(c21582e0, AbstractC21627m.m21956d(c21574a0, AbstractC14334L.m15620I(deleteRangeGesture.getDeletionStartArea()), AbstractC14334L.m15620I(deleteRangeGesture.getDeletionEndArea()), m21891H(deleteRangeGesture.getGranularity())), 1);
    }

    /* JADX INFO: renamed from: D */
    private final void m21887D(C20750g0 c20750g0, SelectGesture selectGesture, C1837w0 c1837w0) {
        if (c1837w0 != null) {
            long jM21969q = AbstractC21627m.m21969q(c20750g0, AbstractC14334L.m15620I(selectGesture.getSelectionArea()), m21891H(selectGesture.getGranularity()));
            C20750g0 c20750g1 = c1837w0.f5308d;
            if (c20750g1 != null) {
                c20750g1.m21296f(jM21969q);
            }
            C20750g0 c20750g2 = c1837w0.f5308d;
            if (c20750g2 != null) {
                c20750g2.m21295e(C3581L.f10906b);
            }
            if (C3581L.m4267c(jM21969q)) {
                return;
            }
            c1837w0.m2692p(false);
            c1837w0.m2690n(EnumC20730T.f65728Y);
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m21888E(C21582E0 c21582e0, SelectGesture selectGesture, C21574A0 c21574a0) {
        m21894c(c21582e0, AbstractC21627m.m21970r(c21574a0, AbstractC14334L.m15620I(selectGesture.getSelectionArea()), m21891H(selectGesture.getGranularity())), 0);
    }

    /* JADX INFO: renamed from: F */
    private final void m21889F(C20750g0 c20750g0, SelectRangeGesture selectRangeGesture, C1837w0 c1837w0) {
        if (c1837w0 != null) {
            long jM21955c = AbstractC21627m.m21955c(c20750g0, AbstractC14334L.m15620I(selectRangeGesture.getSelectionStartArea()), AbstractC14334L.m15620I(selectRangeGesture.getSelectionEndArea()), m21891H(selectRangeGesture.getGranularity()));
            C20750g0 c20750g1 = c1837w0.f5308d;
            if (c20750g1 != null) {
                c20750g1.m21296f(jM21955c);
            }
            C20750g0 c20750g2 = c1837w0.f5308d;
            if (c20750g2 != null) {
                c20750g2.m21295e(C3581L.f10906b);
            }
            if (C3581L.m4267c(jM21955c)) {
                return;
            }
            c1837w0.m2692p(false);
            c1837w0.m2690n(EnumC20730T.f65728Y);
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m21890G(C21582E0 c21582e0, SelectRangeGesture selectRangeGesture, C21574A0 c21574a0) {
        m21894c(c21582e0, AbstractC21627m.m21956d(c21574a0, AbstractC14334L.m15620I(selectRangeGesture.getSelectionStartArea()), AbstractC14334L.m15620I(selectRangeGesture.getSelectionEndArea()), m21891H(selectRangeGesture.getGranularity())), 0);
    }

    /* JADX INFO: renamed from: H */
    private final int m21891H(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: a */
    private final int m21892a(C21582E0 c21582e0, HandwritingGesture handwritingGesture) {
        C21358g c21358g = c21582e0.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        c21358g.f67827b.f68328e = null;
        C21358g.m21749a(c21358g, true, 1);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        C21582E0.m21877f(c21582e0, fallbackText, true, 0, 4);
        return 5;
    }

    /* JADX INFO: renamed from: b */
    private final int m21893b(HandwritingGesture handwritingGesture, InterfaceC1436k interfaceC1436k) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC1436k.invoke(new C6052a(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: c */
    public static void m21894c(C21582E0 c21582e0, long j10, int i10) {
        if (C3581L.m4267c(j10)) {
            C21358g c21358g = c21582e0.f68337a;
            c21358g.f67827b.f68325b.m20988c();
            c21358g.f67827b.f68328e = null;
            C21358g.m21749a(c21358g, true, 1);
            return;
        }
        long jM21882d = c21582e0.m21882d(j10);
        C21358g c21358g2 = c21582e0.f68337a;
        c21358g2.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g2.f67827b;
        int i11 = (int) (jM21882d >> 32);
        int i12 = (int) (jM21882d & 4294967295L);
        if (i11 >= i12) {
            c21577c.getClass();
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed or empty range: ", i11, i12, " > "));
        }
        C21593P c21593p = c21577c.f68324a;
        c21577c.f68328e = new C17309l(new C21359h(i10), new C3581L(AbstractC8676n.m9365b(AbstractC8301I.m8921l(i11, 0, c21593p.length()), AbstractC8301I.m8921l(i12, 0, c21593p.length()))));
        C21358g.m21749a(c21358g2, true, 1);
    }

    /* JADX INFO: renamed from: d */
    private final int m21895d(C20750g0 c20750g0, DeleteGesture deleteGesture, C3590f c3590f, InterfaceC1436k interfaceC1436k) {
        int iM21891H = m21891H(deleteGesture.getGranularity());
        long jM21969q = AbstractC21627m.m21969q(c20750g0, AbstractC14334L.m15620I(deleteGesture.getDeletionArea()), iM21891H);
        if (C3581L.m4267c(jM21969q)) {
            return f68341a.m21893b(AbstractC21581E.m21870g(deleteGesture), interfaceC1436k);
        }
        m21900i(jM21969q, c3590f, AbstractC8658k.m9348b(iM21891H, 1), interfaceC1436k);
        return 1;
    }

    /* JADX INFO: renamed from: e */
    private final int m21896e(C21582E0 c21582e0, DeleteGesture deleteGesture, C21574A0 c21574a0) {
        int iM21891H = m21891H(deleteGesture.getGranularity());
        long jM21970r = AbstractC21627m.m21970r(c21574a0, AbstractC14334L.m15620I(deleteGesture.getDeletionArea()), iM21891H);
        if (C3581L.m4267c(jM21970r)) {
            return f68341a.m21892a(c21582e0, AbstractC21581E.m21870g(deleteGesture));
        }
        m21899h(c21582e0, jM21970r, AbstractC8658k.m9348b(iM21891H, 1));
        return 1;
    }

    /* JADX INFO: renamed from: f */
    private final int m21897f(C20750g0 c20750g0, DeleteRangeGesture deleteRangeGesture, C3590f c3590f, InterfaceC1436k interfaceC1436k) {
        int iM21891H = m21891H(deleteRangeGesture.getGranularity());
        long jM21955c = AbstractC21627m.m21955c(c20750g0, AbstractC14334L.m15620I(deleteRangeGesture.getDeletionStartArea()), AbstractC14334L.m15620I(deleteRangeGesture.getDeletionEndArea()), iM21891H);
        if (C3581L.m4267c(jM21955c)) {
            return f68341a.m21893b(AbstractC21581E.m21870g(deleteRangeGesture), interfaceC1436k);
        }
        m21900i(jM21955c, c3590f, AbstractC8658k.m9348b(iM21891H, 1), interfaceC1436k);
        return 1;
    }

    /* JADX INFO: renamed from: g */
    private final int m21898g(C21582E0 c21582e0, DeleteRangeGesture deleteRangeGesture, C21574A0 c21574a0) {
        int iM21891H = m21891H(deleteRangeGesture.getGranularity());
        long jM21956d = AbstractC21627m.m21956d(c21574a0, AbstractC14334L.m15620I(deleteRangeGesture.getDeletionStartArea()), AbstractC14334L.m15620I(deleteRangeGesture.getDeletionEndArea()), iM21891H);
        if (C3581L.m4267c(jM21956d)) {
            return f68341a.m21892a(c21582e0, AbstractC21581E.m21870g(deleteRangeGesture));
        }
        m21899h(c21582e0, jM21956d, AbstractC8658k.m9348b(iM21891H, 1));
        return 1;
    }

    /* JADX INFO: renamed from: h */
    private final void m21899h(C21582E0 c21582e0, long j10, boolean z6) {
        if (z6) {
            j10 = AbstractC21627m.m21953a(j10, c21582e0.m21881c());
        }
        C21582E0.m21878g(c21582e0, "", j10, false, 12);
    }

    /* JADX INFO: renamed from: i */
    private final void m21900i(long j10, C3590f c3590f, boolean z6, InterfaceC1436k interfaceC1436k) {
        if (z6) {
            j10 = AbstractC21627m.m21953a(j10, c3590f);
        }
        int i10 = (int) (4294967295L & j10);
        interfaceC1436k.invoke(new C21584G(new InterfaceC6060i[]{new C6043A(i10, i10), new C6058g(C3581L.m4268d(j10), 0)}));
    }

    /* JADX INFO: renamed from: l */
    private final int m21901l(C20750g0 c20750g0, InsertGesture insertGesture, InterfaceC0161D1 interfaceC0161D1, InterfaceC1436k interfaceC1436k) {
        C20710G0 c20710g0M21294d;
        if (interfaceC0161D1 == null) {
            return m21893b(AbstractC21581E.m21870g(insertGesture), interfaceC1436k);
        }
        long jM21961i = AbstractC21627m.m21961i(insertGesture.getInsertionPoint());
        C20710G0 c20710g0M21294d2 = c20750g0.m21294d();
        int iM21968p = c20710g0M21294d2 != null ? AbstractC21627m.m21968p(c20710g0M21294d2.f65650a.f10893b, jM21961i, c20750g0.m21293c(), interfaceC0161D1) : -1;
        if (iM21968p == -1 || ((c20710g0M21294d = c20750g0.m21294d()) != null && AbstractC21627m.m21957e(c20710g0M21294d.f65650a, iM21968p))) {
            return m21893b(AbstractC21581E.m21870g(insertGesture), interfaceC1436k);
        }
        m21903n(iM21968p, insertGesture.getTextToInsert(), interfaceC1436k);
        return 1;
    }

    /* JADX INFO: renamed from: m */
    private final int m21902m(C21582E0 c21582e0, InsertGesture insertGesture, C21574A0 c21574a0, InterfaceC0161D1 interfaceC0161D1) {
        long jM21961i = AbstractC21627m.m21961i(insertGesture.getInsertionPoint());
        C3578I c3578iM21849b = c21574a0.m21849b();
        int iM21968p = c3578iM21849b != null ? AbstractC21627m.m21968p(c3578iM21849b.f10893b, jM21961i, c21574a0.m21851d(), interfaceC0161D1) : -1;
        if (iM21968p == -1) {
            return m21892a(c21582e0, AbstractC21581E.m21870g(insertGesture));
        }
        C21582E0.m21878g(c21582e0, insertGesture.getTextToInsert(), AbstractC8676n.m9365b(iM21968p, iM21968p), false, 12);
        return 1;
    }

    /* JADX INFO: renamed from: n */
    private final void m21903n(int i10, String str, InterfaceC1436k interfaceC1436k) {
        interfaceC1436k.invoke(new C21584G(new InterfaceC6060i[]{new C6043A(i10, i10), new C6052a(str, 1)}));
    }

    /* JADX INFO: renamed from: o */
    private final int m21904o(C20750g0 c20750g0, JoinOrSplitGesture joinOrSplitGesture, C3590f c3590f, InterfaceC0161D1 interfaceC0161D1, InterfaceC1436k interfaceC1436k) {
        C20710G0 c20710g0M21294d;
        if (interfaceC0161D1 == null) {
            return m21893b(AbstractC21581E.m21870g(joinOrSplitGesture), interfaceC1436k);
        }
        long jM21961i = AbstractC21627m.m21961i(joinOrSplitGesture.getJoinOrSplitPoint());
        C20710G0 c20710g0M21294d2 = c20750g0.m21294d();
        int iM21968p = c20710g0M21294d2 != null ? AbstractC21627m.m21968p(c20710g0M21294d2.f65650a.f10893b, jM21961i, c20750g0.m21293c(), interfaceC0161D1) : -1;
        if (iM21968p == -1 || ((c20710g0M21294d = c20750g0.m21294d()) != null && AbstractC21627m.m21957e(c20710g0M21294d.f65650a, iM21968p))) {
            return m21893b(AbstractC21581E.m21870g(joinOrSplitGesture), interfaceC1436k);
        }
        long jM21959g = AbstractC21627m.m21959g(iM21968p, c3590f);
        if (C3581L.m4267c(jM21959g)) {
            m21903n((int) (jM21959g >> 32), Separators.f31991SP, interfaceC1436k);
        } else {
            m21900i(jM21959g, c3590f, false, interfaceC1436k);
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    private final int m21905p(C21582E0 c21582e0, JoinOrSplitGesture joinOrSplitGesture, C21574A0 c21574a0, InterfaceC0161D1 interfaceC0161D1) {
        C3578I c3578iM21849b;
        if (c21582e0.f68337a.m21750b() != c21582e0.f68337a.m21750b()) {
            return 3;
        }
        long jM21961i = AbstractC21627m.m21961i(joinOrSplitGesture.getJoinOrSplitPoint());
        C3578I c3578iM21849b2 = c21574a0.m21849b();
        int iM21968p = c3578iM21849b2 != null ? AbstractC21627m.m21968p(c3578iM21849b2.f10893b, jM21961i, c21574a0.m21851d(), interfaceC0161D1) : -1;
        if (iM21968p == -1 || ((c3578iM21849b = c21574a0.m21849b()) != null && AbstractC21627m.m21957e(c3578iM21849b, iM21968p))) {
            return m21892a(c21582e0, AbstractC21581E.m21870g(joinOrSplitGesture));
        }
        long jM21959g = AbstractC21627m.m21959g(iM21968p, c21582e0.m21881c());
        if (C3581L.m4267c(jM21959g)) {
            C21582E0.m21878g(c21582e0, Separators.f31991SP, jM21959g, false, 12);
        } else {
            m21899h(c21582e0, jM21959g, false);
        }
        return 1;
    }

    /* JADX INFO: renamed from: q */
    private final int m21906q(C20750g0 c20750g0, RemoveSpaceGesture removeSpaceGesture, C3590f c3590f, InterfaceC0161D1 interfaceC0161D1, InterfaceC1436k interfaceC1436k) {
        int i10;
        C20710G0 c20710g0M21294d = c20750g0.m21294d();
        long jM21954b = AbstractC21627m.m21954b(c20710g0M21294d != null ? c20710g0M21294d.f65650a : null, AbstractC21627m.m21961i(removeSpaceGesture.getStartPoint()), AbstractC21627m.m21961i(removeSpaceGesture.getEndPoint()), c20750g0.m21293c(), interfaceC0161D1);
        if (C3581L.m4267c(jM21954b)) {
            return f68341a.m21893b(AbstractC21581E.m21870g(removeSpaceGesture), interfaceC1436k);
        }
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = -1;
        C16558z c16558z2 = new C16558z();
        c16558z2.f51287Y = -1;
        String strM21666f = new C21319m("\\s+").m21666f(AbstractC8676n.m9367d(jM21954b, c3590f), new C5111h(c16558z, c16558z2, 2));
        int i11 = c16558z.f51287Y;
        if (i11 == -1 || (i10 = c16558z2.f51287Y) == -1) {
            return m21893b(AbstractC21581E.m21870g(removeSpaceGesture), interfaceC1436k);
        }
        int i12 = (int) (jM21954b >> 32);
        String strSubstring = strM21666f.substring(i11, strM21666f.length() - (C3581L.m4268d(jM21954b) - c16558z2.f51287Y));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        interfaceC1436k.invoke(new C21584G(new InterfaceC6060i[]{new C6043A(i12 + i11, i12 + i10), new C6052a(strSubstring, 1)}));
        return 1;
    }

    /* JADX INFO: renamed from: r */
    private final int m21907r(C21582E0 c21582e0, RemoveSpaceGesture removeSpaceGesture, C21574A0 c21574a0, InterfaceC0161D1 interfaceC0161D1) {
        int i10;
        long jM21954b = AbstractC21627m.m21954b(c21574a0.m21849b(), AbstractC21627m.m21961i(removeSpaceGesture.getStartPoint()), AbstractC21627m.m21961i(removeSpaceGesture.getEndPoint()), c21574a0.m21851d(), interfaceC0161D1);
        if (C3581L.m4267c(jM21954b)) {
            return f68341a.m21892a(c21582e0, AbstractC21581E.m21870g(removeSpaceGesture));
        }
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = -1;
        C16558z c16558z2 = new C16558z();
        c16558z2.f51287Y = -1;
        String strM21666f = new C21319m("\\s+").m21666f(AbstractC8676n.m9367d(jM21954b, c21582e0.m21881c()), new C5111h(c16558z, c16558z2, 1));
        int i11 = c16558z.f51287Y;
        if (i11 == -1 || (i10 = c16558z2.f51287Y) == -1) {
            return m21892a(c21582e0, AbstractC21581E.m21870g(removeSpaceGesture));
        }
        int i12 = (int) (jM21954b >> 32);
        long jM9365b = AbstractC8676n.m9365b(i11 + i12, i12 + i10);
        String strSubstring = strM21666f.substring(c16558z.f51287Y, strM21666f.length() - (C3581L.m4268d(jM21954b) - c16558z2.f51287Y));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        C21582E0.m21878g(c21582e0, strSubstring, jM9365b, false, 12);
        return 1;
    }

    /* JADX INFO: renamed from: s */
    private final int m21908s(C20750g0 c20750g0, SelectGesture selectGesture, C1837w0 c1837w0, InterfaceC1436k interfaceC1436k) {
        long jM21969q = AbstractC21627m.m21969q(c20750g0, AbstractC14334L.m15620I(selectGesture.getSelectionArea()), m21891H(selectGesture.getGranularity()));
        if (C3581L.m4267c(jM21969q)) {
            return f68341a.m21893b(AbstractC21581E.m21870g(selectGesture), interfaceC1436k);
        }
        m21912w(jM21969q, c1837w0, interfaceC1436k);
        return 1;
    }

    /* JADX INFO: renamed from: t */
    private final int m21909t(C21582E0 c21582e0, SelectGesture selectGesture, C21574A0 c21574a0) {
        long jM21970r = AbstractC21627m.m21970r(c21574a0, AbstractC14334L.m15620I(selectGesture.getSelectionArea()), m21891H(selectGesture.getGranularity()));
        if (C3581L.m4267c(jM21970r)) {
            return f68341a.m21892a(c21582e0, AbstractC21581E.m21870g(selectGesture));
        }
        c21582e0.m21884h(jM21970r);
        return 1;
    }

    /* JADX INFO: renamed from: u */
    private final int m21910u(C20750g0 c20750g0, SelectRangeGesture selectRangeGesture, C1837w0 c1837w0, InterfaceC1436k interfaceC1436k) {
        long jM21955c = AbstractC21627m.m21955c(c20750g0, AbstractC14334L.m15620I(selectRangeGesture.getSelectionStartArea()), AbstractC14334L.m15620I(selectRangeGesture.getSelectionEndArea()), m21891H(selectRangeGesture.getGranularity()));
        if (C3581L.m4267c(jM21955c)) {
            return f68341a.m21893b(AbstractC21581E.m21870g(selectRangeGesture), interfaceC1436k);
        }
        m21912w(jM21955c, c1837w0, interfaceC1436k);
        return 1;
    }

    /* JADX INFO: renamed from: v */
    private final int m21911v(C21582E0 c21582e0, SelectRangeGesture selectRangeGesture, C21574A0 c21574a0) {
        long jM21956d = AbstractC21627m.m21956d(c21574a0, AbstractC14334L.m15620I(selectRangeGesture.getSelectionStartArea()), AbstractC14334L.m15620I(selectRangeGesture.getSelectionEndArea()), m21891H(selectRangeGesture.getGranularity()));
        if (C3581L.m4267c(jM21956d)) {
            return f68341a.m21892a(c21582e0, AbstractC21581E.m21870g(selectRangeGesture));
        }
        c21582e0.m21884h(jM21956d);
        return 1;
    }

    /* JADX INFO: renamed from: w */
    private final void m21912w(long j10, C1837w0 c1837w0, InterfaceC1436k interfaceC1436k) {
        int i10 = C3581L.f10907c;
        interfaceC1436k.invoke(new C6043A((int) (j10 >> 32), (int) (j10 & 4294967295L)));
        if (c1837w0 != null) {
            c1837w0.m2682f(true);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m21913x(C20750g0 c20750g0, DeleteGesture deleteGesture, C1837w0 c1837w0) {
        if (c1837w0 != null) {
            long jM21969q = AbstractC21627m.m21969q(c20750g0, AbstractC14334L.m15620I(deleteGesture.getDeletionArea()), m21891H(deleteGesture.getGranularity()));
            C20750g0 c20750g1 = c1837w0.f5308d;
            if (c20750g1 != null) {
                c20750g1.m21295e(jM21969q);
            }
            C20750g0 c20750g2 = c1837w0.f5308d;
            if (c20750g2 != null) {
                c20750g2.m21296f(C3581L.f10906b);
            }
            if (C3581L.m4267c(jM21969q)) {
                return;
            }
            c1837w0.m2692p(false);
            c1837w0.m2690n(EnumC20730T.f65728Y);
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m21914y(C21582E0 c21582e0, DeleteGesture deleteGesture, C21574A0 c21574a0) {
        m21894c(c21582e0, AbstractC21627m.m21970r(c21574a0, AbstractC14334L.m15620I(deleteGesture.getDeletionArea()), m21891H(deleteGesture.getGranularity())), 1);
    }

    /* JADX INFO: renamed from: z */
    private final void m21915z(C20750g0 c20750g0, DeleteRangeGesture deleteRangeGesture, C1837w0 c1837w0) {
        if (c1837w0 != null) {
            long jM21955c = AbstractC21627m.m21955c(c20750g0, AbstractC14334L.m15620I(deleteRangeGesture.getDeletionStartArea()), AbstractC14334L.m15620I(deleteRangeGesture.getDeletionEndArea()), m21891H(deleteRangeGesture.getGranularity()));
            C20750g0 c20750g1 = c1837w0.f5308d;
            if (c20750g1 != null) {
                c20750g1.m21295e(jM21955c);
            }
            C20750g0 c20750g2 = c1837w0.f5308d;
            if (c20750g2 != null) {
                c20750g2.m21296f(C3581L.f10906b);
            }
            if (C3581L.m4267c(jM21955c)) {
                return;
            }
            c1837w0.m2692p(false);
            c1837w0.m2690n(EnumC20730T.f65728Y);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m21916B(C20750g0 c20750g0, PreviewableHandwritingGesture previewableHandwritingGesture, C1837w0 c1837w0, CancellationSignal cancellationSignal) {
        C3577H c3577h;
        C3590f c3590f = c20750g0.f65819j;
        if (c3590f == null) {
            return false;
        }
        C20710G0 c20710g0M21294d = c20750g0.m21294d();
        if (!c3590f.equals((c20710g0M21294d == null || (c3577h = c20710g0M21294d.f65650a.f10892a) == null) ? null : c3577h.f10882a)) {
            return false;
        }
        if (AbstractC21581E.m21874k(previewableHandwritingGesture)) {
            m21887D(c20750g0, AbstractC21581E.m21871h(previewableHandwritingGesture), c1837w0);
        } else if (AbstractC21537a.m21817r(previewableHandwritingGesture)) {
            m21913x(c20750g0, AbstractC21537a.m21805f(previewableHandwritingGesture), c1837w0);
        } else if (AbstractC21537a.m21820u(previewableHandwritingGesture)) {
            m21889F(c20750g0, AbstractC21537a.m21810k(previewableHandwritingGesture), c1837w0);
        } else {
            if (!AbstractC21537a.m21822w(previewableHandwritingGesture)) {
                return false;
            }
            m21915z(c20750g0, AbstractC21537a.m21806g(previewableHandwritingGesture), c1837w0);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C2629g(c1837w0, 1));
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m21917C(C21582E0 c21582e0, PreviewableHandwritingGesture previewableHandwritingGesture, C21574A0 c21574a0, CancellationSignal cancellationSignal) {
        if (AbstractC21581E.m21874k(previewableHandwritingGesture)) {
            m21888E(c21582e0, AbstractC21581E.m21871h(previewableHandwritingGesture), c21574a0);
        } else if (AbstractC21537a.m21817r(previewableHandwritingGesture)) {
            m21914y(c21582e0, AbstractC21537a.m21805f(previewableHandwritingGesture), c21574a0);
        } else if (AbstractC21537a.m21820u(previewableHandwritingGesture)) {
            m21890G(c21582e0, AbstractC21537a.m21810k(previewableHandwritingGesture), c21574a0);
        } else {
            if (!AbstractC21537a.m21822w(previewableHandwritingGesture)) {
                return false;
            }
            m21886A(c21582e0, AbstractC21537a.m21806g(previewableHandwritingGesture), c21574a0);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C2629g(c21582e0, 2));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m21918j(C20750g0 c20750g0, HandwritingGesture handwritingGesture, C1837w0 c1837w0, InterfaceC0161D1 interfaceC0161D1, InterfaceC1436k interfaceC1436k) {
        C3577H c3577h;
        C3590f c3590f = c20750g0.f65819j;
        if (c3590f == null) {
            return 3;
        }
        C20710G0 c20710g0M21294d = c20750g0.m21294d();
        if (!c3590f.equals((c20710g0M21294d == null || (c3577h = c20710g0M21294d.f65650a.f10892a) == null) ? null : c3577h.f10882a)) {
            return 3;
        }
        if (AbstractC21581E.m21874k(handwritingGesture)) {
            return m21908s(c20750g0, AbstractC21581E.m21871h(handwritingGesture), c1837w0, interfaceC1436k);
        }
        if (AbstractC21537a.m21817r(handwritingGesture)) {
            return m21895d(c20750g0, AbstractC21537a.m21805f(handwritingGesture), c3590f, interfaceC1436k);
        }
        if (AbstractC21537a.m21820u(handwritingGesture)) {
            return m21910u(c20750g0, AbstractC21537a.m21810k(handwritingGesture), c1837w0, interfaceC1436k);
        }
        if (AbstractC21537a.m21822w(handwritingGesture)) {
            return m21897f(c20750g0, AbstractC21537a.m21806g(handwritingGesture), c3590f, interfaceC1436k);
        }
        if (AbstractC21537a.m21798C(handwritingGesture)) {
            return m21904o(c20750g0, AbstractC21537a.m21808i(handwritingGesture), c3590f, interfaceC0161D1, interfaceC1436k);
        }
        if (AbstractC21537a.m21824y(handwritingGesture)) {
            return m21901l(c20750g0, AbstractC21537a.m21807h(handwritingGesture), interfaceC0161D1, interfaceC1436k);
        }
        if (AbstractC21537a.m21796A(handwritingGesture)) {
            return m21906q(c20750g0, AbstractC21537a.m21809j(handwritingGesture), c3590f, interfaceC0161D1, interfaceC1436k);
        }
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public final int m21919k(C21582E0 c21582e0, HandwritingGesture handwritingGesture, C21574A0 c21574a0, InterfaceC0161D1 interfaceC0161D1) {
        if (AbstractC21581E.m21874k(handwritingGesture)) {
            return m21909t(c21582e0, AbstractC21581E.m21871h(handwritingGesture), c21574a0);
        }
        if (AbstractC21537a.m21817r(handwritingGesture)) {
            return m21896e(c21582e0, AbstractC21537a.m21805f(handwritingGesture), c21574a0);
        }
        if (AbstractC21537a.m21820u(handwritingGesture)) {
            return m21911v(c21582e0, AbstractC21537a.m21810k(handwritingGesture), c21574a0);
        }
        if (AbstractC21537a.m21822w(handwritingGesture)) {
            return m21898g(c21582e0, AbstractC21537a.m21806g(handwritingGesture), c21574a0);
        }
        if (AbstractC21537a.m21798C(handwritingGesture)) {
            return m21905p(c21582e0, AbstractC21537a.m21808i(handwritingGesture), c21574a0, interfaceC0161D1);
        }
        if (AbstractC21537a.m21824y(handwritingGesture)) {
            return m21902m(c21582e0, AbstractC21537a.m21807h(handwritingGesture), c21574a0, interfaceC0161D1);
        }
        if (AbstractC21537a.m21796A(handwritingGesture)) {
            return m21907r(c21582e0, AbstractC21537a.m21809j(handwritingGesture), c21574a0, interfaceC0161D1);
        }
        return 2;
    }
}
