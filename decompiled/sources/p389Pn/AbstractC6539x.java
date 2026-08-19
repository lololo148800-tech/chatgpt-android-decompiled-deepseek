package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.C0292u;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p571X9.AbstractC9333n3;

/* JADX INFO: renamed from: Pn.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6539x implements InterfaceC6526k {

    /* JADX INFO: renamed from: a */
    public final C6538w f21163a;

    /* JADX INFO: renamed from: b */
    public final int f21164b;

    /* JADX INFO: renamed from: c */
    public final Integer f21165c;

    /* JADX INFO: renamed from: d */
    public final int f21166d;

    public AbstractC6539x(C6538w field, int i10, Integer num) {
        AbstractC16544l.m18094g(field, "field");
        this.f21163a = field;
        this.f21164b = i10;
        this.f21165c = num;
        int i11 = field.f21162g;
        this.f21166d = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "The minimum number of digits (", ") is negative").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i11 + ") is less than the minimum number of digits (" + i10 + ')').toString());
        }
        if (num == null || num.intValue() > i10) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i10 + ')').toString());
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo6320a() {
        new C0292u(1, this.f21163a.f21156a, C6534s.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 22);
        int i10 = this.f21164b;
        C6760a c6760a = new C6760a();
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "The minimum number of digits (", ") is negative").toString());
        }
        if (i10 <= 9) {
            return this.f21165c != null ? new C6760a() : c6760a;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: b */
    public final C6960r mo6321b() {
        Integer numValueOf = Integer.valueOf(this.f21164b);
        Integer numValueOf2 = Integer.valueOf(this.f21166d);
        C6538w c6538w = this.f21163a;
        return AbstractC9333n3.m9930a(numValueOf, numValueOf2, this.f21165c, c6538w.f21156a, c6538w.f21159d, false);
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC6516a mo6322c() {
        return this.f21163a;
    }
}
