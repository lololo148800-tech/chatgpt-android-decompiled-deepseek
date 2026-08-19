package p893n;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.view.C10820c;
import androidx.appcompat.view.C10825h;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import livekit.org.webrtc.MediaStreamTrack;
import p003A1.AbstractC0235c;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0750c0;
import p030B2.InterfaceC0769m;
import p1072w2.C20793e;
import p1072w2.InterfaceC20795g;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9171M2;
import p588Y2.C9642z;
import p594Y9.C9895g4;
import p604Yk.C10077b;
import p692d0.C12959L;
import p729ej.C13414e;
import p741f5.RunnableC13542a;
import p775h2.AbstractC14376f;
import p880m.AbstractC17123a;
import p896n2.AbstractC17452e;
import p976r.C18809g;
import p976r.C18810h;
import p976r.C18816n;
import p976r.InterfaceC18812j;
import p976r.MenuC18814l;
import p999s.AbstractC19353g1;
import p999s.C19320T0;
import p999s.C19330Y0;
import p999s.C19345e;
import p999s.C19356i;
import p999s.C19372q;
import p999s.InterfaceC19352g0;
import p999s.InterfaceC19355h0;

/* JADX INFO: renamed from: n.v */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C17390v extends AbstractC17379k implements InterfaceC18812j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: t1 */
    public static final C12959L f55523t1 = new C12959L(0);

    /* JADX INFO: renamed from: u1 */
    public static final int[] f55524u1 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: v1 */
    public static final boolean f55525v1 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A0 */
    public C17368E f55526A0;

    /* JADX INFO: renamed from: B0 */
    public C10825h f55527B0;

    /* JADX INFO: renamed from: C0 */
    public CharSequence f55528C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC19352g0 f55529D0;

    /* JADX INFO: renamed from: E0 */
    public C10077b f55530E0;

    /* JADX INFO: renamed from: F0 */
    public C9642z f55531F0;

    /* JADX INFO: renamed from: G0 */
    public AbstractC10818a f55532G0;

    /* JADX INFO: renamed from: H0 */
    public ActionBarContextView f55533H0;

    /* JADX INFO: renamed from: I0 */
    public PopupWindow f55534I0;

    /* JADX INFO: renamed from: J0 */
    public RunnableC17380l f55535J0;

    /* JADX INFO: renamed from: L0 */
    public boolean f55537L0;

    /* JADX INFO: renamed from: M0 */
    public ViewGroup f55538M0;

    /* JADX INFO: renamed from: N0 */
    public TextView f55539N0;

    /* JADX INFO: renamed from: O0 */
    public View f55540O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f55541P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f55542Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f55543R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f55544S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f55545T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f55546U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f55547V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f55548W0;

    /* JADX INFO: renamed from: X0 */
    public C17389u[] f55549X0;

    /* JADX INFO: renamed from: Y0 */
    public C17389u f55550Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f55551Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f55552a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f55553b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f55554c1;

    /* JADX INFO: renamed from: d1 */
    public Configuration f55555d1;

    /* JADX INFO: renamed from: e1 */
    public final int f55556e1;

    /* JADX INFO: renamed from: f1 */
    public int f55557f1;

    /* JADX INFO: renamed from: g1 */
    public int f55558g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f55559h1;

    /* JADX INFO: renamed from: i1 */
    public C17387s f55560i1;

    /* JADX INFO: renamed from: j1 */
    public C17387s f55561j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f55562k1;

    /* JADX INFO: renamed from: l1 */
    public int f55563l1;

    /* JADX INFO: renamed from: n1 */
    public boolean f55565n1;

    /* JADX INFO: renamed from: o1 */
    public Rect f55566o1;

    /* JADX INFO: renamed from: p1 */
    public Rect f55567p1;

    /* JADX INFO: renamed from: q1 */
    public C17393y f55568q1;

    /* JADX INFO: renamed from: r1 */
    public OnBackInvokedDispatcher f55569r1;

    /* JADX INFO: renamed from: s1 */
    public OnBackInvokedCallback f55570s1;

    /* JADX INFO: renamed from: v0 */
    public final Object f55571v0;

    /* JADX INFO: renamed from: w0 */
    public final Context f55572w0;

    /* JADX INFO: renamed from: x0 */
    public Window f55573x0;

    /* JADX INFO: renamed from: y0 */
    public C17386r f55574y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f55575z0;

    /* JADX INFO: renamed from: K0 */
    public C0750c0 f55536K0 = null;

    /* JADX INFO: renamed from: m1 */
    public final RunnableC17380l f55564m1 = new RunnableC17380l(this, 0);

    public LayoutInflaterFactory2C17390v(Context context, Window window, InterfaceC17376h interfaceC17376h, Object obj) {
        AbstractActivityC17375g abstractActivityC17375g = null;
        this.f55556e1 = -100;
        this.f55572w0 = context;
        this.f55571v0 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC17375g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC17375g = (AbstractActivityC17375g) context;
                    break;
                }
            }
            if (abstractActivityC17375g != null) {
                this.f55556e1 = ((LayoutInflaterFactory2C17390v) abstractActivityC17375g.m19053p()).f55556e1;
            }
        }
        if (this.f55556e1 == -100) {
            C12959L c12959l = f55523t1;
            Integer num = (Integer) c12959l.get(this.f55571v0.getClass().getName());
            if (num != null) {
                this.f55556e1 = num.intValue();
                c12959l.remove(this.f55571v0.getClass().getName());
            }
        }
        if (window != null) {
            m19099q(window);
        }
        C19372q.m20475d();
    }

    /* JADX INFO: renamed from: C */
    public static C20793e m19083C(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC17383o.m19076b(configuration) : C20793e.m21310b(AbstractC17382n.m19074b(configuration.locale));
    }

    /* JADX INFO: renamed from: r */
    public static C20793e m19084r(Context context) {
        C20793e c20793e;
        C20793e c20793eM21310b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (c20793e = AbstractC17379k.f55486o0) == null) {
            return null;
        }
        C20793e c20793eM19083C = m19083C(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC20795g interfaceC20795g = c20793e.f66056a;
        int i11 = 0;
        if (i10 < 24) {
            c20793eM21310b = interfaceC20795g.isEmpty() ? C20793e.f66055b : C20793e.m21310b(AbstractC17382n.m19074b(interfaceC20795g.get(0)));
        } else if (interfaceC20795g.isEmpty()) {
            c20793eM21310b = C20793e.f66055b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < c20793eM19083C.f66056a.size() + interfaceC20795g.size()) {
                Locale locale = i11 < interfaceC20795g.size() ? interfaceC20795g.get(i11) : c20793eM19083C.f66056a.get(i11 - interfaceC20795g.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            c20793eM21310b = C20793e.m21309a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c20793eM21310b.f66056a.isEmpty() ? c20793eM19083C : c20793eM21310b;
    }

    /* JADX INFO: renamed from: v */
    public static Configuration m19085v(Context context, int i10, C20793e c20793e, Configuration configuration, boolean z6) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (c20793e != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC17383o.m19078d(configuration2, c20793e);
            } else {
                InterfaceC20795g interfaceC20795g = c20793e.f66056a;
                configuration2.setLocale(interfaceC20795g.get(0));
                configuration2.setLayoutDirection(interfaceC20795g.get(0));
            }
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m19086A() {
        if (this.f55573x0 == null) {
            Object obj = this.f55571v0;
            if (obj instanceof Activity) {
                m19099q(((Activity) obj).getWindow());
            }
        }
        if (this.f55573x0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC0235c m19087B(Context context) {
        if (this.f55560i1 == null) {
            if (C13711h.f43257q0 == null) {
                Context applicationContext = context.getApplicationContext();
                C13711h.f43257q0 = new C13711h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f55560i1 = new C17387s(this, C13711h.f43257q0);
        }
        return this.f55560i1;
    }

    /* JADX INFO: renamed from: D */
    public final C17389u m19088D(int i10) {
        C17389u[] c17389uArr = this.f55549X0;
        if (c17389uArr == null || c17389uArr.length <= i10) {
            C17389u[] c17389uArr2 = new C17389u[i10 + 1];
            if (c17389uArr != null) {
                System.arraycopy(c17389uArr, 0, c17389uArr2, 0, c17389uArr.length);
            }
            this.f55549X0 = c17389uArr2;
            c17389uArr = c17389uArr2;
        }
        C17389u c17389u = c17389uArr[i10];
        if (c17389u != null) {
            return c17389u;
        }
        C17389u c17389u2 = new C17389u();
        c17389u2.f55507a = i10;
        c17389u2.f55520n = false;
        c17389uArr[i10] = c17389u2;
        return c17389u2;
    }

    /* JADX INFO: renamed from: E */
    public final void m19089E() {
        m19105z();
        if (this.f55543R0 && this.f55526A0 == null) {
            Object obj = this.f55571v0;
            if (obj instanceof Activity) {
                this.f55526A0 = new C17368E((Activity) obj, this.f55544S0);
            } else if (obj instanceof Dialog) {
                this.f55526A0 = new C17368E((Dialog) obj);
            }
            C17368E c17368e = this.f55526A0;
            if (c17368e != null) {
                c17368e.m19043e(this.f55565n1);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m19090F(int i10) {
        this.f55563l1 = (1 << i10) | this.f55563l1;
        if (this.f55562k1) {
            return;
        }
        View decorView = this.f55573x0.getDecorView();
        RunnableC17380l runnableC17380l = this.f55564m1;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        decorView.postOnAnimation(runnableC17380l);
        this.f55562k1 = true;
    }

    /* JADX INFO: renamed from: G */
    public final int m19091G(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m19087B(context).mo773g();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f55561j1 == null) {
                    this.f55561j1 = new C17387s(this, context);
                }
                return this.f55561j1.mo773g();
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m19092H() {
        InterfaceC19355h0 interfaceC19355h0;
        C19320T0 c19320t0;
        boolean z6 = this.f55551Z0;
        this.f55551Z0 = false;
        C17389u c17389uM19088D = m19088D(0);
        if (c17389uM19088D.f55519m) {
            if (!z6) {
                m19102u(c17389uM19088D, true);
            }
            return true;
        }
        AbstractC10818a abstractC10818a = this.f55532G0;
        if (abstractC10818a != null) {
            abstractC10818a.mo11098a();
            return true;
        }
        m19089E();
        C17368E c17368e = this.f55526A0;
        if (c17368e == null || (interfaceC19355h0 = c17368e.f55416e) == null || (c19320t0 = ((C19330Y0) interfaceC19355h0).f61223a.f32286a1) == null || c19320t0.f61193Z == null) {
            return false;
        }
        C19320T0 c19320t1 = ((C19330Y0) interfaceC19355h0).f61223a.f32286a1;
        C18816n c18816n = c19320t1 == null ? null : c19320t1.f61193Z;
        if (c18816n != null) {
            c18816n.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        if (r3.f59837r0.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m19093I(C17389u c17389u, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (c17389u.f55519m || this.f55554c1) {
            return;
        }
        int i11 = c17389u.f55507a;
        Context context = this.f55572w0;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f55573x0.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, c17389u.f55514h)) {
            m19102u(c17389u, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m19095K(c17389u, keyEvent)) {
            C17388t c17388t = c17389u.f55511e;
            if (c17388t != null && !c17389u.f55520n) {
                View view = c17389u.f55513g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                c17389u.f55518l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c17389u.f55509c;
                layoutParams2.windowAnimations = c17389u.f55510d;
                windowManager.addView(c17389u.f55511e, layoutParams2);
                c17389u.f55519m = true;
                if (i11 == 0) {
                    m19097M();
                }
            }
            if (c17388t == null) {
                m19089E();
                C17368E c17368e = this.f55526A0;
                Context contextM19041c = c17368e != null ? c17368e.m19041c() : null;
                if (contextM19041c != null) {
                    context = contextM19041c;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.openai.chatgpt.R.attr.actionBarPopupTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    themeNewTheme.applyStyle(i12, true);
                }
                themeNewTheme.resolveAttribute(com.openai.chatgpt.R.attr.panelMenuListTheme, typedValue, true);
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    themeNewTheme.applyStyle(i13, true);
                } else {
                    themeNewTheme.applyStyle(com.openai.chatgpt.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C10820c c10820c = new C10820c(context, 0);
                c10820c.getTheme().setTo(themeNewTheme);
                c17389u.f55516j = c10820c;
                TypedArray typedArrayObtainStyledAttributes = c10820c.obtainStyledAttributes(AbstractC17123a.f54741j);
                c17389u.f55508b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c17389u.f55510d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c17389u.f55511e = new C17388t(this, c17389u.f55516j);
                c17389u.f55509c = 81;
            } else if (c17389u.f55520n && c17388t.getChildCount() > 0) {
                c17389u.f55511e.removeAllViews();
            }
            View view2 = c17389u.f55513g;
            if (view2 == null) {
                if (c17389u.f55514h != null) {
                    if (this.f55531F0 == null) {
                        this.f55531F0 = new C9642z(this, 16);
                    }
                    C9642z c9642z = this.f55531F0;
                    if (c17389u.f55515i == null) {
                        C18810h c18810h = new C18810h(c17389u.f55516j);
                        c17389u.f55515i = c18810h;
                        c18810h.f59836q0 = c9642z;
                        MenuC18814l menuC18814l = c17389u.f55514h;
                        menuC18814l.m20121b(c18810h, menuC18814l.f59845a);
                    }
                    C18810h c18810h2 = c17389u.f55515i;
                    C17388t c17388t2 = c17389u.f55511e;
                    if (c18810h2.f59835p0 == null) {
                        c18810h2.f59835p0 = (ExpandedMenuView) c18810h2.f59833Z.inflate(com.openai.chatgpt.R.layout.abc_expanded_menu_layout, (ViewGroup) c17388t2, false);
                        if (c18810h2.f59837r0 == null) {
                            c18810h2.f59837r0 = new C18809g(c18810h2);
                        }
                        c18810h2.f59835p0.setAdapter((ListAdapter) c18810h2.f59837r0);
                        c18810h2.f59835p0.setOnItemClickListener(c18810h2);
                    }
                    ExpandedMenuView expandedMenuView = c18810h2.f59835p0;
                    c17389u.f55512f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                c17389u.f55520n = true;
                return;
            }
            c17389u.f55512f = view2;
            if (c17389u.f55512f != null) {
                if (c17389u.f55513g == null) {
                    C18810h c18810h3 = c17389u.f55515i;
                    if (c18810h3.f59837r0 == null) {
                        c18810h3.f59837r0 = new C18809g(c18810h3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = c17389u.f55512f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c17389u.f55511e.setBackgroundResource(c17389u.f55508b);
                ViewParent parent = c17389u.f55512f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c17389u.f55512f);
                }
                c17389u.f55511e.addView(c17389u.f55512f, layoutParams3);
                if (!c17389u.f55512f.hasFocus()) {
                    c17389u.f55512f.requestFocus();
                }
            }
            c17389u.f55520n = true;
            return;
            i10 = -2;
            c17389u.f55518l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c17389u.f55509c;
            layoutParams4.windowAnimations = c17389u.f55510d;
            windowManager.addView(c17389u.f55511e, layoutParams4);
            c17389u.f55519m = true;
            if (i11 == 0) {
                m19097M();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m19094J(C17389u c17389u, int i10, KeyEvent keyEvent) {
        MenuC18814l menuC18814l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c17389u.f55517k || m19095K(c17389u, keyEvent)) && (menuC18814l = c17389u.f55514h) != null) {
            return menuC18814l.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m19095K(C17389u c17389u, KeyEvent keyEvent) {
        InterfaceC19352g0 interfaceC19352g0;
        InterfaceC19352g0 interfaceC19352g1;
        Resources.Theme themeNewTheme;
        InterfaceC19352g0 interfaceC19352g2;
        InterfaceC19352g0 interfaceC19352g3;
        if (this.f55554c1) {
            return false;
        }
        if (c17389u.f55517k) {
            return true;
        }
        C17389u c17389u2 = this.f55550Y0;
        if (c17389u2 != null && c17389u2 != c17389u) {
            m19102u(c17389u2, false);
        }
        Window.Callback callback = this.f55573x0.getCallback();
        int i10 = c17389u.f55507a;
        if (callback != null) {
            c17389u.f55513g = callback.onCreatePanelView(i10);
        }
        boolean z6 = i10 == 0 || i10 == 108;
        if (z6 && (interfaceC19352g3 = this.f55529D0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC19352g3;
            actionBarOverlayLayout.m11144k();
            ((C19330Y0) actionBarOverlayLayout.f32226s0).f61234l = true;
        }
        if (c17389u.f55513g == null) {
            MenuC18814l menuC18814l = c17389u.f55514h;
            if (menuC18814l == null || c17389u.f55521o) {
                if (menuC18814l == null) {
                    Context context = this.f55572w0;
                    if ((i10 == 0 || i10 == 108) && this.f55529D0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.openai.chatgpt.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.openai.chatgpt.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.openai.chatgpt.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C10820c c10820c = new C10820c(context, 0);
                            c10820c.getTheme().setTo(themeNewTheme);
                            context = c10820c;
                        }
                    }
                    MenuC18814l menuC18814l2 = new MenuC18814l(context);
                    menuC18814l2.f59849e = this;
                    MenuC18814l menuC18814l3 = c17389u.f55514h;
                    if (menuC18814l2 != menuC18814l3) {
                        if (menuC18814l3 != null) {
                            menuC18814l3.m20129r(c17389u.f55515i);
                        }
                        c17389u.f55514h = menuC18814l2;
                        C18810h c18810h = c17389u.f55515i;
                        if (c18810h != null) {
                            menuC18814l2.m20121b(c18810h, menuC18814l2.f59845a);
                        }
                    }
                    if (c17389u.f55514h == null) {
                        return false;
                    }
                }
                if (z6 && (interfaceC19352g1 = this.f55529D0) != null) {
                    if (this.f55530E0 == null) {
                        this.f55530E0 = new C10077b(this, 14);
                    }
                    ((ActionBarOverlayLayout) interfaceC19352g1).m11145l(c17389u.f55514h, this.f55530E0);
                }
                c17389u.f55514h.m20134w();
                if (!callback.onCreatePanelMenu(i10, c17389u.f55514h)) {
                    MenuC18814l menuC18814l4 = c17389u.f55514h;
                    if (menuC18814l4 != null) {
                        if (menuC18814l4 != null) {
                            menuC18814l4.m20129r(c17389u.f55515i);
                        }
                        c17389u.f55514h = null;
                    }
                    if (z6 && (interfaceC19352g0 = this.f55529D0) != null) {
                        ((ActionBarOverlayLayout) interfaceC19352g0).m11145l(null, this.f55530E0);
                    }
                    return false;
                }
                c17389u.f55521o = false;
            }
            c17389u.f55514h.m20134w();
            Bundle bundle = c17389u.f55522p;
            if (bundle != null) {
                c17389u.f55514h.m20130s(bundle);
                c17389u.f55522p = null;
            }
            if (!callback.onPreparePanel(0, c17389u.f55513g, c17389u.f55514h)) {
                if (z6 && (interfaceC19352g2 = this.f55529D0) != null) {
                    ((ActionBarOverlayLayout) interfaceC19352g2).m11145l(null, this.f55530E0);
                }
                c17389u.f55514h.m20133v();
                return false;
            }
            c17389u.f55514h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c17389u.f55514h.m20133v();
        }
        c17389u.f55517k = true;
        c17389u.f55518l = false;
        this.f55550Y0 = c17389u;
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final void m19096L() {
        if (this.f55537L0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m19097M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f55569r1 != null && (m19088D(0).f55519m || this.f55532G0 != null)) {
                z6 = true;
            }
            if (z6 && this.f55570s1 == null) {
                this.f55570s1 = AbstractC17385q.m19080b(this.f55569r1, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f55570s1) == null) {
                    return;
                }
                AbstractC17385q.m19081c(this.f55569r1, onBackInvokedCallback);
                this.f55570s1 = null;
            }
        }
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: c */
    public final void mo19065c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f55572w0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C17390v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: e */
    public final void mo19066e() {
        String strM19129c;
        this.f55552a1 = true;
        m19098o(false, true);
        m19086A();
        Object obj = this.f55571v0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM19129c = AbstractC17452e.m19129c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strM19129c = null;
            }
            if (strM19129c != null) {
                C17368E c17368e = this.f55526A0;
                if (c17368e == null) {
                    this.f55565n1 = true;
                } else {
                    c17368e.m19043e(true);
                }
            }
            synchronized (AbstractC17379k.f55491t0) {
                AbstractC17379k.m19062g(this);
                AbstractC17379k.f55490s0.add(new WeakReference(this));
            }
        }
        this.f55555d1 = new Configuration(this.f55572w0.getResources().getConfiguration());
        this.f55553b1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: f */
    public final void mo19067f() {
        if (this.f55571v0 instanceof Activity) {
            synchronized (AbstractC17379k.f55491t0) {
                AbstractC17379k.m19062g(this);
            }
        }
        if (this.f55562k1) {
            this.f55573x0.getDecorView().removeCallbacks(this.f55564m1);
        }
        this.f55554c1 = true;
        if (this.f55556e1 != -100) {
            Object obj = this.f55571v0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f55523t1.put(this.f55571v0.getClass().getName(), Integer.valueOf(this.f55556e1));
            } else {
                f55523t1.remove(this.f55571v0.getClass().getName());
            }
        } else {
            f55523t1.remove(this.f55571v0.getClass().getName());
        }
        C17387s c17387s = this.f55560i1;
        if (c17387s != null) {
            c17387s.m769c();
        }
        C17387s c17387s2 = this.f55561j1;
        if (c17387s2 != null) {
            c17387s2.m769c();
        }
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: h */
    public final boolean mo19068h(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f55547V0 && i10 == 108) {
            return false;
        }
        if (this.f55543R0 && i10 == 1) {
            this.f55543R0 = false;
        }
        if (i10 == 1) {
            m19096L();
            this.f55547V0 = true;
            return true;
        }
        if (i10 == 2) {
            m19096L();
            this.f55541P0 = true;
            return true;
        }
        if (i10 == 5) {
            m19096L();
            this.f55542Q0 = true;
            return true;
        }
        if (i10 == 10) {
            m19096L();
            this.f55545T0 = true;
            return true;
        }
        if (i10 == 108) {
            m19096L();
            this.f55543R0 = true;
            return true;
        }
        if (i10 != 109) {
            return this.f55573x0.requestFeature(i10);
        }
        m19096L();
        this.f55544S0 = true;
        return true;
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: i */
    public final void mo19069i(int i10) {
        m19105z();
        ViewGroup viewGroup = (ViewGroup) this.f55538M0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f55572w0).inflate(i10, viewGroup);
        this.f55574y0.m19082b(this.f55573x0.getCallback());
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: j */
    public final void mo19070j(View view) {
        m19105z();
        ViewGroup viewGroup = (ViewGroup) this.f55538M0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f55574y0.m19082b(this.f55573x0.getCallback());
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: k */
    public final void mo19071k(View view, ViewGroup.LayoutParams layoutParams) {
        m19105z();
        ViewGroup viewGroup = (ViewGroup) this.f55538M0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f55574y0.m19082b(this.f55573x0.getCallback());
    }

    @Override // p893n.AbstractC17379k
    /* JADX INFO: renamed from: m */
    public final void mo19072m(CharSequence charSequence) {
        this.f55528C0 = charSequence;
        InterfaceC19352g0 interfaceC19352g0 = this.f55529D0;
        if (interfaceC19352g0 != null) {
            interfaceC19352g0.setWindowTitle(charSequence);
            return;
        }
        C17368E c17368e = this.f55526A0;
        if (c17368e == null) {
            TextView textView = this.f55539N0;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C19330Y0 c19330y0 = (C19330Y0) c17368e.f55416e;
        if (c19330y0.f61229g) {
            return;
        }
        c19330y0.f61230h = charSequence;
        if ((c19330y0.f61224b & 8) != 0) {
            Toolbar toolbar = c19330y0.f61223a;
            toolbar.setTitle(charSequence);
            if (c19330y0.f61229g) {
                AbstractC0738T.m1585m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final boolean m19098o(boolean z6, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        int i11;
        if (this.f55554c1) {
            return false;
        }
        int i12 = this.f55556e1;
        if (i12 == -100) {
            i12 = AbstractC17379k.f55485Z;
        }
        int i13 = i12;
        Context context = this.f55572w0;
        int iM19091G = m19091G(context, i13);
        int i14 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        C20793e c20793eM19084r = i14 < 33 ? m19084r(context) : null;
        if (!z10 && c20793eM19084r != null) {
            c20793eM19084r = m19083C(context.getResources().getConfiguration());
        }
        Configuration configurationM19085v = m19085v(context, iM19091G, c20793eM19084r, null, false);
        boolean z14 = this.f55559h1;
        Object obj3 = this.f55571v0;
        if (z14 || !(obj3 instanceof Activity)) {
            this.f55559h1 = true;
            i10 = this.f55558g1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                if (i14 >= 29) {
                    i11 = 269221888;
                } else {
                    i11 = i14 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11);
                    if (activityInfo != null) {
                        this.f55558g1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f55558g1 = 0;
                }
                this.f55559h1 = true;
                i10 = this.f55558g1;
            }
        }
        Configuration configuration = this.f55555d1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i15 = configuration.uiMode & 48;
        int i16 = configurationM19085v.uiMode & 48;
        C20793e c20793eM19083C = m19083C(configuration);
        C20793e c20793eM19083C2 = c20793eM19084r == null ? null : m19083C(configurationM19085v);
        int i17 = i15 != i16 ? 512 : 0;
        if (c20793eM19083C2 != null && !c20793eM19083C.equals(c20793eM19083C2)) {
            i17 |= 8196;
        }
        if (((~i10) & i17) != 0 && z6 && this.f55552a1 && ((f55525v1 || this.f55553b1) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z11 = false;
            } else {
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 31 && (i17 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM19085v.getLayoutDirection());
                }
                if (i18 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC13542a(activity, 12));
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i17 == 0) {
            z12 = z11;
        } else {
            boolean z15 = (i10 & i17) == i17;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i16;
            if (c20793eM19083C2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC17383o.m19078d(configuration2, c20793eM19083C2);
                } else {
                    InterfaceC20795g interfaceC20795g = c20793eM19083C2.f66056a;
                    configuration2.setLocale(interfaceC20795g.get(0));
                    configuration2.setLayoutDirection(interfaceC20795g.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 26 && i19 < 28) {
                if (i19 >= 24) {
                    if (!AbstractC9171M2.f27950h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            AbstractC9171M2.f27949g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e11) {
                            AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                        }
                        AbstractC9171M2.f27950h = true;
                    }
                    Field field = AbstractC9171M2.f27949g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e12) {
                            AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!AbstractC9171M2.f27944b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    AbstractC9171M2.f27943a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e13) {
                                    AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                                }
                                AbstractC9171M2.f27944b = true;
                            }
                            Field field2 = AbstractC9171M2.f27943a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e14) {
                                    AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                                }
                            }
                            if (obj2 != null) {
                                AbstractC9171M2.m9724b(obj2);
                            }
                        }
                    }
                } else {
                    if (!AbstractC9171M2.f27944b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC9171M2.f27943a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        AbstractC9171M2.f27944b = true;
                    }
                    Field field3 = AbstractC9171M2.f27943a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e16) {
                            AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e16);
                        }
                    }
                    if (obj2 != null) {
                        AbstractC9171M2.m9724b(obj2);
                    }
                }
            }
            int i20 = this.f55557f1;
            if (i20 != 0) {
                context.setTheme(i20);
                z13 = true;
                context.getTheme().applyStyle(this.f55557f1, true);
            } else {
                z13 = true;
            }
            if (z15 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC11112u) {
                    if (((InterfaceC11112u) activity2).mo7809i().mo7807b().compareTo(EnumC11104m.f33476o0) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f55553b1 && !this.f55554c1) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z12 = z13;
        }
        if (z12 && (obj3 instanceof AbstractActivityC17375g)) {
            if ((i17 & 512) != 0) {
            }
            if ((i17 & 4) != 0) {
            }
        }
        if (c20793eM19083C2 != null) {
            C20793e c20793eM19083C3 = m19083C(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC17383o.m19077c(c20793eM19083C3);
            } else {
                Locale.setDefault(c20793eM19083C3.f66056a.get(0));
            }
        }
        if (i13 == 0) {
            m19087B(context).m781o();
        } else {
            C17387s c17387s = this.f55560i1;
            if (c17387s != null) {
                c17387s.m769c();
            }
        }
        if (i13 == 3) {
            if (this.f55561j1 == null) {
                this.f55561j1 = new C17387s(this, context);
            }
            this.f55561j1.m781o();
        } else {
            C17387s c17387s2 = this.f55561j1;
            if (c17387s2 != null) {
                c17387s2.m769c();
            }
        }
        return z12;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: n.y
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: n.y
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: android.content.Context
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p893n.LayoutInflaterFactory2C17390v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: p */
    public final boolean mo10219p(MenuC18814l menuC18814l, MenuItem menuItem) {
        C17389u c17389u;
        Window.Callback callback = this.f55573x0.getCallback();
        if (callback != null && !this.f55554c1) {
            MenuC18814l menuC18814lMo20102k = menuC18814l.mo20102k();
            C17389u[] c17389uArr = this.f55549X0;
            int length = c17389uArr != null ? c17389uArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                c17389u = c17389uArr[i10];
                if (c17389u != null && c17389u.f55514h == menuC18814lMo20102k) {
                    if (c17389u != null) {
                        return callback.onMenuItemSelected(c17389u.f55507a, menuItem);
                    }
                }
            }
            c17389u = null;
            if (c17389u != null) {
                return callback.onMenuItemSelected(c17389u.f55507a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX INFO: renamed from: q */
    public final void m19099q(Window window) {
        Drawable drawableM20385g;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f55573x0 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C17386r) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C17386r c17386r = new C17386r(this, callback);
        this.f55574y0 = c17386r;
        window.setCallback(c17386r);
        int[] iArr = f55524u1;
        Context context = this.f55572w0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM20385g = null;
        } else {
            C19372q c19372qM20473a = C19372q.m20473a();
            synchronized (c19372qM20473a) {
                drawableM20385g = c19372qM20473a.f61354a.m20385g(context, resourceId, true);
            }
        }
        if (drawableM20385g != null) {
            window.setBackgroundDrawable(drawableM20385g);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f55573x0 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f55569r1) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f55570s1) != null) {
            AbstractC17385q.m19081c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f55570s1 = null;
        }
        Object obj = this.f55571v0;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f55569r1 = AbstractC17385q.m19079a(activity);
            } else {
                this.f55569r1 = null;
            }
        } else {
            this.f55569r1 = null;
        }
        m19097M();
    }

    /* JADX INFO: renamed from: s */
    public final void m19100s(int i10, C17389u c17389u, MenuC18814l menuC18814l) {
        if (menuC18814l == null) {
            if (c17389u == null && i10 >= 0) {
                C17389u[] c17389uArr = this.f55549X0;
                if (i10 < c17389uArr.length) {
                    c17389u = c17389uArr[i10];
                }
            }
            if (c17389u != null) {
                menuC18814l = c17389u.f55514h;
            }
        }
        if ((c17389u == null || c17389u.f55519m) && !this.f55554c1) {
            C17386r c17386r = this.f55574y0;
            Window.Callback callback = this.f55573x0.getCallback();
            c17386r.getClass();
            try {
                c17386r.f55501o0 = true;
                callback.onPanelClosed(i10, menuC18814l);
            } finally {
                c17386r.f55501o0 = false;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m19101t(MenuC18814l menuC18814l) {
        C19356i c19356i;
        if (this.f55548W0) {
            return;
        }
        this.f55548W0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f55529D0;
        actionBarOverlayLayout.m11144k();
        ActionMenuView actionMenuView = ((C19330Y0) actionBarOverlayLayout.f32226s0).f61223a.f32292o0;
        if (actionMenuView != null && (c19356i = actionMenuView.f32238H0) != null) {
            c19356i.m20459f();
            C19345e c19345e = c19356i.f61292F0;
            if (c19345e != null && c19345e.m20143b()) {
                c19345e.f59921i.dismiss();
            }
        }
        Window.Callback callback = this.f55573x0.getCallback();
        if (callback != null && !this.f55554c1) {
            callback.onPanelClosed(108, menuC18814l);
        }
        this.f55548W0 = false;
    }

    /* JADX INFO: renamed from: u */
    public final void m19102u(C17389u c17389u, boolean z6) {
        C17388t c17388t;
        InterfaceC19352g0 interfaceC19352g0;
        C19356i c19356i;
        if (z6 && c17389u.f55507a == 0 && (interfaceC19352g0 = this.f55529D0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC19352g0;
            actionBarOverlayLayout.m11144k();
            ActionMenuView actionMenuView = ((C19330Y0) actionBarOverlayLayout.f32226s0).f61223a.f32292o0;
            if (actionMenuView != null && (c19356i = actionMenuView.f32238H0) != null && c19356i.m20460i()) {
                m19101t(c17389u.f55514h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f55572w0.getSystemService("window");
        if (windowManager != null && c17389u.f55519m && (c17388t = c17389u.f55511e) != null) {
            windowManager.removeView(c17388t);
            if (z6) {
                m19100s(c17389u.f55507a, c17389u, null);
            }
        }
        c17389u.f55517k = false;
        c17389u.f55518l = false;
        c17389u.f55519m = false;
        c17389u.f55512f = null;
        c17389u.f55520n = true;
        if (this.f55550Y0 == c17389u) {
            this.f55550Y0 = null;
        }
        if (c17389u.f55507a == 0) {
            m19097M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX INFO: renamed from: w */
    public final boolean m19103w(KeyEvent keyEvent) {
        View decorView;
        boolean z6;
        boolean z10;
        boolean zM19095K;
        ActionMenuView actionMenuView;
        C19356i c19356i;
        C19356i c19356i2;
        C19356i c19356i3;
        Object obj = this.f55571v0;
        if (((obj instanceof InterfaceC0769m) || (obj instanceof DialogInterfaceC17373e)) && (decorView = this.f55573x0.getDecorView()) != null && AbstractC8154o0.m8712c(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            C17386r c17386r = this.f55574y0;
            Window.Callback callback = this.f55573x0.getCallback();
            c17386r.getClass();
            try {
                c17386r.f55500Z = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                c17386r.f55500Z = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th2) {
                c17386r.f55500Z = false;
                throw th2;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f55551Z0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C17389u c17389uM19088D = m19088D(0);
                if (c17389uM19088D.f55519m) {
                    return true;
                }
                m19095K(c17389uM19088D, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f55532G0 != null) {
                    return true;
                }
                C17389u c17389uM19088D2 = m19088D(0);
                InterfaceC19352g0 interfaceC19352g0 = this.f55529D0;
                Context context = this.f55572w0;
                if (interfaceC19352g0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC19352g0;
                    actionBarOverlayLayout.m11144k();
                    Toolbar toolbar = ((C19330Y0) actionBarOverlayLayout.f32226s0).f61223a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f32292o0) == null || !actionMenuView.f32237G0 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        z6 = c17389uM19088D2.f55519m;
                        if (!z6 || c17389uM19088D2.f55518l) {
                            m19102u(c17389uM19088D2, true);
                            z10 = z6;
                        } else {
                            if (c17389uM19088D2.f55517k) {
                                if (c17389uM19088D2.f55521o) {
                                    c17389uM19088D2.f55517k = false;
                                    zM19095K = m19095K(c17389uM19088D2, keyEvent);
                                } else {
                                    zM19095K = true;
                                }
                                if (zM19095K) {
                                    m19093I(c17389uM19088D2, keyEvent);
                                    z10 = true;
                                }
                            }
                            z10 = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f55529D0;
                        actionBarOverlayLayout2.m11144k();
                        ActionMenuView actionMenuView2 = ((C19330Y0) actionBarOverlayLayout2.f32226s0).f61223a.f32292o0;
                        if (actionMenuView2 == null || (c19356i2 = actionMenuView2.f32238H0) == null || !c19356i2.m20460i()) {
                            if (!this.f55554c1 && m19095K(c17389uM19088D2, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f55529D0;
                                actionBarOverlayLayout3.m11144k();
                                ActionMenuView actionMenuView3 = ((C19330Y0) actionBarOverlayLayout3.f32226s0).f61223a.f32292o0;
                                if (actionMenuView3 != null && (c19356i = actionMenuView3.f32238H0) != null && c19356i.m20461l()) {
                                    z10 = true;
                                }
                            }
                            z10 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f55529D0;
                            actionBarOverlayLayout4.m11144k();
                            ActionMenuView actionMenuView4 = ((C19330Y0) actionBarOverlayLayout4.f32226s0).f61223a.f32292o0;
                            if (actionMenuView4 == null || (c19356i3 = actionMenuView4.f32238H0) == null || !c19356i3.m20459f()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                    }
                } else {
                    z6 = c17389uM19088D2.f55519m;
                    if (z6) {
                    }
                    m19102u(c17389uM19088D2, true);
                    z10 = z6;
                }
                if (!z10) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                AbstractC15256t.m16482t("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (m19092H()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m19104x(int i10) {
        C17389u c17389uM19088D = m19088D(i10);
        if (c17389uM19088D.f55514h != null) {
            Bundle bundle = new Bundle();
            c17389uM19088D.f55514h.m20131t(bundle);
            if (bundle.size() > 0) {
                c17389uM19088D.f55522p = bundle;
            }
            c17389uM19088D.f55514h.m20134w();
            c17389uM19088D.f55514h.clear();
        }
        c17389uM19088D.f55521o = true;
        c17389uM19088D.f55520n = true;
        if ((i10 == 108 || i10 == 0) && this.f55529D0 != null) {
            C17389u c17389uM19088D2 = m19088D(0);
            c17389uM19088D2.f55517k = false;
            m19095K(c17389uM19088D2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m20460i() != false) goto L20;
     */
    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10224y(MenuC18814l menuC18814l) {
        ActionMenuView actionMenuView;
        C19356i c19356i;
        C19356i c19356i2;
        C19356i c19356i3;
        InterfaceC19352g0 interfaceC19352g0 = this.f55529D0;
        if (interfaceC19352g0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC19352g0;
            actionBarOverlayLayout.m11144k();
            Toolbar toolbar = ((C19330Y0) actionBarOverlayLayout.f32226s0).f61223a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f32292o0) != null && actionMenuView.f32237G0) {
                if (ViewConfiguration.get(this.f55572w0).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f55529D0;
                    actionBarOverlayLayout2.m11144k();
                    ActionMenuView actionMenuView2 = ((C19330Y0) actionBarOverlayLayout2.f32226s0).f61223a.f32292o0;
                    if (actionMenuView2 != null) {
                        C19356i c19356i4 = actionMenuView2.f32238H0;
                        if (c19356i4 != null) {
                            if (c19356i4.f61293G0 == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f55573x0.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f55529D0;
                actionBarOverlayLayout3.m11144k();
                ActionMenuView actionMenuView3 = ((C19330Y0) actionBarOverlayLayout3.f32226s0).f61223a.f32292o0;
                if ((actionMenuView3 == null || (c19356i3 = actionMenuView3.f32238H0) == null || !c19356i3.m20460i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f55529D0;
                    actionBarOverlayLayout4.m11144k();
                    ActionMenuView actionMenuView4 = ((C19330Y0) actionBarOverlayLayout4.f32226s0).f61223a.f32292o0;
                    if (actionMenuView4 != null && (c19356i2 = actionMenuView4.f32238H0) != null) {
                        c19356i2.m20459f();
                    }
                    if (this.f55554c1) {
                        return;
                    }
                    callback.onPanelClosed(108, m19088D(0).f55514h);
                    return;
                }
                if (callback == null || this.f55554c1) {
                    return;
                }
                if (this.f55562k1 && (1 & this.f55563l1) != 0) {
                    View decorView = this.f55573x0.getDecorView();
                    RunnableC17380l runnableC17380l = this.f55564m1;
                    decorView.removeCallbacks(runnableC17380l);
                    runnableC17380l.run();
                }
                C17389u c17389uM19088D = m19088D(0);
                MenuC18814l menuC18814l2 = c17389uM19088D.f55514h;
                if (menuC18814l2 == null || c17389uM19088D.f55521o || !callback.onPreparePanel(0, c17389uM19088D.f55513g, menuC18814l2)) {
                    return;
                }
                callback.onMenuOpened(108, c17389uM19088D.f55514h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f55529D0;
                actionBarOverlayLayout5.m11144k();
                ActionMenuView actionMenuView5 = ((C19330Y0) actionBarOverlayLayout5.f32226s0).f61223a.f32292o0;
                if (actionMenuView5 == null || (c19356i = actionMenuView5.f32238H0) == null) {
                    return;
                }
                c19356i.m20461l();
                return;
            }
        }
        C17389u c17389uM19088D2 = m19088D(0);
        c17389uM19088D2.f55520n = true;
        m19102u(c17389uM19088D2, false);
        m19093I(c17389uM19088D2, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m19105z() {
        ViewGroup viewGroup;
        if (this.f55537L0) {
            return;
        }
        int[] iArr = AbstractC17123a.f54741j;
        Context context = this.f55572w0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo19068h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo19068h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo19068h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo19068h(10);
        }
        this.f55546U0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m19086A();
        this.f55573x0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f55547V0) {
            viewGroup = this.f55545T0 ? (ViewGroup) layoutInflaterFrom.inflate(com.openai.chatgpt.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.openai.chatgpt.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f55546U0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.openai.chatgpt.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f55544S0 = false;
            this.f55543R0 = false;
        } else if (this.f55543R0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.openai.chatgpt.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C10820c(context, typedValue.resourceId) : context).inflate(com.openai.chatgpt.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC19352g0 interfaceC19352g0 = (InterfaceC19352g0) viewGroup.findViewById(com.openai.chatgpt.R.id.decor_content_parent);
            this.f55529D0 = interfaceC19352g0;
            interfaceC19352g0.setWindowCallback(this.f55573x0.getCallback());
            if (this.f55544S0) {
                ((ActionBarOverlayLayout) this.f55529D0).m11143j(109);
            }
            if (this.f55541P0) {
                ((ActionBarOverlayLayout) this.f55529D0).m11143j(2);
            }
            if (this.f55542Q0) {
                ((ActionBarOverlayLayout) this.f55529D0).m11143j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f55543R0);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f55544S0);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f55546U0);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f55545T0);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(AbstractC14376f.m15823B(sb2, this.f55547V0, " }"));
        }
        C9895g4 c9895g4 = new C9895g4(this);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0730K.m1555l(viewGroup, c9895g4);
        if (this.f55529D0 == null) {
            this.f55539N0 = (TextView) viewGroup.findViewById(com.openai.chatgpt.R.id.title);
        }
        boolean z6 = AbstractC19353g1.f61283a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.openai.chatgpt.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f55573x0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f55573x0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C13414e(this));
        this.f55538M0 = viewGroup;
        Object obj = this.f55571v0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f55528C0;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC19352g0 interfaceC19352g1 = this.f55529D0;
            if (interfaceC19352g1 != null) {
                interfaceC19352g1.setWindowTitle(title);
            } else {
                C17368E c17368e = this.f55526A0;
                if (c17368e != null) {
                    C19330Y0 c19330y0 = (C19330Y0) c17368e.f55416e;
                    if (!c19330y0.f61229g) {
                        c19330y0.f61230h = title;
                        if ((c19330y0.f61224b & 8) != 0) {
                            Toolbar toolbar = c19330y0.f61223a;
                            toolbar.setTitle(title);
                            if (c19330y0.f61229g) {
                                AbstractC0738T.m1585m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f55539N0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f55538M0.findViewById(R.id.content);
        View decorView = this.f55573x0.getDecorView();
        contentFrameLayout2.f32255u0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f55537L0 = true;
        C17389u c17389uM19088D = m19088D(0);
        if (this.f55554c1 || c17389uM19088D.f55514h != null) {
            return;
        }
        m19090F(108);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
