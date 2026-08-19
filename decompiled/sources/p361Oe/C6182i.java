package p361Oe;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Oe.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6182i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f20134Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20135Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6183j f20136o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2153Q0 f20137p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6182i(C6183j c6183j, C2153Q0 c2153q0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f20136o0 = c6183j;
        this.f20137p0 = c2153q0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6182i c6182i = new C6182i(this.f20136o0, this.f20137p0, interfaceC18770c);
        c6182i.f20135Z = obj;
        return c6182i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6182i) create((C6174a) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C2153Q0 c2153q0;
        Object value;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f20134Y;
        C6183j c6183j = this.f20136o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6174a c6174a = (C6174a) this.f20135Z;
            String str3 = c6174a.f20113a;
            if (str3 != null && (str = c6174a.f20116d) != null && (str2 = c6174a.f20115c) != null) {
                C6185l c6185l = c6183j.f20138a;
                this.f20134Y = 1;
                obj = c6185l.m6723a(str3, str2, str, 2, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            List suggestedReplies = (List) ((C21952P1) abstractC21955Q1).f69511a;
            do {
                c2153q0 = this.f20137p0;
                value = c2153q0.getValue();
                ((C6175b) value).getClass();
                AbstractC16544l.m18094g(suggestedReplies, "suggestedReplies");
            } while (!c2153q0.m3250k(value, new C6175b(suggestedReplies)));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8731f(c6183j.f20139b, "Error fetching suggestions: " + ((AbstractC21933K1) abstractC21955Q1), null, null, 6);
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
