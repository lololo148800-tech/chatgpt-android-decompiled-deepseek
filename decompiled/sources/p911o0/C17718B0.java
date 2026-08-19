package p911o0;

import android.os.Build;
import android.view.View;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0763j;
import p030B2.C0765k;
import p030B2.C0794y0;
import p586Y0.AbstractC9562n;
import p586Y0.C9549a;
import p692d0.C12954G;
import p979r2.C18862c;

/* JADX INFO: renamed from: o0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17718B0 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f56555v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C17754e f56556a = C17756f.m19478d(4, "captionBar");

    /* JADX INFO: renamed from: b */
    public final C17754e f56557b;

    /* JADX INFO: renamed from: c */
    public final C17754e f56558c;

    /* JADX INFO: renamed from: d */
    public final C17754e f56559d;

    /* JADX INFO: renamed from: e */
    public final C17754e f56560e;

    /* JADX INFO: renamed from: f */
    public final C17754e f56561f;

    /* JADX INFO: renamed from: g */
    public final C17754e f56562g;

    /* JADX INFO: renamed from: h */
    public final C17754e f56563h;

    /* JADX INFO: renamed from: i */
    public final C17754e f56564i;

    /* JADX INFO: renamed from: j */
    public final C17795y0 f56565j;

    /* JADX INFO: renamed from: k */
    public final C17791w0 f56566k;

    /* JADX INFO: renamed from: l */
    public final C17795y0 f56567l;

    /* JADX INFO: renamed from: m */
    public final C17795y0 f56568m;

    /* JADX INFO: renamed from: n */
    public final C17795y0 f56569n;

    /* JADX INFO: renamed from: o */
    public final C17795y0 f56570o;

    /* JADX INFO: renamed from: p */
    public final C17795y0 f56571p;

    /* JADX INFO: renamed from: q */
    public final C17795y0 f56572q;

    /* JADX INFO: renamed from: r */
    public final C17795y0 f56573r;

    /* JADX INFO: renamed from: s */
    public final boolean f56574s;

    /* JADX INFO: renamed from: t */
    public int f56575t;

    /* JADX INFO: renamed from: u */
    public final RunnableC17743X f56576u;

    public C17718B0(View view) {
        C17754e c17754eM19478d = C17756f.m19478d(128, "displayCutout");
        this.f56557b = c17754eM19478d;
        C17754e c17754eM19478d2 = C17756f.m19478d(8, "ime");
        this.f56558c = c17754eM19478d2;
        C17754e c17754eM19478d3 = C17756f.m19478d(32, "mandatorySystemGestures");
        this.f56559d = c17754eM19478d3;
        this.f56560e = C17756f.m19478d(2, "navigationBars");
        this.f56561f = C17756f.m19478d(1, "statusBars");
        C17754e c17754eM19478d4 = C17756f.m19478d(7, "systemBars");
        this.f56562g = c17754eM19478d4;
        C17754e c17754eM19478d5 = C17756f.m19478d(16, "systemGestures");
        this.f56563h = c17754eM19478d5;
        C17754e c17754eM19478d6 = C17756f.m19478d(64, "tappableElement");
        this.f56564i = c17754eM19478d6;
        C17795y0 c17795y0 = new C17795y0(AbstractC17758g.m19492n(C18862c.f60085e), "waterfall");
        this.f56565j = c17795y0;
        this.f56566k = new C17791w0(new C17791w0(c17754eM19478d4, c17754eM19478d2), c17754eM19478d);
        new C17791w0(new C17791w0(new C17791w0(c17754eM19478d6, c17754eM19478d3), c17754eM19478d5), c17795y0);
        this.f56567l = C17756f.m19479e(4, "captionBarIgnoringVisibility");
        this.f56568m = C17756f.m19479e(2, "navigationBarsIgnoringVisibility");
        this.f56569n = C17756f.m19479e(1, "statusBarsIgnoringVisibility");
        this.f56570o = C17756f.m19479e(7, "systemBarsIgnoringVisibility");
        this.f56571p = C17756f.m19479e(64, "tappableElementIgnoringVisibility");
        this.f56572q = C17756f.m19479e(8, "imeAnimationTarget");
        this.f56573r = C17756f.m19479e(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f56574s = bool != null ? bool.booleanValue() : true;
        this.f56576u = new RunnableC17743X(this);
    }

    /* JADX INFO: renamed from: a */
    public static void m19458a(C17718B0 c17718b0, C0794y0 c0794y0) {
        boolean z6 = false;
        c17718b0.f56556a.m19477f(c0794y0, 0);
        c17718b0.f56558c.m19477f(c0794y0, 0);
        c17718b0.f56557b.m19477f(c0794y0, 0);
        c17718b0.f56560e.m19477f(c0794y0, 0);
        c17718b0.f56561f.m19477f(c0794y0, 0);
        c17718b0.f56562g.m19477f(c0794y0, 0);
        c17718b0.f56563h.m19477f(c0794y0, 0);
        c17718b0.f56564i.m19477f(c0794y0, 0);
        c17718b0.f56559d.m19477f(c0794y0, 0);
        c17718b0.f56567l.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1755g(4)));
        c17718b0.f56568m.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1755g(2)));
        c17718b0.f56569n.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1755g(1)));
        c17718b0.f56570o.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1755g(7)));
        c17718b0.f56571p.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1755g(64)));
        C0765k c0765kMo1775e = c0794y0.f2209a.mo1775e();
        if (c0765kMo1775e != null) {
            c17718b0.f56565j.m19546f(AbstractC17758g.m19492n(Build.VERSION.SDK_INT >= 30 ? C18862c.m20172c(AbstractC0763j.m1697f(c0765kMo1775e.f2160a)) : C18862c.f60085e));
        }
        synchronized (AbstractC9562n.f28759b) {
            C12954G c12954g = ((C9549a) AbstractC9562n.f28766i.get()).f28725h;
            if (c12954g != null && c12954g.m14631h()) {
                z6 = true;
            }
        }
        if (z6) {
            AbstractC9562n.m10077a();
        }
    }
}
