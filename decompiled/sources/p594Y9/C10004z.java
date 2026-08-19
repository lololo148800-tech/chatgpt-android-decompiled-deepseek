package p594Y9;

import java.util.AbstractMap;

/* JADX INFO: renamed from: Y9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C10004z extends AbstractC9950q {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9693A f29678o0;

    public C10004z(C9693A c9693a) {
        this.f29678o0 = c9693a;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        C9693A c9693a = this.f29678o0;
        AbstractC10003y4.m10643b(i10, c9693a.f29222q0);
        int i11 = i10 + i10;
        Object[] objArr = c9693a.f29221p0;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29678o0.f29222q0;
    }
}
