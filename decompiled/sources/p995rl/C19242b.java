package p995rl;

import bo.AbstractC11516d;
import bo.EnumC11514b;
import co.C11802C;
import co.C11803D;
import co.C11826p;
import co.C11827q;
import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p023Al.C0556b;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p030B2.C0740V;
import p049Bm.InterfaceC1439n;
import p1009s9.C19506i;
import p1091wn.AbstractC21031l;
import p1111xl.C21296a;
import p295Lj.AbstractC5103c;
import p523V9.AbstractC8146n0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19242b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC15088n f61002Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21296a f61003Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11516d f61004o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19242b(InterfaceC15088n interfaceC15088n, C21296a c21296a, AbstractC11516d abstractC11516d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61002Y = interfaceC15088n;
        this.f61003Z = c21296a;
        this.f61004o0 = abstractC11516d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19242b(this.f61002Y, this.f61003Z, this.f61004o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19242b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC11514b enumC11514b;
        Object c11827q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC15088n interfaceC15088n = this.f61002Y;
        AbstractC16544l.m18094g(interfaceC15088n, "<this>");
        C0556b c0556b = new C0556b(interfaceC15088n, 0);
        C21296a c21296aM8684a = AbstractC8146n0.m8684a(this.f61003Z);
        AbstractC11516d abstractC11516d = this.f61004o0;
        KSerializer kSerializerM5671g = AbstractC5103c.m5671g(abstractC11516d.f34844b, c21296aM8684a);
        EnumC11514b enumC11514b2 = EnumC11514b.f34839Y;
        C19506i c19506i = new C19506i(c0556b);
        char[] cArr = new char[16384];
        C11802C c11802c = !abstractC11516d.f34843a.f34884p ? new C11802C(c19506i, cArr) : new C11803D(c19506i, cArr);
        if (c11802c.mo6939y() == 8) {
            c11802c.m6923g((byte) 8);
            enumC11514b = EnumC11514b.f34840Z;
        } else {
            enumC11514b = EnumC11514b.f34839Y;
        }
        int iOrdinal = enumC11514b.ordinal();
        if (iOrdinal == 0) {
            c11827q = new C11827q(abstractC11516d, c11802c, kSerializerM5671g);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            c11827q = new C11826p(abstractC11516d, c11802c, kSerializerM5671g);
        }
        return AbstractC21031l.m21484h(new C0740V(c11827q, 1));
    }
}
