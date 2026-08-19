package p544W9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.impl.textselection.TextSelectionViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p017Af.C0468O;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p243Jf.C4334d;
import p243Jf.C4336f;
import p246Ji.C4364d;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p637a3.C10485b;
import p637a3.InterfaceC10497n;
import p776h3.C14387a;
import p776h3.C14388b;
import p776h3.C14390d;
import p776h3.C14391e;
import p776h3.C14392f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8491I {
    /* JADX INFO: renamed from: a */
    public static final void m9150a(InterfaceC10497n interfaceC10497n, int i10, int i11, C8410b c8410b, C6021p c6021p, int i12) {
        int i13;
        c6021p.m6526U(-1883910253);
        if ((i12 & 6) == 0) {
            i13 = (c6021p.m6542f(interfaceC10497n) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c6021p.m6538d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c6021p.m6542f(c8410b) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C14390d c14390d = C14390d.f45119Y;
            c6021p.m6525T(578571862);
            c6021p.m6525T(-548224868);
            if (!(c6021p.f19565a instanceof C10485b)) {
                C5997d.m6425L();
                throw null;
            }
            c6021p.m6522Q();
            if (c6021p.f19563O) {
                c6021p.m6549l(c14390d);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C14391e.f45120Z, c6021p, interfaceC10497n);
            C5997d.m6439Z(C14391e.f45121o0, c6021p, new C14387a(i11));
            C5997d.m6439Z(C14391e.f45122p0, c6021p, new C14388b(i10));
            c8410b.invoke(C14392f.f45128a, c6021p, Integer.valueOf(((i13 >> 6) & 112) | 6));
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4364d(interfaceC10497n, i10, i11, c8410b, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9151b(TextSelectionViewModel textSelectionViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(2078054189);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C4336f.class));
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
                Object objMo5693b = c16527d.mo5693b(TextSelectionViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C4336f.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C4336f.class), c16527d.mo5693b(TextSelectionViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(TextSelectionViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                textSelectionViewModel = (TextSelectionViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            AbstractC8662k3.m9350a(null, null, 0L, AbstractC8411c.m8969c(-1311298794, c6021p, new C4334d((C8870f) c6021p.m6548k(AbstractC8873i.f27157a), 1)), false, AbstractC8411c.m8969c(-958262415, c6021p, new C0468O((C4336f) AbstractC9112C3.m9642d(textSelectionViewModel.f40343c, c6021p).getValue(), 12)), c6021p, 199680, 23);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(textSelectionViewModel, i10, 9);
        }
    }
}
