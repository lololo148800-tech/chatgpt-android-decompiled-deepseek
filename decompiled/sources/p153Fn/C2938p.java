package p153Fn;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p201Hn.C3512a;

/* JADX INFO: renamed from: Fn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938p {
    private volatile AtomicReferenceArray<Object> array;

    public C2938p(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m3761a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m3762b(int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3763c(int i10, C3512a c3512a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, c3512a);
            return;
        }
        int i11 = i10 + 1;
        int i12 = length * 2;
        if (i11 < i12) {
            i11 = i12;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i11);
        for (int i13 = 0; i13 < length; i13++) {
            atomicReferenceArray2.set(i13, atomicReferenceArray.get(i13));
        }
        atomicReferenceArray2.set(i10, c3512a);
        this.array = atomicReferenceArray2;
    }
}
