package pl;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p1111xl.C21296a;
import p571X9.AbstractC9233X;
import p971ql.C18761b;
import p971ql.C18767h;
import p972qm.InterfaceC18770c;
import p995rl.C19249i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: pl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18508c implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58979Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f58980Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Charset f58981o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21296a f58982p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC15088n f58983q0;

    public /* synthetic */ C18508c(InterfaceC2186j interfaceC2186j, Charset charset, C21296a c21296a, InterfaceC15088n interfaceC15088n, int i10) {
        this.f58979Y = i10;
        this.f58980Z = interfaceC2186j;
        this.f58981o0 = charset;
        this.f58982p0 = c21296a;
        this.f58983q0 = interfaceC15088n;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C18507b c18507b;
        InterfaceC2186j interfaceC2186j;
        C18761b c18761b;
        InterfaceC2186j interfaceC2186j2;
        switch (this.f58979Y) {
            case 0:
                if (interfaceC18770c instanceof C18507b) {
                    c18507b = (C18507b) interfaceC18770c;
                    int i10 = c18507b.f58976Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c18507b.f58976Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c18507b = new C18507b(this, interfaceC18770c);
                    }
                } else {
                    c18507b = new C18507b(this, interfaceC18770c);
                }
                Object obj2 = c18507b.f58975Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c18507b.f58976Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC2186j = c18507b.f58977o0;
                        AbstractC9233X.m9807c(obj2);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj2);
                InterfaceC2186j interfaceC2186j3 = this.f58980Z;
                c18507b.f58977o0 = interfaceC2186j3;
                c18507b.f58976Z = 1;
                Object objM20047a = ((C18767h) obj).m20047a(this.f58981o0, this.f58982p0, this.f58983q0, c18507b);
                if (objM20047a == enumC19250a) {
                    return enumC19250a;
                }
                obj2 = objM20047a;
                interfaceC2186j = interfaceC2186j3;
                c18507b.f58977o0 = null;
                c18507b.f58976Z = 2;
                if (interfaceC2186j.mo395a(obj2, c18507b) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C18761b) {
                    c18761b = (C18761b) interfaceC18770c;
                    int i12 = c18761b.f59652Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c18761b.f59652Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c18761b = new C18761b(this, interfaceC18770c);
                    }
                } else {
                    c18761b = new C18761b(this, interfaceC18770c);
                }
                Object obj3 = c18761b.f59651Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c18761b.f59652Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        interfaceC2186j2 = c18761b.f59653o0;
                        AbstractC9233X.m9807c(obj3);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj3);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj3);
                InterfaceC2186j interfaceC2186j4 = this.f58980Z;
                c18761b.f59653o0 = interfaceC2186j4;
                c18761b.f59652Z = 1;
                Object objM20331b = ((C19249i) obj).m20331b(this.f58981o0, this.f58982p0, this.f58983q0, c18761b);
                if (objM20331b == enumC19250a2) {
                    return enumC19250a2;
                }
                obj3 = objM20331b;
                interfaceC2186j2 = interfaceC2186j4;
                c18761b.f59653o0 = null;
                c18761b.f59652Z = 2;
                if (interfaceC2186j2.mo395a(obj3, c18761b) == enumC19250a2) {
                    return enumC19250a2;
                }
                return C17296C.f55119a;
        }
    }
}
