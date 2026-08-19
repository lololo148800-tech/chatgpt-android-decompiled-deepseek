package p523V9;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: V9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8145n extends C8113j implements ListIterator {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8153o f25471q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8145n(C8153o c8153o) {
        super(c8153o);
        this.f25471q0 = c8153o;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C8153o c8153o = this.f25471q0;
        boolean zIsEmpty = c8153o.isEmpty();
        m8609b();
        ((ListIterator) this.f25448Z).add(obj);
        ((C8177r) c8153o.f25583s0).getClass();
        if (zIsEmpty) {
            c8153o.m8707m();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m8609b();
        return ((ListIterator) this.f25448Z).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m8609b();
        return ((ListIterator) this.f25448Z).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m8609b();
        return ((ListIterator) this.f25448Z).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m8609b();
        return ((ListIterator) this.f25448Z).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m8609b();
        ((ListIterator) this.f25448Z).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8145n(C8153o c8153o, int i10) {
        super(c8153o, ((List) c8153o.f25579o0).listIterator(i10));
        this.f25471q0 = c8153o;
    }
}
