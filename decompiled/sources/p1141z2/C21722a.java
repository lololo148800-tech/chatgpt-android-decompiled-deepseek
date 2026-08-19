package p1141z2;

/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21722a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f68907e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f68908a;

    /* JADX INFO: renamed from: b */
    public final int f68909b;

    /* JADX INFO: renamed from: c */
    public int f68910c;

    /* JADX INFO: renamed from: d */
    public char f68911d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f68907e[i10] = Character.getDirectionality(i10);
        }
    }

    public C21722a(CharSequence charSequence) {
        this.f68908a = charSequence;
        this.f68909b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m22231a() {
        int i10 = this.f68910c - 1;
        CharSequence charSequence = this.f68908a;
        char cCharAt = charSequence.charAt(i10);
        this.f68911d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f68910c);
            this.f68910c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f68910c--;
        char c9 = this.f68911d;
        return c9 < 1792 ? f68907e[c9] : Character.getDirectionality(c9);
    }
}
