package p084D4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;

/* JADX INFO: renamed from: D4.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1915g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f5604a;

    public C1915g0(RecyclerView recyclerView) {
        this.f5604a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m3040a() {
        boolean z6 = RecyclerView.f33585P1;
        RecyclerView recyclerView = this.f5604a;
        if (z6 && recyclerView.f33604H0 && recyclerView.f33602G0) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            recyclerView.postOnAnimation(recyclerView.f33656w0);
        } else {
            recyclerView.f33614O0 = true;
            recyclerView.requestLayout();
        }
    }
}
