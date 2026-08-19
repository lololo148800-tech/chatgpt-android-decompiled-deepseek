package p523V9;

import java.io.Serializable;

/* JADX INFO: renamed from: V9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8241z extends AbstractC8161p implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f25718Y;

    /* JADX INFO: renamed from: Z */
    public final C8153o f25719Z;

    public C8241z(Object obj, C8153o c8153o) {
        this.f25718Y = obj;
        this.f25719Z = c8153o;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25718Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25719Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
