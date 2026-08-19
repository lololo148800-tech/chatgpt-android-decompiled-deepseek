package p722e8;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.glance.session.SessionWorker;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.feature.interstitial.FeatureInterstitialViewModel;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import fj.C13677i;
import gd.C14005w2;
import gd.EnumC13846D;
import ie.C14975d;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.video.C15310a;
import java.io.EOFException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kg.C16397c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import ng.C17610a;
import om.C18238e;
import p003A1.AbstractC0187M0;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p025An.InterfaceC0571F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;
import p059C5.C1601s;
import p103Dn.C2153Q0;
import p1140z1.AbstractC21690f;
import p225Im.InterfaceC3754b;
import p225Im.InterfaceC3756d;
import p342Nj.C5808b;
import p349O0.C5984W0;
import p408Qj.C6748n;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8138m0;
import p523V9.AbstractC8183r5;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;
import p588Y2.C9642z;
import p594Y9.AbstractC9949p4;
import p676c7.C11682a;
import p729ej.C13420k;
import p729ej.C13425p;
import p729ej.C13433x;
import p737f1.AbstractC13512d;
import p749fd.C13628m;
import p758g0.AbstractC13758e;
import p758g0.C13796x;
import p773h0.AbstractC14289j;
import p773h0.C14245A;
import p773h0.C14256K;
import p791hj.InterfaceC14521d;
import p809if.C14978c;
import p814ik.C15033e;
import p823j3.C16087i;
import p823j3.C16089k;
import p836jh.C16210b;
import p836jh.C16211c;
import p838jj.AbstractC16236q;
import p849k7.C16360m;
import p858ko.C16493L;
import p858ko.C16495N;
import p860l0.C16733d1;
import p878lo.C17100i;
import p948pi.C18418a;
import pf.C18388d;

