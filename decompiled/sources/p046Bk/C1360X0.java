package p046Bk;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import bj.C11447L;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import fo.C13711h;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import lk.EnumC17058a;
import lk.EnumC17061d;
import mk.C17280a;
import mk.C17282c;
import p002A0.C0146w;
import p003A1.C0155B1;
import p025An.C0644w;
import p026Ao.C0678l;
import p042Bf.C1268j;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p100Dk.C2073A;
import p100Dk.InterfaceC2094u;
import p1113xn.AbstractC21322p;
import p1131yj.InterfaceC21546a;
import p248Jk.InterfaceC4478i;
import p310M9.C5311e;
import p508Uj.C7693a;
import p508Uj.C7703k;
import p508Uj.C7704l;
import p508Uj.C7707o;
import p508Uj.EnumC7694b;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p531Vj.AbstractC8367f0;
import p531Vj.C8361c0;
import p531Vj.EnumC8334D;
import p544W9.AbstractC8548R3;
import p544W9.AbstractC8694q;
import p658b5.C11238i;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p770gk.InterfaceC14185a;
import p814ik.C15033e;
import p839jk.C16251h;
import p839jk.C16262s;
import p839jk.C16265v;
import p839jk.C16267x;
import p839jk.C16268y;
import p841k.AbstractC16283c;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p994rk.AbstractC19213r2;
import p994rk.C19218t;
import p994rk.C19221t2;
import p994rk.InterfaceC19174i;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19205p2;

