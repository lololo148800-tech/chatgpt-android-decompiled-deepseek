package p437Rn;

import kotlin.jvm.internal.AbstractC16544l;
import p081D1.C1844a;
import p165G9.C3024j;
import p200Hm.C3508g;

/* JADX INFO: renamed from: Rn.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C6968z extends AbstractC6946d {

    /* JADX INFO: renamed from: c */
    public final Integer f22277c;

    /* JADX INFO: renamed from: d */
    public final Integer f22278d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6943a f22279e;

    /* JADX INFO: renamed from: f */
    public final boolean f22280f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6968z(Integer num, Integer num2, InterfaceC6943a setter, String name, boolean z6) {
        AbstractC16544l.m18094g(setter, "setter");
        AbstractC16544l.m18094g(name, "name");
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, name);
        this.f22277c = num;
        this.f22278d = num2;
        this.f22279e = setter;
        this.f22280f = z6;
        if (num3 == null || new C3508g(1, 9, 1).m4200j(num3.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + name + ": " + num3).toString());
    }

    @Override // p437Rn.AbstractC6946d
    /* JADX INFO: renamed from: a */
    public final InterfaceC6948f mo7328a(InterfaceC6945c interfaceC6945c, String input, int i10, int i11) {
        Integer numValueOf;
        AbstractC16544l.m18094g(input, "input");
        Integer num = this.f22278d;
        if (num != null && i11 - i10 > num.intValue()) {
            return new C3024j(num.intValue(), 2);
        }
        Integer num2 = this.f22277c;
        if (num2 != null && i11 - i10 < num2.intValue()) {
            return new C3024j(num2.intValue(), 1);
        }
        int iCharAt = 0;
        while (true) {
            if (i10 >= i11) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (input.charAt(i10) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i10++;
        }
        if (numValueOf == null) {
            return C6947e.f22236Y;
        }
        boolean z6 = this.f22280f;
        int iIntValue = numValueOf.intValue();
        if (z6) {
            iIntValue = -iIntValue;
        }
        Object objMo7094d = this.f22279e.mo7094d(interfaceC6945c, Integer.valueOf(iIntValue));
        if (objMo7094d == null) {
            return null;
        }
        return new C1844a(objMo7094d);
    }
}
