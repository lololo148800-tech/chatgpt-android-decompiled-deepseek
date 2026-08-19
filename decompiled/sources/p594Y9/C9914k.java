package p594Y9;

import java.util.Map;

/* JADX INFO: renamed from: Y9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9914k extends AbstractC9883f {

    /* JADX INFO: renamed from: Y */
    public final Object f29443Y;

    /* JADX INFO: renamed from: Z */
    public int f29444Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9920l f29445o0;

    public C9914k(C9920l c9920l, int i10) {
        this.f29445o0 = c9920l;
        Object[] objArr = c9920l.f29458o0;
        objArr.getClass();
        this.f29443Y = objArr[i10];
        this.f29444Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m10570a() {
        int i10 = this.f29444Z;
        Object obj = this.f29443Y;
        C9920l c9920l = this.f29445o0;
        if (i10 != -1 && i10 < c9920l.size()) {
            int i11 = this.f29444Z;
            Object[] objArr = c9920l.f29458o0;
            objArr.getClass();
            if (AbstractC9728F4.m10319b(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = C9920l.f29455v0;
        this.f29444Z = c9920l.m10579e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29443Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C9920l c9920l = this.f29445o0;
        Map mapM10575a = c9920l.m10575a();
        if (mapM10575a != null) {
            return mapM10575a.get(this.f29443Y);
        }
        m10570a();
        int i10 = this.f29444Z;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = c9920l.f29459p0;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C9920l c9920l = this.f29445o0;
        Map mapM10575a = c9920l.m10575a();
        Object obj2 = this.f29443Y;
        if (mapM10575a != null) {
            return mapM10575a.put(obj2, obj);
        }
        m10570a();
        int i10 = this.f29444Z;
        if (i10 == -1) {
            c9920l.put(obj2, obj);
            return null;
        }
        Object[] objArr = c9920l.f29459p0;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f29444Z;
        Object[] objArr2 = c9920l.f29459p0;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
