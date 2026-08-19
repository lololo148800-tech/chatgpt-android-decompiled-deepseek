package androidx.compose.p650ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p002A0.C0122V;
import p002A0.C0148y;
import p003A1.AbstractC0187M0;
import p003A1.C0196P0;
import p003A1.C0199Q0;
import p003A1.C0201R0;
import p003A1.C0244e0;
import p003A1.C0248f0;
import p003A1.C0254h0;
import p003A1.C0257i0;
import p003A1.C0271n;
import p003A1.C0280q;
import p003A1.C0299w0;
import p003A1.ComponentCallbacks2C0263k0;
import p003A1.ComponentCallbacks2C0266l0;
import p049Bm.InterfaceC1436k;
import p107E1.C2240d;
import p107E1.C2241e;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p562X0.AbstractC9018m;
import p562X0.C9017l;
import p562X0.InterfaceC9016k;
import p914o3.AbstractC17814e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m18067d2 = {"LO0/k0;", "Landroidx/lifecycle/u;", "getLocalLifecycleOwner", "()LO0/k0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    public static final C6037x f32824a = new C6037x(C0244e0.f922Z, C5975S.f19448r0);

    /* JADX INFO: renamed from: b */
    public static final C5984W0 f32825b = new C5984W0(C0244e0.f923o0);

    /* JADX INFO: renamed from: c */
    public static final C5984W0 f32826c = new C5984W0(C0244e0.f924p0);

    /* JADX INFO: renamed from: d */
    public static final C5984W0 f32827d = new C5984W0(C0244e0.f925q0);

    /* JADX INFO: renamed from: e */
    public static final C5984W0 f32828e = new C5984W0(C0244e0.f926r0);

    /* JADX INFO: renamed from: f */
    public static final C5984W0 f32829f = new C5984W0(C0244e0.f927s0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m11353a(AndroidComposeView androidComposeView, C8410b c8410b, C6021p c6021p, int i10) {
        LinkedHashMap linkedHashMap;
        int i11;
        boolean z6;
        int i12 = 0;
        c6021p.m6526U(1396852028);
        int i13 = (i10 & 6) == 0 ? (c6021p.m6545h(androidComposeView) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i13 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = androidComposeView.getContext();
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q(new Configuration(context.getResources().getConfiguration()), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = new C0248f0(interfaceC5985X, i12);
                c6021p.m6537c0(objM6514H2);
            }
            androidComposeView.setConfigurationChangeObserver((InterfaceC1436k) objM6514H2);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = new C0299w0(context);
                c6021p.m6537c0(objM6514H3);
            }
            C0299w0 c0299w0 = (C0299w0) objM6514H3;
            C0271n viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objM6514H4 = c6021p.m6514H();
            InterfaceC3232g interfaceC3232g = viewTreeOwners.f992b;
            if (objM6514H4 == obj) {
                Object parent = androidComposeView.getParent();
                AbstractC16544l.m18092e(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = InterfaceC9016k.class.getSimpleName() + ':' + strValueOf;
                C3231f c3231fMo4127h = interfaceC3232g.mo4127h();
                Bundle bundleM4122c = c3231fMo4127h.m4122c(str);
                if (bundleM4122c != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM4122c.keySet()) {
                        ArrayList parcelableArrayList = bundleM4122c.getParcelableArrayList(str2);
                        AbstractC16544l.m18092e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        bundleM4122c = bundleM4122c;
                    }
                } else {
                    linkedHashMap = null;
                }
                C0280q c0280q = C0280q.f1028r0;
                C5984W0 c5984w0 = AbstractC9018m.f27517a;
                C9017l c9017l = new C9017l(linkedHashMap, c0280q);
                try {
                    i11 = 0;
                    try {
                        c3231fMo4127h.m4125f(str, new C0199Q0(c9017l, i11));
                        z6 = 1;
                    } catch (IllegalArgumentException unused) {
                        z6 = i11;
                    }
                } catch (IllegalArgumentException unused2) {
                    i11 = 0;
                }
                objM6514H4 = new C0196P0(c9017l, new C0201R0(z6, c3231fMo4127h, str, i11));
                c6021p.m6537c0(objM6514H4);
            }
            Object obj2 = (C0196P0) objM6514H4;
            C17296C c17296c = C17296C.f55119a;
            boolean zM6545h = c6021p.m6545h(obj2);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                objM6514H5 = new C0254h0(obj2, 0);
                c6021p.m6537c0(objM6514H5);
            }
            C5997d.m6444c(c17296c, (InterfaceC1436k) objM6514H5, c6021p);
            Configuration configuration = (Configuration) interfaceC5985X.getValue();
            Object objM6514H6 = c6021p.m6514H();
            if (objM6514H6 == obj) {
                objM6514H6 = new C2240d();
                c6021p.m6537c0(objM6514H6);
            }
            C2240d c2240d = (C2240d) objM6514H6;
            Object objM6514H7 = c6021p.m6514H();
            Object obj3 = objM6514H7;
            if (objM6514H7 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c6021p.m6537c0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objM6514H8 = c6021p.m6514H();
            if (objM6514H8 == obj) {
                objM6514H8 = new ComponentCallbacks2C0263k0(configuration3, c2240d);
                c6021p.m6537c0(objM6514H8);
            }
            ComponentCallbacks2C0263k0 componentCallbacks2C0263k0 = (ComponentCallbacks2C0263k0) objM6514H8;
            boolean zM6545h2 = c6021p.m6545h(context);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6545h2 || objM6514H9 == obj) {
                objM6514H9 = new C0122V(context, 1, componentCallbacks2C0263k0);
                c6021p.m6537c0(objM6514H9);
            }
            C5997d.m6444c(c2240d, (InterfaceC1436k) objM6514H9, c6021p);
            Object objM6514H10 = c6021p.m6514H();
            if (objM6514H10 == obj) {
                objM6514H10 = new C2241e();
                c6021p.m6537c0(objM6514H10);
            }
            C2241e c2241e = (C2241e) objM6514H10;
            Object objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = new ComponentCallbacks2C0266l0(c2241e);
                c6021p.m6537c0(objM6514H11);
            }
            ComponentCallbacks2C0266l0 componentCallbacks2C0266l0 = (ComponentCallbacks2C0266l0) objM6514H11;
            boolean zM6545h3 = c6021p.m6545h(context);
            Object objM6514H12 = c6021p.m6514H();
            if (zM6545h3 || objM6514H12 == obj) {
                objM6514H12 = new C0122V(context, 2, componentCallbacks2C0266l0);
                c6021p.m6537c0(objM6514H12);
            }
            C5997d.m6444c(c2241e, (InterfaceC1436k) objM6514H12, c6021p);
            AbstractC6012k0 abstractC6012k0 = AbstractC0187M0.f718t;
            C5997d.m6442b(new C6014l0[]{f32824a.mo6405a((Configuration) interfaceC5985X.getValue()), f32825b.mo6405a(context), AbstractC17814e.f56807a.mo6405a(viewTreeOwners.f991a), f32828e.mo6405a(interfaceC3232g), AbstractC9018m.f27517a.mo6405a(obj2), f32829f.mo6405a(androidComposeView.getView()), f32826c.mo6405a(c2240d), f32827d.mo6405a(c2241e), abstractC6012k0.mo6405a(Boolean.valueOf(((Boolean) c6021p.m6548k(abstractC6012k0)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, AbstractC8411c.m8969c(1471621628, c6021p, new C0148y(androidComposeView, c0299w0, c8410b, 1)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(androidComposeView, c8410b, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11354b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC6012k0 getLocalLifecycleOwner() {
        return AbstractC17814e.f56807a;
    }
}
