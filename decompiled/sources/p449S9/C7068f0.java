package p449S9;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: S9.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7068f0 extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final String f22543Y;

    public C7068f0(String str) {
        this.f22543Y = str;
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        int iMo7454a = abstractC7072h0.mo7454a();
        int iM7475d = AbstractC7072h0.m7475d((byte) 96);
        if (iM7475d != iMo7454a) {
            return iM7475d - abstractC7072h0.mo7454a();
        }
        String str = ((C7068f0) abstractC7072h0).f22543Y;
        int length = str.length();
        String str2 = this.f22543Y;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7068f0.class == obj.getClass()) {
            return this.f22543Y.equals(((C7068f0) obj).f22543Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC7072h0.m7475d((byte) 96)), this.f22543Y});
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f22543Y, Separators.DOUBLE_QUOTE, new StringBuilder(Separators.DOUBLE_QUOTE));
    }
}
