package p253K;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: K.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4497h implements Enumeration {

    /* JADX INFO: renamed from: a */
    public final Enumeration f14669a;

    public C4497h(C4498i c4498i) {
        this.f14669a = Collections.enumeration(c4498i.f14674a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f14669a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f14669a.nextElement());
    }
}
