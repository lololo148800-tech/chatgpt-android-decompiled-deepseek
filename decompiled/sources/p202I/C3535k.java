package p202I;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import p117Eb.C2392v;
import p178H.C3173u;
import p228J.C3801F;
import p610Z1.C10145l;
import p817j$.util.Objects;

/* JADX INFO: renamed from: I.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3535k {

    /* JADX INFO: renamed from: a */
    public final int f10689a;

    /* JADX INFO: renamed from: b */
    public final C2392v f10690b;

    /* JADX INFO: renamed from: c */
    public final Rect f10691c;

    /* JADX INFO: renamed from: d */
    public final int f10692d;

    /* JADX INFO: renamed from: e */
    public final int f10693e;

    /* JADX INFO: renamed from: f */
    public final Matrix f10694f;

    /* JADX INFO: renamed from: g */
    public final C3537m f10695g;

    /* JADX INFO: renamed from: h */
    public final String f10696h;

    /* JADX INFO: renamed from: j */
    public final C10145l f10698j;

    /* JADX INFO: renamed from: k */
    public int f10699k = -1;

    /* JADX INFO: renamed from: i */
    public final ArrayList f10697i = new ArrayList();

    public C3535k(C3173u c3173u, C2392v c2392v, Rect rect, int i10, int i11, Matrix matrix, C3537m c3537m, C10145l c10145l, int i12) {
        this.f10689a = i12;
        this.f10690b = c2392v;
        this.f10693e = i11;
        this.f10692d = i10;
        this.f10691c = rect;
        this.f10694f = matrix;
        this.f10695g = c3537m;
        this.f10696h = String.valueOf(c3173u.hashCode());
        List<C3801F> list = c3173u.f9559a;
        Objects.requireNonNull(list);
        for (C3801F c3801f : list) {
            ArrayList arrayList = this.f10697i;
            c3801f.getClass();
            arrayList.add(0);
        }
        this.f10698j = c10145l;
    }
}
