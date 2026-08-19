package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.format.e */
/* JADX INFO: loaded from: classes4.dex */
final class C15585e implements InterfaceC15586f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC15586f[] f48663a;

    /* JADX INFO: renamed from: b */
    private final boolean f48664b;

    C15585e(ArrayList arrayList, boolean z6) {
        this((InterfaceC15586f[]) arrayList.toArray(new InterfaceC15586f[arrayList.size()]), z6);
    }

    C15585e(InterfaceC15586f[] interfaceC15586fArr, boolean z6) {
        this.f48663a = interfaceC15586fArr;
        this.f48664b = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C15585e m17055a() {
        return !this.f48664b ? this : new C15585e(this.f48663a, false);
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        int length = sb2.length();
        boolean z6 = this.f48664b;
        if (z6) {
            c15605y.m17107g();
        }
        try {
            for (InterfaceC15586f interfaceC15586f : this.f48663a) {
                if (!interfaceC15586f.mo17053m(c15605y, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z6) {
                c15605y.m17101a();
            }
        }
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        boolean z6 = this.f48664b;
        InterfaceC15586f[] interfaceC15586fArr = this.f48663a;
        if (z6) {
            c15603w.m17098r();
            int iMo17054o = i10;
            for (InterfaceC15586f interfaceC15586f : interfaceC15586fArr) {
                iMo17054o = interfaceC15586f.mo17054o(c15603w, charSequence, iMo17054o);
                if (iMo17054o < 0) {
                    c15603w.m17086f(false);
                    return i10;
                }
            }
            c15603w.m17086f(true);
            return iMo17054o;
        }
        for (InterfaceC15586f interfaceC15586f2 : interfaceC15586fArr) {
            i10 = interfaceC15586f2.mo17054o(c15603w, charSequence, i10);
            if (i10 < 0) {
                break;
            }
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC15586f[] interfaceC15586fArr = this.f48663a;
        if (interfaceC15586fArr != null) {
            boolean z6 = this.f48664b;
            sb2.append(z6 ? "[" : Separators.LPAREN);
            for (InterfaceC15586f interfaceC15586f : interfaceC15586fArr) {
                sb2.append(interfaceC15586f);
            }
            sb2.append(z6 ? "]" : Separators.RPAREN);
        }
        return sb2.toString();
    }
}
