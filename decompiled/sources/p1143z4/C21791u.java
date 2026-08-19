package p1143z4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p692d0.AbstractC12978q;
import p692d0.C12960M;

/* JADX INFO: renamed from: z4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C21791u implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f69137Y = -1;

    /* JADX INFO: renamed from: Z */
    public boolean f69138Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21792v f69139o0;

    public C21791u(C21792v c21792v) {
        this.f69139o0 = c21792v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69137Y + 1 < this.f69139o0.f69141u0.m14655f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f69138Z = true;
        C12960M c12960m = this.f69139o0.f69141u0;
        int i10 = this.f69137Y + 1;
        this.f69137Y = i10;
        Object objM14656g = c12960m.m14656g(i10);
        AbstractC16544l.m18093f(objM14656g, "nodes.valueAt(++index)");
        return (AbstractC21790t) objM14656g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f69138Z) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C12960M c12960m = this.f69139o0.f69141u0;
        ((AbstractC21790t) c12960m.m14656g(this.f69137Y)).f69131Z = null;
        int i10 = this.f69137Y;
        Object[] objArr = c12960m.f41157o0;
        Object obj = objArr[i10];
        Object obj2 = AbstractC12978q.f41193c;
        if (obj != obj2) {
            objArr[i10] = obj2;
            c12960m.f41155Y = true;
        }
        this.f69137Y = i10 - 1;
        this.f69138Z = false;
    }
}
