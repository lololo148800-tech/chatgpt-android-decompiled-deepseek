package p855kj;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17314q;
import p001A.AbstractC0010F;
import p003A1.AbstractC0232b0;
import p003A1.C0195P;
import p007A5.C0376k;
import p049Bm.InterfaceC1439n;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1726d;
import p571X9.AbstractC9227W;
import p907nj.C17643a;
import p907nj.InterfaceC17644b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C16432k {

    /* JADX INFO: renamed from: l */
    public static final C17314q f50971l = AbstractC9227W.m9800c(C16422a.f50951Y);

    /* JADX INFO: renamed from: a */
    public InterfaceC1439n f50972a;

    /* JADX INFO: renamed from: b */
    public int f50973b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17644b f50974c;

    /* JADX INFO: renamed from: d */
    public final List f50975d;

    /* JADX INFO: renamed from: e */
    public AbstractC16428g f50976e;

    /* JADX INFO: renamed from: f */
    public AbstractC16428g f50977f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentSkipListSet f50978g;

    /* JADX INFO: renamed from: h */
    public boolean f50979h;

    /* JADX INFO: renamed from: i */
    public boolean f50980i;

    /* JADX INFO: renamed from: j */
    public final C0376k f50981j;

    /* JADX INFO: renamed from: k */
    public final C16429h f50982k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    public C16432k(Context context, boolean z6, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, List preferredDeviceList) {
        ?? M19323D0;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(audioFocusChangeListener, "audioFocusChangeListener");
        AbstractC16544l.m18094g(preferredDeviceList, "preferredDeviceList");
        C0376k logger = new C0376k(12, false);
        logger.f1278Z = z6;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        AudioManager audioManager = (AudioManager) systemService;
        C16429h audioDeviceManager = new C16429h(context, logger, audioManager, audioFocusChangeListener);
        C17643a c17643a = new C17643a(audioManager, new Handler(Looper.getMainLooper()));
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(audioFocusChangeListener, "audioFocusChangeListener");
        AbstractC16544l.m18094g(logger, "logger");
        AbstractC16544l.m18094g(preferredDeviceList, "preferredDeviceList");
        AbstractC16544l.m18094g(audioDeviceManager, "audioDeviceManager");
        this.f50981j = logger;
        this.f50982k = audioDeviceManager;
        this.f50973b = 3;
        this.f50974c = c17643a;
        this.f50979h = true;
        List<Class> list = preferredDeviceList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class cls : list) {
            Object c16558z = linkedHashMap.get(cls);
            if (c16558z == null && !linkedHashMap.containsKey(cls)) {
                c16558z = new C16558z();
            }
            C16558z c16558z2 = (C16558z) c16558z;
            c16558z2.f51287Y++;
            linkedHashMap.put(cls, c16558z2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC16544l.m18092e(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof InterfaceC1723a) && !(entry instanceof InterfaceC1726d)) {
                AbstractC16529F.m18084h(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((C16558z) entry.getValue()).f51287Y));
        }
        Map mapM18079c = AbstractC16529F.m18079c(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : mapM18079c.entrySet()) {
            if (((Number) entry2.getValue()).intValue() > 1) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean zIsEmpty = preferredDeviceList.isEmpty();
        C17314q c17314q = f50971l;
        if (zIsEmpty || preferredDeviceList.equals((List) c17314q.getValue())) {
            M19323D0 = (List) c17314q.getValue();
        } else {
            M19323D0 = AbstractC17680n.m19323D0((List) c17314q.getValue());
            M19323D0.removeAll(preferredDeviceList);
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                M19323D0.add(i10, (Class) obj);
                i10 = i11;
            }
        }
        this.f50975d = M19323D0;
        this.f50978g = new ConcurrentSkipListSet(new C0195P((List) M19323D0));
        this.f50981j.m1013f("AudioSwitch", "AudioSwitch(1.2.0)");
        C0376k c0376k = this.f50981j;
        StringBuilder sb2 = new StringBuilder("Preferred device list = ");
        Iterable iterable = (Iterable) M19323D0;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        sb2.append(arrayList);
        c0376k.m1013f("AudioSwitch", sb2.toString());
    }

    /* JADX INFO: renamed from: d */
    public static void m18012d(C16432k c16432k, boolean z6) {
        Object next;
        AbstractC16428g it;
        AbstractC16428g abstractC16428g = c16432k.f50976e;
        InterfaceC17644b interfaceC17644b = c16432k.f50974c;
        if (abstractC16428g == null || !interfaceC17644b.mo19240b(abstractC16428g)) {
            Iterator it2 = c16432k.f50978g.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    it = (AbstractC16428g) next;
                    AbstractC16544l.m18093f(it, "it");
                }
            } while (!interfaceC17644b.mo19240b(it));
            abstractC16428g = (AbstractC16428g) next;
        }
        c16432k.m18015c(z6, abstractC16428g);
    }

    /* JADX INFO: renamed from: a */
    public final void m18013a() {
        AbstractC16428g abstractC16428g;
        int iM24h = AbstractC0010F.m24h(this.f50973b);
        if (iM24h != 0) {
            if (iM24h != 1) {
                if (iM24h == 2) {
                    throw new IllegalStateException();
                }
                return;
            }
            AbstractC16428g abstractC16428g2 = this.f50977f;
            if (abstractC16428g2 != null) {
                abstractC16428g = m18016e() ? abstractC16428g2 : null;
                if (abstractC16428g != null) {
                    m18014b(abstractC16428g);
                    return;
                }
                return;
            }
            return;
        }
        C16429h c16429h = this.f50982k;
        AudioManager audioManager = c16429h.f50968l;
        c16429h.f50957a = audioManager.getMode();
        c16429h.f50958b = audioManager.isMicrophoneMute();
        c16429h.f50959c = audioManager.isSpeakerphoneOn();
        AudioManager audioManager2 = c16429h.f50968l;
        audioManager2.setMicrophoneMute(false);
        if (this.f50979h) {
            int i10 = Build.VERSION.SDK_INT;
            AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = c16429h.f50969m;
            if (i10 >= 26) {
                int i11 = c16429h.f50962f;
                int i12 = c16429h.f50964h;
                int i13 = c16429h.f50965i;
                AbstractC16544l.m18094g(audioFocusChangeListener, "audioFocusChangeListener");
                AudioFocusRequest audioFocusRequestBuild = AbstractC0232b0.m749g(i11).setAudioAttributes(new AudioAttributes.Builder().setUsage(i12).setContentType(i13).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(audioFocusChangeListener).build();
                AbstractC16544l.m18093f(audioFocusRequestBuild, "AudioFocusRequest.Builde…ner)\n            .build()");
                c16429h.f50960d = audioFocusRequestBuild;
                audioManager2.requestAudioFocus(audioFocusRequestBuild);
            } else {
                audioManager2.requestAudioFocus(audioFocusChangeListener, c16429h.f50963g, c16429h.f50962f);
            }
            audioManager2.setMode(c16429h.f50961e);
        }
        AbstractC16428g abstractC16428g3 = this.f50977f;
        if (abstractC16428g3 != null) {
            abstractC16428g = m18016e() ? abstractC16428g3 : null;
            if (abstractC16428g != null) {
                m18014b(abstractC16428g);
            }
        }
        this.f50973b = 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m18014b(AbstractC16428g abstractC16428g) {
        this.f50981j.m1013f("AudioSwitch", "onActivate(" + abstractC16428g + ')');
        boolean z6 = abstractC16428g instanceof C16424c;
        C16429h c16429h = this.f50982k;
        if (z6) {
            c16429h.m18011b(false);
            c16429h.m18010a(true);
        } else if ((abstractC16428g instanceof C16425d) || (abstractC16428g instanceof C16427f)) {
            c16429h.m18011b(false);
            c16429h.m18010a(false);
        } else if (abstractC16428g instanceof C16426e) {
            c16429h.m18010a(false);
            c16429h.m18011b(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18015c(boolean z6, AbstractC16428g abstractC16428g) {
        InterfaceC1439n interfaceC1439n;
        boolean zM18089b = AbstractC16544l.m18089b(this.f50977f, abstractC16428g);
        ConcurrentSkipListSet concurrentSkipListSet = this.f50978g;
        if (zM18089b) {
            if (!z6 || (interfaceC1439n = this.f50972a) == null) {
                return;
            }
            return;
        }
        if (m18016e()) {
            this.f50981j.m1013f("AudioSwitch", "Current user selected AudioDevice = " + this.f50976e);
            this.f50977f = abstractC16428g;
            if (this.f50973b == 2) {
                m18013a();
            }
        }
        InterfaceC1439n interfaceC1439n2 = this.f50972a;
        if (interfaceC1439n2 != null) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18016e() {
        int i10 = this.f50982k.f50961e;
        return this.f50980i || i10 == 3 || i10 == 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m18017f(InterfaceC1439n listener) {
        AbstractC16544l.m18094g(listener, "listener");
        this.f50972a = listener;
        if (AbstractC0010F.m24h(this.f50973b) != 2) {
            this.f50981j.m1013f("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
        } else {
            this.f50974c.mo19239a(this);
            this.f50973b = 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18018g() {
        int iM24h = AbstractC0010F.m24h(this.f50973b);
        InterfaceC17644b interfaceC17644b = this.f50974c;
        if (iM24h == 0) {
            interfaceC17644b.stop();
            this.f50972a = null;
            this.f50973b = 3;
            return;
        }
        if (iM24h != 1) {
            if (iM24h != 2) {
                return;
            }
            this.f50981j.m1013f("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
            return;
        }
        if (AbstractC0010F.m24h(this.f50973b) == 1) {
            this.f50981j.m1013f("AudioSwitch", "onDeactivate");
            if (this.f50977f instanceof C16424c) {
                this.f50982k.m18010a(false);
            }
            C16429h c16429h = this.f50982k;
            int i10 = c16429h.f50957a;
            AudioManager audioManager = c16429h.f50968l;
            audioManager.setMode(i10);
            audioManager.setMicrophoneMute(c16429h.f50958b);
            c16429h.m18011b(c16429h.f50959c);
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = c16429h.f50960d;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                c16429h.f50960d = null;
            } else {
                audioManager.abandonAudioFocus(c16429h.f50969m);
            }
            this.f50973b = 1;
        }
        interfaceC17644b.stop();
        this.f50972a = null;
        this.f50973b = 3;
    }
}
