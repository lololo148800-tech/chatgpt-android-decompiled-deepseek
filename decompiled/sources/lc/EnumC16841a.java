package lc;

/* JADX INFO: renamed from: lc.a */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC16841a {
    /* JADX INFO: Fake field, exist only in values array */
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: Y */
    public final int[] f54018Y;

    /* JADX INFO: renamed from: Z */
    public final int f54019Z;

    EnumC16841a(int[] iArr, int i10) {
        this.f54018Y = iArr;
        this.f54019Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m18572a(C16842b c16842b) {
        char c9;
        int i10 = c16842b.f54021a;
        if (i10 <= 9) {
            c9 = 0;
        } else {
            c9 = i10 <= 26 ? (char) 1 : (char) 2;
        }
        return this.f54018Y[c9];
    }
}
