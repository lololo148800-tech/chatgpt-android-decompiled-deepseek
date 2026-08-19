package p003A1;

import java.util.ArrayList;
import p1140z1.InterfaceC21689e0;
import p156G1.C2961h;

/* JADX INFO: renamed from: A1.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0291t1 implements InterfaceC21689e0 {

    /* JADX INFO: renamed from: Y */
    public final int f1054Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f1055Z;

    /* JADX INFO: renamed from: o0 */
    public Float f1056o0 = null;

    /* JADX INFO: renamed from: p0 */
    public Float f1057p0 = null;

    /* JADX INFO: renamed from: q0 */
    public C2961h f1058q0 = null;

    /* JADX INFO: renamed from: r0 */
    public C2961h f1059r0 = null;

    public C0291t1(int i10, ArrayList arrayList) {
        this.f1054Y = i10;
        this.f1055Z = arrayList;
    }

    @Override // p1140z1.InterfaceC21689e0
    /* JADX INFO: renamed from: u */
    public final boolean mo874u() {
        return this.f1055Z.contains(this);
    }
}
