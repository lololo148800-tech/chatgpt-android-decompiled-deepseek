package p350O1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p650ui.platform.AndroidComposeView;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0240d0;
import p204I1.C3578I;
import p204I1.C3581L;
import p467T1.EnumC7198h;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p544W9.AbstractC8741x4;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14328F;

/* JADX INFO: renamed from: O1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6056e {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f19721a;

    /* JADX INFO: renamed from: b */
    public final C13711h f19722b;

    /* JADX INFO: renamed from: d */
    public boolean f19724d;

    /* JADX INFO: renamed from: e */
    public boolean f19725e;

    /* JADX INFO: renamed from: f */
    public boolean f19726f;

    /* JADX INFO: renamed from: g */
    public boolean f19727g;

    /* JADX INFO: renamed from: h */
    public boolean f19728h;

    /* JADX INFO: renamed from: i */
    public boolean f19729i;

    /* JADX INFO: renamed from: j */
    public C6045C f19730j;

    /* JADX INFO: renamed from: k */
    public C3578I f19731k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6073v f19732l;

    /* JADX INFO: renamed from: n */
    public C13801c f19734n;

    /* JADX INFO: renamed from: o */
    public C13801c f19735o;

    /* JADX INFO: renamed from: c */
    public final Object f19723c = new Object();

    /* JADX INFO: renamed from: m */
    public AbstractC16546n f19733m = C6055d.f19714o0;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f19736p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f19737q = C14328F.m15602a();

    /* JADX INFO: renamed from: r */
    public final Matrix f19738r = new Matrix();

    public C6056e(AndroidComposeView androidComposeView, C13711h c13711h) {
        this.f19721a = androidComposeView;
        this.f19722b = c13711h;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public final void m6626a() {
        EnumC7198h enumC7198h;
        C13711h c13711h = this.f19722b;
        ?? r6 = c13711h.f43260o0;
        InputMethodManager inputMethodManager = (InputMethodManager) r6.getValue();
        View view = (View) c13711h.f43259Z;
        if (inputMethodManager.isActive(view)) {
            ?? r10 = this.f19733m;
            float[] fArr = this.f19737q;
            r10.invoke(new C14328F(fArr));
            AndroidComposeView androidComposeView = this.f19721a;
            androidComposeView.m11331B();
            C14328F.m15608g(fArr, androidComposeView.f32786a1);
            float fM15306g = C13800b.m15306g(androidComposeView.f32790e1);
            float fM15307h = C13800b.m15307h(androidComposeView.f32790e1);
            float[] fArr2 = androidComposeView.f32785Z0;
            C14328F.m15605d(fArr2);
            C14328F.m15609h(fArr2, fM15306g, fM15307h, 0.0f);
            AbstractC0240d0.m804o(fArr, fArr2);
            Matrix matrix = this.f19738r;
            AbstractC14334L.m15648z(matrix, fArr);
            C6045C c6045c = this.f19730j;
            AbstractC16544l.m18091d(c6045c);
            InterfaceC6073v interfaceC6073v = this.f19732l;
            AbstractC16544l.m18091d(interfaceC6073v);
            C3578I c3578i = this.f19731k;
            AbstractC16544l.m18091d(c3578i);
            C13801c c13801c = this.f19734n;
            AbstractC16544l.m18091d(c13801c);
            C13801c c13801c2 = this.f19735o;
            AbstractC16544l.m18091d(c13801c2);
            boolean z6 = this.f19726f;
            boolean z10 = this.f19727g;
            boolean z11 = this.f19728h;
            boolean z12 = this.f19729i;
            CursorAnchorInfo.Builder builder = this.f19736p;
            builder.reset();
            builder.setMatrix(matrix);
            long j10 = c6045c.f19683b;
            int iM4270f = C3581L.m4270f(j10);
            builder.setSelectionRange(iM4270f, C3581L.m4269e(j10));
            EnumC7198h enumC7198h2 = EnumC7198h.f22860Z;
            if (!z6 || iM4270f < 0) {
                enumC7198h = enumC7198h2;
            } else {
                int iMo1766b = interfaceC6073v.mo1766b(iM4270f);
                C13801c c13801cM4253c = c3578i.m4253c(iMo1766b);
                float fM8920k = AbstractC8301I.m8920k(c13801cM4253c.f43586a, 0.0f, (int) (c3578i.f10894c >> 32));
                boolean zM9483g = AbstractC8741x4.m9483g(c13801c, fM8920k, c13801cM4253c.f43587b);
                boolean zM9483g2 = AbstractC8741x4.m9483g(c13801c, fM8920k, c13801cM4253c.f43589d);
                boolean z13 = c3578i.m4251a(iMo1766b) == enumC7198h2;
                int i10 = (zM9483g || zM9483g2) ? 1 : 0;
                if (!zM9483g || !zM9483g2) {
                    i10 |= 2;
                }
                int i11 = z13 ? i10 | 4 : i10;
                float f10 = c13801cM4253c.f43587b;
                float f11 = c13801cM4253c.f43589d;
                enumC7198h = enumC7198h2;
                builder.setInsertionMarkerLocation(fM8920k, f10, f11, f11, i11);
            }
            if (z10) {
                C3581L c3581l = c6045c.f19684c;
                int iM4270f2 = c3581l != null ? C3581L.m4270f(c3581l.f10908a) : -1;
                int iM4269e = c3581l != null ? C3581L.m4269e(c3581l.f10908a) : -1;
                if (iM4270f2 >= 0 && iM4270f2 < iM4269e) {
                    builder.setComposingText(iM4270f2, c6045c.f19682a.f10934Y.subSequence(iM4270f2, iM4269e));
                    int iMo1766b2 = interfaceC6073v.mo1766b(iM4270f2);
                    int iMo1766b3 = interfaceC6073v.mo1766b(iM4269e);
                    float[] fArr3 = new float[(iMo1766b3 - iMo1766b2) * 4];
                    c3578i.f10893b.m4309a(AbstractC8676n.m9365b(iMo1766b2, iMo1766b3), fArr3);
                    while (iM4270f2 < iM4269e) {
                        int iMo1766b4 = interfaceC6073v.mo1766b(iM4270f2);
                        int i12 = (iMo1766b4 - iMo1766b2) * 4;
                        float f12 = fArr3[i12];
                        float f13 = fArr3[i12 + 1];
                        int i13 = iM4269e;
                        float f14 = fArr3[i12 + 2];
                        float f15 = fArr3[i12 + 3];
                        int i14 = iMo1766b2;
                        int i15 = (c13801c.f43588c <= f12 || f14 <= c13801c.f43586a || c13801c.f43589d <= f13 || f15 <= c13801c.f43587b) ? 0 : 1;
                        if (!AbstractC8741x4.m9483g(c13801c, f12, f13) || !AbstractC8741x4.m9483g(c13801c, f14, f15)) {
                            i15 |= 2;
                        }
                        if (c3578i.m4251a(iMo1766b4) == enumC7198h) {
                            i15 |= 4;
                        }
                        builder.addCharacterBounds(iM4270f2, f12, f13, f14, f15, i15);
                        iM4270f2++;
                        iM4269e = i13;
                        iMo1766b2 = i14;
                    }
                }
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 33 && z11) {
                AbstractC6053b.m6624a(builder, c13801c2);
            }
            if (i16 >= 34 && z12) {
                AbstractC6054c.m6625a(builder, c3578i, c13801c);
            }
            ((InputMethodManager) r6.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f19725e = false;
        }
    }
}
