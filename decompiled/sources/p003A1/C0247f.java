package p003A1;

/* JADX INFO: renamed from: A1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0247f extends AbstractC0235c {

    /* JADX INFO: renamed from: d */
    public static C0247f f938d;

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: f */
    public final int[] mo772f(int i10) {
        int length = m776j().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && m776j().charAt(i10) == '\n' && !m817q(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !m816p(i11)) {
            i11++;
        }
        return m775i(i10, i11);
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: n */
    public final int[] mo780n(int i10) {
        int length = m776j().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && m776j().charAt(i10 - 1) == '\n' && !m816p(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !m817q(i11)) {
            i11--;
        }
        return m775i(i11, i10);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m816p(int i10) {
        return i10 > 0 && m776j().charAt(i10 + (-1)) != '\n' && (i10 == m776j().length() || m776j().charAt(i10) == '\n');
    }

    /* JADX INFO: renamed from: q */
    public final boolean m817q(int i10) {
        return m776j().charAt(i10) != '\n' && (i10 == 0 || m776j().charAt(i10 - 1) == '\n');
    }
}
