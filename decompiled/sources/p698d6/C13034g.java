package p698d6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import p117Eb.C2392v;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9054d;
import p604Yk.C10077b;
import p640a6.C10510e;
import p675c6.C11678m;

/* JADX INFO: renamed from: d6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13034g extends AbstractC13029b {

    /* JADX INFO: renamed from: D */
    public final C9054d f41401D;

    /* JADX INFO: renamed from: E */
    public final C13030c f41402E;

    public C13034g(C7794w c7794w, C13032e c13032e, C13030c c13030c, C7781j c7781j) {
        super(c7794w, c13032e);
        this.f41402E = c13030c;
        C9054d c9054d = new C9054d(c7794w, this, new C11678m("__container", c13032e.f41376a, false), c7781j);
        this.f41401D = c9054d;
        c9054d.mo9611b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p698d6.AbstractC13029b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        super.mo9612c(rectF, matrix, z6);
        this.f41401D.mo9612c(rectF, this.f41348n, z6);
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: j */
    public final void mo14775j(Canvas canvas, Matrix matrix, int i10) {
        this.f41401D.mo9613e(canvas, matrix, i10);
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: k */
    public final C10077b mo14776k() {
        C10077b c10077b = this.f41350p.f41398w;
        return c10077b != null ? c10077b : this.f41402E.f41350p.f41398w;
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: l */
    public final C2392v mo14777l() {
        C2392v c2392v = this.f41350p.f41399x;
        return c2392v != null ? c2392v : this.f41402E.f41350p.f41399x;
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: q */
    public final void mo14781q(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        this.f41401D.mo9615g(c10510e, i10, arrayList, c10510e2);
    }
}
