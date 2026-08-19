package p523V9;

import java.util.Map;
import p594Y9.AbstractC9762L2;

/* JADX INFO: renamed from: V9.v */
/* JADX INFO: loaded from: classes.dex */
public final class C8209v extends AbstractC8161p {

    /* JADX INFO: renamed from: Y */
    public final Object f25655Y;

    /* JADX INFO: renamed from: Z */
    public int f25656Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8225x f25657o0;

    public C8209v(C8225x c8225x, int i10) {
        this.f25657o0 = c8225x;
        Object[] objArr = c8225x.f25682o0;
        objArr.getClass();
        this.f25655Y = objArr[i10];
        this.f25656Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m8833a() {
        int i10 = this.f25656Z;
        Object obj = this.f25655Y;
        C8225x c8225x = this.f25657o0;
        if (i10 != -1 && i10 < c8225x.size()) {
            int i11 = this.f25656Z;
            Object[] objArr = c8225x.f25682o0;
            objArr.getClass();
            if (AbstractC9762L2.m10365b(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = C8225x.f25679v0;
        this.f25656Z = c8225x.m8857e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25655Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C8225x c8225x = this.f25657o0;
        Map mapM8853a = c8225x.m8853a();
        if (mapM8853a != null) {
            return mapM8853a.get(this.f25655Y);
        }
        m8833a();
        int i10 = this.f25656Z;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = c8225x.f25683p0;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C8225x c8225x = this.f25657o0;
        Map mapM8853a = c8225x.m8853a();
        Object obj2 = this.f25655Y;
        if (mapM8853a != null) {
            return mapM8853a.put(obj2, obj);
        }
        m8833a();
        int i10 = this.f25656Z;
        if (i10 == -1) {
            c8225x.put(obj2, obj);
            return null;
        }
        Object[] objArr = c8225x.f25683p0;
        objArr.getClass();
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }
}
