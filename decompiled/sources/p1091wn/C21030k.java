package p1091wn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p076Cm.InterfaceC1723a;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: wn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C21030k implements Iterator, InterfaceC18770c, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f66908Y;

    /* JADX INFO: renamed from: Z */
    public Object f66909Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f66910o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC18770c f66911p0;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m21481a() {
        int i10 = this.f66908Y;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f66908Y);
    }

    /* JADX INFO: renamed from: c */
    public final void m21482c(Object obj, AbstractC19692h abstractC19692h) {
        this.f66909Z = obj;
        this.f66908Y = 3;
        this.f66911p0 = abstractC19692h;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return C18777j.f59682Y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f66908Y;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m21481a();
                }
                Iterator it = this.f66910o0;
                AbstractC16544l.m18091d(it);
                if (it.hasNext()) {
                    this.f66908Y = 2;
                    return true;
                }
                this.f66910o0 = null;
            }
            this.f66908Y = 5;
            InterfaceC18770c interfaceC18770c = this.f66911p0;
            AbstractC16544l.m18091d(interfaceC18770c);
            this.f66911p0 = null;
            interfaceC18770c.resumeWith(C17296C.f55119a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f66908Y;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f66908Y = 1;
            Iterator it = this.f66910o0;
            AbstractC16544l.m18091d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m21481a();
        }
        this.f66908Y = 0;
        Object obj = this.f66909Z;
        this.f66909Z = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        AbstractC9233X.m9807c(obj);
        this.f66908Y = 4;
    }
}
