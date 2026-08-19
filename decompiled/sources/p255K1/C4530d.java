package p255K1;

import java.text.BreakIterator;
import p544W9.AbstractC8524N2;

/* JADX INFO: renamed from: K1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4530d extends AbstractC8524N2 {

    /* JADX INFO: renamed from: Z */
    public final BreakIterator f14808Z;

    public C4530d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f14808Z = characterInstance;
    }

    @Override // p544W9.AbstractC8524N2
    /* JADX INFO: renamed from: c */
    public final int mo5269c(int i10) {
        return this.f14808Z.following(i10);
    }

    @Override // p544W9.AbstractC8524N2
    /* JADX INFO: renamed from: e */
    public final int mo5270e(int i10) {
        return this.f14808Z.preceding(i10);
    }
}
