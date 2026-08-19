package p644ab;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A.AbstractC0010F;
import p013Ab.C0420b;
import p523V9.AbstractC8020X;
import p960q9.C18655i;

/* JADX INFO: renamed from: ab.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10535h implements Iterator {

    /* JADX INFO: renamed from: Z */
    public String f31248Z;

    /* JADX INFO: renamed from: o0 */
    public final CharSequence f31249o0;

    /* JADX INFO: renamed from: p0 */
    public final C10530c f31250p0;

    /* JADX INFO: renamed from: r0 */
    public int f31252r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C18655i f31253s0;

    /* JADX INFO: renamed from: Y */
    public int f31247Y = 2;

    /* JADX INFO: renamed from: q0 */
    public int f31251q0 = 0;

    public C10535h(C18655i c18655i, C0420b c0420b, CharSequence charSequence) {
        this.f31253s0 = c18655i;
        this.f31250p0 = (C10530c) c0420b.f1382o0;
        this.f31252r0 = c0420b.f1381Z;
        this.f31249o0 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i10 = this.f31247Y;
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
        this.f31247Y = 4;
        int i11 = this.f31251q0;
        while (true) {
            int length = this.f31251q0;
            if (length == -1) {
                this.f31247Y = 3;
                string = null;
                break;
            }
            C10529b c10529b = (C10529b) this.f31253s0.f59414Z;
            CharSequence charSequence = this.f31249o0;
            int length2 = charSequence.length();
            AbstractC8020X.m8354d(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c10529b.mo10977a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f31251q0 = -1;
            } else {
                this.f31251q0 = length + 1;
            }
            int i12 = this.f31251q0;
            if (i12 != i11) {
                C10530c c10530c = this.f31250p0;
                if (i11 < length) {
                    charSequence.charAt(i11);
                    c10530c.getClass();
                }
                if (length > i11) {
                    charSequence.charAt(length - 1);
                    c10530c.getClass();
                }
                int i13 = this.f31252r0;
                if (i13 == 1) {
                    length = charSequence.length();
                    this.f31251q0 = -1;
                    if (length > i11) {
                        charSequence.charAt(length - 1);
                        c10530c.getClass();
                    }
                } else {
                    this.f31252r0 = i13 - 1;
                }
                string = charSequence.subSequence(i11, length).toString();
                break;
            }
            int i14 = i12 + 1;
            this.f31251q0 = i14;
            if (i14 > charSequence.length()) {
                this.f31251q0 = -1;
            }
        }
        this.f31248Z = string;
        if (this.f31247Y == 3) {
            return false;
        }
        this.f31247Y = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f31247Y = 2;
        String str = this.f31248Z;
        this.f31248Z = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
