package p544W9;

import android.content.Context;
import android.opengl.Matrix;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import kg.C16419y;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p124Ei.C2494b;
import p296Lk.C5110g;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p749fd.C13628m;
import p789hg.C14505d;
import p789hg.C14510i;
import p789hg.C14511j;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.G2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8482G2 {
    /* JADX INFO: renamed from: a */
    public static final void m9127a(InterfaceC10459q interfaceC10459q, VerifyPhoneViewModel verifyPhoneViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        VerifyPhoneViewModel verifyPhoneViewModel2;
        c6021p.m6526U(-1148472961);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            verifyPhoneViewModel2 = verifyPhoneViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C16419y.class));
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
                Object objMo5693b = c16527d.mo5693b(VerifyPhoneViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C16419y.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C16419y.class), c16527d.mo5693b(VerifyPhoneViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VerifyPhoneViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                verifyPhoneViewModel2 = (VerifyPhoneViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                verifyPhoneViewModel2 = verifyPhoneViewModel;
            }
            c6021p.m6554q();
            InterfaceC13515g interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
            c6021p.m6524S(-821416919);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = new C13522n();
                c6021p.m6537c0(objM6514H2);
            }
            C13522n c13522n = (C13522n) objM6514H2;
            c6021p.m6553p(false);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(-821413175);
            boolean zM6545h = c6021p.m6545h(verifyPhoneViewModel2) | c6021p.m6545h(c8870f) | c6021p.m6545h(interfaceC13515g);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C14510i(verifyPhoneViewModel2, c8870f, interfaceC13515g, c13522n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, verifyPhoneViewModel2);
            c6021p.m6524S(-821396539);
            boolean zM6545h2 = c6021p.m6545h(verifyPhoneViewModel2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h2 || objM6514H4 == obj) {
                objM6514H4 = new C14511j(verifyPhoneViewModel2, 2);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(-821394210);
            boolean zM6542f2 = c6021p.m6542f(interfaceC1426a);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f2 || objM6514H5 == obj) {
                objM6514H5 = new C14505d(2, interfaceC1426a);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 1, (InterfaceC1426a) objM6514H5, c6021p, false);
            C16419y c16419y = (C16419y) AbstractC9112C3.m9642d(verifyPhoneViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-821388183);
            boolean zM6545h3 = c6021p.m6545h(verifyPhoneViewModel2);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6545h3 || objM6514H6 == obj) {
                objM6514H6 = new C13628m(verifyPhoneViewModel2, 15);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H6;
            c6021p.m6553p(false);
            c6021p.m6524S(-821385503);
            boolean zM6545h4 = c6021p.m6545h(verifyPhoneViewModel2);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6545h4 || objM6514H7 == obj) {
                objM6514H7 = new C14511j(verifyPhoneViewModel2, 0);
                c6021p.m6537c0(objM6514H7);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H7;
            c6021p.m6553p(false);
            c6021p.m6524S(-821383135);
            boolean zM6545h5 = c6021p.m6545h(verifyPhoneViewModel2);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h5 || objM6514H8 == obj) {
                objM6514H8 = new C14511j(verifyPhoneViewModel2, 1);
                c6021p.m6537c0(objM6514H8);
            }
            c6021p.m6553p(false);
            m9128b(c13522n, c16419y, interfaceC1436k, interfaceC1426a2, (InterfaceC1426a) objM6514H8, interfaceC1426a, interfaceC10459q2, c6021p, ((i11 << 18) & 3670016) | 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, verifyPhoneViewModel2, i10, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9128b(C13522n c13522n, C16419y c16419y, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-947023618);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c13522n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c16419y) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a3) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8106i0.m8586a(interfaceC10459q, AbstractC8142m4.m8676d(R.string.onboarding_verify_phone_title, c6021p), null, null, null, interfaceC1426a3, null, null, AbstractC8411c.m8969c(1026343009, c6021p, new C2494b(c16419y, c13522n, interfaceC1436k, interfaceC1426a, interfaceC1426a2)), c6021p, ((i11 >> 18) & 14) | 100663296 | (i11 & 458752), 220);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5110g(c13522n, c16419y, interfaceC1436k, interfaceC1426a, interfaceC1426a2, interfaceC1426a3, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9129c(float[] fArr, float f10) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static void m9130d(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
