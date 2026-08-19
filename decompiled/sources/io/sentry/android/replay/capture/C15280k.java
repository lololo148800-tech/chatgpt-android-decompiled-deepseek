package io.sentry.android.replay.capture;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.C15108A1;
import io.sentry.C15109B;
import io.sentry.C15128H0;
import io.sentry.C15345d;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15288d;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15295i;
import io.sentry.android.replay.C15296j;
import io.sentry.android.replay.video.C15310a;
import io.sentry.android.replay.video.C15311b;
import io.sentry.protocol.C15447t;
import io.sentry.rrweb.AbstractC15461b;
import io.sentry.rrweb.C15460a;
import io.sentry.rrweb.C15469j;
import io.sentry.rrweb.C15471l;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p193Hf.C3353c0;
import p200Hm.C3509h;
import p200Hm.C3511j;
import p342Nj.C5808b;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8656j3;
import p758g0.C13775m0;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15280k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public static AbstractC15283n m16510a(C15109B c15109b, C15524y1 options, long j10, Date date, C15447t replayId, int i10, int i11, int i12, EnumC15527z1 enumC15527z1, C15294h c15294h, int i13, int i14, String str, List list, Deque deque) {
        Object obj;
        int i15;
        long j11;
        Object obj2;
        long j12;
        C15295i c15295i;
        List<C15345d> list2;
        AbstractC15461b abstractC15461bMo16261q;
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(replayId, "replayId");
        if (c15294h != null) {
            long time = date.getTime();
            File file = new File(c15294h.m16518k(), i10 + ".mp4");
            long jConvert = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            C15288d c15288d = null;
            if (c15294h.f47778s0.isEmpty()) {
                c15294h.f47772Y.getLogger().mo16298o(EnumC15375i1.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                obj2 = null;
            } else {
                Object obj3 = c15294h.f47775p0;
                synchronized (obj3) {
                    try {
                        obj = obj3;
                        try {
                            C5808b c5808b = new C5808b(c15294h.f47772Y, new C15310a(file, i12, i11, i13, i14));
                            MediaFormat mediaFormat = (MediaFormat) c5808b.f18962r0.getValue();
                            MediaCodec mediaCodec = (MediaCodec) c5808b.f18961q0;
                            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                            c5808b.f18965u0 = mediaCodec.createInputSurface();
                            mediaCodec.start();
                            c5808b.m6197a(false);
                            c15294h.f47776q0 = c5808b;
                            long j13 = ((long) 1000) / ((long) i13);
                            C15295i c15295i2 = (C15295i) AbstractC17680n.m19341Q(c15294h.f47778s0);
                            long j14 = time + j10;
                            C3511j c3511j = j14 <= Long.MIN_VALUE ? C3511j.f10606p0 : new C3511j(time, j14 - 1);
                            AbstractC16544l.m18094g(c3511j, "<this>");
                            AbstractC8301I.m8914e(j13 > 0, Long.valueOf(j13));
                            long j15 = c3511j.f10601o0 > 0 ? j13 : -j13;
                            long j16 = c3511j.f10599Y;
                            long j17 = new C3509h(j16, c3511j.f10600Z, j15).f10600Z;
                            if ((j15 <= 0 || j16 > j17) && (j15 >= 0 || j17 > j16)) {
                                i15 = 0;
                            } else {
                                C15295i c15295i3 = c15295i2;
                                int i16 = 0;
                                while (true) {
                                    Iterator it = c15294h.f47778s0.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Iterator it2 = it;
                                            c15295i = (C15295i) it.next();
                                            long j18 = j16 + j13;
                                            j12 = j13;
                                            long j19 = c15295i.f47782b;
                                            if (j16 <= j19 && j19 <= j18) {
                                                break;
                                            }
                                            if (j19 <= j18) {
                                                it = it2;
                                                j13 = j12;
                                            }
                                        } else {
                                            j12 = j13;
                                        }
                                        c15295i = c15295i3;
                                        break;
                                    }
                                    if (c15294h.m16517e(c15295i)) {
                                        i16++;
                                    }
                                    if (j16 == j17) {
                                        break;
                                    }
                                    j16 += j15;
                                    c15295i3 = c15295i;
                                    j13 = j12;
                                }
                                i15 = i16;
                            }
                            if (i15 == 0) {
                                c15294h.f47772Y.getLogger().mo16298o(EnumC15375i1.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                c15294h.m16516a(file);
                                c15288d = null;
                                obj2 = null;
                            } else {
                                synchronized (c15294h.f47775p0) {
                                    try {
                                        C5808b c5808b2 = c15294h.f47776q0;
                                        if (c5808b2 != null) {
                                            c5808b2.m6198b();
                                        }
                                        C5808b c5808b3 = c15294h.f47776q0;
                                        if (c5808b3 != null) {
                                            C15311b c15311b = (C15311b) c5808b3.f18964t0;
                                            if (c15311b.f47836e != 0) {
                                                jConvert = TimeUnit.MILLISECONDS.convert(c15311b.f47837f + c15311b.f47832a, TimeUnit.MICROSECONDS);
                                            }
                                        }
                                        j11 = jConvert;
                                        c15294h.f47776q0 = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C16525B c16525b = new C16525B();
                                obj2 = null;
                                AbstractC17686t.m19393A(c15294h.f47778s0, new C3353c0(j14, c15294h, c16525b, 4));
                                c15288d = new C15288d(file, i15, j11);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj3;
                    }
                }
            }
            if (c15288d != null) {
                File file2 = c15288d.f47752a;
                int i17 = c15288d.f47753b;
                long j20 = c15288d.f47754c;
                if (list == null) {
                    C16525B c16525b2 = new C16525B();
                    c16525b2.f51262Y = C17689w.f56480Y;
                    if (c15109b != null) {
                        c15109b.mo16253v(new C15296j(c16525b2, 1));
                    }
                    list2 = (List) c16525b2.f51262Y;
                } else {
                    list2 = list;
                }
                Date dateM9341i = AbstractC8656j3.m9341i(date.getTime() + j20);
                AbstractC16544l.m18093f(dateM9341i, "getDateTime(segmentTimestamp.time + videoDuration)");
                C15108A1 c15108a1 = new C15108A1();
                c15108a1.f47194Y = replayId;
                c15108a1.f47009E0 = replayId;
                c15108a1.f47010F0 = i10;
                c15108a1.f47011G0 = dateM9341i;
                c15108a1.f47012H0 = date;
                c15108a1.f47008D0 = enumC15527z1;
                c15108a1.f47006B0 = file2;
                ArrayList arrayList = new ArrayList();
                C15469j c15469j = new C15469j();
                c15469j.f48291Z = date.getTime();
                c15469j.f48311p0 = i11;
                c15469j.f48312q0 = i12;
                arrayList.add(c15469j);
                C15471l c15471l = new C15471l();
                c15471l.f48291Z = date.getTime();
                c15471l.f48328p0 = i10;
                c15471l.f48330r0 = j20;
                c15471l.f48335w0 = i17;
                c15471l.f48329q0 = file2.length();
                c15471l.f48337y0 = i13;
                c15471l.f48333u0 = i11;
                c15471l.f48334v0 = i12;
                c15471l.f48338z0 = 0;
                c15471l.f48323A0 = 0;
                arrayList.add(c15471l);
                LinkedList linkedList = new LinkedList();
                for (C15345d c15345d : list2) {
                    if (c15345d.m16573a().getTime() + 100 >= date.getTime() && c15345d.m16573a().getTime() < dateM9341i.getTime() && (abstractC15461bMo16261q = options.getReplayController().getF47667y0().mo16261q(c15345d)) != null) {
                        arrayList.add(abstractC15461bMo16261q);
                        C15460a c15460a = abstractC15461bMo16261q instanceof C15460a ? (C15460a) abstractC15461bMo16261q : null;
                        if (AbstractC16544l.m18089b(c15460a != null ? c15460a.f48283r0 : null, "navigation")) {
                            ConcurrentHashMap concurrentHashMap = ((C15460a) abstractC15461bMo16261q).f48286u0;
                            AbstractC16544l.m18091d(concurrentHashMap);
                            V v2 = concurrentHashMap.get("to");
                            AbstractC16544l.m18092e(v2, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) v2);
                        }
                    }
                }
                if (str != null && !AbstractC16544l.m18089b(AbstractC17680n.m19343S(linkedList), str)) {
                    linkedList.addFirst(str);
                }
                long time2 = dateM9341i.getTime();
                C13775m0 c13775m0 = new C13775m0(date, 13, arrayList);
                Iterator it3 = deque.iterator();
                AbstractC16544l.m18093f(it3, "events.iterator()");
                while (it3.hasNext()) {
                    AbstractC15461b abstractC15461b = (AbstractC15461b) it3.next();
                    if (abstractC15461b.f48291Z < time2) {
                        c13775m0.invoke(abstractC15461b);
                        it3.remove();
                    }
                }
                C15128H0 c15128h0 = new C15128H0();
                c15128h0.f47093Y = Integer.valueOf(i10);
                c15128h0.f47094Z = AbstractC17680n.m19370t0(arrayList, new C15279j());
                c15108a1.f47013I0 = linkedList;
                return new C15281l(c15108a1, c15128h0);
            }
        }
        return C15282m.f47741a;
    }
}
