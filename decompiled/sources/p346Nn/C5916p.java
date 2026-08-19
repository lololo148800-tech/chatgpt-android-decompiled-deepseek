package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p369On.C6272a;
import p437Rn.InterfaceC6945c;

/* JADX INFO: renamed from: Nn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C5916p implements InterfaceC5898g, InterfaceC5901h0, InterfaceC5917p0, InterfaceC6945c {

    /* JADX INFO: renamed from: a */
    public final C5866F f19283a;

    /* JADX INFO: renamed from: b */
    public final C5868H f19284b;

    /* JADX INFO: renamed from: c */
    public final C5869I f19285c;

    /* JADX INFO: renamed from: d */
    public String f19286d;

    public C5916p(C5866F date, C5868H time, C5869I offset, String str) {
        AbstractC16544l.m18094g(date, "date");
        AbstractC16544l.m18094g(time, "time");
        AbstractC16544l.m18094g(offset, "offset");
        this.f19283a = date;
        this.f19284b = time;
        this.f19285c = offset;
        this.f19286d = str;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: A */
    public final void mo6282A(Integer num) {
        this.f19285c.f19186b = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: B */
    public final void mo6268B(C6272a c6272a) {
        this.f19284b.mo6268B(c6272a);
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: C */
    public final void mo6283C(Integer num) {
        this.f19285c.f19188d = num;
    }

    @Override // p437Rn.InterfaceC6945c
    /* JADX INFO: renamed from: a */
    public final Object mo6257a() {
        C5866F c5866fMo6257a = this.f19283a.mo6257a();
        C5868H c5868hMo6257a = this.f19284b.mo6257a();
        C5869I c5869i = this.f19285c;
        return new C5916p(c5866fMo6257a, c5868hMo6257a, new C5869I(c5869i.f19185a, c5869i.f19186b, c5869i.f19187c, c5869i.f19188d), this.f19286d);
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: b */
    public final EnumC5896f mo6269b() {
        return this.f19284b.f19181c;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: c */
    public final Integer mo6285c() {
        return this.f19285c.f19186b;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: d */
    public final void mo6270d(Integer num) {
        this.f19284b.f19180b = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: e */
    public final void mo6260e(Integer num) {
        this.f19283a.f19174b = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5916p) {
            C5916p c5916p = (C5916p) obj;
            if (AbstractC16544l.m18089b(c5916p.f19283a, this.f19283a) && AbstractC16544l.m18089b(c5916p.f19284b, this.f19284b) && AbstractC16544l.m18089b(c5916p.f19285c, this.f19285c) && AbstractC16544l.m18089b(c5916p.f19286d, this.f19286d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: f */
    public final void mo6271f(EnumC5896f enumC5896f) {
        this.f19284b.f19181c = enumC5896f;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: g */
    public final Integer mo6286g() {
        return this.f19285c.f19188d;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: h */
    public final Integer mo6272h() {
        return this.f19284b.f19182d;
    }

    public final int hashCode() {
        int iHashCode = (this.f19283a.hashCode() ^ this.f19284b.hashCode()) ^ this.f19285c.hashCode();
        String str = this.f19286d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: i */
    public final void mo6273i(Integer num) {
        this.f19284b.f19182d = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: j */
    public final Integer mo6261j() {
        return this.f19283a.f19173a;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: k */
    public final void mo6262k(Integer num) {
        this.f19283a.f19175c = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: l */
    public final C6272a mo6274l() {
        return this.f19284b.mo6274l();
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: m */
    public final Integer mo6275m() {
        return this.f19284b.f19180b;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: n */
    public final Integer mo6263n() {
        return this.f19283a.f19176d;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: o */
    public final void mo6264o(Integer num) {
        this.f19283a.f19173a = num;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: p */
    public final Integer mo6287p() {
        return this.f19285c.f19187c;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: q */
    public final Integer mo6265q() {
        return this.f19283a.f19175c;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: r */
    public final Integer mo6266r() {
        return this.f19283a.f19174b;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: s */
    public final void mo6276s(Integer num) {
        this.f19284b.f19179a = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: t */
    public final void mo6267t(Integer num) {
        this.f19283a.f19176d = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: u */
    public final Integer mo6277u() {
        return this.f19284b.f19179a;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: v */
    public final Boolean mo6288v() {
        return this.f19285c.f19185a;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: w */
    public final void mo6289w(Boolean bool) {
        this.f19285c.f19185a = bool;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: x */
    public final Integer mo6278x() {
        return this.f19284b.f19183e;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: y */
    public final void mo6290y(Integer num) {
        this.f19285c.f19187c = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: z */
    public final void mo6279z(Integer num) {
        this.f19284b.f19183e = num;
    }
}
