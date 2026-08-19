package p273Kl;

import android.gov.nist.javax.sdp.MediaDescriptionImpl;
import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.parser.SDPAnnounceParser;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p102Dm.AbstractC2119a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p1160zp.AbstractC22225a;
import p117Eb.C2392v;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p557Wl.AbstractC8952h;
import p557Wl.C8955k;
import p557Wl.C8956l;
import p557Wl.C8957m;
import p557Wl.C8958n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p668c.C11549i;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p909nm.C17662G;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C4774h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f15568Y;

    /* JADX INFO: renamed from: Z */
    public int f15569Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MediaConstraints f15570o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4808y f15571p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16525B f15572q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4774h(MediaConstraints mediaConstraints, C4808y c4808y, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15570o0 = mediaConstraints;
        this.f15571p0 = c4808y;
        this.f15572q0 = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4774h(this.f15570o0, this.f15571p0, this.f15572q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4774h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0594 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:217:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:219:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:225:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:230:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object next2;
        String value;
        Object objM3553j;
        AbstractC8394f abstractC8394f;
        EnumC8397i enumC8397i;
        SessionDescription sessionDescription;
        Iterator it;
        EnumC19250a enumC19250a;
        C17296C c17296c;
        C16525B c16525b;
        Object objM5441e;
        Object next3;
        MediaDescriptionImpl mediaDescriptionImpl;
        EnumC19250a enumC19250a2;
        C17296C c17296c2;
        Iterator it2;
        Object next4;
        String string;
        C17309l c17309l;
        C8958n c8958n;
        String str;
        boolean z6;
        boolean z10;
        C17309l c17309l2;
        EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
        int i10 = this.f15569Z;
        C17296C c17296c3 = C17296C.f55119a;
        MediaConstraints mediaConstraints = this.f15570o0;
        boolean z11 = true;
        C4808y c4808y = this.f15571p0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                objM3553j = obj;
                abstractC8394f = (AbstractC8394f) objM3553j;
                if (abstractC8394f instanceof C8392d) {
                    if (abstractC8394f instanceof C8393e) {
                        throw new C0644w();
                    }
                    C8395g c8395g = AbstractC8396h.Companion;
                    enumC8397i = EnumC8397i.f26117Z;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18567d(new Object[0]);
                    }
                    return c17296c3;
                }
                sessionDescription = (SessionDescription) ((C8392d) abstractC8394f).f26113a;
                if (c4808y.f15685h.get()) {
                    return c17296c3;
                }
                String str2 = sessionDescription.description;
                c4808y.f15679b.getClass();
                try {
                    SessionDescriptionImpl sessionDescriptionImpl = new SDPAnnounceParser(str2).parse();
                    it = sessionDescriptionImpl.getMediaDescriptions(true).iterator();
                    while (it.hasNext()) {
                        next3 = it.next();
                        if (!(next3 instanceof MediaDescriptionImpl)) {
                            mediaDescriptionImpl = (MediaDescriptionImpl) next3;
                            if (AbstractC16544l.m18089b(mediaDescriptionImpl.getMedia().getMediaType(), MediaStreamTrack.AUDIO_TRACK_KIND) && AbstractC16544l.m18089b(mediaDescriptionImpl.getMedia().getMediaType(), MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                C17309l c17309l3 = (C17309l) AbstractC17680n.m19343S(AbstractC8952h.m9569a(mediaDescriptionImpl));
                                String str3 = "getValue(...)";
                                String str4 = "getAttributes(...)";
                                if (c17309l3 == null || (c8958n = (C8958n) c17309l3.f55137Z) == null || (str = c8958n.f27384b) == null || !AbstractC4764c.m5435b(str)) {
                                    enumC19250a2 = enumC19250a3;
                                    c17296c2 = c17296c3;
                                    it2 = it;
                                } else {
                                    Vector attributes = mediaDescriptionImpl.getAttributes(z11);
                                    AbstractC16544l.m18093f(attributes, "getAttributes(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : attributes) {
                                        if (obj2 instanceof AttributeField) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : arrayList) {
                                        if (AbstractC16544l.m18089b(((AttributeField) obj3).getAttribute().getName(), "extmap")) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        AttributeField attributeField = (AttributeField) it3.next();
                                        String value2 = attributeField.getValue();
                                        AbstractC16544l.m18093f(value2, "getValue(...)");
                                        C21317k c21317kM21663c = AbstractC8952h.f27373c.m21663c(value2);
                                        C8955k c8955k = c21317kM21663c == null ? null : new C8955k(Long.parseLong((String) ((C17662G) c21317kM21663c.m21657a()).get(1)), AbstractC8952h.m9570b((String) ((C17662G) c21317kM21663c.m21657a()).get(2)), AbstractC8952h.m9570b((String) ((C17662G) c21317kM21663c.m21657a()).get(3)), (String) ((C17662G) c21317kM21663c.m21657a()).get(4), AbstractC8952h.m9570b((String) ((C17662G) c21317kM21663c.m21657a()).get(5)));
                                        if (c8955k == null) {
                                            C8395g c8395g2 = AbstractC8396h.Companion;
                                            EnumC8397i enumC8397i2 = EnumC8397i.f26119p0;
                                            AbstractC8396h.Companion.getClass();
                                            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                attributeField.encode();
                                                AbstractC22225a.f70470a.getClass();
                                                C16831c.m18571j(new Object[0]);
                                            }
                                            c17309l2 = null;
                                        } else {
                                            c17309l2 = new C17309l(attributeField, c8955k);
                                        }
                                        if (c17309l2 != null) {
                                            arrayList3.add(c17309l2);
                                        }
                                        it3 = it3;
                                        it = it;
                                        c17296c3 = c17296c3;
                                        enumC19250a3 = enumC19250a3;
                                    }
                                    enumC19250a2 = enumC19250a3;
                                    c17296c2 = c17296c3;
                                    it2 = it;
                                    long j10 = 0;
                                    if (arrayList3.isEmpty()) {
                                        z10 = false;
                                        break;
                                    }
                                    Iterator it4 = arrayList3.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z10 = false;
                                            break;
                                        }
                                        C8955k c8955k2 = (C8955k) ((C17309l) it4.next()).f55137Z;
                                        if (AbstractC16544l.m18089b(c8955k2.f27378d, "https://aomediacodec.github.io/av1-rtp-spec/#dependency-descriptor-rtp-header-extension")) {
                                            z6 = true;
                                        } else {
                                            long j11 = c8955k2.f27375a;
                                            if (j11 > j10) {
                                                j10 = j11;
                                            }
                                            z6 = false;
                                        }
                                        if (z6) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (!z10) {
                                        AttributeField attributeField2 = new AttributeField();
                                        attributeField2.setName("extmap");
                                        String str5 = (j10 + 1) + " https://aomediacodec.github.io/av1-rtp-spec/#dependency-descriptor-rtp-header-extension";
                                        AbstractC16544l.m18093f(str5, "toString(...)");
                                        attributeField2.setValue(str5);
                                        mediaDescriptionImpl.addAttribute(attributeField2);
                                    }
                                }
                                LinkedHashMap trackBitrates = c4808y.f15684g;
                                AbstractC16544l.m18094g(trackBitrates, "trackBitrates");
                                C21319m c21319m = AbstractC8952h.f27371a;
                                String attribute = mediaDescriptionImpl.getAttribute("msid");
                                C8957m c8957m = attribute == null ? null : new C8957m(attribute);
                                if (c8957m != null) {
                                    String str6 = c8957m.f27382a;
                                    Iterator it5 = trackBitrates.entrySet().iterator();
                                    while (it5.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it5.next();
                                        C4761a1 c4761a1 = (C4761a1) entry.getKey();
                                        C4758Z0 c4758z0 = (C4758Z0) entry.getValue();
                                        if ((c4761a1 instanceof C4761a1) && AbstractC21322p.m21667A(str6, c4761a1.f15537a, false)) {
                                            Iterator it6 = AbstractC8952h.m9569a(mediaDescriptionImpl).iterator();
                                            do {
                                                if (!it6.hasNext()) {
                                                    next4 = null;
                                                    break;
                                                }
                                                next4 = it6.next();
                                            } while (!AbstractC21329w.m21726m(((C8958n) ((C17309l) next4).f55137Z).f27384b, c4758z0.f15522a));
                                            C17309l c17309l4 = (C17309l) next4;
                                            if (c17309l4 != null) {
                                                long j12 = ((C8958n) c17309l4.f55137Z).f27383a;
                                                Vector attributes2 = mediaDescriptionImpl.getAttributes(true);
                                                AbstractC16544l.m18093f(attributes2, str4);
                                                ArrayList arrayList4 = new ArrayList();
                                                for (Object obj4 : attributes2) {
                                                    if (obj4 instanceof AttributeField) {
                                                        arrayList4.add(obj4);
                                                    }
                                                }
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj5 : arrayList4) {
                                                    Iterator it7 = it5;
                                                    if (AbstractC16544l.m18089b(((AttributeField) obj5).getAttribute().getName(), "fmtp")) {
                                                        arrayList5.add(obj5);
                                                    }
                                                    it5 = it7;
                                                }
                                                Iterator it8 = it5;
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = arrayList5.iterator();
                                                while (it9.hasNext()) {
                                                    AttributeField attributeField3 = (AttributeField) it9.next();
                                                    String value3 = attributeField3.getValue();
                                                    AbstractC16544l.m18093f(value3, str3);
                                                    String str7 = str6;
                                                    C21317k c21317kM21663c2 = AbstractC8952h.f27372b.m21663c(value3);
                                                    C8956l c8956l = c21317kM21663c2 == null ? null : new C8956l(Long.parseLong((String) ((C17662G) c21317kM21663c2.m21657a()).get(1)), (String) ((C17662G) c21317kM21663c2.m21657a()).get(2));
                                                    if (c8956l == null) {
                                                        C8395g c8395g3 = AbstractC8396h.Companion;
                                                        EnumC8397i enumC8397i3 = EnumC8397i.f26119p0;
                                                        AbstractC8396h.Companion.getClass();
                                                        if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                            attributeField3.encode();
                                                            AbstractC22225a.f70470a.getClass();
                                                            C16831c.m18571j(new Object[0]);
                                                        }
                                                        c17309l = null;
                                                    } else {
                                                        c17309l = new C17309l(attributeField3, c8956l);
                                                    }
                                                    if (c17309l != null) {
                                                        arrayList6.add(c17309l);
                                                    }
                                                    str6 = str7;
                                                    it9 = it9;
                                                    str3 = str3;
                                                    str4 = str4;
                                                }
                                                String str8 = str6;
                                                String str9 = str3;
                                                String str10 = str4;
                                                Iterator it10 = arrayList6.iterator();
                                                boolean z12 = false;
                                                while (it10.hasNext()) {
                                                    C17309l c17309l5 = (C17309l) it10.next();
                                                    AttributeField attributeField4 = (AttributeField) c17309l5.f55136Y;
                                                    C8956l c8956l2 = (C8956l) c17309l5.f55137Z;
                                                    if (c8956l2.f27380a == j12) {
                                                        String str11 = c8956l2.f27381b;
                                                        if (AbstractC21322p.m21667A(str11, "x-google-start-bitrate", false)) {
                                                            string = str11;
                                                        } else {
                                                            StringBuilder sbM9895n = AbstractC9306j0.m9895n(str11, ";x-google-start-bitrate=");
                                                            sbM9895n.append(AbstractC2119a.m3196j(c4758z0.f15523b * 0.7d));
                                                            string = sbM9895n.toString();
                                                        }
                                                        if (!AbstractC21322p.m21667A(str11, "x-google-max-bitrate", false)) {
                                                            StringBuilder sbM9895n2 = AbstractC9306j0.m9895n(string, ";x-google-max-bitrate=");
                                                            sbM9895n2.append(c4758z0.f15523b);
                                                            string = sbM9895n2.toString();
                                                        }
                                                        if (!str11.equals(string)) {
                                                            attributeField4.setValue(c8956l2.f27380a + ' ' + string);
                                                            z12 = true;
                                                            break;
                                                        }
                                                        it10 = it10;
                                                        sessionDescription = sessionDescription;
                                                        z12 = true;
                                                    }
                                                }
                                                if (!z12) {
                                                    String config = "x-google-start-bitrate=" + (c4758z0.f15523b * 0.7d) + ";x-google-max-bitrate=" + c4758z0.f15523b;
                                                    AbstractC16544l.m18094g(config, "config");
                                                    AttributeField attributeField5 = new AttributeField();
                                                    attributeField5.setName("fmtp");
                                                    attributeField5.setValue(j12 + ' ' + config);
                                                    mediaDescriptionImpl.addAttribute(attributeField5);
                                                }
                                                sessionDescription = sessionDescription;
                                                str6 = str8;
                                                str3 = str9;
                                                str4 = str10;
                                                it5 = it8;
                                            }
                                        }
                                    }
                                }
                                sessionDescription = sessionDescription;
                                it = it2;
                                c17296c3 = c17296c2;
                                enumC19250a3 = enumC19250a2;
                                z11 = true;
                            }
                        }
                    }
                    enumC19250a = enumC19250a3;
                    c17296c = c17296c3;
                    SessionDescription sessionDescription2 = sessionDescription;
                    String string2 = sessionDescriptionImpl.toString();
                    c16525b = this.f15572q0;
                    this.f15568Y = c16525b;
                    this.f15569Z = 3;
                    objM5441e = c4808y.m5441e(sessionDescription2, string2, false, this);
                    if (objM5441e == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (ParseException e10) {
                    e10.printStackTrace();
                    throw new C11549i("Could not parse message");
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C16525B c16525b2 = this.f15568Y;
                AbstractC9233X.m9807c(obj);
                c16525b = c16525b2;
                c17296c = c17296c3;
                objM5441e = obj;
            }
            c16525b.f51262Y = objM5441e;
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC16544l.m18094g(mediaConstraints, "<this>");
        List<MediaConstraints.KeyValuePair> mandatory = mediaConstraints.mandatory;
        AbstractC16544l.m18093f(mandatory, "mandatory");
        Iterator<T> it11 = mandatory.iterator();
        do {
            if (!it11.hasNext()) {
                next = null;
                break;
            }
            next = it11.next();
        } while (!AbstractC16544l.m18089b(((MediaConstraints.KeyValuePair) next).getKey(), "IceRestart"));
        MediaConstraints.KeyValuePair keyValuePair = (MediaConstraints.KeyValuePair) next;
        if (keyValuePair == null || (value = keyValuePair.getValue()) == null) {
            List<MediaConstraints.KeyValuePair> optional = mediaConstraints.optional;
            AbstractC16544l.m18093f(optional, "optional");
            Iterator<T> it12 = optional.iterator();
            do {
                if (!it12.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it12.next();
            } while (!AbstractC16544l.m18089b(((MediaConstraints.KeyValuePair) next2).getKey(), "IceRestart"));
            MediaConstraints.KeyValuePair keyValuePair2 = (MediaConstraints.KeyValuePair) next2;
            value = keyValuePair2 != null ? keyValuePair2.getValue() : null;
        }
        boolean zM18089b = AbstractC16544l.m18089b(value, "true");
        if (zM18089b) {
            C8395g c8395g4 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i4 = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i4.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            c4808y.f15682e = true;
        }
        if (c4808y.f15680c.signalingState() == PeerConnection.SignalingState.HAVE_LOCAL_OFFER) {
            PeerConnection peerConnection = c4808y.f15680c;
            SessionDescription remoteDescription = peerConnection.getRemoteDescription();
            if (!zM18089b || remoteDescription == null) {
                c4808y.f15683f = true;
                return c17296c3;
            }
            this.f15569Z = 1;
            C2392v c2392v = new C2392v(12);
            peerConnection.setRemoteDescription(c2392v, remoteDescription);
            if (c2392v.m3554k(this) == enumC19250a3) {
                return enumC19250a3;
            }
        }
        PeerConnection peerConnection2 = c4808y.f15680c;
        this.f15569Z = 2;
        C2392v c2392v2 = new C2392v(12);
        peerConnection2.createOffer(c2392v2, mediaConstraints);
        objM3553j = c2392v2.m3553j(this);
        if (objM3553j == enumC19250a3) {
            return enumC19250a3;
        }
        abstractC8394f = (AbstractC8394f) objM3553j;
        if (abstractC8394f instanceof C8392d) {
            if (abstractC8394f instanceof C8393e) {
                throw new C0644w();
            }
            C8395g c8395g5 = AbstractC8396h.Companion;
            enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            return c17296c3;
        }
        sessionDescription = (SessionDescription) ((C8392d) abstractC8394f).f26113a;
        if (c4808y.f15685h.get()) {
            return c17296c3;
        }
        String str12 = sessionDescription.description;
        c4808y.f15679b.getClass();
        SessionDescriptionImpl sessionDescriptionImpl2 = new SDPAnnounceParser(str12).parse();
        it = sessionDescriptionImpl2.getMediaDescriptions(true).iterator();
        while (it.hasNext()) {
            next3 = it.next();
            if (!(next3 instanceof MediaDescriptionImpl)) {
                mediaDescriptionImpl = (MediaDescriptionImpl) next3;
                if (AbstractC16544l.m18089b(mediaDescriptionImpl.getMedia().getMediaType(), MediaStreamTrack.AUDIO_TRACK_KIND)) {
                }
            }
        }
        enumC19250a = enumC19250a3;
        c17296c = c17296c3;
        SessionDescription sessionDescription3 = sessionDescription;
        String string3 = sessionDescriptionImpl2.toString();
        c16525b = this.f15572q0;
        this.f15568Y = c16525b;
        this.f15569Z = 3;
        objM5441e = c4808y.m5441e(sessionDescription3, string3, false, this);
        if (objM5441e == enumC19250a) {
            return enumC19250a;
        }
        c16525b.f51262Y = objM5441e;
        return c17296c;
    }
}
