package p712dp;

import p690cp.C12940z;
import p817j$.util.Objects;

/* JADX INFO: renamed from: dp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C13191g {

    /* JADX INFO: renamed from: a */
    public final CharSequence f41860a;

    /* JADX INFO: renamed from: b */
    public final C12940z f41861b;

    public C13191g(CharSequence charSequence, C12940z c12940z) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f41860a = charSequence;
        this.f41861b = c12940z;
    }

    /* JADX INFO: renamed from: a */
    public final C13191g m14847a(int i10, int i11) {
        int i12;
        CharSequence charSequenceSubSequence = this.f41860a.subSequence(i10, i11);
        C12940z c12940z = this.f41861b;
        return new C13191g(charSequenceSubSequence, (c12940z == null || (i12 = i11 - i10) == 0) ? null : new C12940z(c12940z.f41103a, c12940z.f41104b + i10, c12940z.f41105c + i10, i12));
    }
}
