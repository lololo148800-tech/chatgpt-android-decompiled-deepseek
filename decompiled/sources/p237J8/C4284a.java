package p237J8;

import android.gov.nist.core.Separators;
import hm.InterfaceC14538c;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import jm.C16270a;
import p138F8.vJO.anhfj;
import p164G8.C3014h;
import p309M8.AbstractC5306a;
import p544W9.AbstractC8467E;

/* JADX INFO: renamed from: J8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4284a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13950a;

    /* JADX INFO: renamed from: b */
    public final Object f13951b;

    public C4284a(int i10, Map map) {
        this.f13950a = i10;
        switch (i10) {
            case 1:
                this.f13951b = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    ((HashMap) this.f13951b).put(((String) entry.getKey()).trim().toLowerCase(Locale.US), (String) entry.getValue());
                }
                break;
            case 2:
                this.f13951b = new HashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    ((HashMap) this.f13951b).put(((String) entry2.getKey()).trim().toLowerCase(Locale.US), (String) entry2.getValue());
                }
                break;
            case 3:
                this.f13951b = new HashMap();
                for (Map.Entry entry3 : map.entrySet()) {
                    ((HashMap) this.f13951b).put(((String) entry3.getKey()).trim().toLowerCase(Locale.US), (String) entry3.getValue());
                }
                break;
            case 4:
                this.f13951b = new HashMap();
                for (Map.Entry entry4 : map.entrySet()) {
                    ((HashMap) this.f13951b).put(((String) entry4.getKey()).trim().toLowerCase(Locale.US), (String) entry4.getValue());
                }
                break;
            default:
                this.f13951b = new HashMap();
                for (Map.Entry entry5 : map.entrySet()) {
                    ((HashMap) this.f13951b).put(((String) entry5.getKey()).trim().toLowerCase(Locale.US), (String) entry5.getValue());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m5036b(String str) {
        String[] strArrSplit = str.split(Separators.COMMA);
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.startsWith("dd=")) {
                for (String str3 : str2.substring(3).split(Separators.SEMICOLON)) {
                    String[] strArrSplit2 = str3.split(":");
                    if (strArrSplit2.length == 2) {
                        map.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14538c m5037a(C16270a c16270a) {
        InterfaceC14538c c4291h;
        InterfaceC14538c c4291h2;
        InterfaceC14538c c4291h3;
        Iterator it;
        String str;
        InterfaceC14538c c4291h4;
        switch (this.f13950a) {
            case 0:
                try {
                    Map mapEmptyMap = Collections.emptyMap();
                    BigInteger bigInteger = BigInteger.ZERO;
                    Iterator it2 = c16270a.iterator();
                    Map map = mapEmptyMap;
                    BigInteger bigInteger2 = bigInteger;
                    BigInteger bigIntegerM9099d = bigInteger2;
                    int i10 = Integer.MIN_VALUE;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (!BigInteger.ZERO.equals(bigInteger2)) {
                                C4289f c4289f = new C4289f(bigInteger2, bigIntegerM9099d, i10, null, Collections.emptyMap(), map);
                                c4289f.f13963g.set(true);
                                c4291h = c4289f;
                            } else {
                                if (map.isEmpty()) {
                                    return null;
                                }
                                c4291h = new C4291h(null, map);
                            }
                            return c4291h;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                        String str2 = (String) entry.getValue();
                        if (str2 != null) {
                            if ("b3".equalsIgnoreCase(lowerCase)) {
                                String[] strArrSplit = str2.split(anhfj.XgMUfrWIJLqUU);
                                if (strArrSplit.length >= 2 && strArrSplit.length <= 4) {
                                    int length = strArrSplit[0].length();
                                    if (length > 32) {
                                        bigInteger2 = BigInteger.ZERO;
                                    } else {
                                        C3014h c3014hM9098c = AbstractC8467E.m9098c(16, length > 16 ? strArrSplit[0].substring(length - 16) : strArrSplit[0]);
                                        bigIntegerM9099d = AbstractC8467E.m9099d(16, strArrSplit[1]);
                                        if (strArrSplit.length >= 3) {
                                            i10 = Integer.parseInt(strArrSplit[2]) != 1 ? 0 : 1;
                                        }
                                        bigInteger2 = c3014hM9098c;
                                    }
                                }
                            }
                            HashMap map2 = (HashMap) this.f13951b;
                            if (map2.containsKey(lowerCase)) {
                                if (map.isEmpty()) {
                                    map = new HashMap();
                                }
                                map.put((String) map2.get(lowerCase), AbstractC8467E.m9096a(str2));
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    return null;
                }
                break;
            case 1:
                try {
                    Map mapEmptyMap2 = Collections.emptyMap();
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    Iterator it3 = c16270a.iterator();
                    Map map3 = mapEmptyMap2;
                    BigInteger bigIntegerM9098c = bigInteger3;
                    BigInteger bigIntegerM9099d2 = bigIntegerM9098c;
                    int i11 = Integer.MIN_VALUE;
                    while (true) {
                        if (!it3.hasNext()) {
                            if (!BigInteger.ZERO.equals(bigIntegerM9098c)) {
                                C4289f c4289f2 = new C4289f(bigIntegerM9098c, bigIntegerM9099d2, i11, null, Collections.emptyMap(), map3);
                                c4289f2.f13963g.set(true);
                                c4291h2 = c4289f2;
                            } else {
                                if (map3.isEmpty()) {
                                    return null;
                                }
                                c4291h2 = new C4291h(null, map3);
                            }
                            return c4291h2;
                        }
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        String lowerCase2 = ((String) entry2.getKey()).toLowerCase(Locale.US);
                        String str3 = (String) entry2.getValue();
                        if (str3 != null) {
                            if ("X-B3-TraceId".equalsIgnoreCase(lowerCase2)) {
                                int length2 = str3.length();
                                if (length2 > 32) {
                                    bigIntegerM9098c = BigInteger.ZERO;
                                } else {
                                    bigIntegerM9098c = AbstractC8467E.m9098c(16, length2 > 16 ? str3.substring(length2 - 16) : str3);
                                }
                            } else if ("X-B3-SpanId".equalsIgnoreCase(lowerCase2)) {
                                bigIntegerM9099d2 = AbstractC8467E.m9099d(16, str3);
                            } else if ("X-B3-Sampled".equalsIgnoreCase(lowerCase2)) {
                                i11 = Integer.parseInt(str3) != 1 ? 0 : 1;
                            }
                            HashMap map4 = (HashMap) this.f13951b;
                            if (map4.containsKey(lowerCase2)) {
                                if (map3.isEmpty()) {
                                    map3 = new HashMap();
                                }
                                map3.put((String) map4.get(lowerCase2), AbstractC8467E.m9096a(str3));
                            }
                        }
                    }
                } catch (RuntimeException unused2) {
                    return null;
                }
                break;
            case 2:
                try {
                    Map mapEmptyMap3 = Collections.emptyMap();
                    Map mapEmptyMap4 = Collections.emptyMap();
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    Iterator it4 = c16270a.iterator();
                    Map map5 = mapEmptyMap3;
                    Map map6 = mapEmptyMap4;
                    BigInteger bigIntegerM9099d3 = bigInteger4;
                    int i12 = Integer.MIN_VALUE;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    while (it4.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it4.next();
                        String lowerCase3 = ((String) entry3.getKey()).toLowerCase(Locale.US);
                        String str7 = (String) entry3.getValue();
                        if (str7 != null) {
                            if ("x-datadog-trace-id".equalsIgnoreCase(lowerCase3)) {
                                it = it4;
                                str4 = str7;
                            } else if ("x-datadog-tags".equalsIgnoreCase(lowerCase3)) {
                                String[] strArrSplit2 = str7.split(Separators.COMMA);
                                int length3 = strArrSplit2.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length3) {
                                        String[] strArrSplit3 = strArrSplit2[i13].split(Separators.EQUALS);
                                        it = it4;
                                        str = (strArrSplit3.length >= 2 && "_dd.p.tid".equals(strArrSplit3[0])) ? strArrSplit3[1] : null;
                                        i13++;
                                        it4 = it;
                                        strArrSplit2 = strArrSplit2;
                                    } else {
                                        it = it4;
                                    }
                                }
                                str5 = str;
                            } else {
                                it = it4;
                                if ("x-datadog-parent-id".equalsIgnoreCase(lowerCase3)) {
                                    bigIntegerM9099d3 = AbstractC8467E.m9099d(10, str7);
                                } else if ("x-datadog-sampling-priority".equalsIgnoreCase(lowerCase3)) {
                                    i12 = Integer.parseInt(str7);
                                } else if ("x-datadog-origin".equalsIgnoreCase(lowerCase3)) {
                                    str6 = str7;
                                } else if (lowerCase3.startsWith("ot-baggage-")) {
                                    if (map5.isEmpty()) {
                                        map5 = new HashMap();
                                    }
                                    map5.put(lowerCase3.replace("ot-baggage-", ""), AbstractC8467E.m9096a(str7));
                                }
                            }
                            HashMap map7 = (HashMap) this.f13951b;
                            if (map7.containsKey(lowerCase3)) {
                                if (map6.isEmpty()) {
                                    map6 = new HashMap();
                                }
                                map6.put((String) map7.get(lowerCase3), AbstractC8467E.m9096a(str7));
                            }
                            it4 = it;
                        }
                    }
                    if (str4 == null || str5 == null) {
                        c4291h3 = new C4291h(str6, map6);
                    } else {
                        long jM5841b = AbstractC5306a.m5841b(str4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str5);
                        byte[] bArr = new byte[16];
                        AbstractC5306a.m5840a(jM5841b, bArr, 0, 16);
                        sb2.append(new String(bArr, StandardCharsets.US_ASCII));
                        C3014h c3014hM9098c2 = AbstractC8467E.m9098c(16, sb2.toString());
                        if (BigInteger.ZERO.equals(c3014hM9098c2)) {
                            if (str6 != null || !map6.isEmpty()) {
                                c4291h3 = new C4291h(str6, map6);
                            }
                            return null;
                        }
                        C4289f c4289f3 = new C4289f(c3014hM9098c2, bigIntegerM9099d3, i12, str6, map5, map6);
                        c4289f3.f13963g.set(true);
                        c4291h3 = c4289f3;
                    }
                    return c4291h3;
                } catch (RuntimeException unused3) {
                }
                break;
            case 3:
                try {
                    Map mapEmptyMap5 = Collections.emptyMap();
                    Map mapEmptyMap6 = Collections.emptyMap();
                    BigInteger bigInteger5 = BigInteger.ZERO;
                    Iterator it5 = c16270a.iterator();
                    Map map8 = mapEmptyMap5;
                    Map map9 = mapEmptyMap6;
                    BigInteger bigIntegerM9098c2 = bigInteger5;
                    BigInteger bigIntegerM9099d4 = bigIntegerM9098c2;
                    while (it5.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it5.next();
                        String str8 = (String) entry4.getKey();
                        Locale locale = Locale.US;
                        String lowerCase4 = str8.toLowerCase(locale);
                        String str9 = (String) entry4.getValue();
                        if (str9 != null) {
                            if ("Trace-ID".equalsIgnoreCase(lowerCase4)) {
                                bigIntegerM9098c2 = AbstractC8467E.m9098c(10, str9);
                            } else if ("Span-ID".equalsIgnoreCase(lowerCase4)) {
                                bigIntegerM9099d4 = AbstractC8467E.m9099d(10, str9);
                            } else if (lowerCase4.startsWith("Baggage-".toLowerCase(locale))) {
                                if (map8.isEmpty()) {
                                    map8 = new HashMap();
                                }
                                map8.put(lowerCase4.replace("Baggage-".toLowerCase(locale), ""), AbstractC8467E.m9096a(str9));
                            }
                            HashMap map10 = (HashMap) this.f13951b;
                            if (map10.containsKey(lowerCase4)) {
                                if (map9.isEmpty()) {
                                    map9 = new HashMap();
                                }
                                map9.put((String) map10.get(lowerCase4), AbstractC8467E.m9096a(str9));
                            }
                        }
                    }
                    if (BigInteger.ZERO.equals(bigIntegerM9098c2)) {
                        if (!map9.isEmpty()) {
                            return new C4291h(null, map9);
                        }
                        return null;
                    }
                    C4289f c4289f4 = new C4289f(bigIntegerM9098c2, bigIntegerM9099d4, 1, null, map8, map9);
                    c4289f4.f13963g.set(true);
                    return c4289f4;
                } catch (RuntimeException unused4) {
                }
                break;
            case 4:
                try {
                    Map mapEmptyMap7 = Collections.emptyMap();
                    BigInteger bigInteger6 = BigInteger.ZERO;
                    Iterator it6 = c16270a.iterator();
                    String str10 = null;
                    Map map11 = mapEmptyMap7;
                    BigInteger bigIntegerM9098c3 = bigInteger6;
                    BigInteger bigIntegerM9099d5 = bigIntegerM9098c3;
                    int i14 = Integer.MIN_VALUE;
                    while (true) {
                        int i15 = 1;
                        if (!it6.hasNext()) {
                            if (!BigInteger.ZERO.equals(bigIntegerM9098c3)) {
                                C4289f c4289f5 = new C4289f(bigIntegerM9098c3, bigIntegerM9099d5, i14, str10, Collections.emptyMap(), map11);
                                c4289f5.f13963g.set(true);
                                c4291h4 = c4289f5;
                            } else {
                                if (map11.isEmpty()) {
                                    return null;
                                }
                                c4291h4 = new C4291h(str10, map11);
                            }
                            return c4291h4;
                        }
                        Map.Entry entry5 = (Map.Entry) it6.next();
                        String lowerCase5 = ((String) entry5.getKey()).toLowerCase(Locale.US);
                        String str11 = (String) entry5.getValue();
                        if (str11 != null) {
                            if ("traceparent".equalsIgnoreCase(lowerCase5)) {
                                String[] strArrSplit4 = str11.split("-");
                                if (strArrSplit4.length == 4 && !"ff".equalsIgnoreCase(strArrSplit4[0])) {
                                    int length4 = strArrSplit4[1].length();
                                    if (length4 > 32) {
                                        bigIntegerM9098c3 = BigInteger.ZERO;
                                    } else {
                                        bigIntegerM9098c3 = AbstractC8467E.m9098c(16, length4 > 16 ? strArrSplit4[1].substring(length4 - 16) : strArrSplit4[1]);
                                        bigIntegerM9099d5 = AbstractC8467E.m9099d(16, strArrSplit4[2]);
                                        if (Integer.parseInt(strArrSplit4[3]) != 1) {
                                            i15 = 0;
                                        }
                                        i14 = i15;
                                    }
                                }
                            } else if ("tracestate".equalsIgnoreCase(lowerCase5)) {
                                str10 = (String) m5036b(str11).get("o");
                            }
                            HashMap map12 = (HashMap) this.f13951b;
                            if (map12.containsKey(lowerCase5)) {
                                if (map11.isEmpty()) {
                                    map11 = new HashMap();
                                }
                                map11.put((String) map12.get(lowerCase5), AbstractC8467E.m9096a(str11));
                            }
                        }
                    }
                } catch (RuntimeException unused5) {
                    return null;
                }
                break;
            default:
                Iterator it7 = ((ArrayList) this.f13951b).iterator();
                InterfaceC14538c interfaceC14538cM5037a = null;
                while (it7.hasNext() && ((interfaceC14538cM5037a = ((C4284a) it7.next()).m5037a(c16270a)) == null || !(interfaceC14538cM5037a instanceof C4289f))) {
                }
                return interfaceC14538cM5037a;
        }
    }

    public C4284a(ArrayList arrayList) {
        this.f13950a = 5;
        this.f13951b = arrayList;
    }
}
