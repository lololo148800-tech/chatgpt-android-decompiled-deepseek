package p999s;

import androidx.appcompat.widget.Toolbar;
import p976r.C18816n;

/* JADX INFO: renamed from: s.R0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC19316R0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61190Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Toolbar f61191Z;

    public /* synthetic */ RunnableC19316R0(Toolbar toolbar, int i10) {
        this.f61190Y = i10;
        this.f61191Z = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61190Y) {
            case 0:
                C19320T0 c19320t0 = this.f61191Z.f32286a1;
                C18816n c18816n = c19320t0 == null ? null : c19320t0.f61193Z;
                if (c18816n != null) {
                    c18816n.collapseActionView();
                }
                break;
            default:
                this.f61191Z.m11166n();
                break;
        }
    }
}
