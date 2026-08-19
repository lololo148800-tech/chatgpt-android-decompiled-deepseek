package p437Rn;

import kotlin.jvm.internal.AbstractC16544l;
import p081D1.C1844a;
import p153Fn.C2942t;
import p165G9.C3024j;
import p369On.C6272a;
import p389Pn.C6534s;

/* JADX INFO: renamed from: Rn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6944b extends AbstractC6946d {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f22232c = 1;

    /* JADX INFO: renamed from: d */
    public final Object f22233d;

    public C6944b(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.f22233d = str;
    }

    @Override // p437Rn.AbstractC6946d
    /* JADX INFO: renamed from: a */
    public final InterfaceC6948f mo7328a(InterfaceC6945c interfaceC6945c, String input, int i10, int i11) {
        switch (this.f22232c) {
            case 0:
                AbstractC16544l.m18094g(input, "input");
                String string = input.subSequence(i10, i11).toString();
                String str = (String) this.f22233d;
                if (AbstractC16544l.m18089b(string, str)) {
                    return null;
                }
                return new C2942t(str, 1);
            default:
                AbstractC16544l.m18094g(input, "input");
                int i12 = i11 - i10;
                if (i12 < 1) {
                    return new C3024j(1, 1);
                }
                if (i12 > 9) {
                    return new C3024j(9, 2);
                }
                int iCharAt = 0;
                while (i10 < i11) {
                    iCharAt = (iCharAt * 10) + (input.charAt(i10) - '0');
                    i10++;
                }
                Object objMo7094d = ((C6534s) this.f22233d).mo7094d(interfaceC6945c, new C6272a(iCharAt, i12));
                if (objMo7094d == null) {
                    return null;
                }
                return new C1844a(objMo7094d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6944b(C6534s setter, String name) {
        super(null, name);
        AbstractC16544l.m18094g(setter, "setter");
        AbstractC16544l.m18094g(name, "name");
        this.f22233d = setter;
    }
}
