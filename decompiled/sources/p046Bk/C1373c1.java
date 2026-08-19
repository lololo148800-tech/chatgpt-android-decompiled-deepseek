package p046Bk;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p689ui.network.Metadata;
import com.withpersona.sdk2.inquiry.p689ui.network.OneTimeLinkCodeResponse;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p100Dk.InterfaceC2094u;
import p1027tp.C20048M;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.InterfaceC2186j;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p385Pj.C6428c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bk.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1373c1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f3641Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f3642Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1376d1 f3643o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373c1(C1376d1 c1376d1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3643o0 = c1376d1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1373c1 c1373c1 = new C1373c1(this.f3643o0, interfaceC18770c);
        c1373c1.f3642Z = obj;
        return c1373c1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1373c1) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00de A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [Dn.j] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Dn.j] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Dn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C20048M c20048m;
        OneTimeLinkCodeResponse oneTimeLinkCodeResponse;
        String str;
        C1451e c1451e;
        C1370b1 c1370b1;
        C1364Z0 c1364z0;
        Metadata metadata;
        C1364Z0 c1364z1;
        ?? r6;
        C2146N c2146n;
        ?? r10;
        C1362Y0 c1362y0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r11 = this.f3641Y;
        C17296C c17296c = C17296C.f55119a;
        C1376d1 c1376d1 = this.f3643o0;
        try {
            switch (r11) {
                case 0:
                    AbstractC9233X.m9807c(obj);
                    InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f3642Z;
                    InterfaceC2094u interfaceC2094u = c1376d1.f3659c;
                    String str2 = c1376d1.f3661e;
                    String str3 = c1376d1.f3660d;
                    this.f3642Z = interfaceC2186j;
                    this.f3641Y = 1;
                    obj = interfaceC2094u.m3178a(str2, str3, this);
                    r11 = interfaceC2186j;
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    c20048m = (C20048M) obj;
                    if (!c20048m.f63525a.m18985a()) {
                        c1364z1 = new C1364Z0(NetworkUtilsKt.toErrorInfo(c20048m));
                        this.f3642Z = null;
                        this.f3641Y = 3;
                        if (r11.mo395a(c1364z1, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c;
                    }
                    oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) c20048m.f63526b;
                    if (oneTimeLinkCodeResponse != null || (metadata = oneTimeLinkCodeResponse.f41031a) == null) {
                        str = null;
                    } else {
                        str = metadata.f41028a;
                    }
                    if (str == null) {
                        c1364z0 = new C1364Z0(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                        this.f3642Z = null;
                        this.f3641Y = 4;
                        if (r11.mo395a(c1364z0, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c;
                    }
                    C3516e c3516e = AbstractC0593T.f1824a;
                    c1451e = AbstractC2935m.f8797a;
                    c1370b1 = new C1370b1(c1376d1, str, null);
                    this.f3642Z = r11;
                    this.f3641Y = 5;
                    if (AbstractC0575H.m1168P(c1451e, c1370b1, this) == enumC19250a) {
                        r6 = r11;
                        return enumC19250a;
                    }
                    r6 = r11;
                    c2146n = new C2146N(new C6428c(), 1);
                    this.f3642Z = r6;
                    this.f3641Y = 6;
                    if (AbstractC2124C.m3200D(c2146n, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    r10 = r6;
                    c1362y0 = C1362Y0.f3610a;
                    this.f3642Z = null;
                    this.f3641Y = 7;
                    if (r10.mo395a(c1362y0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                case 1:
                    InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f3642Z;
                    AbstractC9233X.m9807c(obj);
                    r11 = interfaceC2186j2;
                    c20048m = (C20048M) obj;
                    if (!c20048m.f63525a.m18985a()) {
                        c1364z1 = new C1364Z0(NetworkUtilsKt.toErrorInfo(c20048m));
                        this.f3642Z = null;
                        this.f3641Y = 3;
                        if (r11.mo395a(c1364z1, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c;
                    }
                    oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) c20048m.f63526b;
                    if (oneTimeLinkCodeResponse != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        c1364z0 = new C1364Z0(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                        this.f3642Z = null;
                        this.f3641Y = 4;
                        if (r11.mo395a(c1364z0, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c;
                    }
                    C3516e c3516e2 = AbstractC0593T.f1824a;
                    c1451e = AbstractC2935m.f8797a;
                    c1370b1 = new C1370b1(c1376d1, str, null);
                    this.f3642Z = r11;
                    this.f3641Y = 5;
                    if (AbstractC0575H.m1168P(c1451e, c1370b1, this) == enumC19250a) {
                        r6 = r11;
                        return enumC19250a;
                    }
                    r6 = r11;
                    c2146n = new C2146N(new C6428c(), 1);
                    this.f3642Z = r6;
                    this.f3641Y = 6;
                    if (AbstractC2124C.m3200D(c2146n, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    r10 = r6;
                    c1362y0 = C1362Y0.f3610a;
                    this.f3642Z = null;
                    this.f3641Y = 7;
                    if (r10.mo395a(c1362y0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                case 2:
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                case 3:
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                case 4:
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                case 5:
                    InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f3642Z;
                    AbstractC9233X.m9807c(obj);
                    r6 = interfaceC2186j3;
                    r6 = r11;
                    c2146n = new C2146N(new C6428c(), 1);
                    this.f3642Z = r6;
                    this.f3641Y = 6;
                    if (AbstractC2124C.m3200D(c2146n, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    r10 = r6;
                    c1362y0 = C1362Y0.f3610a;
                    this.f3642Z = null;
                    this.f3641Y = 7;
                    if (r10.mo395a(c1362y0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                case 6:
                    InterfaceC2186j interfaceC2186j4 = (InterfaceC2186j) this.f3642Z;
                    AbstractC9233X.m9807c(obj);
                    r10 = interfaceC2186j4;
                    c1362y0 = C1362Y0.f3610a;
                    this.f3642Z = null;
                    this.f3641Y = 7;
                    if (r10.mo395a(c1362y0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                case 7:
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
            C1364Z0 c1364z2 = new C1364Z0(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
            this.f3642Z = null;
            this.f3641Y = 2;
            if (r11.mo395a(c1364z2, this) == enumC19250a) {
                return enumC19250a;
            }
        }
    }
}
