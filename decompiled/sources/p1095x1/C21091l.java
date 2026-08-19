package p1095x1;

import p492U1.C7536a;

/* JADX INFO: renamed from: x1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C21091l implements InterfaceC21056J {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67017Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21056J f67018Z;

    /* JADX INFO: renamed from: o0 */
    public final int f67019o0;

    /* JADX INFO: renamed from: p0 */
    public final int f67020p0;

    public /* synthetic */ C21091l(InterfaceC21056J interfaceC21056J, int i10, int i11, int i12) {
        this.f67017Y = i12;
        this.f67018Z = interfaceC21056J;
        this.f67019o0 = i10;
        this.f67020p0 = i11;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        switch (this.f67017Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f67018Z.mo21529G(i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        switch (this.f67017Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f67018Z.mo21530b(i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        switch (this.f67017Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f67018Z.mo21531l(i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        switch (this.f67017Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f67018Z.mo21532o(i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        switch (this.f67017Y) {
            case 0:
                int i10 = this.f67020p0;
                int i11 = this.f67019o0;
                InterfaceC21056J interfaceC21056J = this.f67018Z;
                if (i10 == 1) {
                    return new C21093n(i11 == 2 ? interfaceC21056J.mo21532o(C7536a.m7853h(j10)) : interfaceC21056J.mo21531l(C7536a.m7853h(j10)), C7536a.m7849d(j10) ? C7536a.m7853h(j10) : 32767, 0);
                }
                return new C21093n(C7536a.m7850e(j10) ? C7536a.m7854i(j10) : 32767, i11 == 2 ? interfaceC21056J.mo21530b(C7536a.m7854i(j10)) : interfaceC21056J.mo21529G(C7536a.m7854i(j10)), 0);
            case 1:
                int i12 = this.f67020p0;
                int i13 = this.f67019o0;
                InterfaceC21056J interfaceC21056J2 = this.f67018Z;
                if (i12 == 1) {
                    return new C21093n(i13 == 2 ? interfaceC21056J2.mo21532o(C7536a.m7853h(j10)) : interfaceC21056J2.mo21531l(C7536a.m7853h(j10)), C7536a.m7849d(j10) ? C7536a.m7853h(j10) : 32767, 1);
                }
                return new C21093n(C7536a.m7850e(j10) ? C7536a.m7854i(j10) : 32767, i13 == 2 ? interfaceC21056J2.mo21530b(C7536a.m7854i(j10)) : interfaceC21056J2.mo21529G(C7536a.m7854i(j10)), 1);
            default:
                int i14 = this.f67020p0;
                int i15 = this.f67019o0;
                InterfaceC21056J interfaceC21056J3 = this.f67018Z;
                if (i14 == 1) {
                    return new C21093n(i15 == 2 ? interfaceC21056J3.mo21532o(C7536a.m7853h(j10)) : interfaceC21056J3.mo21531l(C7536a.m7853h(j10)), C7536a.m7849d(j10) ? C7536a.m7853h(j10) : 32767, 2);
                }
                return new C21093n(C7536a.m7850e(j10) ? C7536a.m7854i(j10) : 32767, i15 == 2 ? interfaceC21056J3.mo21530b(C7536a.m7854i(j10)) : interfaceC21056J3.mo21529G(C7536a.m7854i(j10)), 2);
        }
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: t */
    public final Object mo21534t() {
        switch (this.f67017Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f67018Z.mo21534t();
    }
}
