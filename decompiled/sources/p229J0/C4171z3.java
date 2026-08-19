package p229J0;

import android.util.Log;
import com.openai.voice.settings.VoiceModeSettingsViewModel;
import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitRtc$AddTrackRequest;
import mm.C17296C;
import mo.C17342i;
import om.C18235b;
import p003A1.C0251g0;
import p003A1.ChoreographerFrameCallbackC0293u0;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p103Dn.C2153Q0;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1143z4.AbstractC21767I;
import p1143z4.C21777g;
import p1155zi.EnumC21895B;
import p1155zi.EnumC21896B0;
import p1155zi.EnumC21946N2;
import p1155zi.EnumC21974X0;
import p1155zi.EnumC22040o1;
import p1155zi.EnumC22055s0;
import p153Fn.C2925c;
import p172Gi.C3077j;
import p199Hl.AbstractC3469E;
import p247Jj.AbstractC4402P0;
import p247Jj.AbstractC4433h0;
import p247Jj.C4400O0;
import p247Jj.C4431g0;
import p247Jj.C4437j0;
import p270Ki.C4700a;
import p273Kl.C4727J0;
import p273Kl.C4809y0;
import p292Lg.C5034f;
import p294Li.C5098t;
import p296Lk.C5114k;
import p296Lk.C5115l;
import p296Lk.C5119p;
import p315Me.Myis.CxcULo;
import p318Mh.C5351A;
import p318Mh.C5360E0;
import p318Mh.C5365H;
import p318Mh.C5370J0;
import p318Mh.C5374M;
import p318Mh.C5387a;
import p318Mh.C5406j0;
import p321Mk.C5463a;
import p321Mk.C5465c;
import p321Mk.InterfaceC5473k;
import p328N1.C5581H;
import p328N1.C5600p;
import p336Nc.C5706b;
import p340Nh.C5743a;
import p341Ni.C5784h0;
import p344Nl.C5831c;
import p349O0.C5940A;
import p349O0.C6029t;
import p349O0.C6032u0;
import p349O0.EnumC6020o0;
import p351O2.C6084G;
import p351O2.C6095i;
import p364Oh.AbstractC6224C;
import p365Oi.InterfaceC6255c;
import p387Pl.C6460G;
import p387Pl.EnumC6464K;
import p389Pn.C6531p;
import p389Pn.C6532q;
import p402Qc.C6589e;
import p403Qd.C6636i;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9150J;
import p658b5.C11232c;
import p729ej.C13430u;
import p759g1.C13800b;
import p793ho.C14573E3;
import p793ho.EnumC14686X2;
import p825j5.C16124a;
import p909nm.AbstractC17680n;
import p929oi.AbstractC18201b;
import p953q0.C18580g;

