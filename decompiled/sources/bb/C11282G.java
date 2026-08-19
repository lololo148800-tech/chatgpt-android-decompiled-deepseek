package bb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A.AbstractC0010F;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: bb.G */
/* JADX INFO: loaded from: classes.dex */
public final class C11282G extends AbstractC11314g0 {

    /* JADX INFO: renamed from: Y */
    public int f34168Y;

    /* JADX INFO: renamed from: Z */
    public Object f34169Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f34170o0;

    /* JADX INFO: renamed from: p0 */
    public final Iterator f34171p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f34172q0;

    public C11282G() {
        this.f34168Y = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.f34168Y;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            return true;
        }
        if (iM24h == 2) {
            return false;
        }
        this.f34168Y = 4;
        switch (this.f34170o0) {
            case 0:
                do {
                    Iterator it = this.f34171p0;
                    if (!it.hasNext()) {
                        this.f34168Y = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((InterfaceC10533f) this.f34172q0).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f34171p0;
                    if (!it2.hasNext()) {
                        this.f34168Y = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((C11306c0) this.f34172q0).f34222Z.contains(next));
                break;
        }
        this.f34169Z = next;
        if (this.f34168Y == 3) {
            return false;
        }
        this.f34168Y = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f34168Y = 2;
        Object obj = this.f34169Z;
        this.f34169Z = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11282G(Iterator it, InterfaceC10533f interfaceC10533f) {
        this();
        this.f34170o0 = 0;
        this.f34171p0 = it;
        this.f34172q0 = interfaceC10533f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11282G(C11306c0 c11306c0) {
        this();
        this.f34170o0 = 1;
        this.f34172q0 = c11306c0;
        this.f34171p0 = c11306c0.f34221Y.iterator();
    }
}
