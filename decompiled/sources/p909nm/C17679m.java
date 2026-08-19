package p909nm;

import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: nm.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C17679m extends AbstractC17671e implements RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int[] f56477Y;

    public C17679m(int[] iArr) {
        this.f56477Y = iArr;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return AbstractC17678l.m19300g(this.f56477Y, ((Number) obj).intValue());
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f56477Y.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f56477Y[i10]);
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return AbstractC17678l.m19280C(this.f56477Y, ((Number) obj).intValue());
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection
    public final boolean isEmpty() {
        return this.f56477Y.length == 0;
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f56477Y;
        AbstractC16544l.m18094g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }
}
