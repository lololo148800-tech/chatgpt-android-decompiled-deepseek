package p893n;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.C10826i;
import androidx.appcompat.view.C10827j;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0746a0;
import p030B2.C0750c0;
import p571X9.AbstractC9159K2;
import p658b5.C11234e;
import p784hb.C14437f;
import p861l1.xapn.suYVq;
import p880m.AbstractC17123a;
import p999s.C19330Y0;
import p999s.InterfaceC19336b;
import p999s.InterfaceC19355h0;

/* JADX INFO: renamed from: n.E */
/* JADX INFO: loaded from: classes.dex */
public final class C17368E extends AbstractC9159K2 implements InterfaceC19336b {

    /* JADX INFO: renamed from: a */
    public Context f55412a;

    /* JADX INFO: renamed from: b */
    public Context f55413b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f55414c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f55415d;

    /* JADX INFO: renamed from: e */
    public InterfaceC19355h0 f55416e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f55417f;

    /* JADX INFO: renamed from: g */
    public final View f55418g;

    /* JADX INFO: renamed from: h */
    public boolean f55419h;

    /* JADX INFO: renamed from: i */
    public C17367D f55420i;

    /* JADX INFO: renamed from: j */
    public C17367D f55421j;

    /* JADX INFO: renamed from: k */
    public C11234e f55422k;

    /* JADX INFO: renamed from: l */
    public boolean f55423l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f55424m;

    /* JADX INFO: renamed from: n */
    public int f55425n;

    /* JADX INFO: renamed from: o */
    public boolean f55426o;

    /* JADX INFO: renamed from: p */
    public boolean f55427p;

    /* JADX INFO: renamed from: q */
    public boolean f55428q;

    /* JADX INFO: renamed from: r */
    public boolean f55429r;

    /* JADX INFO: renamed from: s */
    public boolean f55430s;

    /* JADX INFO: renamed from: t */
    public C10827j f55431t;

    /* JADX INFO: renamed from: u */
    public boolean f55432u;

    /* JADX INFO: renamed from: v */
    public boolean f55433v;

    /* JADX INFO: renamed from: w */
    public final C17366C f55434w;

    /* JADX INFO: renamed from: x */
    public final C17366C f55435x;

    /* JADX INFO: renamed from: y */
    public final C14437f f55436y;

    /* JADX INFO: renamed from: z */
    public static final AccelerateInterpolator f55411z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public static final DecelerateInterpolator f55410A = new DecelerateInterpolator();

    public C17368E(Activity activity, boolean z6) {
        new ArrayList();
        this.f55424m = new ArrayList();
        this.f55425n = 0;
        this.f55426o = true;
        this.f55430s = true;
        this.f55434w = new C17366C(this, 0);
        this.f55435x = new C17366C(this, 1);
        this.f55436y = new C14437f(this);
        View decorView = activity.getWindow().getDecorView();
        m19042d(decorView);
        if (z6) {
            return;
        }
        this.f55418g = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: b */
    public final void m19040b(boolean z6) {
        C0750c0 c0750c0M11139i;
        C0750c0 c0750c0M11139i2;
        if (z6) {
            if (!this.f55429r) {
                this.f55429r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f55414c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m19045g(false);
            }
        } else if (this.f55429r) {
            this.f55429r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f55414c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m19045g(false);
        }
        if (!this.f55415d.isLaidOut()) {
            if (z6) {
                ((C19330Y0) this.f55416e).f61223a.setVisibility(4);
                this.f55417f.setVisibility(0);
                return;
            } else {
                ((C19330Y0) this.f55416e).f61223a.setVisibility(0);
                this.f55417f.setVisibility(8);
                return;
            }
        }
        if (z6) {
            C19330Y0 c19330y0 = (C19330Y0) this.f55416e;
            c0750c0M11139i = AbstractC0738T.m1573a(c19330y0.f61223a);
            c0750c0M11139i.m1599a(0.0f);
            c0750c0M11139i.m1601c(100L);
            c0750c0M11139i.m1602d(new C10826i(c19330y0, 4));
            c0750c0M11139i2 = this.f55417f.m11139i(0, 200L);
        } else {
            C19330Y0 c19330y1 = (C19330Y0) this.f55416e;
            C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(c19330y1.f61223a);
            c0750c0M1573a.m1599a(1.0f);
            c0750c0M1573a.m1601c(200L);
            c0750c0M1573a.m1602d(new C10826i(c19330y1, 0));
            c0750c0M11139i = this.f55417f.m11139i(8, 100L);
            c0750c0M11139i2 = c0750c0M1573a;
        }
        C10827j c10827j = new C10827j();
        ArrayList arrayList = c10827j.f32138a;
        arrayList.add(c0750c0M11139i);
        View view = (View) c0750c0M11139i.f2123a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0750c0M11139i2.f2123a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0750c0M11139i2);
        c10827j.m11119b();
    }

