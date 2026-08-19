package p003A1;

import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.view.inputmethod.InputConnection;
import androidx.camera.view.PreviewView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.messages.impl.listitem.content.reference.weather.WeatherViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.voice.assistant.AssistantViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p044Bh.C1293f;
import p044Bh.C1299l;
import p044Bh.C1302o;
import p045Bj.C1313k;
import p046Bk.C1375d0;
import p046Bk.C1393l0;
import p046Bk.C1397n0;
import p046Bk.C1399o0;
import p046Bk.C1401p0;
import p049Bm.InterfaceC1436k;
import p071Ch.C1671b;
import p072Ci.EnumC1711p;
import p077Cn.C1743k;
import p080D0.C1840y;
import p100Dk.AbstractC2090q;
import p100Dk.C2088o;
import p1025te.InterfaceC19862M;
import p1062vd.C20567q;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22038o;
import p1156zj.C22177n0;
import p1156zj.C22195t0;
import p121Ef.C2430g;
import p126Ek.AbstractC2571d;
import p156G1.AbstractC2973t;
import p156G1.C2960g;
import p156G1.C2963j;
import p168Gd.C3034b;
import p173Gj.EnumC3098e;
import p193Hf.C3352c;
import p193Hf.C3420z0;
import p196Hi.C3442l;
import p198Hk.C3459b;
import p198Hk.C3460c;
import p215Ic.C3685b;
import p221Ii.C3734m;
import p221Ii.C3735n;
import p225Im.InterfaceC3776x;
import p229J0.AbstractC4152w2;
import p229J0.C3935J4;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p350O1.InputConnectionC6068q;
import p392Q0.C6546d;
import p523V9.AbstractC8012V5;
import p544W9.AbstractC8748z;
import p636a2.AbstractC10483t;
import p636a2.C10481r;
import p658b5.C11242m;
import p729ej.C13421l;
import p729ej.C13430u;
import p758g0.C13756d;
import p758g0.C13770k;
import p759g1.C13800b;
import p774h1.C14336N;
import p774h1.InterfaceC14362r;
import p821j1.InterfaceC16039d;
import p843k1.C16308b;
import p857kl.AbstractC16435B;
import p857kl.C16477y;
import p929oi.AbstractC18201b;
import p948pi.C18418a;
import p953q0.C18571b0;
import p993rj.C19032L;
import p993rj.C19033M;
import p994rk.InterfaceC19201o2;
import pk.C18504i;
import ye.C21514c;
import ye.C21515d;
import ye.C21525n;

