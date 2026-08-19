package p909nm;

import java.util.AbstractList;
import java.util.List;
import p076Cm.InterfaceC1725c;

/* JADX INFO: renamed from: nm.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17673g extends AbstractList implements List, InterfaceC1725c {
    /* JADX INFO: renamed from: f */
    public abstract int mo7371f();

    /* JADX INFO: renamed from: j */
    public abstract Object mo7372j(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return mo7372j(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo7371f();
    }
}
