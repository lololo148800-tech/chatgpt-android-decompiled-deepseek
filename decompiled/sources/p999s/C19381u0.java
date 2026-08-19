package p999s;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: s.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19381u0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19285B0 f61393Y;

    public C19381u0(C19285B0 c19285b0) {
        this.f61393Y = c19285b0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        C19369o0 c19369o0;
        if (i10 == -1 || (c19369o0 = this.f61393Y.f61109o0) == null) {
            return;
        }
        c19369o0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
