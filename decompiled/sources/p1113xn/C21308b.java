package p1113xn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p076Cm.InterfaceC1723a;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: xn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C21308b implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f67724Y = -1;

    /* JADX INFO: renamed from: Z */
    public int f67725Z;

    /* JADX INFO: renamed from: o0 */
    public int f67726o0;

    /* JADX INFO: renamed from: p0 */
    public C3508g f67727p0;

    /* JADX INFO: renamed from: q0 */
    public int f67728q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C21309c f67729r0;

    public C21308b(C21309c c21309c) {
        this.f67729r0 = c21309c;
        int iM8921l = AbstractC8301I.m8921l(c21309c.f67731b, 0, c21309c.f67730a.length());
        this.f67725Z = iM8921l;
        this.f67726o0 = iM8921l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX INFO: renamed from: a */
    public final void m21648a() {
        C17309l c17309l;
        int i10 = this.f67726o0;
        if (i10 < 0) {
            this.f67724Y = 0;
            this.f67727p0 = null;
            return;
        }
        C21309c c21309c = this.f67729r0;
        int i11 = c21309c.f67732c;
        if (i11 > 0) {
            int i12 = this.f67728q0 + 1;
            this.f67728q0 = i12;
            if (i12 >= i11) {
                this.f67727p0 = new C3508g(this.f67725Z, AbstractC21322p.m21674H(c21309c.f67730a), 1);
                this.f67726o0 = -1;
            } else if (i10 > c21309c.f67730a.length() && (c17309l = (C17309l) c21309c.f67733d.invoke(c21309c.f67730a, Integer.valueOf(this.f67726o0))) != null) {
                int iIntValue = ((Number) c17309l.f55136Y).intValue();
                int iIntValue2 = ((Number) c17309l.f55137Z).intValue();
                this.f67727p0 = AbstractC8301I.m8929t(this.f67725Z, iIntValue);
                int i13 = iIntValue + iIntValue2;
                this.f67725Z = i13;
                this.f67726o0 = i13 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f67727p0 = new C3508g(this.f67725Z, AbstractC21322p.m21674H(c21309c.f67730a), 1);
                this.f67726o0 = -1;
            }
        } else if (i10 > c21309c.f67730a.length()) {
            this.f67727p0 = new C3508g(this.f67725Z, AbstractC21322p.m21674H(c21309c.f67730a), 1);
            this.f67726o0 = -1;
        } else {
            int iIntValue3 = ((Number) c17309l.f55136Y).intValue();
            int iIntValue4 = ((Number) c17309l.f55137Z).intValue();
            this.f67727p0 = AbstractC8301I.m8929t(this.f67725Z, iIntValue3);
            int i14 = iIntValue3 + iIntValue4;
            this.f67725Z = i14;
            this.f67726o0 = i14 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f67724Y = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f67724Y == -1) {
            m21648a();
        }
        return this.f67724Y == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f67724Y == -1) {
            m21648a();
        }
        if (this.f67724Y == 0) {
            throw new NoSuchElementException();
        }
        C3508g c3508g = this.f67727p0;
        AbstractC16544l.m18092e(c3508g, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f67727p0 = null;
        this.f67724Y = -1;
        return c3508g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
