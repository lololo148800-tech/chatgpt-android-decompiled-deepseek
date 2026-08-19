package p366Oj;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p046Bk.C1361Y;
import p117Eb.C2385o;
import p183H4.InterfaceC3232g;
import p271Kj.C4706a;
import p523V9.AbstractC7841A0;
import p544W9.AbstractC8559T2;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p544W9.AbstractC8724v;
import p571X9.AbstractC9123E2;
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
import p909nm.C17689w;

/* JADX INFO: renamed from: Oj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6262d extends FrameLayout {

    /* JADX INFO: renamed from: q0 */
    public static final C1361Y f20351q0 = new C1361Y(1);

    /* JADX INFO: renamed from: o0 */
    public final C4706a f20352o0;

    /* JADX INFO: renamed from: p0 */
    public final C15026j f20353p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6262d(Context context) {
        super(context, null, 0, 0);
        AbstractC16544l.m18094g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.pi2_disableable_container, this);
        int i10 = R.id.overlay;
        View viewM9654b = AbstractC9123E2.m9654b(this, R.id.overlay);
        if (viewM9654b != null) {
            i10 = R.id.view_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(this, R.id.view_container);
            if (frameLayout != null) {
                this.f20352o0 = new C4706a(this, viewM9654b, frameLayout, 0);
                this.f20353p0 = new C15026j(0);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }

    private final View getCurrentView() {
        C4706a c4706a = this.f20352o0;
        if (((FrameLayout) c4706a.f15302d).getChildCount() > 0) {
            return ((FrameLayout) c4706a.f15302d).getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x006c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX INFO: renamed from: a */
    public final void m6750a(C6263e newRendering, C14183y newViewEnvironment) {
        View viewM9421c;
        InterfaceC14521d interfaceC14521d;
        AbstractC16544l.m18094g(newRendering, "newRendering");
        AbstractC16544l.m18094g(newViewEnvironment, "newViewEnvironment");
        C14172n c14172n = new C14172n(newRendering.f20354a, "disableable_container");
        View currentView = getCurrentView();
        C4706a c4706a = this.f20352o0;
        C15026j c15026j = this.f20353p0;
        if (currentView == null) {
            InterfaceC14149C interfaceC14149C = (InterfaceC14149C) newViewEnvironment.m15505a(InterfaceC14149C.f44508a);
            Context context = getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            viewM9421c = AbstractC8712t.m9421c(interfaceC14149C, c14172n, newViewEnvironment, context, this, new C2385o(19));
            AbstractC8718u.m9436e(viewM9421c);
            c15026j.m16152s(C17689w.f56480Y, currentView, viewM9421c);
            ((FrameLayout) c4706a.f15302d).removeView(currentView);
            ((FrameLayout) c4706a.f15302d).addView(viewM9421c);
            if (currentView != null) {
                InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(currentView);
                interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
                if (interfaceC14521d != null) {
                    ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
                }
            }
        } else {
            viewM9421c = AbstractC8718u.m9433b(currentView, c14172n) ? currentView : null;
            if (viewM9421c != null) {
                c15026j.m16151p(AbstractC9393x3.m9974d(c14172n));
                AbstractC8718u.m9435d(viewM9421c, c14172n, newViewEnvironment);
            } else {
                InterfaceC14149C interfaceC14149C2 = (InterfaceC14149C) newViewEnvironment.m15505a(InterfaceC14149C.f44508a);
                Context context2 = getContext();
                AbstractC16544l.m18093f(context2, "getContext(...)");
                viewM9421c = AbstractC8712t.m9421c(interfaceC14149C2, c14172n, newViewEnvironment, context2, this, new C2385o(19));
                AbstractC8718u.m9436e(viewM9421c);
                c15026j.m16152s(C17689w.f56480Y, currentView, viewM9421c);
                ((FrameLayout) c4706a.f15302d).removeView(currentView);
                ((FrameLayout) c4706a.f15302d).addView(viewM9421c);
                if (currentView != null) {
                    InterfaceC11112u interfaceC11112uM8090b2 = AbstractC7841A0.m8090b(currentView);
                    if (interfaceC11112uM8090b2 instanceof InterfaceC14521d) {
                    }
                    if (interfaceC14521d != null) {
                        ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
                    }
                }
            }
        }
        setEnabled(newRendering.f20355b);
        if (isEnabled()) {
            viewM9421c.setAlpha(1.0f);
            c4706a.f15301c.setVisibility(8);
        } else {
            viewM9421c.setAlpha(0.5f);
            c4706a.f15301c.setVisibility(0);
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
        C15026j c15026j = this.f20353p0;
        c15026j.getClass();
        AbstractC16544l.m18094g(key, "key");
        ((C14522e) c15026j.f46725Z).m16014d(key, interfaceC3232gM9221d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((C14522e) this.f20353p0.f46725Z).m16021n();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC16544l.m18094g(state, "state");
        C17296C c17296c = null;
        C6261c c6261c = state instanceof C6261c ? (C6261c) state : null;
        if (c6261c != null) {
            C15026j c15026j = this.f20353p0;
            c15026j.getClass();
            C15024h from = c6261c.f20350Y;
            AbstractC16544l.m18094g(from, "from");
            LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
            linkedHashMap.clear();
            linkedHashMap.putAll(from.f46722Y);
            super.onRestoreInstanceState(((C6261c) state).getSuperState());
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
        C15026j c15026j = this.f20353p0;
        c15026j.getClass();
        return new C6261c(parcelableOnSaveInstanceState, new C15024h(c15026j));
    }
}
