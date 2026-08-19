package p003A1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import cd.C11709i;
import com.openai.chatgpt.R;
import io.livekit.android.room.C15102a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import mm.C17296C;
import mm.C17309l;
import p017Af.C0471b;
import p025An.AbstractC0575H;
import p040Bd.C0935I;
import p040Bd.C0937I1;
import p046Bk.AbstractC1391k0;
import p046Bk.C1341N0;
import p046Bk.C1360X0;
import p046Bk.C1375d0;
import p046Bk.C1393l0;
import p046Bk.C1407s0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1081wc.C20906y;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1139z0.C21585H;
import p1143z4.C21795y;
import p1155zi.C21907E;
import p1155zi.C21908E0;
import p1155zi.C21984a1;
import p1156zj.AbstractC22120R0;
import p1156zj.C22195t0;
import p1160zp.AbstractC22225a;
import p117Eb.C2391u;
import p124Ei.C2520j1;
import p124Ei.C2532n1;
import p145Ff.AbstractC2729g;
import p145Ff.EnumC2731i;
import p153Fn.C2925c;
import p193Hf.C3350b0;
import p204I1.C3590f;
import p229J0.C3880A3;
import p229J0.C3935J4;
import p229J0.C4116q2;
import p229J0.EnumC3886B3;
import p229J0.InterfaceC3923H4;
import p247Jj.AbstractC4433h0;
import p247Jj.C4390J0;
import p249Jl.SurfaceHolderCallbackC4482b;
import p273Kl.C4727J0;
import p273Kl.C4756Y0;
import p279L1.VOxZ.sVoFrD;
import p316Mf.AbstractC5340g;
import p318Mh.AbstractC5364G0;
import p318Mh.C5393d;
import p318Mh.C5411m;
import p318Mh.C5431w;
import p318Mh.C5435y;
import p344Nl.AbstractC5821C;
import p344Nl.C5825G;
import p349O0.InterfaceC5985X;
import p387Pl.AbstractC6482b0;
import p402Qc.C6593i;
import p408Qj.AbstractC6746l;
import p408Qj.C6749o;
import p479Td.C7373x;
import p482Tg.EnumC7465v;
import p507Uh.C7680f;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p507Uh.InterfaceC7682h;
import p523V9.AbstractC7861C4;
import p523V9.AbstractC8094g4;
import p523V9.AbstractC8215v5;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8536P2;
import p553Wh.C8870f;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9209T;
import p571X9.AbstractC9405z3;
import p586Y0.C9566r;
import p594Y9.AbstractC9842Z;
import p658b5.C11238i;
import p658b5.C11242m;
import p729ej.C13421l;
import p855kj.AbstractC16428g;
import p867l8.C16831c;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p926of.AbstractC18176m;
import p926of.C18146I;
import p926of.C18173j;
import p994rk.C19169g2;
import p994rk.C19218t;
import p994rk.InterfaceC19129V1;

