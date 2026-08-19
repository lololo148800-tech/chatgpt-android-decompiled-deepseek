package p986ra;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ra.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18906c extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f60275a;

    public C18906c(Chip chip) {
        this.f60275a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C18909f c18909f = this.f60275a.f36540s0;
        if (c18909f != null) {
            c18909f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
