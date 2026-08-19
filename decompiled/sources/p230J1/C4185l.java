package p230J1;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: J1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4185l implements CharacterIterator {

    /* JADX INFO: renamed from: Y */
    public final CharSequence f13596Y;

    /* JADX INFO: renamed from: Z */
    public final int f13597Z;

    /* JADX INFO: renamed from: o0 */
    public int f13598o0 = 0;

    public C4185l(int i10, CharSequence charSequence) {
        this.f13596Y = charSequence;
        this.f13597Z = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f13598o0;
        if (i10 == this.f13597Z) {
            return (char) 65535;
        }
        return this.f13596Y.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f13598o0 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f13597Z;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f13598o0;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f13597Z;
        if (i10 == 0) {
            this.f13598o0 = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f13598o0 = i11;
        return this.f13596Y.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f13598o0 + 1;
        this.f13598o0 = i10;
        int i11 = this.f13597Z;
        if (i10 < i11) {
            return this.f13596Y.charAt(i10);
        }
        this.f13598o0 = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f13598o0;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f13598o0 = i11;
        return this.f13596Y.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f13597Z || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f13598o0 = i10;
        return current();
    }
}
