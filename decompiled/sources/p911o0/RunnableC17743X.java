package p911o0;

import android.os.Build;
import android.view.View;
import java.util.List;
import p030B2.AbstractC0754e0;
import p030B2.C0770m0;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p030B2.InterfaceC0783t;
import p658b5.C11248s;

/* JADX INFO: renamed from: o0.X */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC17743X extends AbstractC0754e0 implements Runnable, InterfaceC0783t, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o0 */
    public final C17718B0 f56656o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f56657p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f56658q0;

    /* JADX INFO: renamed from: r0 */
    public C0794y0 f56659r0;

    public RunnableC17743X(C17718B0 c17718b0) {
        super(!c17718b0.f56574s ? 1 : 0);
        this.f56656o0 = c17718b0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: d */
    public final void mo1615d(C0770m0 c0770m0) {
        this.f56657p0 = false;
        this.f56658q0 = false;
        C0794y0 c0794y0 = this.f56659r0;
        if (c0770m0.f2166a.mo1702a() != 0 && c0794y0 != null) {
            C17718B0 c17718b0 = this.f56656o0;
            c17718b0.getClass();
            C0790w0 c0790w0 = c0794y0.f2209a;
            c17718b0.f56573r.m19546f(AbstractC17758g.m19492n(c0790w0.mo1754f(8)));
            c17718b0.f56572q.m19546f(AbstractC17758g.m19492n(c0790w0.mo1754f(8)));
            C17718B0.m19458a(c17718b0, c0794y0);
        }
        this.f56659r0 = null;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: e */
    public final void mo1616e() {
        this.f56657p0 = true;
        this.f56658q0 = true;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: f */
    public final C0794y0 mo1617f(C0794y0 c0794y0, List list) {
        C17718B0 c17718b0 = this.f56656o0;
        C17718B0.m19458a(c17718b0, c0794y0);
        return c17718b0.f56574s ? C0794y0.f2208b : c0794y0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: g */
    public final C11248s mo1618g(C11248s c11248s) {
        this.f56657p0 = false;
        return c11248s;
    }

    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public final C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        this.f56659r0 = c0794y0;
        C17718B0 c17718b0 = this.f56656o0;
        c17718b0.getClass();
        C0790w0 c0790w0 = c0794y0.f2209a;
        c17718b0.f56572q.m19546f(AbstractC17758g.m19492n(c0790w0.mo1754f(8)));
        if (this.f56657p0) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f56658q0) {
            c17718b0.f56573r.m19546f(AbstractC17758g.m19492n(c0790w0.mo1754f(8)));
            C17718B0.m19458a(c17718b0, c0794y0);
        }
        return c17718b0.f56574s ? C0794y0.f2208b : c0794y0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f56657p0) {
            this.f56657p0 = false;
            this.f56658q0 = false;
            C0794y0 c0794y0 = this.f56659r0;
            if (c0794y0 != null) {
                C17718B0 c17718b0 = this.f56656o0;
                c17718b0.getClass();
                c17718b0.f56573r.m19546f(AbstractC17758g.m19492n(c0794y0.f2209a.mo1754f(8)));
                C17718B0.m19458a(c17718b0, c0794y0);
                this.f56659r0 = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
