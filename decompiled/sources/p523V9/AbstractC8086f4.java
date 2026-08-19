package p523V9;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.reporting.C12470x8ff00947;
import com.openai.feature.reporting.ReportGizmoDialogKt$ReportBugDialog$$inlined$injectViewModel$1;
import com.openai.feature.reporting.ReportingViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.replay.C15298l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0233b1;
import p017Af.C0469P;
import p021Aj.C0523h;
import p025An.C0644w;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1811j0;
import p098Di.InterfaceC2062k;
import p104Do.InterfaceC2220a;
import p1071w0.C20746e0;
import p1071w0.C20748f0;
import p108E2.AbstractC2251j;
import p1113xn.AbstractC21328v;
import p124Ei.C2446D;
import p124Ei.C2463L0;
import p124Ei.C2465M0;
import p138F8.vJO.vRJidSveZHcTw;
import p165G9.AbstractC3021g;
import p204I1.C3582M;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4094m4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p467T1.C7199i;
import p467T1.C7200j;
import p477Tb.AbstractC7294a;
import p478Tc.AbstractC7308l;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p492U1.C7542g;
import p492U1.C7548m;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p587Y1.C9588n;
import p594Y9.AbstractC9751J3;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9973t4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.C10484a;
import p637a3.C10493j;
import p637a3.C10499p;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p672c3.AbstractC11614k0;
import p672c3.C11566C;
import p672c3.C11571E0;
import p672c3.C11593a;
import p672c3.C11595b;
import p672c3.C11600d0;
import p672c3.C11606g0;
import p672c3.C11626q0;
import p672c3.C11627r;
import p672c3.C11628r0;
import p672c3.C11640x0;
import p672c3.C11642y0;
import p672c3.C11644z0;
import p672c3.EnumC11620n0;
import p672c3.InterfaceC11563A0;
import p739f3.C13530a;
import p739f3.C13531b;
import p774h1.AbstractC14334L;
import p776h3.C14387a;
import p776h3.C14388b;
import p776h3.C14389c;
import p776h3.C14393g;
import p776h3.C14394h;
import p776h3.C14395i;
import p776h3.C14396j;
import p776h3.C14397k;
import p776h3.C14398l;
import p776h3.C14404r;
import p823j3.C16084f;
import p863l3.C16810a;
import p863l3.C16813d;
import p884m3.AbstractC17148g;
import p884m3.C17147f;
import p884m3.C17149h;
import p884m3.C17150i;
import p884m3.InterfaceC17142a;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17792x;
import p911o0.C17794y;
import p928oh.C18194a;
import p953q0.C18557O;
import p963qd.C18685n;
import sg.AbstractC19562d;
import sg.C19540D;
import sg.C19542F;
import sg.C19543G;
import sg.C19544H;
import sg.C19545I;
import sg.C19546J;
import sg.C19547K;
import sg.C19548L;
import sg.C19550N;
import sg.C19569k;
import sg.C19575q;
import sg.C19578t;
import sg.C19581w;

