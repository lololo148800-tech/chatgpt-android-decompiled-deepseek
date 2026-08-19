package p449S9;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7094t extends AbstractC7036E {

    /* JADX INFO: renamed from: Z */
    public static final Object f22582Z = new Object();

    /* JADX INFO: renamed from: Y */
    public Object f22583Y;

    public C7094t(Object obj) {
        this.f22583Y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22583Y != f22582Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f22583Y;
        Object obj2 = f22582Z;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f22583Y = obj2;
        return obj;
    }
}
