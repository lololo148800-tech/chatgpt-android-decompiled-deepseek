package p247Jj;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21329w;
import p320Mj.C5461n;
import p320Mj.C5462o;
import p342Nj.C5808b;
import p342Nj.C5809c;
import p342Nj.C5813g;
import p342Nj.InterfaceC5816j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C4452r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14491Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f14492Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4454s f14493o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4452r(C4454s c4454s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14493o0 = c4454s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4452r c4452r = new C4452r(this.f14493o0, interfaceC18770c);
        c4452r.f14492Z = obj;
        return c4452r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4452r) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8 A[Catch: SocketTimeoutException -> 0x0183, TryCatch #0 {SocketTimeoutException -> 0x0183, blocks: (B:48:0x00dd, B:50:0x00e1, B:58:0x0101, B:55:0x00f8, B:56:0x00fd), top: B:82:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139 A[Catch: SocketTimeoutException -> 0x0165, TryCatch #3 {SocketTimeoutException -> 0x0165, blocks: (B:64:0x012f, B:66:0x0139, B:71:0x0167), top: B:87:0x012f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[Catch: SocketTimeoutException -> 0x0165, TRY_LEAVE, TryCatch #3 {SocketTimeoutException -> 0x0165, blocks: (B:64:0x012f, B:66:0x0139, B:71:0x0167), top: B:87:0x012f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017f A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [Dn.j] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Exception {
        C17296C c17296c;
        InterfaceC2186j interfaceC2186j;
        Object objM5908a;
        InterfaceC2186j interfaceC2186j2;
        int iOrdinal;
        String str;
        Object objM6212e;
        InterfaceC2186j interfaceC2186j3;
        C5462o c5462o;
        C4448p c4448p;
        NextStep nextStep;
        C20048M c20048m;
        C4446o c4446o;
        C4448p c4448p2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14491Y;
        C17296C c17296c2 = C17296C.f55119a;
        ?? r6 = 1;
        C4454s c4454s = this.f14493o0;
        try {
            switch (i10) {
                case 0:
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j = (InterfaceC2186j) this.f14492Z;
                    C5813g c5813g = c4454s.f14498b;
                    C5813g c5813g2 = c4454s.f14498b;
                    String str2 = c5813g.f18968a;
                    if (str2 != null && !AbstractC21329w.m21734u(str2, "itmpl_", false)) {
                        C4446o c4446o2 = new C4446o("The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1", new InternalErrorInfo.IntegrationErrorInfo("Invalid template format: " + c5813g2.f18968a));
                        this.f14491Y = 1;
                        return interfaceC2186j.mo395a(c4446o2, this) == enumC19250a ? enumC19250a : c17296c2;
                    }
                    C5461n c5461n = c4454s.f14500d;
                    if (!c5461n.f17832c) {
                        interfaceC2186j2 = interfaceC2186j;
                        InterfaceC5816j interfaceC5816j = c4454s.f14499c;
                        C5813g c5813g3 = c4454s.f14498b;
                        String str3 = c5813g3.f18968a;
                        String str4 = c5813g3.f18969b;
                        EnumC4458u enumC4458u = c5813g3.f18971d;
                        AbstractC16544l.m18094g(enumC4458u, "<this>");
                        iOrdinal = enumC4458u.ordinal();
                        if (iOrdinal == 0) {
                            str = "production";
                        } else {
                            if (iOrdinal != 1) {
                                throw new C0644w();
                            }
                            str = "sandbox";
                        }
                        c17296c = c17296c2;
                        CreateInquiryRequest createInquiryRequest = new CreateInquiryRequest(new C5809c(new C5808b(str3, str4, str, c5813g3.f18972e, c5813g3.f18973f, c5813g3.f18974g, c5813g3.f18976i, c5813g3.f18977j, 64)));
                        this.f14492Z = interfaceC2186j2;
                        this.f14491Y = 4;
                        objM6212e = interfaceC5816j.m6212e(createInquiryRequest, this);
                        if (objM6212e == enumC19250a) {
                            return enumC19250a;
                        }
                        interfaceC2186j3 = interfaceC2186j2;
                        c20048m = (C20048M) objM6212e;
                        if (c20048m.f63525a.m18985a()) {
                            Object obj2 = c20048m.f63526b;
                            AbstractC16544l.m18091d(obj2);
                            CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) obj2;
                            c4448p2 = new C4448p(checkInquiryResponse.getData().getId(), checkInquiryResponse.getData().getAttributes().getNextStep());
                            this.f14492Z = interfaceC2186j3;
                            this.f14491Y = 5;
                            if (interfaceC2186j3.mo395a(c4448p2, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(c20048m);
                            c4446o = new C4446o(errorInfo.getMessage(), errorInfo);
                            this.f14492Z = interfaceC2186j3;
                            this.f14491Y = 6;
                            if (interfaceC2186j3.mo395a(c4446o, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                        return c17296c;
                    }
                    this.f14492Z = interfaceC2186j;
                    this.f14491Y = 2;
                    objM5908a = c5461n.m5908a(c5813g2, this);
                    if (objM5908a == enumC19250a) {
                        return enumC19250a;
                    }
                    if (((InternalErrorInfo.NetworkErrorInfo) objM5908a) == null) {
                        c5462o = c4454s.f14500d.f17833d;
                        if (c5462o != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        nextStep = (NextStep) c5462o.f17834a.get(c5462o.f17835b);
                        if (nextStep != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        c4448p = new C4448p(c5462o.f17836c, nextStep);
                        this.f14492Z = null;
                        this.f14491Y = 3;
                        if (interfaceC2186j.mo395a(c4448p, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c2;
                    }
                    interfaceC2186j2 = interfaceC2186j;
                    try {
                        InterfaceC5816j interfaceC5816j2 = c4454s.f14499c;
                        C5813g c5813g4 = c4454s.f14498b;
                        String str5 = c5813g4.f18968a;
                        String str6 = c5813g4.f18969b;
                        EnumC4458u enumC4458u2 = c5813g4.f18971d;
                        AbstractC16544l.m18094g(enumC4458u2, "<this>");
                        iOrdinal = enumC4458u2.ordinal();
                        if (iOrdinal == 0) {
                            str = "production";
                        } else {
                            if (iOrdinal != 1) {
                                throw new C0644w();
                            }
                            str = "sandbox";
                        }
                        c17296c = c17296c2;
                        try {
                            CreateInquiryRequest createInquiryRequest2 = new CreateInquiryRequest(new C5809c(new C5808b(str5, str6, str, c5813g4.f18972e, c5813g4.f18973f, c5813g4.f18974g, c5813g4.f18976i, c5813g4.f18977j, 64)));
                            this.f14492Z = interfaceC2186j2;
                            this.f14491Y = 4;
                            objM6212e = interfaceC5816j2.m6212e(createInquiryRequest2, this);
                            if (objM6212e == enumC19250a) {
                                return enumC19250a;
                            }
                            interfaceC2186j3 = interfaceC2186j2;
                            try {
                                c20048m = (C20048M) objM6212e;
                                if (c20048m.f63525a.m18985a()) {
                                    Object obj3 = c20048m.f63526b;
                                    AbstractC16544l.m18091d(obj3);
                                    CheckInquiryResponse checkInquiryResponse2 = (CheckInquiryResponse) obj3;
                                    c4448p2 = new C4448p(checkInquiryResponse2.getData().getId(), checkInquiryResponse2.getData().getAttributes().getNextStep());
                                    this.f14492Z = interfaceC2186j3;
                                    this.f14491Y = 5;
                                    if (interfaceC2186j3.mo395a(c4448p2, this) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                } else {
                                    InternalErrorInfo.NetworkErrorInfo errorInfo2 = NetworkUtilsKt.toErrorInfo(c20048m);
                                    c4446o = new C4446o(errorInfo2.getMessage(), errorInfo2);
                                    this.f14492Z = interfaceC2186j3;
                                    this.f14491Y = 6;
                                    if (interfaceC2186j3.mo395a(c4446o, this) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                }
                                return c17296c;
                            } catch (SocketTimeoutException e10) {
                                e = e10;
                                r6 = interfaceC2186j3;
                            }
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            r6 = interfaceC2186j2;
                        }
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                        c17296c = c17296c2;
                    }
                    C4446o c4446o3 = new C4446o("There was a problem reaching the server.", NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
                    this.f14492Z = null;
                    this.f14491Y = 7;
                    return r6.mo395a(c4446o3, this) == enumC19250a ? enumC19250a : c17296c;
                case 1:
                    AbstractC9233X.m9807c(obj);
                case 2:
                    interfaceC2186j = (InterfaceC2186j) this.f14492Z;
                    AbstractC9233X.m9807c(obj);
                    objM5908a = obj;
                    if (((InternalErrorInfo.NetworkErrorInfo) objM5908a) == null) {
                        c5462o = c4454s.f14500d.f17833d;
                        if (c5462o != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        nextStep = (NextStep) c5462o.f17834a.get(c5462o.f17835b);
                        if (nextStep != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        c4448p = new C4448p(c5462o.f17836c, nextStep);
                        this.f14492Z = null;
                        this.f14491Y = 3;
                        if (interfaceC2186j.mo395a(c4448p, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return c17296c2;
                    }
                    interfaceC2186j2 = interfaceC2186j;
                    InterfaceC5816j interfaceC5816j3 = c4454s.f14499c;
                    C5813g c5813g5 = c4454s.f14498b;
                    String str7 = c5813g5.f18968a;
                    String str8 = c5813g5.f18969b;
                    EnumC4458u enumC4458u3 = c5813g5.f18971d;
                    AbstractC16544l.m18094g(enumC4458u3, "<this>");
                    iOrdinal = enumC4458u3.ordinal();
                    if (iOrdinal == 0) {
                        str = "production";
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        str = "sandbox";
                    }
                    c17296c = c17296c2;
                    CreateInquiryRequest createInquiryRequest3 = new CreateInquiryRequest(new C5809c(new C5808b(str7, str8, str, c5813g5.f18972e, c5813g5.f18973f, c5813g5.f18974g, c5813g5.f18976i, c5813g5.f18977j, 64)));
                    this.f14492Z = interfaceC2186j2;
                    this.f14491Y = 4;
                    objM6212e = interfaceC5816j3.m6212e(createInquiryRequest3, this);
                    if (objM6212e == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC2186j3 = interfaceC2186j2;
                    c20048m = (C20048M) objM6212e;
                    if (c20048m.f63525a.m18985a()) {
                        Object obj4 = c20048m.f63526b;
                        AbstractC16544l.m18091d(obj4);
                        CheckInquiryResponse checkInquiryResponse3 = (CheckInquiryResponse) obj4;
                        c4448p2 = new C4448p(checkInquiryResponse3.getData().getId(), checkInquiryResponse3.getData().getAttributes().getNextStep());
                        this.f14492Z = interfaceC2186j3;
                        this.f14491Y = 5;
                        if (interfaceC2186j3.mo395a(c4448p2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        InternalErrorInfo.NetworkErrorInfo errorInfo3 = NetworkUtilsKt.toErrorInfo(c20048m);
                        c4446o = new C4446o(errorInfo3.getMessage(), errorInfo3);
                        this.f14492Z = interfaceC2186j3;
                        this.f14491Y = 6;
                        if (interfaceC2186j3.mo395a(c4446o, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    return c17296c;
                case 3:
                    AbstractC9233X.m9807c(obj);
                    return c17296c2;
                case 4:
                    InterfaceC2186j interfaceC2186j4 = (InterfaceC2186j) this.f14492Z;
                    AbstractC9233X.m9807c(obj);
                    objM6212e = obj;
                    c17296c = c17296c2;
                    interfaceC2186j3 = interfaceC2186j4;
                    c20048m = (C20048M) objM6212e;
                    if (c20048m.f63525a.m18985a()) {
                        Object obj5 = c20048m.f63526b;
                        AbstractC16544l.m18091d(obj5);
                        CheckInquiryResponse checkInquiryResponse4 = (CheckInquiryResponse) obj5;
                        c4448p2 = new C4448p(checkInquiryResponse4.getData().getId(), checkInquiryResponse4.getData().getAttributes().getNextStep());
                        this.f14492Z = interfaceC2186j3;
                        this.f14491Y = 5;
                        if (interfaceC2186j3.mo395a(c4448p2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        InternalErrorInfo.NetworkErrorInfo errorInfo4 = NetworkUtilsKt.toErrorInfo(c20048m);
                        c4446o = new C4446o(errorInfo4.getMessage(), errorInfo4);
                        this.f14492Z = interfaceC2186j3;
                        this.f14491Y = 6;
                        if (interfaceC2186j3.mo395a(c4446o, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    return c17296c;
                case 5:
                    AbstractC9233X.m9807c(obj);
                    return c17296c2;
                case 6:
                    AbstractC9233X.m9807c(obj);
                    return c17296c2;
                case 7:
                    AbstractC9233X.m9807c(obj);
                    return c17296c2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (SocketTimeoutException e13) {
            e = e13;
            c17296c = c17296c2;
        }
    }
}
