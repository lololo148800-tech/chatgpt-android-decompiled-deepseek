package bb;

import java.util.AbstractList;
import java.util.ListIterator;
import p594Y9.AbstractC9711D;
import p594Y9.C9968t;
import p594Y9.C9974u;
import p644ab.InterfaceC10532e;

/* JADX INFO: renamed from: bb.J */
/* JADX INFO: loaded from: classes.dex */
public final class C11285J extends AbstractC9711D implements ListIterator {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f34177o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractList f34178p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11285J(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator, 1);
        this.f34177o0 = i10;
        this.f34178p0 = abstractList;
    }

    @Override // p594Y9.AbstractC9711D
    /* JADX INFO: renamed from: a */
    public final Object mo10305a(Object obj) {
        switch (this.f34177o0) {
            case 0:
                return ((InterfaceC10532e) ((C9968t) this.f34178p0).f29553o0).mo22421apply(obj);
            default:
                return ((InterfaceC10532e) ((C9974u) this.f34178p0).f29565o0).mo22421apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
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
        return mo10305a(((ListIterator) this.f29242Z).previous());
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
