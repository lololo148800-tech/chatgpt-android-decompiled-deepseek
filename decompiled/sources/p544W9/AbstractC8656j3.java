package p544W9;

import android.content.Context;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.data.C12484a;
import com.openai.feature.settings.impl.data.DataControlsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import io.sentry.vendor.gson.internal.bind.util.AbstractC15512a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p003A1.C0248f0;
import p003A1.C0257i0;
import p006A4.C0339D;
import p006A4.C0364y;
import p021Aj.C0537v;
import p025An.C0644w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1155zi.C21917G1;
import p1155zi.InterfaceC21925I1;
import p117Eb.C2392v;
import p124Ei.C2463L0;
import p204I1.C3590f;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p229J0.C4055g1;
import p292Lg.AbstractC5036h;
import p292Lg.C5052x;
import p292Lg.C5053y;
import p292Lg.C5054z;
import p349O0.AbstractC6012k0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9225V3;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9727F3;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9990w3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.j3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8656j3 {
    /* JADX INFO: renamed from: a */
    public static final void m9333a(InterfaceC10459q interfaceC10459q, DataControlsViewModel dataControlsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        DataControlsViewModel dataControlsViewModel2;
        c6021p.m6526U(1278317429);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            dataControlsViewModel2 = dataControlsViewModel;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i12 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C5054z.class));
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
                Object objMo5693b = c16527d.mo5693b(DataControlsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C5054z.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C5054z.class), c16527d.mo5693b(DataControlsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(DataControlsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                    objM6514H = objM14398a;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                dataControlsViewModel2 = (DataControlsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                dataControlsViewModel2 = dataControlsViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C2392v c2392vM4615a = AbstractC3917G4.m4615a(c6021p);
            c6021p.m6524S(-1727156075);
            boolean zM6545h = c6021p.m6545h(c8870f) | c6021p.m6542f(dataControlsViewModel2) | c6021p.m6545h(context2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C12484a(c8870f, dataControlsViewModel2, context2);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9351b(dataControlsViewModel2, (InterfaceC1436k) objM6514H2, AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c2392vM4615a.f7440r0, null), null, 0L, AbstractC8411c.m8969c(249274278, c6021p, new C0364y(c2392vM4615a, 5, c8870f)), false, AbstractC5036h.f16478i, c6021p, 12779520);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, dataControlsViewModel2, i10, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9334b(InterfaceC21925I1 interfaceC21925I1, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        c6021p.m6526U(84504736);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC21925I1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C5053y.f16503Z, c6021p, 3072, 6);
            c6021p.m6524S(-484701);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-482405);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C0248f0(interfaceC5985X, 22);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a((InterfaceC1436k) objM6514H, interfaceC1426a, AbstractC8142m4.m8676d(R.string.settings_data_archive_description, c6021p), AbstractC8142m4.m8676d(R.string.settings_data_archive, c6021p), 0L, null, false, null, c6021p, i12 & 112, 240);
                z6 = false;
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            C8410b c8410b = AbstractC5036h.f16482m;
            c6021p.m6524S(-470694);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0339D(interfaceC5985X, 23);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(z6);
            AbstractC9990w3.m10630a(c8410b, (InterfaceC1426a) objM6514H2, interfaceC10459q, interfaceC21925I1 instanceof C21917G1, null, null, null, null, null, 0.0f, 0.0f, c6021p, (i12 & 896) | 6, 0, 2032);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5052x(interfaceC21925I1, interfaceC1426a, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9335c(InterfaceC21925I1 interfaceC21925I1, InterfaceC1426a interfaceC1426a, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        int i12;
        c6021p.m6526U(752651407);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC21925I1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C5053y.f16504o0, c6021p, 3072, 6);
            c6021p.m6524S(-682976404);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-682974352);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C0248f0(interfaceC5985X, 23);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                if (z6) {
                    i12 = R.string.settings_data_clear_description_with_memory;
                } else {
                    if (z6) {
                        throw new C0644w();
                    }
                    i12 = R.string.settings_data_clear_description;
                }
                AbstractC9721E3.m10311a(interfaceC1436k, interfaceC1426a, AbstractC8142m4.m8676d(i12, c6021p), AbstractC8142m4.m8676d(R.string.settings_data_clear, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, null, false, null, c6021p, i13 & 112, 224);
                z10 = false;
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            C8410b c8410b = AbstractC5036h.f16481l;
            c6021p.m6524S(-682954897);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0339D(interfaceC5985X, 24);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(z10);
            float f10 = AbstractC3896D1.f11851a;
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            AbstractC9990w3.m10630a(c8410b, (InterfaceC1426a) objM6514H2, interfaceC10459q, interfaceC21925I1 instanceof C21917G1, null, null, null, null, AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, 0L, c6021p, 505), 0.0f, 0.0f, c6021p, ((i13 >> 3) & 896) | 6, 0, 1776);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(interfaceC21925I1, interfaceC1426a, z6, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9336d(InterfaceC21925I1 interfaceC21925I1, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        c6021p.m6526U(-411846932);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC21925I1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C5053y.f16505p0, c6021p, 3072, 6);
            c6021p.m6524S(-1052646652);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-1052644425);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C0248f0(interfaceC5985X, 24);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a((InterfaceC1436k) objM6514H, interfaceC1426a, AbstractC8142m4.m8676d(R.string.settings_account_delete_description, c6021p), AbstractC8142m4.m8676d(R.string.settings_account_delete, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, null, false, null, c6021p, i12 & 112, 224);
                z6 = false;
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            C8410b c8410b = AbstractC5036h.f16484o;
            c6021p.m6524S(-1052630442);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0339D(interfaceC5985X, 25);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(z6);
            float f10 = AbstractC3896D1.f11851a;
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            AbstractC9990w3.m10630a(c8410b, (InterfaceC1426a) objM6514H2, interfaceC10459q, interfaceC21925I1 instanceof C21917G1, null, null, null, null, AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, 0L, c6021p, 505), 0.0f, 0.0f, c6021p, (i12 & 896) | 6, 0, 1776);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5052x(interfaceC21925I1, interfaceC1426a, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9337e(InterfaceC21925I1 interfaceC21925I1, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        c6021p.m6526U(-130904044);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC21925I1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C5053y.f16506q0, c6021p, 3072, 6);
            c6021p.m6524S(-837159764);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-837157465);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C0248f0(interfaceC5985X, 25);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a((InterfaceC1436k) objM6514H, interfaceC1426a, AbstractC8142m4.m8676d(R.string.settings_data_export_description, c6021p), AbstractC8142m4.m8676d(R.string.settings_data_export, c6021p), 0L, null, false, null, c6021p, i12 & 112, 240);
                z6 = false;
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            C8410b c8410b = AbstractC5036h.f16483n;
            c6021p.m6524S(-837145882);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0339D(interfaceC5985X, 26);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(z6);
            AbstractC9990w3.m10630a(c8410b, (InterfaceC1426a) objM6514H2, interfaceC10459q, interfaceC21925I1 instanceof C21917G1, null, null, null, null, null, 0.0f, 0.0f, c6021p, (i12 & 896) | 6, 0, 2032);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5052x(interfaceC21925I1, interfaceC1426a, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9338f(C5054z c5054z, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1810394258);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c5054z) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM18089b = AbstractC16544l.m18089b(c5054z.f16515h, Boolean.TRUE);
            C3590f c3590fM9795b = AbstractC9225V3.m9795b(R.string.settings_data_training_description, null, c6021p, 2);
            c6021p.m6524S(-320286031);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C0537v(10, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9727F3.m10316a(zM18089b, (InterfaceC1436k) objM6514H, AbstractC5036h.f16479j, interfaceC10459q, c3590fM9795b, null, null, false, c6021p, ((i11 << 3) & 7168) | 384, 224);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(c5054z, interfaceC1436k, interfaceC10459q, i10, 18);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9339g(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-683082625);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9727F3.m10316a(false, null, AbstractC5036h.f16480k, interfaceC10459q, AbstractC9225V3.m9795b(R.string.settings_data_workspace_training_description, null, c6021p, 2), null, null, false, c6021p, ((i11 << 9) & 7168) | 12583350, 96);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q, i10, 11);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Date m9340h() {
        return Calendar.getInstance(AbstractC15512a.f48440a).getTime();
    }

    /* JADX INFO: renamed from: i */
    public static Date m9341i(long j10) {
        Calendar calendar = Calendar.getInstance(AbstractC15512a.f48440a);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }

    /* JADX INFO: renamed from: j */
    public static Date m9342j(String str) {
        try {
            return AbstractC15512a.m16693c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("timestamp is not ISO format ", str));
        }
    }

    /* JADX INFO: renamed from: k */
    public static Date m9343k(String str) {
        try {
            return m9341i(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("timestamp is not millis format ", str));
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m9344l(Date date) {
        TimeZone timeZone = AbstractC15512a.f48440a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = AbstractC15512a.f48440a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        AbstractC15512a.m16692b(sb2, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            AbstractC15512a.m16692b(sb2, iAbs, 2);
            sb2.append(':');
            AbstractC15512a.m16692b(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
