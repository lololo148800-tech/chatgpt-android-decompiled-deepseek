package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p369On.C6272a;
import p437Rn.InterfaceC6945c;

/* JADX INFO: renamed from: Nn.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5867G implements InterfaceC5898g, InterfaceC5901h0, InterfaceC6945c {

    /* JADX INFO: renamed from: a */
    public final C5866F f19177a;

    /* JADX INFO: renamed from: b */
    public final C5868H f19178b;

    public C5867G(C5866F date, C5868H time) {
        AbstractC16544l.m18094g(date, "date");
        AbstractC16544l.m18094g(time, "time");
        this.f19177a = date;
        this.f19178b = time;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: B */
    public final void mo6268B(C6272a c6272a) {
        this.f19178b.mo6268B(c6272a);
    }

    @Override // p437Rn.InterfaceC6945c
    /* JADX INFO: renamed from: a */
    public final Object mo6257a() {
        return new C5867G(this.f19177a.mo6257a(), this.f19178b.mo6257a());
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: b */
    public final EnumC5896f mo6269b() {
        return this.f19178b.f19181c;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: d */
    public final void mo6270d(Integer num) {
        this.f19178b.f19180b = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: e */
    public final void mo6260e(Integer num) {
        this.f19177a.f19174b = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: f */
    public final void mo6271f(EnumC5896f enumC5896f) {
        this.f19178b.f19181c = enumC5896f;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: h */
    public final Integer mo6272h() {
        return this.f19178b.f19182d;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: i */
    public final void mo6273i(Integer num) {
        this.f19178b.f19182d = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: j */
    public final Integer mo6261j() {
        return this.f19177a.f19173a;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: k */
    public final void mo6262k(Integer num) {
        this.f19177a.f19175c = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: l */
    public final C6272a mo6274l() {
        return this.f19178b.mo6274l();
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: m */
    public final Integer mo6275m() {
        return this.f19178b.f19180b;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: n */
    public final Integer mo6263n() {
        return this.f19177a.f19176d;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: o */
    public final void mo6264o(Integer num) {
        this.f19177a.f19173a = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: q */
    public final Integer mo6265q() {
        return this.f19177a.f19175c;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: r */
    public final Integer mo6266r() {
        return this.f19177a.f19174b;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: s */
    public final void mo6276s(Integer num) {
        this.f19178b.f19179a = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: t */
    public final void mo6267t(Integer num) {
        this.f19177a.f19176d = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: u */
    public final Integer mo6277u() {
        return this.f19178b.f19179a;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: x */
    public final Integer mo6278x() {
        return this.f19178b.f19183e;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: z */
    public final void mo6279z(Integer num) {
        this.f19178b.f19183e = num;
    }
}
