package p1139z0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p080D0.AbstractC1807h0;
import p1068vo.C20659i;
import p1095x1.InterfaceC21098s;
import p1116y0.C21353b;
import p204I1.C3578I;
import p204I1.C3581L;
import p467T1.EnumC7198h;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14328F;

/* JADX INFO: renamed from: z0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C21651y {

    /* JADX INFO: renamed from: a */
    public final C21582E0 f68607a;

    /* JADX INFO: renamed from: b */
    public final C21574A0 f68608b;

    /* JADX INFO: renamed from: c */
    public final C20659i f68609c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0571F f68610d;

    /* JADX INFO: renamed from: e */
    public C0564B0 f68611e;

    /* JADX INFO: renamed from: f */
    public boolean f68612f;

    /* JADX INFO: renamed from: g */
    public boolean f68613g;

    /* JADX INFO: renamed from: h */
    public boolean f68614h;

    /* JADX INFO: renamed from: i */
    public boolean f68615i;

    /* JADX INFO: renamed from: j */
    public final CursorAnchorInfo.Builder f68616j = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: k */
    public final float[] f68617k = C14328F.m15602a();

    /* JADX INFO: renamed from: l */
    public final Matrix f68618l = new Matrix();

    public C21651y(C21582E0 c21582e0, C21574A0 c21574a0, C20659i c20659i, InterfaceC0571F interfaceC0571F) {
        this.f68607a = c21582e0;
        this.f68608b = c21574a0;
        this.f68609c = c20659i;
        this.f68610d = interfaceC0571F;
    }

    /* JADX INFO: renamed from: a */
    public final CursorAnchorInfo m21997a() {
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098s2;
        C3578I c3578iM21849b;
        C21574A0 c21574a0 = this.f68608b;
        InterfaceC21098s interfaceC21098sM21851d = c21574a0.m21851d();
        if (interfaceC21098sM21851d != null) {
            if (!interfaceC21098sM21851d.mo21522h()) {
                interfaceC21098sM21851d = null;
            }
            if (interfaceC21098sM21851d != null && (interfaceC21098s = (InterfaceC21098s) c21574a0.f68317e.getValue()) != null) {
                if (!interfaceC21098s.mo21522h()) {
                    interfaceC21098s = null;
                }
                if (interfaceC21098s != null && (interfaceC21098s2 = (InterfaceC21098s) c21574a0.f68318f.getValue()) != null) {
                    if (!interfaceC21098s2.mo21522h()) {
                        interfaceC21098s2 = null;
                    }
                    if (interfaceC21098s2 == null || (c3578iM21849b = c21574a0.m21849b()) == null) {
                        return null;
                    }
                    C21353b c21353bM21881c = this.f68607a.m21881c();
                    float[] fArr = this.f68617k;
                    C14328F.m15605d(fArr);
                    interfaceC21098sM21851d.mo21523j(fArr);
                    Matrix matrix = this.f68618l;
                    AbstractC14334L.m15648z(matrix, fArr);
                    C13801c c13801cM15326m = AbstractC1807h0.m2611F(interfaceC21098s).m15326m(interfaceC21098sM21851d.mo21521e(interfaceC21098s, 0L));
                    C13801c c13801cM15326m2 = AbstractC1807h0.m2611F(interfaceC21098s2).m15326m(interfaceC21098sM21851d.mo21521e(interfaceC21098s2, 0L));
                    long j10 = c21353bM21881c.f67818Z;
                    boolean z6 = this.f68612f;
                    boolean z10 = this.f68613g;
                    boolean z11 = this.f68614h;
                    boolean z12 = this.f68615i;
                    CursorAnchorInfo.Builder builder = this.f68616j;
                    builder.reset();
                    builder.setMatrix(matrix);
                    int iM4270f = C3581L.m4270f(j10);
                    builder.setSelectionRange(iM4270f, C3581L.m4269e(j10));
                    EnumC7198h enumC7198h = EnumC7198h.f22860Z;
                    if (z6 && iM4270f >= 0) {
                        C13801c c13801cM4253c = c3578iM21849b.m4253c(iM4270f);
                        float fM8920k = AbstractC8301I.m8920k(c13801cM4253c.f43586a, 0.0f, (int) (c3578iM21849b.f10894c >> 32));
                        boolean zM21964l = AbstractC21627m.m21964l(c13801cM15326m, fM8920k, c13801cM4253c.f43587b);
                        boolean zM21964l2 = AbstractC21627m.m21964l(c13801cM15326m, fM8920k, c13801cM4253c.f43589d);
                        boolean z13 = c3578iM21849b.m4251a(iM4270f) == enumC7198h;
                        int i10 = (zM21964l || zM21964l2) ? 1 : 0;
                        if (!zM21964l || !zM21964l2) {
                            i10 |= 2;
                        }
                        int i11 = z13 ? i10 | 4 : i10;
                        float f10 = c13801cM4253c.f43587b;
                        float f11 = c13801cM4253c.f43589d;
                        builder.setInsertionMarkerLocation(fM8920k, f10, f11, f11, i11);
                    }
                    if (z10) {
                        C3581L c3581l = c21353bM21881c.f67819o0;
                        int iM4270f2 = c3581l != null ? C3581L.m4270f(c3581l.f10908a) : -1;
                        int iM4269e = c3581l != null ? C3581L.m4269e(c3581l.f10908a) : -1;
                        if (iM4270f2 >= 0 && iM4270f2 < iM4269e) {
                            builder.setComposingText(iM4270f2, c21353bM21881c.f67817Y.subSequence(iM4270f2, iM4269e));
                            float[] fArr2 = new float[(iM4269e - iM4270f2) * 4];
                            c3578iM21849b.f10893b.m4309a(AbstractC8676n.m9365b(iM4270f2, iM4269e), fArr2);
                            int i12 = iM4270f2;
                            while (i12 < iM4269e) {
                                int i13 = (i12 - iM4270f2) * 4;
                                float f12 = fArr2[i13];
                                float f13 = fArr2[i13 + 1];
                                float f14 = fArr2[i13 + 2];
                                float f15 = fArr2[i13 + 3];
                                int i14 = (c13801cM15326m.f43588c <= f12 || f14 <= c13801cM15326m.f43586a || c13801cM15326m.f43589d <= f13 || f15 <= c13801cM15326m.f43587b) ? 0 : 1;
                                if (!AbstractC21627m.m21964l(c13801cM15326m, f12, f13) || !AbstractC21627m.m21964l(c13801cM15326m, f14, f15)) {
                                    i14 |= 2;
                                }
                                float[] fArr3 = fArr2;
                                if (c3578iM21849b.m4251a(i12) == enumC7198h) {
                                    i14 |= 4;
                                }
                                builder.addCharacterBounds(i12, f12, f13, f14, f15, i14);
                                i12++;
                                fArr2 = fArr3;
                                iM4270f2 = iM4270f2;
                            }
                        }
                    }
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 33 && z11) {
                        AbstractC21645v.m21994a(builder, c13801cM15326m2);
                    }
                    if (i15 >= 34 && z12) {
                        AbstractC21647w.m21995a(builder, c3578iM21849b, c13801cM15326m);
                    }
                    return builder.build();
                }
            }
        }
        return null;
    }
}
