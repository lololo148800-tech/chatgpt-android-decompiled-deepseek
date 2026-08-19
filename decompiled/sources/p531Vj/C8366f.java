package p531Vj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hk.C14523a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p030B2.RunnableC0758g0;
import p049Bm.InterfaceC1436k;
import p1110xk.AbstractC21280c;
import p283L5.C4952r;
import p310M9.C5311e;
import p396Q4.InterfaceC6571a;
import p408Qj.C6736b;
import p408Qj.ViewOnAttachStateChangeListenerC6735a;
import p523V9.AbstractC8012V5;
import p544W9.AbstractC8682o;
import p555Wj.C8885a;
import p594Y9.AbstractC9710C4;
import p769gj.C14183y;
import p769gj.InterfaceC14161c;
import p769gj.InterfaceC14170l;
import p862l2.AbstractC16803b;
import p862l2.C16806e;
import p887m7.C17176b;
import p893n.AbstractActivityC17375g;
import p931ok.AbstractC18223d;
import pk.C18496a;
import pk.C18500e;
import pk.C18504i;
import pk.C18505j;
import pk.ViewOnClickListenerC18502g;
import pk.ViewOnClickListenerC18503h;

/* JADX INFO: renamed from: Vj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8366f implements InterfaceC14170l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6571a f26061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC14161c f26062c;

    public /* synthetic */ C8366f(InterfaceC6571a interfaceC6571a, InterfaceC14161c interfaceC14161c, int i10) {
        this.f26060a = i10;
        this.f26061b = interfaceC6571a;
        this.f26062c = interfaceC14161c;
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object rendering, C14183y viewEnvironment) {
        switch (this.f26060a) {
            case 0:
                AbstractC16544l.m18094g(rendering, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                C8369h c8369h = (C8369h) rendering;
                C8885a c8885a = (C8885a) this.f26061b;
                Context context = c8885a.f27194a.getContext();
                AbstractC16544l.m18093f(context, "getContext(...)");
                AbstractActivityC17375g abstractActivityC17375gM8328a = AbstractC8012V5.m8328a(context);
                if (abstractActivityC17375gM8328a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c8885a.f27194a.post(new RunnableC0758g0(c8885a, (C8369h) this.f26062c, c8369h, abstractActivityC17375gM8328a, 2));
                return;
            default:
                AbstractC16544l.m18094g(rendering, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                C18504i c18504i = (C18504i) rendering;
                C14523a c14523a = (C14523a) this.f26061b;
                ViewGroup.LayoutParams layoutParams = c14523a.f45767b.getLayoutParams();
                AbstractC16544l.m18092e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                AbstractC16803b abstractC16803b = ((C16806e) layoutParams).f53917a;
                AbstractC16544l.m18092e(abstractC16803b, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC16803b;
                boolean z6 = AbstractC18223d.f58070a;
                CoordinatorLayout coordinatorLayout = c14523a.f45766a;
                if (!z6) {
                    AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
                    AbstractC18223d.m19731a(coordinatorLayout, 14);
                }
                C17176b c17176b = new C17176b(c18504i, 5);
                ConstraintLayout constraintLayout = c14523a.f45767b;
                NestedScrollView nestedScrollView = c14523a.f45769d;
                View view = c14523a.f45770e;
                AbstractC9710C4.m10303a(bottomSheetBehavior, c17176b, constraintLayout, nestedScrollView, view);
                C18504i c18504i2 = (C18504i) this.f26062c;
                c18504i2.f58973s0 = bottomSheetBehavior;
                coordinatorLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC6735a(bottomSheetBehavior, 2));
                Context context2 = coordinatorLayout.getContext();
                AbstractC16544l.m18091d(context2);
                C18500e c18500e = c18504i2.f58967Y;
                C5311e c5311eM19885a = C18505j.m19885a(context2, c18500e, false, true);
                c18504i2.f58972r0 = c5311eM19885a;
                FrameLayout frameLayout = c14523a.f45768c;
                frameLayout.addView((ConstraintLayout) c5311eM19885a.f17485o0);
                LinkedHashMap linkedHashMap = ((C4952r) c5311eM19885a.f17484Z).f16155a;
                for (C17309l c17309l : c18504i2.f58968Z) {
                    String str = (String) c17309l.f55136Y;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55137Z;
                    C18496a c18496a = (C18496a) linkedHashMap.get(str);
                    if (c18496a != null) {
                        c18496a.f58959b.setOnClickListener(new ViewOnClickListenerC18502g(interfaceC1436k, c18496a));
                    }
                }
                C18496a c18496a2 = (C18496a) linkedHashMap.get(c18504i2.f58970p0);
                if (c18496a2 != null) {
                    c18496a2.f58959b.setOnClickListener(new ViewOnClickListenerC18503h(bottomSheetBehavior, 0));
                }
                AbstractC8682o.m9380c(new C6736b(bottomSheetBehavior, 1), constraintLayout);
                if (c18504i.f58971q0) {
                    view.setOnClickListener(new ViewOnClickListenerC18503h(bottomSheetBehavior, 1));
                } else {
                    view.setOnClickListener(null);
                }
                AbstractC21280c.m21621a(nestedScrollView, c18500e.f58961Z, frameLayout);
                return;
        }
    }
}