/* JADX INFO: renamed from: Bk.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1360X0 extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final Context f3599a;

    /* JADX INFO: renamed from: b */
    public final C11238i f3600b;

    /* JADX INFO: renamed from: c */
    public final C7704l f3601c;

    /* JADX INFO: renamed from: d */
    public final C1326G f3602d;

    /* JADX INFO: renamed from: e */
    public final C1379e1 f3603e;

    /* JADX INFO: renamed from: f */
    public final C17282c f3604f;

    /* JADX INFO: renamed from: g */
    public final C8361c0 f3605g;

    /* JADX INFO: renamed from: h */
    public final C1420z f3606h;

    /* JADX INFO: renamed from: i */
    public final C16251h f3607i;

    public C1360X0(Context context, C11238i c11238i, C7704l c7704l, C1326G createReusablePersonaWorkerFactory, C1379e1 verifyReusablePersonaWorkerFactory, C17282c navigationStateManager, C8361c0 c8361c0, C1420z c1420z, C16251h externalEventLogger) {
        AbstractC16544l.m18094g(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        AbstractC16544l.m18094g(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        AbstractC16544l.m18094g(externalEventLogger, "externalEventLogger");
        this.f3599a = context;
        this.f3600b = c11238i;
        this.f3601c = c7704l;
        this.f3602d = createReusablePersonaWorkerFactory;
        this.f3603e = verifyReusablePersonaWorkerFactory;
        this.f3604f = navigationStateManager;
        this.f3605g = c8361c0;
        this.f3606h = c1420z;
        this.f3607i = externalEventLogger;
    }

    /* JADX INFO: renamed from: e */
    public static final void m2031e(C1360X0 c1360x0, InterfaceC19201o2 interfaceC19201o2, C1383g0 c1383g0) {
        c1360x0.getClass();
        List list = c1383g0.f3676Y;
        ArrayList<InterfaceC19201o2> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC19201o2 interfaceC19201o3 = (InterfaceC19201o2) obj;
            if ((interfaceC19201o3 instanceof InterfaceC19174i) || (interfaceC19201o3 instanceof GovernmentIdNfcScanComponent)) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC19201o2 interfaceC19201o4 : arrayList) {
            InterfaceC19174i interfaceC19174i = interfaceC19201o4 instanceof InterfaceC19174i ? (InterfaceC19174i) interfaceC19201o4 : null;
            if (interfaceC19174i != null) {
                interfaceC19174i.mo20308T(AbstractC16544l.m18089b(interfaceC19201o4.getName(), interfaceC19201o2.getName()));
            }
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = interfaceC19201o4 instanceof GovernmentIdNfcScanComponent ? (GovernmentIdNfcScanComponent) interfaceC19201o4 : null;
            if (governmentIdNfcScanComponent != null) {
                governmentIdNfcScanComponent.f40917t0 = AbstractC16544l.m18089b(interfaceC19201o4.getName(), interfaceC19201o2.getName());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2032f(List list, InterfaceC1436k interfaceC1436k) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19201o2 interfaceC19201o2 = (InterfaceC19201o2) it.next();
            if (interfaceC19201o2 instanceof InterfaceC19205p2) {
                m2032f(((InterfaceC19205p2) interfaceC19201o2).getF40898Z(), new C1419y0(0, interfaceC1436k));
            } else {
                interfaceC1436k.invoke(interfaceC19201o2);
            }
        }
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        C1393l0 props = (C1393l0) obj;
        AbstractC16544l.m18094g(props, "props");
        if (c13420k != null) {
            C0678l c0678lM14962a = c13420k.m14962a();
            Parcelable parcelable = null;
            if (c0678lM14962a.mo1372d() <= 0) {
                c0678lM14962a = null;
            }
            if (c0678lM14962a != null) {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                byte[] bArrMo1382q = c0678lM14962a.mo1382q();
                parcelObtain.unmarshall(bArrMo1382q, 0, bArrMo1382q.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(C13420k.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable);
                parcelObtain.recycle();
            }
            AbstractC1391k0 abstractC1391k0 = (AbstractC1391k0) parcelable;
            if (abstractC1391k0 != null) {
                return abstractC1391k0;
            }
        }
        ArrayList arrayListM20321d = AbstractC19213r2.m20321d(props.f3709c);
        List list = props.f3723q;
        if (list == null) {
            list = C17689w.f56480Y;
        }
        return new C1383g0(arrayListM20321d, props.f3710d, list, props.f3722p, null, 16368);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02f7 A[PHI: r20
      0x02f7: PHI (r20v10 java.lang.String) = (r20v7 java.lang.String), (r20v11 java.lang.String) binds: [B:123:0x0303, B:117:0x02f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0407  */
    /* JADX WARN: Code duplicated, block: B:162:0x041d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0456  */
    /* JADX WARN: Code duplicated, block: B:166:0x0459  */
    /* JADX WARN: Code duplicated, block: B:169:0x045f  */
    /* JADX WARN: Code duplicated, block: B:172:0x047a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0487  */
    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        AbstractC8548R3 c16265v;
        String str;
        C17062e c17062e;
        EnumC8334D enumC8334D;
        boolean z6;
        C1383g0 c1383g0;
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        String str4;
        String string;
        String string2;
        List listM19382k;
        String scanDocumentError;
        String str5;
        String str6;
        String str7;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        List<UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        EnumC7694b enumC7694b;
        Map map;
        C13421l c13421l2 = c13421l;
        int i10 = 7;
        int i11 = 1;
        int i12 = 0;
        C1393l0 renderProps = (C1393l0) obj;
        AbstractC1391k0 renderState = (AbstractC1391k0) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        if (!(renderState instanceof C1383g0)) {
            throw new C0644w();
        }
        C1383g0 c1383g1 = (C1383g0) renderState;
        String str8 = renderProps.f3710d;
        C1381f0 c1381f0 = c1383g1.f3681r0;
        InterfaceC1389j0 interfaceC1389j0 = c1383g1.f3683t0;
        if (interfaceC1389j0 == null) {
            c16265v = c1381f0 != null ? new C16265v(str8) : new C16267x(str8);
        } else if (interfaceC1389j0 instanceof C1385h0) {
            c16265v = new C16262s(str8);
        } else {
            if (!(interfaceC1389j0 instanceof C1387i0)) {
                throw new C0644w();
            }
            c16265v = new C16268y(str8);
        }
        this.f3607i.m17811a(c16265v);
        if (interfaceC1389j0 instanceof C1385h0) {
            C1385h0 c1385h0 = (C1385h0) interfaceC1389j0;
            UiComponentConfig.CreatePersonaSheet.Attributes attributes = c1385h0.f3693Y.f60959Y.getAttributes();
            String url = attributes != null ? attributes.getUrl() : null;
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C19218t c19218t = c1385h0.f3693Y;
            c19218t.getClass();
            String name = c19218t.getConfig().getName();
            C5311e c5311e = this.f3602d.f3501a;
            AbstractC8215v5.m8843e(c13421l2, new C1324F((InterfaceC2094u) ((InterfaceC4478i) c5311e.f17484Z).get(), (C15033e) ((InterfaceC4478i) c5311e.f17485o0).get(), renderProps.f3707a, renderProps.f3708b, url, name, (AbstractC16283c) ((InterfaceC4478i) c5311e.f17486p0).get()), AbstractC16526C.m18075c(C1324F.class), "", new C0146w(interfaceC1389j0, this, c1383g1, i10));
        } else if (interfaceC1389j0 instanceof C1387i0) {
            C1387i0 c1387i0 = (C1387i0) interfaceC1389j0;
            UiComponentConfig.VerifyPersonaButton.Attributes attributes2 = c1387i0.f3697Y.f60970Y.getAttributes();
            String url2 = attributes2 != null ? attributes2.getUrl() : null;
            if (url2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C19221t2 c19221t2 = c1387i0.f3697Y;
            c19221t2.getClass();
            String name2 = c19221t2.getConfig().getName();
            C13711h c13711h = this.f3603e.f3667a;
            AbstractC8215v5.m8843e(c13421l2, new C1376d1((InterfaceC2094u) ((InterfaceC4478i) c13711h.f43260o0).get(), (C15033e) ((InterfaceC4478i) c13711h.f43261p0).get(), renderProps.f3707a, renderProps.f3708b, url2, name2, (AbstractC16283c) ((InterfaceC4478i) c13711h.f43259Z).get()), AbstractC16526C.m18075c(C1376d1.class), "", new C1417x0(this, c1383g1, i12));
        }
        boolean z12 = c1383g1.f3689z0;
        boolean z13 = interfaceC1389j0 == null && !z12;
        C17282c c17282c = this.f3604f;
        c17282c.f55098d = renderProps.f3711e;
        c17282c.f55099e = renderProps.f3712f;
        c17282c.f55100f = z13;
        c17282c.m18976b();
        String str9 = "";
        m2032f(c1383g1.f3676Y, new C1307e((AbstractC13422m) this, (Object) renderProps, (Object) renderState, c13421l, 2));
        if (z12) {
            InterfaceC19201o2 interfaceC19201o2 = c1383g1.f3687x0;
            if (interfaceC19201o2 == null || (map = c1383g1.f3686w0) == null) {
                c13421l2.mo3410z(AbstractC10763a.m11049g(System.currentTimeMillis(), "cancel_submission_"), new C1354U0(c13421l2, this, null));
            } else {
                C11238i c11238i = this.f3600b;
                String sessionToken = renderProps.f3707a;
                AbstractC16544l.m18094g(sessionToken, "sessionToken");
                String inquiryId = renderProps.f3708b;
                AbstractC16544l.m18094g(inquiryId, "inquiryId");
                String fromStep = c1383g1.f3677Z;
                AbstractC16544l.m18094g(fromStep, "fromStep");
                AbstractC8215v5.m8843e(c13421l2, new C2073A(sessionToken, inquiryId, fromStep, interfaceC19201o2, map, (InterfaceC2094u) c11238i.f34008Y, (C11447L) c11238i.f34009Z, (InterfaceC14185a) c11238i.f34010o0, (InterfaceC21546a) c11238i.f34011p0), AbstractC16526C.m18075c(C2073A.class), str9, new C1417x0(this, c1383g1, i11));
            }
        }
        Context context = this.f3599a;
        String str10 = "getString(...)";
        if (c1381f0 != null) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = c1381f0.f3671Y;
            String cardAccessNumber = governmentIdNfcScanComponent.cardAccessNumberController.m12488l();
            String strM12488l = governmentIdNfcScanComponent.documentNumberController.m12488l();
            Date dateM16022o = governmentIdNfcScanComponent.dateOfBirthController.m16022o();
            Date dateM16022o2 = governmentIdNfcScanComponent.expirationDateController.m16022o();
            if (AbstractC21322p.m21681O(strM12488l) || dateM16022o == null || dateM16022o2 == null) {
                str10 = "getString(...)";
                c1383g1 = c1383g1;
                renderState = renderState;
                str = str9;
                c13421l2.mo3410z("client_side_nfc_form_validation", new C1345P0(c13421l, this, governmentIdNfcScanComponent, strM12488l, dateM16022o, dateM16022o2, c1381f0, c1383g1, null));
            } else {
                C7693a c7693a = new C7693a(strM12488l, dateM16022o2, dateM16022o);
                UiComponentConfig.GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.f40910Y;
                UiComponentConfig.GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
                if (attributes3 == null || (enabledDataGroups = attributes3.getEnabledDataGroups()) == null) {
                    listM19382k = AbstractC17681o.m19382k(EnumC7694b.f24234Y, EnumC7694b.f24235Z, EnumC7694b.f24236o0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = enabledDataGroups.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int i13 = AbstractC1409t0.f3770a[((UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                        if (i13 == i11) {
                            enumC7694b = EnumC7694b.f24234Y;
                        } else if (i13 != 2) {
                            enumC7694b = i13 != 3 ? null : EnumC7694b.f24236o0;
                        } else {
                            enumC7694b = EnumC7694b.f24235Z;
                        }
                        if (enumC7694b != null) {
                            arrayList.add(enumC7694b);
                        }
                        it = it2;
                        i11 = 1;
                    }
                    listM19382k = arrayList;
                }
                UiComponentConfig.GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
                String str11 = (attributes4 == null || (scanDocumentPrompt = attributes4.getScanDocumentPrompt()) == null) ? str9 : scanDocumentPrompt;
                String str12 = (attributes4 == null || (authenticating = attributes4.getAuthenticating()) == null) ? str9 : authenticating;
                String str13 = (attributes4 == null || (reading = attributes4.getReading()) == null) ? str9 : reading;
                String string3 = context.getString(R.string.pi2_permissions_cancel);
                AbstractC16544l.m18093f(string3, "getString(...)");
                String str14 = (attributes4 == null || (scanDocumentSuccess = attributes4.getScanDocumentSuccess()) == null) ? str9 : scanDocumentSuccess;
                String str15 = (attributes4 == null || (enableNfcPrompt = attributes4.getEnableNfcPrompt()) == null) ? str9 : enableNfcPrompt;
                String string4 = context.getString(R.string.pi2_permissions_continue);
                AbstractC16544l.m18093f(string4, "getString(...)");
                String string5 = context.getString(R.string.pi2_permissions_cancel);
                AbstractC16544l.m18093f(string5, "getString(...)");
                if (attributes4 == null || (scanDocumentError = attributes4.getConnectionLostPrompt()) == null) {
                    scanDocumentError = attributes4 != null ? attributes4.getScanDocumentError() : null;
                    if (scanDocumentError == null) {
                        str5 = str9;
                    } else {
                        str5 = scanDocumentError;
                    }
                } else {
                    str5 = scanDocumentError;
                }
                String string6 = context.getString(R.string.pi2_retry);
                AbstractC16544l.m18093f(string6, "getString(...)");
                if (attributes4 == null || (authenticationErrorPrompt = attributes4.getAuthenticationErrorPrompt()) == null) {
                    str6 = str9;
                    str7 = str6;
                } else {
                    str7 = authenticationErrorPrompt;
                    str6 = str9;
                }
                String string7 = context.getString(R.string.pi2_retry);
                AbstractC16544l.m18093f(string7, "getString(...)");
                String str16 = (attributes4 == null || (scanDocumentError2 = attributes4.getScanDocumentError()) == null) ? str6 : scanDocumentError2;
                String string8 = context.getString(R.string.pi2_retry);
                AbstractC16544l.m18093f(string8, "getString(...)");
                C7703k c7703k = new C7703k(str11, str12, str13, string3, str14, str15, string4, string5, str5, string6, str7, string7, str16, string8);
                C7704l c7704l = this.f3601c;
                AbstractC16544l.m18094g(cardAccessNumber, "cardAccessNumber");
                c13421l2 = c13421l;
                str9 = str6;
                AbstractC8215v5.m8843e(c13421l2, new C7707o(c7704l.f24268a, c7704l.f24269b, cardAccessNumber, c7693a, c7703k, listM19382k, renderProps.f3722p), AbstractC16526C.m18075c(C7707o.class), str9, new C1307e(this, c1383g1, c1381f0, governmentIdNfcScanComponent, 3));
            }
            c17062e = renderProps.f3714h;
            if (c17062e.f54535Z == EnumC17061d.f54530Y) {
                enumC8334D = EnumC8334D.f25985o0;
            } else {
                enumC8334D = EnumC8334D.f25986p0;
            }
            EnumC8334D enumC8334D2 = enumC8334D;
            if (c17062e.f54534Y == EnumC17058a.f54522Z) {
                z6 = true;
            } else {
                z6 = false;
            }
            C17280a c17280aM18975a = c17282c.m18975a();
            C1268j c1268j = new C1268j(this, renderState, renderProps, c13421l, 1);
            C1331I0 c1331i0 = new C1331I0(c13421l2, this, 0);
            C0155B1 c0155b1 = new C0155B1(c13421l2, this, renderProps, 6);
            AbstractC1391k0 abstractC1391k0 = renderState;
            C1335K0 c1335k0 = new C1335K0(0, abstractC1391k0, this, c13421l2);
            C1335K0 c1335k1 = new C1335K0(1, abstractC1391k0, this, c13421l2);
            c1383g0 = c1383g1;
            if (c1383g0.f3682s0 || z12) {
                z10 = false;
            } else {
                z10 = true;
            }
            C1331I0 c1331i1 = new C1331I0(c13421l2, this, 1);
            C1315A0 c1315a0 = new C1315A0(1, abstractC1391k0, this, c13421l2);
            if (interfaceC1389j0 == null || z12) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = z6;
            C1407s0 c1407s0 = new C1407s0(c1383g0.f3676Y, c1383g0.f3678o0, c17280aM18975a, c1268j, c1331i0, c0155b1, c1335k0, c1335k1, z10, c1331i1, c1315a0, z11, c1383g0.f3679p0, c1383g0.f3680q0, new C0155B1(c13421l2, this, abstractC1391k0, 7), new C1315A0(0, abstractC1391k0, this, c13421l2));
            str2 = renderProps.f3715i;
            if (str2 == null) {
                str3 = str;
            } else {
                str3 = str2;
            }
            str4 = renderProps.f3716j;
            if (str4 == null) {
                str4 = "Gps permission are required to verify your identity";
            }
            String str17 = str4;
            String string9 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, AbstractC8012V5.m8329b(context));
            string = renderProps.f3721o;
            if (string == null) {
                string = context.getString(R.string.pi2_permissions_continue);
                AbstractC16544l.m18093f(string, str10);
            }
            String str18 = string;
            string2 = renderProps.f3718l;
            if (string2 == null) {
                string2 = context.getString(R.string.pi2_permissions_continue);
                AbstractC16544l.m18093f(string2, str10);
            }
            String str19 = string2;
            AbstractC16544l.m18091d(string9);
            return AbstractC8367f0.m8940c(c1407s0, c13421l, c1383g0.f3685v0, enumC8334D2, z14, str3, str17, string9, str18, str19, renderProps.f3719m, renderProps.f3720n, renderProps.f3718l, this.f3605g, renderProps.f3722p, c1383g0.f3688y0, new C1325F0(this, c13421l, z14, abstractC1391k0, 0));
        }
        str = str9;
        c17062e = renderProps.f3714h;
        if (c17062e.f54535Z == EnumC17061d.f54530Y) {
            enumC8334D = EnumC8334D.f25985o0;
        } else {
            enumC8334D = EnumC8334D.f25986p0;
        }
        EnumC8334D enumC8334D3 = enumC8334D;
        if (c17062e.f54534Y == EnumC17058a.f54522Z) {
            z6 = true;
        } else {
            z6 = false;
        }
        C17280a c17280aM18975a2 = c17282c.m18975a();
        C1268j c1268j2 = new C1268j(this, renderState, renderProps, c13421l, 1);
        C1331I0 c1331i2 = new C1331I0(c13421l2, this, 0);
        C0155B1 c0155b2 = new C0155B1(c13421l2, this, renderProps, 6);
        AbstractC1391k0 abstractC1391k1 = renderState;
        C1335K0 c1335k2 = new C1335K0(0, abstractC1391k1, this, c13421l2);
        C1335K0 c1335k3 = new C1335K0(1, abstractC1391k1, this, c13421l2);
        c1383g0 = c1383g1;
        if (c1383g0.f3682s0) {
            z10 = false;
        } else {
            z10 = false;
        }
        C1331I0 c1331i3 = new C1331I0(c13421l2, this, 1);
        C1315A0 c1315a1 = new C1315A0(1, abstractC1391k1, this, c13421l2);
        if (interfaceC1389j0 == null) {
            z11 = true;
        } else {
            z11 = true;
        }
        boolean z15 = z6;
        C1407s0 c1407s1 = new C1407s0(c1383g0.f3676Y, c1383g0.f3678o0, c17280aM18975a2, c1268j2, c1331i2, c0155b2, c1335k2, c1335k3, z10, c1331i3, c1315a1, z11, c1383g0.f3679p0, c1383g0.f3680q0, new C0155B1(c13421l2, this, abstractC1391k1, 7), new C1315A0(0, abstractC1391k1, this, c13421l2));
        str2 = renderProps.f3715i;
        if (str2 == null) {
            str3 = str;
        } else {
            str3 = str2;
        }
        str4 = renderProps.f3716j;
        if (str4 == null) {
            str4 = "Gps permission are required to verify your identity";
        }
        String str110 = str4;
        String string10 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, AbstractC8012V5.m8329b(context));
        string = renderProps.f3721o;
        if (string == null) {
            string = context.getString(R.string.pi2_permissions_continue);
            AbstractC16544l.m18093f(string, str10);
        }
        String str111 = string;
        string2 = renderProps.f3718l;
        if (string2 == null) {
            string2 = context.getString(R.string.pi2_permissions_continue);
            AbstractC16544l.m18093f(string2, str10);
        }
        String str112 = string2;
        AbstractC16544l.m18091d(string10);
        return AbstractC8367f0.m8940c(c1407s1, c13421l, c1383g0.f3685v0, enumC8334D3, z15, str3, str110, string10, str111, str112, renderProps.f3719m, renderProps.f3720n, renderProps.f3718l, this.f3605g, renderProps.f3722p, c1383g0.f3688y0, new C1325F0(this, c13421l, z15, abstractC1391k1, 0));
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC1391k0 state = (AbstractC1391k0) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }
}
