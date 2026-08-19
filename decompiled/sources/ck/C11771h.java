package ck;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.util.Size;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17296C;
import mo.C17352s;
import mo.C17353t;
import mo.C17359z;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p138F8.vJO.vRJidSveZHcTw;
import p523V9.AbstractC8162p0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p571X9.AbstractC9294h0;
import p647ak.AbstractC10729t;
import p647ak.C10720o0;
import p647ak.C10722p0;
import p647ak.C10724q0;
import p647ak.C10725r;
import p647ak.C10727s;
import p647ak.EnumC10721p;
import p647ak.EnumC10723q;
import p770gk.InterfaceC14185a;
import p814ik.AbstractC15032d;
import p814ik.AbstractC15035g;
import p856kk.C16433a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p949pj.C18428A;
import p949pj.EnumC18495z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ck.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11771h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f35693Y;

    /* JADX INFO: renamed from: Z */
    public int f35694Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f35695o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11772i f35696p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11771h(C11772i c11772i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35696p0 = c11772i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11771h c11771h = new C11771h(this.f35696p0, interfaceC18770c);
        c11771h.f35695o0 = obj;
        return c11771h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11771h) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0509  */
    /* JADX WARN: Code duplicated, block: B:105:0x0523 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C11772i c11772i;
        String str;
        String lowerCase;
        C11771h c11771h;
        InterfaceC2186j interfaceC2186j;
        Object objEnqueueVerificationRequestWithRetry;
        EnumC19250a enumC19250a;
        C11772i c11772i2;
        ArrayList arrayList;
        String str2;
        String str3;
        NetworkCallResult networkCallResult;
        C11766c c11766c;
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        int i10 = this.f35694Z;
        C11772i c11772i3 = this.f35696p0;
        if (i10 != 0) {
            if (i10 == 1) {
                InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f35695o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j2;
                enumC19250a = enumC19250a2;
                c11772i = c11772i3;
                c11771h = this;
                objEnqueueVerificationRequestWithRetry = obj;
            } else if (i10 == 2) {
                NetworkCallResult.Success success = this.f35693Y;
                InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f35695o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j3;
                enumC19250a = enumC19250a2;
                c11771h = this;
                networkCallResult = success;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c11766c = new C11766c(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    c11771h.f35695o0 = networkCallResult;
                    c11771h.f35693Y = null;
                    c11771h.f35694Z = 3;
                    if (interfaceC2186j.mo395a(c11766c, c11771h) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j4 = (InterfaceC2186j) this.f35695o0;
        InterfaceC14185a interfaceC14185a = c11772i3.f35706k;
        List list = c11772i3.f35701f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C10725r) {
                arrayList2.add(obj2);
            }
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj3 : arrayList2) {
            linkedHashMap.put(((C10725r) obj3).f31861o0, obj3);
        }
        AbstractC10729t abstractC10729t = (AbstractC10729t) linkedHashMap.get(EnumC10723q.f31854Y);
        AbstractC10729t abstractC10729t2 = (AbstractC10729t) linkedHashMap.get(EnumC10723q.f31855Z);
        AbstractC10729t abstractC10729t3 = (AbstractC10729t) linkedHashMap.get(EnumC10723q.f31856o0);
        String str4 = c11772i3.f35703h;
        interfaceC14185a.mo15507b(new C11765b(str4, abstractC10729t, abstractC10729t2, abstractC10729t3));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C10722p0 c10722p0 = C10722p0.f31853a;
            C10724q0 c10724q0 = C10724q0.f31858a;
            C10720o0 c10720o0 = C10720o0.f31848a;
            AbstractC8162p0 abstractC8162p0 = c11772i3.f35700e;
            String str5 = c11772i3.f35705j;
            EnumC19250a enumC19250a3 = enumC19250a2;
            InterfaceC2186j interfaceC2186j5 = interfaceC2186j4;
            String str6 = str4;
            if (!zHasNext) {
                c11772i = c11772i3;
                ArrayList arrayList4 = arrayList3;
                String str7 = c11772i.f35709n;
                if (str7 != null) {
                    C17353t c17353tM9874c = AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][name]", MediaStreamTrack.VIDEO_TRACK_KIND);
                    String strM11054l = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][capture-method]");
                    EnumC10721p enumC10721p = EnumC10721p.AUTO;
                    arrayList4.addAll(AbstractC17681o.m19382k(c17353tM9874c, AbstractC9294h0.m9874c(strM11054l, "auto"), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][type]", MediaStreamTrack.VIDEO_TRACK_KIND), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][objectId]", str7)));
                }
                C17353t c17353tM9874c2 = AbstractC9294h0.m9874c("data[id]", c11772i.f35699d);
                C17353t c17353tM9874c3 = AbstractC9294h0.m9874c("data[type]", ReferencesHeader.INQUIRY);
                String strM11054l2 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][type]");
                if (abstractC8162p0.equals(c10720o0)) {
                    str = "only_center";
                } else if (abstractC8162p0.equals(c10724q0)) {
                    str = "profile_and_center";
                } else {
                    if (!abstractC8162p0.equals(c10722p0)) {
                        throw new C0644w();
                    }
                    str = "configurable_poses";
                }
                C17353t c17353tM9874c4 = AbstractC9294h0.m9874c(strM11054l2, str);
                String strM11054l3 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][capture-started-at]");
                String str8 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(c11772i.f35711p));
                AbstractC16544l.m18093f(str8, "format(...)");
                C17353t c17353tM9874c5 = AbstractC9294h0.m9874c(strM11054l3, str8);
                C17353t c17353tM9874c6 = AbstractC9294h0.m9874c("meta[from_component]", c11772i.f35704i);
                C17353t c17353tM9874c7 = AbstractC9294h0.m9874c("meta[from_step]", str6);
                String strM11054l4 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][label]");
                C18428A c18428a = c11772i.f35710o;
                C17353t c17353tM9874c8 = AbstractC9294h0.m9874c(strM11054l4, c18428a.f58791Y);
                String strM11054l5 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][facing_mode]");
                int[] iArr = AbstractC11770g.f35692a;
                EnumC18495z enumC18495z = c18428a.f58792Z;
                if (iArr[enumC18495z.ordinal()] == 1) {
                    lowerCase = "";
                } else {
                    lowerCase = enumC18495z.toString().toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                C17353t c17353tM9874c9 = AbstractC9294h0.m9874c(strM11054l5, lowerCase);
                String strM11054l6 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][width]");
                Size size = c18428a.f58793o0;
                arrayList4.addAll(AbstractC17681o.m19382k(c17353tM9874c2, c17353tM9874c3, c17353tM9874c4, c17353tM9874c5, c17353tM9874c6, c17353tM9874c7, c17353tM9874c8, c17353tM9874c9, AbstractC9294h0.m9874c(strM11054l6, String.valueOf(size.getWidth())), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][height]"), String.valueOf(size.getHeight())), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][aspectRatio]"), String.valueOf(size.getHeight() == 0 ? 0.0d : ((double) size.getWidth()) / ((double) size.getHeight()))), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][frameRate]"), String.valueOf(c18428a.f58794p0)), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][cameraProperties][kind]", ""), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][cameraProperties][selectedCameraIndex]", ""), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][cameraProperties][streamStability]", ""), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + vRJidSveZHcTw.ZEOlRvsD, ""), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][client]"), AbstractC15035g.m16168g(c11772i.f35697b) ? "mobile" : "mobile_sdk"), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][cameraProperties][platform]"), AbstractC15032d.m16160a() ? "android" : "android_sdk")));
                C11769f c11769f = new C11769f(c11772i, arrayList4, null);
                c11771h = this;
                interfaceC2186j = interfaceC2186j5;
                c11771h.f35695o0 = interfaceC2186j;
                c11771h.f35694Z = 1;
                objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c11769f, c11771h);
                enumC19250a = enumC19250a3;
                if (objEnqueueVerificationRequestWithRetry != enumC19250a) {
                    break;
                }
                return enumC19250a;
            }
            AbstractC10729t abstractC10729t4 = (AbstractC10729t) it.next();
            Iterator it2 = it;
            File file = new File(abstractC10729t4.mo11035a());
            ArrayList arrayList5 = arrayList3;
            if (abstractC10729t4 instanceof C10725r) {
                c11772i3.f35708m.getClass();
                C16433a.m18019a(file);
                Pattern pattern = C17352s.f55296e;
                c11772i2 = c11772i3;
                C17359z c17359z = new C17359z(AbstractC9282f0.m9858d("image/*"), file, 0);
                C10725r c10725r = (C10725r) abstractC10729t4;
                int iOrdinal = c10725r.f31861o0.ordinal();
                if (iOrdinal != 0) {
                    str2 = "format(...)";
                    if (iOrdinal == 1) {
                        str3 = "left_photo";
                    } else {
                        if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        str3 = "right_photo";
                    }
                } else {
                    str2 = "format(...)";
                    str3 = "center_photo";
                }
                C17353t c17353tM9875d = AbstractC9294h0.m9875d(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][frames][]"), file.getName(), c17359z);
                String strM11054l7 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][name]");
                if (abstractC8162p0.equals(c10720o0)) {
                    str3 = "photo";
                } else if (!abstractC8162p0.equals(c10724q0) && !abstractC8162p0.equals(c10722p0)) {
                    throw new C0644w();
                }
                C17353t c17353tM9874c10 = AbstractC9294h0.m9874c(strM11054l7, str3);
                C17353t c17353tM9874c11 = AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][capture-method]"), abstractC10729t4.mo11036b().f31852Y);
                String strM11054l8 = AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][captured-at]");
                String str9 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(c10725r.f31862p0));
                AbstractC16544l.m18093f(str9, str2);
                C17353t[] c17353tArr = {c17353tM9874c10, c17353tM9874c11, AbstractC9294h0.m9874c(strM11054l8, str9), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][type]", "image"), c17353tM9875d};
                arrayList = arrayList5;
                arrayList.addAll(AbstractC17681o.m19382k(c17353tArr));
            } else {
                c11772i2 = c11772i3;
                arrayList = arrayList5;
                if (abstractC10729t4 instanceof C10727s) {
                    Pattern pattern2 = C17352s.f55296e;
                    C17353t c17353tM9875d2 = AbstractC9294h0.m9875d(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][frames][]"), file.getName(), new C17359z(AbstractC9282f0.m9858d("video/*"), file, 0));
                    arrayList.addAll(AbstractC17681o.m19382k(AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][name]", MediaStreamTrack.VIDEO_TRACK_KIND), AbstractC9294h0.m9874c(AbstractC10763a.m11054l("data[attributes][fields][", str5, "][files][][capture-method]"), abstractC10729t4.mo11036b().f31852Y), AbstractC9294h0.m9874c("data[attributes][fields][" + str5 + "][files][][type]", MediaStreamTrack.VIDEO_TRACK_KIND), c17353tM9875d2));
                }
            }
            interfaceC2186j4 = interfaceC2186j5;
            arrayList3 = arrayList;
            enumC19250a2 = enumC19250a3;
            str4 = str6;
            it = it2;
            c11772i3 = c11772i2;
        }
        networkCallResult = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (!c11772i.f35706k.mo15506a()) {
                for (AbstractC10729t abstractC10729t5 : c11772i.f35701f) {
                    if (abstractC10729t5 instanceof C10725r) {
                        new File(((C10725r) abstractC10729t5).f31859Y).delete();
                    }
                }
            }
            C11767d c11767d = C11767d.f35688a;
            c11771h.f35695o0 = interfaceC2186j;
            c11771h.f35693Y = (NetworkCallResult.Success) networkCallResult;
            c11771h.f35694Z = 2;
            if (interfaceC2186j.mo395a(c11767d, c11771h) == enumC19250a) {
                return enumC19250a;
            }
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            c11766c = new C11766c(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            c11771h.f35695o0 = networkCallResult;
            c11771h.f35693Y = null;
            c11771h.f35694Z = 3;
            if (interfaceC2186j.mo395a(c11766c, c11771h) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
