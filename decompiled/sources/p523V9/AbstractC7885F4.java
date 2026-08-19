package p523V9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0257i0;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p1014t1.AbstractC19736m;
import p1014t1.C19726c;
import p1014t1.C19738o;
import p1030u1.C20094a;
import p1030u1.C20096c;
import p1030u1.C20097d;
import p1140z1.AbstractC21690f;
import p1140z1.C21715t;
import p122Eg.C2433b;
import p122Eg.C2436e;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p693d1.C12992e;
import p759g1.C13800b;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: V9.F4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7885F4 {
    /* JADX INFO: renamed from: a */
    public static final void m8173a(InterfaceC10459q interfaceC10459q, SunsetViewModel sunsetViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        SunsetViewModel sunsetViewModel2;
        c6021p.m6526U(1027324597);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            sunsetViewModel2 = sunsetViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2436e.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(SunsetViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C2436e.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2436e.class), c16527d.mo5693b(SunsetViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SunsetViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                sunsetViewModel2 = (SunsetViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                sunsetViewModel2 = sunsetViewModel;
            }
            c6021p.m6554q();
            int i13 = (i11 & 14) | 196608;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, null, false, AbstractC8411c.m8969c(-945963279, c6021p, new C2433b((C2436e) AbstractC9112C3.m9642d(sunsetViewModel2.f40343c, c6021p).getValue(), sunsetViewModel2, 1)), c6021p, i13, 30);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, sunsetViewModel2, i10, 13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8174b(C12992e c12992e, long j10) {
        if (!c12992e.f30960Y.f30972y0) {
            return false;
        }
        C21715t c21715t = (C21715t) AbstractC21690f.m22217v(c12992e).f68638I0.f3468c;
        if (!c21715t.f68892W0.f30972y0) {
            return false;
        }
        long j11 = c21715t.f66983o0;
        long jMo21517D = c21715t.mo21517D(0L);
        float fM15306g = C13800b.m15306g(jMo21517D);
        float fM15307h = C13800b.m15307h(jMo21517D);
        float f10 = ((int) (j11 >> 32)) + fM15306g;
        float f11 = ((int) (j11 & 4294967295L)) + fM15307h;
        float fM15306g2 = C13800b.m15306g(j10);
        if (fM15306g > fM15306g2 || fM15306g2 > f10) {
            return false;
        }
        float fM15307h2 = C13800b.m15307h(j10);
        return fM15307h <= fM15307h2 && fM15307h2 <= f11;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8175c(C20097d c20097d, C19738o c19738o) {
        if (AbstractC19736m.m20679a(c19738o)) {
            C20096c c20096c = c20097d.f63634a;
            C20094a[] c20094aArr = c20096c.f63629d;
            AbstractC17678l.m19311r(c20094aArr, null, 0, c20094aArr.length);
            c20096c.f63630e = 0;
            C20096c c20096c2 = c20097d.f63635b;
            C20094a[] c20094aArr2 = c20096c2.f63629d;
            AbstractC17678l.m19311r(c20094aArr2, null, 0, c20094aArr2.length);
            c20096c2.f63630e = 0;
            c20097d.f63636c = 0L;
        }
        boolean zM20681c = AbstractC19736m.m20681c(c19738o);
        long j10 = c19738o.f62479b;
        if (!zM20681c) {
            List list = c19738o.f62488k;
            if (list == null) {
                list = C17689w.f56480Y;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C19726c c19726c = (C19726c) list.get(i10);
                c20097d.m20928a(c19726c.f62448a, c19726c.f62450c);
            }
            c20097d.m20928a(j10, c19738o.f62489l);
        }
        if (AbstractC19736m.m20681c(c19738o) && j10 - c20097d.f63636c > 40) {
            C20096c c20096c3 = c20097d.f63634a;
            C20094a[] c20094aArr3 = c20096c3.f63629d;
            AbstractC17678l.m19311r(c20094aArr3, null, 0, c20094aArr3.length);
            c20096c3.f63630e = 0;
            C20096c c20096c4 = c20097d.f63635b;
            C20094a[] c20094aArr4 = c20096c4.f63629d;
            AbstractC17678l.m19311r(c20094aArr4, null, 0, c20094aArr4.length);
            c20096c4.f63630e = 0;
            c20097d.f63636c = 0L;
        }
        c20097d.f63636c = j10;
    }

    /* JADX INFO: renamed from: d */
    public static final float m8176d(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8177e(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            AbstractC8111i5.m8591b("At least one point must be provided");
            throw null;
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] destination = fArr5[i18];
            float[] fArr7 = fArr4[i18];
            AbstractC16544l.m18094g(fArr7, "<this>");
            AbstractC16544l.m18094g(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr8 = fArr5[i19];
                float fM8176d = m8176d(destination, fArr8);
                for (int i20 = 0; i20 < i10; i20++) {
                    destination[i20] = destination[i20] - (fArr8[i20] * fM8176d);
                }
            }
            float fSqrt = (float) Math.sqrt(m8176d(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                destination[i21] = destination[i21] * f10;
            }
            float[] fArr9 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr9[i22] = i22 < i18 ? 0.0f : m8176d(destination, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fM8176d2 = m8176d(fArr5[i23], fArr2);
            float[] fArr10 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fM8176d2 -= fArr10[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fM8176d2 / fArr10[i23];
        }
    }
}
