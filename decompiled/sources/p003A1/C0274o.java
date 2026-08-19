package p003A1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p477Tb.AbstractC7294a;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p737f1.InterfaceC13515g;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p954q1.C18606a;
import p978r1.AbstractC18857c;
import p978r1.C18855a;
import p978r1.C18856b;

/* JADX INFO: renamed from: A1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0274o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f997Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AndroidComposeView f998Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274o(AndroidComposeView androidComposeView, int i10) {
        super(1);
        this.f997Y = i10;
        this.f998Z = androidComposeView;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13510b c13510b;
        switch (this.f997Y) {
            case 0:
                int i10 = ((C18606a) obj).f59266a;
                boolean zRequestFocusFromTouch = false;
                boolean z6 = i10 == 1;
                AndroidComposeView androidComposeView = this.f998Z;
                if (z6) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode();
                } else if (i10 == 2) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                KeyEvent keyEvent = ((C18856b) obj).f60081a;
                AndroidComposeView androidComposeView2 = this.f998Z;
                androidComposeView2.getClass();
                long jM20157d = AbstractC18857c.m20157d(keyEvent);
                if (C18855a.m20153a(jM20157d, C18855a.f60071j)) {
                    c13510b = new C13510b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C18855a.m20153a(jM20157d, C18855a.f60067f)) {
                    c13510b = new C13510b(4);
                } else if (C18855a.m20153a(jM20157d, C18855a.f60066e)) {
                    c13510b = new C13510b(3);
                } else {
                    if (C18855a.m20153a(jM20157d, C18855a.f60064c) ? true : C18855a.m20153a(jM20157d, C18855a.f60074m)) {
                        c13510b = new C13510b(5);
                    } else {
                        if (C18855a.m20153a(jM20157d, C18855a.f60065d) ? true : C18855a.m20153a(jM20157d, C18855a.f60075n)) {
                            c13510b = new C13510b(6);
                        } else {
                            if (C18855a.m20153a(jM20157d, C18855a.f60068g) ? true : C18855a.m20153a(jM20157d, C18855a.f60072k) ? true : C18855a.m20153a(jM20157d, C18855a.f60076o)) {
                                c13510b = new C13510b(7);
                            } else {
                                c13510b = C18855a.m20153a(jM20157d, C18855a.f60063b) ? true : C18855a.m20153a(jM20157d, C18855a.f60073l) ? new C13510b(8) : null;
                            }
                        }
                    }
                }
                if (c13510b == null || !AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                C13801c c13801cM11349w = androidComposeView2.m11349w();
                InterfaceC13515g focusOwner = androidComposeView2.getFocusOwner();
                C0301x c0301x = new C0301x(c13510b, 1);
                int i11 = c13510b.f42774a;
                Boolean boolM11303c = ((C10863b) focusOwner).m11303c(i11, c13801cM11349w, c0301x);
                if (boolM11303c != null ? boolM11303c.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(C13510b.m15026a(i11, 1) ? true : C13510b.m15026a(i11, 2))) {
                    return Boolean.FALSE;
                }
                Integer numM15037J = AbstractC13512d.m15037J(i11);
                if (numM15037J == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int iIntValue = numM15037J.intValue();
                Rect rectM15615D = c13801cM11349w != null ? AbstractC14334L.m15615D(c13801cM11349w) : null;
                if (rectM15615D == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View viewFindNextFocus = androidComposeView2;
                while (true) {
                    if (viewFindNextFocus != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = androidComposeView2.getRootView();
                        AbstractC16544l.m18092e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                        if (viewFindNextFocus != null) {
                            if (!viewFindNextFocus.equals(androidComposeView2)) {
                                ViewParent parent = viewFindNextFocus.getParent();
                                while (true) {
                                    if (parent != null) {
                                        if (parent != androidComposeView2) {
                                            parent = parent.getParent();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        viewFindNextFocus = null;
                    }
                }
                if (AbstractC16544l.m18089b(viewFindNextFocus, androidComposeView2)) {
                    viewFindNextFocus = null;
                }
                if (viewFindNextFocus != null && AbstractC13512d.m15032E(viewFindNextFocus, Integer.valueOf(iIntValue), rectM15615D)) {
                    return Boolean.TRUE;
                }
                if (!((C10863b) androidComposeView2.getFocusOwner()).m11301a(i11, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolM11303c2 = ((C10863b) androidComposeView2.getFocusOwner()).m11303c(i11, null, new C0301x(c13510b, 0));
                return Boolean.valueOf(boolM11303c2 != null ? boolM11303c2.booleanValue() : true);
            case 2:
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj;
                AndroidComposeView androidComposeView3 = this.f998Z;
                Handler handler = androidComposeView3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1426a.invoke();
                } else {
                    Handler handler2 = androidComposeView3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0156C(0, interfaceC1426a));
                    }
                }
                return C17296C.f55119a;
            default:
                AndroidComposeView androidComposeView4 = this.f998Z;
                return new C0275o0(androidComposeView4, androidComposeView4.getTextInputService(), (InterfaceC0571F) obj);
        }
    }
}
