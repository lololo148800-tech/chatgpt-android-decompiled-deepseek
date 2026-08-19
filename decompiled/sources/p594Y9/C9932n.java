package p594Y9;

import java.io.Serializable;
import p523V9.C8153o;

/* JADX INFO: renamed from: Y9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9932n extends AbstractC9883f implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f29477Y;

    /* JADX INFO: renamed from: Z */
    public final C8153o f29478Z;

    public C9932n(Object obj, C8153o c8153o) {
        this.f29477Y = obj;
        this.f29478Z = c8153o;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29477Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29478Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
