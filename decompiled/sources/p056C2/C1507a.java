package p056C2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: C2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1507a extends ClickableSpan {

    /* JADX INFO: renamed from: Y */
    public final int f4021Y;

    /* JADX INFO: renamed from: Z */
    public final C1512f f4022Z;

    /* JADX INFO: renamed from: o0 */
    public final int f4023o0;

    public C1507a(int i10, C1512f c1512f, int i11) {
        this.f4021Y = i10;
        this.f4022Z = c1512f;
        this.f4023o0 = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4021Y);
        this.f4022Z.f4042a.performAction(this.f4023o0, bundle);
    }
}
