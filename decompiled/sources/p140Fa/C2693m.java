package p140Fa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p116Ea.C2362a;

/* JADX INFO: renamed from: Fa.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2693m extends AbstractC2699s {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f8287c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f8288d;

    public C2693m(ArrayList arrayList, Matrix matrix) {
        this.f8287c = arrayList;
        this.f8288d = matrix;
    }

    @Override // p140Fa.AbstractC2699s
    /* JADX INFO: renamed from: a */
    public final void mo3695a(Matrix matrix, C2362a c2362a, int i10, Canvas canvas) {
        Iterator it = this.f8287c.iterator();
        while (it.hasNext()) {
            ((AbstractC2699s) it.next()).mo3695a(this.f8288d, c2362a, i10, canvas);
        }
    }
}
