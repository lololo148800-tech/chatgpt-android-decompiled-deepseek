package vn;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: renamed from: vn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C20647d implements Iterator {

    /* JADX INFO: renamed from: Y */
    public boolean f65523Y;

    /* JADX INFO: renamed from: Z */
    public final int f65524Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SmartList f65525o0;

    public C20647d(SmartList smartList) {
        this.f65525o0 = smartList;
        this.f65524Z = ((AbstractList) smartList).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m21199a() {
        SmartList smartList = this.f65525o0;
        int i10 = ((AbstractList) smartList).modCount;
        int i11 = this.f65524Z;
        if (i10 == i11) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f65523Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f65523Y) {
            throw new NoSuchElementException();
        }
        this.f65523Y = true;
        m21199a();
        return this.f65525o0.f53311Z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m21199a();
        this.f65525o0.clear();
    }
}
