package p607Yo;

import p690cp.AbstractC12915a;
import p690cp.C12916b;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10113b extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C12916b f29942a = new C12916b();

    /* JADX INFO: renamed from: k */
    public static boolean m10689k(C10119h c10119h, int i10) {
        CharSequence charSequence = c10119h.f29969a.f41860a;
        return c10119h.f29976h < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f29942a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        char cCharAt;
        int i10 = c10119h.f29974f;
        if (!m10689k(c10119h, i10)) {
            return null;
        }
        int i11 = c10119h.f29972d + c10119h.f29976h;
        int i12 = i11 + 1;
        CharSequence charSequence = c10119h.f29969a.f41860a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((cCharAt = charSequence.charAt(i13)) == '\t' || cCharAt == ' ')) {
            i12 = i11 + 2;
        }
        return new C10112a(-1, i12, false);
    }
}
