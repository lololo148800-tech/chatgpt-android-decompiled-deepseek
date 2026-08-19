package jm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: jm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16270a implements Iterable {

    /* JADX INFO: renamed from: Y */
    public final Map f50400Y;

    public C16270a(Map map) {
        this.f50400Y = map;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f50400Y.entrySet().iterator();
    }
}
