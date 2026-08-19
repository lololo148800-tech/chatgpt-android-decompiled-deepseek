package p544W9;

import java.util.AbstractMap;
import p594Y9.AbstractC9954q3;

/* JADX INFO: renamed from: W9.W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8579W4 extends AbstractC8561T4 {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8585X4 f26403o0;

    public C8579W4(C8585X4 c8585x4) {
        this.f26403o0 = c8585x4;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        C8585X4 c8585x4 = this.f26403o0;
        AbstractC9954q3.m10611b(i10, c8585x4.f26409q0);
        int i11 = i10 + i10;
        Object[] objArr = c8585x4.f26408p0;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26403o0.f26409q0;
    }
}
