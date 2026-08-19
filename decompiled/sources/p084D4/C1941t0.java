package p084D4;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: D4.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941t0 {

    /* JADX INFO: renamed from: a */
    public int f5731a;

    /* JADX INFO: renamed from: b */
    public int f5732b;

    /* JADX INFO: renamed from: c */
    public boolean f5733c;

    /* JADX INFO: renamed from: d */
    public boolean f5734d;

    /* JADX INFO: renamed from: e */
    public boolean f5735e;

    /* JADX INFO: renamed from: f */
    public int[] f5736f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f5737g;

    public C1941t0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5737g = staggeredGridLayoutManager;
        m3112a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3112a() {
        this.f5731a = -1;
        this.f5732b = Integer.MIN_VALUE;
        this.f5733c = false;
        this.f5734d = false;
        this.f5735e = false;
        int[] iArr = this.f5736f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
