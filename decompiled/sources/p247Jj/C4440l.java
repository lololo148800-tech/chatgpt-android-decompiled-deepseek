package p247Jj;

import android.content.SharedPreferences;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import lk.EnumC17058a;
import lk.EnumC17061d;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p320Mj.C5462o;
import p342Nj.EnumC5810d;
import p342Nj.EnumC5811e;
import p571X9.AbstractC9233X;
import p814ik.C15033e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C4440l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14455Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f14456Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4442m f14457o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4440l(C4442m c4442m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14457o0 = c4442m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4440l c4440l = new C4440l(this.f14457o0, interfaceC18770c);
        c4440l.f14456Z = obj;
        return c4440l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4440l) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        C20048M c20048m;
        C4434i c4434i;
        String strM19012f;
        C4436j c4436j;
        EnumC5810d enumC5810d;
        EnumC17058a enumC17058a;
        EnumC5811e enumC5811e;
        EnumC17061d enumC17061d;
        int i10;
        int i11;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = this.f14455Y;
        C17296C c17296c = C17296C.f55119a;
        C4442m c4442m = this.f14457o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = (InterfaceC2186j) this.f14456Z;
            C5462o c5462o = c4442m.f14461e.f17833d;
            if (c5462o != null) {
                C4436j c4436j2 = new C4436j(c5462o.f17837d, C17062e.f54533o0);
                this.f14455Y = 1;
                return interfaceC2186j.mo395a(c4436j2, this) == enumC19250a ? enumC19250a : c17296c;
            }
            String inquiryId = c4442m.f14458b;
            AbstractC16544l.m18094g(inquiryId, "inquiryId");
            CreateInquirySessionRequest createInquirySessionRequest = new CreateInquirySessionRequest(new CreateInquirySessionRequest.Data(null, 1, null), new CreateInquirySessionRequest.Meta(inquiryId));
            C15033e c15033e = c4442m.f14460d;
            String string = c15033e.f46732c;
            if (string == null) {
                string = ((SharedPreferences) c15033e.f46731b.getValue()).getString("DEVICE_ID", null);
            }
            this.f14456Z = interfaceC2186j;
            this.f14455Y = 2;
            obj = c4442m.f14459c.m6209b(createInquirySessionRequest, string, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c20048m = (C20048M) obj;
            if (c20048m.f63525a.m18985a()) {
                strM19012f = c20048m.f63525a.f55178r0.m19012f("persona-device-id");
                if (strM19012f != null) {
                    c4442m.f14460d.m16161a(strM19012f);
                }
                Object obj2 = c20048m.f63526b;
                AbstractC16544l.m18091d(obj2);
                CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) obj2;
                String strConcat = "Bearer ".concat(createInquirySessionResponse.f40806b.f40811a);
                CreateInquirySessionResponse.Attributes attributes = createInquirySessionResponse.f40805a.f40810b;
                enumC5810d = attributes.f40807a;
                if (enumC5810d != null) {
                    i11 = AbstractC4444n.f14468a[enumC5810d.ordinal()];
                    if (i11 != 1) {
                        enumC17058a = EnumC17058a.f54521Y;
                    } else if (i11 != 2) {
                        enumC17058a = EnumC17058a.f54522Z;
                    } else {
                        if (i11 == 3) {
                            throw new C0644w();
                        }
                        enumC17058a = EnumC17058a.f54523o0;
                    }
                } else {
                    enumC17058a = EnumC17058a.f54523o0;
                }
                enumC5811e = attributes.f40808b;
                enumC17061d = enumC5811e == null ? EnumC17061d.f54531Z : EnumC17061d.f54531Z;
                c4436j = new C4436j(strConcat, new C17062e(enumC17058a, enumC17061d));
                this.f14456Z = null;
                this.f14455Y = 3;
                if (interfaceC2186j.mo395a(c4436j, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                c4434i = new C4434i(NetworkUtilsKt.toErrorInfo(c20048m));
                this.f14456Z = null;
                this.f14455Y = 4;
                if (interfaceC2186j.mo395a(c4434i, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i12 == 1) {
                AbstractC9233X.m9807c(obj);
            }
            if (i12 == 2) {
                interfaceC2186j = (InterfaceC2186j) this.f14456Z;
                AbstractC9233X.m9807c(obj);
                c20048m = (C20048M) obj;
                if (c20048m.f63525a.m18985a()) {
                    strM19012f = c20048m.f63525a.f55178r0.m19012f("persona-device-id");
                    if (strM19012f != null) {
                        c4442m.f14460d.m16161a(strM19012f);
                    }
                    Object obj3 = c20048m.f63526b;
                    AbstractC16544l.m18091d(obj3);
                    CreateInquirySessionResponse createInquirySessionResponse2 = (CreateInquirySessionResponse) obj3;
                    String strConcat2 = "Bearer ".concat(createInquirySessionResponse2.f40806b.f40811a);
                    CreateInquirySessionResponse.Attributes attributes2 = createInquirySessionResponse2.f40805a.f40810b;
                    enumC5810d = attributes2.f40807a;
                    if (enumC5810d != null) {
                        i11 = AbstractC4444n.f14468a[enumC5810d.ordinal()];
                        if (i11 != 1) {
                            enumC17058a = EnumC17058a.f54521Y;
                        } else if (i11 != 2) {
                            enumC17058a = EnumC17058a.f54522Z;
                        } else {
                            if (i11 == 3) {
                                throw new C0644w();
                            }
                            enumC17058a = EnumC17058a.f54523o0;
                        }
                    } else {
                        enumC17058a = EnumC17058a.f54523o0;
                    }
                    enumC5811e = attributes2.f40808b;
                    if (enumC5811e == null && (i10 = AbstractC4444n.f14469b[enumC5811e.ordinal()]) != 1) {
                        if (i10 != 2) {
                            throw new C0644w();
                        }
                        enumC17061d = EnumC17061d.f54530Y;
                    }
                    c4436j = new C4436j(strConcat2, new C17062e(enumC17058a, enumC17061d));
                    this.f14456Z = null;
                    this.f14455Y = 3;
                    if (interfaceC2186j.mo395a(c4436j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    c4434i = new C4434i(NetworkUtilsKt.toErrorInfo(c20048m));
                    this.f14456Z = null;
                    this.f14455Y = 4;
                    if (interfaceC2186j.mo395a(c4434i, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        return c17296c;
    }
}
