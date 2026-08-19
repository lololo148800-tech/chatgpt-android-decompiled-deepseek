package bb;

import java.util.List;
import java.util.ListIterator;
import p523V9.C8113j;
import p523V9.C8153o;

/* JADX INFO: renamed from: bb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11316i extends C8113j implements ListIterator {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8153o f34231q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11316i(C8153o c8153o) {
        super(c8153o, 0);
        this.f34231q0 = c8153o;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C8153o c8153o = this.f34231q0;
        boolean zIsEmpty = c8153o.isEmpty();
        m12722c().add(obj);
        ((C11290O) c8153o.f25583s0).f34182q0++;
        if (zIsEmpty) {
            c8153o.m8704f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final ListIterator m12722c() {
        m8608a();
        return (ListIterator) this.f25448Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m12722c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m12722c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m12722c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m12722c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m12722c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11316i(C8153o c8153o, int i10) {
        super(c8153o, ((List) c8153o.f25579o0).listIterator(i10), 0);
        this.f34231q0 = c8153o;
    }
}