/* JADX INFO: renamed from: e8.H */
/* JADX INFO: loaded from: classes.dex */
public final class C13298H extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42033Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f42034Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13298H(Object obj, int i10) {
        super(0);
        this.f42033Y = i10;
        this.f42034Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws EOFException {
        int i10 = 11;
        int i11 = 3;
        int i12 = 0;
        switch (this.f42033Y) {
            case 0:
                return String.format(Locale.US, "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.", Arrays.copyOf(new Object[]{((C13302L) this.f42034Z).f42063b}, 1));
            case 1:
                Locale locale = Locale.US;
                C13341y c13341y = (C13341y) this.f42034Z;
                return String.format(locale, "RUM Action (%s on %s) was dropped, because another action is still active for the same view", Arrays.copyOf(new Object[]{c13341y.f42318b, c13341y.f42319c}, 2));
            case 2:
                return String.format(Locale.US, "The computed duration for the view: %s was 0 or negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{((C13315Z) this.f42034Z).f42185d.f42079c}, 1));
            case 3:
                return (C0678l) this.f42034Z;
            case 4:
                C0675i c0675i = new C0675i();
                ((C6748n) this.f42034Z).invoke(c0675i);
                return c0675i.m1417C0(c0675i.f1970Z);
            case 5:
                C0675i c0675i2 = (C0675i) this.f42034Z;
                int iM1420N0 = c0675i2.m1420N0();
                C18238e c18238e = new C18238e(iM1420N0);
                while (i12 < iM1420N0) {
                    i12++;
                    C0678l bytes = AbstractC8183r5.m8764b(c0675i2);
                    AbstractC16544l.m18094g(bytes, "bytes");
                    C0675i c0675i3 = new C0675i();
                    c0675i3.m1432c1(bytes);
                    C13677i c13677i = new C13677i(AbstractC8199t5.m8802a(AbstractC8183r5.m8764b(c0675i3)), AbstractC8183r5.m8764b(c0675i3).m1452r());
                    C0678l bytes2 = AbstractC8183r5.m8764b(c0675i2);
                    AbstractC16544l.m18094g(bytes2, "bytes");
                    C0675i c0675i4 = new C0675i();
                    c0675i4.m1432c1(bytes2);
                    C0678l byteString = AbstractC8183r5.m8764b(c0675i4);
                    AbstractC16544l.m18094g(byteString, "byteString");
                    c18238e.put(c13677i, new C13425p(new C13420k(new C13298H(byteString, i11)), new C13298H(c0675i4, 5)));
                }
                return c18238e.m19755b();
            case 6:
                InterfaceC3754b interfaceC3754b = ((C13433x) this.f42034Z).f42526a;
                return interfaceC3754b instanceof InterfaceC3756d ? AbstractC8138m0.m8667b((InterfaceC3756d) interfaceC3754b).getName() : interfaceC3754b.toString();
            case 7:
                return (LinkedHashMap) this.f42034Z;
            case 8:
                return Float.valueOf(AbstractC13758e.m15251p(((InterfaceC0571F) this.f42034Z).getCoroutineContext()));
            case 9:
                C2153Q0 c2153q0 = ((C14005w2) this.f42034Z).f44086d;
                EnumC13846D enumC13846D = EnumC13846D.f43883Z;
                c2153q0.getClass();
                c2153q0.m3251l(null, enumC13846D);
                return C17296C.f55119a;
            case 10:
                ((MessageAudioViewModel) this.f42034Z).m14395k(C18388d.f58668a);
                return C17296C.f55119a;
            case 11:
                ((AbstractC14289j) this.f42034Z).f44845G0.invoke();
                return Boolean.TRUE;
            case 12:
                InterfaceC1426a interfaceC1426a = ((C14245A) this.f42034Z).f44704U0;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                return Boolean.TRUE;
            case 13:
                return Boolean.valueOf(AbstractC13512d.m15028A((C14256K) this.f42034Z));
            case 14:
                ((CollectEmailViewModel) this.f42034Z).m14395k(C17610a.f56367a);
                return C17296C.f55119a;
            case 15:
                ((FinishAccountViewModel) this.f42034Z).m14395k(C16397c.f50910a);
                return C17296C.f55119a;
            case 16:
                C18418a accountSession = ((C14975d) this.f42034Z).f46630a;
                AbstractC16544l.m18094g(accountSession, "accountSession");
                return AbstractC9306j0.m9891j(accountSession.f58777e, "_conversations.db", new StringBuilder());
            case 17:
                ((FeatureInterstitialViewModel) this.f42034Z).m14395k(C14978c.f46636a);
                return C17296C.f55119a;
            case 18:
                return ((C15033e) this.f42034Z).f46730a.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
            case 19:
                C5808b c5808b = (C5808b) this.f42034Z;
                C15310a c15310a = (C15310a) c5808b.f18958Z;
                C15524y1 c15524y1 = (C15524y1) c5808b.f18957Y;
                C15310a c15310a2 = (C15310a) c5808b.f18958Z;
                int iIntValue = c15310a.f47830e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) c5808b.f18961q0).getCodecInfo().getCapabilitiesForType(c15310a2.f47831f).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Comparable comparableClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        AbstractC16544l.m18093f(comparableClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        iIntValue = ((Number) comparableClamp).intValue();
                    }
                    break;
                } catch (Throwable th2) {
                    c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c15310a2.f47831f, c15310a2.f47827b, c15310a2.f47828c);
                AbstractC16544l.m18093f(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", c15310a2.f47829d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 20:
                C16089k c16089k = (C16089k) this.f42034Z;
                long jLongValue = ((Number) c16089k.f49829q0.invoke()).longValue();
                C16524A c16524a = new C16524A();
                C16524A c16524a2 = new C16524A();
                synchronized (c16089k.f49831s0) {
                    c16524a.f51261Y = jLongValue - c16089k.f49833u0;
                    c16524a2.f51261Y = 1000000000 / ((long) c16089k.f49832t0);
                }
                AbstractC0575H.m1156D(c16089k.f49825Y, null, null, new C16087i(c16524a, c16524a2, c16089k, jLongValue, null), 3);
                return C17296C.f55119a;
            case 21:
                C0631p0 c0631p0M1175d = AbstractC0575H.m1175d();
                ((SessionWorker) this.f42034Z).getClass();
                return c0631p0M1175d;
            case 22:
                C16210b c16210b = (C16210b) this.f42034Z;
                c16210b.getClass();
                return AbstractC9949p4.m10607a("ChatGptAccountIdHeaderPlugin", new C1601s(i10), new C13628m(c16210b, 24));
            case 23:
                C16211c c16211c = (C16211c) this.f42034Z;
                c16211c.getClass();
                return AbstractC9949p4.m10607a("ChatGptAccountIdHeaderPlugin", new C1601s(i10), new C13628m(c16211c, 25));
            case 24:
                AbstractC16236q view = (AbstractC16236q) this.f42034Z;
                AbstractC16544l.m18094g(view, "view");
                InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view);
                InterfaceC14521d interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
                if (interfaceC14521d != null) {
                    return interfaceC14521d;
                }
                throw new IllegalStateException(AbstractC16544l.m18100m(view, "Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ").toString());
            case 25:
                return String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{((C16360m) this.f42034Z).f50808b.getName()}, 1));
            case 26:
                C16495N c16495n = (C16495N) this.f42034Z;
                if (c16495n.f51169B0.m18058k()) {
                    AbstractC0575H.m1156D(c16495n.m10935y0(), null, null, new C16493L(c16495n, null), 3);
                }
                return C17296C.f55119a;
            case 27:
                C5984W0 c5984w0 = AbstractC0187M0.f704f;
                C16733d1 c16733d1 = (C16733d1) this.f42034Z;
                c16733d1.f53649N0.f53455a = new C13796x(new C9642z((InterfaceC7537b) AbstractC21690f.m22204i(c16733d1, c5984w0)));
                return C17296C.f55119a;
            case 28:
                return Boolean.valueOf(((C17100i) this.f42034Z).f54651z0.m18054g().f54661c.f54658b > 1.0f);
            default:
                return "Unable to find host for site " + ((C11682a) this.f42034Z).f35409a + "; we will retry later.";
        }
    }
}
