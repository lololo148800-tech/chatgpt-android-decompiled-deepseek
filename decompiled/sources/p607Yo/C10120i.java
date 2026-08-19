package p607Yo;

import p544W9.AbstractC8495I3;
import p667bp.AbstractC11538a;
import p690cp.AbstractC12915a;
import p690cp.C12924j;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10120i extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C12924j f29989a;

    /* JADX INFO: renamed from: b */
    public final char f29990b;

    /* JADX INFO: renamed from: c */
    public final int f29991c;

    /* JADX INFO: renamed from: d */
    public String f29992d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f29993e;

    public C10120i(char c9, int i10, int i11) {
        C12924j c12924j = new C12924j();
        this.f29989a = c12924j;
        this.f29993e = new StringBuilder();
        this.f29990b = c9;
        this.f29991c = i10;
        c12924j.f41074g = String.valueOf(c9);
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num = c12924j.f41076i;
        if (num != null && num.intValue() < i10) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
        c12924j.f41075h = numValueOf;
        c12924j.f41077j = i11;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        String str = this.f29992d;
        CharSequence charSequence = c13191g.f41860a;
        if (str == null) {
            this.f29992d = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f29993e;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public final void mo7965e() {
        String strM12930c = AbstractC11538a.m12930c(this.f29992d.trim());
        C12924j c12924j = this.f29989a;
        c12924j.f41078k = strM12930c;
        c12924j.f41079l = this.f29993e.toString();
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f29989a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        int i10 = c10119h.f29974f;
        int i11 = c10119h.f29971c;
        CharSequence charSequence = c10119h.f29969a.f41860a;
        int i12 = c10119h.f29976h;
        C12924j c12924j = this.f29989a;
        if (i12 < 4 && i10 < charSequence.length()) {
            int length = charSequence.length();
            for (int i13 = i10; i13 < length; i13++) {
                if (charSequence.charAt(i13) != this.f29990b) {
                    length = i13;
                    break;
                }
            }
            int i14 = length - i10;
            if (i14 >= this.f29991c && AbstractC8495I3.m9157e(i10 + i14, charSequence.length(), charSequence) == charSequence.length()) {
                Integer numValueOf = Integer.valueOf(i14);
                if (i14 < 3) {
                    throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
                }
                Integer num = c12924j.f41075h;
                if (num != null && i14 < num.intValue()) {
                    throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
                }
                c12924j.f41076i = numValueOf;
                return new C10112a(-1, -1, true);
            }
        }
        int length2 = charSequence.length();
        for (int i15 = c12924j.f41077j; i15 > 0 && i11 < length2 && charSequence.charAt(i11) == ' '; i15--) {
            i11++;
        }
        return C10112a.m10688a(i11);
    }
}
