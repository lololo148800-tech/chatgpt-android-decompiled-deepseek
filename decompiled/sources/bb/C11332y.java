package bb;

import java.io.Serializable;

/* JADX INFO: renamed from: bb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C11332y extends AbstractC11317j implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f34264Y;

    /* JADX INFO: renamed from: Z */
    public final Object f34265Z;

    public C11332y(Object obj, Object obj2) {
        this.f34264Y = obj;
        this.f34265Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34264Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34265Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
