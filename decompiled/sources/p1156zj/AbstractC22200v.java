package p1156zj;

import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p149Fj.EnumC2883q;
import p525Vb.C8258a;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p949pj.AbstractC18473k;
import p949pj.C18463f;
import p949pj.C18465g;
import p949pj.C18467h;
import p949pj.C18469i;
import p949pj.C18471j;
import p949pj.C18475l;
import p994rk.C19094J1;

/* JADX INFO: renamed from: zj.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22200v {
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static final C22124T0 m22399a(CapturePageConfig capturePageConfig, EnumC22128V0 enumC22128V0, EnumC2883q enumC2883q, String countryCode, long j10) {
        int iOrdinal;
        C22122S0 c22122s0;
        C22122S0 c22122s1;
        C22126U0 c22126u0;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        Object next;
        C22122S0 c22122s2;
        ?? arrayList;
        AbstractC18473k c18467h;
        boolean z6;
        boolean z10;
        AbstractC16544l.m18094g(countryCode, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null) {
            iOrdinal = enumC22128V0.ordinal();
            if (iOrdinal != 0) {
                c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18467h(false))));
            } else if (iOrdinal != 1) {
                c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18463f(false))));
            } else if (iOrdinal != 2) {
                c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18465g(false))));
            } else if (iOrdinal != 3) {
                c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18463f(false))));
            } else {
                if (iOrdinal == 4) {
                    throw new C0644w();
                }
                c22122s0 = new C22122S0();
            }
            c22122s1 = c22122s0;
        } else {
            List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig.getRuleSets();
            if (ruleSets == null) {
                c22122s2 = null;
            } else if (ruleSets.isEmpty()) {
                c22122s2 = new C22122S0();
            } else {
                Iterator it = ruleSets.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List<CapturePageConfig.Rule> rules = ((CapturePageConfig.RuleSet) next).getRules();
                    if (rules != null) {
                        z6 = true;
                        z10 = false;
                        for (CapturePageConfig.Rule rule : rules) {
                            if (AbstractC16544l.m18089b(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                                z6 = false;
                            } else if (rule.getType() != null) {
                                z10 = true;
                            }
                        }
                    } else {
                        z6 = true;
                        z10 = false;
                    }
                    if (z6 && z10) {
                        break;
                    }
                }
                CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
                if (ruleSet == null) {
                    c22122s2 = new C22122S0();
                } else {
                    List<CapturePageConfig.Rule> rules2 = ruleSet.getRules();
                    if (rules2 != null) {
                        arrayList = new ArrayList();
                        for (CapturePageConfig.Rule rule2 : rules2) {
                            CapturePageConfig.RuleType type = rule2.getType();
                            int i10 = type == null ? -1 : AbstractC22197u.f70357a[type.ordinal()];
                            if (i10 == -1) {
                                c18467h = null;
                            } else if (i10 == 1) {
                                c18467h = new C18467h(AbstractC16544l.m18089b(rule2.isRequired(), Boolean.TRUE));
                            } else if (i10 == 2) {
                                c18467h = new C18465g(AbstractC16544l.m18089b(rule2.isRequired(), Boolean.TRUE));
                            } else if (i10 == 3) {
                                c18467h = new C18463f(AbstractC16544l.m18089b(rule2.isRequired(), Boolean.TRUE));
                            } else if (i10 == 4) {
                                c18467h = new C18469i(AbstractC16544l.m18089b(rule2.isRequired(), Boolean.TRUE));
                            } else {
                                if (i10 != 5) {
                                    throw new C0644w();
                                }
                                c18467h = new C18471j(AbstractC16544l.m18089b(rule2.isRequired(), Boolean.TRUE));
                            }
                            if (c18467h != null) {
                                arrayList.add(c18467h);
                            }
                        }
                    } else {
                        arrayList = C17689w.f56480Y;
                    }
                    c22122s2 = new C22122S0(new C18475l(arrayList));
                }
            }
            if (c22122s2 == null) {
                iOrdinal = enumC22128V0.ordinal();
                if (iOrdinal != 0) {
                    c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18467h(false))));
                } else if (iOrdinal != 1) {
                    c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18463f(false))));
                } else if (iOrdinal != 2) {
                    c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18465g(false))));
                } else if (iOrdinal != 3) {
                    c22122s0 = new C22122S0(new C18475l(AbstractC9393x3.m9974d(new C18463f(false))));
                } else {
                    if (iOrdinal == 4) {
                        throw new C0644w();
                    }
                    c22122s0 = new C22122S0();
                }
                c22122s1 = c22122s0;
            } else {
                c22122s1 = c22122s2;
            }
        }
        if (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null) {
            c22126u0 = new C22126U0(true, j10);
        } else {
            Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
            boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
            Long delayMs = manualCaptureConfig.getDelayMs();
            c22126u0 = new C22126U0(zBooleanValue, delayMs != null ? delayMs.longValue() : j10);
        }
        if (c22122s1.f69932Y.f58917Y.isEmpty() && !c22126u0.f69941Y) {
            return null;
        }
        AbstractC22196t1 c22184p1 = C22190r1.f70260Y;
        C22187q1 c22187q1 = C22187q1.f70254Y;
        C22193s1 c22193s1 = C22193s1.f70317Y;
        C22178n1 c22178n1 = C22178n1.f70245Y;
        if (capturePageConfig != null && (overlay = capturePageConfig.getOverlay()) != null) {
            UiComponentConfig.RemoteImage overlay2 = overlay.getOverlay();
            if (overlay2 == null) {
                CapturePageConfig.OverlayLocalIcon overlayFallback = overlay.getOverlayFallback();
                switch (overlayFallback != null ? AbstractC22197u.f70358b[overlayFallback.ordinal()] : -1) {
                    case -1:
                    case 6:
                        c22184p1 = c22193s1;
                        break;
                    case 0:
                    default:
                        throw new C0644w();
                    case 1:
                    case 4:
                        c22184p1 = c22178n1;
                        break;
                    case 2:
                        break;
                    case 3:
                        c22184p1 = c22187q1;
                        break;
                    case 5:
                        c22184p1 = C22181o1.f70247Y;
                        break;
                }
            } else {
                c22184p1 = new C22184p1(new C19094J1(overlay2));
            }
        } else if (enumC22128V0 == EnumC22128V0.BarcodePdf417) {
            c22184p1 = c22178n1;
        } else if (enumC22128V0 == EnumC22128V0.PassportSignature) {
            c22184p1 = c22193s1;
        } else {
            EnumC2883q enumC2883q2 = EnumC2883q.f8668o0;
            if (enumC2883q == enumC2883q2 && enumC22128V0 == EnumC22128V0.Back && countryCode.equals("US")) {
                c22184p1 = c22178n1;
            } else if (enumC2883q != EnumC2883q.f8670q0 && enumC2883q != EnumC2883q.f8672s0) {
                c22184p1 = (enumC2883q == enumC2883q2 || enumC2883q == EnumC2883q.f8669p0 || enumC2883q == EnumC2883q.f8671r0) ? c22187q1 : c22193s1;
            }
        }
        return new C22124T0(enumC22128V0.f69952Y, enumC22128V0, c22184p1, c22122s1, c22126u0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static final C22130W0 m22400b(C12893Id c12893Id, String countryCode, long j10) {
        EnumC22136Z0 enumC22136Z0;
        C22124T0 c22124t0M22399a;
        AbstractC16544l.m18094g(c12893Id, "<this>");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        C8258a c8258a = EnumC2883q.f8666Y;
        String abbr = c12893Id.getClass();
        c8258a.getClass();
        AbstractC16544l.m18094g(abbr, "abbr");
        EnumC2883q enumC2883q = (EnumC2883q) EnumC2883q.f8667Z.get(abbr);
        if (enumC2883q == null) {
            enumC2883q = EnumC2883q.f8673t0;
        }
        if (enumC2883q == EnumC2883q.f8673t0 && !c12893Id.isDynamicGovId()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CapturePageConfig> capturePageConfigs = c12893Id.getCapturePageConfigs();
        if (capturePageConfigs != null) {
            for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                String side = capturePageConfig.getSide();
                if (side != null) {
                    linkedHashMap.put(side, capturePageConfig);
                }
            }
        }
        List<String> requiresSides = c12893Id.getRequiresSides();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(requiresSides, 10));
        for (String sideKey : requiresSides) {
            EnumC22128V0.f69944Z.getClass();
            AbstractC16544l.m18094g(sideKey, "sideKey");
            EnumC22128V0 enumC22128V0 = (EnumC22128V0) ((Map) EnumC22128V0.f69945o0.getValue()).get(sideKey);
            if (enumC22128V0 == null || (c22124t0M22399a = m22399a((CapturePageConfig) linkedHashMap.get(sideKey), enumC22128V0, enumC2883q, countryCode, j10)) == null) {
                return null;
            }
            arrayList.add(c22124t0M22399a);
        }
        String str = c12893Id.getClass();
        if (c12893Id.isDynamicGovId()) {
            C12893Id.IdIcon icon = c12893Id.getIcon();
            C12893Id.IdLocalIcon iconFallback = icon != null ? icon.getIconFallback() : null;
            int i10 = iconFallback == null ? -1 : AbstractC22197u.f70359c[iconFallback.ordinal()];
            if (i10 == -1) {
                enumC22136Z0 = EnumC22136Z0.f69978Z;
            } else if (i10 == 1) {
                enumC22136Z0 = EnumC22136Z0.f69977Y;
            } else if (i10 == 2) {
                enumC22136Z0 = EnumC22136Z0.f69978Z;
            } else if (i10 == 3) {
                enumC22136Z0 = EnumC22136Z0.f69979o0;
            } else {
                if (i10 != 4) {
                    throw new C0644w();
                }
                enumC22136Z0 = EnumC22136Z0.f69980p0;
            }
        } else {
            switch (enumC2883q.ordinal()) {
                case 0:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 1:
                    enumC22136Z0 = EnumC22136Z0.f69979o0;
                    break;
                case 2:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 3:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 4:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 5:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 6:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 7:
                    enumC22136Z0 = EnumC22136Z0.f69977Y;
                    break;
                case 8:
                    enumC22136Z0 = EnumC22136Z0.f69980p0;
                    break;
                case 9:
                    enumC22136Z0 = EnumC22136Z0.f69980p0;
                    break;
                case 10:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 11:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 12:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 13:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 14:
                    enumC22136Z0 = EnumC22136Z0.f69977Y;
                    break;
                case 15:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 16:
                    enumC22136Z0 = EnumC22136Z0.f69977Y;
                    break;
                case 17:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 18:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 19:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 20:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 21:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 22:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 23:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 24:
                    enumC22136Z0 = EnumC22136Z0.f69978Z;
                    break;
                case 25:
                    throw new RuntimeException("IdClass is 'UNKNOWN'.");
                default:
                    throw new C0644w();
            }
        }
        EnumC22136Z0 enumC22136Z1 = enumC22136Z0;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C22139a1(((C22124T0) it.next()).f69936Z));
        }
        return new C22130W0(str, enumC22136Z1, arrayList, arrayList2, enumC2883q);
    }
}
