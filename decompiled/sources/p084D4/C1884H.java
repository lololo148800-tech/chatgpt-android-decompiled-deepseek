package p084D4;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: D4.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1884H {

    /* JADX INFO: renamed from: a */
    public boolean f5485a;

    /* JADX INFO: renamed from: b */
    public int f5486b;

    /* JADX INFO: renamed from: c */
    public int f5487c;

    /* JADX INFO: renamed from: d */
    public int f5488d;

    /* JADX INFO: renamed from: e */
    public int f5489e;

    /* JADX INFO: renamed from: f */
    public int f5490f;

    /* JADX INFO: renamed from: g */
    public int f5491g;

    /* JADX INFO: renamed from: h */
    public int f5492h;

    /* JADX INFO: renamed from: i */
    public int f5493i;

    /* JADX INFO: renamed from: j */
    public int f5494j;

    /* JADX INFO: renamed from: k */
    public List f5495k;

    /* JADX INFO: renamed from: l */
    public boolean f5496l;

    /* JADX INFO: renamed from: a */
    public final void m2866a(View view) {
        int iM3088c;
        int size = this.f5495k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((AbstractC1933p0) this.f5495k.get(i11)).f5680a;
            C1901Z c1901z = (C1901Z) view3.getLayoutParams();
            if (view3 != view && !c1901z.f5557a.m3095j() && (iM3088c = (c1901z.f5557a.m3088c() - this.f5488d) * this.f5489e) >= 0 && iM3088c < i10) {
                view2 = view3;
                if (iM3088c == 0) {
                    break;
                } else {
                    i10 = iM3088c;
                }
            }
        }
        if (view2 == null) {
            this.f5488d = -1;
        } else {
            this.f5488d = ((C1901Z) view2.getLayoutParams()).f5557a.m3088c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m2867b(C1911e0 c1911e0) {
        List list = this.f5495k;
        if (list == null) {
            View view = c1911e0.m3036k(this.f5488d, Long.MAX_VALUE).f5680a;
            this.f5488d += this.f5489e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((AbstractC1933p0) this.f5495k.get(i10)).f5680a;
            C1901Z c1901z = (C1901Z) view2.getLayoutParams();
            if (!c1901z.f5557a.m3095j() && this.f5488d == c1901z.f5557a.m3088c()) {
                m2866a(view2);
                return view2;
            }
        }
        return null;
    }
}
