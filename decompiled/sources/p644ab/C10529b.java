package p644ab;

/* JADX INFO: renamed from: ab.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10529b extends AbstractC10528a {

    /* JADX INFO: renamed from: Y */
    public final char f31238Y;

    public C10529b(char c9) {
        this.f31238Y = c9;
    }

    @Override // p644ab.AbstractC10528a
    /* JADX INFO: renamed from: a */
    public final boolean mo10977a(char c9) {
        return c9 == this.f31238Y;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c9 = this.f31238Y;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
