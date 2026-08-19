package p999s;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: s.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19389y0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C19285B0 f61407a;

    public C19389y0(C19285B0 c19285b0) {
        this.f61407a = c19285b0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C19285B0 c19285b0 = this.f61407a;
        if (c19285b0.f61106L0.isShowing()) {
            c19285b0.mo20083f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f61407a.dismiss();
    }
}
