package p587Y1;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p003A1.AbstractC0231b;
import p003A1.C0178J0;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6018n0;
import p349O0.C6021p;

/* JADX INFO: renamed from: Y1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9587m extends AbstractC0231b implements InterfaceC9589o {

    /* JADX INFO: renamed from: w0 */
    public final Window f28845w0;

    /* JADX INFO: renamed from: x0 */
    public final C6002f0 f28846x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f28847y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f28848z0;

    public C9587m(Context context, Window window) {
        super(context);
        this.f28845w0 = window;
        this.f28846x0 = C5997d.m6430Q(AbstractC9585k.f28843a, C5975S.f19448r0);
    }

    @Override // p587Y1.InterfaceC9589o
    /* JADX INFO: renamed from: a */
    public final Window mo4721a() {
        return this.f28845w0;
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: b */
    public final void mo564b(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            ((InterfaceC1439n) this.f28846x0.getValue()).invoke(c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 14);
        }
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: g */
    public final void mo736g(boolean z6, int i10, int i11, int i12, int i13) {
        View childAt;
        super.mo736g(z6, i10, i11, i12, i13);
        if (this.f28847y0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f28845w0.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // p003A1.AbstractC0231b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f28848z0;
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: h */
    public final void mo737h(int i10, int i11) {
        if (this.f28847y0) {
            super.mo737h(i10, i11);
            return;
        }
        super.mo737h(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }
}
