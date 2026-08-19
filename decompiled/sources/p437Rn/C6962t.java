package p437Rn;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p369On.AbstractC6273b;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Rn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C6962t implements InterfaceC6958p {

    /* JADX INFO: renamed from: a */
    public final String f22266a;

    public C6962t(String string) {
        AbstractC16544l.m18094g(string, "string");
        this.f22266a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (AbstractC6273b.m6754a(string.charAt(0))) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("String '", string, "' starts with a digit").toString());
        }
        if (AbstractC6273b.m6754a(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("String '", string, "' ends with a digit").toString());
        }
    }

    @Override // p437Rn.InterfaceC6958p
    /* JADX INFO: renamed from: a */
    public final Object mo7330a(InterfaceC6945c interfaceC6945c, String input, int i10) {
        AbstractC16544l.m18094g(input, "input");
        String str = this.f22266a;
        if (str.length() + i10 > input.length()) {
            return new C6952j(i10, new C6949g(this, 1));
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (input.charAt(i10 + i11) != str.charAt(i11)) {
                return new C6952j(i10, new C6961s(i10, i11, 0, this, input));
            }
        }
        return Integer.valueOf(str.length() + i10);
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder(Separators.QUOTE), this.f22266a, '\'');
    }
}
