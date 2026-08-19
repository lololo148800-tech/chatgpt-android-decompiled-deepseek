package p449S9;

import java.util.Arrays;

/* JADX INFO: renamed from: S9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7058a0 extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final boolean f22535Y;

    public C7058a0(boolean z6) {
        this.f22535Y = z6;
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        int iMo7454a = abstractC7072h0.mo7454a();
        int iM7475d = AbstractC7072h0.m7475d((byte) -32);
        if (iM7475d != iMo7454a) {
            return iM7475d - abstractC7072h0.mo7454a();
        }
        return (true != this.f22535Y ? 20 : 21) - (true != ((C7058a0) abstractC7072h0).f22535Y ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7058a0.class == obj.getClass() && this.f22535Y == ((C7058a0) obj).f22535Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC7072h0.m7475d((byte) -32)), Boolean.valueOf(this.f22535Y)});
    }

    public final String toString() {
        return Boolean.toString(this.f22535Y);
    }
}
