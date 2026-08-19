package p486Tl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$VideoLayer;
import livekit.org.webrtc.RtpParameters;
import p102Dm.AbstractC2119a;
import p1113xn.C21317k;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p387Pl.EnumC6475W;
import p387Pl.EnumC6476X;
import p435Rl.C6930n;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9393x3;
import p793ho.C14747g3;
import p793ho.EnumC14761i3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17662G;

/* JADX INFO: renamed from: Tl.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7506e {

    /* JADX INFO: renamed from: a */
    public static final String[] f23823a = {"q", "h", "f"};

    /* JADX INFO: renamed from: b */
    public static final List f23824b = AbstractC17681o.m19382k(EnumC6475W.H90, EnumC6475W.H180, EnumC6475W.H216, EnumC6475W.H360, EnumC6475W.H540, EnumC6475W.H720, EnumC6475W.H1080, EnumC6475W.H1440, EnumC6475W.H2160);

    /* JADX INFO: renamed from: c */
    public static final List f23825c = AbstractC17681o.m19382k(EnumC6476X.H120, EnumC6476X.H180, EnumC6476X.H240, EnumC6476X.H360, EnumC6476X.H480, EnumC6476X.H540, EnumC6476X.H720, EnumC6476X.H1080, EnumC6476X.H1440);

    /* JADX INFO: renamed from: a */
    public static List m7811a(int i10, int i11) {
        float fMax = Math.max(i10, i11) / Math.min(i10, i11);
        return Math.abs(fMax - 1.7777778f) < Math.abs(fMax - 1.3333334f) ? f23824b : f23825c;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01bf  */
    /* JADX INFO: renamed from: b */
    public static List m7812b(int i10, int i11, List encodings, boolean z6) {
        EnumC14761i3 enumC14761i3;
        AbstractC16544l.m18094g(encodings, "encodings");
        boolean zIsEmpty = encodings.isEmpty();
        EnumC14761i3 enumC14761i4 = EnumC14761i3.HIGH;
        if (zIsEmpty) {
            C14747g3 c14747g3NewBuilder = LivekitModels$VideoLayer.newBuilder();
            c14747g3NewBuilder.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder.f36981Z).setWidth(i10);
            c14747g3NewBuilder.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder.f36981Z).setHeight(i11);
            c14747g3NewBuilder.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder.f36981Z).setQuality(enumC14761i4);
            c14747g3NewBuilder.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder.f36981Z).setBitrate(0);
            c14747g3NewBuilder.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder.f36981Z).setSsrc(0);
            return AbstractC9393x3.m9974d(c14747g3NewBuilder.m13861b());
        }
        if (z6) {
            String str = ((RtpParameters.Encoding) AbstractC17680n.m19341Q(encodings)).scalabilityMode;
            AbstractC16544l.m18091d(str);
            C6930n.Companion.getClass();
            C21317k c21317kM21663c = C6930n.f22201d.m21663c(str);
            if (c21317kM21663c == null) {
                throw new IllegalArgumentException("can't parse scalability mode: ".concat(str));
            }
            String str2 = (String) ((C17662G) c21317kM21663c.m21657a()).get(1);
            String str3 = (String) ((C17662G) c21317kM21663c.m21657a()).get(2);
            String str4 = (String) ((C17662G) c21317kM21663c.m21657a()).get(3);
            int i12 = Integer.parseInt(str2);
            new C6930n(i12, Integer.parseInt(str3), str4);
            Integer num = ((RtpParameters.Encoding) AbstractC17680n.m19341Q(encodings)).maxBitrateBps;
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue();
            C3508g c3508gM8929t = AbstractC8301I.m8929t(0, i12);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
            C3507f it = c3508gM8929t.iterator();
            while (it.f10596o0) {
                int iMo4199a = it.mo4199a();
                C14747g3 c14747g3NewBuilder2 = LivekitModels$VideoLayer.newBuilder();
                double d10 = 2.0f;
                double d11 = iMo4199a;
                int iM3195i = AbstractC2119a.m3195i((float) Math.ceil(i10 / ((float) Math.pow(d10, d11))));
                c14747g3NewBuilder2.m13863d();
                ((LivekitModels$VideoLayer) c14747g3NewBuilder2.f36981Z).setWidth(iM3195i);
                int iM3195i2 = AbstractC2119a.m3195i((float) Math.ceil(i11 / ((float) Math.pow(d10, d11))));
                c14747g3NewBuilder2.m13863d();
                ((LivekitModels$VideoLayer) c14747g3NewBuilder2.f36981Z).setHeight(iM3195i2);
                EnumC14761i3 enumC14761i3M16050a = EnumC14761i3.m16050a(enumC14761i4.getNumber() - iMo4199a);
                c14747g3NewBuilder2.m13863d();
                ((LivekitModels$VideoLayer) c14747g3NewBuilder2.f36981Z).setQuality(enumC14761i3M16050a);
                int iM3195i3 = AbstractC2119a.m3195i((float) Math.ceil(iIntValue / ((float) Math.pow(3.0f, d11))));
                c14747g3NewBuilder2.m13863d();
                ((LivekitModels$VideoLayer) c14747g3NewBuilder2.f36981Z).setBitrate(iM3195i3);
                c14747g3NewBuilder2.m13863d();
                ((LivekitModels$VideoLayer) c14747g3NewBuilder2.f36981Z).setSsrc(0);
                arrayList.add((LivekitModels$VideoLayer) c14747g3NewBuilder2.m13861b());
            }
            return arrayList;
        }
        List<RtpParameters.Encoding> list = encodings;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (RtpParameters.Encoding encoding : list) {
            Double dValueOf = encoding.scaleResolutionDownBy;
            if (dValueOf == null) {
                dValueOf = Double.valueOf(1.0d);
            }
            double dDoubleValue = dValueOf.doubleValue();
            String str5 = encoding.rid;
            if (str5 == null) {
                str5 = "";
            }
            int iHashCode = str5.hashCode();
            EnumC14761i3 enumC14761i5 = EnumC14761i3.UNRECOGNIZED;
            if (iHashCode != 102) {
                if (iHashCode != 104) {
                    if (iHashCode == 113 && str5.equals("q")) {
                        enumC14761i3 = EnumC14761i3.LOW;
                    } else {
                        enumC14761i3 = enumC14761i5;
                    }
                } else if (str5.equals("h")) {
                    enumC14761i3 = EnumC14761i3.MEDIUM;
                } else {
                    enumC14761i3 = enumC14761i5;
                }
            } else if (str5.equals("f")) {
                enumC14761i3 = enumC14761i4;
            } else {
                enumC14761i3 = enumC14761i5;
            }
            if (enumC14761i3 == enumC14761i5 && encodings.size() == 1) {
                enumC14761i3 = enumC14761i4;
            }
            C14747g3 c14747g3NewBuilder3 = LivekitModels$VideoLayer.newBuilder();
            c14747g3NewBuilder3.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder3.f36981Z).setWidth((int) (((double) i10) / dDoubleValue));
            c14747g3NewBuilder3.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder3.f36981Z).setHeight((int) (((double) i11) / dDoubleValue));
            c14747g3NewBuilder3.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder3.f36981Z).setQuality(enumC14761i3);
            Integer num2 = encoding.maxBitrateBps;
            int iIntValue2 = num2 == null ? 0 : num2.intValue();
            c14747g3NewBuilder3.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder3.f36981Z).setBitrate(iIntValue2);
            c14747g3NewBuilder3.m13863d();
            ((LivekitModels$VideoLayer) c14747g3NewBuilder3.f36981Z).setSsrc(0);
            arrayList2.add((LivekitModels$VideoLayer) c14747g3NewBuilder3.m13861b());
        }
        return arrayList2;
    }
}
