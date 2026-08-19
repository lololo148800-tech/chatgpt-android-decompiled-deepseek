package p278L0;

import p349O0.C5994b0;
import p658b5.C11246q;
import p860l0.C16678H;

/* JADX INFO: renamed from: L0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4893t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15949b;

    public /* synthetic */ C4893t(Object obj, int i10) {
        this.f15948a = i10;
        this.f15949b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public final void m5516a(float f10) {
        switch (this.f15948a) {
            case 0:
                C11246q c11246q = (C11246q) this.f15949b;
                C4892s c4892s = (C4892s) c11246q.f34077n;
                float fM12652v = c11246q.m12652v(f10);
                C11246q c11246q2 = c4892s.f15947a;
                ((C5994b0) c11246q2.f34073j).m6410h(fM12652v);
                ((C5994b0) c11246q2.f34074k).m6410h(0.0f);
                break;
            default:
                ((C16678H) this.f15949b).f53419a.invoke(Float.valueOf(f10));
                break;
        }
    }
}
