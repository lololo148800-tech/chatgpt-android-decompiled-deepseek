package p571X9;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.settings.impl.language.AppLocaleViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mo.C17341h;
import mo.C17347n;
import mo.EnumC17331H;
import no.AbstractC17708b;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0227a;
import p025An.C0644w;
import p042Bf.C1267i;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p229J0.AbstractC3914G1;
import p292Lg.C5034f;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p383Pg.AbstractC6407d;
import p383Pg.C6405b;
import p383Pg.C6408e;
import p383Pg.C6409f;
import p383Pg.C6410g;
import p482Tg.EnumC7465v;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9769M3;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: X9.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9264c0 {
    /* JADX INFO: renamed from: a */
    public static final void m9838a(EnumC7465v enumC7465v, Context context, InterfaceC10459q interfaceC10459q, AppLocaleViewModel appLocaleViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        Object objM14398a;
        int i12;
        InterfaceC10459q interfaceC10459q2;
        AppLocaleViewModel appLocaleViewModel2;
        int i13;
        boolean z6;
        InterfaceC10459q interfaceC10459q3;
        AppLocaleViewModel appLocaleViewModel3;
        AbstractC16544l.m18094g(context, "context");
        c6021p.m6526U(2088569548);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC7465v) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(context) ? 32 : 16;
        }
        int i14 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i14 = i11 | 1408;
        }
        if ((i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            appLocaleViewModel3 = appLocaleViewModel;
        } else {
            c6021p.m6519N();
            int i15 = i10 & 1;
            Object obj = C6013l.f19514a;
            boolean z10 = true;
            if (i15 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6405b.class));
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
                Object objMo5693b = c16527d.mo5693b(AppLocaleViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6405b.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6405b.class), c16527d.mo5693b(AppLocaleViewModel.class), context2, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AppLocaleViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                } else {
                    objM14398a = objM6514H;
                    z10 = true;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
                i12 = 0;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                appLocaleViewModel2 = (AppLocaleViewModel) baseViewModel;
                i13 = i14 & (-7169);
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                appLocaleViewModel2 = appLocaleViewModel;
                i13 = i14 & (-7169);
                i12 = 0;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(appLocaleViewModel2.f40343c, c6021p);
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[i12], null, null, C6410g.f20850Y, c6021p, 3072, 6);
            Object obj2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(1452413387);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                ArrayList arrayList = ((C6405b) interfaceC5985XM9642d.getValue()).f20838a;
                C6408e c6408e = ((C6405b) interfaceC5985XM9642d.getValue()).f20839b;
                C6409f c6409f = C6409f.f20849Y;
                c6021p.m6524S(1452423038);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C6207k(interfaceC5985X, 2);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(1452424871);
                boolean zM6542f3 = c6021p.m6542f(appLocaleViewModel2) | ((i13 & 14) == 4 ? z10 : false);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj) {
                    objM6514H3 = new C5034f(appLocaleViewModel2, 14, enumC7465v);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                z6 = false;
                AbstractC9769M3.m10374a(arrayList, c6409f, c6408e, interfaceC1426a, (InterfaceC1436k) objM6514H3, null, AbstractC6407d.f20844a, c6021p, 1572864, 32);
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            C8410b c8410b = AbstractC6407d.f20845b;
            c6021p.m6524S(1452432192);
            boolean zM6545h = c6021p.m6545h(obj2) | ((i13 & 14) == 4 ? z10 : z6) | c6021p.m6542f(interfaceC5985X);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                objM6514H4 = new C0155B1(obj2, enumC7465v, interfaceC5985X, 26);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(z6);
            AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(interfaceC10459q2, z6, null, (InterfaceC1426a) objM6514H4, 7), null, AbstractC8411c.m8969c(2035043757, c6021p, new C0227a(context, 19)), AbstractC6407d.f20846c, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
            interfaceC10459q3 = interfaceC10459q2;
            appLocaleViewModel3 = appLocaleViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(enumC7465v, context, interfaceC10459q3, appLocaleViewModel3, i10, 13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17347n m9839b(SSLSession sSLSession) throws IOException {
        List listM19421m;
        List listM19421m2 = C17689w.f56480Y;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C17341h c17341hM18999d = C17341h.f55232b.m18999d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC17331H enumC17331HM9686a = AbstractC9141H2.m9686a(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listM19421m = peerCertificates != null ? AbstractC17708b.m19421m(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listM19421m2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM19421m2 = AbstractC17708b.m19421m(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C17347n(enumC17331HM9686a, c17341hM18999d, listM19421m2, new C1267i(6, listM19421m));
    }
}
