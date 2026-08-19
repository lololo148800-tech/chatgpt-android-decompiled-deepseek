package p946pc;

import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20740b0;
import p1071w0.InterfaceC20772r0;
import p124Ei.C2478T0;
import p204I1.C3582M;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18319D {

    /* JADX INFO: renamed from: a */
    public static final C6037x f58477a;

    /* JADX INFO: renamed from: b */
    public static final C6037x f58478b;

    static {
        C18346l c18346l = C18346l.f58570p0;
        C5975S c5975s = C5975S.f19448r0;
        f58477a = new C6037x(c18346l, c5975s);
        f58478b = new C6037x(C18346l.f58569o0, c5975s);
    }

    /* JADX INFO: renamed from: a */
    public static final void m19842a(C18320E ClickableText, C3590f text, InterfaceC10459q interfaceC10459q, boolean z6, int i10, int i11, InterfaceC1436k interfaceC1436k, Map map, InterfaceC1436k isOffsetClickable, InterfaceC1436k onClick, C6021p c6021p, int i12) {
        int i13;
        InterfaceC20772r0 interfaceC20772r0;
        AbstractC16544l.m18094g(ClickableText, "$this$ClickableText");
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(isOffsetClickable, "isOffsetClickable");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(367449332);
        if ((i12 & 14) == 0) {
            i13 = (c6021p.m6542f(ClickableText) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= c6021p.m6542f(text) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i12 & 7168) == 0) {
            i14 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= c6021p.m6538d(i10) ? 16384 : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= c6021p.m6538d(i11) ? 131072 : 65536;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= c6021p.m6545h(interfaceC1436k) ? 1048576 : 524288;
        }
        if ((234881024 & i12) == 0) {
            i14 |= c6021p.m6545h(isOffsetClickable) ? 67108864 : 33554432;
        }
        if ((1879048192 & i12) == 0) {
            i14 |= c6021p.m6545h(onClick) ? 536870912 : 268435456;
        }
        C10456n c10456n = C10456n.f30959Y;
        c6021p.m6525T(-492369756);
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (objM6514H == obj) {
            objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        c6021p.m6525T(-760903724);
        boolean zM6542f = c6021p.m6542f(interfaceC5985X) | c6021p.m6545h(isOffsetClickable);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f || objM6514H2 == obj) {
            objM6514H2 = new C2478T0(interfaceC5985X, isOffsetClickable, 6);
            c6021p.m6537c0(objM6514H2);
        }
        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H2;
        c6021p.m6553p(false);
        c6021p.m6525T(-760903559);
        boolean zM6545h = c6021p.m6545h(interfaceC1436k2) | c6021p.m6542f(interfaceC5985X) | c6021p.m6545h(onClick);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6545h || objM6514H3 == obj) {
            interfaceC20772r0 = null;
            objM6514H3 = new C18316A(interfaceC1436k2, interfaceC5985X, onClick, null);
            c6021p.m6537c0(objM6514H3);
        } else {
            interfaceC20772r0 = null;
        }
        c6021p.m6553p(false);
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(onClick, interfaceC20772r0, (InterfaceC1439n) objM6514H3, 6);
        c6021p.m6525T(-760903210);
        boolean zM6542f2 = c6021p.m6542f(interfaceC5985X) | c6021p.m6545h(interfaceC1436k);
        Object objM6514H4 = c6021p.m6514H();
        if (zM6542f2 || objM6514H4 == obj) {
            objM6514H4 = new C2478T0(interfaceC5985X, interfaceC1436k, 4);
            c6021p.m6537c0(objM6514H4);
        }
        c6021p.m6553p(false);
        m19843b(ClickableText, text, suspendPointerInputElement, (InterfaceC1436k) objM6514H4, i10, z6, i11, map, c6021p, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18360z(ClickableText, text, c10456n, z6, i10, i11, interfaceC1436k, map, isOffsetClickable, onClick, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19843b(C18320E Text, C3590f text, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, Map map, C6021p c6021p, int i12) {
        int i13;
        AbstractC16544l.m18094g(Text, "$this$Text");
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(559740240);
        if ((i12 & 14) == 0) {
            i13 = (c6021p.m6542f(Text) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= c6021p.m6542f(text) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= c6021p.m6538d(i10) ? 16384 : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((i12 & 3670016) == 0) {
            i13 |= c6021p.m6538d(i11) ? 1048576 : 524288;
        }
        c6021p.m6525T(1561620891);
        long jM4277d = m19846e(Text, c6021p).m4277d();
        if (jM4277d == C14365u.f45060j) {
            jM4277d = m19845d(Text, c6021p);
        }
        c6021p.m6553p(false);
        int i14 = i13 >> 3;
        AbstractC20740b0.m21260a(text, interfaceC10459q, C3582M.m4275c(m19846e(Text, c6021p), jM4277d), interfaceC1436k, i10, z6, i11, 0, map, null, c6021p, (57344 & i13) | (i14 & 112) | (i14 & 14) | 134217728 | (i13 & 7168) | (458752 & i13) | (i13 & 3670016), 640);
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18318C(Text, text, interfaceC10459q, interfaceC1436k, i10, z6, i11, map, i12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19844c(C18320E Text, String text, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, C6021p c6021p, int i12) {
        int i13;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC1436k interfaceC1436k2;
        int i14;
        boolean z10;
        int i15;
        AbstractC16544l.m18094g(Text, "$this$Text");
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(-1456639868);
        if ((i12 & 14) == 0) {
            i13 = i12 | (c6021p.m6542f(Text) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= c6021p.m6542f(text) ? 32 : 16;
        }
        int i16 = i13 | 1797504;
        if ((2995931 & i16) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            interfaceC1436k2 = interfaceC1436k;
            i14 = i10;
            z10 = z6;
            i15 = i11;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C18335a c18335a = C18335a.f58533v0;
            c6021p.m6525T(1561620249);
            long jM4277d = m19846e(Text, c6021p).m4277d();
            if (jM4277d == C14365u.f45060j) {
                jM4277d = m19845d(Text, c6021p);
            }
            c6021p.m6553p(false);
            AbstractC20740b0.m21261b(text, c10456n, C3582M.m4275c(m19846e(Text, c6021p), jM4277d), c18335a, 1, true, Integer.MAX_VALUE, 0, null, c6021p, ((i16 >> 3) & 126) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 384);
            interfaceC10459q2 = c10456n;
            interfaceC1436k2 = c18335a;
            i14 = 1;
            z10 = true;
            i15 = Integer.MAX_VALUE;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18317B(Text, text, interfaceC10459q2, interfaceC1436k2, i14, z10, i15, i12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m19845d(C18320E c18320e, C6021p c6021p) {
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6525T(-401305534);
        C6037x c6037x = AbstractC18324I.f58495a;
        c6021p.m6525T(26288398);
        InterfaceC1439n interfaceC1439n = ((C18323H) c6021p.m6548k(AbstractC18324I.f58495a)).f58493c;
        c6021p.m6553p(false);
        long j10 = ((C14365u) interfaceC1439n.invoke(c6021p, 0)).f45062a;
        c6021p.m6553p(false);
        return j10;
    }

    /* JADX INFO: renamed from: e */
    public static final C3582M m19846e(C18320E c18320e, C6021p c6021p) {
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6525T(-1652167225);
        C6037x c6037x = AbstractC18324I.f58495a;
        c6021p.m6525T(-402397962);
        InterfaceC1439n interfaceC1439n = ((C18323H) c6021p.m6548k(AbstractC18324I.f58495a)).f58491a;
        c6021p.m6553p(false);
        C3582M c3582m = (C3582M) interfaceC1439n.invoke(c6021p, 0);
        c6021p.m6553p(false);
        return c3582m;
    }
}
