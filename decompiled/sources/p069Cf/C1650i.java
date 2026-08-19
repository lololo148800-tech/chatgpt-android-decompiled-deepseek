package p069Cf;

import com.segment.analytics.kotlin.core.Settings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p207I4.InterfaceC3618e;
import p326N.C5568j;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p554Wi.InterfaceC8882i;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p658b5.C11242m;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p810ig.AbstractC14993l;
import p909nm.AbstractC17680n;
import p936p0.C18280t;
import p953q0.AbstractC18567Z;
import p953q0.C18564W;
import p953q0.C18566Y;
import p953q0.C18585i0;

/* JADX INFO: renamed from: Cf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1650i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4672Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f4673Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f4674o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1650i(int i10, Collection collection) {
        super(1);
        this.f4672Y = 2;
        this.f4673Z = i10;
        this.f4674o0 = collection;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f4672Y) {
            case 0:
                long j10 = ((C7545j) obj).f23903a;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f4674o0;
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0((List) interfaceC5985X.getValue());
                arrayListM19323D0.set(this.f4673Z, Integer.valueOf((int) (j10 >> 32)));
                interfaceC5985X.setValue(arrayListM19323D0);
                return C17296C.f55119a;
            case 1:
                InterfaceC8882i it = (InterfaceC8882i) obj;
                AbstractC16544l.m18094g(it, "it");
                it.mo7803b((Settings) this.f4674o0, this.f4673Z);
                return C17296C.f55119a;
            case 2:
                return Boolean.valueOf(((List) obj).addAll(this.f4673Z, (Collection) this.f4674o0));
            case 3:
                Boolean boolM15030C = AbstractC13512d.m15030C((C13526r) obj, this.f4673Z);
                ((C16525B) this.f4674o0).f51262Y = boolM15030C;
                return Boolean.valueOf(boolM15030C != null ? boolM15030C.booleanValue() : false);
            case 4:
                String value = (String) obj;
                AbstractC16544l.m18094g(value, "value");
                ((InterfaceC1436k) this.f4674o0).invoke(AbstractC21322p.m21709q0(this.f4673Z, AbstractC14993l.m16133d(value)));
                return C17296C.f55119a;
            case 5:
                InterfaceC3618e it2 = (InterfaceC3618e) obj;
                AbstractC16544l.m18094g(it2, "it");
                int i10 = this.f4673Z;
                String str = (String) this.f4674o0;
                int i11 = i10 + 1;
                if (str == null) {
                    it2.mo3426s0(i11);
                } else {
                    it2.mo3422c(i11, str);
                }
                return C17296C.f55119a;
            default:
                C18564W c18564w = (C18564W) obj;
                C5568j c5568j = ((C18280t) this.f4674o0).f58345a;
                AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
                AbstractC9567s.m10112h(abstractC9556hM10108d, AbstractC9567s.m10109e(abstractC9556hM10108d), abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null);
                for (int i12 = 0; i12 < c5568j.f18060a; i12++) {
                    int i13 = this.f4673Z + i12;
                    c18564w.getClass();
                    long j11 = AbstractC18567Z.f59148a;
                    C18566Y c18566y = c18564w.f59143b;
                    C11242m c11242m = c18566y.f59147d;
                    if (c11242m != null) {
                        c18564w.f59142a.add(new C18585i0(c11242m, i13, j11, c18566y.f59146c));
                    }
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1650i(Object obj, int i10, int i11) {
        super(1);
        this.f4672Y = i11;
        this.f4674o0 = obj;
        this.f4673Z = i10;
    }
}
