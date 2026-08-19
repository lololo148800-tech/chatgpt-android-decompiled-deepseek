package p594Y9;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: Y9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9962s extends AbstractC9711D implements ListIterator {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f29539o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractList f29540p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9962s(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator, 0);
        this.f29539o0 = i10;
        this.f29540p0 = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p594Y9.AbstractC9711D
    /* JADX INFO: renamed from: b */
    public final Object mo10306b(Object obj) {
        switch (this.f29539o0) {
            case 0:
                return ((InterfaceC9882e5) ((C9968t) this.f29540p0).f29553o0).mo3670t(obj);
            default:
                return ((InterfaceC9882e5) ((C9974u) this.f29540p0).f29565o0).mo3670t(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f29242Z).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f29242Z).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo10306b(((ListIterator) this.f29242Z).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f29242Z).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
