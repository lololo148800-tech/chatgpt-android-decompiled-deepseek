package p879lp;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mp.C17360a;
import mp.InterfaceC17361b;
import p658b5.C11242m;
import p874lj.C17057a;
import p885m4.C17151a;
import p885m4.C17152b;

/* JADX INFO: renamed from: lp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17118a implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final CharSequence f54717Y;

    /* JADX INFO: renamed from: Z */
    public C17360a f54718Z = null;

    /* JADX INFO: renamed from: o0 */
    public int f54719o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public int f54720p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11242m f54721q0;

    public C17118a(C11242m c11242m, CharSequence charSequence) {
        this.f54721q0 = c11242m;
        this.f54717Y = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC17361b interfaceC17361b;
        if (this.f54718Z == null) {
            CharSequence charSequence = this.f54717Y;
            int length = charSequence.length();
            while (true) {
                int i10 = this.f54719o0;
                if (i10 >= length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i10);
                C11242m c11242m = this.f54721q0;
                if (cCharAt == ':') {
                    interfaceC17361b = (C17151a) c11242m.f34018Y;
                } else if (cCharAt == '@') {
                    interfaceC17361b = (C17057a) c11242m.f34020o0;
                } else if (cCharAt != 'w') {
                    c11242m.getClass();
                    interfaceC17361b = null;
                } else {
                    interfaceC17361b = (C17152b) c11242m.f34019Z;
                }
                if (interfaceC17361b != null) {
                    C17360a c17360aMo18886d = interfaceC17361b.mo18886d(this.f54719o0, this.f54720p0, charSequence);
                    if (c17360aMo18886d != null) {
                        this.f54718Z = c17360aMo18886d;
                        int i11 = c17360aMo18886d.f55390c;
                        this.f54719o0 = i11;
                        this.f54720p0 = i11;
                        break;
                    }
                    this.f54719o0++;
                } else {
                    this.f54719o0++;
                }
            }
        }
        return this.f54718Z != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C17360a c17360a = this.f54718Z;
        this.f54718Z = null;
        return c17360a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
