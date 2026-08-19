package p523V9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0781s;
import p1006s6.EnumC19454d;
import p1006s6.InterfaceC19455e;
import p204I1.C3573D;
import p204I1.C3587c;
import p204I1.C3590f;
import p499U9.AbstractC7589s;
import p571X9.AbstractC9160K3;
import p574Xc.AbstractC9431a;
import p784hb.C14438g;
import p909nm.C17689w;
import p909nm.C17690x;
import p917o6.AbstractC17850c;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.C17872y;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17873z;

/* JADX INFO: renamed from: V9.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8034Z {
    /* JADX INFO: renamed from: a */
    public static float m8386a(int i10, String[] strArr) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8387b(String str, String str2) {
        return str.startsWith(str2.concat(Separators.LPAREN)) && str.endsWith(Separators.RPAREN);
    }

    /* JADX INFO: renamed from: d */
    public static int m8389d(Context context, int i10, int i11) {
        TypedValue typedValueM8263d = AbstractC7972Q3.m8263d(context, i10);
        return (typedValueM8263d == null || typedValueM8263d.type != 16) ? i11 : typedValueM8263d.data;
    }

    /* JADX INFO: renamed from: e */
    public static TimeInterpolator m8390e(Context context, int i10, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m8387b(strValueOf, "cubic-bezier") && !m8387b(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m8387b(strValueOf, "cubic-bezier")) {
            if (m8387b(strValueOf, "path")) {
                return new PathInterpolator(AbstractC7589s.m7929d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(Separators.COMMA);
        if (strArrSplit.length == 4) {
            return new PathInterpolator(m8386a(0, strArrSplit), m8386a(1, strArrSplit), m8386a(2, strArrSplit), m8386a(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: f */
    public static final C3590f m8391f(String str, boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        if (!z6) {
            return new C3590f(6, str, null);
        }
        C3587c c3587c = new C3587c();
        c3587c.m4291c(str);
        int iM4296h = c3587c.m4296h(new C3573D(0L, 0L, null, null, null, AbstractC9431a.f28414b, null, 0L, null, null, null, 0L, null, null, 65503));
        try {
            c3587c.m4291c("●");
            return c3587c.m4297i();
        } finally {
            c3587c.m4293e(iM4296h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static C17853f m8388c(Set set, UUID uuid, C17867t c17867t, InterfaceC17842J interfaceC17842J, InterfaceC19455e interfaceC19455e) {
        UUID uuid2;
        List list;
        C17867t c17867t2 = c17867t;
        AbstractC16544l.m18094g(c17867t2, YladLSetV.TgEp);
        interfaceC19455e.mo20579o();
        Map map = null;
        InterfaceC17841I interfaceC17841I = null;
        List list2 = null;
        while (interfaceC19455e.hasNext()) {
            String strMo20570a0 = interfaceC19455e.mo20570a0();
            int iHashCode = strMo20570a0.hashCode();
            if (iHashCode != -1809421292) {
                if (iHashCode == -1294635157) {
                    if (strMo20570a0.equals("errors")) {
                        if (interfaceC19455e.peek() == EnumC19454d.f61743v0) {
                            interfaceC19455e.mo20572e0();
                            list = C17689w.f56480Y;
                        } else {
                            interfaceC19455e.mo20581q();
                            ArrayList arrayList = new ArrayList();
                            while (interfaceC19455e.hasNext()) {
                                interfaceC19455e.mo20579o();
                                String str = "";
                                ArrayList arrayList2 = null;
                                ArrayList arrayList3 = null;
                                Map map2 = null;
                                LinkedHashMap linkedHashMap = null;
                                while (interfaceC19455e.hasNext()) {
                                    String strMo20570a1 = interfaceC19455e.mo20570a0();
                                    switch (strMo20570a1.hashCode()) {
                                        case -1809421292:
                                            if (strMo20570a1.equals("extensions")) {
                                                Object objM8091c = AbstractC7841A0.m8091c(interfaceC19455e);
                                                map2 = objM8091c instanceof Map ? (Map) objM8091c : null;
                                            } else {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                }
                                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                                linkedHashMap2.put(strMo20570a1, AbstractC7841A0.m8091c(interfaceC19455e));
                                                linkedHashMap = linkedHashMap2;
                                            }
                                            break;
                                        case -1197189282:
                                            if (!strMo20570a1.equals("locations")) {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                }
                                                LinkedHashMap linkedHashMap3 = linkedHashMap;
                                                linkedHashMap3.put(strMo20570a1, AbstractC7841A0.m8091c(interfaceC19455e));
                                                linkedHashMap = linkedHashMap3;
                                            } else if (interfaceC19455e.peek() == EnumC19454d.f61743v0) {
                                                interfaceC19455e.mo20572e0();
                                                arrayList2 = null;
                                            } else {
                                                ArrayList arrayList4 = new ArrayList();
                                                interfaceC19455e.mo20581q();
                                                while (interfaceC19455e.hasNext()) {
                                                    interfaceC19455e.mo20579o();
                                                    int iMo20573g0 = -1;
                                                    int iMo20573g1 = -1;
                                                    while (interfaceC19455e.hasNext()) {
                                                        String strMo20570a2 = interfaceC19455e.mo20570a0();
                                                        if (AbstractC16544l.m18089b(strMo20570a2, "line")) {
                                                            iMo20573g0 = interfaceC19455e.mo20573g0();
                                                        } else if (AbstractC16544l.m18089b(strMo20570a2, "column")) {
                                                            iMo20573g1 = interfaceC19455e.mo20573g0();
                                                        } else {
                                                            interfaceC19455e.mo20559D();
                                                        }
                                                    }
                                                    interfaceC19455e.mo20574j();
                                                    arrayList4.add(new C0781s(iMo20573g0, iMo20573g1, 7));
                                                }
                                                interfaceC19455e.mo20580p();
                                                arrayList2 = arrayList4;
                                            }
                                            break;
                                        case 3433509:
                                            if (!strMo20570a1.equals("path")) {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                }
                                                LinkedHashMap linkedHashMap4 = linkedHashMap;
                                                linkedHashMap4.put(strMo20570a1, AbstractC7841A0.m8091c(interfaceC19455e));
                                                linkedHashMap = linkedHashMap4;
                                            } else if (interfaceC19455e.peek() == EnumC19454d.f61743v0) {
                                                interfaceC19455e.mo20572e0();
                                                arrayList3 = null;
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                interfaceC19455e.mo20581q();
                                                while (interfaceC19455e.hasNext()) {
                                                    int iOrdinal = interfaceC19455e.peek().ordinal();
                                                    if (iOrdinal == 6 || iOrdinal == 7) {
                                                        arrayList5.add(Integer.valueOf(interfaceC19455e.mo20573g0()));
                                                    } else {
                                                        String strMo20582x = interfaceC19455e.mo20582x();
                                                        AbstractC16544l.m18091d(strMo20582x);
                                                        arrayList5.add(strMo20582x);
                                                    }
                                                }
                                                interfaceC19455e.mo20580p();
                                                arrayList3 = arrayList5;
                                            }
                                            break;
                                        case 954925063:
                                            if (strMo20570a1.equals("message")) {
                                                String strMo20582x2 = interfaceC19455e.mo20582x();
                                                str = strMo20582x2 == null ? "" : strMo20582x2;
                                            } else {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                }
                                                LinkedHashMap linkedHashMap5 = linkedHashMap;
                                                linkedHashMap5.put(strMo20570a1, AbstractC7841A0.m8091c(interfaceC19455e));
                                                linkedHashMap = linkedHashMap5;
                                            }
                                            break;
                                        default:
                                            if (linkedHashMap == null) {
                                                linkedHashMap = new LinkedHashMap();
                                            }
                                            LinkedHashMap linkedHashMap6 = linkedHashMap;
                                            linkedHashMap6.put(strMo20570a1, AbstractC7841A0.m8091c(interfaceC19455e));
                                            linkedHashMap = linkedHashMap6;
                                            break;
                                    }
                                }
                                interfaceC19455e.mo20574j();
                                arrayList.add(new C17872y(str, arrayList2, arrayList3, map2, linkedHashMap));
                            }
                            interfaceC19455e.mo20580p();
                            list = arrayList;
                        }
                        list2 = list;
                    }
                    c17867t2 = c17867t;
                } else if (iHashCode == 3076010 && strMo20570a0.equals("data")) {
                    C14438g c14438gM9710c = AbstractC9160K3.m9710c(interfaceC17842J, c17867t2);
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) c14438gM9710c.f45414Y).entrySet()) {
                        if (AbstractC16544l.m18089b(entry.getValue(), Boolean.FALSE)) {
                            linkedHashMap7.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap7.keySet();
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    linkedHashMap8.putAll(c17867t2.f56964d);
                    interfaceC17841I = (InterfaceC17841I) ((InterfaceC17873z) AbstractC17850c.m19593a(interfaceC17842J.mo19589b()).mo373j(interfaceC19455e, new C17867t(linkedHashMap8, setKeySet, set, list2)));
                }
                interfaceC19455e.mo20559D();
                list2 = list2;
                c17867t2 = c17867t;
            } else {
                if (strMo20570a0.equals("extensions")) {
                    Object objM8091c2 = AbstractC7841A0.m8091c(interfaceC19455e);
                    if (objM8091c2 instanceof Map) {
                        map = (Map) objM8091c2;
                        list2 = list2;
                    } else {
                        map = null;
                        list2 = list2;
                    }
                } else {
                    interfaceC19455e.mo20559D();
                    list2 = list2;
                }
                c17867t2 = c17867t;
            }
        }
        interfaceC19455e.mo20574j();
        if (uuid == null) {
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
            uuid2 = uuidRandomUUID;
        } else {
            uuid2 = uuid;
        }
        return new C17853f(uuid2, interfaceC17842J, interfaceC17841I, list2, null, map == null ? C17690x.f56481Y : map, C17870w.f56967a, false);
    }
}
