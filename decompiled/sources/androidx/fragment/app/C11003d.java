package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.C11119a;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p183H4.C3227b;
import p379Pb.LVf.efyhmdM;
import p571X9.AbstractC9306j0;
import p588Y2.AbstractC9615T;
import p588Y2.AbstractC9634r;
import p588Y2.C9599C;
import p588Y2.C9606J;
import p588Y2.C9609M;
import p588Y2.C9611O;
import p588Y2.C9614S;
import p588Y2.C9616U;
import p588Y2.C9624h;
import p588Y2.C9633q;
import p588Y2.C9637u;
import p588Y2.InterfaceC9608L;
import p611Z2.AbstractC10151d;
import p611Z2.C10148a;
import p611Z2.C10150c;
import p658b5.C11234e;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11003d {

    /* JADX INFO: renamed from: a */
    public final C11234e f33210a;

    /* JADX INFO: renamed from: b */
    public final C11004e f33211b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC11000a f33212c;

    /* JADX INFO: renamed from: d */
    public boolean f33213d = false;

    /* JADX INFO: renamed from: e */
    public int f33214e = -1;

    public C11003d(C11234e c11234e, C11004e c11004e, AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        this.f33210a = c11234e;
        this.f33211b = c11004e;
        this.f33212c = abstractComponentCallbacksC11000a;
    }

    /* JADX INFO: renamed from: a */
    public final void m11817a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC11000a);
        }
        Bundle bundle = abstractComponentCallbacksC11000a.f33145Z;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC11000a.f33124F0.m11775L();
        abstractComponentCallbacksC11000a.f33143Y = 3;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10185w();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC11000a);
        }
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            Bundle bundle2 = abstractComponentCallbacksC11000a.f33145Z;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC11000a.f33153o0;
            if (sparseArray != null) {
                abstractComponentCallbacksC11000a.f33135Q0.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC11000a.f33153o0 = null;
            }
            abstractComponentCallbacksC11000a.f33133O0 = false;
            abstractComponentCallbacksC11000a.mo10181J(bundle3);
            if (!abstractComponentCallbacksC11000a.f33133O0) {
                throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
                abstractComponentCallbacksC11000a.f33146Z0.m10151d(EnumC11103l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC11000a.f33145Z = null;
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(4);
        this.f33210a.m12506e(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m11818b() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a;
        View view;
        View view2;
        int iIndexOfChild = -1;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = this.f33212c;
        View view3 = abstractComponentCallbacksC11000a2.f33134P0;
        while (true) {
            abstractComponentCallbacksC11000a = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 = tag instanceof AbstractComponentCallbacksC11000a ? (AbstractComponentCallbacksC11000a) tag : null;
            if (abstractComponentCallbacksC11000a3 != null) {
                abstractComponentCallbacksC11000a = abstractComponentCallbacksC11000a3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a4 = abstractComponentCallbacksC11000a2.f33125G0;
        if (abstractComponentCallbacksC11000a != null && !abstractComponentCallbacksC11000a.equals(abstractComponentCallbacksC11000a4)) {
            int i10 = abstractComponentCallbacksC11000a2.f33127I0;
            C10150c c10150c = AbstractC10151d.f30080a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(abstractComponentCallbacksC11000a2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(abstractComponentCallbacksC11000a);
            sb2.append(" via container with ID ");
            AbstractC10151d.m10750b(new C10148a(abstractComponentCallbacksC11000a2, AbstractC10763a.m11056n(sb2, i10, " without using parent's childFragmentManager")));
            AbstractC10151d.m10749a(abstractComponentCallbacksC11000a2).getClass();
        }
        C11004e c11004e = this.f33211b;
        c11004e.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC11000a2.f33134P0;
        if (viewGroup != null) {
            ArrayList arrayList = c11004e.f33215a;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC11000a2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a5 = (AbstractComponentCallbacksC11000a) arrayList.get(i11);
                if (abstractComponentCallbacksC11000a5.f33134P0 == viewGroup && (view2 = abstractComponentCallbacksC11000a5.f33135Q0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a6 = (AbstractComponentCallbacksC11000a) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC11000a6.f33134P0 == viewGroup && (view = abstractComponentCallbacksC11000a6.f33135Q0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC11000a2.f33134P0.addView(abstractComponentCallbacksC11000a2.f33135Q0, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m11819c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC11000a);
        }
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = abstractComponentCallbacksC11000a.f33157s0;
        C11003d c11003d = null;
        C11004e c11004e = this.f33211b;
        if (abstractComponentCallbacksC11000a2 != null) {
            C11003d c11003d2 = (C11003d) c11004e.f33216b.get(abstractComponentCallbacksC11000a2.f33155q0);
            if (c11003d2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC11000a + " declared target fragment " + abstractComponentCallbacksC11000a.f33157s0 + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC11000a.f33158t0 = abstractComponentCallbacksC11000a.f33157s0.f33155q0;
            abstractComponentCallbacksC11000a.f33157s0 = null;
            c11003d = c11003d2;
        } else {
            String str = abstractComponentCallbacksC11000a.f33158t0;
            if (str != null && (c11003d = (C11003d) c11004e.f33216b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(abstractComponentCallbacksC11000a);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC9306j0.m9891j(abstractComponentCallbacksC11000a.f33158t0, " that does not belong to this FragmentManager!", sb2));
            }
        }
        if (c11003d != null) {
            c11003d.m11827k();
        }
        AbstractC11002c abstractC11002c = abstractComponentCallbacksC11000a.f33122D0;
        abstractComponentCallbacksC11000a.f33123E0 = abstractC11002c.f33204u;
        abstractComponentCallbacksC11000a.f33125G0 = abstractC11002c.f33206w;
        C11234e c11234e = this.f33210a;
        c11234e.m12512l(false);
        ArrayList arrayList = abstractComponentCallbacksC11000a.f33151e1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9634r) it.next()).mo10189a();
        }
        arrayList.clear();
        abstractComponentCallbacksC11000a.f33124F0.m11791b(abstractComponentCallbacksC11000a.f33123E0, abstractComponentCallbacksC11000a.mo10184j(), abstractComponentCallbacksC11000a);
        abstractComponentCallbacksC11000a.f33143Y = 0;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10186y(abstractComponentCallbacksC11000a.f33123E0.f29051Z);
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC11000a.f33122D0.f33197n.iterator();
        while (it2.hasNext()) {
            ((InterfaceC9608L) it2.next()).mo10147b();
        }
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(0);
        c11234e.m12507f(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m11821e() {
        Bundle bundle;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC11000a);
        }
        Bundle bundle2 = abstractComponentCallbacksC11000a.f33145Z;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC11000a.f33140V0) {
            abstractComponentCallbacksC11000a.f33143Y = 1;
            Bundle bundle4 = abstractComponentCallbacksC11000a.f33145Z;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC11000a.f33124F0.m11781R(bundle);
            C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
            c9606j.f33175F = false;
            c9606j.f33176G = false;
            c9606j.f33182M.f33117g = false;
            c9606j.m11810t(1);
            return;
        }
        C11234e c11234e = this.f33210a;
        c11234e.m12513m(false);
        abstractComponentCallbacksC11000a.f33124F0.m11775L();
        abstractComponentCallbacksC11000a.f33143Y = 1;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.f33144Y0.mo7806a(new C3227b(abstractComponentCallbacksC11000a, 1));
        abstractComponentCallbacksC11000a.mo5187z(bundle3);
        abstractComponentCallbacksC11000a.f33140V0 = true;
        if (abstractComponentCallbacksC11000a.f33133O0) {
            abstractComponentCallbacksC11000a.f33144Y0.m12170f(EnumC11103l.ON_CREATE);
            c11234e.m12508h(false);
        } else {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11822f() {
        String resourceName;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (abstractComponentCallbacksC11000a.f33163y0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC11000a);
        }
        Bundle bundle = abstractComponentCallbacksC11000a.f33145Z;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo10177E = abstractComponentCallbacksC11000a.mo10177E(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = abstractComponentCallbacksC11000a.f33127I0;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC11000a + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC11000a.f33122D0.f33205v.mo10173c(i10);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC11000a.f33119A0) {
                        try {
                            resourceName = abstractComponentCallbacksC11000a.m11743M().getResources().getResourceName(abstractComponentCallbacksC11000a.f33127I0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC11000a.f33127I0) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC11000a);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C10150c c10150c = AbstractC10151d.f30080a;
                    AbstractC10151d.m10750b(new C10148a(abstractComponentCallbacksC11000a, "Attempting to add fragment " + abstractComponentCallbacksC11000a + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC10151d.m10749a(abstractComponentCallbacksC11000a).getClass();
                }
            }
        }
        abstractComponentCallbacksC11000a.f33134P0 = viewGroup;
        abstractComponentCallbacksC11000a.mo10182K(layoutInflaterMo10177E, viewGroup, bundle2);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC11000a);
            }
            abstractComponentCallbacksC11000a.f33135Q0.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC11000a.f33135Q0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC11000a);
            if (viewGroup != null) {
                m11818b();
            }
            if (abstractComponentCallbacksC11000a.f33129K0) {
                abstractComponentCallbacksC11000a.f33135Q0.setVisibility(8);
            }
            View view = abstractComponentCallbacksC11000a.f33135Q0;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (view.isAttachedToWindow()) {
                AbstractC0728I.m1543c(abstractComponentCallbacksC11000a.f33135Q0);
            } else {
                View view2 = abstractComponentCallbacksC11000a.f33135Q0;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(view2, 4));
            }
            Bundle bundle3 = abstractComponentCallbacksC11000a.f33145Z;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC11000a.f33124F0.m11810t(2);
            this.f33210a.m12518r(false);
            int visibility = abstractComponentCallbacksC11000a.f33135Q0.getVisibility();
            abstractComponentCallbacksC11000a.m11749l().f29044j = abstractComponentCallbacksC11000a.f33135Q0.getAlpha();
            if (abstractComponentCallbacksC11000a.f33134P0 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC11000a.f33135Q0.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC11000a.m11749l().f29045k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC11000a);
                    }
                }
                abstractComponentCallbacksC11000a.f33135Q0.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC11000a.f33143Y = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m11823g() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11835b;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC11000a);
        }
        boolean zIsChangingConfigurations = true;
        boolean z6 = abstractComponentCallbacksC11000a.f33162x0 && !abstractComponentCallbacksC11000a.m11759v();
        C11004e c11004e = this.f33211b;
        if (z6) {
            c11004e.m11842i(abstractComponentCallbacksC11000a.f33155q0, null);
        }
        if (!z6) {
            FragmentManagerViewModel fragmentManagerViewModel = c11004e.f33218d;
            if (!((fragmentManagerViewModel.f33112b.containsKey(abstractComponentCallbacksC11000a.f33155q0) && fragmentManagerViewModel.f33115e) ? fragmentManagerViewModel.f33116f : true)) {
                String str = abstractComponentCallbacksC11000a.f33158t0;
                if (str != null && (abstractComponentCallbacksC11000aM11835b = c11004e.m11835b(str)) != null && abstractComponentCallbacksC11000aM11835b.f33131M0) {
                    abstractComponentCallbacksC11000a.f33157s0 = abstractComponentCallbacksC11000aM11835b;
                }
                abstractComponentCallbacksC11000a.f33143Y = 0;
                return;
            }
        }
        C9637u c9637u = abstractComponentCallbacksC11000a.f33123E0;
        if (c9637u instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = c11004e.f33218d.f33116f;
        } else {
            AbstractActivityC11001b abstractActivityC11001b = c9637u.f29051Z;
            if (abstractActivityC11001b instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC11001b.isChangingConfigurations();
            }
        }
        if (z6 || zIsChangingConfigurations) {
            c11004e.f33218d.m11735f(abstractComponentCallbacksC11000a, false);
        }
        abstractComponentCallbacksC11000a.f33124F0.m11801k();
        abstractComponentCallbacksC11000a.f33144Y0.m12170f(EnumC11103l.ON_DESTROY);
        abstractComponentCallbacksC11000a.f33143Y = 0;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.f33140V0 = false;
        abstractComponentCallbacksC11000a.mo5182B();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onDestroy()");
        }
        this.f33210a.m12509i(false);
        for (C11003d c11003d : c11004e.m11837d()) {
            if (c11003d != null) {
                String str2 = abstractComponentCallbacksC11000a.f33155q0;
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
                if (str2.equals(abstractComponentCallbacksC11000a2.f33158t0)) {
                    abstractComponentCallbacksC11000a2.f33157s0 = abstractComponentCallbacksC11000a;
                    abstractComponentCallbacksC11000a2.f33158t0 = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC11000a.f33158t0;
        if (str3 != null) {
            abstractComponentCallbacksC11000a.f33157s0 = c11004e.m11835b(str3);
        }
        c11004e.m11841h(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m11824h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC11000a);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup != null && (view = abstractComponentCallbacksC11000a.f33135Q0) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC11000a.f33124F0.m11810t(1);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            C9611O c9611o = abstractComponentCallbacksC11000a.f33146Z0;
            c9611o.m10153f();
            if (c9611o.f28941q0.f33504d.compareTo(EnumC11104m.f33476o0) >= 0) {
                abstractComponentCallbacksC11000a.f33146Z0.m10151d(EnumC11103l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC11000a.f33143Y = 1;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10175C();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onDestroyView()");
        }
        new C11119a(abstractComponentCallbacksC11000a, abstractComponentCallbacksC11000a.mo10152e()).m12178c();
        abstractComponentCallbacksC11000a.f33120B0 = false;
        this.f33210a.m12519s(false);
        abstractComponentCallbacksC11000a.f33134P0 = null;
        abstractComponentCallbacksC11000a.f33135Q0 = null;
        abstractComponentCallbacksC11000a.f33146Z0 = null;
        abstractComponentCallbacksC11000a.f33147a1.mo12122j(null);
        abstractComponentCallbacksC11000a.f33164z0 = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m11825i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.f33143Y = -1;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10176D();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onDetach()");
        }
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        if (!c9606j.f33177H) {
            c9606j.m11801k();
            abstractComponentCallbacksC11000a.f33124F0 = new C9606J();
        }
        this.f33210a.m12510j(false);
        abstractComponentCallbacksC11000a.f33143Y = -1;
        abstractComponentCallbacksC11000a.f33123E0 = null;
        abstractComponentCallbacksC11000a.f33125G0 = null;
        abstractComponentCallbacksC11000a.f33122D0 = null;
        if (!abstractComponentCallbacksC11000a.f33162x0 || abstractComponentCallbacksC11000a.m11759v()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.f33211b.f33218d;
            boolean z6 = true;
            if (fragmentManagerViewModel.f33112b.containsKey(abstractComponentCallbacksC11000a.f33155q0) && fragmentManagerViewModel.f33115e) {
                z6 = fragmentManagerViewModel.f33116f;
            }
            if (!z6) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.m11756s();
    }

    /* JADX INFO: renamed from: j */
    public final void m11826j() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (abstractComponentCallbacksC11000a.f33163y0 && abstractComponentCallbacksC11000a.f33164z0 && !abstractComponentCallbacksC11000a.f33120B0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC11000a);
            }
            Bundle bundle = abstractComponentCallbacksC11000a.f33145Z;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC11000a.mo10182K(abstractComponentCallbacksC11000a.mo10177E(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC11000a.f33135Q0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC11000a.f33135Q0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC11000a);
                if (abstractComponentCallbacksC11000a.f33129K0) {
                    abstractComponentCallbacksC11000a.f33135Q0.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC11000a.f33145Z;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC11000a.f33124F0.m11810t(2);
                this.f33210a.m12518r(false);
                abstractComponentCallbacksC11000a.f33143Y = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11827k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C11004e c11004e = this.f33211b;
        boolean z6 = this.f33213d;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (z6) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC11000a);
                return;
            }
            return;
        }
        try {
            this.f33213d = true;
            boolean z10 = false;
            while (true) {
                int iM11820d = m11820d();
                int i10 = abstractComponentCallbacksC11000a.f33143Y;
                int i11 = 3;
                if (iM11820d == i10) {
                    if (!z10 && i10 == -1 && abstractComponentCallbacksC11000a.f33162x0 && !abstractComponentCallbacksC11000a.m11759v()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC11000a);
                        }
                        c11004e.f33218d.m11735f(abstractComponentCallbacksC11000a, true);
                        c11004e.m11841h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC11000a);
                        }
                        abstractComponentCallbacksC11000a.m11756s();
                    }
                    if (abstractComponentCallbacksC11000a.f33139U0) {
                        if (abstractComponentCallbacksC11000a.f33135Q0 != null && (viewGroup = abstractComponentCallbacksC11000a.f33134P0) != null) {
                            C9624h c9624hM10165g = C9624h.m10165g(viewGroup, abstractComponentCallbacksC11000a.m11754q());
                            if (abstractComponentCallbacksC11000a.f33129K0) {
                                c9624hM10165g.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC11000a);
                                }
                                c9624hM10165g.m10166a(3, 1, this);
                            } else {
                                c9624hM10165g.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC11000a);
                                }
                                c9624hM10165g.m10166a(2, 1, this);
                            }
                        }
                        AbstractC11002c abstractC11002c = abstractComponentCallbacksC11000a.f33122D0;
                        if (abstractC11002c != null && abstractComponentCallbacksC11000a.f33161w0 && AbstractC11002c.m11763G(abstractComponentCallbacksC11000a)) {
                            abstractC11002c.f33174E = true;
                        }
                        abstractComponentCallbacksC11000a.f33139U0 = false;
                        abstractComponentCallbacksC11000a.f33124F0.m11804n();
                    }
                    this.f33213d = false;
                    return;
                }
                if (iM11820d <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m11825i();
                            break;
                        case 0:
                            m11823g();
                            break;
                        case 1:
                            m11824h();
                            abstractComponentCallbacksC11000a.f33143Y = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC11000a.f33164z0 = false;
                            abstractComponentCallbacksC11000a.f33143Y = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC11000a);
                            }
                            if (abstractComponentCallbacksC11000a.f33135Q0 != null && abstractComponentCallbacksC11000a.f33153o0 == null) {
                                m11831o();
                            }
                            if (abstractComponentCallbacksC11000a.f33135Q0 != null && (viewGroup2 = abstractComponentCallbacksC11000a.f33134P0) != null) {
                                C9624h c9624hM10165g2 = C9624h.m10165g(viewGroup2, abstractComponentCallbacksC11000a.m11754q());
                                c9624hM10165g2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC11000a);
                                }
                                c9624hM10165g2.m10166a(1, 3, this);
                            }
                            abstractComponentCallbacksC11000a.f33143Y = 3;
                            break;
                        case 4:
                            m11833q();
                            break;
                        case 5:
                            abstractComponentCallbacksC11000a.f33143Y = 5;
                            break;
                        case 6:
                            m11828l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m11819c();
                            break;
                        case 1:
                            m11821e();
                            break;
                        case 2:
                            m11826j();
                            m11822f();
                            break;
                        case 3:
                            m11817a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC11000a.f33135Q0 != null && (viewGroup3 = abstractComponentCallbacksC11000a.f33134P0) != null) {
                                C9624h c9624hM10165g3 = C9624h.m10165g(viewGroup3, abstractComponentCallbacksC11000a.m11754q());
                                int visibility = abstractComponentCallbacksC11000a.f33135Q0.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                c9624hM10165g3.m10167b(i11, this);
                            }
                            abstractComponentCallbacksC11000a.f33143Y = 4;
                            break;
                        case 5:
                            m11832p();
                            break;
                        case 6:
                            abstractComponentCallbacksC11000a.f33143Y = 6;
                            break;
                        case 7:
                            m11830n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f33213d = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11828l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.f33124F0.m11810t(5);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            abstractComponentCallbacksC11000a.f33146Z0.m10151d(EnumC11103l.ON_PAUSE);
        }
        abstractComponentCallbacksC11000a.f33144Y0.m12170f(EnumC11103l.ON_PAUSE);
        abstractComponentCallbacksC11000a.f33143Y = 6;
        abstractComponentCallbacksC11000a.f33133O0 = true;
        this.f33210a.m12511k(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m11829m(ClassLoader classLoader) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        Bundle bundle = abstractComponentCallbacksC11000a.f33145Z;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC11000a.f33145Z.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC11000a.f33145Z.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC11000a.f33153o0 = abstractComponentCallbacksC11000a.f33145Z.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC11000a.f33154p0 = abstractComponentCallbacksC11000a.f33145Z.getBundle("viewRegistryState");
        C9609M c9609m = (C9609M) abstractComponentCallbacksC11000a.f33145Z.getParcelable("state");
        if (c9609m != null) {
            abstractComponentCallbacksC11000a.f33158t0 = c9609m.f28925x0;
            abstractComponentCallbacksC11000a.f33159u0 = c9609m.f28926y0;
            abstractComponentCallbacksC11000a.f33137S0 = c9609m.f28927z0;
        }
        if (abstractComponentCallbacksC11000a.f33137S0) {
            return;
        }
        abstractComponentCallbacksC11000a.f33136R0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX INFO: renamed from: n */
    public final void m11830n() {
        boolean zRequestFocus;
        String str;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC11000a);
        }
        C9633q c9633q = abstractComponentCallbacksC11000a.f33138T0;
        View view = c9633q == null ? null : c9633q.f29045k;
        if (view != null) {
            if (view == abstractComponentCallbacksC11000a.f33135Q0) {
                zRequestFocus = view.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(view);
                    sb2.append(Separators.f31991SP);
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(abstractComponentCallbacksC11000a);
                    sb2.append(" resulting in focused view ");
                    sb2.append(abstractComponentCallbacksC11000a.f33135Q0.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC11000a.f33135Q0) {
                            zRequestFocus = view.requestFocus();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb3.append(view);
                                sb3.append(Separators.f31991SP);
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb3.append(str);
                                sb3.append(" on Fragment ");
                                sb3.append(abstractComponentCallbacksC11000a);
                                sb3.append(" resulting in focused view ");
                                sb3.append(abstractComponentCallbacksC11000a.f33135Q0.findFocus());
                                Log.v("FragmentManager", sb3.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC11000a.m11749l().f29045k = null;
        abstractComponentCallbacksC11000a.f33124F0.m11775L();
        abstractComponentCallbacksC11000a.f33124F0.m11815y(true);
        abstractComponentCallbacksC11000a.f33143Y = 7;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo5183F();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onResume()");
        }
        C11114w c11114w = abstractComponentCallbacksC11000a.f33144Y0;
        EnumC11103l enumC11103l = EnumC11103l.ON_RESUME;
        c11114w.m12170f(enumC11103l);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            abstractComponentCallbacksC11000a.f33146Z0.f28941q0.m12170f(enumC11103l);
        }
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(7);
        this.f33210a.m12514n(false);
        this.f33211b.m11842i(abstractComponentCallbacksC11000a.f33155q0, null);
        abstractComponentCallbacksC11000a.f33145Z = null;
        abstractComponentCallbacksC11000a.f33153o0 = null;
        abstractComponentCallbacksC11000a.f33154p0 = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m11831o() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (abstractComponentCallbacksC11000a.f33135Q0 == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC11000a + " with view " + abstractComponentCallbacksC11000a.f33135Q0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC11000a.f33135Q0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC11000a.f33153o0 = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC11000a.f33146Z0.f28942r0.m351u(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC11000a.f33154p0 = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m11832p() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.f33124F0.m11775L();
        abstractComponentCallbacksC11000a.f33124F0.m11815y(true);
        abstractComponentCallbacksC11000a.f33143Y = 5;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10179H();
        if (!abstractComponentCallbacksC11000a.f33133O0) {
            throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onStart()");
        }
        C11114w c11114w = abstractComponentCallbacksC11000a.f33144Y0;
        EnumC11103l enumC11103l = EnumC11103l.ON_START;
        c11114w.m12170f(enumC11103l);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            abstractComponentCallbacksC11000a.f33146Z0.f28941q0.m12170f(enumC11103l);
        }
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(5);
        this.f33210a.m12516p(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m11833q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC11000a);
        }
        C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
        c9606j.f33176G = true;
        c9606j.f33182M.f33117g = true;
        c9606j.m11810t(4);
        if (abstractComponentCallbacksC11000a.f33135Q0 != null) {
            abstractComponentCallbacksC11000a.f33146Z0.m10151d(EnumC11103l.ON_STOP);
        }
        abstractComponentCallbacksC11000a.f33144Y0.m12170f(EnumC11103l.ON_STOP);
        abstractComponentCallbacksC11000a.f33143Y = 4;
        abstractComponentCallbacksC11000a.f33133O0 = false;
        abstractComponentCallbacksC11000a.mo10180I();
        if (abstractComponentCallbacksC11000a.f33133O0) {
            this.f33210a.m12517q(false);
            return;
        }
        throw new C9616U("Fragment " + abstractComponentCallbacksC11000a + " did not call through to super.onStop()");
    }

    /* JADX INFO: renamed from: d */
    public final int m11820d() {
        Object next;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33212c;
        if (abstractComponentCallbacksC11000a.f33122D0 == null) {
            return abstractComponentCallbacksC11000a.f33143Y;
        }
        int iMin = this.f33214e;
        int iOrdinal = abstractComponentCallbacksC11000a.f33142X0.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC11000a.f33163y0) {
            if (abstractComponentCallbacksC11000a.f33164z0) {
                iMin = Math.max(this.f33214e, 2);
                View view = abstractComponentCallbacksC11000a.f33135Q0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f33214e < 4 ? Math.min(iMin, abstractComponentCallbacksC11000a.f33143Y) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC11000a.f33161w0) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup != null) {
            C9624h c9624hM10165g = C9624h.m10165g(viewGroup, abstractComponentCallbacksC11000a.m11754q());
            c9624hM10165g.getClass();
            C9614S c9614sM10170e = c9624hM10165g.m10170e(abstractComponentCallbacksC11000a);
            int i11 = c9614sM10170e != null ? c9614sM10170e.f28949b : 0;
            Iterator it = c9624hM10165g.f29005c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C9614S c9614s = (C9614S) next;
                if (AbstractC16544l.m18089b(c9614s.f28950c, abstractComponentCallbacksC11000a) && !c9614s.f28953f) {
                    break;
                }
            }
            C9614S c9614s2 = (C9614S) next;
            i10 = c9614s2 != null ? c9614s2.f28949b : 0;
            int i12 = i11 == 0 ? -1 : AbstractC9615T.f28956a[AbstractC0010F.m24h(i11)];
            if (i12 != -1 && i12 != 1) {
                i10 = i11;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC11000a.f33162x0) {
            iMin = abstractComponentCallbacksC11000a.m11759v() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC11000a.f33136R0 && abstractComponentCallbacksC11000a.f33143Y < 5) {
            iMin = Math.min(iMin, 4);
        }
        String str = efyhmdM.pAMAxUeIoFhcm;
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC11000a);
        }
        return iMin;
    }

    public C11003d(C11234e c11234e, C11004e c11004e, ClassLoader classLoader, C9599C c9599c, Bundle bundle) {
        this.f33210a = c11234e;
        this.f33211b = c11004e;
        C9609M c9609m = (C9609M) bundle.getParcelable("state");
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM10146a = c9599c.m10146a(c9609m.f28914Y);
        abstractComponentCallbacksC11000aM10146a.f33155q0 = c9609m.f28915Z;
        abstractComponentCallbacksC11000aM10146a.f33163y0 = c9609m.f28916o0;
        abstractComponentCallbacksC11000aM10146a.f33119A0 = true;
        abstractComponentCallbacksC11000aM10146a.f33126H0 = c9609m.f28917p0;
        abstractComponentCallbacksC11000aM10146a.f33127I0 = c9609m.f28918q0;
        abstractComponentCallbacksC11000aM10146a.f33128J0 = c9609m.f28919r0;
        abstractComponentCallbacksC11000aM10146a.f33131M0 = c9609m.f28920s0;
        abstractComponentCallbacksC11000aM10146a.f33162x0 = c9609m.f28921t0;
        abstractComponentCallbacksC11000aM10146a.f33130L0 = c9609m.f28922u0;
        abstractComponentCallbacksC11000aM10146a.f33129K0 = c9609m.f28923v0;
        abstractComponentCallbacksC11000aM10146a.f33142X0 = EnumC11104m.values()[c9609m.f28924w0];
        abstractComponentCallbacksC11000aM10146a.f33158t0 = c9609m.f28925x0;
        abstractComponentCallbacksC11000aM10146a.f33159u0 = c9609m.f28926y0;
        abstractComponentCallbacksC11000aM10146a.f33137S0 = c9609m.f28927z0;
        this.f33212c = abstractComponentCallbacksC11000aM10146a;
        abstractComponentCallbacksC11000aM10146a.f33145Z = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC11000aM10146a.m11746P(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC11000aM10146a);
        }
    }

    public C11003d(C11234e c11234e, C11004e c11004e, AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, Bundle bundle) {
        this.f33210a = c11234e;
        this.f33211b = c11004e;
        this.f33212c = abstractComponentCallbacksC11000a;
        abstractComponentCallbacksC11000a.f33153o0 = null;
        abstractComponentCallbacksC11000a.f33154p0 = null;
        abstractComponentCallbacksC11000a.f33121C0 = 0;
        abstractComponentCallbacksC11000a.f33164z0 = false;
        abstractComponentCallbacksC11000a.f33161w0 = false;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = abstractComponentCallbacksC11000a.f33157s0;
        abstractComponentCallbacksC11000a.f33158t0 = abstractComponentCallbacksC11000a2 != null ? abstractComponentCallbacksC11000a2.f33155q0 : null;
        abstractComponentCallbacksC11000a.f33157s0 = null;
        abstractComponentCallbacksC11000a.f33145Z = bundle;
        abstractComponentCallbacksC11000a.f33156r0 = bundle.getBundle("arguments");
    }
}
