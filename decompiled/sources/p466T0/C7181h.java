package p466T0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p076Cm.InterfaceC1723a;
import p895n1.AbstractC17419G;
import p895n1.C17417E;

/* JADX INFO: renamed from: T0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7181h implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22828Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Iterator f22829Z;

    public C7181h(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        this.f22829Z = AbstractC16544l.m18098k(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22828Y) {
            case 0:
                return ((C7179f) this.f22829Z).f22815o0;
            case 1:
                return this.f22829Z.hasNext();
            default:
                return ((C0742X) this.f22829Z).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22828Y) {
            case 0:
                return (Map.Entry) ((C7179f) this.f22829Z).next();
            case 1:
                return (AbstractC17419G) this.f22829Z.next();
            default:
                return ((C0742X) this.f22829Z).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22828Y) {
            case 0:
                ((C7179f) this.f22829Z).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C7181h(C7178e c7178e) {
        AbstractC7188o[] abstractC7188oArr = new AbstractC7188o[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC7188oArr[i10] = new C7190q(this);
        }
        this.f22829Z = new C7179f(c7178e, abstractC7188oArr);
    }

    public C7181h(C17417E c17417e) {
        this.f22829Z = c17417e.f55635v0.iterator();
    }
}
