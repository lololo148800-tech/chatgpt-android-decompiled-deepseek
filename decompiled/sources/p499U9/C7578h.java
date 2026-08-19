package p499U9;

import java.util.AbstractMap;
import p594Y9.AbstractC9777O;

/* JADX INFO: renamed from: U9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7578h extends AbstractC7574d {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7579i f23989o0;

    public C7578h(C7579i c7579i) {
        this.f23989o0 = c7579i;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C7579i c7579i = this.f23989o0;
        AbstractC9777O.m10384b(i10, c7579i.f23992q0);
        int i11 = i10 + i10;
        Object[] objArr = c7579i.f23991p0;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23989o0.f23992q0;
    }
}
