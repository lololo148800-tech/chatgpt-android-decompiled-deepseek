package p994rk;

import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8122k0;

/* JADX INFO: renamed from: rk.T1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19123T1 implements CharSequence {

    /* JADX INFO: renamed from: Y */
    public final String f60829Y;

    /* JADX INFO: renamed from: Z */
    public final CharSequence f60830Z;

    public C19123T1(CharSequence source, String mask) {
        AbstractC16544l.m18094g(mask, "mask");
        AbstractC16544l.m18094g(source, "source");
        this.f60829Y = mask;
        this.f60830Z = source;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        AbstractC8122k0 c19231w1;
        String str = this.f60829Y;
        if (i10 >= str.length()) {
            return (char) 8226;
        }
        char cCharAt = str.charAt(i10);
        if (cCharAt == '#') {
            c19231w1 = C19224u1.f60973a;
        } else if (cCharAt == '@') {
            c19231w1 = C19220t1.f60969a;
        } else {
            c19231w1 = cCharAt == '*' ? C19228v1.f60976a : new C19231w1(cCharAt);
        }
        if (c19231w1 instanceof C19231w1) {
            return ((C19231w1) c19231w1).f60979a;
        }
        return (char) 8226;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f60830Z.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f60830Z.subSequence(i10, i11);
    }
}
