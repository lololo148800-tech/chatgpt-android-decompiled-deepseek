package cc;

import java.util.ArrayList;
import p310M9.C5311e;

/* JADX INFO: renamed from: cc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11697b {

    /* JADX INFO: renamed from: a */
    public final int f35490a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f35491b;

    public C11697b(int i10, ArrayList arrayList) {
        this.f35490a = i10;
        this.f35491b = arrayList;
    }

    public final String toString() {
        C5311e c5311e = new C5311e("FaceContour", 17);
        c5311e.m5850E(this.f35490a, "type");
        c5311e.m5851F(this.f35491b.toArray(), "points");
        return c5311e.toString();
    }
}
