package p080D0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20740b0;
import p1095x1.InterfaceC21098s;
import p737f1.EnumC13525q;
import p759g1.C13800b;
import p978r1.C18856b;

/* JADX INFO: renamed from: D0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1842z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5336Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1803f0 f5337Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1842z(C1803f0 c1803f0, int i10) {
        super(1);
        this.f5336Y = i10;
        this.f5337Z = c1803f0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C1822p c1822p;
        C1822p c1822p2;
        boolean z6;
        switch (this.f5336Y) {
            case 0:
                return new C0251g0(this.f5337Z, 1);
            case 1:
                long jLongValue = ((Number) obj).longValue();
                C1803f0 c1803f0 = this.f5337Z;
                if (c1803f0.f5178a.m2648a().m14708a(jLongValue)) {
                    c1803f0.m2602n();
                    c1803f0.m2604p();
                }
                return C17296C.f55119a;
            case 2:
                long jLongValue2 = ((Number) obj).longValue();
                C1803f0 c1803f1 = this.f5337Z;
                if (c1803f1.f5178a.m2648a().m14708a(jLongValue2)) {
                    c1803f1.m2597i();
                    c1803f1.m2601m(null);
                }
                return C17296C.f55119a;
            case 3:
                long jLongValue3 = ((Number) obj).longValue();
                C1803f0 c1803f2 = this.f5337Z;
                C1824q c1824qM2593e = c1803f2.m2593e();
                if (c1824qM2593e != null && (c1822p2 = c1824qM2593e.f5257a) != null && jLongValue3 == c1822p2.f5255c) {
                    c1803f2.f5191n.setValue(null);
                }
                C1824q c1824qM2593e2 = c1803f2.m2593e();
                if (c1824qM2593e2 != null && (c1822p = c1824qM2593e2.f5258b) != null && jLongValue3 == c1822p.f5255c) {
                    c1803f2.f5192o.setValue(null);
                }
                if (c1803f2.f5178a.m2648a().m14708a(jLongValue3)) {
                    c1803f2.m2604p();
                }
                return C17296C.f55119a;
            case 4:
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) obj;
                C1803f0 c1803f3 = this.f5337Z;
                c1803f3.f5188k = interfaceC21098s;
                if (c1803f3.m2592d() && c1803f3.m2593e() != null) {
                    C13800b c13800b = interfaceC21098s != null ? new C13800b(interfaceC21098s.mo21520d(0L)) : null;
                    if (!AbstractC16544l.m18089b(c1803f3.f5187j, c13800b)) {
                        c1803f3.f5187j = c13800b;
                        c1803f3.m2602n();
                        c1803f3.m2604p();
                    }
                }
                return C17296C.f55119a;
            case 5:
                EnumC13525q enumC13525q = (EnumC13525q) obj;
                boolean zM15074a = enumC13525q.m15074a();
                C1803f0 c1803f4 = this.f5337Z;
                if (!zM15074a && c1803f4.m2592d()) {
                    c1803f4.m2597i();
                }
                c1803f4.f5186i.setValue(Boolean.valueOf(enumC13525q.m15074a()));
                return C17296C.f55119a;
            case 6:
                this.f5337Z.m2600l(((Boolean) obj).booleanValue());
                return C17296C.f55119a;
            case 7:
                if (AbstractC20740b0.f65746a.mo10666e(((C18856b) obj).f60081a) == 17) {
                    this.f5337Z.m2590b();
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                this.f5337Z.m2601m((C1824q) obj);
                return C17296C.f55119a;
        }
    }
}