/* JADX INFO: renamed from: J0.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4171z3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13584Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f13585Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4171z3(Object obj, int i10) {
        super(1);
        this.f13584Y = i10;
        this.f13585Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final Object m4791a(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            C2153Q0 c2153q0 = ((C6084G) this.f13585Z).f19817g;
            C6095i c6095i = new C6095i(th2);
            c2153q0.getClass();
            c2153q0.m3251l(null, c6095i);
        }
        Object obj2 = C6084G.f19810k;
        C6084G c6084g = (C6084G) this.f13585Z;
        synchronized (obj2) {
            C6084G.f19809j.remove(c6084g.m6652d().getAbsolutePath());
        }
        return C17296C.f55119a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object it) {
        int i10 = 3;
        z = false;
        boolean z6 = false;
        switch (this.f13584Y) {
            case 0:
                ((Number) it).floatValue();
                return Float.valueOf(((InterfaceC7537b) this.f13585Z).mo7864b0(56));
            case 1:
                C13430u action = (C13430u) it;
                AbstractC16544l.m18094g(action, "$this$action");
                C4431g0 c4431g0 = (C4431g0) this.f13585Z;
                String str = c4431g0.f14421u0;
                String str2 = c4431g0.f14411A0;
                AbstractC16544l.m18091d(str2);
                action.m14964a(new C4437j0(str, str2, c4431g0.f14422v0, c4431g0.f14417G0));
                return C17296C.f55119a;
            case 2:
                C13430u action2 = (C13430u) it;
                AbstractC16544l.m18094g(action2, "$this$action");
                AbstractC4433h0 abstractC4433h0 = ((C4400O0) ((AbstractC4402P0) this.f13585Z)).f14288a;
                abstractC4433h0.f14435t0 = true;
                action2.f42521b = abstractC4433h0;
                return C17296C.f55119a;
            case 3:
                InterfaceC21098s it2 = (InterfaceC21098s) it;
                AbstractC16544l.m18094g(it2, "it");
                C4700a c4700a = (C4700a) this.f13585Z;
                c4700a.getClass();
                c4700a.f15279a = it2;
                boolean zMo5400b = c4700a.mo5400b();
                C6460G c6460gMo5401d = c4700a.mo5401d();
                if (c4700a.f15280b != zMo5400b || !AbstractC16544l.m18089b(c4700a.f15281c, c6460gMo5401d)) {
                    c4700a.m7315c();
                }
                c4700a.f15280b = zMo5400b;
                c4700a.f15281c = c6460gMo5401d;
                return C17296C.f55119a;
            case 4:
                AbstractC3469E event = (AbstractC3469E) it;
                AbstractC16544l.m18094g(event, "event");
                C4727J0 c4727j0 = (C4727J0) this.f13585Z;
                C2925c c2925c = c4727j0.f15388m;
                if (c2925c != null) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C4809y0(c4727j0, event, null), 3);
                    return C17296C.f55119a;
                }
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            case 5:
                Throwable th2 = (Throwable) it;
                if (th2 instanceof CancellationException) {
                    ((C0564B0) this.f13585Z).mo1275e((CancellationException) th2);
                }
                return C17296C.f55119a;
            case 6:
                return new C0251g0((C3899D4) this.f13585Z, i10);
            case 7:
                byte[] data = (byte[]) it;
                AbstractC16544l.m18094g(data, "data");
                ((InterfaceC6255c) this.f13585Z).mo6744c(data);
                return C17296C.f55119a;
            case 8:
                C3077j it3 = (C3077j) it;
                AbstractC16544l.m18094g(it3, "it");
                ((VoiceModeSettingsViewModel) this.f13585Z).m14395k(new C5098t(it3));
                return C17296C.f55119a;
            case 9:
                ((Number) it).intValue();
                C5115l c5115l = (C5115l) this.f13585Z;
                ArrayList arrayList = c5115l.f16715b;
                return new C5463a(0.0f, AbstractC17680n.m19371u0(arrayList) - ((Number) AbstractC17680n.m19351a0(arrayList)).floatValue(), ((Number) AbstractC17680n.m19351a0(c5115l.f16714a)).floatValue(), ((Number) AbstractC17680n.m19351a0(arrayList)).floatValue(), false, false);
            case 10:
                InterfaceC5473k $receiver = (InterfaceC5473k) it;
                AbstractC16544l.m18094g($receiver, "$this$$receiver");
                C5119p c5119p = (C5119p) this.f13585Z;
                InterfaceC1436k interfaceC1436k = c5119p.f16723a;
                if (c5119p.f16724b == null) {
                    AbstractC16544l.m18103p("dimensions");
                    throw null;
                }
                if (c5119p.f16725c != null) {
                    return new C13800b(((C13800b) interfaceC1436k.invoke(new C5114k())).f43584a);
                }
                AbstractC16544l.m18103p("pinConfiguration");
                throw null;
            case 11:
                C21777g navArgument = (C21777g) it;
                AbstractC16544l.m18094g(navArgument, "$this$navArgument");
                C5370J0 c5370j0 = (C5370J0) this.f13585Z;
                AbstractC21767I value = c5370j0.f17615b;
                AbstractC16544l.m18094g(value, "value");
                C17342i c17342i = navArgument.f69071a;
                c17342i.getClass();
                c17342i.f55254c = value;
                c17342i.f55252a = !c5370j0.f17616c;
                Object obj = c5370j0.f17617d;
                if (obj != null) {
                    navArgument.f69072b = obj;
                    c17342i.f55255d = obj;
                    c17342i.f55253b = true;
                }
                return C17296C.f55119a;
            case 12:
                C5387a buildRoute = (C5387a) it;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5351A.f17575g.getClass();
                buildRoute.m5900a(C5351A.f17576h, (EnumC22055s0) this.f13585Z);
                return C17296C.f55119a;
            case 13:
                C5387a buildRoute2 = (C5387a) it;
                AbstractC16544l.m18094g(buildRoute2, "$this$buildRoute");
                C5365H.f17604g.getClass();
                buildRoute2.m5900a(C5365H.f17605h, (EnumC21896B0) this.f13585Z);
                return C17296C.f55119a;
            case 14:
                C5387a buildRoute3 = (C5387a) it;
                AbstractC16544l.m18094g(buildRoute3, "$this$buildRoute");
                C5374M.f17623g.getClass();
                buildRoute3.m5900a(C5374M.f17624h, (EnumC21974X0) this.f13585Z);
                return C17296C.f55119a;
            case 15:
                C5387a buildRoute4 = (C5387a) it;
                AbstractC16544l.m18094g(buildRoute4, "$this$buildRoute");
                C5406j0.f17676g.getClass();
                buildRoute4.m5900a(C5406j0.f17677h, (EnumC22040o1) this.f13585Z);
                return C17296C.f55119a;
            case 16:
                C5387a buildRoute5 = (C5387a) it;
                AbstractC16544l.m18094g(buildRoute5, "$this$buildRoute");
                C5360E0.f17592g.getClass();
                buildRoute5.m5900a(C5360E0.f17593h, (EnumC21946N2) this.f13585Z);
                return C17296C.f55119a;
            case 17:
                C18580g interval = (C18580g) it;
                AbstractC16544l.m18094g(interval, "interval");
                for (int i11 = 0; i11 < interval.f59183b; i11++) {
                    ((C18235b) this.f13585Z).add(C5465c.f17848Y.invoke(Integer.valueOf(interval.f59182a + i11), Integer.valueOf(i11), interval.f59184c));
                }
                return C17296C.f55119a;
            case 18:
                C5581H c5581h = (C5581H) it;
                return ((C5600p) this.f13585Z).m5990a(new C5581H(null, c5581h.f18085b, c5581h.f18086c, c5581h.f18087d, c5581h.f18088e)).getValue();
            case 19:
                AbstractC16544l.m18094g(it, "it");
                if (((C5706b) this.f13585Z).f18492Y != EnumC21895B.f69419Z) {
                    Log.i("DataDog", CxcULo.sHNAPAemg);
                }
                return C17296C.f55119a;
            case 20:
                return AbstractC21322p.m21712t0(AbstractC18201b.f58034a.m12905d(((C5743a) this.f13585Z).f18694a, it), '\"');
            case 21:
                AbstractC6224C it4 = (AbstractC6224C) it;
                AbstractC16544l.m18094g(it4, "it");
                if (AbstractC9150J.m9696a(it4) && ((Boolean) ((C5784h0) this.f13585Z).f18858j.f30812q0.f6797Y.getValue()).booleanValue()) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 22:
                C14573E3 publishTrackImpl = (C14573E3) it;
                AbstractC16544l.m18094g(publishTrackImpl, "$this$publishTrackImpl");
                C5831c c5831c = (C5831c) this.f13585Z;
                boolean z10 = !c5831c.f19052c;
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setDisableDtx(z10);
                boolean z11 = !c5831c.f19053d;
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setDisableRed(z11);
                EnumC6464K enumC6464K = c5831c.f19054e;
                EnumC14686X2 enumC14686X2M7049a = enumC6464K != null ? enumC6464K.m7049a() : EnumC14686X2.MICROPHONE;
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setSource(enumC14686X2M7049a);
                return C17296C.f55119a;
            case 23:
                C5940A.f19325Z.removeFrameCallback((ChoreographerFrameCallbackC0293u0) this.f13585Z);
                return C17296C.f55119a;
            case 24:
                Throwable th3 = (Throwable) it;
                CancellationException cancellationExceptionM1172a = AbstractC0575H.m1172a("Recomposer effect job completed", th3);
                C6032u0 c6032u0 = (C6032u0) this.f13585Z;
                synchronized (c6032u0.f19647c) {
                    try {
                        InterfaceC0627n0 interfaceC0627n0 = c6032u0.f19648d;
                        if (interfaceC0627n0 != null) {
                            C2153Q0 c2153q0 = c6032u0.f19663s;
                            EnumC6020o0 enumC6020o0 = EnumC6020o0.f19543Z;
                            c2153q0.getClass();
                            c2153q0.m3251l(null, enumC6020o0);
                            C2153Q0 c2153q1 = C6032u0.f19643w;
                            interfaceC0627n0.mo1275e(cancellationExceptionM1172a);
                            c6032u0.f19660p = null;
                            interfaceC0627n0.mo1271H0(new C5034f(c6032u0, 10, th3));
                        } else {
                            c6032u0.f19649e = cancellationExceptionM1172a;
                            C2153Q0 c2153q2 = c6032u0.f19663s;
                            EnumC6020o0 enumC6020o1 = EnumC6020o0.f19542Y;
                            c2153q2.getClass();
                            c2153q2.m3251l(null, enumC6020o1);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return C17296C.f55119a;
            case 25:
                ((C6029t) this.f13585Z).m6586w(it);
                return C17296C.f55119a;
            case 26:
                return m4791a(it);
            case 27:
                String word = (String) it;
                AbstractC16544l.m18094g(word, "word");
                if (word.length() <= 0) {
                    return word;
                }
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = word.charAt(0);
                sb2.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC7966P5.m8259g(cCharAt, (Locale) this.f13585Z) : String.valueOf(cCharAt)));
                String strSubstring = word.substring(1);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            case 28:
                for (C6531p c6531p : ((C6532q) this.f13585Z).f21149c) {
                    c6531p.f21145a.mo7094d(it, c6531p.f21146b);
                }
                return C17296C.f55119a;
            default:
                C16124a cursor = (C16124a) it;
                AbstractC16544l.m18094g(cursor, "cursor");
                C15333a c15333a = (C15333a) ((C11232c) ((C6589e) this.f13585Z).f21290o0).f33997Z;
                String strM17679a = cursor.m17679a(0);
                AbstractC16544l.m18091d(strM17679a);
                return (C6636i) c15333a.m16551b(strM17679a);
        }
    }
}
