package p976r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.openai.chatgpt.R;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p999s.C19295G0;
import p999s.C19369o0;

/* JADX INFO: renamed from: r.C */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC18801C extends AbstractC18822t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A0 */
    public ViewTreeObserver f59761A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f59762B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f59763C0;

    /* JADX INFO: renamed from: D0 */
    public int f59764D0;

    /* JADX INFO: renamed from: F0 */
    public boolean f59766F0;

    /* JADX INFO: renamed from: Z */
    public final Context f59767Z;

    /* JADX INFO: renamed from: o0 */
    public final MenuC18814l f59768o0;

    /* JADX INFO: renamed from: p0 */
    public final C18811i f59769p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f59770q0;

    /* JADX INFO: renamed from: r0 */
    public final int f59771r0;

    /* JADX INFO: renamed from: s0 */
    public final int f59772s0;

    /* JADX INFO: renamed from: t0 */
    public final C19295G0 f59773t0;

    /* JADX INFO: renamed from: w0 */
    public C18823u f59776w0;

    /* JADX INFO: renamed from: x0 */
    public View f59777x0;

    /* JADX INFO: renamed from: y0 */
    public View f59778y0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC18825w f59779z0;

    /* JADX INFO: renamed from: u0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC18806d f59774u0 = new ViewTreeObserverOnGlobalLayoutListenerC18806d(this, 1);

    /* JADX INFO: renamed from: v0 */
    public final ViewOnAttachStateChangeListenerC0171H f59775v0 = new ViewOnAttachStateChangeListenerC0171H(this, 8);

    /* JADX INFO: renamed from: E0 */
    public int f59765E0 = 0;

    public ViewOnKeyListenerC18801C(int i10, Context context, View view, MenuC18814l menuC18814l, boolean z6) {
        this.f59767Z = context;
        this.f59768o0 = menuC18814l;
        this.f59770q0 = z6;
        this.f59769p0 = new C18811i(menuC18814l, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f59772s0 = i10;
        Resources resources = context.getResources();
        this.f59771r0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f59777x0 = view;
        this.f59773t0 = new C19295G0(context, null, i10);
        menuC18814l.m20121b(this, context);
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: a */
    public final boolean mo20082a() {
        return !this.f59762B0 && this.f59773t0.f61106L0.isShowing();
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: b */
    public final void mo20085b(InterfaceC18825w interfaceC18825w) {
        this.f59779z0 = interfaceC18825w;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: c */
    public final void mo20086c(MenuC18814l menuC18814l, boolean z6) {
        if (menuC18814l != this.f59768o0) {
            return;
        }
        dismiss();
        InterfaceC18825w interfaceC18825w = this.f59779z0;
        if (interfaceC18825w != null) {
            interfaceC18825w.mo10212c(menuC18814l, z6);
        }
    }

    @Override // p976r.InterfaceC18800B
    public final void dismiss() {
        if (mo20082a()) {
            this.f59773t0.dismiss();
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: e */
    public final boolean mo20087e() {
        return false;
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: f */
    public final void mo20083f() {
        View view;
        if (mo20082a()) {
            return;
        }
        if (this.f59762B0 || (view = this.f59777x0) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f59778y0 = view;
        C19295G0 c19295g0 = this.f59773t0;
        c19295g0.f61106L0.setOnDismissListener(this);
        c19295g0.f61096B0 = this;
        c19295g0.f61105K0 = true;
        c19295g0.f61106L0.setFocusable(true);
        View view2 = this.f59778y0;
        boolean z6 = this.f59761A0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f59761A0 = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f59774u0);
        }
        view2.addOnAttachStateChangeListener(this.f59775v0);
        c19295g0.f61095A0 = view2;
        c19295g0.f61118x0 = this.f59765E0;
        boolean z10 = this.f59763C0;
        Context context = this.f59767Z;
        C18811i c18811i = this.f59769p0;
        if (!z10) {
            this.f59764D0 = AbstractC18822t.m20140m(c18811i, context, this.f59771r0);
            this.f59763C0 = true;
        }
        c19295g0.m20356p(this.f59764D0);
        c19295g0.f61106L0.setInputMethodMode(2);
        Rect rect = this.f59911Y;
        c19295g0.f61104J0 = rect != null ? new Rect(rect) : null;
        c19295g0.mo20083f();
        C19369o0 c19369o0 = c19295g0.f61109o0;
        c19369o0.setOnKeyListener(this);
        if (this.f59766F0) {
            MenuC18814l menuC18814l = this.f59768o0;
            if (menuC18814l.f59857m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c19369o0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC18814l.f59857m);
                }
                frameLayout.setEnabled(false);
                c19369o0.addHeaderView(frameLayout, null, false);
            }
        }
        c19295g0.mo20354n(c18811i);
        c19295g0.mo20083f();
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: g */
    public final boolean mo20088g(SubMenuC18802D subMenuC18802D) {
        if (subMenuC18802D.hasVisibleItems()) {
            View view = this.f59778y0;
            C18824v c18824v = new C18824v(this.f59772s0, this.f59767Z, view, subMenuC18802D, this.f59770q0);
            InterfaceC18825w interfaceC18825w = this.f59779z0;
            c18824v.f59920h = interfaceC18825w;
            AbstractC18822t abstractC18822t = c18824v.f59921i;
            if (abstractC18822t != null) {
                abstractC18822t.mo20085b(interfaceC18825w);
            }
            boolean zM20141u = AbstractC18822t.m20141u(subMenuC18802D);
            c18824v.f59919g = zM20141u;
            AbstractC18822t abstractC18822t2 = c18824v.f59921i;
            if (abstractC18822t2 != null) {
                abstractC18822t2.mo20092o(zM20141u);
            }
            c18824v.f59922j = this.f59776w0;
            this.f59776w0 = null;
            this.f59768o0.m20122c(false);
            C19295G0 c19295g0 = this.f59773t0;
            int width = c19295g0.f61112r0;
            int iM20353m = c19295g0.m20353m();
            if ((Gravity.getAbsoluteGravity(this.f59765E0, this.f59777x0.getLayoutDirection()) & 7) == 5) {
                width += this.f59777x0.getWidth();
            }
            if (!c18824v.m20143b()) {
                if (c18824v.f59917e != null) {
                    c18824v.m20145d(width, iM20353m, true, true);
                }
            }
            InterfaceC18825w interfaceC18825w2 = this.f59779z0;
            if (interfaceC18825w2 != null) {
                interfaceC18825w2.mo10214g(subMenuC18802D);
            }
            return true;
        }
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: h */
    public final void mo20089h() {
        this.f59763C0 = false;
        C18811i c18811i = this.f59769p0;
        if (c18811i != null) {
            c18811i.notifyDataSetChanged();
        }
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: i */
    public final C19369o0 mo20084i() {
        return this.f59773t0.f61109o0;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: n */
    public final void mo20091n(View view) {
        this.f59777x0 = view;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: o */
    public final void mo20092o(boolean z6) {
        this.f59769p0.f59840c = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f59762B0 = true;
        this.f59768o0.m20122c(true);
        ViewTreeObserver viewTreeObserver = this.f59761A0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f59761A0 = this.f59778y0.getViewTreeObserver();
            }
            this.f59761A0.removeGlobalOnLayoutListener(this.f59774u0);
            this.f59761A0 = null;
        }
        this.f59778y0.removeOnAttachStateChangeListener(this.f59775v0);
        C18823u c18823u = this.f59776w0;
        if (c18823u != null) {
            c18823u.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: p */
    public final void mo20093p(int i10) {
        this.f59765E0 = i10;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: q */
    public final void mo20094q(int i10) {
        this.f59773t0.f61112r0 = i10;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: r */
    public final void mo20095r(PopupWindow.OnDismissListener onDismissListener) {
        this.f59776w0 = (C18823u) onDismissListener;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: s */
    public final void mo20096s(boolean z6) {
        this.f59766F0 = z6;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: t */
    public final void mo20097t(int i10) {
        this.f59773t0.m20352j(i10);
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: l */
    public final void mo20090l(MenuC18814l menuC18814l) {
    }
}