    /* JADX INFO: renamed from: c */
    public final Context m19041c() {
        if (this.f55413b == null) {
            TypedValue typedValue = new TypedValue();
            this.f55412a.getTheme().resolveAttribute(com.openai.chatgpt.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f55413b = new ContextThemeWrapper(this.f55412a, i10);
            } else {
                this.f55413b = this.f55412a;
            }
        }
        return this.f55413b;
    }

    /* JADX INFO: renamed from: e */
    public final void m19043e(boolean z6) {
        if (this.f55419h) {
            return;
        }
        int i10 = z6 ? 4 : 0;
        C19330Y0 c19330y0 = (C19330Y0) this.f55416e;
        int i11 = c19330y0.f61224b;
        this.f55419h = true;
        c19330y0.m20428a((i10 & 4) | (i11 & (-5)));
    }

    /* JADX INFO: renamed from: f */
    public final void m19044f(boolean z6) {
        if (z6) {
            this.f55415d.setTabContainer(null);
            ((C19330Y0) this.f55416e).getClass();
        } else {
            ((C19330Y0) this.f55416e).getClass();
            this.f55415d.setTabContainer(null);
        }
        this.f55416e.getClass();
        ((C19330Y0) this.f55416e).f61223a.setCollapsible(false);
        this.f55414c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m19045g(boolean z6) {
        boolean z10 = this.f55429r || !(this.f55427p || this.f55428q);
        View view = this.f55418g;
        C14437f c14437f = this.f55436y;
        if (!z10) {
            if (this.f55430s) {
                this.f55430s = false;
                C10827j c10827j = this.f55431t;
                if (c10827j != null) {
                    c10827j.m11118a();
                }
                int i10 = this.f55425n;
                C17366C c17366c = this.f55434w;
                if (i10 != 0 || (!this.f55432u && !z6)) {
                    c17366c.mo1609c();
                    return;
                }
                this.f55415d.setAlpha(1.0f);
                this.f55415d.setTransitioning(true);
                C10827j c10827j2 = new C10827j();
                float f10 = -this.f55415d.getHeight();
                if (z6) {
                    int[] iArr = {0, 0};
                    this.f55415d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(this.f55415d);
                c0750c0M1573a.m1603e(f10);
                View view2 = (View) c0750c0M1573a.f2123a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c14437f != null ? new C0746a0(c14437f, 0, view2) : null);
                }
                boolean z11 = c10827j2.f32142e;
                ArrayList arrayList = c10827j2.f32138a;
                if (!z11) {
                    arrayList.add(c0750c0M1573a);
                }
                if (this.f55426o && view != null) {
                    C0750c0 c0750c0M1573a2 = AbstractC0738T.m1573a(view);
                    c0750c0M1573a2.m1603e(f10);
                    if (!c10827j2.f32142e) {
                        arrayList.add(c0750c0M1573a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f55411z;
                boolean z12 = c10827j2.f32142e;
                if (!z12) {
                    c10827j2.f32140c = accelerateInterpolator;
                }
                if (!z12) {
                    c10827j2.f32139b = 250L;
                }
                if (!z12) {
                    c10827j2.f32141d = c17366c;
                }
                this.f55431t = c10827j2;
                c10827j2.m11119b();
                return;
            }
            return;
        }
        if (this.f55430s) {
            return;
        }
        this.f55430s = true;
        C10827j c10827j3 = this.f55431t;
        if (c10827j3 != null) {
            c10827j3.m11118a();
        }
        this.f55415d.setVisibility(0);
        int i11 = this.f55425n;
        C17366C c17366c2 = this.f55435x;
        if (i11 == 0 && (this.f55432u || z6)) {
            this.f55415d.setTranslationY(0.0f);
            float f11 = -this.f55415d.getHeight();
            if (z6) {
                int[] iArr2 = {0, 0};
                this.f55415d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f55415d.setTranslationY(f11);
            C10827j c10827j4 = new C10827j();
            C0750c0 c0750c0M1573a3 = AbstractC0738T.m1573a(this.f55415d);
            c0750c0M1573a3.m1603e(0.0f);
            View view3 = (View) c0750c0M1573a3.f2123a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c14437f != null ? new C0746a0(c14437f, 0, view3) : null);
            }
            boolean z13 = c10827j4.f32142e;
            ArrayList arrayList2 = c10827j4.f32138a;
            if (!z13) {
                arrayList2.add(c0750c0M1573a3);
            }
            if (this.f55426o && view != null) {
                view.setTranslationY(f11);
                C0750c0 c0750c0M1573a4 = AbstractC0738T.m1573a(view);
                c0750c0M1573a4.m1603e(0.0f);
                if (!c10827j4.f32142e) {
                    arrayList2.add(c0750c0M1573a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f55410A;
            boolean z14 = c10827j4.f32142e;
            if (!z14) {
                c10827j4.f32140c = decelerateInterpolator;
            }
            if (!z14) {
                c10827j4.f32139b = 250L;
            }
            if (!z14) {
                c10827j4.f32141d = c17366c2;
            }
            this.f55431t = c10827j4;
            c10827j4.m11119b();
        } else {
            this.f55415d.setAlpha(1.0f);
            this.f55415d.setTranslationY(0.0f);
            if (this.f55426o && view != null) {
                view.setTranslationY(0.0f);
            }
            c17366c2.mo1609c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f55414c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            AbstractC0728I.m1543c(actionBarOverlayLayout);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19042d(View view) {
        String simpleName;
        InterfaceC19355h0 wrapper;
        boolean z6;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.openai.chatgpt.R.id.decor_content_parent);
        this.f55414c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.openai.chatgpt.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC19355h0) {
            wrapper = (InterfaceC19355h0) callbackFindViewById;
        } else if (callbackFindViewById instanceof Toolbar) {
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        } else {
            if (callbackFindViewById != null) {
                simpleName = callbackFindViewById.getClass().getSimpleName();
            } else {
                simpleName = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(simpleName));
        }
        this.f55416e = wrapper;
        this.f55417f = (ActionBarContextView) view.findViewById(com.openai.chatgpt.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.openai.chatgpt.R.id.action_bar_container);
        this.f55415d = actionBarContainer;
        InterfaceC19355h0 interfaceC19355h0 = this.f55416e;
        if (interfaceC19355h0 != null && this.f55417f != null && actionBarContainer != null) {
            Context context = ((C19330Y0) interfaceC19355h0).f61223a.getContext();
            this.f55412a = context;
            if ((((C19330Y0) this.f55416e).f61224b & 4) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                this.f55419h = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f55416e.getClass();
            m19044f(context.getResources().getBoolean(com.openai.chatgpt.R.bool.abc_action_bar_embed_tabs));
            TypedArray typedArrayObtainStyledAttributes = this.f55412a.obtainStyledAttributes(null, AbstractC17123a.f54732a, com.openai.chatgpt.R.attr.actionBarStyle, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f55414c;
                if (actionBarOverlayLayout2.f32228u0) {
                    this.f55433v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException(suYVq.psXRrlJOR);
                }
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f55415d;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                AbstractC0730K.m1554k(actionBarContainer2, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C17368E.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public C17368E(Dialog dialog) {
        new ArrayList();
        this.f55424m = new ArrayList();
        this.f55425n = 0;
        this.f55426o = true;
        this.f55430s = true;
        this.f55434w = new C17366C(this, 0);
        this.f55435x = new C17366C(this, 1);
        this.f55436y = new C14437f(this);
        m19042d(dialog.getWindow().getDecorView());
    }
}