/* JADX INFO: renamed from: A1.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0254h0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f958Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f959Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254h0(C1313k c1313k, C19033M c19033m, AbstractC2571d abstractC2571d, C22177n0 c22177n0, C22195t0 c22195t0, C13421l c13421l) {
        super(1);
        this.f958Y = 7;
        this.f959Z = c19033m;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x02e0  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object it) {
        C19033M c19033m;
        C19032L c19032l;
        C19032L c19032l2;
        int i10 = 0;
        String strM12905d = null;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f959Z;
        switch (this.f958Y) {
            case 0:
                return new C0251g0((C0196P0) obj, i10);
            case 1:
                if (AbstractC0213V0.f811b.compareAndSet(false, true)) {
                    ((C1743k) obj).mo2524p(c17296c);
                }
                return c17296c;
            case 2:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) it;
                InterfaceC14362r interfaceC14362rM15196m = interfaceC16039d.mo17601f0().m15196m();
                C20567q c20567q = ((C0216W0) obj).f827p0;
                if (c20567q != null) {
                    c20567q.invoke(interfaceC14362rM15196m, (C16308b) interfaceC16039d.mo17601f0().f43260o0);
                }
                return c17296c;
            case 3:
                InputConnectionC6068q inputConnectionC6068q = (InputConnectionC6068q) it;
                InputConnection inputConnection = inputConnectionC6068q.f19765b;
                if (inputConnection != null) {
                    inputConnectionC6068q.mo6645a(inputConnection);
                    inputConnectionC6068q.f19765b = null;
                }
                C0229a1 c0229a1 = (C0229a1) obj;
                C6546d c6546d = c0229a1.f861d;
                int i11 = c6546d.f21184o0;
                if (i11 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    while (!AbstractC16544l.m18089b((WeakReference) objArr[i10], inputConnectionC6068q)) {
                        i10++;
                        if (i10 >= i11) {
                            i10 = -1;
                        }
                    }
                } else {
                    i10 = -1;
                }
                C6546d c6546d2 = c0229a1.f861d;
                if (i10 >= 0) {
                    c6546d2.m7111p(i10);
                }
                if (c6546d2.m7108m()) {
                    c0229a1.f859b.invoke();
                }
                return c17296c;
            case 4:
                ((C20567q) obj).invoke((InterfaceC14362r) it, null);
                return c17296c;
            case 5:
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(super/*java.util.concurrent.LinkedBlockingQueue*/.offer(it));
            case 6:
                C16477y headers = (C16477y) it;
                AbstractC16544l.m18094g(headers, "$this$headers");
                List list = AbstractC16435B.f50983a;
                headers.m4529e("Cache-Control", "no-cache");
                headers.m4529e("Connection", "keep-alive");
                AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
                if (abstractC21955Q1 != null) {
                    if (abstractC21955Q1 instanceof C21952P1) {
                        strM12905d = AbstractC18201b.f58034a.m12905d(C1299l.Companion.serializer(), new C1299l((String) ((C21952P1) abstractC21955Q1).f69511a));
                    } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        strM12905d = AbstractC18201b.f58034a.m12905d(C1293f.Companion.serializer(), new C1293f(((AbstractC21933K1) abstractC21955Q1).f69485a));
                    } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                        throw new C0644w();
                    }
                    if (strM12905d != null) {
                        headers.m4529e("X-Sentinel-Payload", strM12905d);
                    }
                }
                return c17296c;
            case 7:
                C13430u action = (C13430u) it;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22177n0 c22177n0 = obj2 instanceof C22177n0 ? (C22177n0) obj2 : null;
                if (c22177n0 == null) {
                    if (c22177n0 != null) {
                        action.f42521b = C22177n0.m22397i(c22177n0, null, EnumC3098e.f9321Y, null, false, false, null, 16255);
                    }
                    c19033m = (C19033M) obj;
                    if (c19033m != null) {
                        c19032l2.f60670b.getWidth();
                    }
                    if (c19033m != null) {
                        c19032l.f60670b.getHeight();
                    }
                } else if (c22177n0.f70239u0 != EnumC3098e.f9321Y) {
                    if (c22177n0 != null) {
                        action.f42521b = C22177n0.m22397i(c22177n0, null, EnumC3098e.f9321Y, null, false, false, null, 16255);
                    }
                    c19033m = (C19033M) obj;
                    if (c19033m != null && (c19032l2 = c19033m.f60677a) != null) {
                        c19032l2.f60670b.getWidth();
                    }
                    if (c19033m != null && (c19032l = c19033m.f60677a) != null) {
                        c19032l.f60670b.getHeight();
                    }
                }
                return c17296c;
            case 8:
                C13430u action2 = (C13430u) it;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(new C1401p0("Couldn't load address.", ((C2088o) ((AbstractC2090q) obj)).f6431a));
                return c17296c;
            case 9:
                AbstractC16544l.m18094g((InterfaceC19201o2) it, "it");
                C11242m c11242m = ((C1375d0) obj).f3652e;
                C18504i c18504i = (C18504i) c11242m.f34019Z;
                BottomSheetBehavior bottomSheetBehavior = c18504i != null ? c18504i.f58973s0 : null;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.m13586A(5);
                }
                c11242m.f34020o0 = null;
                return c17296c;
            case 10:
                C13430u action3 = (C13430u) it;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.m14964a(((C1393l0) obj).f3713g ? C1399o0.f3735a : C1397n0.f3731a);
                return c17296c;
            case 11:
                AbstractC16544l.m18094g((Context) it, "it");
                return (PreviewView) obj;
            case 12:
                C2963j semantics = (C2963j) it;
                AbstractC16544l.m18094g(semantics, "$this$semantics");
                InterfaceC3776x[] interfaceC3776xArr = AbstractC10483t.f31063a;
                InterfaceC3776x interfaceC3776x = AbstractC10483t.f31063a[0];
                AbstractC10483t.f31064b.m3814a(semantics, (C10481r) obj);
                return c17296c;
            case 13:
                C16477y headers2 = (C16477y) it;
                AbstractC16544l.m18094g(headers2, "$this$headers");
                headers2.m4529e("OAI-Client-Type", "android");
                C1671b c1671b = (C1671b) obj;
                headers2.m4529e("OAI-Device-Id", c1671b.f4736a.m2506a());
                String language = AbstractC8012V5.m8334g(c1671b.f4738c).getLanguage();
                AbstractC16544l.m18093f(language, "getLanguage(...)");
                headers2.m4529e(SIPHeaderNames.ACCEPT_LANGUAGE, language);
                return c17296c;
            case 14:
                long j10 = ((C13800b) it).f43584a;
                ((C1840y) obj).invoke();
                return c17296c;
            case 15:
                EnumC1711p it2 = (EnumC1711p) it;
                AbstractC16544l.m18094g(it2, "it");
                ((WeatherViewModel) obj).m14395k(new C2430g(it2));
                return c17296c;
            case 16:
                InterfaceC19862M it3 = (InterfaceC19862M) it;
                AbstractC16544l.m18094g(it3, "it");
                ((InputViewModel) obj).m14395k(it3);
                return c17296c;
            case 17:
                C16477y headers3 = (C16477y) it;
                AbstractC16544l.m18094g(headers3, "$this$headers");
                headers3.m4529e("X-Sentinel-Payload", AbstractC18201b.f58034a.m12905d(C1299l.Companion.serializer(), new C1299l(((C1302o) obj).f3437c)));
                return c17296c;
            case 18:
                AbstractC2973t.m3812g((C2963j) it, ((C2960g) obj).f8849a);
                return c17296c;
            case 19:
                ((List) it).add((Float) ((C18571b0) obj).invoke());
                return true;
            case 20:
                C21515d setState = (C21515d) it;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C21515d.m21794a(setState, null, null, true, (C21525n) obj, false, 19);
            case 21:
                Throwable it4 = (Throwable) it;
                AbstractC16544l.m18094g(it4, "it");
                ((CanmoreViewModel) obj).m14395k(new C3352c(it4));
                return c17296c;
            case 22:
                C3420z0 it5 = (C3420z0) it;
                AbstractC16544l.m18094g(it5, "it");
                C3034b c3034b = (C3034b) obj;
                String str = c3034b != null ? c3034b.f9128a : null;
                return (String) it5.f10422g.get(str != null ? new C21514c(str) : null);
            case 23:
                ((AssistantViewModel) obj).m14395k(new C3442l(((Boolean) it).booleanValue()));
                return c17296c;
            case 24:
                ArrayList mViews = (ArrayList) it;
                AbstractC16544l.m18094g(mViews, "mViews");
                C3459b c3459b = ((C3460c) obj).f10516b;
                c3459b.addAll(mViews);
                return c3459b;
            case 25:
                return ((C21891A) obj).f69415a;
            case 26:
                C22038o c22038o = (C22038o) it;
                if (AbstractC16544l.m18089b(c22038o != null ? c22038o.f69711a : null, ((C18418a) ((C3685b) obj).f11180o0).f58775c)) {
                    return null;
                }
                return c22038o;
            case 27:
                InterfaceC5300b params = (InterfaceC5300b) it;
                AbstractC16544l.m18094g(params, "params");
                C3734m c3734m = (C3734m) obj;
                C3735n c3735nM4433c = c3734m.m4433c();
                C5303e c5303e = (C5303e) params;
                c5303e.m5838b("time", c3735nM4433c.f11360a);
                c5303e.m5838b("micLevel", c3735nM4433c.f11361b);
                c5303e.m5838b("stateListen", c3735nM4433c.f11364e);
                c5303e.m5838b("listenTimestamp", c3735nM4433c.f11365f);
                c5303e.m5838b("stateThink", c3735nM4433c.f11366g);
                c5303e.m5838b("thinkTimestamp", c3735nM4433c.f11367h);
                c5303e.m5838b("stateSpeak", c3735nM4433c.f11368i);
                c5303e.m5838b("speakTimestamp", c3735nM4433c.f11369j);
                c5303e.m5838b("readyTimestamp", c3735nM4433c.f11370k);
                c5303e.m5838b("stateHalt", c3735nM4433c.f11371l);
                c5303e.m5838b("haltTimestamp", c3735nM4433c.f11372m);
                c5303e.m5838b("stateFailedToConnect", c3735nM4433c.f11373n);
                c5303e.m5838b("failedToConnectTimestamp", c3735nM4433c.f11374o);
                float[] fArrCopyOf = c3735nM4433c.f11377r;
                if (fArrCopyOf.length != 4) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 4);
                    AbstractC16544l.m18093f(fArrCopyOf, "copyOf(...)");
                }
                c5303e.m5839c("avgMag", fArrCopyOf);
                float[] fArrCopyOf2 = c3735nM4433c.f11378s;
                if (fArrCopyOf2.length != 4) {
                    fArrCopyOf2 = Arrays.copyOf(fArrCopyOf2, 4);
                    AbstractC16544l.m18093f(fArrCopyOf2, "copyOf(...)");
                }
                c5303e.m5839c("cumulativeAudio", fArrCopyOf2);
                c5303e.m5838b("touchDownTimestamp", c3735nM4433c.f11362c);
                c5303e.m5838b("touchUpTimestamp", c3735nM4433c.f11363d);
                c5303e.m5838b("silenceAmount", c3735nM4433c.f11379t);
                c5303e.m5838b("silenceTimestamp", c3735nM4433c.f11380u);
                boolean z6 = c3734m.f11346g;
                C5299a c5299a = (C5299a) c5303e.f17469a.get("isNewBloop");
                if (c5299a != null) {
                    c5299a.f17466c = Boolean.valueOf(z6);
                }
                c5303e.m5839c("bloopColorsMain", AbstractC8748z.m9501b(c3735nM4433c.f11381v.f11278a));
                c5303e.m5839c("bloopColorsLow", AbstractC8748z.m9501b(c3735nM4433c.f11381v.f11279b));
                c5303e.m5839c("bloopColorsMid", AbstractC8748z.m9501b(c3735nM4433c.f11381v.f11280c));
                c5303e.m5839c("bloopColorsHigh", AbstractC8748z.m9501b(c3735nM4433c.f11381v.f11281d));
                c5303e.m5838b("strawFactor", c3734m.f11347h);
                return c17296c;
            case 28:
                ((C3935J4) obj).m4636b(((Number) ((C13770k) it).f43484e.getValue()).floatValue());
                return c17296c;
            default:
                C14336N c14336n = (C14336N) it;
                float fFloatValue = ((Number) ((C13756d) obj).m15224e()).floatValue();
                float fM4783d = AbstractC4152w2.m4783d(c14336n, fFloatValue);
                float fM4784e = AbstractC4152w2.m4784e(c14336n, fFloatValue);
                c14336n.m15656h(fM4784e == 0.0f ? 1.0f : fM4783d / fM4784e);
                c14336n.m15660n(AbstractC4152w2.f13453c);
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0254h0(Object obj, int i10) {
        super(1);
        this.f958Y = i10;
        this.f959Z = obj;
    }
}
