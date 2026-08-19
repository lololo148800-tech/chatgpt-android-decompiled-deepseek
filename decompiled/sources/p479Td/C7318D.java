package p479Td;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p464So.C7164a;
import p503Ud.C7630c;
import p513Uo.C7726b;
import p526Vd.C8261c;
import p526Vd.C8263e;
import p607Yo.C10114c;
import p607Yo.C10119h;
import p712dp.C13187c;
import p756fp.InterfaceC13720b;
import p909nm.AbstractC17681o;
import p960q9.C18655i;

/* JADX INFO: renamed from: Td.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7318D {
    /* JADX INFO: renamed from: a */
    public static final C13187c m7775a(C7318D c7318d) {
        final int i10 = 1;
        final int i11 = 0;
        c7318d.getClass();
        C13187c c13187c = new C13187c(0);
        InterfaceC13720b interfaceC13720b = new InterfaceC13720b() { // from class: Td.C
            @Override // p756fp.InterfaceC13720b
            /* JADX INFO: renamed from: a */
            public final C10114c mo7774a(C10119h c10119h, C18655i c18655i) {
                C10114c c10114c;
                switch (i11) {
                    case 0:
                        CharSequence charSequence = c10119h.f29969a.f41860a;
                        AbstractC16544l.m18093f(charSequence, "getContent(...)");
                        if (AbstractC21322p.m21699g0(charSequence, "\\[")) {
                            c10114c = new C10114c(new C8263e());
                            c10114c.f29944b = 2;
                        } else {
                            if (!AbstractC21322p.m21699g0(charSequence, "$$")) {
                                return null;
                            }
                            c10114c = new C10114c(new C8263e());
                            c10114c.f29944b = 2;
                        }
                        return c10114c;
                    default:
                        CharSequence charSequence2 = c10119h.f29969a.f41860a;
                        AbstractC16544l.m18093f(charSequence2, "getContent(...)");
                        boolean zM21699g0 = AbstractC21322p.m21699g0(charSequence2, ":::");
                        if (zM21699g0) {
                            C10114c c10114c2 = new C10114c(new C7630c());
                            c10114c2.f29944b = 3;
                            return c10114c2;
                        }
                        if (zM21699g0) {
                            throw new C0644w();
                        }
                        return null;
                }
            }
        };
        ArrayList arrayList = c13187c.f41845c;
        arrayList.add(interfaceC13720b);
        arrayList.add(new InterfaceC13720b() { // from class: Td.C
            @Override // p756fp.InterfaceC13720b
            /* JADX INFO: renamed from: a */
            public final C10114c mo7774a(C10119h c10119h, C18655i c18655i) {
                C10114c c10114c;
                switch (i10) {
                    case 0:
                        CharSequence charSequence = c10119h.f29969a.f41860a;
                        AbstractC16544l.m18093f(charSequence, "getContent(...)");
                        if (AbstractC21322p.m21699g0(charSequence, "\\[")) {
                            c10114c = new C10114c(new C8263e());
                            c10114c.f29944b = 2;
                        } else {
                            if (!AbstractC21322p.m21699g0(charSequence, "$$")) {
                                return null;
                            }
                            c10114c = new C10114c(new C8263e());
                            c10114c.f29944b = 2;
                        }
                        return c10114c;
                    default:
                        CharSequence charSequence2 = c10119h.f29969a.f41860a;
                        AbstractC16544l.m18093f(charSequence2, "getContent(...)");
                        boolean zM21699g0 = AbstractC21322p.m21699g0(charSequence2, ":::");
                        if (zM21699g0) {
                            C10114c c10114c2 = new C10114c(new C7630c());
                            c10114c2.f29944b = 3;
                            return c10114c2;
                        }
                        if (zM21699g0) {
                            throw new C0644w();
                        }
                        return null;
                }
            }
        });
        ((ArrayList) c13187c.f41847e).add(new C8261c());
        c13187c.m14843e(AbstractC17681o.m19382k(new C7726b(i10), new C7726b(i11), new C7164a()));
        return c13187c;
    }

    public final KSerializer serializer() {
        return C7316B.f23213a;
    }
}
