package p1139z0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p204I1.C3581L;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p389Pn.C6535t;
import p467T1.EnumC7198h;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14328F;

/* JADX INFO: renamed from: z0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C21588K {

    /* JADX INFO: renamed from: a */
    public final C6535t f68353a;

    /* JADX INFO: renamed from: b */
    public final C21585H f68354b;

    /* JADX INFO: renamed from: d */
    public boolean f68356d;

    /* JADX INFO: renamed from: e */
    public boolean f68357e;

    /* JADX INFO: renamed from: f */
    public boolean f68358f;

    /* JADX INFO: renamed from: g */
    public boolean f68359g;

    /* JADX INFO: renamed from: h */
    public boolean f68360h;

    /* JADX INFO: renamed from: i */
    public boolean f68361i;

    /* JADX INFO: renamed from: j */
    public C6045C f68362j;

    /* JADX INFO: renamed from: k */
    public C3578I f68363k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6073v f68364l;

    /* JADX INFO: renamed from: m */
    public C13801c f68365m;

    /* JADX INFO: renamed from: n */
    public C13801c f68366n;

    /* JADX INFO: renamed from: c */
    public final Object f68355c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f68367o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f68368p = C14328F.m15602a();

    /* JADX INFO: renamed from: q */
    public final Matrix f68369q = new Matrix();

    public C21588K(C6535t c6535t, C21585H c21585h) {
        this.f68353a = c6535t;
        this.f68354b = c21585h;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX INFO: renamed from: a */
    public final void m21936a() {
        C3578I c3578i;
        C21585H c21585h = this.f68354b;
        InputMethodManager inputMethodManagerM21930t = c21585h.m21930t();
        View view = (View) c21585h.f68344Z;
        if (!inputMethodManagerM21930t.isActive(view) || this.f68362j == null || this.f68364l == null || this.f68363k == null || this.f68365m == null || this.f68366n == null) {
            return;
        }
        float[] fArr = this.f68368p;
        C14328F.m15605d(fArr);
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) ((C21587J) this.f68353a.f21152Z).f68351C0.getValue();
        if (interfaceC21098s != null) {
            if (!interfaceC21098s.mo21522h()) {
                interfaceC21098s = null;
            }
            if (interfaceC21098s != null) {
                interfaceC21098s.mo21523j(fArr);
            }
        }
        C13801c c13801c = this.f68366n;
        AbstractC16544l.m18091d(c13801c);
        float f10 = -c13801c.f43586a;
        C13801c c13801c2 = this.f68366n;
        AbstractC16544l.m18091d(c13801c2);
        C14328F.m15609h(fArr, f10, -c13801c2.f43587b, 0.0f);
        Matrix matrix = this.f68369q;
        AbstractC14334L.m15648z(matrix, fArr);
        C6045C c6045c = this.f68362j;
        AbstractC16544l.m18091d(c6045c);
        InterfaceC6073v interfaceC6073v = this.f68364l;
        AbstractC16544l.m18091d(interfaceC6073v);
        C3578I c3578i2 = this.f68363k;
        AbstractC16544l.m18091d(c3578i2);
        C13801c c13801c3 = this.f68365m;
        AbstractC16544l.m18091d(c13801c3);
        C13801c c13801c4 = this.f68366n;
        AbstractC16544l.m18091d(c13801c4);
        boolean z6 = this.f68358f;
        boolean z10 = this.f68359g;
        boolean z11 = this.f68360h;
        boolean z12 = this.f68361i;
        CursorAnchorInfo.Builder builder = this.f68367o;
        builder.reset();
        builder.setMatrix(matrix);
        long j10 = c6045c.f19683b;
        int iM4270f = C3581L.m4270f(j10);
        builder.setSelectionRange(iM4270f, C3581L.m4269e(j10));
        EnumC7198h enumC7198h = EnumC7198h.f22860Z;
        if (!z6 || iM4270f < 0) {
            c3578i = c3578i2;
        } else {
            int iMo1766b = interfaceC6073v.mo1766b(iM4270f);
            C13801c c13801cM4253c = c3578i2.m4253c(iMo1766b);
            float fM8920k = AbstractC8301I.m8920k(c13801cM4253c.f43586a, 0.0f, (int) (c3578i2.f10894c >> 32));
            boolean zM21964l = AbstractC21627m.m21964l(c13801c3, fM8920k, c13801cM4253c.f43587b);
            boolean zM21964l2 = AbstractC21627m.m21964l(c13801c3, fM8920k, c13801cM4253c.f43589d);
            boolean z13 = c3578i2.m4251a(iMo1766b) == enumC7198h;
            int i10 = (zM21964l || zM21964l2) ? 1 : 0;
            if (!zM21964l || !zM21964l2) {
                i10 |= 2;
            }
            int i11 = z13 ? i10 | 4 : i10;
            float f11 = c13801cM4253c.f43587b;
            float f12 = c13801cM4253c.f43589d;
            c3578i = c3578i2;
            builder.setInsertionMarkerLocation(fM8920k, f11, f12, f12, i11);
        }
        if (z10) {
            C3581L c3581l = c6045c.f19684c;
            int iM4270f2 = c3581l != null ? C3581L.m4270f(c3581l.f10908a) : -1;
            int iM4269e = c3581l != null ? C3581L.m4269e(c3581l.f10908a) : -1;
            if (iM4270f2 >= 0 && iM4270f2 < iM4269e) {
                builder.setComposingText(iM4270f2, c6045c.f19682a.f10934Y.subSequence(iM4270f2, iM4269e));
                InterfaceC6073v interfaceC6073v2 = interfaceC6073v;
                int iMo1766b2 = interfaceC6073v2.mo1766b(iM4270f2);
                int iMo1766b3 = interfaceC6073v2.mo1766b(iM4269e);
                float[] fArr2 = new float[(iMo1766b3 - iMo1766b2) * 4];
                c3578i.f10893b.m4309a(AbstractC8676n.m9365b(iMo1766b2, iMo1766b3), fArr2);
                while (iM4270f2 < iM4269e) {
                    int iMo1766b4 = interfaceC6073v2.mo1766b(iM4270f2);
                    int i12 = (iMo1766b4 - iMo1766b2) * 4;
                    float f13 = fArr2[i12];
                    int i13 = iM4269e;
                    float f14 = fArr2[i12 + 1];
                    InterfaceC6073v interfaceC6073v3 = interfaceC6073v2;
                    float f15 = fArr2[i12 + 2];
                    float f16 = fArr2[i12 + 3];
                    int i14 = iMo1766b2;
                    int i15 = (c13801c3.f43588c <= f13 || f15 <= c13801c3.f43586a || c13801c3.f43589d <= f14 || f16 <= c13801c3.f43587b) ? 0 : 1;
                    if (!AbstractC21627m.m21964l(c13801c3, f13, f14) || !AbstractC21627m.m21964l(c13801c3, f15, f16)) {
                        i15 |= 2;
                    }
                    if (c3578i.m4251a(iMo1766b4) == enumC7198h) {
                        i15 |= 4;
                    }
                    builder.addCharacterBounds(iM4270f2, f13, f14, f15, f16, i15);
                    iM4270f2++;
                    fArr2 = fArr2;
                    iM4269e = i13;
                    interfaceC6073v2 = interfaceC6073v3;
                    iMo1766b2 = i14;
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33 && z11) {
            AbstractC21645v.m21994a(builder, c13801c4);
        }
        if (i16 >= 34 && z12) {
            AbstractC21647w.m21995a(builder, c3578i, c13801c3);
        }
        c21585h.m21930t().updateCursorAnchorInfo(view, builder.build());
        this.f68357e = false;
    }
}
