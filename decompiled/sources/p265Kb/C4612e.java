package p265Kb;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import p1073w3.C20811m;
import p214Ib.C3674q;
import p468T2.C7230v;
import p468T2.InterfaceC7222n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Kb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4612e implements InterfaceC4623p, InterfaceC7222n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15033Y;

    /* JADX INFO: renamed from: Z */
    public String f15034Z;

    /* JADX INFO: renamed from: c */
    public static C4612e m5354c(C20811m c20811m) {
        String str;
        c20811m.m21345G(2);
        int iM21365t = c20811m.m21365t();
        int i10 = iM21365t >> 1;
        int iM21365t2 = ((c20811m.m21365t() >> 3) & 31) | ((iM21365t & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iM21365t2 >= 10 ? Separators.DOT : ".0");
        sb2.append(iM21365t2);
        return new C4612e(sb2.toString(), 1);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        throw new C3674q(this.f15034Z);
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: b */
    public boolean mo5356b(CharSequence charSequence, int i10, int i11, C7230v c7230v) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f15034Z)) {
            return true;
        }
        c7230v.f22935c = (c7230v.f22935c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f15033Y) {
            case 5:
                return AbstractC9306j0.m9891j(this.f15034Z, "')", new StringBuilder("Phase('"));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4612e(String str, int i10) {
        this.f15033Y = i10;
        this.f15034Z = str;
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: a */
    public Object mo5355a() {
        return this;
    }
}
