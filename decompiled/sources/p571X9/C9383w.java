package p571X9;

import java.util.AbstractMap;
import p594Y9.AbstractC9846Z3;

/* JADX INFO: renamed from: X9.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9383w extends AbstractC9353r {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9389x f28252o0;

    public C9383w(C9389x c9389x) {
        this.f28252o0 = c9389x;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        C9389x c9389x = this.f28252o0;
        AbstractC9846Z3.m10495b(i10, c9389x.f28348q0);
        int i11 = i10 + i10;
        Object[] objArr = c9389x.f28347p0;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28252o0.f28348q0;
    }
}
