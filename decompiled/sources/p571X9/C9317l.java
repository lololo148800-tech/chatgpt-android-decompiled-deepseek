package p571X9;

import java.util.Map;
import p594Y9.AbstractC9881e4;

/* JADX INFO: renamed from: X9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9317l extends AbstractC9287g {

    /* JADX INFO: renamed from: Y */
    public final Object f28123Y;

    /* JADX INFO: renamed from: Z */
    public int f28124Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9323m f28125o0;

    public C9317l(C9323m c9323m, int i10) {
        this.f28125o0 = c9323m;
        Object[] objArr = c9323m.f28137o0;
        objArr.getClass();
        this.f28123Y = objArr[i10];
        this.f28124Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m9911a() {
        int i10 = this.f28124Z;
        Object obj = this.f28123Y;
        C9323m c9323m = this.f28125o0;
        if (i10 != -1 && i10 < c9323m.size()) {
            int i11 = this.f28124Z;
            Object[] objArr = c9323m.f28137o0;
            objArr.getClass();
            if (AbstractC9881e4.m10535b(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = C9323m.f28134v0;
        this.f28124Z = c9323m.m9918e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28123Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C9323m c9323m = this.f28125o0;
        Map mapM9914a = c9323m.m9914a();
        if (mapM9914a != null) {
            return mapM9914a.get(this.f28123Y);
        }
        m9911a();
        int i10 = this.f28124Z;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = c9323m.f28138p0;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C9323m c9323m = this.f28125o0;
        Map mapM9914a = c9323m.m9914a();
        Object obj2 = this.f28123Y;
        if (mapM9914a != null) {
            return mapM9914a.put(obj2, obj);
        }
        m9911a();
        int i10 = this.f28124Z;
        if (i10 == -1) {
            c9323m.put(obj2, obj);
            return null;
        }
        Object[] objArr = c9323m.f28138p0;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f28124Z;
        Object[] objArr2 = c9323m.f28138p0;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
