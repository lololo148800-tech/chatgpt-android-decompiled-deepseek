package p168Gd;

import bo.AbstractC11523k;
import bo.InterfaceC11522j;
import bo.InterfaceC11526n;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import p1113xn.AbstractC21322p;
import p138F8.vJO.vRJidSveZHcTw;
import p479Td.C7345c0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p559Wn.C8976h;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Gd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3036d implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9132a;

    /* JADX INFO: renamed from: b */
    public final C10106g f9133b;

    public C3036d(int i10) {
        this.f9132a = i10;
        switch (i10) {
            case 1:
                String strMo4447a = AbstractC16526C.f51263a.mo5693b(EnumC7355h0.class).mo4447a();
                this.f9133b = AbstractC11336c.m12773c(strMo4447a == null ? "Recipient" : strMo4447a, new SerialDescriptor[0], C7345c0.f23258p0);
                break;
            case 2:
                String strMo4447a2 = AbstractC16526C.f51263a.mo5693b(EnumC7359j0.class).mo4447a();
                this.f9133b = AbstractC11336c.m12773c(strMo4447a2 == null ? "Role" : strMo4447a2, new SerialDescriptor[0], C7345c0.f23259q0);
                break;
            default:
                this.f9133b = AbstractC11336c.m12773c("CanmoreMetadata", new SerialDescriptor[0], C3035c.f9131Y);
                break;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f9132a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9133b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.f9132a) {
            case 0:
                C3034b value = (C3034b) obj;
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value, "value");
                if (!(encoder instanceof InterfaceC11526n)) {
                    throw new IllegalArgumentException("This serializer only works with JSON");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC16645d element = AbstractC11523k.m12910c(value.f9128a);
                AbstractC16544l.m18094g(element, "element");
                AbstractC16645d element2 = AbstractC11523k.m12910c(value.f9129b);
                AbstractC16544l.m18094g(element2, "element");
                AbstractC16645d element3 = AbstractC11523k.m12909b(value.f9130c);
                AbstractC16544l.m18094g(element3, "element");
                ((InterfaceC11526n) encoder).mo12921w(new C16644c(linkedHashMap));
                return;
            case 1:
                EnumC7355h0 value2 = (EnumC7355h0) obj;
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value2, "value");
                encoder.mo5566G(value2.name());
                return;
            default:
                EnumC7359j0 value3 = (EnumC7359j0) obj;
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value3, "value");
                encoder.mo5566G(value3.name());
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x018f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:119:0x01af  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16643b abstractC16643bMo12907j;
        EnumC7355h0 enumC7355h0;
        AbstractC16643b abstractC16643b;
        String strMo12922f;
        EnumC7355h0 enumC7355h1;
        AbstractC16643b abstractC16643bMo12907j2;
        EnumC7359j0 enumC7359j0;
        AbstractC16643b abstractC16643b2;
        String strMo12922f2;
        EnumC7359j0 enumC7359j1;
        switch (this.f9132a) {
            case 0:
                AbstractC16544l.m18094g(decoder, "decoder");
                if (!(decoder instanceof InterfaceC11522j)) {
                    throw new IllegalArgumentException("This serializer only works with JSON");
                }
                C16644c c16644cM12917j = AbstractC11523k.m12917j(((InterfaceC11522j) decoder).mo12907j());
                AbstractC16643b abstractC16643b3 = (AbstractC16643b) c16644cM12917j.get("textdoc_id");
                if (abstractC16643b3 == null) {
                    throw new C8976h("No textdoc_id found");
                }
                AbstractC16643b abstractC16643b4 = (AbstractC16643b) c16644cM12917j.get(UiComponentConfig.Title.type);
                if (abstractC16643b4 == null) {
                    abstractC16643b4 = (AbstractC16643b) c16644cM12917j.get(DiagnosticsEntry.NAME_KEY);
                }
                AbstractC16643b abstractC16643b5 = (AbstractC16643b) c16644cM12917j.get("version");
                if (abstractC16643b5 == null) {
                    abstractC16643b5 = (AbstractC16643b) c16644cM12917j.get("version_int");
                }
                String value = AbstractC11523k.m12918k(abstractC16643b3).mo12922f();
                AbstractC16544l.m18094g(value, "value");
                return new C3034b(value, abstractC16643b5 != null ? AbstractC11523k.m12915h(AbstractC11523k.m12918k(abstractC16643b5)) : null, abstractC16643b4 != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b4)) : null);
            case 1:
                AbstractC16544l.m18094g(decoder, "decoder");
                Object obj = null;
                InterfaceC11522j interfaceC11522j = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
                if (interfaceC11522j == null || (abstractC16643bMo12907j = interfaceC11522j.mo12907j()) == null) {
                    return EnumC7355h0.Unsupported;
                }
                if (abstractC16643bMo12907j instanceof AbstractC16645d) {
                    AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo12907j;
                    if (abstractC16645d.mo12923j()) {
                        String strMo12922f3 = abstractC16645d.mo12922f();
                        for (Object obj2 : EnumC7355h0.f23318D0) {
                            if (AbstractC16544l.m18089b(((EnumC7355h0) obj2).name(), strMo12922f3)) {
                                obj = obj2;
                                enumC7355h1 = (EnumC7355h0) obj;
                                if (enumC7355h1 == null) {
                                    return EnumC7355h0.Unsupported;
                                }
                                return enumC7355h1;
                            }
                        }
                        enumC7355h1 = (EnumC7355h0) obj;
                        if (enumC7355h1 == null) {
                            return EnumC7355h0.Unsupported;
                        }
                        return enumC7355h1;
                    }
                }
                if (!(abstractC16643bMo12907j instanceof C16644c) || (abstractC16643b = (AbstractC16643b) ((C16644c) abstractC16643bMo12907j).get("type")) == null || (strMo12922f = AbstractC11523k.m12918k(abstractC16643b).mo12922f()) == null) {
                    enumC7355h0 = EnumC7355h0.Unsupported;
                } else {
                    String strM21688V = AbstractC21322p.m21688V(strMo12922f, "com.openai.feature.conversations.domain.message.Recipient.");
                    if (strM21688V.length() != strMo12922f.length()) {
                        for (Object obj3 : EnumC7355h0.f23318D0) {
                            if (AbstractC16544l.m18089b(((EnumC7355h0) obj3).name(), strM21688V)) {
                                obj = obj3;
                                enumC7355h0 = (EnumC7355h0) obj;
                                if (enumC7355h0 == null) {
                                    switch (strM21688V.hashCode()) {
                                        case -1342674367:
                                            if (strM21688V.equals(vRJidSveZHcTw.waRhcQrt)) {
                                                enumC7355h0 = EnumC7355h0.f23315A0;
                                            } else {
                                                enumC7355h0 = EnumC7355h0.Unsupported;
                                            }
                                            break;
                                        case -907471947:
                                            if (strM21688V.equals("Canmore.CommentTextdoc")) {
                                                enumC7355h0 = EnumC7355h0.f23332z0;
                                            } else {
                                                enumC7355h0 = EnumC7355h0.Unsupported;
                                            }
                                            break;
                                        case -122101498:
                                            if (strM21688V.equals("Canmore.CreateTextdoc")) {
                                                enumC7355h0 = EnumC7355h0.f23330x0;
                                            } else {
                                                enumC7355h0 = EnumC7355h0.Unsupported;
                                            }
                                            break;
                                        case 430397593:
                                            if (strM21688V.equals("Canmore.UpdateTextdoc")) {
                                                enumC7355h0 = EnumC7355h0.f23331y0;
                                            } else {
                                                enumC7355h0 = EnumC7355h0.Unsupported;
                                            }
                                            break;
                                        default:
                                            enumC7355h0 = EnumC7355h0.Unsupported;
                                            break;
                                    }
                                }
                            }
                        }
                        enumC7355h0 = (EnumC7355h0) obj;
                        if (enumC7355h0 == null) {
                            switch (strM21688V.hashCode()) {
                                case -1342674367:
                                    if (strM21688V.equals(vRJidSveZHcTw.waRhcQrt)) {
                                        enumC7355h0 = EnumC7355h0.Unsupported;
                                    } else {
                                        enumC7355h0 = EnumC7355h0.f23315A0;
                                    }
                                    break;
                                case -907471947:
                                    if (strM21688V.equals("Canmore.CommentTextdoc")) {
                                        enumC7355h0 = EnumC7355h0.Unsupported;
                                    } else {
                                        enumC7355h0 = EnumC7355h0.f23332z0;
                                    }
                                    break;
                                case -122101498:
                                    if (strM21688V.equals("Canmore.CreateTextdoc")) {
                                        enumC7355h0 = EnumC7355h0.Unsupported;
                                    } else {
                                        enumC7355h0 = EnumC7355h0.f23330x0;
                                    }
                                    break;
                                case 430397593:
                                    if (strM21688V.equals("Canmore.UpdateTextdoc")) {
                                        enumC7355h0 = EnumC7355h0.Unsupported;
                                    } else {
                                        enumC7355h0 = EnumC7355h0.f23331y0;
                                    }
                                    break;
                                default:
                                    enumC7355h0 = EnumC7355h0.Unsupported;
                                    break;
                            }
                        }
                    } else {
                        enumC7355h0 = EnumC7355h0.Unsupported;
                    }
                }
                return enumC7355h0;
            default:
                AbstractC16544l.m18094g(decoder, "decoder");
                Object obj4 = null;
                InterfaceC11522j interfaceC11522j2 = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
                if (interfaceC11522j2 == null || (abstractC16643bMo12907j2 = interfaceC11522j2.mo12907j()) == null) {
                    return EnumC7359j0.f23338C0;
                }
                if (abstractC16643bMo12907j2 instanceof AbstractC16645d) {
                    AbstractC16645d abstractC16645d2 = (AbstractC16645d) abstractC16643bMo12907j2;
                    if (abstractC16645d2.mo12923j()) {
                        String strMo12922f4 = abstractC16645d2.mo12922f();
                        for (Object obj5 : EnumC7359j0.f23341F0) {
                            if (AbstractC16544l.m18089b(((EnumC7359j0) obj5).name(), strMo12922f4)) {
                                obj4 = obj5;
                                enumC7359j1 = (EnumC7359j0) obj4;
                                if (enumC7359j1 == null) {
                                    return EnumC7359j0.f23338C0;
                                }
                                return enumC7359j1;
                            }
                        }
                        enumC7359j1 = (EnumC7359j0) obj4;
                        if (enumC7359j1 == null) {
                            return EnumC7359j0.f23338C0;
                        }
                        return enumC7359j1;
                    }
                }
                if (!(abstractC16643bMo12907j2 instanceof C16644c) || (abstractC16643b2 = (AbstractC16643b) ((C16644c) abstractC16643bMo12907j2).get("type")) == null || (strMo12922f2 = AbstractC11523k.m12918k(abstractC16643b2).mo12922f()) == null) {
                    enumC7359j0 = EnumC7359j0.f23338C0;
                } else {
                    String strM21688V2 = AbstractC21322p.m21688V(strMo12922f2, "com.openai.feature.conversations.domain.message.Role.");
                    if (strM21688V2.length() != strMo12922f2.length()) {
                        for (Object obj6 : EnumC7359j0.f23341F0) {
                            if (AbstractC16544l.m18089b(((EnumC7359j0) obj6).name(), strM21688V2)) {
                                obj4 = obj6;
                                enumC7359j0 = (EnumC7359j0) obj4;
                                if (enumC7359j0 == null) {
                                    switch (strM21688V2) {
                                        case "Canmore.Unknown":
                                            enumC7359j0 = EnumC7359j0.f23355z0;
                                            break;
                                        case "Canmore.CommentTextdoc":
                                            enumC7359j0 = EnumC7359j0.f23354y0;
                                            break;
                                        case "Canmore.CreateTextdoc":
                                            enumC7359j0 = EnumC7359j0.f23352w0;
                                            break;
                                        case "Canmore.UpdateTextdoc":
                                            enumC7359j0 = EnumC7359j0.f23353x0;
                                            break;
                                        default:
                                            enumC7359j0 = EnumC7359j0.f23338C0;
                                            break;
                                    }
                                }
                            }
                        }
                        enumC7359j0 = (EnumC7359j0) obj4;
                        if (enumC7359j0 == null) {
                            switch (strM21688V2) {
                                case -1342674367:
                                    if (!strM21688V2.equals("Canmore.Unknown")) {
                                        enumC7359j0 = EnumC7359j0.f23338C0;
                                    } else {
                                        enumC7359j0 = EnumC7359j0.f23355z0;
                                    }
                                    break;
                                case -907471947:
                                    if (!strM21688V2.equals("Canmore.CommentTextdoc")) {
                                        enumC7359j0 = EnumC7359j0.f23338C0;
                                    } else {
                                        enumC7359j0 = EnumC7359j0.f23354y0;
                                    }
                                    break;
                                case -122101498:
                                    if (!strM21688V2.equals("Canmore.CreateTextdoc")) {
                                        enumC7359j0 = EnumC7359j0.f23338C0;
                                    } else {
                                        enumC7359j0 = EnumC7359j0.f23352w0;
                                    }
                                    break;
                                case 430397593:
                                    if (!strM21688V2.equals("Canmore.UpdateTextdoc")) {
                                        enumC7359j0 = EnumC7359j0.f23338C0;
                                    } else {
                                        enumC7359j0 = EnumC7359j0.f23353x0;
                                    }
                                    break;
                                default:
                                    enumC7359j0 = EnumC7359j0.f23338C0;
                                    break;
                            }
                        }
                    } else {
                        enumC7359j0 = EnumC7359j0.f23338C0;
                    }
                }
                return enumC7359j0;
        }
    }
}
