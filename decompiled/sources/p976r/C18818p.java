package p976r;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC10819b;

/* JADX INFO: renamed from: r.p */
/* JADX INFO: loaded from: classes.dex */
public final class C18818p extends FrameLayout implements InterfaceC10819b {

    /* JADX INFO: renamed from: o0 */
    public final CollapsibleActionView f59904o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C18818p(View view) {
        super(view.getContext());
        this.f59904o0 = (CollapsibleActionView) view;
        addView(view);
    }
}
