package com.squareup.workflow1.p685ui.backstack;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p046Bk.C1361Y;
import p183H4.InterfaceC3232g;
import p330N4.AbstractC5636B;
import p330N4.C5637C;
import p330N4.C5665p;
import p330N4.C5670u;
import p523V9.AbstractC7841A0;
import p544W9.AbstractC8559T2;
import p544W9.AbstractC8688p;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p544W9.AbstractC8724v;
import p561X.C8990d;
import p769gj.AbstractC14158L;
import p769gj.C14172n;
import p769gj.C14183y;
import p769gj.InterfaceC14149C;
import p769gj.InterfaceC14167i;
import p791hj.C14522e;
import p791hj.InterfaceC14521d;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p813ij.C15021e;
import p813ij.C15022f;
import p813ij.C15024h;
import p813ij.C15026j;
import p813ij.EnumC15018b;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m18067d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "currentView", "Bk/Y", "ij/e", "wf1-container-android"}, m18068k = 1, m18069mv = {1, 6, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class BackStackContainer extends FrameLayout {

    /* JADX INFO: renamed from: q0 */
    public static final C1361Y f40528q0 = new C1361Y(3);

    /* JADX INFO: renamed from: o0 */
    public final C15026j f40529o0;

    /* JADX INFO: renamed from: p0 */
    public C15022f f40530p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        AbstractC16544l.m18094g(context, "context");
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m14526a(C15022f newRendering, C14183y newViewEnvironment) {
        C17309l c17309l;
        List list;
        AbstractC16544l.m18094g(newRendering, "newRendering");
        AbstractC16544l.m18094g(newViewEnvironment, "newViewEnvironment");
        C14183y c14183y = new C14183y(AbstractC17659D.m19249k(newViewEnvironment.f44578a, new C17309l(EnumC15018b.f46713Y, newRendering.f46721c.isEmpty() ? EnumC15018b.f46714Z : EnumC15018b.f46715o0)));
        ArrayList arrayList = newRendering.f46719a;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (Object it : arrayList) {
            AbstractC16544l.m18094g(it, "it");
            arrayList2.add(new C14172n(it, "backstack"));
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C15022f c15022f = new C15022f(AbstractC17680n.m19341Q(arrayList2), arrayList2.subList(1, arrayList2.size()));
        View currentView = getCurrentView();
        C15026j c15026j = this.f40529o0;
        Object obj = c15022f.f46720b;
        if (currentView != null) {
            View view = AbstractC8718u.m9433b(currentView, obj) ? currentView : null;
            if (view != null) {
                c15026j.m16151p(c15022f.f46719a);
                AbstractC8718u.m9435d(view, obj, c14183y);
                return;
            }
        }
        InterfaceC14149C interfaceC14149C = (InterfaceC14149C) c14183y.m15505a(InterfaceC14149C.f44508a);
        Context context = getContext();
        AbstractC16544l.m18093f(context, "this.context");
        View viewM9421c = AbstractC8712t.m9421c(interfaceC14149C, c15022f.f46720b, c14183y, context, this, new C8990d(13));
        AbstractC8718u.m9436e(viewM9421c);
        c15026j.m16152s(c15022f.f46721c, currentView, viewM9421c);
        C15022f c15022f2 = this.f40530p0;
        boolean z6 = false;
        if (c15022f2 != null && (list = c15022f2.f46721c) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC8688p.m9386b((C14172n) it2.next(), obj)) {
                        z6 = true;
                        break;
                    }
                }
            }
        }
        if (currentView == null) {
            addView(viewM9421c);
        } else {
            View viewFindViewById = currentView.findViewById(R.id.back_stack_body);
            View viewFindViewById2 = viewM9421c.findViewById(R.id.back_stack_body);
            if (viewFindViewById == null || viewFindViewById2 == null) {
                viewFindViewById = currentView;
                viewFindViewById2 = viewM9421c;
            }
            if (!z6) {
                c17309l = new C17309l(8388611, 8388613);
            } else {
                if (!z6) {
                    throw new C0644w();
                }
                c17309l = new C17309l(8388613, 8388611);
            }
            int iIntValue = ((Number) c17309l.f55136Y).intValue();
            int iIntValue2 = ((Number) c17309l.f55137Z).intValue();
            C5637C c5637c = new C5637C();
            C5670u c5670u = new C5670u(iIntValue);
            c5670u.f18419r0.add(viewFindViewById);
            c5637c.m6052I(c5670u);
            C5670u c5670u2 = new C5670u(iIntValue2);
            c5670u2.f18419r0.add(viewFindViewById2);
            c5637c.m6052I(c5670u2);
            c5637c.mo6047B(new AccelerateDecelerateInterpolator());
            AbstractC5636B.m6042b(this);
            AbstractC5636B.m6044d(new C5665p(this, viewM9421c), c5637c);
        }
        if (currentView != null) {
            InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(currentView);
            InterfaceC14521d interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
            if (interfaceC14521d != null) {
                ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
            }
        }
        this.f40530p0 = c15022f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC3232g interfaceC3232gM9221d = AbstractC8559T2.m9221d(this);
        AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(this);
        Object objMo15504c = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15504c();
        if (objMo15504c == null) {
            objMo15504c = null;
        }
        AbstractC16544l.m18091d(objMo15504c);
        InterfaceC14167i interfaceC14167i = objMo15504c instanceof InterfaceC14167i ? (InterfaceC14167i) objMo15504c : null;
        String strMo6751b = interfaceC14167i != null ? interfaceC14167i.mo6751b() : null;
        if (strMo6751b == null) {
            strMo6751b = objMo15504c.getClass().getName();
        }
        String key = AbstractC16544l.m18100m("", strMo6751b);
        C15026j c15026j = this.f40529o0;
        c15026j.getClass();
        AbstractC16544l.m18094g(key, "key");
        ((C14522e) c15026j.f46725Z).m16014d(key, interfaceC3232gM9221d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((C14522e) this.f40529o0.f46725Z).m16021n();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC16544l.m18094g(state, "state");
        C17296C c17296c = null;
        C15021e c15021e = state instanceof C15021e ? (C15021e) state : null;
        if (c15021e != null) {
            C15026j c15026j = this.f40529o0;
            c15026j.getClass();
            C15024h from = c15021e.f46718Y;
            AbstractC16544l.m18094g(from, "from");
            LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
            linkedHashMap.clear();
            linkedHashMap.putAll(from.f46722Y);
            super.onRestoreInstanceState(((C15021e) state).getSuperState());
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        C15026j c15026j = this.f40529o0;
        c15026j.getClass();
        return new C15021e(parcelableOnSaveInstanceState, new C15024h(c15026j));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BackStackContainer(Context context, AttributeSet attributeSet, int i10) {
        attributeSet = (i10 & 2) != 0 ? null : attributeSet;
        AbstractC16544l.m18094g(context, "context");
        super(context, attributeSet, 0, 0);
        this.f40529o0 = new C15026j(0);
    }
}
