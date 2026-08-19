package p544W9;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p003A1.C0257i0;
import p006A4.C0349j;
import p017Af.C0468O;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p124Ei.C2446D;
import p204I1.C3590f;
import p219Ig.C3713b;
import p219Ig.InterfaceC3717f;
import p219Ig.InterfaceC3718g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8152n6;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9262b4;
import p594Y9.AbstractC9740H4;
import p594Y9.AbstractC9793Q3;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p769gj.AbstractC14158L;
import p769gj.C14156J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: W9.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8724v {
    /* JADX INFO: renamed from: a */
    public static final void m9443a(InterfaceC10459q interfaceC10459q, DeactivatedAccountViewModel deactivatedAccountViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        DeactivatedAccountViewModel deactivatedAccountViewModel2;
        InterfaceC10459q interfaceC10459q3;
        DeactivatedAccountViewModel deactivatedAccountViewModel3;
        c6021p.m6526U(1444342497);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            deactivatedAccountViewModel3 = deactivatedAccountViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), InterfaceC3718g.class));
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
                Object objMo5693b = c16527d.mo5693b(DeactivatedAccountViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(InterfaceC3718g.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(InterfaceC3718g.class), c16527d.mo5693b(DeactivatedAccountViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(DeactivatedAccountViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                deactivatedAccountViewModel2 = (DeactivatedAccountViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                deactivatedAccountViewModel2 = deactivatedAccountViewModel;
            }
            c6021p.m6554q();
            InterfaceC3718g interfaceC3718g = (InterfaceC3718g) AbstractC9112C3.m9642d(deactivatedAccountViewModel2.f40343c, c6021p).getValue();
            int i13 = (i11 & 14) | 905969664;
            AbstractC8680n3.m9368a(interfaceC10459q2, 0L, null, 0.0f, null, false, null, null, AbstractC8411c.m8969c(1860394646, c6021p, new C3713b(interfaceC3718g, 0)), AbstractC8411c.m8969c(-1179790633, c6021p, new C0349j(interfaceC3718g, 12, deactivatedAccountViewModel2)), AbstractC8411c.m8969c(-2113065707, c6021p, new C0468O(interfaceC3718g, 9)), c6021p, i13, 6, 254);
            interfaceC10459q3 = interfaceC10459q2;
            deactivatedAccountViewModel3 = deactivatedAccountViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q3, deactivatedAccountViewModel3, i10, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9444b(C21891A c21891a, C6021p c6021p, int i10) {
        int i11;
        String str;
        c6021p.m6526U(-372340835);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c21891a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23201f);
            C10450h c10450h = C10444b.f30944w0;
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            AbstractC9793Q3.m10411a(c21891a.m22323b(), c21891a.m22331j(), AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23188e), null, 0L, c6021p, 0);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C22038o c22038o = c21891a.f69415a;
            if (c22038o == null || (str = c22038o.f69715e) == null) {
                str = c21891a.f69416b.f69658d;
            }
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, 0, 3072, 57342);
            Integer numM8701f = AbstractC8152n6.m8701f(c21891a);
            c6021p.m6524S(-1092450585);
            if (numM8701f != null) {
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(numM8701f.intValue(), c6021p), AbstractC9262b4.m9836a(c10456n, c21891a.m22329h()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12154j, c6021p, 0, 3072, 57340);
            }
            AbstractC3794B0.m4471F(c6021p, false, true, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(c21891a, i10, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9445c(InterfaceC3717f interfaceC3717f, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-515219610);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(interfaceC3717f) : c6021p.m6545h(interfaceC3717f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1328427336);
            AbstractC16544l.m18094g(interfaceC3717f, "<this>");
            ArrayList arrayListM19384m = AbstractC17681o.m19384m(Integer.valueOf(R.string.deactivated_account_history_unavailable_disclaimer), Integer.valueOf(R.string.deactivated_account_other_workspaces_disclaimer));
            if (interfaceC3717f.mo4416b()) {
                arrayListM19384m.add(Integer.valueOf(R.string.deactivated_account_personal_workspace_disclaimer));
            }
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19384m, 10));
            Iterator it = arrayListM19384m.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8142m4.m8676d(((Number) it.next()).intValue(), c6021p));
            }
            c6021p.m6553p(false);
            C3590f c3590fM10330e = AbstractC9740H4.m10330e(arrayList);
            String strM8676d = AbstractC8142m4.m8676d(R.string.deactivated_account_team_deactivated_header, c6021p);
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, 0, 0, 65534);
            AbstractC4124r4.m4769c(c3590fM10330e, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12154j, c6021p, 0, 0, 131070);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(interfaceC3717f, i10, 6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9446d(int i10, C6021p c6021p) {
        c6021p.m6526U(-218490657);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23201f);
            C10450h c10450h = C10444b.f30944w0;
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.suitcase_filled, c6021p, 0), null, AbstractC9818V.m10458b(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23188e), true, false, 0.0f, 14), 0L, c6021p, 48, 8);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            String strM8676d = AbstractC8142m4.m8676d(R.string.deactivated_account_placeholder_name, c6021p);
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d, AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12151g, c6021p, 0, 3072, 57340);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.settings_account_deactivated, c6021p), AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12154j, c6021p, 0, 3072, 57340);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC14158L m9447e(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        AbstractC14158L abstractC14158LM9449g = m9449g(view);
        if (abstractC14158LM9449g != null) {
            return abstractC14158LM9449g;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    /* JADX INFO: renamed from: f */
    public static final C14156J m9448f(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        AbstractC14158L abstractC14158LM9447e = m9447e(view);
        C14156J c14156j = abstractC14158LM9447e instanceof C14156J ? (C14156J) abstractC14158LM9447e : null;
        if (c14156j != null) {
            return c14156j;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC14158L m9449g(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        Object tag = view.getTag(R.id.workflow_ui_view_state);
        if (tag instanceof AbstractC14158L) {
            return (AbstractC14158L) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final void m9450h(View view, AbstractC14158L abstractC14158L) {
        AbstractC16544l.m18094g(view, "<this>");
        view.setTag(R.id.workflow_ui_view_state, abstractC14158L);
    }
}
