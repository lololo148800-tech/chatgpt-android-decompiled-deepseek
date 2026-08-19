package p588Y2;

import android.animation.Animator;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.fragment.app.C11003d;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0031P0;
import p001A.C0100z;
import p001A.RunnableC0066i;
import p030B2.AbstractC0738T;
import p1072w2.C20791c;
import p138F8.vJO.anhfj;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9991w4;
import p658b5.C11241l;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Y2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9624h {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f29003a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f29004b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f29005c;

    /* JADX INFO: renamed from: d */
    public boolean f29006d;

    /* JADX INFO: renamed from: e */
    public boolean f29007e;

    public C9624h(ViewGroup container) {
        AbstractC16544l.m18094g(container, "container");
        this.f29003a = container;
        this.f29004b = new ArrayList();
        this.f29005c = new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    public static final C9624h m10165g(ViewGroup container, AbstractC11002c fragmentManager) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(fragmentManager, "fragmentManager");
        AbstractC16544l.m18093f(fragmentManager.m11771E(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C9624h) {
            return (C9624h) tag;
        }
        C9624h c9624h = new C9624h(container);
        container.setTag(R.id.special_effects_controller_view_tag, c9624h);
        return c9624h;
    }

    /* JADX INFO: renamed from: a */
    public final void m10166a(int i10, int i11, C11003d c11003d) {
        synchronized (this.f29004b) {
            C20791c c20791c = new C20791c();
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
            AbstractC16544l.m18093f(abstractComponentCallbacksC11000a, "fragmentStateManager.fragment");
            C9614S c9614sM10170e = m10170e(abstractComponentCallbacksC11000a);
            if (c9614sM10170e != null) {
                c9614sM10170e.m10157c(i10, i11);
                return;
            }
            final C9614S c9614s = new C9614S(i10, i11, c11003d, c20791c);
            this.f29004b.add(c9614s);
            final int i12 = 0;
            c9614s.f28951d.add(new Runnable(this) { // from class: Y2.Q

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C9624h f28946Z;

                {
                    this.f28946Z = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            C9624h this$0 = this.f28946Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            C9614S c9614s2 = c9614s;
                            if (this$0.f29004b.contains(c9614s2)) {
                                int i13 = c9614s2.f28948a;
                                View view = c9614s2.f28950c.f33135Q0;
                                AbstractC16544l.m18093f(view, "operation.fragment.mView");
                                AbstractC9306j0.m9884c(view, i13);
                            }
                            break;
                        default:
                            C9624h this$1 = this.f28946Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            C9614S c9614s3 = c9614s;
                            this$1.f29004b.remove(c9614s3);
                            this$1.f29005c.remove(c9614s3);
                            break;
                    }
                }
            });
            final int i13 = 1;
            c9614s.f28951d.add(new Runnable(this) { // from class: Y2.Q

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C9624h f28946Z;

                {
                    this.f28946Z = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            C9624h this$0 = this.f28946Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            C9614S c9614s2 = c9614s;
                            if (this$0.f29004b.contains(c9614s2)) {
                                int i14 = c9614s2.f28948a;
                                View view = c9614s2.f28950c.f33135Q0;
                                AbstractC16544l.m18093f(view, "operation.fragment.mView");
                                AbstractC9306j0.m9884c(view, i14);
                            }
                            break;
                        default:
                            C9624h this$1 = this.f28946Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            C9614S c9614s3 = c9614s;
                            this$1.f29004b.remove(c9614s3);
                            this$1.f29005c.remove(c9614s3);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10167b(int i10, C11003d fragmentStateManager) {
        AbstractC14376f.m15825D(i10, "finalState");
        AbstractC16544l.m18094g(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f33212c);
        }
        m10166a(i10, 2, fragmentStateManager);
    }

    /* JADX INFO: renamed from: d */
    public final void m10169d() {
        if (this.f29007e) {
            return;
        }
        ViewGroup viewGroup = this.f29003a;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (!viewGroup.isAttachedToWindow()) {
            m10171f();
            this.f29006d = false;
            return;
        }
        synchronized (this.f29004b) {
            try {
                if (!this.f29004b.isEmpty()) {
                    ArrayList<C9614S> arrayListM19323D0 = AbstractC17680n.m19323D0(this.f29005c);
                    this.f29005c.clear();
                    for (C9614S c9614s : arrayListM19323D0) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c9614s);
                        }
                        c9614s.m10155a();
                        if (!c9614s.f28954g) {
                            this.f29005c.add(c9614s);
                        }
                    }
                    m10172h();
                    ArrayList arrayListM19323D1 = AbstractC17680n.m19323D0(this.f29004b);
                    this.f29004b.clear();
                    this.f29005c.addAll(arrayListM19323D1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayListM19323D1.iterator();
                    while (it.hasNext()) {
                        ((C9614S) it.next()).m10158d();
                    }
                    m10168c(arrayListM19323D1, this.f29006d);
                    this.f29006d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C9614S m10170e(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        Object next;
        Iterator it = this.f29004b.iterator();
        while (it.hasNext()) {
            next = it.next();
            C9614S c9614s = (C9614S) next;
            if (AbstractC16544l.m18089b(c9614s.f28950c, abstractComponentCallbacksC11000a) && !c9614s.f28953f) {
                return (C9614S) next;
            }
        }
        next = null;
        return (C9614S) next;
    }

    /* JADX INFO: renamed from: f */
    public final void m10171f() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f29003a;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f29004b) {
            try {
                m10172h();
                Iterator it = this.f29004b.iterator();
                while (it.hasNext()) {
                    ((C9614S) it.next()).m10158d();
                }
                for (C9614S c9614s : AbstractC17680n.m19323D0(this.f29005c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f29003a + " is not attached to window. ") + "Cancelling running operation " + c9614s);
                    }
                    c9614s.m10155a();
                }
                for (C9614S c9614s2 : AbstractC17680n.m19323D0(this.f29004b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f29003a + " is not attached to window. ") + "Cancelling pending operation " + c9614s2);
                    }
                    c9614s2.m10155a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10172h() {
        for (C9614S c9614s : this.f29004b) {
            int i10 = 2;
            if (c9614s.f28949b == 2) {
                int visibility = c9614s.f28950c.m11744N().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC10763a.m11048f(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                c9614s.m10157c(i10, 1);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10168c(ArrayList arrayList, boolean z6) {
        Object obj;
        Object next;
        String str;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C9614S c9614s = (C9614S) next;
            View view = c9614s.f28950c.f33135Q0;
            AbstractC16544l.m18093f(view, "operation.fragment.mView");
            if (AbstractC9991w4.m10634c(view) == 2 && c9614s.f28948a != 2) {
                break;
            }
        }
        C9614S c9614s2 = (C9614S) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            C9614S c9614s3 = (C9614S) objPrevious;
            View view2 = c9614s3.f28950c.f33135Q0;
            AbstractC16544l.m18093f(view2, "operation.fragment.mView");
            if (AbstractC9991w4.m10634c(view2) != 2 && c9614s3.f28948a == 2) {
                obj = objPrevious;
                break;
            }
        }
        C9614S c9614s4 = (C9614S) obj;
        String str2 = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + c9614s2 + " to " + c9614s4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C9621e> arrayList3 = new ArrayList();
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(arrayList);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((C9614S) AbstractC17680n.m19351a0(arrayList)).f28950c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C9633q c9633q = ((C9614S) it2.next()).f28950c.f33138T0;
            C9633q c9633q2 = abstractComponentCallbacksC11000a.f33138T0;
            c9633q.f29036b = c9633q2.f29036b;
            c9633q.f29037c = c9633q2.f29037c;
            c9633q.f29038d = c9633q2.f29038d;
            c9633q.f29039e = c9633q2.f29039e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C9614S c9614s5 = (C9614S) it3.next();
            C20791c c20791c = new C20791c();
            c9614s5.m10158d();
            LinkedHashSet linkedHashSet = c9614s5.f28952e;
            linkedHashSet.add(c20791c);
            arrayList2.add(new C9620d(c9614s5, c20791c, z6));
            C20791c c20791c2 = new C20791c();
            c9614s5.m10158d();
            linkedHashSet.add(c20791c2);
            boolean z10 = !z6 ? c9614s5 != c9614s4 : c9614s5 != c9614s2;
            C9621e c9621e = new C9621e(c9614s5, 2, c20791c2);
            int i10 = c9614s5.f28948a;
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c9614s5.f28950c;
            if (i10 == 2) {
                if (z6) {
                    C9633q c9633q3 = abstractComponentCallbacksC11000a2.f33138T0;
                } else {
                    abstractComponentCallbacksC11000a2.getClass();
                }
            } else if (z6) {
                C9633q c9633q4 = abstractComponentCallbacksC11000a2.f33138T0;
            } else {
                abstractComponentCallbacksC11000a2.getClass();
            }
            if (c9614s5.f28948a == 2) {
                if (z6) {
                    C9633q c9633q5 = abstractComponentCallbacksC11000a2.f33138T0;
                } else {
                    C9633q c9633q6 = abstractComponentCallbacksC11000a2.f33138T0;
                }
            }
            if (z10) {
                if (z6) {
                    C9633q c9633q7 = abstractComponentCallbacksC11000a2.f33138T0;
                } else {
                    abstractComponentCallbacksC11000a2.getClass();
                }
            }
            arrayList3.add(c9621e);
            c9614s5.f28951d.add(new RunnableC0066i(arrayListM19323D0, c9614s5, this, 18));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((C9621e) obj2).m777k()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C9621e) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C9621e) it5.next()).getClass();
        }
        for (C9621e c9621e2 : arrayList3) {
            linkedHashMap.put((C9614S) c9621e2.f878b, Boolean.FALSE);
            c9621e2.m770d();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f29003a;
        Context context = viewGroup.getContext();
        ArrayList<C9620d> arrayList6 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        boolean z11 = false;
        while (true) {
            str = "context";
            if (!it6.hasNext()) {
                break;
            }
            C9620d c9620d = (C9620d) it6.next();
            if (c9620d.m777k()) {
                c9620d.m770d();
            } else {
                AbstractC16544l.m18093f(context, "context");
                C11241l c11241lM10164p = c9620d.m10164p(context);
                if (c11241lM10164p == null) {
                    c9620d.m770d();
                } else {
                    Animator animator = (Animator) c11241lM10164p.f34017Z;
                    if (animator == null) {
                        arrayList6.add(c9620d);
                    } else {
                        C9614S c9614s6 = (C9614S) c9620d.f878b;
                        boolean zM18089b = AbstractC16544l.m18089b(linkedHashMap.get(c9614s6), Boolean.TRUE);
                        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 = c9614s6.f28950c;
                        if (zM18089b) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC11000a3 + " as this Fragment was involved in a Transition.");
                            }
                            c9620d.m770d();
                        } else {
                            boolean z12 = c9614s6.f28948a == 3;
                            if (z12) {
                                arrayListM19323D0.remove(c9614s6);
                            }
                            View view3 = abstractComponentCallbacksC11000a3.f33135Q0;
                            viewGroup.startViewTransition(view3);
                            C9614S c9614s7 = c9614s4;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            String str3 = str2;
                            ArrayList arrayList7 = arrayList6;
                            C9614S c9614s8 = c9614s2;
                            Context context2 = context;
                            ArrayList arrayList8 = arrayListM19323D0;
                            ViewGroup viewGroup2 = viewGroup;
                            animator.addListener(new C9622f(this, view3, z12, c9614s6, c9620d));
                            animator.setTarget(view3);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animator from operation " + c9614s6 + " has started.");
                            }
                            ((C20791c) c9620d.f879c).m21308a(new C0100z(animator, 24, c9614s6));
                            context = context2;
                            viewGroup = viewGroup2;
                            linkedHashMap = linkedHashMap2;
                            c9614s4 = c9614s7;
                            str2 = str3;
                            arrayList6 = arrayList7;
                            c9614s2 = c9614s8;
                            arrayListM19323D0 = arrayList8;
                            z11 = true;
                        }
                    }
                }
            }
        }
        C9614S c9614s9 = c9614s2;
        C9614S c9614s10 = c9614s4;
        String str4 = str2;
        ArrayList<C9614S> arrayList9 = arrayListM19323D0;
        Context context3 = context;
        ViewGroup viewGroup3 = viewGroup;
        for (C9620d c9620d2 : arrayList6) {
            C9614S c9614s11 = (C9614S) c9620d2.f878b;
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a4 = c9614s11.f28950c;
            if (zContainsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC11000a4 + SfpOlmlMATQ.UZrAmHDPuZ);
                }
                c9620d2.m770d();
            } else if (z11) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC11000a4 + " as Animations cannot run alongside Animators.");
                }
                c9620d2.m770d();
            } else {
                View view4 = abstractComponentCallbacksC11000a4.f33135Q0;
                AbstractC16544l.m18093f(context3, str);
                C11241l c11241lM10164p2 = c9620d2.m10164p(context3);
                String str5 = anhfj.HbbzIMHCVxrcybm;
                if (c11241lM10164p2 == null) {
                    throw new IllegalStateException(str5);
                }
                Animation animation = (Animation) c11241lM10164p2.f34016Y;
                if (animation == null) {
                    throw new IllegalStateException(str5);
                }
                if (c9614s11.f28948a != 1) {
                    view4.startAnimation(animation);
                    c9620d2.m770d();
                } else {
                    viewGroup3.startViewTransition(view4);
                    RunnableC9638v runnableC9638v = new RunnableC9638v(animation, viewGroup3, view4);
                    runnableC9638v.setAnimationListener(new AnimationAnimationListenerC9623g(c9614s11, this, view4, c9620d2));
                    view4.startAnimation(runnableC9638v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + c9614s11 + " has started.");
                    }
                }
                ((C20791c) c9620d2.f879c).m21308a(new C0031P0(view4, this, c9620d2, c9614s11, 4));
                str = str;
            }
        }
        for (C9614S c9614s12 : arrayList9) {
            View view5 = c9614s12.f28950c.f33135Q0;
            int i11 = c9614s12.f28948a;
            AbstractC16544l.m18093f(view5, "view");
            AbstractC9306j0.m9884c(view5, i11);
        }
        arrayList9.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c9614s9 + str4 + c9614s10);
        }
    }
}
