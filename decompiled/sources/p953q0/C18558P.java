package p953q0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21083f0;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: q0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C18558P implements InterfaceC21059M {

    /* JADX INFO: renamed from: Y */
    public final C18553K f59127Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21083f0 f59128Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC18554L f59129o0;

    /* JADX INFO: renamed from: p0 */
    public final HashMap f59130p0 = new HashMap();

    public C18558P(C18553K c18553k, InterfaceC21083f0 interfaceC21083f0) {
        this.f59127Y = c18553k;
        this.f59128Z = interfaceC21083f0;
        this.f59129o0 = (InterfaceC18554L) c18553k.f59118b.invoke();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return this.f59128Z.mo7859F(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return this.f59128Z.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return this.f59128Z.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return this.f59128Z.mo7862P(f10);
    }

    @Override // p1095x1.InterfaceC21059M
    /* JADX INFO: renamed from: R */
    public final InterfaceC21058L mo19936R(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        return this.f59128Z.mo19936R(i10, i11, map, interfaceC1436k);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f59128Z.mo7863X();
    }

    @Override // p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public final boolean mo19937Z() {
        return this.f59128Z.mo19937Z();
    }

    /* JADX INFO: renamed from: a */
    public final List m19938a(int i10, long j10) {
        HashMap map = this.f59130p0;
        List list = (List) map.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        InterfaceC18554L interfaceC18554L = this.f59129o0;
        Object objMo5912c = interfaceC18554L.mo5912c(i10);
        List listMo21503m0 = this.f59128Z.mo21503m0(objMo5912c, this.f59127Y.m19933a(objMo5912c, i10, interfaceC18554L.mo5913d(i10)));
        int size = listMo21503m0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((InterfaceC21056J) listMo21503m0.get(i11)).mo21533p(j10));
        }
        map.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return this.f59128Z.mo7864b0(f10);
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f59128Z.getDensity();
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f59128Z.getLayoutDirection();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return this.f59128Z.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        return this.f59128Z.mo7866k0(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        return this.f59128Z.mo7867r0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        return this.f59128Z.mo7868s(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        return this.f59128Z.mo7869t0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        return this.f59128Z.mo7870w(j10);
    }
}
