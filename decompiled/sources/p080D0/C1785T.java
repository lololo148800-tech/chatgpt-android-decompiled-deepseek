package p080D0;

import java.util.ArrayList;
import p001A.AbstractC0010F;
import p003A1.C0195P;
import p025An.C0644w;
import p1095x1.InterfaceC21098s;
import p692d0.AbstractC12974m;
import p692d0.C12984w;

/* JADX INFO: renamed from: D0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1785T {

    /* JADX INFO: renamed from: a */
    public final long f5107a;

    /* JADX INFO: renamed from: b */
    public final long f5108b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21098s f5109c;

    /* JADX INFO: renamed from: d */
    public final boolean f5110d;

    /* JADX INFO: renamed from: e */
    public final C1824q f5111e;

    /* JADX INFO: renamed from: f */
    public final C0195P f5112f;

    /* JADX INFO: renamed from: g */
    public final C12984w f5113g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5114h;

    /* JADX INFO: renamed from: i */
    public int f5115i;

    /* JADX INFO: renamed from: j */
    public int f5116j;

    /* JADX INFO: renamed from: k */
    public int f5117k;

    public C1785T(long j10, long j11, InterfaceC21098s interfaceC21098s, boolean z6, C1824q c1824q, C0195P c0195p) {
        this.f5107a = j10;
        this.f5108b = j11;
        this.f5109c = interfaceC21098s;
        this.f5110d = z6;
        this.f5111e = c1824q;
        this.f5112f = c0195p;
        int i10 = AbstractC12974m.f41184a;
        this.f5113g = new C12984w(6);
        this.f5114h = new ArrayList();
        this.f5115i = -1;
        this.f5116j = -1;
        this.f5117k = -1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2586a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        int iM24h = AbstractC0010F.m24h(AbstractC1807h0.m2610E(i11, i12));
        if (iM24h == 0) {
            return this.f5117k - 1;
        }
        if (iM24h == 1) {
            return this.f5117k;
        }
        if (iM24h == 2) {
            return i10;
        }
        throw new C0644w();
    }
}