/* JADX INFO: renamed from: A1.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155B1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f632Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f633Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f634o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f635p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0155B1(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f632Y = i10;
        this.f633Z = obj;
        this.f634o0 = obj2;
        this.f635p0 = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C19169g2 c19169g2;
        C3935J4 state;
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f635p0;
        Object obj2 = this.f634o0;
        Object obj3 = this.f633Z;
        switch (this.f632Y) {
            case 0:
                AbstractC0231b abstractC0231b = (AbstractC0231b) obj3;
                abstractC0231b.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC0171H) obj2);
                C0152A1 listener = (C0152A1) obj;
                AbstractC16544l.m18094g(listener, "listener");
                AbstractC8536P2.m9199b(abstractC0231b).f14809a.remove(listener);
                return c17296c;
            case 1:
                C0935I c0935i = (C0935I) obj2;
                ((InterfaceC1436k) obj3).invoke(c0935i.f2683c);
                ((C0471b) obj).invoke(c0935i, null);
                return c17296c;
            case 2:
                String str = (String) obj3;
                if (str != null) {
                    C21795y c21795y = ((C8870f) obj2).f27149b;
                    C5411m c5411m = C5411m.f17686g;
                    c5411m.getClass();
                    String str2 = (String) obj;
                    AbstractC16544l.m18094g(str2, sVoFrD.OXPYMVIeMaDuAE);
                    AbstractC5364G0.m5889d(c21795y, c5411m.m5885a(new C5393d(i12, str, str2)), true);
                }
                return c17296c;
            case 3:
                ((InterfaceC0309z1) obj3).mo877a("geo:" + ((String) obj2) + "?q=" + ((String) obj));
                return c17296c;
            case 4:
                C19218t c19218t = (C19218t) ((InterfaceC19129V1) obj3);
                c19218t.f60963q0 = true;
                c19218t.f60964r0 = false;
                C11242m c11242m = (C11242m) obj2;
                ((ViewGroup) c11242m.f34018Y).removeView((View) obj);
                c11242m.f34020o0 = null;
                c11242m.f34019Z = null;
                return c17296c;
            case 5:
                if (AbstractC7861C4.m8133a((View) obj3).length() == 4 && (c19169g2 = (C19169g2) AbstractC8094g4.m8562c(AbstractC16526C.f51263a.mo5693b(C19169g2.class), ((C1407s0) obj2).f3751b)) != null) {
                    ((C1375d0) obj).f3655h.invoke(c19169g2);
                }
                return c17296c;
            case 6:
                ((C13421l) obj3).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a((C1360X0) obj2, new C0254h0((C1393l0) obj, 10)));
                return c17296c;
            case 7:
                ((C13421l) obj3).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a((C1360X0) obj2, new C1341N0((AbstractC1391k0) obj)));
                return c17296c;
            case 8:
                C0937I1 c0937i1 = (C0937I1) obj2;
                ((InterfaceC1436k) obj3).invoke(c0937i1.f2687c);
                ((C0471b) obj).invoke(c0937i1, null);
                return c17296c;
            case 9:
                ((InterfaceC1436k) obj3).invoke((AbstractC16428g) obj2);
                ((InterfaceC1426a) obj).invoke();
                return c17296c;
            case 10:
                ArrayList arrayList = (ArrayList) obj3;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (AbstractC16544l.m18089b(((C18173j) it.next()).f57968a, ((C7373x) obj).f23373c.f69534a)) {
                        ((InterfaceC1436k) obj2).invoke(new C18146I(arrayList, i11, 8));
                        return c17296c;
                    }
                    i11++;
                }
                i11 = -1;
                ((InterfaceC1436k) obj2).invoke(new C18146I(arrayList, i11, 8));
                return c17296c;
            case 11:
                InterfaceC7678d interfaceC7678d = (InterfaceC7678d) obj3;
                InterfaceC7682h interfaceC7682hMo3586a = interfaceC7678d.mo3586a();
                if (interfaceC7682hMo3586a instanceof C7681g) {
                    ((InterfaceC1426a) obj2).invoke();
                } else if (interfaceC7682hMo3586a instanceof C7680f) {
                    boolean zM10490b = AbstractC9842Z.m10490b(interfaceC7678d.mo3586a());
                    if (zM10490b) {
                        ((InterfaceC5985X) obj).setValue(Boolean.TRUE);
                    } else if (!zM10490b) {
                        interfaceC7678d.mo3587b();
                    }
                }
                return c17296c;
            case 12:
                AbstractC0575H.m1156D((C2925c) obj3, null, null, new C2520j1((InterfaceC1436k) obj2, (InterfaceC1426a) obj, null), 3);
                return c17296c;
            case 13:
                AbstractC5364G0.m5889d((C21795y) obj3, C5435y.f17770g.m5904d((String) obj2, (String) obj, true), true);
                return c17296c;
            case 14:
                if (AbstractC2729g.f8382a[((EnumC2731i) obj3).ordinal()] == 1) {
                    ((InterfaceC1426a) obj2).invoke();
                } else {
                    ((InterfaceC5985X) obj).setValue(Boolean.TRUE);
                }
                return c17296c;
            case 15:
                AbstractC22120R0.m22360g((Context) ((C2391u) obj3).f7429Z, (C13421l) obj2, (C22195t0) obj, true);
                return c17296c;
            case 16:
                AbstractC22120R0.m22360g((Context) ((C11238i) obj3).f34008Y, (C13421l) obj2, (C22195t0) obj, true);
                return c17296c;
            case 17:
                return Boolean.valueOf(((Boolean) ((InterfaceC5985X) obj2).getValue()).booleanValue() || !((List) ((InterfaceC5985X) obj).getValue()).contains(new C21984a1((String) obj3)));
            case 18:
                Context context = (Context) obj2;
                context.startActivity(AbstractC9405z3.m9981a(context, C5431w.f17746g.m5903d(((C2532n1) obj3).f7894a), AbstractC17681o.m19382k(268435456, 67108864)));
                ((AbstractActivityC17375g) obj).finish();
                return c17296c;
            case 19:
                InterfaceC3923H4 interfaceC3923H4 = (InterfaceC3923H4) obj3;
                C16557y c16557y = (C16557y) obj2;
                C16557y c16557y2 = (C16557y) obj;
                if (!AbstractC16544l.m18088a((interfaceC3923H4 == null || (state = interfaceC3923H4.getState()) == null) ? null : Float.valueOf(state.f12115a.m6409g()), c16557y.f51286Y - c16557y2.f51286Y)) {
                    C3935J4 state2 = interfaceC3923H4 != null ? interfaceC3923H4.getState() : null;
                    if (state2 != null) {
                        state2.f12115a.m6410h(c16557y.f51286Y - c16557y2.f51286Y);
                    }
                }
                return c17296c;
            case 20:
                if (((Boolean) ((InterfaceC1436k) ((C3880A3) obj3).f11737c.f34067d).invoke(EnumC3886B3.f11778Z)).booleanValue()) {
                    AbstractC0575H.m1156D((C2925c) obj2, null, null, new C4116q2((C3880A3) obj, null), 3);
                }
                return Boolean.TRUE;
            case 21:
                C4390J0.m5177f((C13421l) obj3, (C4390J0) obj2, (AbstractC4433h0) obj, false);
                return c17296c;
            case 22:
                RtpReceiver rtpReceiver = (RtpReceiver) obj3;
                MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
                if (mediaStreamTrackTrack != null) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    MediaStream[] streams = (MediaStream[]) obj;
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        mediaStreamTrackTrack.kind();
                        mediaStreamTrackTrack.m18749id();
                        String str3 = "";
                        for (MediaStream mediaStream : streams) {
                            str3 = str3 + ", " + mediaStream;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    C4727J0 c4727j0 = ((C4756Y0) obj2).f15514a.f46944d;
                    if (c4727j0 != null) {
                        AbstractC16544l.m18094g(streams, "streams");
                        if (streams.length < 0) {
                            C8395g c8395g2 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i2 = EnumC8397i.f26118o0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18569g(new Object[0]);
                            }
                        } else {
                            String id2 = ((MediaStream) AbstractC17678l.m19316w(streams)).getId();
                            AbstractC16544l.m18093f(id2, "getId(...)");
                            List listM21696d0 = AbstractC21322p.m21696d0(id2, new char[]{'|'}, 6);
                            C17309l c17309l = listM21696d0.size() != 2 ? new C17309l(id2, null) : new C17309l(listM21696d0.get(0), listM21696d0.get(1));
                            String str4 = (String) c17309l.f55137Z;
                            String strM18749id = (str4 == null || !AbstractC21329w.m21734u(str4, "TR", false)) ? mediaStreamTrackTrack.m18749id() : str4;
                            String sid = (String) c17309l.f55136Y;
                            AbstractC16544l.m18094g(sid, "sid");
                            AbstractC5821C abstractC5821CM5411f = c4727j0.m5411f(sid);
                            C5825G c5825g = abstractC5821CM5411f instanceof C5825G ? (C5825G) abstractC5821CM5411f : null;
                            if (c5825g == null) {
                                C8395g c8395g3 = AbstractC8396h.Companion;
                                EnumC8397i enumC8397i3 = EnumC8397i.f26120q0;
                                AbstractC8396h.Companion.getClass();
                                if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                    "Tried to add a track for a participant that is not present. sid: ".concat(sid);
                                    AbstractC22225a.f70470a.getClass();
                                    C16831c.m18568f(new Object[0]);
                                }
                            } else {
                                C15102a c15102a = c4727j0.f15376a;
                                c15102a.getClass();
                                C3350b0 c3350b0 = new C3350b0(c15102a.f46959s, 24, rtpReceiver);
                                AbstractC16544l.m18091d(strM18749id);
                                boolean z6 = c4727j0.f15398w;
                                int i13 = C5825G.f19027y;
                                c5825g.m6227k(mediaStreamTrackTrack, strM18749id, c3350b0, rtpReceiver, z6, 20);
                            }
                        }
                    }
                }
                return c17296c;
            case 23:
                AbstractC5364G0.m5889d((C21795y) obj3, C5435y.f17770g.m5904d((String) obj2, C21907E.m22337a(((C21908E0) obj).f69452a), false), true);
                return c17296c;
            case 24:
                String strMo19720c = ((AbstractC18176m) obj3).mo19720c();
                if (strMo19720c != null) {
                    ((C0256i) ((InterfaceC0172H0) obj)).m827c(new C3590f(6, strMo19720c, null));
                }
                ((C11709i) obj2).m13031a();
                return c17296c;
            case 25:
                C21585H c21585h = AbstractC5340g.f17559a;
                ((InterfaceC1439n) obj3).invoke((String) ((InterfaceC5985X) obj).getValue(), (C9566r) obj2);
                return c17296c;
            case 26:
                ((InterfaceC20904w) obj3).mo21447a(C20906y.f66636f, AbstractC0168G.m535x("entryPoint", ((EnumC7465v) obj2).name()));
                ((InterfaceC5985X) obj).setValue(Boolean.TRUE);
                return c17296c;
            case 27:
                AbstractC6482b0 abstractC6482b0 = (AbstractC6482b0) obj3;
                if (!abstractC6482b0.m7052d()) {
                    abstractC6482b0.mo7051c();
                    AbstractC6482b0 abstractC6482b1 = (AbstractC6482b0) obj2;
                    SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) obj;
                    abstractC6482b1.f21038j.add(surfaceHolderCallbackC4482b);
                    abstractC6482b1.mo7051c().addSink(surfaceHolderCallbackC4482b);
                }
                return c17296c;
            case 28:
                String str5 = (String) obj3;
                if (str5 != null) {
                    C8870f c8870f = (C8870f) obj2;
                    C8870f.m9547b(c8870f, R.string.downloading_spreadsheet);
                    Intent intent = new Intent();
                    AbstractC9186P.m9748b(intent, str5);
                    AbstractC9209T.m9776b((AbstractActivityC17375g) obj, c8870f, intent);
                }
                return c17296c;
            default:
                C6749o c6749o = (C6749o) obj3;
                c6749o.f21659a.close();
                ((C13421l) obj2).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c6749o, new C6593i((AbstractC6746l) obj, i10)));
                return c17296c;
        }
    }
}
