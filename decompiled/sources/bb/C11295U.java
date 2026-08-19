package bb;

import java.util.AbstractMap;
import p523V9.AbstractC8020X;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.U */
/* JADX INFO: loaded from: classes.dex */
public final class C11295U extends AbstractC11278C {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11296V f34188o0;

    public C11295U(C11296V c11296v) {
        this.f34188o0 = c11296v;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C11296V c11296v = this.f34188o0;
        AbstractC8020X.m8353c(i10, c11296v.f34191r0);
        int i11 = i10 * 2;
        Object[] objArr = c11296v.f34190q0;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34188o0.f34191r0;
    }
}
