package p350O1;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p650ui.platform.AndroidComposeView;
import fo.C13711h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.EnumC17307j;
import p102Dm.AbstractC2119a;
import p1071w0.C20709G;
import p109E3.ExecutorC2265F;
import p197Hj.C3457c;
import p204I1.C3578I;
import p204I1.C3581L;
import p329N3.RunnableC5611a;
import p392Q0.C6546d;
import p544W9.AbstractC8753z4;
import p547Wc.C8795g0;
import p571X9.AbstractC9227W;
import p759g1.C13801c;
import p860l0.C16663C;

/* JADX INFO: renamed from: O1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C6048F implements InterfaceC6074w {

    /* JADX INFO: renamed from: a */
    public final View f19692a;

    /* JADX INFO: renamed from: b */
    public final C13711h f19693b;

    /* JADX INFO: renamed from: c */
    public final Executor f19694c;

    /* JADX INFO: renamed from: d */
    public boolean f19695d;

    /* JADX INFO: renamed from: e */
    public AbstractC16546n f19696e;

    /* JADX INFO: renamed from: f */
    public AbstractC16546n f19697f;

    /* JADX INFO: renamed from: g */
    public C6045C f19698g;

    /* JADX INFO: renamed from: h */
    public C6065n f19699h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f19700i;

    /* JADX INFO: renamed from: j */
    public final Object f19701j;

    /* JADX INFO: renamed from: k */
    public Rect f19702k;

    /* JADX INFO: renamed from: l */
    public final C6056e f19703l;

    /* JADX INFO: renamed from: m */
    public final C6546d f19704m;

    /* JADX INFO: renamed from: n */
    public RunnableC5611a f19705n;

    public C6048F(View view, AndroidComposeView androidComposeView) {
        C13711h c13711h = new C13711h(view);
        ExecutorC2265F executorC2265F = new ExecutorC2265F(Choreographer.getInstance(), 1);
        this.f19692a = view;
        this.f19693b = c13711h;
        this.f19694c = executorC2265F;
        this.f19696e = C6055d.f19716q0;
        this.f19697f = C6055d.f19717r0;
        this.f19698g = new C6045C(C3581L.f10906b, "", 4);
        this.f19699h = C6065n.f19755g;
        this.f19700i = new ArrayList();
        this.f19701j = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C3457c(this, 25));
        this.f19703l = new C6056e(androidComposeView, c13711h);
        this.f19704m = new C6546d(new EnumC6047E[16]);
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: a */
    public final void mo6614a(C6045C c6045c, InterfaceC6073v interfaceC6073v, C3578I c3578i, C8795g0 c8795g0, C13801c c13801c, C13801c c13801c2) {
        C6056e c6056e = this.f19703l;
        synchronized (c6056e.f19723c) {
            try {
                c6056e.f19730j = c6045c;
                c6056e.f19732l = interfaceC6073v;
                c6056e.f19731k = c3578i;
                c6056e.f19733m = c8795g0;
                c6056e.f19734n = c13801c;
                c6056e.f19735o = c13801c2;
                if (c6056e.f19725e || c6056e.f19724d) {
                    c6056e.m6626a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: b */
    public final void mo6615b() {
        m6622i(EnumC6047E.f19687Y);
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: c */
    public final void mo6616c() {
        m6622i(EnumC6047E.f19689o0);
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: d */
    public final void mo6617d() {
        this.f19695d = false;
        this.f19696e = C6055d.f19718s0;
        this.f19697f = C6055d.f19719t0;
        this.f19702k = null;
        m6622i(EnumC6047E.f19688Z);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, mm.i] */
    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: e */
    public final void mo6618e(C6045C c6045c, C6045C c6045c2) {
        boolean z6 = (C3581L.m4266b(this.f19698g.f19683b, c6045c2.f19683b) && AbstractC16544l.m18089b(this.f19698g.f19684c, c6045c2.f19684c)) ? false : true;
        this.f19698g = c6045c2;
        int size = this.f19700i.size();
        for (int i10 = 0; i10 < size; i10++) {
            InputConnectionC6075x inputConnectionC6075x = (InputConnectionC6075x) ((WeakReference) this.f19700i.get(i10)).get();
            if (inputConnectionC6075x != null) {
                inputConnectionC6075x.f19770d = c6045c2;
            }
        }
        C6056e c6056e = this.f19703l;
        synchronized (c6056e.f19723c) {
            c6056e.f19730j = null;
            c6056e.f19732l = null;
            c6056e.f19731k = null;
            c6056e.f19733m = C6055d.f19713Z;
            c6056e.f19734n = null;
            c6056e.f19735o = null;
        }
        if (AbstractC16544l.m18089b(c6045c, c6045c2)) {
            if (z6) {
                C13711h c13711h = this.f19693b;
                int iM4270f = C3581L.m4270f(c6045c2.f19683b);
                int iM4269e = C3581L.m4269e(c6045c2.f19683b);
                C3581L c3581l = this.f19698g.f19684c;
                int iM4270f2 = c3581l != null ? C3581L.m4270f(c3581l.f10908a) : -1;
                C3581L c3581l2 = this.f19698g.f19684c;
                ((InputMethodManager) c13711h.f43260o0.getValue()).updateSelection((View) c13711h.f43259Z, iM4270f, iM4269e, iM4270f2, c3581l2 != null ? C3581L.m4269e(c3581l2.f10908a) : -1);
                return;
            }
            return;
        }
        if (c6045c != null && (!AbstractC16544l.m18089b(c6045c.f19682a.f10934Y, c6045c2.f19682a.f10934Y) || (C3581L.m4266b(c6045c.f19683b, c6045c2.f19683b) && !AbstractC16544l.m18089b(c6045c.f19684c, c6045c2.f19684c)))) {
            C13711h c13711h2 = this.f19693b;
            ((InputMethodManager) c13711h2.f43260o0.getValue()).restartInput((View) c13711h2.f43259Z);
            return;
        }
        int size2 = this.f19700i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InputConnectionC6075x inputConnectionC6075x2 = (InputConnectionC6075x) ((WeakReference) this.f19700i.get(i11)).get();
            if (inputConnectionC6075x2 != null) {
                C6045C c6045c3 = this.f19698g;
                C13711h c13711h3 = this.f19693b;
                if (inputConnectionC6075x2.f19774h) {
                    inputConnectionC6075x2.f19770d = c6045c3;
                    if (inputConnectionC6075x2.f19772f) {
                        ((InputMethodManager) c13711h3.f43260o0.getValue()).updateExtractedText((View) c13711h3.f43259Z, inputConnectionC6075x2.f19771e, AbstractC8753z4.m9518f(c6045c3));
                    }
                    C3581L c3581l3 = c6045c3.f19684c;
                    int iM4270f3 = c3581l3 != null ? C3581L.m4270f(c3581l3.f10908a) : -1;
                    C3581L c3581l4 = c6045c3.f19684c;
                    int iM4269e2 = c3581l4 != null ? C3581L.m4269e(c3581l4.f10908a) : -1;
                    long j10 = c6045c3.f19683b;
                    ((InputMethodManager) c13711h3.f43260o0.getValue()).updateSelection((View) c13711h3.f43259Z, C3581L.m4270f(j10), C3581L.m4269e(j10), iM4270f3, iM4269e2);
                }
            }
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: f */
    public final void mo6619f(C6045C c6045c, C6065n c6065n, C16663C c16663c, C20709G c20709g) {
        this.f19695d = true;
        this.f19698g = c6045c;
        this.f19699h = c6065n;
        this.f19696e = c16663c;
        this.f19697f = c20709g;
        m6622i(EnumC6047E.f19687Y);
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: g */
    public final void mo6620g(C13801c c13801c) {
        Rect rect;
        this.f19702k = new Rect(AbstractC2119a.m3195i(c13801c.f43586a), AbstractC2119a.m3195i(c13801c.f43587b), AbstractC2119a.m3195i(c13801c.f43588c), AbstractC2119a.m3195i(c13801c.f43589d));
        if (!this.f19700i.isEmpty() || (rect = this.f19702k) == null) {
            return;
        }
        this.f19692a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: h */
    public final void mo6621h() {
        m6622i(EnumC6047E.f19690p0);
    }

    /* JADX INFO: renamed from: i */
    public final void m6622i(EnumC6047E enumC6047E) {
        this.f19704m.m7099c(enumC6047E);
        if (this.f19705n == null) {
            RunnableC5611a runnableC5611a = new RunnableC5611a(this, 1);
            this.f19694c.execute(runnableC5611a);
            this.f19705n = runnableC5611a;
        }
    }
}
