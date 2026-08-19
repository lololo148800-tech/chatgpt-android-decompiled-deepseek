package p817j$.util;

import java.util.Set;

/* JADX INFO: renamed from: j$.util.u */
/* JADX INFO: loaded from: classes4.dex */
class C16023u extends C15731l implements Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f49002a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f49002a.hashCode();
    }
}
