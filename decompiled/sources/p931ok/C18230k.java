package p931ok;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p011A9.p012Ra.ahZQMZ;
import p025An.C0644w;
import p046Bk.C1361Y;
import p183H4.InterfaceC3232g;
import p330N4.AbstractC5636B;
import p330N4.C5637C;
import p330N4.C5665p;
import p330N4.C5670u;
import p523V9.AbstractC7841A0;
import p544W9.AbstractC8559T2;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p544W9.AbstractC8724v;
import p571X9.AbstractC9393x3;
import p769gj.AbstractC14158L;
import p769gj.C14172n;
import p769gj.C14183y;
import p769gj.InterfaceC14149C;
import p769gj.InterfaceC14167i;
import p791hj.C14522e;
import p791hj.InterfaceC14521d;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p813ij.C15024h;
import p813ij.C15026j;
import p813ij.EnumC15018b;
import p849k7.C16349b;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: ok.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18230k extends FrameLayout {

    /* JADX INFO: renamed from: p0 */
    public static final C1361Y f58081p0 = new C1361Y(5);

    /* JADX INFO: renamed from: o0 */
    public final C15026j f58082o0;

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m19733a(C18226g newRendering, C14183y newViewEnvironment) {
        C17309l c17309l;
        AbstractC16544l.m18094g(newRendering, "newRendering");
        AbstractC16544l.m18094g(newViewEnvironment, "newViewEnvironment");
        C14183y c14183y = new C14183y(AbstractC17659D.m19249k(newViewEnvironment.f44578a, new C17309l(EnumC15018b.f46713Y, EnumC15018b.f46714Z)));
        C14172n c14172n = new C14172n(newRendering.f58077a, "screen_with_transition");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = AbstractC8718u.m9433b(currentView, c14172n) ? currentView : null;
            if (view != null) {
                this.f58082o0.m16151p(AbstractC9393x3.m9974d(c14172n));
                AbstractC8718u.m9435d(view, c14172n, c14183y);
                return;
            }
        }
        InterfaceC14149C interfaceC14149C = (InterfaceC14149C) c14183y.m15505a(InterfaceC14149C.f44508a);
        Context context = getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        View viewM9421c = AbstractC8712t.m9421c(interfaceC14149C, c14172n, c14183y, context, this, new C16349b(16));
        AbstractC8718u.m9436e(viewM9421c);
        EnumC18225f enumC18225f = newRendering.f58078b;
        if (currentView != null) {
            View viewFindViewById = currentView.findViewById(R.id.back_stack_body);
            View viewFindViewById2 = viewM9421c.findViewById(R.id.back_stack_body);
            if (viewFindViewById == null || viewFindViewById2 == null) {
                viewFindViewById = currentView;
                viewFindViewById2 = viewM9421c;
            }
            int iOrdinal = enumC18225f.ordinal();
            if (iOrdinal == 0) {
                c17309l = new C17309l(8388611, 8388613);
            } else if (iOrdinal == 1) {
                c17309l = new C17309l(8388613, 8388611);
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                AbstractC5636B.m6044d(new C5665p(this, viewM9421c), null);
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
        } else {
            addView(viewM9421c);
        }
        if (currentView != null) {
            InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(currentView);
            InterfaceC14521d interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
            if (interfaceC14521d != null) {
                ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
            }
        }
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
        C15026j c15026j = this.f58082o0;
        c15026j.getClass();
        AbstractC16544l.m18094g(key, "key");
        ((C14522e) c15026j.f46725Z).m16014d(key, interfaceC3232gM9221d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((C14522e) this.f58082o0.f46725Z).m16021n();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC16544l.m18094g(state, "state");
        C17296C c17296c = null;
        C18229j c18229j = state instanceof C18229j ? (C18229j) state : null;
        if (c18229j != null) {
            C15026j c15026j = this.f58082o0;
            c15026j.getClass();
            C15024h from = c18229j.f58080Y;
            AbstractC16544l.m18094g(from, "from");
            LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
            linkedHashMap.clear();
            linkedHashMap.putAll(from.f46722Y);
            super.onRestoreInstanceState(((C18229j) state).getSuperState());
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
        C15026j c15026j = this.f58082o0;
        c15026j.getClass();
        return new C18229j(parcelableOnSaveInstanceState, new C15024h(c15026j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18230k(Context context) {
        super(context, null, 0, 0);
        AbstractC16544l.m18094g(context, ahZQMZ.cccuemzdkc);
        this.f58082o0 = new C15026j(0);
    }
}
