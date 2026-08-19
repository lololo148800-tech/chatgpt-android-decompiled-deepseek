package p1152zf;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.AsyncImagePainter$State$Success;
import com.openai.chatgpt.R;
import com.openai.feature.messages.impl.listitem.content.chart.MessageChartViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p017Af.C0477h;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p059C5.C1588f;
import p059C5.InterfaceC1589g;
import p098Di.InterfaceC2062k;
import p1010sf.AbstractC19536b;
import p1051v0.AbstractC20417e;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21907E;
import p1155zi.C21965U0;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p229J0.AbstractC4031c1;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p479Td.C7352g;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8443A;
import p579Xh.InterfaceC9514a;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17790w;
import tf.C19899D;

/* JADX INFO: renamed from: zf.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21881c {

    /* JADX INFO: renamed from: a */
    public static final float f69380a = 12;

    /* JADX INFO: renamed from: a */
    public static final void m22319a(String str, String str2, List list, int i10, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i11) {
        int i12;
        InterfaceC2062k interfaceC2062k;
        Object obj;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        c6021p.m6526U(-871121707);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6538d(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String strM22337a = C21907E.m22337a(((C7352g) list.get(i10)).f23314c.f69534a);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            AbstractC6012k0 abstractC6012k0 = AbstractC16421b.f50950a;
            List list2 = (List) c6021p.m6548k(abstractC6012k0);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C21883e.class));
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
            Object objMo5693b = c16527d.mo5693b(MessageChartViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C21883e.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (zM6542f || objM6514H == obj2) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C21883e.class), c16527d.mo5693b(MessageChartViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageChartViewModel.class), strM22337a, viewModelStoreOwnerM12165a, list2);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            Object obj3 = (MessageChartViewModel) baseViewModel;
            C7352g c7352g = (C7352g) list.get(i10);
            C21965U0 c21965u0 = c7352g.f23314c;
            Object obj4 = c21965u0.f69534a;
            c6021p.m6524S(1004077875);
            boolean zM6542f2 = c6021p.m6542f(obj4);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj2) {
                objM6514H2 = C5997d.m6430Q(C1588f.f4457a, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C21984a1 c21984a1 = new C21984a1(str2);
            Integer numValueOf = Integer.valueOf(i10);
            c6021p.m6524S(1004083744);
            int i13 = i12 & 7168;
            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(c7352g) | (i13 == 2048);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj2) {
                obj = null;
                objM6514H3 = new C21879a(interfaceC20904w, c7352g, i10, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                obj = null;
            }
            c6021p.m6553p(false);
            C5997d.m6451g(c21984a1, numValueOf, (InterfaceC1439n) objM6514H3, c6021p);
            String strM8676d = AbstractC8142m4.m8676d(R.string.chart_content_fallback_title, c6021p);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(abstractC6012k0)).iterator();
            do {
                if (!it.hasNext()) {
                    next = obj;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                throw new IllegalStateException("No ImageLoader");
            }
            InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(AbstractC8079e5.m8501a(interfaceC10459q, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b), !(((InterfaceC1589g) interfaceC5985X.getValue()) instanceof AsyncImagePainter$State$Success), false, 0.0f, 14);
            if (!(((InterfaceC1589g) interfaceC5985X.getValue()) instanceof AsyncImagePainter$State$Success)) {
                interfaceC10459qM10458b = AbstractC10842a.m11226d(interfaceC10459qM10458b, c21965u0.f69536c / c21965u0.f69537d);
            }
            InterfaceC10459q interfaceC10459q2 = interfaceC10459qM10458b;
            c6021p.m6524S(1004109860);
            boolean zM6542f3 = ((i12 & 112) == 32) | c6021p.m6542f(obj3) | ((i12 & 14) == 4) | c6021p.m6545h(list) | (i13 == 2048);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == obj2) {
                Object c0477h = new C0477h(i10, 3, obj3, str, str2, list);
                c6021p.m6537c0(c0477h);
                objM6514H4 = c0477h;
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10833a.m11209d(interfaceC10459q2, false, obj, (InterfaceC1426a) objM6514H4, 7), AbstractC7313q.f23198c);
            C21088i c21088i = C21089j.f67012o0;
            c6021p.m6524S(1004123782);
            boolean zM6542f4 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f4 || objM6514H5 == obj2) {
                objM6514H5 = new C19899D(interfaceC5985X, 8);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(1004122470);
            boolean zM6542f5 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6542f5 || objM6514H6 == obj2) {
                objM6514H6 = new C19899D(interfaceC5985X, 9);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H6;
            c6021p.m6553p(false);
            c6021p.m6524S(1004121158);
            boolean zM6542f6 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6542f6 || objM6514H7 == obj2) {
                objM6514H7 = new C19899D(interfaceC5985X, 10);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            AbstractC7881F0.m8163b(c21965u0.f69534a, strM8676d, interfaceC0832pMo3165c, interfaceC10459qM11233k, null, null, null, interfaceC1436k, interfaceC1436k2, (InterfaceC1436k) objM6514H7, c21088i, null, c6021p, 0, 48, 62576);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(i10, i11, interfaceC10459q, str, str2, list);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22320b(String str, String messageId, List charts, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(charts, "charts");
        c6021p.m6526U(-320902455);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(charts) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (str == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C21880b(i10, 0, interfaceC10459q, str, messageId, charts);
                    return;
                }
                return;
            }
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            InterfaceC10459q interfaceC10459qM11256p = AbstractC10844c.m11256p(interfaceC10459q, AbstractC19536b.f62066a);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11256p);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1648124795);
            int i14 = 0;
            for (Object obj : charts) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                long jM4722a = AbstractC4031c1.m4722a(c6021p);
                float f10 = f69380a;
                m22319a(str, messageId, charts, i14, AbstractC10833a.m11207b(AbstractC8079e5.m8501a(AbstractC8443A.m9045a(c10456n, 0.0f, jM4722a, AbstractC20417e.m21079a(f10)), AbstractC20417e.m21079a(f10)), C14365u.f45055e, AbstractC14334L.f44973a), c6021p, i12 & 1022);
                i14 = i15;
                c10456n = c10456n;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C21880b(i10, 1, interfaceC10459q, str, messageId, charts);
        }
    }
}
