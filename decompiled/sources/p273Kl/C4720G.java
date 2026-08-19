package p273Kl;

import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12175n0;
import com.google.protobuf.C12168l;
import io.livekit.android.room.C15102a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitModels$Transcription;
import livekit.LivekitModels$TranscriptionSegment;
import livekit.LivekitModels$UserPacket;
import livekit.org.webrtc.DataChannel;
import p103Dn.C2127D0;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p199Hl.C3475K;
import p199Hl.C3480e;
import p199Hl.C3489n;
import p199Hl.C3492q;
import p199Hl.C3495t;
import p225Im.InterfaceC3776x;
import p344Nl.AbstractC5821C;
import p344Nl.C5825G;
import p344Nl.C5842n;
import p344Nl.C5846r;
import p344Nl.C5849u;
import p387Pl.AbstractC6470Q;
import p461Sl.C7146a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p793ho.EnumC14753h2;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Kl.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C4720G implements DataChannel.Observer {

    /* JADX INFO: renamed from: a */
    public final DataChannel f15352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C15102a f15353b;

    public C4720G(C15102a c15102a, DataChannel dataChannel) {
        AbstractC16544l.m18094g(dataChannel, "dataChannel");
        this.f15353b = c15102a;
        this.f15352a = dataChannel;
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onBufferedAmountChange(long j10) {
        this.f15353b.getClass();
        DataChannel dataChannel = this.f15352a;
        AbstractC16544l.m18094g(dataChannel, "dataChannel");
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onMessage(DataChannel.Buffer p10) {
        LinkedHashMap linkedHashMap;
        Map mapM6220d;
        C4727J0 c4727j0;
        byte[] bArr;
        AbstractC16544l.m18094g(p10, "p0");
        C15102a c15102a = this.f15353b;
        DataChannel dataChannel = this.f15352a;
        AbstractC16544l.m18094g(dataChannel, "dataChannel");
        ByteBuffer byteBuffer = p10.data;
        C12168l c12168l = AbstractC12171m.f37047Z;
        int iRemaining = byteBuffer.remaining();
        AbstractC12171m.m14009i(0, iRemaining, byteBuffer.remaining());
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer.get(bArr2);
        LivekitModels$DataPacket from = LivekitModels$DataPacket.parseFrom(new C12168l(bArr2));
        EnumC14753h2 valueCase = from.getValueCase();
        int i10 = valueCase == null ? -1 : AbstractC4722H.f15356a[valueCase.ordinal()];
        if (i10 != -1) {
            AbstractC6470Q abstractC6470Q = null;
            abstractC6470Q = null;
            if (i10 == 4) {
                C4727J0 room = c15102a.f46944d;
                if (room != null) {
                    LivekitModels$Transcription transcription = from.getTranscription();
                    AbstractC16544l.m18093f(transcription, "getTranscription(...)");
                    if (transcription.getSegmentsList().isEmpty()) {
                        C8395g c8395g = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18567d(new Object[0]);
                        return;
                    }
                    String transcribedParticipantIdentity = transcription.getTranscribedParticipantIdentity();
                    AbstractC16544l.m18093f(transcribedParticipantIdentity, "getTranscribedParticipantIdentity(...)");
                    AbstractC5821C abstractC5821C = room.f15400y;
                    String strM6218b = abstractC5821C.m6218b();
                    if (!(strM6218b != null ? transcribedParticipantIdentity.equals(strM6218b) : false)) {
                        abstractC5821C = (AbstractC5821C) room.m5409d().get(new C5846r(transcribedParticipantIdentity));
                    }
                    if (abstractC5821C != null && (mapM6220d = abstractC5821C.m6220d()) != null) {
                        abstractC6470Q = (AbstractC6470Q) mapM6220d.get(transcription.getTrackId());
                    }
                    List<LivekitModels$TranscriptionSegment> segmentsList = transcription.getSegmentsList();
                    AbstractC16544l.m18093f(segmentsList, "getSegmentsList(...)");
                    List<LivekitModels$TranscriptionSegment> list = segmentsList;
                    ArrayList<C7146a> arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        linkedHashMap = room.f15374G;
                        if (!zHasNext) {
                            break;
                        }
                        LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment = (LivekitModels$TranscriptionSegment) it.next();
                        AbstractC16544l.m18091d(livekitModels$TranscriptionSegment);
                        Long l4 = (Long) linkedHashMap.get(livekitModels$TranscriptionSegment.getId());
                        long jLongValue = l4 != null ? l4.longValue() : new Date().getTime();
                        String id2 = livekitModels$TranscriptionSegment.getId();
                        AbstractC16544l.m18093f(id2, "getId(...)");
                        String text = livekitModels$TranscriptionSegment.getText();
                        AbstractC16544l.m18093f(text, "getText(...)");
                        String language = livekitModels$TranscriptionSegment.getLanguage();
                        AbstractC16544l.m18093f(language, "getLanguage(...)");
                        arrayList.add(new C7146a(id2, text, language, livekitModels$TranscriptionSegment.getFinal(), jLongValue));
                    }
                    for (C7146a c7146a : arrayList) {
                        boolean z6 = c7146a.f22729d;
                        String str = c7146a.f22726a;
                        if (z6) {
                            linkedHashMap.remove(str);
                        } else {
                            linkedHashMap.put(str, Long.valueOf(c7146a.f22730e));
                        }
                    }
                    AbstractC16544l.m18094g(room, "room");
                    ((C2127D0) room.f15389n.f34081Z).mo3231f(new C3495t(room));
                    if (abstractC5821C != null && abstractC5821C.equals(abstractC5821C)) {
                        abstractC5821C.f18997d.m12669r(new C3480e(abstractC5821C), abstractC5821C.f18996c);
                    }
                    if (abstractC6470Q == null || !abstractC6470Q.equals(abstractC6470Q)) {
                        return;
                    }
                    ((C2127D0) abstractC6470Q.f20994e.f34081Z).mo3231f(new C3475K());
                    return;
                }
                return;
            }
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 == 2 && (c4727j0 = c15102a.f46944d) != null) {
                        LivekitModels$UserPacket user = from.getUser();
                        AbstractC16544l.m18093f(user, "getUser(...)");
                        AbstractC16544l.m18093f(from.getKind(), "getKind(...)");
                        String participantSid = user.getParticipantSid();
                        AbstractC16544l.m18093f(participantSid, "getParticipantSid(...)");
                        AbstractC5821C abstractC5821CM5411f = c4727j0.m5411f(participantSid);
                        C5825G c5825g = abstractC5821CM5411f instanceof C5825G ? (C5825G) abstractC5821CM5411f : null;
                        AbstractC12171m payload = user.getPayload();
                        int size = payload.size();
                        if (size == 0) {
                            bArr = AbstractC12175n0.f37051b;
                        } else {
                            byte[] bArr3 = new byte[size];
                            payload.mo14000p(size, bArr3);
                            bArr = bArr3;
                        }
                        if (user.hasTopic()) {
                            user.getTopic();
                        }
                        AbstractC16544l.m18091d(bArr);
                        C3492q c3492q = new C3492q(c4727j0, bArr);
                        C2925c c2925c = c4727j0.f15388m;
                        if (c2925c == null) {
                            AbstractC16544l.m18103p("coroutineScope");
                            throw null;
                        }
                        c4727j0.f15389n.m12669r(c3492q, c2925c);
                        if (c5825g != null) {
                            c5825g.f18997d.m12669r(new C3480e(c5825g), c5825g.f18996c);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C4727J0 c4727j1 = c15102a.f46944d;
                if (c4727j1 != null) {
                    List<LivekitModels$SpeakerInfo> speakersList = from.getSpeaker().getSpeakersList();
                    AbstractC16544l.m18093f(speakersList, "getSpeakersList(...)");
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakersList) {
                        String sid = livekitModels$SpeakerInfo.getSid();
                        AbstractC16544l.m18093f(sid, "getSid(...)");
                        linkedHashSet.add(new C5849u(sid));
                        AbstractC5821C abstractC5821CM5411f2 = c4727j1.m5411f(sid);
                        if (abstractC5821CM5411f2 != null) {
                            abstractC5821CM5411f2.m6223g(livekitModels$SpeakerInfo.getLevel());
                            abstractC5821CM5411f2.m6224h(true);
                            arrayList2.add(abstractC5821CM5411f2);
                        }
                    }
                    C5842n c5842n = c4727j1.f15400y;
                    if (!linkedHashSet.contains(new C5849u(c5842n.f18994a))) {
                        c5842n.m6223g(0.0f);
                        c5842n.m6224h(false);
                    }
                    Collection collectionValues = c4727j1.m5409d().values();
                    ArrayList<C5825G> arrayList3 = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (!linkedHashSet.contains(new C5849u(((C5825G) obj).f18994a))) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C5825G c5825g2 : arrayList3) {
                        c5825g2.m6223g(0.0f);
                        c5825g2.m6224h(false);
                    }
                    List listM19322C0 = AbstractC17680n.m19322C0(arrayList2);
                    InterfaceC3776x[] interfaceC3776xArr = C4727J0.f15367I;
                    InterfaceC3776x interfaceC3776x = interfaceC3776xArr[6];
                    C8398j c8398j = c4727j1.f15369B;
                    c8398j.m8944g(listM19322C0, interfaceC3776x);
                    C3489n c3489n = new C3489n(c4727j1, (List) c8398j.m8943c(interfaceC3776xArr[6]));
                    C2925c c2925c2 = c4727j1.f15388m;
                    if (c2925c2 != null) {
                        c4727j1.f15389n.m12669r(c3489n, c2925c2);
                        return;
                    } else {
                        AbstractC16544l.m18103p("coroutineScope");
                        throw null;
                    }
                }
                return;
            }
        }
        C8395g c8395g2 = AbstractC8396h.Companion;
        EnumC8397i enumC8397i2 = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i2.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18570i(new Object[0]);
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onStateChange() {
        this.f15353b.getClass();
        DataChannel dataChannel = this.f15352a;
        AbstractC16544l.m18094g(dataChannel, "dataChannel");
    }
}
