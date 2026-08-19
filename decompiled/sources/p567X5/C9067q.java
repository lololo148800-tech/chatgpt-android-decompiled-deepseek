package p567X5;

import java.util.List;
import p520V5.C7794w;
import p591Y5.AbstractC9653d;
import p591Y5.C9656g;
import p591Y5.InterfaceC9650a;
import p675c6.C11675j;
import p675c6.C11676k;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: X5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9067q implements InterfaceC9650a, InterfaceC9053c {

    /* JADX INFO: renamed from: a */
    public final C7794w f27754a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9653d f27755b;

    /* JADX INFO: renamed from: c */
    public C11676k f27756c;

    public C9067q(C7794w c7794w, AbstractC13029b abstractC13029b, C11675j c11675j) {
        this.f27754a = c7794w;
        c11675j.getClass();
        C9656g c9656gMo10670p = c11675j.f35377a.mo10670p();
        this.f27755b = c9656gMo10670p;
        abstractC13029b.m14772d(c9656gMo10670p);
        c9656gMo10670p.m10230a(this);
    }

    /* JADX INFO: renamed from: d */
    public static int m9624d(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27754a.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
    }
}
