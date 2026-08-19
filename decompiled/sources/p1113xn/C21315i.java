package p1113xn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: xn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C21315i implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final String f67746Y;

    /* JADX INFO: renamed from: Z */
    public int f67747Z;

    /* JADX INFO: renamed from: o0 */
    public int f67748o0;

    /* JADX INFO: renamed from: p0 */
    public int f67749p0;

    /* JADX INFO: renamed from: q0 */
    public int f67750q0;

    public C21315i(String string) {
        AbstractC16544l.m18094g(string, "string");
        this.f67746Y = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f67747Z;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f67750q0 < 0) {
            this.f67747Z = 2;
            return false;
        }
        String str = this.f67746Y;
        int length = str.length();
        int length2 = str.length();
        for (int i13 = this.f67748o0; i13 < length2; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < str.length() && str.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f67747Z = 1;
                this.f67750q0 = i10;
                this.f67749p0 = length;
                return true;
            }
        }
        i10 = -1;
        this.f67747Z = 1;
        this.f67750q0 = i10;
        this.f67749p0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f67747Z = 0;
        int i10 = this.f67749p0;
        int i11 = this.f67748o0;
        this.f67748o0 = this.f67750q0 + i10;
        return this.f67746Y.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
