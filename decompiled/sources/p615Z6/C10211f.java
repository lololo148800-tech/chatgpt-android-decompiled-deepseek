package p615Z6;

import java.util.Iterator;

/* JADX INFO: renamed from: Z6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10211f implements InterfaceC10209e {

    /* JADX INFO: renamed from: a */
    public final int f30329a;

    /* JADX INFO: renamed from: b */
    public final int f30330b;

    /* JADX INFO: renamed from: c */
    public final boolean f30331c;

    /* JADX INFO: renamed from: d */
    public final boolean f30332d;

    /* JADX INFO: renamed from: e */
    public final String f30333e;

    public C10211f(int i10, int i11, String str, boolean z6, boolean z10) {
        this.f30329a = i10;
        this.f30330b = i11;
        this.f30331c = z6;
        this.f30332d = z10;
        this.f30333e = str;
    }

    @Override // p615Z6.InterfaceC10209e
    /* JADX INFO: renamed from: a */
    public final boolean mo10789a(AbstractC10199Y abstractC10199Y) {
        int i10;
        int i11;
        boolean z6 = this.f30332d;
        String strMo10764n = this.f30333e;
        if (z6 && strMo10764n == null) {
            strMo10764n = abstractC10199Y.mo10764n();
        }
        InterfaceC10197W interfaceC10197W = abstractC10199Y.f30315b;
        if (interfaceC10197W != null) {
            Iterator it = interfaceC10197W.getChildren().iterator();
            i11 = 0;
            i10 = 0;
            while (it.hasNext()) {
                AbstractC10199Y abstractC10199Y2 = (AbstractC10199Y) ((AbstractC10202a0) it.next());
                if (abstractC10199Y2 == abstractC10199Y) {
                    i11 = i10;
                }
                if (strMo10764n == null || abstractC10199Y2.mo10764n().equals(strMo10764n)) {
                    i10++;
                }
            }
        } else {
            i10 = 1;
            i11 = 0;
        }
        int i12 = this.f30331c ? i11 + 1 : i10 - i11;
        int i13 = this.f30329a;
        int i14 = this.f30330b;
        if (i13 == 0) {
            return i12 == i14;
        }
        int i15 = i12 - i14;
        return i15 % i13 == 0 && (Integer.signum(i15) == 0 || Integer.signum(i15) == Integer.signum(i13));
    }

    public final String toString() {
        String str = this.f30331c ? "" : "last-";
        boolean z6 = this.f30332d;
        int i10 = this.f30330b;
        int i11 = this.f30329a;
        return z6 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i11), Integer.valueOf(i10), this.f30333e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i11), Integer.valueOf(i10));
    }
}
