package p909nm;

import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9381v3;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: nm.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17670d extends AbstractC17671e implements RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final AbstractC17671e f56468Y;

    /* JADX INFO: renamed from: Z */
    public final int f56469Z;

    /* JADX INFO: renamed from: o0 */
    public final int f56470o0;

    public C17670d(AbstractC17671e list, int i10, int i11) {
        AbstractC16544l.m18094g(list, "list");
        this.f56468Y = list;
        this.f56469Z = i10;
        AbstractC9381v3.m9954b(i10, i11, list.mo1316f());
        this.f56470o0 = i11 - i10;
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f56470o0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f56470o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
        return this.f56468Y.get(this.f56469Z + i10);
    }
}
