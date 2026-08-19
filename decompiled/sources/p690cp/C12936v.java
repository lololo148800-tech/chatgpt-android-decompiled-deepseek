package p690cp;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.C16610g;
import kotlin.reflect.jvm.internal.impl.protobuf.C16612i;

/* JADX INFO: renamed from: cp.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C12936v implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41098Y;

    /* JADX INFO: renamed from: Z */
    public Object f41099Z;

    /* JADX INFO: renamed from: o0 */
    public Object f41100o0;

    public C12936v(AbstractC12935u abstractC12935u, C12912C c12912c) {
        this.f41098Y = 0;
        this.f41099Z = abstractC12935u;
        this.f41100o0 = c12912c;
    }

    /* JADX INFO: renamed from: a */
    public C16610g m14599a() {
        C16610g c16610g;
        C16610g c16610g2 = (C16610g) this.f41100o0;
        if (c16610g2 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack = (Stack) this.f41099Z;
            if (stack.isEmpty()) {
                c16610g = null;
                break;
            }
            ByteString byteString = ((C16612i) stack.pop()).f52776o0;
            while (byteString instanceof C16612i) {
                C16612i c16612i = (C16612i) byteString;
                stack.push(c16612i);
                byteString = c16612i.f52775Z;
            }
            c16610g = (C16610g) byteString;
        } while (c16610g.isEmpty());
        this.f41100o0 = c16610g;
        return c16610g2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f41098Y) {
            case 0:
                AbstractC12935u abstractC12935u = (AbstractC12935u) this.f41099Z;
                return (abstractC12935u == null || abstractC12935u == ((C12912C) this.f41100o0)) ? false : true;
            default:
                return ((C16610g) this.f41100o0) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f41098Y) {
            case 0:
                AbstractC12935u abstractC12935u = (AbstractC12935u) this.f41099Z;
                this.f41099Z = abstractC12935u.f41096e;
                return abstractC12935u;
            default:
                return m14599a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f41098Y) {
            case 0:
                throw new UnsupportedOperationException("remove");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C12936v(ByteString byteString) {
        this.f41098Y = 1;
        this.f41099Z = new Stack();
        while (byteString instanceof C16612i) {
            C16612i c16612i = (C16612i) byteString;
            ((Stack) this.f41099Z).push(c16612i);
            byteString = c16612i.f52775Z;
        }
        this.f41100o0 = (C16610g) byteString;
    }
}
