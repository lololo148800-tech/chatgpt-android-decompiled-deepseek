package p588Y2;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.fragment.app.C11003d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1072w2.C20791c;
import p1072w2.InterfaceC20790b;
import p239Ja.C4307j;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y2.S */
/* JADX INFO: loaded from: classes.dex */
public final class C9614S {

    /* JADX INFO: renamed from: a */
    public int f28948a;

    /* JADX INFO: renamed from: b */
    public int f28949b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC11000a f28950c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f28951d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f28952e;

    /* JADX INFO: renamed from: f */
    public boolean f28953f;

    /* JADX INFO: renamed from: g */
    public boolean f28954g;

    /* JADX INFO: renamed from: h */
    public final C11003d f28955h;

    public C9614S(int i10, int i11, C11003d fragmentStateManager, C20791c c20791c) {
        AbstractC14376f.m15825D(i10, "finalState");
        AbstractC14376f.m15825D(i11, "lifecycleImpact");
        AbstractC16544l.m18094g(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC11000a fragment = fragmentStateManager.f33212c;
        AbstractC16544l.m18093f(fragment, "fragmentStateManager.fragment");
        AbstractC14376f.m15825D(i10, "finalState");
        AbstractC14376f.m15825D(i11, "lifecycleImpact");
        AbstractC16544l.m18094g(fragment, "fragment");
        this.f28948a = i10;
        this.f28949b = i11;
        this.f28950c = fragment;
        this.f28951d = new ArrayList();
        this.f28952e = new LinkedHashSet();
        c20791c.m21308a(new C4307j(this, 14));
        this.f28955h = fragmentStateManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m10155a() {
        if (this.f28953f) {
            return;
        }
        this.f28953f = true;
        LinkedHashSet linkedHashSet = this.f28952e;
        if (linkedHashSet.isEmpty()) {
            m10156b();
            return;
        }
        for (C20791c c20791c : AbstractC17680n.m19326F0(linkedHashSet)) {
            synchronized (c20791c) {
                try {
                    if (!c20791c.f66051a) {
                        c20791c.f66051a = true;
                        c20791c.f66053c = true;
                        InterfaceC20790b interfaceC20790b = c20791c.f66052b;
                        if (interfaceC20790b != null) {
                            try {
                                interfaceC20790b.onCancel();
                            } catch (Throwable th2) {
                                synchronized (c20791c) {
                                    c20791c.f66053c = false;
                                    c20791c.notifyAll();
                                    throw th2;
                                }
                            }
                        }
                        synchronized (c20791c) {
                            c20791c.f66053c = false;
                            c20791c.notifyAll();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10156b() {
        if (!this.f28954g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f28954g = true;
            Iterator it = this.f28951d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f28955h.m11827k();
    }

    /* JADX INFO: renamed from: c */
    public final void m10157c(int i10, int i11) {
        AbstractC14376f.m15825D(i10, "finalState");
        AbstractC14376f.m15825D(i11, "lifecycleImpact");
        int iM24h = AbstractC0010F.m24h(i11);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f28950c;
        if (iM24h == 0) {
            if (this.f28948a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC11000a + " mFinalState = " + AbstractC9306j0.m9901t(this.f28948a) + " -> " + AbstractC9306j0.m9901t(i10) + '.');
                }
                this.f28948a = i10;
                return;
            }
            return;
        }
        if (iM24h == 1) {
            if (this.f28948a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC11000a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC9306j0.m9900s(this.f28949b) + " to ADDING.");
                }
                this.f28948a = 2;
                this.f28949b = 2;
                return;
            }
            return;
        }
        if (iM24h != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC11000a + " mFinalState = " + AbstractC9306j0.m9901t(this.f28948a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC9306j0.m9900s(this.f28949b) + " to REMOVING.");
        }
        this.f28948a = 1;
        this.f28949b = 3;
    }

    /* JADX INFO: renamed from: d */
    public final void m10158d() {
        int i10 = this.f28949b;
        C11003d c11003d = this.f28955h;
        if (i10 != 2) {
            if (i10 == 3) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
                AbstractC16544l.m18093f(abstractComponentCallbacksC11000a, "fragmentStateManager.fragment");
                View viewM11744N = abstractComponentCallbacksC11000a.m11744N();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM11744N.findFocus() + " on view " + viewM11744N + " for Fragment " + abstractComponentCallbacksC11000a);
                }
                viewM11744N.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
        AbstractC16544l.m18093f(abstractComponentCallbacksC11000a2, "fragmentStateManager.fragment");
        View viewFindFocus = abstractComponentCallbacksC11000a2.f33135Q0.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC11000a2.m11749l().f29045k = viewFindFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC11000a2);
            }
        }
        View viewM11744N2 = this.f28950c.m11744N();
        if (viewM11744N2.getParent() == null) {
            c11003d.m11818b();
            viewM11744N2.setAlpha(0.0f);
        }
        if (viewM11744N2.getAlpha() == 0.0f && viewM11744N2.getVisibility() == 0) {
            viewM11744N2.setVisibility(4);
        }
        C9633q c9633q = abstractComponentCallbacksC11000a2.f33138T0;
        viewM11744N2.setAlpha(c9633q == null ? 1.0f : c9633q.f29044j);
    }

    public final String toString() {
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM11058p.append(AbstractC9306j0.m9901t(this.f28948a));
        sbM11058p.append(" lifecycleImpact = ");
        sbM11058p.append(AbstractC9306j0.m9900s(this.f28949b));
        sbM11058p.append(" fragment = ");
        sbM11058p.append(this.f28950c);
        sbM11058p.append('}');
        return sbM11058p.toString();
    }
}
