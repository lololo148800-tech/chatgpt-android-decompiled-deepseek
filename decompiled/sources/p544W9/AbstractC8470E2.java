package p544W9;

import af.C10561Q;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.onboarding.impl.viewmodel.OnboardingLoadingViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import kg.C16405k;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3980S2;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8072d6;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: W9.E2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8470E2 {
    /* JADX INFO: renamed from: a */
    public static final void m9100a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-595734366);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C16405k.class));
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
            Object objMo5693b = c16527d.mo5693b(OnboardingLoadingViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C16405k.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C16405k.class), c16527d.mo5693b(OnboardingLoadingViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(OnboardingLoadingViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(interfaceC10459q2, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m9101b(int i10, int i11, boolean z6) {
        int i12 = z6 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (AbstractC8072d6.m8490g(2, AbstractC8072d6.m8491h("CameraOrientationUtil"))) {
            StringBuilder sbM21e = AbstractC0010F.m21e("getRelativeImageRotation: destRotationDegrees=", i10, ", sourceRotationDegrees=", i11, ", isOppositeFacing=");
            sbM21e.append(z6);
            sbM21e.append(", result=");
            sbM21e.append(i12);
            AbstractC8072d6.m8486c("CameraOrientationUtil", sbM21e.toString());
        }
        return i12;
    }

    /* JADX INFO: renamed from: c */
    public static int m9102c(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unsupported surface rotation: "));
    }
}
