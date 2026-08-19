package p999s;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: s.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19391z0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C19285B0 f61412a;

    public C19391z0(C19285B0 c19285b0) {
        this.f61412a = c19285b0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            C19285B0 c19285b0 = this.f61412a;
            if (c19285b0.f61106L0.getInputMethodMode() == 2 || c19285b0.f61106L0.getContentView() == null) {
                return;
            }
            Handler handler = c19285b0.f61102H0;
            RunnableC19387x0 runnableC19387x0 = c19285b0.f61098D0;
            handler.removeCallbacks(runnableC19387x0);
            runnableC19387x0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
