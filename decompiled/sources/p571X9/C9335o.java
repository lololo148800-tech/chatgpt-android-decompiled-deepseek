package p571X9;

import java.io.Serializable;
import p523V9.C8153o;

/* JADX INFO: renamed from: X9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9335o extends AbstractC9287g implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f28155Y;

    /* JADX INFO: renamed from: Z */
    public final C8153o f28156Z;

    public C9335o(Object obj, C8153o c8153o) {
        this.f28155Y = obj;
        this.f28156Z = c8153o;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28155Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28156Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