/* JADX INFO: renamed from: V9.f4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8086f4 {
    /* JADX INFO: renamed from: a */
    public static final void m8514a(int i10, InterfaceC1426a onDismissRequest, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        String str;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(-722332178);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(-1254672790);
            boolean zM6545h = ((i12 & 14) == 4) | c6021p.m6545h(c8870f) | c6021p.m6545h(context) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                Object c19547k = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 0);
                c6021p.m6537c0(c19547k);
                objM6514H = c19547k;
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19540D.class));
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
            Object objMo5693b = c16527d.mo5693b(ReportingViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C19540D.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19540D.class), c16527d.mo5693b(ReportingViewModel.class), context2, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ReportingViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new ReportGizmoDialogKt$ReportBugDialog$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ReportingViewModel reportingViewModel = (ReportingViewModel) baseViewModel;
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-1254658712);
            boolean zM6542f2 = c6021p.m6542f(reportingViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                str = null;
                objM6514H4 = new C19546J(reportingViewModel, null);
                c6021p.m6537c0(objM6514H4);
            } else {
                str = null;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c17296c);
            m8516c(new C19575q(str, str, str, 7), onDismissRequest, reportingViewModel, interfaceC10459q2, c6021p, ((i12 << 3) & 112) | ((i12 << 6) & 7168));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(onDismissRequest, interfaceC10459q2, i10, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x021a  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m8515b(C19575q c19575q, InterfaceC1426a onDismissRequest, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC10459q interfaceC10459q3;
        C8870f c8870f;
        Context context;
        AbstractActivityC17375g abstractActivityC17375g;
        boolean z6;
        boolean zM6545h;
        Object objM6514H;
        C5975S c5975s;
        InterfaceC1436k interfaceC1436k;
        Context context2;
        boolean zBooleanValue;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H2;
        Object obj;
        boolean z10;
        Object objM14398a;
        BaseViewModel baseViewModel;
        InterfaceC5985X interfaceC5985XM19531n;
        boolean zM6545h2;
        Object objM6514H3;
        ReportingViewModel reportingViewModel;
        boolean z11;
        boolean z12;
        Object objM6514H4;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(1342628149);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c19575q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12;
            if ((i13 & 147) == 146 || !c6021p.m6562y()) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                c6021p.m6524S(-2020401265);
                if ((i13 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zM6545h = z6 | c6021p.m6545h(c8870f) | c6021p.m6545h(context) | c6021p.m6545h(abstractActivityC17375g);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (zM6545h || objM6514H == c5975s) {
                    Object c19547k = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 1);
                    c6021p.m6537c0(c19547k);
                    objM6514H = c19547k;
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(189483815);
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19540D.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(ReportingViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C19540D.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f) {
                    obj = c5975s;
                } else {
                    obj = c5975s;
                    if (objM6514H2 != obj) {
                        objM14398a = objM6514H2;
                        z10 = true;
                    }
                    baseViewModel = (BaseViewModel) objM14398a;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
                    zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H3 == obj) {
                        objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
                    c6021p.m6553p(false);
                    reportingViewModel = (ReportingViewModel) baseViewModel;
                    c6021p.m6524S(-2020387012);
                    boolean zM6542f2 = c6021p.m6542f(reportingViewModel);
                    if ((i13 & 14) == 4) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    z12 = zM6542f2 | z11;
                    objM6514H4 = c6021p.m6514H();
                    if (z12 || objM6514H4 == obj) {
                        objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
                    m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
                    interfaceC10459q2 = interfaceC10459q3;
                }
                z10 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19540D.class), c16527d.mo5693b(ReportingViewModel.class), context2, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ReportingViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM14398a);
                baseViewModel = (BaseViewModel) objM14398a;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
                zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
                c6021p.m6553p(false);
                reportingViewModel = (ReportingViewModel) baseViewModel;
                c6021p.m6524S(-2020387012);
                boolean zM6542f3 = c6021p.m6542f(reportingViewModel);
                if ((i13 & 14) == 4) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                z12 = zM6542f3 | z11;
                objM6514H4 = c6021p.m6514H();
                if (z12) {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
                m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
                interfaceC10459q2 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) c19575q, (Object) onDismissRequest, interfaceC10459q2, i10, i11, 19);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12;
        if ((i13 & 147) == 146) {
            if (i14 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC6012k0 abstractC6012k1 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(abstractC6012k1);
            abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(-2020401265);
            if ((i13 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zM6545h = z6 | c6021p.m6545h(c8870f) | c6021p.m6545h(context) | c6021p.m6545h(abstractActivityC17375g);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (zM6545h) {
                Object c19547k2 = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 1);
                c6021p.m6537c0(c19547k2);
                objM6514H = c19547k2;
            } else {
                Object c19547k3 = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 1);
                c6021p.m6537c0(c19547k3);
                objM6514H = c19547k3;
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k1);
            zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19540D.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b3 = c16527d.mo5693b(ReportingViewModel.class);
            Object objMo5693b4 = c16527d.mo5693b(C19540D.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                obj = c5975s;
                if (objM6514H2 != obj) {
                    objM14398a = objM6514H2;
                    z10 = true;
                }
                baseViewModel = (BaseViewModel) objM14398a;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
                zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
                c6021p.m6553p(false);
                reportingViewModel = (ReportingViewModel) baseViewModel;
                c6021p.m6524S(-2020387012);
                boolean zM6542f4 = c6021p.m6542f(reportingViewModel);
                if ((i13 & 14) == 4) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                z12 = zM6542f4 | z11;
                objM6514H4 = c6021p.m6514H();
                if (z12) {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
                m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
                interfaceC10459q2 = interfaceC10459q3;
            } else {
                obj = c5975s;
            }
            z10 = true;
            if (zBooleanValue) {
                ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19540D.class), c16527d.mo5693b(ReportingViewModel.class), context2, interfaceC2062k);
                throw null;
            }
            if (zBooleanValue) {
                throw new C0644w();
            }
            objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ReportingViewModel.class), null, viewModelStoreOwnerM12165a, list);
            c6021p.m6537c0(objM14398a);
            baseViewModel = (BaseViewModel) objM14398a;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            reportingViewModel = (ReportingViewModel) baseViewModel;
            c6021p.m6524S(-2020387012);
            boolean zM6542f5 = c6021p.m6542f(reportingViewModel);
            if ((i13 & 14) == 4) {
                z11 = z10;
            } else {
                z11 = false;
            }
            z12 = zM6542f5 | z11;
            objM6514H4 = c6021p.m6514H();
            if (z12) {
                objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
            m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
            interfaceC10459q2 = interfaceC10459q3;
        } else {
            if (i14 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC6012k0 abstractC6012k2 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(abstractC6012k2);
            abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(-2020401265);
            if ((i13 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zM6545h = z6 | c6021p.m6545h(c8870f) | c6021p.m6545h(context) | c6021p.m6545h(abstractActivityC17375g);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (zM6545h) {
                Object c19547k4 = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 1);
                c6021p.m6537c0(c19547k4);
                objM6514H = c19547k4;
            } else {
                Object c19547k5 = new C19547K(onDismissRequest, c8870f, context, abstractActivityC17375g, 1);
                c6021p.m6537c0(c19547k5);
                objM6514H = c19547k5;
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k2);
            zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19540D.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b5 = c16527d.mo5693b(ReportingViewModel.class);
            Object objMo5693b6 = c16527d.mo5693b(C19540D.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b6) | c6021p.m6542f(objMo5693b5) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                obj = c5975s;
                if (objM6514H2 != obj) {
                    objM14398a = objM6514H2;
                    z10 = true;
                }
                baseViewModel = (BaseViewModel) objM14398a;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
                zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
                c6021p.m6553p(false);
                reportingViewModel = (ReportingViewModel) baseViewModel;
                c6021p.m6524S(-2020387012);
                boolean zM6542f6 = c6021p.m6542f(reportingViewModel);
                if ((i13 & 14) == 4) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                z12 = zM6542f6 | z11;
                objM6514H4 = c6021p.m6514H();
                if (z12) {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
                m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
                interfaceC10459q2 = interfaceC10459q3;
            } else {
                obj = c5975s;
            }
            z10 = true;
            if (zBooleanValue) {
                ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19540D.class), c16527d.mo5693b(ReportingViewModel.class), context2, interfaceC2062k);
                throw null;
            }
            if (zBooleanValue) {
                throw new C0644w();
            }
            objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ReportingViewModel.class), null, viewModelStoreOwnerM12165a, list);
            c6021p.m6537c0(objM14398a);
            baseViewModel = (BaseViewModel) objM14398a;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C12470x8ff00947(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            reportingViewModel = (ReportingViewModel) baseViewModel;
            c6021p.m6524S(-2020387012);
            boolean zM6542f7 = c6021p.m6542f(reportingViewModel);
            if ((i13 & 14) == 4) {
                z11 = z10;
            } else {
                z11 = false;
            }
            z12 = zM6542f7 | z11;
            objM6514H4 = c6021p.m6514H();
            if (z12) {
                objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C19548L(reportingViewModel, c19575q, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c19575q);
            m8516c(c19575q, onDismissRequest, reportingViewModel, interfaceC10459q3, c6021p, (i13 & 126) | ((i13 << 3) & 7168));
            interfaceC10459q2 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) c19575q, (Object) onDismissRequest, interfaceC10459q2, i10, i11, 19);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8516c(C19575q c19575q, InterfaceC1426a interfaceC1426a, ReportingViewModel reportingViewModel, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(659950292);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c19575q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(reportingViewModel) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(427047871);
            boolean z6 = ((i11 & 896) == 256) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C16084f(reportingViewModel, 14, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b((InterfaceC1426a) objM6514H, new C9588n(3, false, false), AbstractC8411c.m8969c(-1289422243, c6021p, new C15298l(interfaceC10459q, reportingViewModel, c19575q, 6)), c6021p, 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(c19575q, interfaceC1426a, reportingViewModel, interfaceC10459q, i10, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8517d(int i10, InterfaceC1426a onDismissRequest, C6021p c6021p, InterfaceC10459q interfaceC10459q, String gizmoId) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(-1323341793);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(gizmoId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            m8515b(new C19575q(gizmoId, (String) null, (String) null, 6), onDismissRequest, c10456n, c6021p, i12 & 1008, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0469P(gizmoId, onDismissRequest, interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8518e(C19540D c19540d, C19569k c19569k, boolean z6, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-985441254);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c19540d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c19569k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String str = (String) c19540d.f62074e.get(c19569k);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            int i12 = z6 ? 1 : 2;
            int i13 = z6 ? 1 : 4;
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
            c6021p.m6524S(222697892);
            boolean z10 = ((i11 & 7168) == 2048) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C18194a(interfaceC1436k, 4, c19569k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC4094m4.m4753a(str2, (InterfaceC1436k) objM6514H, interfaceC10459qM11235m, false, false, null, AbstractC8411c.m8969c(1062207934, c6021p, new C7443a0(c19569k, 29)), null, null, null, null, null, null, false, null, null, null, false, i13, i12, null, null, null, c6021p, 1572864, 0, 0, 7602104);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(c19540d, c19569k, z6, interfaceC1436k, i10, 12);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8519f(int i10, C6021p c6021p) {
        C17794y c17794y = C17794y.f56777a;
        c6021p.m6526U(1840211084);
        if ((((i10 & 6) == 0 ? (c6021p.m6542f(c17794y) ? 4 : 2) | i10 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3914G1.m4611a(AbstractC19562d.f62143h, null, null, AbstractC19562d.f62144i, null, null, null, 0.0f, 0.0f, c6021p, 3078, HttpStatusCode.BAD_GATEWAY_502);
            c6021p.m6524S(-1941444752);
            for (int i11 = 1; i11 < 4; i11++) {
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1466427184, c6021p, new C2446D(i11, 21)), null, null, null, null, AbstractC19562d.f62145j, null, 0.0f, 0.0f, c6021p, 196614, 478);
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 22);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8520g(InterfaceC1436k interfaceC1436k, C19575q c19575q, C6021p c6021p, int i10) {
        int i11;
        int i12;
        boolean z6;
        c6021p.m6526U(-463438802);
        if ((i10 & 48) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c19575q) ? 256 : 128;
        }
        if ((i11 & 145) == 144 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String strM8676d = AbstractC8142m4.m8676d(R.string.report_content_header_pick_content, c6021p);
            C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12151g;
            C10456n c10456n = C10456n.f30959Y;
            int i13 = i11;
            AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65020);
            c6021p.m6524S(1206287770);
            int i14 = i13 & 112;
            int i15 = i13 & 896;
            boolean z10 = (i15 == 256) | (i14 == 32);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (z10 || objM6514H == c5975s) {
                objM6514H = new C19542F(interfaceC1436k, c19575q, 0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC19562d.f62136a, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, null, null, AbstractC19562d.f62137b, null, 0.0f, 0.0f, c6021p, 196614, 476);
            c6021p.m6524S(1206304382);
            if (i14 == 32) {
                z6 = true;
                i12 = 256;
            } else {
                i12 = 256;
                z6 = false;
            }
            boolean z11 = z6 | (i15 == i12);
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == c5975s) {
                objM6514H2 = new C19542F(interfaceC1436k, c19575q, 1);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC19562d.f62138c, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H2, 7), null, null, null, AbstractC19562d.f62139d, null, 0.0f, 0.0f, c6021p, 196614, 476);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(interfaceC1436k, c19575q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8521h(C19575q c19575q, C19578t c19578t, C19540D c19540d, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        boolean z6;
        InterfaceC5985X interfaceC5985X;
        C10456n c10456n;
        Object obj;
        int i11;
        int i12;
        boolean z10;
        C10456n c10456n2;
        boolean z11;
        int i13;
        boolean z12;
        Object obj2 = C17794y.f56777a;
        c6021p.m6526U(-1425102129);
        int i14 = (i10 & 6) == 0 ? (c6021p.m6542f(obj2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i14 |= c6021p.m6542f(c19575q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i14 |= c6021p.m6542f(c19578t) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i14 |= c6021p.m6542f(c19540d) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i14 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        int i15 = i14;
        if ((i15 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(385413677, c6021p, new C19543G(c19578t, 0)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C19545I.f62091Y, c6021p, 3072, 6);
            c6021p.m6524S(1929853334);
            String str = c19578t.f62169c;
            C10456n c10456n3 = C10456n.f30959Y;
            if (str != null && str.length() != 0) {
                AbstractC4124r4.m4768b(c19578t.f62169c, AbstractC10842a.m11233k(c10456n3, AbstractC7313q.f23201f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65532);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1512427635);
            int i16 = r11 & 57344;
            int i17 = r11 & 112;
            int i18 = r11 & 896;
            boolean zM6542f = (i16 == 16384) | (i17 == 32) | (i18 == 256) | c6021p.m6542f(interfaceC5985X2) | ((r11 & 7168) == 2048);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                Object c0523h = new C0523h(interfaceC1436k, c19575q, c19578t, interfaceC5985X2, c19540d, 6);
                c6021p.m6537c0(c0523h);
                objM6514H = c0523h;
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(1929869186);
            boolean z13 = c19578t.f62171e;
            if (z13) {
                String str2 = (String) interfaceC5985X2.getValue();
                InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n3, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
                C20748f0 c20748f0 = new C20748f0(3, 4, 118);
                c6021p.m6524S(-1512401288);
                boolean zM6542f2 = c6021p.m6542f(interfaceC1426a);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == c5975s) {
                    objM6514H2 = new C1811j0(15, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                C20746e0 c20746e0 = new C20746e0(null, (InterfaceC1436k) objM6514H2, 31);
                c6021p.m6524S(-1512416956);
                interfaceC5985X = interfaceC5985X2;
                boolean zM6542f3 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == c5975s) {
                    objM6514H3 = new C6194i(interfaceC5985X, 29);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                c10456n = c10456n3;
                z6 = false;
                AbstractC4094m4.m4753a(str2, (InterfaceC1436k) objM6514H3, interfaceC10459qM11235m, false, false, null, AbstractC8411c.m8969c(1026790493, c6021p, new C19543G(c19578t, 1)), null, null, null, null, null, null, false, null, c20748f0, c20746e0, false, 4, 2, null, null, null, c6021p, 1572864, 905969664, 0, 7503800);
            } else {
                z6 = false;
                interfaceC5985X = interfaceC5985X2;
                c10456n = c10456n3;
            }
            c6021p.m6553p(z6);
            c6021p.m6524S(1929890343);
            List<C19569k> list = c19578t.f62176j;
            for (C19569k c19569k : list) {
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23201f));
                int iOrdinal = c19569k.f62156b.ordinal();
                if (iOrdinal == 0) {
                    z12 = z6;
                    c6021p.m6524S(-75362211);
                    m8518e(c19540d, c19569k, true, interfaceC1436k, c6021p, ((r11 >> 9) & 14) | 384 | ((r11 >> 3) & 7168));
                    c6021p.m6553p(z12);
                } else if (iOrdinal == 1) {
                    z12 = z6;
                    c6021p.m6524S(-75638948);
                    m8518e(c19540d, c19569k, false, interfaceC1436k, c6021p, ((r11 >> 9) & 14) | 384 | ((r11 >> 3) & 7168));
                    c6021p.m6553p(z12);
                } else if (iOrdinal == 2) {
                    z12 = z6;
                    c6021p.m6524S(-75787779);
                    m8518e(c19540d, c19569k, true, interfaceC1436k, c6021p, ((r11 >> 9) & 14) | 384 | ((r11 >> 3) & 7168));
                    c6021p.m6553p(z12);
                } else if (iOrdinal != 3) {
                    c6021p.m6524S(-75265801);
                    c6021p.m6553p(z6);
                    z12 = z6;
                } else {
                    c6021p.m6524S(-75499107);
                    z12 = false;
                    m8518e(c19540d, c19569k, true, interfaceC1436k, c6021p, ((r11 >> 9) & 14) | 384 | ((i15 >> 3) & 7168));
                    c6021p.m6553p(false);
                }
                z6 = z12;
                c10456n = c10456n;
                list = list;
                z13 = z13;
                interfaceC5985X = interfaceC5985X;
            }
            C10456n c10456n4 = c10456n;
            InterfaceC5985X interfaceC5985X3 = interfaceC5985X;
            List list2 = list;
            boolean z14 = z13;
            boolean z15 = z6;
            c6021p.m6553p(z15);
            c6021p.m6524S(1929912573);
            String str3 = c19578t.f62173g;
            if (str3 == null || str3.length() == 0) {
                obj = c5975s;
                i11 = i16;
                i12 = 16384;
                z10 = true;
            } else {
                C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k;
                C7200j c7200j = C7200j.f22864c;
                InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(c10456n4, AbstractC7313q.f23201f, 0.0f, 2);
                c6021p.m6524S(-1512366549);
                i12 = 16384;
                if (i16 == 16384) {
                    i13 = 256;
                    z11 = true;
                } else {
                    z11 = z15;
                    i13 = 256;
                }
                boolean z16 = (i18 == i13 ? true : z15) | z11;
                Object objM6514H4 = c6021p.m6514H();
                if (z16) {
                    obj = c5975s;
                } else {
                    obj = c5975s;
                    if (objM6514H4 == obj) {
                    }
                    c6021p.m6553p(z15);
                    i11 = i16;
                    z10 = true;
                    AbstractC4124r4.m4768b(c19578t.f62173g, AbstractC10833a.m11209d(interfaceC10459qM11235m2, z15, null, (InterfaceC1426a) objM6514H4, 7), 0L, 0L, null, null, null, 0L, c7200j, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 100663296, 0, 65276);
                }
                objM6514H4 = new C16084f(interfaceC1436k, 13, c19578t);
                c6021p.m6537c0(objM6514H4);
                c6021p.m6553p(z15);
                i11 = i16;
                z10 = true;
                AbstractC4124r4.m4768b(c19578t.f62173g, AbstractC10833a.m11209d(interfaceC10459qM11235m2, z15, null, (InterfaceC1426a) objM6514H4, 7), 0L, 0L, null, null, null, 0L, c7200j, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 100663296, 0, 65276);
            }
            r15.m6553p(z15);
            r15.m6524S(1929926187);
            for (C19578t c19578t2 : c19578t.f62170d) {
                r15.m6524S(136144448);
                boolean z17 = i11 == i12 ? z10 : z15;
                int i19 = i17;
                boolean zM6542f4 = (i19 == 32 ? z10 : z15) | z17 | r15.m6542f(c19578t2);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6542f4 || objM6514H5 == obj) {
                    objM6514H5 = new C19544H(interfaceC1436k, c19575q, c19578t2, 0);
                    r15.m6537c0(objM6514H5);
                }
                r15.m6553p(z15);
                C10456n c10456n5 = c10456n4;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1958477084, c6021p, new C19543G(c19578t2, 2)), AbstractC10833a.m11209d(c10456n5, z15, null, (InterfaceC1426a) objM6514H5, 7), null, null, null, AbstractC19562d.f62140e, null, 0.0f, 0.0f, c6021p, 196614, 476);
                i17 = i19;
                c10456n4 = c10456n5;
                i12 = 16384;
            }
            C10456n c10456n6 = c10456n4;
            r15.m6553p(z15);
            r15.m6524S(1929940500);
            String str4 = c19578t.f62175i;
            if (str4 == null || str4.length() == 0) {
                c10456n2 = c10456n6;
            } else {
                float f10 = AbstractC7313q.f23201f;
                c10456n2 = c10456n6;
                AbstractC17758g.m19482b(r15, AbstractC10844c.m11245e(c10456n2, f10));
                AbstractC4124r4.m4768b(c19578t.f62175i, AbstractC10842a.m11235m(c10456n2, f10, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) r15.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65532);
            }
            r15.m6553p(z15);
            r15.m6524S(1929950343);
            if (z14 || !list2.isEmpty()) {
                AbstractC9751J3.m10349b(interfaceC1426a, AbstractC10842a.m11233k(AbstractC10844c.m11244d(c10456n2, 1.0f), AbstractC7313q.f23201f), AbstractC4048f0.m4732a(c6021p), c19540d.f62073d, (((CharSequence) interfaceC5985X3.getValue()).length() <= 0 || !c19540d.f62076g) ? z15 : z10, AbstractC19562d.f62141f, c6021p, 196608, 0);
            }
            r15.m6553p(z15);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(i10, 4, c19575q, c19578t, c19540d, interfaceC1436k);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8522i(C19575q c19575q, C19581w c19581w, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        Object obj = C17794y.f56777a;
        c6021p.m6526U(-417844419);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(obj) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c19575q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c19581w) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i13 = i12;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-655193057, c6021p, new C19550N(c19581w, 0)), null, null, AbstractC8411c.m8969c(1687087458, c6021p, new C19550N(c19581w, 1)), null, null, null, 0.0f, 0.0f, c6021p, 3078, HttpStatusCode.BAD_GATEWAY_502);
            c6021p.m6524S(1209759787);
            for (C19578t c19578t : c19581w.f62181c) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(2025023552);
                int i14 = i13;
                boolean zM6542f = ((i14 & 7168) == 2048) | ((i14 & 112) == 32) | c6021p.m6542f(c19578t);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C19544H(interfaceC1436k, c19575q, c19578t, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1918839441, c6021p, new C19543G(c19578t, 3)), AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, null, null, AbstractC19562d.f62142g, null, 0.0f, 0.0f, c6021p, 196614, 476);
                i13 = i14;
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c19575q, c19581w, interfaceC1436k, i10, 29);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8523j(ArrayList arrayList) {
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m8524k(InterfaceC2220a interfaceC2220a, List list, InterfaceC1439n interfaceC1439n) {
        ArrayList arrayListM8397f = AbstractC8038Z3.m8397f(list);
        List listMo3260e = interfaceC2220a.mo3260e((Comparable) AbstractC17680n.m19343S(arrayListM8397f), (Comparable) AbstractC17680n.m19344T(1, arrayListM8397f));
        Integer numValueOf = null;
        if (listMo3260e != null) {
            List list2 = listMo3260e;
            boolean z6 = list2 instanceof Collection;
            if (!z6 || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        numValueOf = Integer.valueOf(AbstractC3021g.m3873a((Comparable) AbstractC17680n.m19343S(listMo3260e), (Comparable) AbstractC17680n.m19344T(1, listMo3260e)));
                        break;
                    }
                    if (((Comparable) it.next()) != null) {
                        if (!z6 || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    numValueOf = Integer.valueOf(AbstractC3021g.m3873a((Comparable) AbstractC17680n.m19343S(listMo3260e), (Comparable) AbstractC17680n.m19344T(1, listMo3260e)));
                                    break;
                                }
                            } while (((Comparable) it2.next()) != null);
                        } else {
                            numValueOf = Integer.valueOf(AbstractC3021g.m3873a((Comparable) AbstractC17680n.m19343S(listMo3260e), (Comparable) AbstractC17680n.m19344T(1, listMo3260e)));
                            break;
                        }
                    }
                }
            } else {
                numValueOf = Integer.valueOf(AbstractC3021g.m3873a((Comparable) AbstractC17680n.m19343S(listMo3260e), (Comparable) AbstractC17680n.m19344T(1, listMo3260e)));
                break;
            }
        }
        if (numValueOf != null) {
            return ((Boolean) interfaceC1439n.invoke(Integer.valueOf(numValueOf.intValue()), 0)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final void m8525l(RemoteViews remoteViews, C11571E0 c11571e0, C11600d0 c11600d0, ArrayList arrayList) {
        int i10 = 0;
        for (Object obj : AbstractC17680n.m19373w0(arrayList, 10)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            m8527n(remoteViews, c11571e0.m12968b(c11600d0, i10), (InterfaceC10492i) obj);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m8526m(C14389c c14389c) {
        int i10 = c14389c.f45117a;
        int i11 = 8388611;
        if (!C14387a.m15890b(i10, 0)) {
            if (C14387a.m15890b(i10, 2)) {
                i11 = 8388613;
            } else if (C14387a.m15890b(i10, 1)) {
                i11 = 1;
            } else {
                AbstractC15256t.m16482t("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C14387a.m15891c(i10)));
            }
        }
        int i12 = c14389c.f45118b;
        int i13 = 48;
        if (!C14388b.m15893b(i12, 0)) {
            if (C14388b.m15893b(i12, 2)) {
                i13 = 80;
            } else if (C14388b.m15893b(i12, 1)) {
                i13 = 16;
            } else {
                AbstractC15256t.m16482t("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C14388b.m15894c(i12)));
            }
        }
        return i11 | i13;
    }

    /* JADX INFO: renamed from: o */
    public static final RemoteViews m8528o(Context context, int i10, C11628r0 c11628r0, C11606g0 c11606g0, int i11, ComponentName componentName) {
        RemoteViews remoteViews;
        C11571E0 c11571e0 = new C11571E0(context, i10, context.getResources().getConfiguration().getLayoutDirection() == 1, c11606g0, -1, false, new AtomicInteger(1), new C11600d0(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, -1, false, null, componentName);
        ArrayList<InterfaceC10492i> arrayList = c11628r0.f31096c;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((InterfaceC10492i) it.next()) instanceof C11566C)) {
                    InterfaceC10492i interfaceC10492i = (InterfaceC10492i) AbstractC17680n.m19365o0(arrayList);
                    C11626q0 c11626q0M12983a = AbstractC11614k0.m12983a(c11571e0, interfaceC10492i.mo10956b(), i11);
                    C11571E0 c11571e0M12967a = C11571E0.m12967a(c11571e0.m12968b(c11626q0M12983a.f35232b, 0), 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, false, null, 32447);
                    RemoteViews remoteViews2 = c11626q0M12983a.f35231a;
                    m8527n(remoteViews2, c11571e0M12967a, interfaceC10492i);
                    return remoteViews2;
                }
            }
        }
        Object objM19341Q = AbstractC17680n.m19341Q(arrayList);
        AbstractC16544l.m18092e(objM19341Q, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        InterfaceC11563A0 interfaceC11563A0 = ((C11566C) objM19341Q).f34968e;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (InterfaceC10492i interfaceC10492i2 : arrayList) {
            AbstractC16544l.m18092e(interfaceC10492i2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long j10 = ((C11566C) interfaceC10492i2).f34967d;
            C11626q0 c11626q0M12983a2 = AbstractC11614k0.m12983a(c11571e0, interfaceC10492i2.mo10956b(), i11);
            C11571E0 c11571e0M12967a2 = C11571E0.m12967a(c11571e0.m12968b(c11626q0M12983a2.f35232b, 0), 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), j10, false, null, 31935);
            RemoteViews remoteViews3 = c11626q0M12983a2.f35231a;
            m8527n(remoteViews3, c11571e0M12967a2, interfaceC10492i2);
            arrayList2.add(new C17309l(new SizeF(C7542g.m7877b(j10), C7542g.m7876a(j10)), remoteViews3));
        }
        if (interfaceC11563A0 instanceof C11644z0) {
            return (RemoteViews) ((C17309l) AbstractC17680n.m19365o0(arrayList2)).f55137Z;
        }
        if (!(interfaceC11563A0 instanceof C11642y0 ? true : AbstractC16544l.m18089b(interfaceC11563A0, C11640x0.f35269a))) {
            throw new C0644w();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C11595b.f35083a.m12977a(AbstractC17659D.m19253o(arrayList2));
        }
        if (!(arrayList2.size() == 1 || arrayList2.size() == 2)) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((C17309l) it2.next()).f55137Z);
        }
        int size = arrayList3.size();
        if (size == 1) {
            remoteViews = (RemoteViews) arrayList3.get(0);
        } else {
            if (size != 2) {
                throw new IllegalArgumentException("There must be between 1 and 2 views.");
            }
            remoteViews = new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        return remoteViews;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static List m8529p(InterfaceC2220a interfaceC2220a, Comparable comparable, Comparable comparable2) {
        boolean z6 = comparable instanceof Number;
        if (z6 && (comparable2 instanceof Number)) {
            return AbstractC17681o.m19382k(Double.valueOf(((Number) comparable).doubleValue()), Double.valueOf(((Number) comparable2).doubleValue()));
        }
        if ((comparable instanceof String) && (comparable2 instanceof Number)) {
            return AbstractC17681o.m19382k(AbstractC21328v.m21719f((String) comparable), Double.valueOf(((Number) comparable2).doubleValue()));
        }
        if (z6 && (comparable2 instanceof String)) {
            return AbstractC17681o.m19382k(Double.valueOf(((Number) comparable).doubleValue()), AbstractC21328v.m21719f((String) comparable2));
        }
        return ((comparable instanceof Boolean) || (comparable2 instanceof Boolean)) ? AbstractC17681o.m19382k(interfaceC2220a.mo3259a(comparable), interfaceC2220a.mo3259a(comparable2)) : interfaceC2220a.mo3262g(comparable, comparable2);
    }

    /* JADX INFO: renamed from: q */
    public static List m8530q(Comparable comparable, Comparable comparable2) {
        if (comparable != 0 && comparable2 != 0 && comparable.getClass() == comparable2.getClass()) {
            return AbstractC17681o.m19382k(comparable, comparable2);
        }
        if (comparable == 0 && comparable2 == 0) {
            return AbstractC17681o.m19382k((Void) comparable, (Void) comparable2);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m8531r(Object obj) {
        Double dM21719f;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).longValue() > 0);
        }
        if (!(obj instanceof String) || (dM21719f = AbstractC21328v.m21719f((String) obj)) == null) {
            return null;
        }
        return Boolean.valueOf(((long) dM21719f.doubleValue()) > 0);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX INFO: renamed from: n */
    public static final void m8527n(RemoteViews remoteViews, C11571E0 c11571e0, InterfaceC10492i interfaceC10492i) {
        EnumC11620n0 enumC11620n0;
        if (interfaceC10492i instanceof C14394h) {
            C14394h c14394h = (C14394h) interfaceC10492i;
            EnumC11620n0 enumC11620n1 = EnumC11620n0.f35203o0;
            int size = c14394h.f31096c.size();
            InterfaceC10497n interfaceC10497n = c14394h.f45130d;
            C14389c c14389c = c14394h.f45131e;
            C11600d0 c11600d0M12984b = AbstractC11614k0.m12984b(remoteViews, c11571e0, enumC11620n1, size, interfaceC10497n, new C14387a(c14389c.f45117a), new C14388b(c14389c.f45118b));
            AbstractC8046a4.m8422a(c11571e0, remoteViews, c14394h.f45130d, c11600d0M12984b);
            ArrayList<InterfaceC10492i> arrayList = c14394h.f31096c;
            for (InterfaceC10492i interfaceC10492i2 : arrayList) {
                interfaceC10492i2.mo10957c(interfaceC10492i2.mo10956b().mo10952b(new C11593a(c14394h.f45131e)));
            }
            m8525l(remoteViews, c11571e0, c11600d0M12984b, arrayList);
            return;
        }
        boolean z6 = interfaceC10492i instanceof C14396j;
        C11627r c11627r = C11627r.f35241v0;
        if (z6) {
            C14396j c14396j = (C14396j) interfaceC10492i;
            C11600d0 c11600d0M12984b2 = AbstractC11614k0.m12984b(remoteViews, c11571e0, (Build.VERSION.SDK_INT < 31 || !c14396j.f45135d.mo10951a(c11627r)) ? EnumC11620n0.f35201Y : EnumC11620n0.f35198N0, c14396j.f31096c.size(), c14396j.f45135d, null, new C14388b(c14396j.f45137f));
            remoteViews.setInt(c11600d0M12984b2.f35091a, "setGravity", m8526m(new C14389c(c14396j.f45136e, c14396j.f45137f)));
            AbstractC8046a4.m8422a(C11571E0.m12967a(c11571e0, 0, false, null, null, null, 0L, true, null, 28671), remoteViews, c14396j.f45135d, c11600d0M12984b2);
            ArrayList arrayList2 = c14396j.f31096c;
            m8525l(remoteViews, c11571e0, c11600d0M12984b2, arrayList2);
            if (c14396j.f45135d.mo10951a(c11627r)) {
                m8523j(arrayList2);
                return;
            }
            return;
        }
        if (interfaceC10492i instanceof C14395i) {
            C14395i c14395i = (C14395i) interfaceC10492i;
            C11600d0 c11600d0M12984b3 = AbstractC11614k0.m12984b(remoteViews, c11571e0, (Build.VERSION.SDK_INT < 31 || !c14395i.f45132d.mo10951a(c11627r)) ? EnumC11620n0.f35202Z : EnumC11620n0.f35199O0, c14395i.f31096c.size(), c14395i.f45132d, new C14387a(c14395i.f45134f), null);
            remoteViews.setInt(c11600d0M12984b3.f35091a, "setGravity", m8526m(new C14389c(c14395i.f45134f, c14395i.f45133e)));
            AbstractC8046a4.m8422a(C11571E0.m12967a(c11571e0, 0, false, null, null, null, 0L, true, null, 28671), remoteViews, c14395i.f45132d, c11600d0M12984b3);
            ArrayList arrayList3 = c14395i.f31096c;
            m8525l(remoteViews, c11571e0, c11600d0M12984b3, arrayList3);
            if (c14395i.f45132d.mo10951a(c11627r)) {
                m8523j(arrayList3);
                return;
            }
            return;
        }
        boolean z10 = false;
        if (interfaceC10492i instanceof C16810a) {
            C16810a c16810a = (C16810a) interfaceC10492i;
            C11600d0 c11600d0M12985c = AbstractC11614k0.m12985c(remoteViews, c11571e0, EnumC11620n0.f35204p0, c16810a.f53941d);
            CharSequence charSequence = c16810a.f53938a;
            C16813d c16813d = c16810a.f53939b;
            int i10 = c16810a.f53940c;
            int i11 = c11600d0M12985c.f35091a;
            if (i10 != Integer.MAX_VALUE) {
                remoteViews.setInt(i11, "setMaxLines", i10);
            }
            if (c16813d == null) {
                remoteViews.setTextViewText(i11, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                C7548m c7548m = c16813d.f53949b;
                if (c7548m != null) {
                    long j10 = c7548m.f23910a;
                    if ((1095216660480L & j10) != 4294967296L) {
                        throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                    }
                    remoteViews.setTextViewTextSize(i11, 2, C7548m.m7895c(j10));
                }
                Iterator it = new ArrayList().iterator();
                while (it.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i11, spannableString);
                InterfaceC17142a interfaceC17142a = c16813d.f53948a;
                if (interfaceC17142a instanceof C17149h) {
                    remoteViews.setTextColor(i11, AbstractC14334L.m15617F(((C17149h) interfaceC17142a).f54818a));
                } else if (!(interfaceC17142a instanceof C17150i)) {
                    AbstractC15256t.m16482t("GlanceAppWidget", "Unexpected text color: " + interfaceC17142a);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC2251j.m3287g(remoteViews, i11, "setTextColor", ((C17150i) interfaceC17142a).f54819a);
                } else {
                    remoteViews.setTextColor(i11, AbstractC14334L.m15617F(((C17150i) interfaceC17142a).mo18905a(c11571e0.f34973a)));
                }
            }
            AbstractC8046a4.m8422a(c11571e0, remoteViews, c16810a.f53941d, c11600d0M12985c);
            return;
        }
        if (interfaceC10492i instanceof C14397k) {
            C14397k c14397k = (C14397k) interfaceC10492i;
            AbstractC8046a4.m8422a(c11571e0, remoteViews, c14397k.f45138a, AbstractC11614k0.m12985c(remoteViews, c11571e0, EnumC11620n0.f35209u0, c14397k.f45138a));
            return;
        }
        if (!(interfaceC10492i instanceof C10493j)) {
            if (!(interfaceC10492i instanceof C11566C)) {
                throw new IllegalArgumentException("Unknown element type " + interfaceC10492i.getClass().getCanonicalName());
            }
            C11566C c11566c = (C11566C) interfaceC10492i;
            int size2 = c11566c.f31096c.size();
            ArrayList arrayList4 = c11566c.f31096c;
            if (size2 > 1) {
                throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
            }
            InterfaceC10492i interfaceC10492i3 = (InterfaceC10492i) AbstractC17680n.m19343S(arrayList4);
            if (interfaceC10492i3 != null) {
                m8527n(remoteViews, c11571e0, interfaceC10492i3);
                return;
            }
            return;
        }
        C10493j c10493j = (C10493j) interfaceC10492i;
        boolean zM7747d = AbstractC7294a.m7747d(c10493j);
        int i12 = c10493j.f31093d;
        if (C14393g.m15895a(i12, 0)) {
            enumC11620n0 = zM7747d ? EnumC11620n0.f35193I0 : EnumC11620n0.f35190F0;
        } else {
            boolean zM15895a = C14393g.m15895a(i12, 1);
            EnumC11620n0 enumC11620n2 = EnumC11620n0.f35191G0;
            if (zM15895a) {
                enumC11620n0 = zM7747d ? EnumC11620n0.f35194J0 : enumC11620n2;
            } else if (C14393g.m15895a(i12, 2)) {
                enumC11620n0 = zM7747d ? EnumC11620n0.f35195K0 : EnumC11620n0.f35192H0;
            } else {
                AbstractC15256t.m16482t("GlanceAppWidget", vRJidSveZHcTw.mqBtvjgyPWc + ((Object) C14393g.m15896b(c10493j.f31093d)));
            }
        }
        C11600d0 c11600d0M12985c2 = AbstractC11614k0.m12985c(remoteViews, c11571e0, enumC11620n0, c10493j.f31090a);
        C10484a c10484a = c10493j.f31091b;
        if (!(c10484a instanceof C10484a)) {
            throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
        }
        int i13 = c10484a.f31065a;
        int i14 = c11600d0M12985c2.f35091a;
        remoteViews.setImageViewResource(i14, i13);
        C10499p c10499p = c10493j.f31092c;
        if (c10499p != null) {
            if (!(c10499p instanceof C10499p)) {
                throw new IllegalArgumentException("An unsupported ColorFilter was used.");
            }
            int i15 = Build.VERSION.SDK_INT;
            C17149h c17149h = c10499p.f31099a;
            if (i15 >= 31) {
                C13530a.f42822a.m15084a(c11571e0, remoteViews, c17149h, i14);
            } else {
                remoteViews.setInt(i14, "setColorFilter", AbstractC14334L.m15617F(c17149h.f54818a));
            }
        }
        AbstractC8046a4.m8422a(c11571e0, remoteViews, c10493j.f31090a, c11600d0M12985c2);
        if (C14393g.m15895a(c10493j.f31093d, 1)) {
            C14404r c14404r = (C14404r) c10493j.f31090a.mo10954j(null, C13531b.f42823Z);
            AbstractC17148g abstractC17148g = c14404r != null ? c14404r.f45151a : null;
            C17147f c17147f = C17147f.f54817a;
            if (AbstractC16544l.m18089b(abstractC17148g, c17147f)) {
                z10 = true;
            } else {
                C14398l c14398l = (C14398l) c10493j.f31090a.mo10954j(null, C13531b.f42824o0);
                if (AbstractC16544l.m18089b(c14398l != null ? c14398l.f45139a : null, c17147f)) {
                    z10 = true;
                }
            }
        }
        remoteViews.setBoolean(i14, "setAdjustViewBounds", z10);
    }
}
