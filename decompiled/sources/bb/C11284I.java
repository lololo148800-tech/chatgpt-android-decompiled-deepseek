package bb;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: bb.I */
/* JADX INFO: loaded from: classes.dex */
public final class C11284I extends AbstractC11314g0 {

    /* JADX INFO: renamed from: Z */
    public static final Object f34175Z = new Object();

    /* JADX INFO: renamed from: Y */
    public Object f34176Y;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34176Y != f34175Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f34176Y;
        Object obj2 = f34175Z;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f34176Y = obj2;
        return obj;
    }
}
