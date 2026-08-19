package ma;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p030B2.AbstractC0754e0;
import p030B2.C0770m0;
import p030B2.C0794y0;
import p658b5.C11248s;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: ma.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17203c extends AbstractC0754e0 {

    /* JADX INFO: renamed from: o0 */
    public final View f54916o0;

    /* JADX INFO: renamed from: p0 */
    public int f54917p0;

    /* JADX INFO: renamed from: q0 */
    public int f54918q0;

    /* JADX INFO: renamed from: r0 */
    public final int[] f54919r0;

    public C17203c(View view) {
        super(0);
        this.f54919r0 = new int[2];
        this.f54916o0 = view;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: d */
    public final void mo1615d(C0770m0 c0770m0) {
        this.f54916o0.setTranslationY(0.0f);
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: e */
    public final void mo1616e() {
        View view = this.f54916o0;
        int[] iArr = this.f54919r0;
        view.getLocationOnScreen(iArr);
        this.f54917p0 = iArr[1];
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: f */
    public final C0794y0 mo1617f(C0794y0 c0794y0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0770m0 c0770m0 = (C0770m0) it.next();
            if ((c0770m0.f2166a.mo1704c() & 8) != 0) {
                this.f54916o0.setTranslationY(AbstractC14951a.m16115c(c0770m0.f2166a.mo1703b(), this.f54918q0, 0));
                break;
            }
        }
        return c0794y0;
    }

    @Override // p030B2.AbstractC0754e0
    /* JADX INFO: renamed from: g */
    public final C11248s mo1618g(C11248s c11248s) {
        View view = this.f54916o0;
        int[] iArr = this.f54919r0;
        view.getLocationOnScreen(iArr);
        int i10 = this.f54917p0 - iArr[1];
        this.f54918q0 = i10;
        view.setTranslationY(i10);
        return c11248s;
    }
}
