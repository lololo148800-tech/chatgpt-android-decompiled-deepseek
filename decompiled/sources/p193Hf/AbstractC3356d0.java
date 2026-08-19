package p193Hf;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import java.util.WeakHashMap;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p002A0.C0130g;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.C0248f0;
import p025An.C0644w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21098s;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3756d;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4033c3;
import p229J0.C3949M0;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8571V2;
import p544W9.AbstractC8577W2;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9227W;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13801c;
import p795i.C14893g;
import p859l.C16652c;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;
import p911o0.C17718B0;
import p911o0.C17756f;
import p911o0.C17791w0;
import ye.C21514c;
import ye.C21525n;

/* JADX INFO: renamed from: Hf.d0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3356d0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10249a = 0;

    static {
        AbstractC9227W.m9800c(C3367h.f10282r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX INFO: renamed from: a */
    public static final void m4180a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        Object obj;
        Object obj2;
        boolean z6;
        InterfaceC21098s interfaceC21098s;
        String str;
        ?? r13;
        Object obj3;
        boolean z10;
        C5996c0 c5996c0;
        Object obj4;
        Object obj5;
        InterfaceC10459q interfaceC10459q2;
        Object obj6;
        Object obj7;
        c6021p.m6526U(1524265372);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3420z0.class));
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
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(CanmoreViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C3420z0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3420z0.class), c16527d.mo5693b(CanmoreViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                BaseViewModel baseViewModelM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CanmoreViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(baseViewModelM14398a);
                obj = baseViewModelM14398a;
            }
            BaseViewModel baseViewModel = (BaseViewModel) obj;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CanmoreViewModel canmoreViewModel = (CanmoreViewModel) baseViewModel;
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(canmoreViewModel.f40343c, c6021p);
            C21525n c21525n = ((C3420z0) interfaceC5985XM9642d.getValue()).f10420e.f68137f;
            if (c21525n == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C1282x(c10456n, i10, 8);
                    return;
                }
                return;
            }
            String str2 = c21525n.f68169b;
            if (str2 == null) {
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C1282x(c10456n, i10, 7);
                    return;
                }
                return;
            }
            c6021p.m6524S(-558966249);
            Object objM6514H2 = c6021p.m6514H();
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H2 == c5975s) {
                obj2 = objM6514H2;
                C6002f0 c6002f0M6430Q = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(c6002f0M6430Q);
                obj2 = c6002f0M6430Q;
            }
            obj2 = objM6514H2;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj2;
            Object objM530s = AbstractC0168G.m530s(-558964325, c6021p, false);
            Object obj8 = objM530s;
            if (objM530s == c5975s) {
                C3418y0 c3418y0 = new C3418y0();
                c6021p.m6537c0(c3418y0);
                obj8 = c3418y0;
            }
            C3418y0 c3418y1 = (C3418y0) obj8;
            c6021p.m6553p(false);
            C3337V0 c3337v0M4171b = AbstractC3333T0.m4171b(c6021p);
            c6021p.m6524S(-558960553);
            Object objM6514H3 = c6021p.m6514H();
            Object obj9 = objM6514H3;
            if (objM6514H3 == c5975s) {
                C5944C c5944cM6421H = C5997d.m6421H(new C0130g(c3418y1, 27));
                c6021p.m6537c0(c5944cM6421H);
                obj9 = c5944cM6421H;
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) obj9;
            Object objM530s2 = AbstractC0168G.m530s(-558957769, c6021p, false);
            Object obj10 = objM530s2;
            if (objM530s2 == c5975s) {
                C5996c0 c5996c0M6429P = C5997d.m6429P(0);
                c6021p.m6537c0(c5996c0M6429P);
                obj10 = c5996c0M6429P;
            }
            C5996c0 c5996c1 = (C5996c0) obj10;
            c6021p.m6553p(false);
            c6021p.m6524S(-558956381);
            if (((C3420z0) interfaceC5985XM9642d.getValue()).f10420e.f68134c) {
                c6021p.m6524S(-558954558);
                boolean zM6542f2 = c6021p.m6542f(canmoreViewModel);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6542f2 || objM6514H4 == c5975s) {
                    obj7 = objM6514H4;
                    C0130g c0130g = new C0130g(canmoreViewModel, 26);
                    c6021p.m6537c0(c0130g);
                    obj7 = c0130g;
                }
                z6 = false;
                c6021p.m6553p(false);
                AbstractC8577W2.m9239a(0, 1, (InterfaceC1426a) obj7, c6021p, false);
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            C21525n c21525n2 = ((C3420z0) interfaceC5985XM9642d.getValue()).f10420e.f68135d;
            if (c21525n2 == null || (interfaceC21098s = c21525n2.f68170c) == null || !interfaceC21098s.mo21522h()) {
                interfaceC21098s = null;
            }
            c6021p.m6524S(-558946212);
            Object objM6514H5 = c6021p.m6514H();
            Object obj11 = objM6514H5;
            if (objM6514H5 == c5975s) {
                C6002f0 c6002f0M6430Q2 = C5997d.m6430Q(C13801c.f43585e, c5975s2);
                c6021p.m6537c0(c6002f0M6430Q2);
                obj11 = c6002f0M6430Q2;
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) obj11;
            Object objM530s3 = AbstractC0168G.m530s(-558944392, c6021p, false);
            Object obj12 = objM530s3;
            if (objM530s3 == c5975s) {
                C6002f0 c6002f0M6430Q3 = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                c6021p.m6537c0(c6002f0M6430Q3);
                obj12 = c6002f0M6430Q3;
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) obj12;
            c6021p.m6553p(false);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(-558940009);
            Object objM6514H6 = c6021p.m6514H();
            Object obj13 = objM6514H6;
            if (objM6514H6 == c5975s) {
                C6002f0 c6002f0M6430Q4 = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(c6002f0M6430Q4);
                obj13 = c6002f0M6430Q4;
            }
            InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) obj13;
            c6021p.m6553p(false);
            C3385n c3385n = (C3385n) interfaceC5985X4.getValue();
            if (c3385n == null || (str = c3385n.f10324c) == null) {
                str = "text/plain";
            }
            C16652c c16652c = new C16652c(str);
            c6021p.m6524S(-558932999);
            boolean zM6542f3 = c6021p.m6542f(canmoreViewModel);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6542f3 || objM6514H7 == c5975s) {
                r13 = 0;
                C3350b0 c3350b0 = new C3350b0(canmoreViewModel, false ? 1 : 0, interfaceC5985X4);
                c6021p.m6537c0(c3350b0);
                obj3 = c3350b0;
            } else {
                r13 = 0;
                obj3 = objM6514H7;
            }
            c6021p.m6553p(r13);
            C14893g c14893gM9235b = AbstractC8571V2.m9235b(c16652c, (InterfaceC1436k) obj3, c6021p, r13);
            c6021p.m6524S(-558923671);
            if (((Boolean) interfaceC5982V0.getValue()).booleanValue()) {
                z10 = false;
            } else {
                C17296C c17296c = C17296C.f55119a;
                c6021p.m6524S(-558922065);
                boolean zM6542f4 = c6021p.m6542f(c3337v0M4171b);
                Object objM6514H8 = c6021p.m6514H();
                if (zM6542f4 || objM6514H8 == c5975s) {
                    obj6 = objM6514H8;
                    C3334U c3334u = new C3334U(c3337v0M4171b, null);
                    c6021p.m6537c0(c3334u);
                    obj6 = c3334u;
                }
                z10 = false;
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) obj6, c6021p, c17296c);
            }
            c6021p.m6553p(z10);
            c6021p.m6524S(-558918450);
            boolean zM6545h = c6021p.m6545h(interfaceC21098s);
            Object objM6514H9 = c6021p.m6514H();
            Object obj14 = objM6514H9;
            if (zM6545h || objM6514H9 == c5975s) {
                C3336V c3336v = new C3336V(interfaceC21098s, interfaceC5985X, interfaceC5985X2, null);
                c6021p.m6537c0(c3336v);
                obj14 = c3336v;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) obj14, c6021p, interfaceC21098s);
            Boolean boolValueOf = Boolean.valueOf(((C3420z0) interfaceC5985XM9642d.getValue()).f10420e.f68134c);
            c6021p.m6524S(-558912793);
            boolean zM6542f5 = c6021p.m6542f(interfaceC5985XM9642d) | c6021p.m6545h(c3418y1);
            Object objM6514H10 = c6021p.m6514H();
            if (zM6542f5 || objM6514H10 == c5975s) {
                C3338W c3338w = new C3338W(c3418y1, interfaceC5985XM9642d, interfaceC5985X2, interfaceC5985X, null);
                c6021p.m6537c0(c3338w);
                objM6514H10 = c3338w;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H10, c6021p, boolValueOf);
            C21514c c21514c = new C21514c(str2);
            CanmoreViewModelImpl canmoreViewModelImpl = (CanmoreViewModelImpl) canmoreViewModel;
            c6021p.m6524S(-558903999);
            boolean zM6542f6 = c6021p.m6542f(canmoreViewModel) | c6021p.m6542f(str2);
            Object objM6514H11 = c6021p.m6514H();
            if (zM6542f6 || objM6514H11 == c5975s) {
                c5996c0 = c5996c1;
                C3344Z c3344z = new C3344Z(canmoreViewModel, str2, c5996c0, null);
                c6021p.m6537c0(c3344z);
                obj4 = c3344z;
            } else {
                c5996c0 = c5996c1;
                obj4 = objM6514H11;
            }
            c6021p.m6553p(false);
            C5997d.m6451g(c21514c, canmoreViewModelImpl.f38871o, (InterfaceC1439n) obj4, c6021p);
            FillElement fillElement = AbstractC10844c.f32512c;
            c6021p.m6524S(-558894480);
            Object objM6514H12 = c6021p.m6514H();
            Object obj15 = objM6514H12;
            if (objM6514H12 == c5975s) {
                C0248f0 c0248f0 = new C0248f0(interfaceC5985X, 14);
                c6021p.m6537c0(c0248f0);
                obj15 = c0248f0;
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(fillElement, (InterfaceC1436k) obj15);
            long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A;
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            c6021p.m6524S(970923500);
            c6021p.m6524S(-213476179);
            boolean zM6545h2 = c6021p.m6545h(c3418y1) | c6021p.m6542f(interfaceC7537b);
            Object objM6514H13 = c6021p.m6514H();
            if (zM6545h2 || objM6514H13 == c5975s) {
                C3350b0 c3350b1 = new C3350b0(c3418y1, 1, interfaceC7537b);
                c6021p.m6537c0(c3350b1);
                obj5 = c3350b1;
            } else {
                obj5 = objM6514H13;
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(interfaceC10459qM11318d, (InterfaceC1436k) obj5);
            c6021p.m6524S(-213467981);
            boolean zM6540e = c6021p.m6540e(j10) | c6021p.m6545h(c3418y1) | c6021p.m6542f(interfaceC7537b);
            Object objM6514H14 = c6021p.m6514H();
            Object obj16 = objM6514H14;
            if (zM6540e || objM6514H14 == c5975s) {
                C3353c0 c3353c0 = new C3353c0(j10, c3418y1, interfaceC7537b, 0);
                c6021p.m6537c0(c3353c0);
                obj16 = c3353c0;
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(interfaceC10459qM11305a, (InterfaceC1436k) obj16);
            c6021p.m6553p(false);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11297c);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
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
            WeakHashMap weakHashMap = C17718B0.f56555v;
            C17718B0 c17718b0M19480f = C17756f.m19480f(c6021p);
            WeakHashMap weakHashMap2 = C17718B0.f56555v;
            AbstractC4033c3.m4723a(null, null, null, null, null, 0, 0L, 0L, new C17791w0(c17718b0M19480f.f56562g, C17756f.m19480f(c6021p).f56558c), AbstractC8411c.m8969c(-1949014287, c6021p, new C3347a0(c3418y1, c21525n, c3337v0M4171b, str2, canmoreViewModel, c14893gM9235b, c8870f, interfaceC5985X3, c5996c0, interfaceC5985X4)), c6021p, 805306368, 255);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r3 = c6021p.m6555r();
        if (c6018n0M6555r3 != null) {
            c6018n0M6555r3.f19536d = new C1282x(interfaceC10459q2, i10, 6);
        }
    }
}
