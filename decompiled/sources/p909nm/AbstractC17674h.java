package p909nm;

import java.util.AbstractSet;
import java.util.Set;
import p076Cm.InterfaceC1728f;

/* JADX INFO: renamed from: nm.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17674h extends AbstractSet implements Set, InterfaceC1728f {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
