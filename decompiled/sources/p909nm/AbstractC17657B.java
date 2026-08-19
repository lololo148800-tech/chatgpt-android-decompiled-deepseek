package p909nm;

import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: nm.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17657B implements Iterator, InterfaceC1723a {
    /* JADX INFO: renamed from: a */
    public abstract int mo4199a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo4199a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
