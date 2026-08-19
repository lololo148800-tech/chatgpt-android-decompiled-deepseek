package p523V9;

import java.util.AbstractMap;
import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.I */
/* JADX INFO: loaded from: classes.dex */
public final class C7904I extends AbstractC7864D {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7912J f24868o0;

    public C7904I(C7912J c7912j) {
        this.f24868o0 = c7912j;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C7912J c7912j = this.f24868o0;
        AbstractC9768M2.m10371b(i10, c7912j.f25124q0);
        int i11 = i10 + i10;
        Object[] objArr = c7912j.f25123p0;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24868o0.f25124q0;
    }
}
