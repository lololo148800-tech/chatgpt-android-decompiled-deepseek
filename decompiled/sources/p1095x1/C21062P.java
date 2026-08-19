package p1095x1;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1140z1.AbstractC21690f;

/* JADX INFO: renamed from: x1.P */
/* JADX INFO: loaded from: classes.dex */
public final class C21062P implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21061O f66975a;

    public C21062P(InterfaceC21061O interfaceC21061O) {
        this.f66975a = interfaceC21061O;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return this.f66975a.mo4650a(interfaceC21095p, AbstractC21690f.m22207l(interfaceC21095p), i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return this.f66975a.mo4651b(interfaceC21095p, AbstractC21690f.m22207l(interfaceC21095p), i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        return this.f66975a.mo4652c(interfaceC21059M, AbstractC21690f.m22207l(interfaceC21059M), j10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return this.f66975a.mo4653d(interfaceC21095p, AbstractC21690f.m22207l(interfaceC21095p), i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return this.f66975a.mo4654e(interfaceC21095p, AbstractC21690f.m22207l(interfaceC21095p), i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21062P) && AbstractC16544l.m18089b(this.f66975a, ((C21062P) obj).f66975a);
    }

    public final int hashCode() {
        return this.f66975a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f66975a + ')';
    }
}
