package p1156zj;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import fk.InterfaceC13680a;
import id.C14970i;
import io.sentry.android.core.C15254r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import mk.C17282c;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import p001A.C0017I0;
import p002A0.C0122V;
import p003A1.C0155B1;
import p003A1.C0286s;
import p006A4.C0350k;
import p017Af.C0488s;
import p021Aj.C0517b;
import p021Aj.C0519d;
import p021Aj.C0520e;
import p021Aj.C0522g;
import p021Aj.C0523h;
import p021Aj.C0524i;
import p021Aj.C0525j;
import p021Aj.C0526k;
import p021Aj.C0532q;
import p025An.C0644w;
import p026Ao.C0678l;
import p042Bf.C1268j;
import p045Bj.C1305c;
import p045Bj.C1306d;
import p045Bj.C1307e;
import p045Bj.C1308f;
import p045Bj.C1310h;
import p045Bj.C1311i;
import p045Bj.C1313k;
import p092Dc.C1992i;
import p1131yj.InterfaceC21546a;
import p117Eb.C2391u;
import p125Ej.C2561e;
import p125Ej.C2562f;
import p125Ej.C2563g;
import p126Ek.C2574g;
import p126Ek.InterfaceC2568a;
import p140Fa.C2685e;
import p149Fj.C2891y;
import p149Fj.C2892z;
import p149Fj.EnumC2883q;
import p149Fj.InterfaceC2881o;
import p150Fk.AbstractC2894b;
import p173Gj.C3094a;
import p173Gj.C3095b;
import p173Gj.C3096c;
import p173Gj.C3097d;
import p173Gj.EnumC3098e;
import p225Im.C3743B;
import p247Jj.C4373B;
import p248Jk.InterfaceC4478i;
import p385Pj.C6435j;
import p408Qj.C6742h;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p530Vi.AbstractC8301I;
import p531Vj.AbstractC8367f0;
import p531Vj.C8361c0;
import p531Vj.EnumC8334D;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9306j0;
import p658b5.C11238i;
import p658b5.C11248s;
import p720e6.C13288c;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p729ej.C13424o;
import p729ej.C13426q;
import p729ej.InterfaceC13427r;
import p769gj.C14172n;
import p770gk.InterfaceC14185a;
import p838jj.C16224e;
import p838jj.C16229j;
import p838jj.EnumC16225f;
import p839jk.C16251h;
import p839jk.C16253j;
import p839jk.C16254k;
import p839jk.C16255l;
import p839jk.C16256m;
import p839jk.C16257n;
import p839jk.C16258o;
import p839jk.C16259p;
import p839jk.C16260q;
import p839jk.C16264u;
import p839jk.InterfaceC16261r;
import p856kk.C16433a;
import p860l0.C16663C;
import p864l5.InterfaceC16818e;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p931ok.C18226g;
import p931ok.EnumC18225f;
import p949pj.C18433F;
import p949pj.C18438K;
import p993rj.C19026F;
import p994rk.C19067A1;
import sj.C19661b;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22107K0 extends AbstractC13422m implements InterfaceC13680a {

    /* JADX INFO: renamed from: a */
    public final Context f69875a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16818e f69876b;

    /* JADX INFO: renamed from: c */
    public final C2892z f69877c;

    /* JADX INFO: renamed from: d */
    public final C6435j f69878d;

    /* JADX INFO: renamed from: e */
    public final C2391u f69879e;

    /* JADX INFO: renamed from: f */
    public final C11238i f69880f;

    /* JADX INFO: renamed from: g */
    public final C1313k f69881g;

    /* JADX INFO: renamed from: h */
    public final C11248s f69882h;

    /* JADX INFO: renamed from: i */
    public final C0526k f69883i;

    /* JADX INFO: renamed from: j */
    public final C19661b f69884j;

    /* JADX INFO: renamed from: k */
    public final C17282c f69885k;

    /* JADX INFO: renamed from: l */
    public final C16251h f69886l;

    /* JADX INFO: renamed from: m */
    public final C2685e f69887m;

    public C22107K0(Context context, InterfaceC16818e imageLoader, C2892z submitVerificationWorkerFactory, C6435j c6435j, C2391u c2391u, C11238i c11238i, C1313k c1313k, C11248s c11248s, C0526k c0526k, C19661b c19661b, C17282c navigationStateManager, C16251h externalEventLogger) throws IllegalAccessException, InstantiationException {
        Class<?> cls;
        AbstractC16544l.m18094g(imageLoader, "imageLoader");
        AbstractC16544l.m18094g(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        AbstractC16544l.m18094g(externalEventLogger, "externalEventLogger");
        this.f69875a = context;
        this.f69876b = imageLoader;
        this.f69877c = submitVerificationWorkerFactory;
        this.f69878d = c6435j;
        this.f69879e = c2391u;
        this.f69880f = c11238i;
        this.f69881g = c1313k;
        this.f69882h = c11248s;
        this.f69883i = c0526k;
        this.f69884j = c19661b;
        this.f69885k = navigationStateManager;
        this.f69886l = externalEventLogger;
        C17314q c17314q = AbstractC2894b.f8701a;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            cls.newInstance();
        }
        this.f69887m = new C2685e();
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        C22195t0 props = (C22195t0) obj;
        AbstractC16544l.m18094g(props, "props");
        Parcelable parcelable = null;
        if (c13420k != null) {
            C0678l c0678lM14962a = c13420k.m14962a();
            if (c0678lM14962a.mo1372d() <= 0) {
                c0678lM14962a = null;
            }
            if (c0678lM14962a != null) {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                byte[] bArrMo1382q = c0678lM14962a.mo1382q();
                parcelObtain.unmarshall(bArrMo1382q, 0, bArrMo1382q.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable2 = parcelObtain.readParcelable(C13420k.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable2);
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            parcelable = (AbstractC22180o0) parcelable;
        }
        if (parcelable != null) {
            return parcelable;
        }
        C0517b c0517b = props.f70354t;
        if (c0517b.f1657Y) {
            this.f69887m.getClass();
            if (!C2685e.m3660i(props)) {
                boolean z6 = props.f70343i.size() > 1;
                C17689w c17689w = C17689w.f56480Y;
                return z6 ? new C22150e0(new C22139a1(EnumC22128V0.Front), c17689w, c17689w, 0, new C22173m(c0517b), false, null, null) : new C22177n0(new C22139a1(EnumC22128V0.Front), c17689w, new C22173m(c0517b), EnumC22169k1.f70147Z, c17689w, 0, null, EnumC3098e.f9323o0, props.f70351q.f40641d, null, false, false, null, null, 15872);
            }
        }
        return new C22171l0();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0298  */
    /* JADX WARN: Code duplicated, block: B:155:0x0484 A[PHI: r16 r20 r21
      0x0484: PHI (r16v12 java.util.ArrayList) = 
      (r16v6 java.util.ArrayList)
      (r16v6 java.util.ArrayList)
      (r16v6 java.util.ArrayList)
      (r16v6 java.util.ArrayList)
      (r16v6 java.util.ArrayList)
      (r16v13 java.util.ArrayList)
      (r16v13 java.util.ArrayList)
      (r16v13 java.util.ArrayList)
      (r16v13 java.util.ArrayList)
      (r16v13 java.util.ArrayList)
      (r16v15 java.util.ArrayList)
      (r16v16 java.util.ArrayList)
     binds: [B:186:0x04ee, B:189:0x04f3, B:192:0x04f8, B:195:0x04fd, B:198:0x0502, B:170:0x04bd, B:173:0x04c2, B:176:0x04c7, B:179:0x04cc, B:182:0x04d1, B:166:0x049e, B:154:0x0482] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r20v13 java.lang.String) = 
      (r20v7 java.lang.String)
      (r20v7 java.lang.String)
      (r20v7 java.lang.String)
      (r20v7 java.lang.String)
      (r20v7 java.lang.String)
      (r20v14 java.lang.String)
      (r20v14 java.lang.String)
      (r20v14 java.lang.String)
      (r20v14 java.lang.String)
      (r20v14 java.lang.String)
      (r20v16 java.lang.String)
      (r20v17 java.lang.String)
     binds: [B:186:0x04ee, B:189:0x04f3, B:192:0x04f8, B:195:0x04fd, B:198:0x0502, B:170:0x04bd, B:173:0x04c2, B:176:0x04c7, B:179:0x04cc, B:182:0x04d1, B:166:0x049e, B:154:0x0482] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r21v10 zj.T0) = 
      (r21v6 zj.T0)
      (r21v6 zj.T0)
      (r21v6 zj.T0)
      (r21v6 zj.T0)
      (r21v6 zj.T0)
      (r21v11 zj.T0)
      (r21v11 zj.T0)
      (r21v11 zj.T0)
      (r21v11 zj.T0)
      (r21v11 zj.T0)
      (r21v13 zj.T0)
      (r21v14 zj.T0)
     binds: [B:186:0x04ee, B:189:0x04f3, B:192:0x04f8, B:195:0x04fd, B:198:0x0502, B:170:0x04bd, B:173:0x04c2, B:176:0x04c7, B:179:0x04cc, B:182:0x04d1, B:166:0x049e, B:154:0x0482] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:334:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:370:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:371:0x0e0b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0e0f  */
    /* JADX WARN: Code duplicated, block: B:374:0x0e11  */
    /* JADX WARN: Code duplicated, block: B:376:0x0e15  */
    /* JADX WARN: Code duplicated, block: B:377:0x0e17  */
    /* JADX WARN: Code duplicated, block: B:379:0x0e1b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0e1d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0e21  */
    /* JADX WARN: Code duplicated, block: B:383:0x0e24  */
    /* JADX WARN: Code duplicated, block: B:385:0x0e28  */
    /* JADX WARN: Code duplicated, block: B:386:0x0e2a  */
    /* JADX WARN: Code duplicated, block: B:388:0x0e2e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0e30  */
    /* JADX WARN: Code duplicated, block: B:391:0x0e34  */
    /* JADX WARN: Code duplicated, block: B:392:0x0e36  */
    /* JADX WARN: Code duplicated, block: B:394:0x0e3a  */
    /* JADX WARN: Code duplicated, block: B:395:0x0e3c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0e40  */
    /* JADX WARN: Code duplicated, block: B:398:0x0e42  */
    /* JADX WARN: Code duplicated, block: B:400:0x0e46  */
    /* JADX WARN: Code duplicated, block: B:402:0x0e49  */
    /* JADX WARN: Code duplicated, block: B:404:0x0e51  */
    /* JADX WARN: Code duplicated, block: B:405:0x0e53  */
    /* JADX WARN: Code duplicated, block: B:407:0x0e57  */
    /* JADX WARN: Code duplicated, block: B:408:0x0e59  */
    /* JADX WARN: Code duplicated, block: B:410:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:411:0x0e5f  */
    /* JADX WARN: Code duplicated, block: B:413:0x0e63  */
    /* JADX WARN: Code duplicated, block: B:414:0x0e65  */
    /* JADX WARN: Code duplicated, block: B:416:0x0e69  */
    /* JADX WARN: Code duplicated, block: B:417:0x0e6b  */
    /* JADX WARN: Code duplicated, block: B:419:0x0e6f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0e71  */
    /* JADX WARN: Code duplicated, block: B:422:0x0e75  */
    /* JADX WARN: Code duplicated, block: B:423:0x0e77  */
    /* JADX WARN: Code duplicated, block: B:425:0x0e7b  */
    /* JADX WARN: Code duplicated, block: B:426:0x0e7d  */
    /* JADX WARN: Code duplicated, block: B:428:0x0e81  */
    /* JADX WARN: Code duplicated, block: B:429:0x0e83  */
    /* JADX WARN: Code duplicated, block: B:431:0x0e87  */
    /* JADX WARN: Code duplicated, block: B:432:0x0e89  */
    /* JADX WARN: Code duplicated, block: B:434:0x0e8d  */
    /* JADX WARN: Code duplicated, block: B:436:0x0e91  */
    /* JADX WARN: Code duplicated, block: B:444:0x0ec6  */
    /* JADX WARN: Code duplicated, block: B:451:0x0ee0  */
    /* JADX WARN: Code duplicated, block: B:452:0x0ee3  */
    /* JADX WARN: Code duplicated, block: B:455:0x0ee9  */
    /* JADX WARN: Code duplicated, block: B:457:0x0eef  */
    /* JADX WARN: Code duplicated, block: B:85:0x025c  */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.Map] */
    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        InterfaceC16261r c16256m;
        VideoCaptureConfig videoCaptureConfig;
        boolean z6;
        boolean z10;
        C13421l c13421l2;
        Context context;
        C2685e videoCaptureHelper;
        AbstractC22180o0 abstractC22180o0;
        Object next;
        Iterable iterable;
        Object next2;
        C22130W0 c22130w0;
        Object c22166j1;
        C22107K0 c22107k0;
        boolean z11;
        C2685e c2685e;
        boolean z12;
        String str;
        String str2;
        EnumC22128V0 enumC22128V0;
        EnumC22128V0 enumC22128V1;
        C2685e c2685e2;
        Context context2;
        C22195t0 c22195t0;
        String str3;
        ArrayList arrayList;
        String str4;
        C22124T0 c22124t0;
        CaptureTipsViewModel captureTipsViewModel;
        String str5;
        String str6;
        String str7;
        String str8;
        CaptureTipsViewModel captureTipsViewModel2;
        ArrayList arrayList2;
        AbstractC22180o0 abstractC22180o1;
        boolean z13;
        VideoCaptureConfig videoCaptureConfig2;
        C6742h c6742h;
        Context context3;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Context context4;
        String str14;
        UiComponentConfig.RemoteImage idFrontPictograph;
        UiComponentConfig.RemoteImage remoteImage;
        int i10;
        int i11;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        String str15;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        VideoCaptureConfig videoCaptureConfig3;
        boolean z34;
        EnumC18225f enumC18225f;
        C22195t0 renderProps = (C22195t0) obj;
        AbstractC22180o0 renderState = (AbstractC22180o0) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        C15254r c15254r = new C15254r(c13421l, 8, this);
        boolean z35 = renderProps.f70353s;
        boolean z36 = z35 && !(renderState instanceof C22174m0);
        C17282c c17282c = this.f69885k;
        c17282c.f55098d = renderProps.f70341g;
        c17282c.f55099e = renderProps.f70342h;
        c17282c.f55100f = z36;
        c17282c.m18976b();
        boolean z37 = renderState instanceof C22144c0;
        if (z37) {
            c16256m = C16253j.f50381a;
        } else if (renderState instanceof C22147d0) {
            c16256m = C16254k.f50382a;
        } else if (renderState instanceof C22171l0) {
            c16256m = C16259p.f50387a;
        } else if (renderState instanceof C22150e0) {
            c16256m = new C16258o(((C22150e0) renderState).f70027q0);
        } else if (renderState instanceof C22177n0 ? true : renderState instanceof C22153f0 ? true : renderState instanceof C22156g0 ? true : renderState instanceof C22159h0) {
            c16256m = new C16260q(renderState.mo22379f());
        } else if (renderState instanceof C22162i0) {
            c16256m = new C16255l(((C22162i0) renderState).f70085s0);
        } else if (renderState instanceof C22168k0) {
            c16256m = new C16256m(((C22168k0) renderState).f70141t0);
        } else {
            if (!(renderState instanceof C22174m0)) {
                throw new C0644w();
            }
            c16256m = C16257n.f50385a;
        }
        this.f69886l.m17811a(new C16264u(renderProps.f70339e, c16256m));
        boolean z38 = renderState instanceof C22171l0;
        Context context5 = this.f69875a;
        VideoCaptureConfig videoCaptureConfig4 = renderProps.f70351q;
        NextStep.GovernmentId.AssetConfig assetConfig = renderProps.f70352r;
        C22192s0 c22192s0 = renderProps.f70345k;
        C2685e videoCaptureHelper2 = this.f69887m;
        LinkedHashMap linkedHashMap = c22192s0.f70305o;
        if (z38) {
            videoCaptureConfig = videoCaptureConfig4;
            z6 = z37;
            c13421l.mo3410z("check_if_single_id_class", new C22099G0(renderProps, this, renderState, c13421l, null));
            ArrayList<C22130W0> arrayList3 = renderProps.f70337c;
            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
            for (C22130W0 c22130w1 : arrayList3) {
                EnumC22136Z0 enumC22136Z0 = c22130w1.f69958Z;
                String str16 = c22130w1.f69957Y;
                String str17 = (String) linkedHashMap.get(str16);
                if (str17 != null) {
                    str16 = str17;
                }
                arrayList4.add(new C22203w(enumC22136Z0, c22130w1, str16));
            }
            c22166j1 = new C22175m1(c22192s0.f70288a, c22192s0.f70290b, c22192s0.f70292c, c22192s0.f70294d, arrayList4, c17282c.m18975a(), new C22105J0(c13421l, renderState, renderProps, this), renderProps.f70344j, assetConfig.getSelectPage(), renderProps.f70353s, new C22097F0(c13421l, this, 4), new C0519d(c13421l, 10), ((C22171l0) renderState).f70170t0, new C22093D0(c13421l, this, renderState, 3));
            c22107k0 = this;
            abstractC22180o0 = renderState;
            c13421l2 = c13421l;
            z10 = z38;
            c2685e = videoCaptureHelper2;
            context = context5;
        } else {
            videoCaptureConfig = videoCaptureConfig4;
            z6 = z37;
            if (!(renderState instanceof C22150e0)) {
                boolean z39 = renderState instanceof C22177n0;
                C1313k c1313k = this.f69881g;
                C17689w c17689w = C17689w.f56480Y;
                C17282c c17282c2 = (C17282c) c1313k.f3474i;
                C2563g c2563g = (C2563g) c1313k.f3470e;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (z39) {
                    C22177n0 c22177n0 = (C22177n0) renderState;
                    AbstractC16544l.m18094g(videoCaptureHelper2, "videoCaptureHelper");
                    C22139a1 c22139a1 = c22177n0.f70232Z;
                    EnumC22128V0 enumC22128V2 = c22139a1.f69986Y;
                    InterfaceC22179o interfaceC22179o = c22177n0.f70234p0;
                    C22124T0 c22124t0M22367d = AbstractC22121S.m22367d(interfaceC22179o, enumC22128V2);
                    String strM22366c = AbstractC22121S.m22366c(interfaceC22179o);
                    boolean z40 = interfaceC22179o instanceof C22173m;
                    C2562f c2562f = ((C22102I) c1313k.f3469d).f69865a;
                    Context contextM5169a = C4373B.m5169a(c2562f.f7994a.f14241b);
                    C18438K c18438k = (C18438K) c2562f.f7995b.get();
                    EnumC22128V0 enumC22128V3 = c22139a1.f69986Y;
                    AbstractC8215v5.m8843e(c13421l, new C22100H(contextM5169a, c18438k, enumC22128V3, strM22366c), AbstractC16526C.m18075c(C22100H.class), "", new C0122V(c22177n0, 11, interfaceC22179o));
                    C2562f c2562f2 = c2563g.f7996a;
                    AbstractC8215v5.m8843e(c13421l, new C2561e(C4373B.m5169a(c2562f2.f7994a.f14241b), (C18438K) c2562f2.f7995b.get(), enumC22128V3), AbstractC16526C.m18075c(C2561e.class), "", C1305c.f3444o0);
                    EnumC19999a enumC19999aM3662l = C2685e.m3662l(renderProps);
                    EnumC19999a enumC19999a = EnumC19999a.f63314Y;
                    boolean z41 = enumC19999aM3662l == enumC19999a;
                    C22126U0 c22126u0 = c22124t0M22367d.f69939q0;
                    if (c22126u0.f69941Y && !z41) {
                        C13426q c13426q = InterfaceC13427r.f42512a;
                        long jM8916g = AbstractC8301I.m8916g(c22126u0.f69942Z, 0L);
                        c13426q.getClass();
                        C13424o c13424o = new C13424o(jM8916g, "");
                        C1310h c1310h = new C1310h(c22177n0, 2);
                        C3743B c3743b = C3743B.f11391c;
                        AbstractC8215v5.m8843e(c13421l, c13424o, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C17296C.class))), c22124t0M22367d.f69935Y, c1310h);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Context context6 = (Context) c1313k.f3467b;
                    if (c22177n0.f70241w0 != null) {
                        Map mapM19258c = AbstractC17660E.m19258c(new C17309l(EnumC16225f.f50340Y, context6.getString(R.string.ok)));
                        String string = context6.getString(com.openai.chatgpt.R.string.pi2_error_image_capture_failed);
                        AbstractC16544l.m18093f(string, "getString(...)");
                        arrayList5.add(new C16229j(mapM19258c, string, new C1311i(c13421l, 0)));
                    }
                    String strM22356c = AbstractC22120R0.m22356c(c22192s0, enumC22128V3, strM22366c);
                    if (!z40 || (str3 = c22192s0.f70293c0) == null) {
                        StringBuilder sb2 = new StringBuilder();
                        String str18 = enumC22128V3.f69952Y;
                        sb2.append(str18);
                        sb2.append("-");
                        sb2.append(strM22366c);
                        String string2 = sb2.toString();
                        LinkedHashMap linkedHashMap3 = c22192s0.f70296f;
                        str3 = (String) linkedHashMap3.get(string2);
                        if (str3 == null && (str3 = (String) linkedHashMap3.get(str18)) == null) {
                            str3 = "";
                        }
                    }
                    String str19 = str3;
                    EnumC2883q enumC2883qM22365b = AbstractC22121S.m22365b(interfaceC22179o);
                    C17280a c17280aM18975a = c17282c2.m18975a();
                    List list = c22124t0M22367d.f69938p0.f69932Y.f58917Y;
                    C1311i c1311i = new C1311i(c13421l, 5);
                    EnumC19999a enumC19999aM3662l2 = C2685e.m3662l(renderProps);
                    String strM22358e = AbstractC22120R0.m22358e(c22192s0, c22177n0.f70244z0);
                    int iOrdinal = enumC22128V3.ordinal();
                    String str20 = c22192s0.f70269H;
                    if (iOrdinal == 0) {
                        arrayList = arrayList5;
                        str4 = "";
                        c22124t0 = c22124t0M22367d;
                        if (str20 == null || (str5 = c22192s0.f70274M) == null || (str6 = c22192s0.f70275N) == null || (str7 = c22192s0.f70276O) == null || (str8 = c22192s0.f70277P) == null) {
                            captureTipsViewModel2 = null;
                        } else {
                            captureTipsViewModel = new CaptureTipsViewModel(str20, str5, str6, str7, str8, enumC22128V3);
                            captureTipsViewModel2 = captureTipsViewModel;
                        }
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            arrayList = arrayList5;
                            str4 = "";
                            c22124t0 = c22124t0M22367d;
                            captureTipsViewModel = null;
                        } else if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                throw new C0644w();
                            }
                            arrayList = arrayList5;
                            str4 = "";
                            c22124t0 = c22124t0M22367d;
                            captureTipsViewModel = null;
                        } else {
                            if (str20 == null || (str13 = c22192s0.f70270I) == null) {
                                arrayList = arrayList5;
                            } else {
                                arrayList = arrayList5;
                                String str21 = c22192s0.f70271J;
                                if (str21 != null) {
                                    str4 = "";
                                    String str22 = c22192s0.f70272K;
                                    if (str22 != null) {
                                        c22124t0 = c22124t0M22367d;
                                        String str23 = c22192s0.f70273L;
                                        if (str23 != null) {
                                            captureTipsViewModel = new CaptureTipsViewModel(str20, str13, str21, str22, str23, enumC22128V3);
                                        }
                                    }
                                    captureTipsViewModel2 = null;
                                }
                                c22124t0 = c22124t0M22367d;
                                captureTipsViewModel2 = null;
                            }
                            str4 = "";
                            c22124t0 = c22124t0M22367d;
                            captureTipsViewModel2 = null;
                        }
                        captureTipsViewModel2 = captureTipsViewModel;
                    } else {
                        arrayList = arrayList5;
                        str4 = "";
                        c22124t0 = c22124t0M22367d;
                        if (str20 == null || (str9 = c22192s0.f70278Q) == null || (str10 = c22192s0.f70279R) == null || (str11 = c22192s0.f70280S) == null || (str12 = c22192s0.f70281T) == null) {
                            captureTipsViewModel2 = null;
                        } else {
                            captureTipsViewModel = new CaptureTipsViewModel(str20, str9, str10, str11, str12, enumC22128V3);
                            captureTipsViewModel2 = captureTipsViewModel;
                        }
                    }
                    z10 = z38;
                    ArrayList arrayList6 = arrayList;
                    String str24 = str4;
                    C22172l1 c22172l1M22376a = AbstractC22141b0.m22376a(renderProps, strM22356c, str19, c22177n0.f70235q0, c22124t0.f69937o0, enumC2883qM22365b, c22139a1.f69986Y, c17280aM18975a, new C0488s(c22177n0, interfaceC22179o, c1313k, renderProps, c13421l, videoCaptureHelper2, 2), new C1306d(c15254r, 1), new C0520e(c13421l, videoCaptureHelper2, 5), false, list, c22177n0, c22177n0.f70237s0, (C18433F) c1313k.f3472g, (C19026F) c1313k.f3473h, null, new C1311i(c13421l, 1), c1311i, enumC19999aM3662l2, false, false, null, new C0286s(c13421l, 12, c22177n0), new C1308f(c1313k, c13421l, renderProps, videoCaptureHelper2, 1), 0, strM22358e, captureTipsViewModel2, 165806080);
                    C8361c0 c8361c0 = (C8361c0) c1313k.f3468c;
                    if (c22177n0.f70242x0) {
                        EnumC8334D enumC8334D = EnumC8334D.f25983Y;
                        String str25 = c22192s0.f70314x;
                        if (str25 == null) {
                            str25 = str24;
                        }
                        String string3 = c22192s0.f70315y;
                        if (string3 == null) {
                            context3 = context6;
                            string3 = context3.getString(com.openai.chatgpt.R.string.pi2_governmentid_camera_permission_rationale);
                            AbstractC16544l.m18093f(string3, "getString(...)");
                        } else {
                            context3 = context6;
                        }
                        String str26 = string3;
                        String string4 = context3.getString(com.openai.chatgpt.R.string.pi2_governmentid_camera_permission_denied_rationale, AbstractC8012V5.m8329b(context3));
                        AbstractC16544l.m18093f(string4, "getString(...)");
                        C1311i c1311i2 = new C1311i(c13421l, 7);
                        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = renderProps.f70344j;
                        arrayList2 = arrayList6;
                        String str27 = str25;
                        abstractC22180o1 = renderState;
                        z13 = true;
                        c13421l = c13421l;
                        c6742h = AbstractC8367f0.m8940c(c22172l1M22376a, c13421l, true, enumC8334D, false, str27, str26, string4, c22192s0.f70316z, c22192s0.f70262A, null, null, null, c8361c0, governmentIdStepStyle, (19976 & 16384) != 0 ? "" : null, c1311i2);
                        videoCaptureConfig2 = videoCaptureConfig;
                    } else {
                        arrayList2 = arrayList6;
                        abstractC22180o1 = renderState;
                        z13 = true;
                        if (c22177n0.f70243y0 && C2685e.m3660i(renderProps) && AbstractC8012V5.m8333f(context6)) {
                            videoCaptureConfig2 = videoCaptureConfig;
                            if (videoCaptureConfig2.f40642e) {
                                EnumC8334D enumC8334D2 = EnumC8334D.f25984Z;
                                String str28 = c22192s0.f70263B;
                                if (str28 != null) {
                                    str24 = str28;
                                }
                                String string5 = c22192s0.f70264C;
                                if (string5 == null) {
                                    string5 = context6.getString(com.openai.chatgpt.R.string.pi2_selfie_mic_permission_rationale);
                                    AbstractC16544l.m18093f(string5, "getString(...)");
                                }
                                String string6 = context6.getString(com.openai.chatgpt.R.string.pi2_selfie_mic_permission_denied_rationale, AbstractC8012V5.m8329b(context6));
                                AbstractC16544l.m18093f(string6, "getString(...)");
                                c13421l = c13421l;
                                c6742h = AbstractC8367f0.m8940c(c22172l1M22376a, c13421l, true, enumC8334D2, false, str24, string5, string6, c22192s0.f70265D, c22192s0.f70266E, null, null, null, c8361c0, renderProps.f70344j, (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new C1311i(c13421l, 6));
                            }
                        } else {
                            videoCaptureConfig2 = videoCaptureConfig;
                        }
                        if (C2685e.m3662l(renderProps) == enumC19999a && c22177n0.f70239u0 == EnumC3098e.f9323o0) {
                            AbstractC8215v5.m8843e(c13421l, new C2574g((InterfaceC2568a) ((C13288c) c1313k.f3471f).f42001Y, videoCaptureConfig2.f40641d), AbstractC16526C.m18075c(C2574g.class), str24, new C1307e(c1313k, c22177n0, renderProps, c13421l));
                            c6742h = new C6742h(c22172l1M22376a, "PermissionFlowModal", c17689w);
                        } else {
                            c6742h = new C6742h(c22172l1M22376a, "PermissionFlowModal", c17689w);
                        }
                    }
                    C16224e c16224e = new C16224e(c6742h, arrayList2);
                    c22107k0 = this;
                    z12 = z13;
                    videoCaptureConfig = videoCaptureConfig2;
                    c22166j1 = c16224e;
                    c13421l2 = c13421l;
                    context = context5;
                    c2685e = videoCaptureHelper2;
                    z11 = false;
                    abstractC22180o0 = abstractC22180o1;
                } else {
                    z10 = z38;
                    if (renderState instanceof C22153f0) {
                        C22153f0 c22153f0 = (C22153f0) renderState;
                        AbstractC16544l.m18094g(videoCaptureHelper2, "videoCaptureHelper");
                        C22139a1 c22139a2 = c22153f0.f70037Z;
                        EnumC22128V0 enumC22128V4 = c22139a2.f69986Y;
                        InterfaceC22179o interfaceC22179o2 = c22153f0.f70039p0;
                        C22124T0 c22124t0M22367d2 = AbstractC22121S.m22367d(interfaceC22179o2, enumC22128V4);
                        C2562f c2562f3 = c2563g.f7996a;
                        Context contextM5169a2 = C4373B.m5169a(c2562f3.f7994a.f14241b);
                        C18438K c18438k2 = (C18438K) c2562f3.f7995b.get();
                        EnumC22128V0 enumC22128V5 = c22139a2.f69986Y;
                        AbstractC8215v5.m8843e(c13421l, new C2561e(contextM5169a2, c18438k2, enumC22128V5), AbstractC16526C.m18075c(C2561e.class), "", C1305c.f3443Z);
                        c22166j1 = new C16224e(new C6742h(AbstractC22141b0.m22376a(renderProps, AbstractC22120R0.m22356c(c22192s0, enumC22128V5, AbstractC22121S.m22366c(interfaceC22179o2)), c22192s0.f70297g, EnumC22169k1.f70146Y, c22124t0M22367d2.f69937o0, AbstractC22121S.m22365b(interfaceC22179o2), c22139a2.f69986Y, c17282c2.m18975a(), null, new C1306d(c15254r, 0), new C0520e(c13421l, videoCaptureHelper2, 3), true, c22124t0M22367d2.f69938p0.f69932Y.f58917Y, c22153f0, c22153f0.f70042s0, (C18433F) c1313k.f3472g, (C19026F) c1313k.f3473h, new C0350k(c22153f0, c1313k, renderProps, c13421l, videoCaptureHelper2, 2), new C1307e(c13421l, c22153f0, renderProps, videoCaptureHelper2, 0), new C1311i(c13421l, 5), C2685e.m3662l(renderProps), false, false, null, null, new C1308f(c1313k, c13421l, renderProps, videoCaptureHelper2, 0), renderProps.f70346l - 1, AbstractC22120R0.m22358e(c22192s0, c22153f0.f70044u0), null, 601882880), "PermissionFlowModal", c17689w));
                        c22107k0 = this;
                        c2685e = videoCaptureHelper2;
                        c13421l2 = c13421l;
                        abstractC22180o0 = renderState;
                        videoCaptureConfig = videoCaptureConfig;
                        context = context5;
                    } else {
                        c13421l2 = c13421l;
                        boolean z42 = renderState instanceof C22162i0;
                        C11248s c11248s = this.f69882h;
                        if (z42) {
                            C22162i0 c22162i0 = (C22162i0) renderState;
                            C22139a1 c22139a3 = c22162i0.f70080Z;
                            EnumC22128V0 enumC22128V6 = c22139a3.f69986Y;
                            InterfaceC22179o interfaceC22179o3 = c22162i0.f70082p0;
                            C22124T0 c22124t0M22367d3 = AbstractC22121S.m22367d(interfaceC22179o3, enumC22128V6);
                            C22205x c22205x = (C22205x) AbstractC17680n.m19341Q(c22162i0.f70083q0.mo22349j0());
                            boolean z43 = c22162i0.f70089w0;
                            if (z43) {
                                videoCaptureConfig = videoCaptureConfig;
                                c22195t0 = renderProps;
                                AbstractC22121S.m22370g(c22195t0, (AbstractC22165j0) renderState, c13421l2, videoCaptureHelper2, c11248s);
                            } else {
                                videoCaptureConfig = videoCaptureConfig;
                                c22195t0 = renderProps;
                            }
                            String selectedId = AbstractC22121S.m22366c(interfaceC22179o3);
                            EnumC22128V0 side = c22139a3.f69986Y;
                            AbstractC16544l.m18094g(side, "side");
                            AbstractC16544l.m18094g(selectedId, "selectedId");
                            StringBuilder sb3 = new StringBuilder();
                            String str29 = side.f69952Y;
                            sb3.append(str29);
                            sb3.append("-");
                            sb3.append(selectedId);
                            String string7 = sb3.toString();
                            LinkedHashMap linkedHashMap4 = c22192s0.f70298h;
                            String str30 = (String) linkedHashMap4.get(string7);
                            String str31 = (str30 == null && (str30 = (String) linkedHashMap4.get(str29)) == null) ? "" : str30;
                            AbstractC22196t1 abstractC22196t1 = c22124t0M22367d3.f69937o0;
                            EnumC2883q enumC2883qM22365b2 = AbstractC22121S.m22365b(interfaceC22179o3);
                            String str32 = c22205x.f70393Y;
                            C17280a c17280aM18975a2 = c17282c.m18975a();
                            String strM9890i = AbstractC9306j0.m9890i(str29, "-", AbstractC22121S.m22366c(interfaceC22179o3));
                            LinkedHashMap linkedHashMap5 = c22192s0.f70302l;
                            String str33 = (String) linkedHashMap5.get(strM9890i);
                            C16224e c16224e2 = new C16224e(new C6742h(new C22199u1(this.f69876b, str31, c22192s0.f70299i, abstractC22196t1, str32, c22139a3.f69986Y, enumC2883qM22365b2, c17280aM18975a2, new C22095E0(c22195t0, renderState, c13421l, this, 0), c22192s0.f70300j, new C0523h(c13421l, this, renderState, interfaceC22179o3, c22195t0), c22192s0.f70301k, (str33 == null && (str33 = (String) linkedHashMap5.get(str29)) == null) ? "" : str33, new C1306d(c15254r, 2), c22195t0.f70344j, c22162i0.f70088v0, new C22093D0(c13421l2, this, renderState, 1), assetConfig.getCapturePage(), z35 && !z43, c22162i0.f70089w0, c22195t0.f70355u), "PermissionFlowModal", c17689w));
                            c22107k0 = this;
                            c13421l2 = c13421l2;
                            abstractC22180o0 = renderState;
                            z12 = true;
                            context = context5;
                            c2685e = videoCaptureHelper2;
                            z11 = false;
                            c22166j1 = c16224e2;
                        } else if (renderState instanceof C22168k0) {
                            C22168k0 c22168k0 = (C22168k0) renderState;
                            if (c22168k0.f70145x0) {
                                videoCaptureConfig = videoCaptureConfig;
                                c2685e2 = videoCaptureHelper2;
                                AbstractC22121S.m22370g(renderProps, (AbstractC22165j0) renderState, c13421l2, c2685e2, c11248s);
                            } else {
                                videoCaptureConfig = videoCaptureConfig;
                                c2685e2 = videoCaptureHelper2;
                            }
                            C22139a1 c22139a4 = c22168k0.f70135Z;
                            String string8 = (String) c22192s0.f70310t.get(c22139a4.f69986Y);
                            if (string8 == null) {
                                context2 = context5;
                                string8 = context2.getString(com.openai.chatgpt.R.string.pi2_governmentid_review_selected_image_title_default);
                                AbstractC16544l.m18093f(string8, "getString(...)");
                            } else {
                                context2 = context5;
                            }
                            String str34 = string8;
                            String string9 = (String) c22192s0.f70311u.get(c22139a4.f69986Y);
                            if (string9 == null) {
                                string9 = context2.getString(com.openai.chatgpt.R.string.pi2_governmentid_review_selected_image_body_default);
                                AbstractC16544l.m18093f(string9, "getString(...)");
                            }
                            String str35 = string9;
                            InterfaceC22096F interfaceC22096F = c22168k0.f70138q0;
                            C22163i1 c22163i1 = new C22163i1(this.f69876b, str34, str35, c22192s0.f70312v, c22192s0.f70313w, ((C22205x) AbstractC17680n.m19341Q(interfaceC22096F.mo22349j0())).f70393Y, ((C22205x) AbstractC17680n.m19341Q(interfaceC22096F.mo22349j0())).f70394Z, c22168k0.f70139r0, c17282c.m18975a(), new C22095E0(renderProps, renderState, c13421l, this, 1), new C22097F0(c13421l2, this, 1), new C22097F0(c13421l2, this, 2), new C0519d(c13421l2, 9), c22168k0.f70144w0, new C22093D0(c13421l2, this, renderState, 2), renderProps.f70344j, c22168k0.f70145x0);
                            c22107k0 = this;
                            c2685e = c2685e2;
                            c13421l2 = c13421l2;
                            abstractC22180o0 = renderState;
                            context = context2;
                            z12 = true;
                            c22166j1 = c22163i1;
                            z11 = false;
                        } else {
                            context = context5;
                            if (renderState instanceof C22174m0) {
                                videoCaptureConfig = videoCaptureConfig;
                                C22174m0 c22174m0 = (C22174m0) renderState;
                                C0017I0 c0017i0 = this.f69877c.f8699a;
                                AbstractC8215v5.m8843e(c13421l2, new C2891y(C4373B.m5169a(((C4373B) c0017i0.f64Y).f14241b), renderProps.f70335a, renderProps.f70338d, renderProps.f70339e, renderProps.f70340f, (InterfaceC2881o) ((InterfaceC4478i) c0017i0.f65Z).get(), c22174m0.f70213t0, (InterfaceC14185a) ((C1992i) c0017i0.f66o0).get(), (InterfaceC21546a) ((InterfaceC4478i) c0017i0.f67p0).get(), (C16433a) ((InterfaceC4478i) c0017i0.f68q0).get(), c22174m0.f70214u0, c22174m0.f70215v0, (C19661b) ((C14970i) c0017i0.f69r0).get()), AbstractC16526C.m18075c(C2891y.class), "", new C22103I0(this, c13421l2));
                                C22202v1 c22202v1 = new C22202v1(c22192s0.f70303m, c22192s0.f70304n, renderProps.f70344j, assetConfig.getPendingPage(), new C22097F0(this, c13421l2), renderProps.f70356v);
                                c22107k0 = this;
                                c2685e = videoCaptureHelper2;
                                abstractC22180o0 = renderState;
                                z12 = true;
                                z11 = false;
                                c22166j1 = c22202v1;
                                c13421l2 = c13421l2;
                            } else if (renderState instanceof C22156g0) {
                                C22156g0 c22156g0 = (C22156g0) renderState;
                                C2391u c2391u = this.f69879e;
                                AbstractC16544l.m18094g(videoCaptureHelper2, "videoCaptureHelper");
                                c13421l2.mo3410z("finalize_delay", new C3095b(c22156g0, c13421l2, null));
                                C22139a1 c22139a5 = c22156g0.f70052p0;
                                if (!(c22139a5 instanceof C22139a1)) {
                                    videoCaptureConfig = videoCaptureConfig;
                                    c22139a5 = null;
                                }
                                if (c22139a5 == null || (enumC22128V1 = c22139a5.f69986Y) == null) {
                                    enumC22128V1 = EnumC22128V0.Front;
                                }
                                EnumC22128V0 enumC22128V7 = enumC22128V1;
                                C22130W0 c22130w2 = c22156g0.f70050Z;
                                c22166j1 = new C16224e(new C6742h(AbstractC22141b0.m22376a(renderProps, AbstractC22120R0.m22356c(c22192s0, enumC22128V7, c22130w2.f69957Y), c22192s0.f70297g, EnumC22169k1.f70146Y, c22130w2.m22373a(enumC22128V7).f69937o0, c22130w2.f69961q0, enumC22128V7, ((C17282c) c2391u.f7432q0).m18975a(), C3096c.f9315Z, new C0519d(c13421l2, 3), new C0519d(c13421l2, 4), false, c17689w, c22156g0, c22156g0.f70054r0, (C18433F) c2391u.f7430o0, (C19026F) c2391u.f7431p0, null, C3094a.f9308p0, new C1311i(c13421l2, 5), EnumC19999a.f63315Z, true, c22156g0.f70058v0, new C1268j(c22156g0, c13421l, renderProps, videoCaptureHelper2, 5), C3097d.f9318Z, new C0155B1(c2391u, c13421l2, renderProps, 15), 0, null, null, 805437440), "PermissionFlowModal", c17689w));
                                c22107k0 = this;
                                c13421l2 = c13421l2;
                                abstractC22180o0 = renderState;
                                c2685e = videoCaptureHelper2;
                            } else {
                                if (renderState instanceof C22159h0) {
                                    C22159h0 c22159h0 = (C22159h0) renderState;
                                    C11238i c11238i = this.f69880f;
                                    videoCaptureHelper = videoCaptureHelper2;
                                    AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
                                    C22139a1 c22139a6 = c22159h0.f70063Z;
                                    if (!(c22139a6 instanceof C22139a1)) {
                                        videoCaptureConfig = videoCaptureConfig;
                                        c22139a6 = null;
                                    }
                                    if (c22139a6 == null || (enumC22128V0 = c22139a6.f69986Y) == null) {
                                        enumC22128V0 = EnumC22128V0.Front;
                                    }
                                    C22130W0 c22130w3 = c22159h0.f70068s0;
                                    c22166j1 = new C16224e(new C6742h(AbstractC22141b0.m22376a(renderProps, AbstractC22120R0.m22356c(c22192s0, enumC22128V0, c22130w3.f69957Y), c22192s0.f70297g, EnumC22169k1.f70146Y, c22130w3.m22373a(enumC22128V0).f69937o0, c22130w3.f69961q0, enumC22128V0, ((C17282c) c11238i.f34011p0).m18975a(), C3096c.f9316o0, new C0519d(c13421l2, 5), new C0520e(c13421l2, videoCaptureHelper, 6), false, c17689w, c22159h0, c22159h0.f70066q0, (C18433F) c11238i.f34009Z, (C19026F) c11238i.f34010o0, null, C3094a.f9310r0, new C1311i(c13421l2, 5), EnumC19999a.f63314Y, true, false, null, C3097d.f9319o0, new C0155B1(c11238i, c13421l2, renderProps, 16), 0, null, null, 830603264), "PermissionFlowModal", c17689w));
                                    abstractC22180o0 = renderState;
                                    z12 = true;
                                    z11 = false;
                                } else {
                                    videoCaptureHelper = videoCaptureHelper2;
                                    C17282c c17282c3 = this.f69883i.f1686a;
                                    if (z6) {
                                        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
                                        EnumC22140b enumC22140b = ((C22144c0) renderState).f70005x0;
                                        int iOrdinal2 = enumC22140b.ordinal();
                                        if (iOrdinal2 == 0) {
                                            videoCaptureConfig = videoCaptureConfig;
                                            str = c22192s0.f70284W;
                                        } else {
                                            if (iOrdinal2 != 1) {
                                                videoCaptureConfig = videoCaptureConfig;
                                                throw new C0644w();
                                            }
                                            videoCaptureConfig = videoCaptureConfig;
                                            str = c22192s0.f70282U;
                                        }
                                        String str36 = str;
                                        int iOrdinal3 = enumC22140b.ordinal();
                                        if (iOrdinal3 == 0) {
                                            str2 = c22192s0.f70285X;
                                        } else {
                                            if (iOrdinal3 != 1) {
                                                throw new C0644w();
                                            }
                                            str2 = c22192s0.f70283V;
                                        }
                                        z11 = false;
                                        c22166j1 = new C0532q(str36, str2, renderProps.f70344j, c17282c3.m18975a(), new C0519d(c13421l2, 0), new C0520e(c13421l2, videoCaptureHelper, 0), new C0519d(c13421l2, 1));
                                        abstractC22180o0 = renderState;
                                        z12 = true;
                                    } else {
                                        abstractC22180o0 = renderState;
                                        if (!(abstractC22180o0 instanceof C22147d0)) {
                                            videoCaptureConfig = videoCaptureConfig;
                                            throw new C0644w();
                                        }
                                        C22147d0 c22147d0 = (C22147d0) abstractC22180o0;
                                        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
                                        C0524i c0524i = new C0524i(renderProps, c22147d0);
                                        String str37 = c22147d0.f70017v0;
                                        if (str37 == null) {
                                            videoCaptureConfig = videoCaptureConfig;
                                            iterable = c17689w;
                                        } else {
                                            videoCaptureConfig = videoCaptureConfig;
                                            Iterator it = c22147d0.f70016u0.iterator();
                                            do {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                            } while (!AbstractC16544l.m18089b(((C22134Y0) next).f69971Z, str37));
                                            C22134Y0 c22134y0 = (C22134Y0) next;
                                            if (c22134y0 != null) {
                                                iterable = c22134y0.f69972o0;
                                            } else {
                                                videoCaptureConfig = videoCaptureConfig;
                                                iterable = c17689w;
                                            }
                                        }
                                        Iterable<C22130W0> iterable2 = iterable;
                                        ArrayList arrayList7 = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
                                        for (C22130W0 c22130w4 : iterable2) {
                                            LinkedHashMap linkedHashMap6 = linkedHashMap2;
                                            String str38 = (String) linkedHashMap6.get(c22130w4.f69957Y);
                                            String str39 = c22130w4.f69957Y;
                                            if (str38 == null) {
                                                str38 = str39;
                                            }
                                            arrayList7.add(new C19067A1(str38, str39));
                                            linkedHashMap2 = linkedHashMap6;
                                        }
                                        String str40 = c22147d0.f70018w0;
                                        if (str40 == null) {
                                            c22130w0 = null;
                                        } else {
                                            Iterator it2 = iterable2.iterator();
                                            do {
                                                if (!it2.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it2.next();
                                            } while (!AbstractC16544l.m18089b(((C22130W0) next2).f69957Y, str40));
                                            c22130w0 = (C22130W0) next2;
                                        }
                                        C0525j c0525j = new C0525j(renderProps, arrayList7, c22147d0);
                                        boolean z44 = c22130w0 != null;
                                        C17280a c17280aM18975a3 = c17282c3.m18975a();
                                        C0522g c0522g = new C0522g(c13421l2, c22147d0, 0);
                                        C0522g c0522g2 = new C0522g(c13421l2, c22147d0, 1);
                                        c13421l2 = c13421l2;
                                        c22107k0 = this;
                                        z11 = false;
                                        c2685e = videoCaptureHelper;
                                        z12 = true;
                                        c22166j1 = new C22166j1(c22192s0.f70289a0, renderProps.f70344j, c0524i, c0525j, c22192s0.f70286Y, c22192s0.f70287Z, c22192s0.f70291b0, z44, c17280aM18975a3, c0522g, c0522g2, new C0523h(c22130w0, c22147d0, c13421l, renderProps, videoCaptureHelper, 0), new C0520e(c13421l2, c2685e, 1), new C0519d(c13421l2, 2));
                                    }
                                }
                                c2685e = videoCaptureHelper;
                                c22107k0 = this;
                            }
                        }
                    }
                }
                z14 = abstractC22180o0 instanceof C22153f0;
                if (z14) {
                    z15 = z12;
                } else {
                    z15 = abstractC22180o0 instanceof C22162i0;
                }
                if (z15) {
                    z16 = z12;
                } else {
                    z16 = abstractC22180o0 instanceof C22177n0;
                }
                if (z16) {
                    z17 = z12;
                } else {
                    z17 = abstractC22180o0 instanceof C22156g0;
                }
                if (z17) {
                    z18 = z12;
                } else {
                    z18 = abstractC22180o0 instanceof C22159h0;
                }
                if (z18) {
                    str15 = "camera_screen";
                } else {
                    if (abstractC22180o0 instanceof C22150e0) {
                        z19 = z12;
                    } else {
                        z19 = abstractC22180o0 instanceof C22168k0;
                    }
                    if (z19) {
                        z20 = z12;
                    } else {
                        z20 = z10;
                    }
                    if (z20) {
                        z21 = z12;
                    } else {
                        z21 = abstractC22180o0 instanceof C22174m0;
                    }
                    if (z21) {
                        z22 = z12;
                    } else {
                        z22 = z6;
                    }
                    if (z22) {
                        z23 = z12;
                    } else {
                        z23 = abstractC22180o0 instanceof C22147d0;
                    }
                    if (z23) {
                        throw new C0644w();
                    }
                    str15 = null;
                }
                if (str15 != null) {
                    c22166j1 = new C14172n(c22166j1, str15);
                }
                if (z14) {
                    z24 = z12;
                } else {
                    z24 = abstractC22180o0 instanceof C22159h0;
                }
                if (z24) {
                    z25 = z12;
                } else {
                    z25 = abstractC22180o0 instanceof C22177n0;
                }
                if (z25) {
                    z26 = z12;
                } else {
                    z26 = abstractC22180o0 instanceof C22156g0;
                }
                if (z26) {
                    z33 = z12;
                } else {
                    if (abstractC22180o0 instanceof C22150e0) {
                        z27 = z12;
                    } else {
                        z27 = abstractC22180o0 instanceof C22168k0;
                    }
                    if (z27) {
                        z28 = z12;
                    } else {
                        z28 = z10;
                    }
                    if (z28) {
                        z29 = z12;
                    } else {
                        z29 = abstractC22180o0 instanceof C22174m0;
                    }
                    if (z29) {
                        z30 = z12;
                    } else {
                        z30 = abstractC22180o0 instanceof C22162i0;
                    }
                    if (z30) {
                        z31 = z12;
                    } else {
                        z31 = z6;
                    }
                    if (z31) {
                        z32 = z12;
                    } else {
                        z32 = abstractC22180o0 instanceof C22147d0;
                    }
                    if (z32) {
                        throw new C0644w();
                    }
                    z33 = z11;
                }
                if (!z33) {
                    c13421l2.mo3410z("close_camera", new C22210z0(c22107k0, null));
                }
                c2685e.getClass();
                videoCaptureConfig3 = videoCaptureConfig;
                if (videoCaptureConfig3.f40639b.contains(NextStep.GovernmentId.CaptureFileType.Video) || AbstractC17680n.m19343S(videoCaptureConfig3.f40640c) != EnumC19999a.f63314Y || ((Boolean) AbstractC2894b.f8701a.getValue()).booleanValue()) {
                    z34 = z12;
                } else {
                    z34 = z11;
                }
                if (!z34 && AbstractC8012V5.m8332e(context)) {
                    c13421l2.mo3410z("output_webrtc_error", new C22089B0(c13421l2, c22107k0, null));
                }
                if (abstractC22180o0.f70246Y) {
                    enumC18225f = EnumC18225f.f58074Z;
                } else {
                    enumC18225f = EnumC18225f.f58073Y;
                }
                return new C18226g(c22166j1, enumC18225f);
            }
            C22150e0 c22150e0 = (C22150e0) renderState;
            boolean z45 = c22150e0.f70029s0;
            C22139a1 c22139a7 = c22150e0.f70024Z;
            if (z45) {
                AbstractC8215v5.m8843e(c13421l, this.f69878d, AbstractC16526C.m18075c(C6435j.class), "", new C16663C(this, c22139a7, renderState, 18));
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = assetConfig.getPromptPage();
            EnumC22128V0 enumC22128V8 = c22139a7.f69986Y;
            InterfaceC22179o interfaceC22179o4 = c22150e0.f70028r0;
            String strM22366c2 = AbstractC22121S.m22366c(interfaceC22179o4);
            LinkedHashMap linkedHashMap7 = c22192s0.f70306p;
            String str41 = (String) linkedHashMap7.get(enumC22128V8.f69952Y + "-" + strM22366c2);
            if (str41 == null) {
                String string10 = (String) linkedHashMap7.get(enumC22128V8.f69952Y);
                if (string10 == null) {
                    context4 = context5;
                    string10 = context4.getString(com.openai.chatgpt.R.string.pi2_governmentid_choose_capture_method_title_default);
                    AbstractC16544l.m18093f(string10, "getString(...)");
                } else {
                    context4 = context5;
                }
                str14 = string10;
            } else {
                context4 = context5;
                str14 = str41;
            }
            String strM22366c3 = AbstractC22121S.m22366c(interfaceC22179o4);
            EnumC22128V0 enumC22128V9 = c22139a7.f69986Y;
            String strM9890i2 = AbstractC9306j0.m9890i(enumC22128V9.f69952Y, "-", strM22366c3);
            LinkedHashMap linkedHashMap8 = c22192s0.f70307q;
            String string11 = (String) linkedHashMap8.get(strM9890i2);
            if (string11 == null && (string11 = (String) linkedHashMap8.get(enumC22128V9.f69952Y)) == null) {
                string11 = context4.getString(com.openai.chatgpt.R.string.pi2_governmentid_choose_capture_method_body_default);
                AbstractC16544l.m18093f(string11, "getString(...)");
            }
            String str42 = string11;
            C17280a c17280aM18975a4 = c17282c.m18975a();
            C22095E0 c22095e0 = new C22095E0(c13421l, renderState, renderProps, this);
            C22093D0 c22093d0 = new C22093D0(c13421l, this, renderState, 4);
            C22097F0 c22097f0 = new C22097F0(c13421l, this, 6);
            C0519d c0519d = new C0519d(c13421l, 8);
            C22093D0 c22093d1 = new C22093D0(c13421l, this, renderState, 0);
            int iOrdinal4 = enumC22128V9.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        if (iOrdinal4 != 3) {
                            if (iOrdinal4 != 4) {
                                throw new C0644w();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                remoteImage = idFrontPictograph;
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                            remoteImage = idFrontPictograph;
                        }
                    }
                    remoteImage = null;
                } else if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdBackPictograph();
                    remoteImage = idFrontPictograph;
                } else {
                    remoteImage = null;
                }
            } else if (AbstractC22121S.m22365b(interfaceC22179o4) == EnumC2883q.f8670q0) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                    remoteImage = idFrontPictograph;
                } else {
                    remoteImage = null;
                }
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
                remoteImage = idFrontPictograph;
            } else {
                remoteImage = null;
            }
            int iOrdinal5 = enumC22128V9.ordinal();
            if (iOrdinal5 != 0) {
                if (iOrdinal5 == 1 || iOrdinal5 == 3) {
                    i10 = com.openai.chatgpt.R.raw.pi2_upload_gov_id_back_lottie;
                    i11 = i10;
                } else {
                    i11 = com.openai.chatgpt.R.raw.pi2_upload_gov_id_front_lottie;
                }
            } else if (AbstractC22121S.m22365b(interfaceC22179o4) == EnumC2883q.f8670q0) {
                i10 = com.openai.chatgpt.R.raw.pi2_upload_gov_id_passport_lottie;
                i11 = i10;
            } else {
                i11 = com.openai.chatgpt.R.raw.pi2_upload_gov_id_front_lottie;
            }
            c22166j1 = new C22194t(renderProps.f70343i, str14, str42, c22192s0.f70308r, c22192s0.f70309s, c17280aM18975a4, c22095e0, c22093d0, c22097f0, c0519d, c22150e0.f70031u0, c22093d1, renderProps.f70344j, remoteImage, i11);
            c22107k0 = this;
            abstractC22180o0 = renderState;
            context = context4;
            c13421l2 = c13421l;
            z10 = z38;
            c2685e = videoCaptureHelper2;
        }
        z12 = true;
        z11 = false;
        z14 = abstractC22180o0 instanceof C22153f0;
        if (z14) {
            z15 = z12;
        } else {
            z15 = abstractC22180o0 instanceof C22162i0;
        }
        if (z15) {
            z16 = z12;
        } else {
            z16 = abstractC22180o0 instanceof C22177n0;
        }
        if (z16) {
            z17 = z12;
        } else {
            z17 = abstractC22180o0 instanceof C22156g0;
        }
        if (z17) {
            z18 = z12;
        } else {
            z18 = abstractC22180o0 instanceof C22159h0;
        }
        if (z18) {
            str15 = "camera_screen";
        } else {
            if (abstractC22180o0 instanceof C22150e0) {
                z19 = z12;
            } else {
                z19 = abstractC22180o0 instanceof C22168k0;
            }
            if (z19) {
                z20 = z12;
            } else {
                z20 = z10;
            }
            if (z20) {
                z21 = z12;
            } else {
                z21 = abstractC22180o0 instanceof C22174m0;
            }
            if (z21) {
                z22 = z12;
            } else {
                z22 = z6;
            }
            if (z22) {
                z23 = z12;
            } else {
                z23 = abstractC22180o0 instanceof C22147d0;
            }
            if (z23) {
                throw new C0644w();
            }
            str15 = null;
        }
        if (str15 != null) {
            c22166j1 = new C14172n(c22166j1, str15);
        }
        if (z14) {
            z24 = z12;
        } else {
            z24 = abstractC22180o0 instanceof C22159h0;
        }
        if (z24) {
            z25 = z12;
        } else {
            z25 = abstractC22180o0 instanceof C22177n0;
        }
        if (z25) {
            z26 = z12;
        } else {
            z26 = abstractC22180o0 instanceof C22156g0;
        }
        if (z26) {
            z33 = z12;
        } else {
            if (abstractC22180o0 instanceof C22150e0) {
                z27 = z12;
            } else {
                z27 = abstractC22180o0 instanceof C22168k0;
            }
            if (z27) {
                z28 = z12;
            } else {
                z28 = z10;
            }
            if (z28) {
                z29 = z12;
            } else {
                z29 = abstractC22180o0 instanceof C22174m0;
            }
            if (z29) {
                z30 = z12;
            } else {
                z30 = abstractC22180o0 instanceof C22162i0;
            }
            if (z30) {
                z31 = z12;
            } else {
                z31 = z6;
            }
            if (z31) {
                z32 = z12;
            } else {
                z32 = abstractC22180o0 instanceof C22147d0;
            }
            if (z32) {
                throw new C0644w();
            }
            z33 = z11;
        }
        if (!z33) {
            c13421l2.mo3410z("close_camera", new C22210z0(c22107k0, null));
        }
        c2685e.getClass();
        videoCaptureConfig3 = videoCaptureConfig;
        if (videoCaptureConfig3.f40639b.contains(NextStep.GovernmentId.CaptureFileType.Video)) {
            z34 = z12;
        } else {
            z34 = z12;
        }
        if (!z34) {
            c13421l2.mo3410z("output_webrtc_error", new C22089B0(c13421l2, c22107k0, null));
        }
        if (abstractC22180o0.f70246Y) {
            enumC18225f = EnumC18225f.f58074Z;
        } else {
            enumC18225f = EnumC18225f.f58073Y;
        }
        return new C18226g(c22166j1, enumC18225f);
    }

    @Override // fk.InterfaceC13680a
    public final void close() {
        this.f69887m.getClass();
        C19661b c19661b = this.f69884j;
        c19661b.f62316c = 0L;
        c19661b.f62317d = 0.0d;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC22180o0 state = (AbstractC22180o0) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }
}
