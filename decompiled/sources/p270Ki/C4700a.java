package p270Ki;

import p1095x1.InterfaceC21098s;
import p387Pl.C6460G;
import p435Rl.AbstractC6932p;

/* JADX INFO: renamed from: Ki.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4700a extends AbstractC6932p {

    /* JADX INFO: renamed from: a */
    public InterfaceC21098s f15279a;

    /* JADX INFO: renamed from: b */
    public boolean f15280b;

    /* JADX INFO: renamed from: c */
    public C6460G f15281c;

    @Override // p435Rl.AbstractC6932p
    /* JADX INFO: renamed from: b */
    public final boolean mo5400b() {
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098s2;
        InterfaceC21098s interfaceC21098s3 = this.f15279a;
        return interfaceC21098s3 != null && interfaceC21098s3.mo21522h() && ((interfaceC21098s = this.f15279a) == null || ((int) (interfaceC21098s.mo21524k() >> 32)) != 0) && ((interfaceC21098s2 = this.f15279a) == null || ((int) (interfaceC21098s2.mo21524k() & 4294967295L)) != 0);
    }

    @Override // p435Rl.AbstractC6932p
    /* JADX INFO: renamed from: d */
    public final C6460G mo5401d() {
        InterfaceC21098s interfaceC21098s = this.f15279a;
        int iMo21524k = interfaceC21098s != null ? (int) (interfaceC21098s.mo21524k() >> 32) : 0;
        InterfaceC21098s interfaceC21098s2 = this.f15279a;
        return new C6460G(iMo21524k, interfaceC21098s2 != null ? (int) (interfaceC21098s2.mo21524k() & 4294967295L) : 0);
    }
}
