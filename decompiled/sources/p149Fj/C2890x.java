package p149Fj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.util.Size;
import bj.C11447L;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import dj.AbstractC13178c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17296C;
import mo.AbstractC17329F;
import mo.C17352s;
import mo.C17353t;
import mo.C17359z;
import p022Ak.EnumC0544e;
import p025An.C0644w;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21329w;
import p1156zj.C22090C;
import p1156zj.C22092D;
import p1156zj.C22205x;
import p1156zj.InterfaceC22096F;
import p185H6.C3246b;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p571X9.AbstractC9294h0;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p814ik.AbstractC15032d;
import p814ik.AbstractC15035g;
import p856kk.C16433a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;
import p949pj.C18428A;
import p949pj.EnumC18495z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sj.C19661b;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C2890x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f8682Y;

    /* JADX INFO: renamed from: Z */
    public int f8683Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f8684o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2891y f8685p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2890x(C2891y c2891y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8685p0 = c2891y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2890x c2890x = new C2890x(this.f8685p0, interfaceC18770c);
        c2890x.f8684o0 = obj;
        return c2890x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2890x) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x0572  */
    /* JADX WARN: Code duplicated, block: B:135:0x0585 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a;
        ArrayList arrayList;
        C2891y c2891y;
        C2890x c2890x;
        Object objEnqueueVerificationRequestWithRetry;
        EnumC19250a enumC19250a2;
        InterfaceC2186j interfaceC2186j;
        String lowerCase;
        String str;
        C2891y c2891y2;
        InterfaceC22096F interfaceC22096F;
        String strMo22350m;
        Object obj2;
        C2880n c2880n;
        List list;
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
        C2884r c2884r;
        GenericFileUploadErrorResponse genericFileUploadErrorResponse;
        EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
        int i10 = this.f8683Z;
        C2891y c2891y3 = this.f8685p0;
        if (i10 != 0) {
            if (i10 == 1) {
                InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f8684o0;
                AbstractC9233X.m9807c(obj);
                c2890x = this;
                interfaceC2186j = interfaceC2186j2;
                enumC19250a2 = enumC19250a3;
                c2891y = c2891y3;
                objEnqueueVerificationRequestWithRetry = obj;
            } else if (i10 == 2) {
                obj2 = this.f8682Y;
                interfaceC2186j = (InterfaceC2186j) this.f8684o0;
                AbstractC9233X.m9807c(obj);
                c2890x = this;
                enumC19250a2 = enumC19250a3;
                if (obj2 instanceof NetworkCallResult.Failure) {
                    networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
                    if (networkErrorInfo.isRecoverable() || !(networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                        c2884r = new C2884r(networkErrorInfo);
                        c2890x.f8684o0 = obj2;
                        c2890x.f8682Y = null;
                        c2890x.f8683Z = 5;
                        if (interfaceC2186j.mo395a(c2884r, c2890x) == enumC19250a2) {
                            return enumC19250a2;
                        }
                    } else {
                        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                        AbstractC16544l.m18092e(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.ErrorResponse.Error.UnknownError");
                        AbstractC17329F errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                        if (errorBody != null) {
                            InterfaceC0677k interfaceC0677kMo18988O0 = errorBody.mo18988O0();
                            C3246b c3246b = new C3246b();
                            c3246b.m4134a(GenericFileUploadErrorResponse.INSTANCE.getAdapter());
                            genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new C11447L(c3246b).m12850b(GenericFileUploadErrorResponse.class, AbstractC13178c.f41820a, null).fromJson(interfaceC0677kMo18988O0);
                        } else {
                            genericFileUploadErrorResponse = null;
                        }
                        if (genericFileUploadErrorResponse != null) {
                            C2885s c2885s = new C2885s(genericFileUploadErrorResponse.getErrors().get(0));
                            c2890x.f8684o0 = obj2;
                            c2890x.f8682Y = null;
                            c2890x.f8683Z = 3;
                            if (interfaceC2186j.mo395a(c2885s, c2890x) == enumC19250a2) {
                                return enumC19250a2;
                            }
                        } else {
                            C2885s c2885s2 = new C2885s(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            c2890x.f8684o0 = obj2;
                            c2890x.f8682Y = null;
                            c2890x.f8683Z = 4;
                            if (interfaceC2186j.mo395a(c2885s2, c2890x) == enumC19250a2) {
                                return enumC19250a2;
                            }
                        }
                    }
                }
            } else {
                if (i10 != 3 && i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f8684o0;
        C17353t c17353tM9874c = AbstractC9294h0.m9874c("data[id]", c2891y3.f8688d);
        C17353t c17353tM9874c2 = AbstractC9294h0.m9874c("data[type]", ReferencesHeader.INQUIRY);
        C17353t c17353tM9874c3 = AbstractC9294h0.m9874c("meta[from_component]", c2891y3.f8690f);
        String str2 = c2891y3.f8689e;
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(c17353tM9874c, c17353tM9874c2, c17353tM9874c3, AbstractC9294h0.m9874c("meta[from_step]", str2));
        C2880n c2880n2 = c2891y3.f8692h;
        if (c2880n2 != null) {
            List list2 = c2880n2.f8661Y;
            c2891y3.f8693i.mo15507b(new C2882p(str2, list2));
            StringBuilder sb2 = new StringBuilder("data[attributes][fields][");
            String str3 = c2880n2.f8662Z;
            String strM9891j = AbstractC9306j0.m9891j(str3, "][cameraProperties][label]", sb2);
            C18428A c18428a = c2891y3.f8697m;
            C17353t c17353tM9874c4 = AbstractC9294h0.m9874c(strM9891j, c18428a.f58791Y);
            String strM11054l = AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][facing_mode]");
            int[] iArr = AbstractC2888v.f8678a;
            EnumC18495z enumC18495z = c18428a.f58792Z;
            enumC19250a = enumC19250a3;
            if (iArr[enumC18495z.ordinal()] == 1) {
                lowerCase = "";
            } else {
                lowerCase = enumC18495z.toString().toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            C17353t c17353tM9874c5 = AbstractC9294h0.m9874c(strM11054l, lowerCase);
            String strM11054l2 = AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][width]");
            Size size = c18428a.f58793o0;
            C17353t c17353tM9874c6 = AbstractC9294h0.m9874c(strM11054l2, String.valueOf(size.getWidth()));
            C17353t c17353tM9874c7 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][height]"), String.valueOf(size.getHeight()));
            C17353t c17353tM9874c8 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][aspectRatio]"), String.valueOf(size.getHeight() == 0 ? 0.0d : ((double) size.getWidth()) / ((double) size.getHeight())));
            C17353t c17353tM9874c9 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][frameRate]"), String.valueOf(c18428a.f58794p0));
            C17353t c17353tM9874c10 = AbstractC9294h0.m9874c("data[attributes][fields][" + str3 + "][cameraProperties][kind]", "");
            C17353t c17353tM9874c11 = AbstractC9294h0.m9874c("data[attributes][fields][" + str3 + "][cameraProperties][selectedCameraIndex]", "");
            C17353t c17353tM9874c12 = AbstractC9294h0.m9874c("data[attributes][fields][" + str3 + "][cameraProperties][streamStability]", "");
            C17353t c17353tM9874c13 = AbstractC9294h0.m9874c("data[attributes][fields][" + str3 + "][cameraProperties][allCameraLabels]", "");
            C17353t c17353tM9874c14 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][client]"), AbstractC15035g.m16168g(c2891y3.f8686b) ? "mobile" : "mobile_sdk");
            C17353t c17353tM9874c15 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][platform]"), AbstractC15032d.m16160a() ? "android" : "android_sdk");
            String strM11054l3 = AbstractC10763a.m11054l("data[attributes][fields][", str3, "][cameraProperties][factor]");
            String str4 = str3;
            C19661b c19661b = c2891y3.f8698n;
            C2891y c2891y4 = c2891y3;
            long j10 = c19661b.f62316c;
            C17353t[] c17353tArr = {c17353tM9874c4, c17353tM9874c5, c17353tM9874c6, c17353tM9874c7, c17353tM9874c8, c17353tM9874c9, c17353tM9874c10, c17353tM9874c11, c17353tM9874c12, c17353tM9874c13, c17353tM9874c14, c17353tM9874c15, AbstractC9294h0.m9874c(strM11054l3, String.valueOf(j10 == 0 ? 0.0d : c19661b.f62317d / j10))};
            arrayList = arrayListM19384m;
            arrayList.addAll(AbstractC17681o.m19382k(c17353tArr));
            List list3 = list2;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                interfaceC22096F = (InterfaceC22096F) AbstractC17680n.m19343S(list2);
                str = interfaceC22096F == null ? r14 : r14;
            } else {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        interfaceC22096F = (InterfaceC22096F) AbstractC17680n.m19343S(list2);
                        if (interfaceC22096F == null && (strMo22350m = interfaceC22096F.mo22350m()) != null) {
                            str = "data[attributes][fields][";
                            arrayList.add(AbstractC9294h0.m9874c(str + c2880n2.f8663o0 + "]", strMo22350m));
                        }
                    } else if (AbstractC16544l.m18089b(((InterfaceC22096F) it.next()).mo22350m(), "auto-classification")) {
                    }
                }
            }
            Iterator it2 = list3.iterator();
            while (true) {
                String str5 = "front_and_back";
                if (!it2.hasNext()) {
                    String str6 = str4;
                    c2891y = c2891y4;
                    String str7 = c2891y.f8696l;
                    if (str7 == null) {
                        break;
                    }
                    C17353t c17353tM9874c16 = AbstractC9294h0.m9874c(str + str6 + "][files][][name]", MediaStreamTrack.VIDEO_TRACK_KIND);
                    String strM11054l4 = AbstractC10763a.m11054l(str, str6, "][files][][capture-method]");
                    EnumC0544e enumC0544e = EnumC0544e.f1734Y;
                    String lowerCase2 = "Auto".toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    arrayList.addAll(AbstractC17681o.m19382k(c17353tM9874c16, AbstractC9294h0.m9874c(strM11054l4, lowerCase2), AbstractC9294h0.m9874c(str + str6 + "][files][][type]", MediaStreamTrack.VIDEO_TRACK_KIND), AbstractC9294h0.m9874c(str + str6 + "][files][][page]", "front_and_back"), AbstractC9294h0.m9874c(str + str6 + "][files][][objectId]", str7)));
                    break;
                }
                InterfaceC22096F interfaceC22096F2 = (InterfaceC22096F) it2.next();
                for (C22205x c22205x : interfaceC22096F2.mo22349j0()) {
                    if (AbstractC21329w.m21734u(c22205x.f70394Z, "image/", false)) {
                        File file = new File(c22205x.f70393Y);
                        c2891y2 = c2891y4;
                        c2891y2.f8695k.getClass();
                        C16433a.m18019a(file);
                    } else {
                        c2891y2 = c2891y4;
                    }
                    c2891y4 = c2891y2;
                }
                C2891y c2891y5 = c2891y4;
                int iOrdinal = interfaceC22096F2.mo22351v0().ordinal();
                if (iOrdinal == 0) {
                    str5 = "front";
                } else if (iOrdinal == 1) {
                    str5 = "back";
                } else if (iOrdinal != 2) {
                    throw new C0644w();
                }
                StringBuilder sb3 = new StringBuilder(str);
                String str8 = str4;
                sb3.append(str8);
                sb3.append("][files][][page]");
                arrayList.addAll(AbstractC17681o.m19382k(AbstractC9294h0.m9874c(sb3.toString(), str5), AbstractC9294h0.m9874c(AbstractC10763a.m11054l(str, str8, "][files][][capture_method]"), interfaceC22096F2.mo22348P().toString())));
                List<C22205x> listMo22349j0 = interfaceC22096F2.mo22349j0();
                ArrayList arrayList2 = new ArrayList();
                for (C22205x c22205x2 : listMo22349j0) {
                    String strM11054l5 = AbstractC10763a.m11054l(str, str8, "][files][][frames][]");
                    String name = new File(c22205x2.f70393Y).getName();
                    File file2 = new File(c22205x2.f70393Y);
                    Pattern pattern = C17352s.f55296e;
                    AbstractC17686t.m19398v(AbstractC9393x3.m9974d(AbstractC9294h0.m9875d(strM11054l5, name, new C17359z(AbstractC9282f0.m9858d(c22205x2.f70394Z), file2, 0))), arrayList2);
                }
                arrayList.addAll(arrayList2);
                if (interfaceC22096F2 instanceof C22090C) {
                    RawExtraction rawExtraction = ((C22090C) interfaceC22096F2).f69826q0;
                    if (rawExtraction != null) {
                        arrayList.add(AbstractC9294h0.m9874c("data[attributes][client-extraction-raws][][type]", rawExtraction.f40609Y));
                        arrayList.add(AbstractC9294h0.m9874c("data[attributes][client-extraction-raws][][value]", rawExtraction.f40610Z));
                    }
                    arrayList.add(AbstractC9294h0.m9874c(str + str8 + "][files][][type]", "image"));
                } else if (interfaceC22096F2 instanceof C22092D) {
                    arrayList.add(AbstractC9294h0.m9874c(str + str8 + "][files][][type]", MediaStreamTrack.VIDEO_TRACK_KIND));
                }
                c2891y4 = c2891y5;
                str4 = str8;
            }
        } else {
            enumC19250a = enumC19250a3;
            interfaceC2186j3 = interfaceC2186j3;
            arrayList = arrayListM19384m;
            c2891y = c2891y3;
        }
        C2889w c2889w = new C2889w(c2891y, arrayList, null);
        c2890x = this;
        InterfaceC2186j interfaceC2186j4 = interfaceC2186j3;
        c2890x.f8684o0 = interfaceC2186j4;
        c2890x.f8683Z = 1;
        objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c2889w, c2890x);
        enumC19250a2 = enumC19250a;
        if (objEnqueueVerificationRequestWithRetry == enumC19250a2) {
            return enumC19250a2;
        }
        interfaceC2186j = interfaceC2186j4;
        obj2 = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
        if (obj2 instanceof NetworkCallResult.Success) {
            ((NetworkCallResult.Success) obj2).getResponse();
            if (!c2891y.f8693i.mo15506a() && (c2880n = c2891y.f8692h) != null && (list = c2880n.f8661Y) != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((InterfaceC22096F) it3.next()).mo22349j0().iterator();
                    while (it4.hasNext()) {
                        new File(((C22205x) it4.next()).f70393Y).delete();
                    }
                }
            }
            C2886t c2886t = C2886t.f8677a;
            c2890x.f8684o0 = interfaceC2186j;
            c2890x.f8682Y = (NetworkCallResult.Success) obj2;
            c2890x.f8683Z = 2;
            if (interfaceC2186j.mo395a(c2886t, c2890x) == enumC19250a2) {
                return enumC19250a2;
            }
        }
        if (obj2 instanceof NetworkCallResult.Failure) {
            networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
            if (networkErrorInfo.isRecoverable()) {
                c2884r = new C2884r(networkErrorInfo);
                c2890x.f8684o0 = obj2;
                c2890x.f8682Y = null;
                c2890x.f8683Z = 5;
                if (interfaceC2186j.mo395a(c2884r, c2890x) == enumC19250a2) {
                    return enumC19250a2;
                }
            } else {
                c2884r = new C2884r(networkErrorInfo);
                c2890x.f8684o0 = obj2;
                c2890x.f8682Y = null;
                c2890x.f8683Z = 5;
                if (interfaceC2186j.mo395a(c2884r, c2890x) == enumC19250a2) {
                    return enumC19250a2;
                }
            }
        }
        return C17296C.f55119a;
    }
}
