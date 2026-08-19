package p999s;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p301M.RunnableC5232n;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: s.O */
/* JADX INFO: loaded from: classes.dex */
public final class C19310O extends AbstractC18610b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f61178h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f61179i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WeakReference f61180j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19321U f61181k;

    public C19310O(C19321U c19321u, int i10, int i11, WeakReference weakReference) {
        this.f61181k = c19321u;
        this.f61178h = i10;
        this.f61179i = i11;
        this.f61180j = weakReference;
    }

    @Override // p955q2.AbstractC18610b
    /* JADX INFO: renamed from: j */
    public final void mo2478j(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f61178h) != -1) {
            typeface = AbstractC19319T.m20410a(typeface, i10, (this.f61179i & 2) != 0);
        }
        C19321U c19321u = this.f61181k;
        if (c19321u.f61207m) {
            c19321u.f61206l = typeface;
            TextView textView = (TextView) this.f61180j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC5232n(textView, typeface, c19321u.f61204j, 4));
                } else {
                    textView.setTypeface(typeface, c19321u.f61204j);
                }
            }
        }
    }

    @Override // p955q2.AbstractC18610b
    /* JADX INFO: renamed from: i */
    public final void mo2477i(int i10) {
    }
}
