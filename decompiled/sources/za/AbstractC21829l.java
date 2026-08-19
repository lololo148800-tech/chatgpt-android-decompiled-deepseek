package za;

import android.widget.ImageButton;

/* JADX INFO: renamed from: za.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21829l extends ImageButton {

    /* JADX INFO: renamed from: o0 */
    public int f69279o0;

    /* JADX INFO: renamed from: a */
    public final void m22313a(int i10, boolean z6) {
        super.setVisibility(i10);
        if (z6) {
            this.f69279o0 = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f69279o0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        m22313a(i10, true);
    }
}
